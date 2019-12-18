package com.example.emavias.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emavias.document.Personal;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/personal")
@Api(value = "personal", description = "Operaciones pertenecientes al Personal")
public class PersonalController {
	ConcurrentMap<String, Personal> per = new ConcurrentHashMap<>();

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	@ApiOperation("Gets the product with specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Personal.class) })
	public Personal getPersonal(@PathVariable(name = "id") String id) {
		return per.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Personal savePersonal(@RequestBody Personal personalToSave) {
		return per.put("id", personalToSave);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Personal updatePersonal(@RequestBody Personal personalToUpdate, @PathVariable(name = "id") String id) {
		return per.put("id", personalToUpdate);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void deletePersonal(@PathVariable(name = "id") String id) {
		per.remove(id);
	}
}
