package br.pro.delfino.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {
	private Short codigo;
	
	private String nome;
	
	private Byte quantidade;
	
	private BigDecimal preco;
	
	private LocalDate dataDeValidade;

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Byte getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Byte quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataDeValidade == null) ? 0 : dataDeValidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataDeValidade == null) {
			if (other.dataDeValidade != null)
				return false;
		} else if (!dataDeValidade.equals(other.dataDeValidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", dataDeValidade=" + dataDeValidade + "]";
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Short codigo, String nome, Byte quantidade, BigDecimal preco, LocalDate dataDeValidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataDeValidade = dataDeValidade;
	}
	
}
