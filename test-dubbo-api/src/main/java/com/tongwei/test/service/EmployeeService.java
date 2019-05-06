package com.tongwei.test.service;

import com.deepexi.util.pageHelper.PageBean;
import com.tongwei.test.domain.eo.Employee;
import com.tongwei.test.domain.dto.EmployeeDto;
import java.util.*;

public interface EmployeeService {

    PageBean<Employee> findPage(EmployeeDto eo, Integer page, Integer size);

    List<Employee> findAll(EmployeeDto eo);

    Employee detail(Integer  pk);

    Boolean update(Integer  pk, EmployeeDto eo);

    Boolean create(EmployeeDto eo);

    Boolean delete(Integer ... pk);
}