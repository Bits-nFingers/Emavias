package com.example.emavias.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emavias.document.ResponsableInven;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/responsabledeinven")
@Api(value = "responsabledeinven", description = "Operaciones pertenecientes al Responsable de inventario")
public class ResponsableInvenController {
	ConcurrentMap<String, ResponsableInven> responsablein = new ConcurrentHashMap<>();

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	@ApiOperation("Gets the product with specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ResponsableInven.class) })
	public ResponsableInven getResponsable(@PathVariable(name = "id") String id) {
		return responsablein.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponsableInven saveRespon(@RequestBody ResponsableInven responToSave) {
		return responsablein.put("id", responToSave);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponsableInven updateResponsable(@RequestBody ResponsableInven responsableToUpdate,
			@PathVariable(name = "id") String id) {
		return responsablein.put("id", responsableToUpdate);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void deleteResponsableInven(@PathVariable(name = "id") String id) {
		responsablein.remove(id);
	}
}
