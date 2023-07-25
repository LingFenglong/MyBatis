package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.Department;
import com.lingfenglong.mybatis.pojo.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    long countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    int insert(Department row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    int insertSelective(Department row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    int updateByExampleSelective(@Param("row") Department row, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Tue Jul 25 10:17:48 CST 2023
     */
    int updateByExample(@Param("row") Department row, @Param("example") DepartmentExample example);
}