package com.tongwei.test.controller;

import com.tongwei.test.service.EmployeeService;
import com.tongwei.test.domain.dto.EmployeeDto;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/employees")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class EmployeeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeService employeeService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam EmployeeDto eo,
                            @QueryParam("page") @DefaultValue("1") Integer page,
                            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(employeeService.findPage(eo, page, size));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam EmployeeDto eo) {
        return new Payload(employeeService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") Integer  pk) {
        return new Payload(employeeService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(EmployeeDto eo) {
        return new Payload(employeeService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") Integer  pk, EmployeeDto eo) {
        return new Payload(employeeService.update(pk, eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9,]+}")
    public Payload delete(@PathParam("id") Integer  pk) {
        return new Payload(employeeService.delete(pk.split(",")));
    }

    @DELETE
    @Path("/")
    public Payload delete(Integer [] pks) {
        return new Payload(employeeService.delete(pks));
    }
}
