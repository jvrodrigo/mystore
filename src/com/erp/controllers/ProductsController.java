package com.erp.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.interfaces.controllers.ICRUDController;
import com.erp.models.GenericResponse;

@RestController
@RequestMapping("/products")
public class ProductsController implements ICRUDController {
	static Logger log = Logger.getLogger(ProductsController.class.getName());
	@Override
	@RequestMapping(value = "/", method = RequestMethod.GET, headers="Accept=application/json",produces="application/json; charset=UTF-8")
	public @ResponseBody GenericResponse list(@RequestBody(required = true) Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("List Method");
		return response;
	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.POST, headers="Accept=application/json")
	public GenericResponse create(@RequestBody(required = true) Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Create Method");
		return response;

	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers="Accept=application/json")
	public GenericResponse read(@RequestBody(required = true) Object object, @PathVariable int id) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Read Method");
		return response;

	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers="Accept=application/json")
	public GenericResponse update(@RequestBody(required = true) Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Update Method");
		return response;
	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.DELETE, headers="Accept=application/json")
	public GenericResponse delete(@RequestBody(required = true) Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Delete Method");
		return response;
	}
}
