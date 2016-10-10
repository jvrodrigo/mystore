package com.erp.interfaces.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.models.GenericResponse;

public interface ICRUDController{
	
	public @ResponseBody GenericResponse list(@RequestBody(required = true) Object object);
	public @ResponseBody GenericResponse create(@RequestBody(required = true) Object object);
	public @ResponseBody GenericResponse read(@RequestBody(required = true) Object object, @PathVariable int id);
	public @ResponseBody GenericResponse update(@RequestBody(required = true) Object object);
	public @ResponseBody GenericResponse delete(@RequestBody(required = true) Object object);

}
