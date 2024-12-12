package com.controle_financeiro.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gastos")
@Getter
@Setter
public class Gasto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false)
	private LocalDate buyDate;
	
	@ManyToOne()
	@JoinColumn(name = "gasto_mes_id", nullable = false)
	private GastoMes gastoMes;
	
	protected Gasto() {}
	
	public Gasto(String description, Double price, LocalDate buyDate, GastoMes gastoMes) {
		this.description = description;
		this.price = price;
		this.buyDate = buyDate;
		this.gastoMes = gastoMes; 
	}
}
