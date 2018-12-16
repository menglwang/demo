$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'housedetail/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '详细描述', name: 'description', index: 'description', width: 80 }, 			
			{ label: '户型介绍', name: 'layoutDesc', index: 'layout_desc', width: 80 }, 			
			{ label: '交通出行', name: 'traffic', index: 'traffic', width: 80 }, 			
			{ label: '周边配套', name: 'roundService', index: 'round_service', width: 80 }, 			
			{ label: '租赁方式', name: 'rentWay', index: 'rent_way', width: 80 }, 			
			{ label: '详细地址 ', name: 'address', index: 'address', width: 80 }, 			
			{ label: '附近地铁线id', name: 'subwayLineId', index: 'subway_line_id', width: 80 }, 			
			{ label: '附近地铁线名称', name: 'subwayLineName', index: 'subway_line_name', width: 80 }, 			
			{ label: '地铁站id', name: 'subwayStationId', index: 'subway_station_id', width: 80 }, 			
			{ label: '地铁站名', name: 'subwayStationName', index: 'subway_station_name', width: 80 }, 			
			{ label: '对应house的id', name: 'houseId', index: 'house_id', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		houseDetail: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.houseDetail = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.houseDetail.id == null ? "housedetail/save" : "housedetail/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.houseDetail),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "housedetail/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "housedetail/info/"+id, function(r){
                vm.houseDetail = r.houseDetail;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});