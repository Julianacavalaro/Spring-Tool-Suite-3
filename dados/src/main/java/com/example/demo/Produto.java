package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="Produto")
public class Produto {
	
	@Id
	@GeneratedatedValue(strategy=GeneratedatedenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nome;

}
