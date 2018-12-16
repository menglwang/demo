$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'house/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'title', index: 'title', width: 80 }, 			
			{ label: '价格', name: 'price', index: 'price', width: 80 }, 			
			{ label: '面积', name: 'area', index: 'area', width: 80 }, 			
			{ label: '卧室数量', name: 'room', index: 'room', width: 80 }, 			
			{ label: '楼层', name: 'floor', index: 'floor', width: 80 }, 			
			{ label: '总楼层', name: 'totalFloor', index: 'total_floor', width: 80 }, 			
			{ label: '被看次数', name: 'watchTimes', index: 'watch_times', width: 80 }, 			
			{ label: '建立年限', name: 'buildYear', index: 'build_year', width: 80 }, 			
			{ label: '房屋状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除', name: 'status', index: 'status', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '最近数据更新时间', name: 'lastUpdateTime', index: 'last_update_time', width: 80 }, 			
			{ label: '城市标记缩写 如 北京bj', name: 'cityEnName', index: 'city_en_name', width: 80 }, 			
			{ label: '地区英文简写 如昌平区 cpq', name: 'regionEnName', index: 'region_en_name', width: 80 }, 			
			{ label: '封面', name: 'cover', index: 'cover', width: 80 }, 			
			{ label: '房屋朝向', name: 'direction', index: 'direction', width: 80 }, 			
			{ label: '距地铁距离 默认-1 附近无地铁', name: 'distanceToSubway', index: 'distance_to_subway', width: 80 }, 			
			{ label: '客厅数量', name: 'parlour', index: 'parlour', width: 80 }, 			
			{ label: '所在小区', name: 'district', index: 'district', width: 80 }, 			
			{ label: '所属管理员id', name: 'adminId', index: 'admin_id', width: 80 }, 			
			{ label: '', name: 'bathroom', index: 'bathroom', width: 80 }, 			
			{ label: '街道', name: 'street', index: 'street', width: 80 }			
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
		house: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.house = {};
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
			var url = vm.house.id == null ? "house/save" : "house/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.house),
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
				    url: baseURL + "house/delete",
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
			$.get(baseURL + "house/info/"+id, function(r){
                vm.house = r.house;
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