package br.com.edward.marte.model;

import java.math.BigDecimal;

public class PerfumeModel {
	
	private static long gerador = 0;
	
	private Long id;
	private String nome;
	private BigDecimal valor;
	private EnumTipoPerfumeModel tipo;
	
	public PerfumeModel(String nome, BigDecimal valor, EnumTipoPerfumeModel tipo) {
		this.id = ++gerador;
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public void alterar(String nome, BigDecimal valor, EnumTipoPerfumeModel tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EnumTipoPerfumeModel getTipo() {
		return tipo;
	}
}
