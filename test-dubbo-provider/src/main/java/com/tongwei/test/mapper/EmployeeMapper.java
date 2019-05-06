package com.tongwei.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tongwei.test.domain.dto.EmployeeDto;
import com.tongwei.test.domain.eo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> findList(@Param("eo") EmployeeDto eo);

    int deleteByIds(@Param("pks") Integer ... pks);

    int batchInsert(@Param("eo") List<EmployeeDto> eo);

    int batchUpdate(@Param("eo") List<EmployeeDto> eo);
}
