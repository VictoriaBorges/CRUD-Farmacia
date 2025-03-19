package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


	@Entity
	@Table (name ="tb_produtos" )
	public class Produto {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message= "O nome do Produto é Obrigatorio")
	@Size(min=2, max =100, message = " O nome precisa ter mais de 2 letras")
	private String nome;

	private Double preco;
	
	@NotBlank(message= "O atributo descrição é obrigatório")
	@Size(min=5, max =1000, message = "a descrição tem que ser maior que 5 e menor que 1000")
	private String marca;

	@NotBlank(message= "O atributo Data de Validade é obrigatório")
	private String DataValidade;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	


	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getDataValidade() {
		return DataValidade;
	}



	public void setDataValidade(String dataValidade) {
		DataValidade = dataValidade;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
