package com.generation.crudfarmacia.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "tb_produtos")
public class Produtos {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome é obrigatório!")
		@Size(min=3, max=100, message = "O atributo deve conter no mínimo 03 e no máximo 100 caracteres")
		private String nome;
		
		private Double preco;
		
		@UpdateTimestamp
		private LocalDateTime data;
		
		@ManyToOne
		@JsonIgnoreProperties("produtos")
		private Categoria categoria;

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

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		
	}

