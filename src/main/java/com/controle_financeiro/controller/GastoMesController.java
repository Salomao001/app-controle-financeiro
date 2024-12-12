package com.controle_financeiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle_financeiro.dto.GastoMesDTO;
import com.controle_financeiro.model.GastoMes;
import com.controle_financeiro.service.GastoMesService;

import lombok.Getter;

@RestController
@RequestMapping("/api/gasto-mes")
public class GastoMesController {
	
	@Autowired
	private GastoMesService service;
	
	@GetMapping("/obter-gastos-mes")
	public ResponseEntity<List<GastoMesDTO>> GetAllGastosMes() {
		List<GastoMesDTO> gastosMes = service.GetAll();
		return new ResponseEntity<List<GastoMesDTO>>(gastosMes, HttpStatus.OK);
	}
}
