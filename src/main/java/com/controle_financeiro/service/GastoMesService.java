package com.controle_financeiro.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle_financeiro.dto.GastoMesDTO;
import com.controle_financeiro.model.GastoMes;
import com.controle_financeiro.repository.GastoMesRepository;

@Service
public class GastoMesService {

	@Autowired
	private GastoMesRepository repository;
	
	public List<GastoMesDTO> GetAll() {
		List<GastoMes> gastos = repository.findAll();
		List<GastoMesDTO> gastosDTO = new ArrayList<>();
		for (GastoMes gastoMes : gastos) {
			GastoMesDTO gastoMesDTO = new GastoMesDTO(gastoMes.getId(), gastoMes.getLimite(), gastoMes.getDataReferencia(), gastoMes.getUser(), gastoMes.getGastos());
			gastosDTO.add(gastoMesDTO);
		}
		return gastosDTO;
	}
}
