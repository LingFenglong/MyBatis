package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    // 多条件查询
    List<Emp> getEmpByCondition(Emp emp);

    // 测试 choose when otherwise
    List<Emp> getEmpByChoose(Emp emp);

    // 通过数组实现批量删除
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    // 批量添加
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
