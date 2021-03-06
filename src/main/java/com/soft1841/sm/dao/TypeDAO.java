package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;
/**
 * 图书类别DAO接口
 * @author 白
 */

public interface TypeDAO {
    /**
     * 新增图书类别, 返回自增主键(Long)
     */
    Long insertType(Type type) throws SQLException;

    /**
     * 根据id删除类别
     */
    int deleteTypeById(long id) throws SQLException;

    /**
     * 查询所有类别
     */
    List<Type> selectAllTypes() throws SQLException;

    /**
     * 根据id查询类别信息
     */
    Type getTypeById(long id) throws SQLException;

}