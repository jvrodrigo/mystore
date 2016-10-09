package com.erp.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.interfaces.controllers.ICRUDController;
import com.erp.models.GenericResponse;

@Controller
@RequestMapping("/products")
public class ProductsController implements ICRUDController {
	static Logger log = Logger.getLogger(ProductsController.class.getName());
	@Override
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody GenericResponse list(@RequestParam Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("List Method");
		return response;
	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GenericResponse create(@RequestParam Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Create Method");
		return response;

	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public GenericResponse read(@PathVariable int id) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Read Method");
		return response;

	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public GenericResponse update(@RequestParam Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Update Method");
		return response;
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public GenericResponse delete(@RequestParam Object object) {
		GenericResponse response = new GenericResponse();
		response.setMessage("Delete Method");
		return response;
	}

}
