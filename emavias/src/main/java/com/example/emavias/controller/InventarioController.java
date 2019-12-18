package com.example.emavias.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emavias.document.Inventario;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/inventario")
@Api(value = "inventario", description = "Operaciones pertenecientes al Inventario")
public class InventarioController {
	ConcurrentMap<String, Inventario> inv = new ConcurrentHashMap<>();

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	@ApiOperation("Gets the product with specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Inventario.class) })
	public Inventario getInventario(@PathVariable(name = "id") String id) {
		return inv.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Inventario saveInventario(@RequestBody Inventario invToSave) {
		return inv.put("id", invToSave);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Inventario updateInventario(@RequestBody Inventario inventarioToUpdate,
			@PathVariable(name = "id") String id) {
		return inv.put("id", inventarioToUpdate);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void deleteInventario(@PathVariable(name = "id") String id) {
		inv.remove(id);
	}
}
