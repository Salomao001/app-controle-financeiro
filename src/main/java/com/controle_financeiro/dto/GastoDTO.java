package com.controle_financeiro.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GastoDTO {
	
	private Long id;	
	private String description;
	private Double price;
	private LocalDate buyDate;
}
