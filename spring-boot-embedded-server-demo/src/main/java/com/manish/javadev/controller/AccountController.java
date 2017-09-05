package com.manish.javadev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Test Exception", description = "Test Exception with Custom Message")
@RequestMapping(value = "/accountcontroller")
public class AccountController {

	@ApiOperation(value = "Test Exception")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		String data = "Manish";
		Integer result = Integer.parseInt(data);
		return String.valueOf(result);
	}
	

}
