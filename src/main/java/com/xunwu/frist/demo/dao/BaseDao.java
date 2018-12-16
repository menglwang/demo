package com.xunwu.frist.demo.dao;

import java.util.List;
import java.util.Map;

/**
 * @auther 王梦龙
 * @date 2018/12/16 17:02
 */
public interface BaseDao<T> {
    public T queryObject(Integer id);

    List<T> queryList(Map<String, Object> map);

    public int queryTotal(Map<String, Object> map);

    public void save(T entry);
    public void update(T entry);
    public void delete(Integer id);
    public void deleteBatch(Integer[] ids);
}
