package com.framework;

/**
 * @author : Iman
 * date : 2019/4/22
 */

import java.util.List;

public interface Dao<T> {
    /**
     * 查询全部信息
     */
    public List<T> findAll();
    /**
     * 添加数据
     */
    public void add(T t);
    /**
     * 通过id 查询
     */
    public T findById(Integer id);
    /**
     * 修改
     */
    public void update(T t);
    /**
     * 单条删除
     */
    public void delete(T t);

}