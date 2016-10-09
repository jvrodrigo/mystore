package com.erp.interfaces.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.models.GenericResponse;

public interface ICRUDController{
	
	public @ResponseBody GenericResponse list(@RequestParam Object object);
	public @ResponseBody GenericResponse create(@RequestParam Object object);
	public @ResponseBody GenericResponse read(@PathVariable int id);
	public @ResponseBody GenericResponse update(@RequestParam Object object);
	public @ResponseBody GenericResponse delete(@RequestParam Object object);

}
