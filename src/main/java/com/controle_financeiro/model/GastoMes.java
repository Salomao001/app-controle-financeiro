package com.controle_financeiro.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.controle_financeiro.enums.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "gastos_mes", uniqueConstraints = @UniqueConstraint(columnNames =  {"dataReferencia", "user"}))
@Getter
@Setter
public class GastoMes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Double limite;
	
	@Column(nullable = false)
	private LocalDate dataReferencia;
	
	@Column(nullable = false, name = "userGastoMes")
	@Enumerated(EnumType.STRING)
	private User user;
	
	@OneToMany(mappedBy = "gastoMes")
	private List<Gasto> gastos;
	
	protected GastoMes() {}
	
	public GastoMes(Double limite, LocalDate dataReferencia, User user) {
		this.limite = limite;
		this.dataReferencia = dataReferencia;
		this.user = user;
	}
}
