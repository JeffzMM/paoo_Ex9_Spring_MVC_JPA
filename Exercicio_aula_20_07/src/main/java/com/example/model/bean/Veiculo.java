package com.example.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable = false, length = 50)
	String marca;
	@Column (nullable = false, length = 50)
	String modelo;
	@Column (nullable = false, length = 10)
	String Ano;
	

	@OneToOne
	@JoinColumn (name= "id_da_placa")
	private Placa placa;
	
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
}


