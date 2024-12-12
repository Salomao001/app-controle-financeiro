package com.controle_financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle_financeiro.repository.GastoRepository;

@Service
public class GastoService {
	
	@Autowired
	private GastoRepository repository;
}
