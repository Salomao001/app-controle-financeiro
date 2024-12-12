package com.controle_financeiro.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.controle_financeiro.enums.User;
import com.controle_financeiro.model.Gasto;
import com.controle_financeiro.model.GastoMes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GastoMesDTO {

	private Long id;
	private Double limite;
	private LocalDate dataReferencia;
	private User user;
	private List<GastoDTO> gastos = new ArrayList<GastoDTO>();
	
	public GastoMesDTO(Long id, Double limite, LocalDate dataReferencia, User user, List<Gasto> gastos) {
		this.id = id;
		this.limite = limite;
		this.dataReferencia = dataReferencia;
		this.user = user;
		
		for (Gasto gasto : gastos) {
			GastoDTO gastoDTO = new GastoDTO(gasto.getId(), gasto.getDescription(), gasto.getPrice(), gasto.getBuyDate());
			this.gastos.add(gastoDTO);
		}
	}
}
