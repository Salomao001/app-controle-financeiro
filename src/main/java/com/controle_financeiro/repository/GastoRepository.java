package com.controle_financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle_financeiro.model.Gasto;

public interface GastoRepository extends JpaRepository<Gasto, Long> {

}
