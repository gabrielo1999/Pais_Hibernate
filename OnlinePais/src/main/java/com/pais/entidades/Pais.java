package com.pais.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pais 
{
	@GeneratedValue
	@Id
	private int id;
	private String nombre;
	@OneToMany(mappedBy="pais")
	private List<Clientes> clientes = new ArrayList<Clientes>();
	
	public Pais() 
	{
		super();
	}
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public List<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", cliente="+ "]";
	}
	
	

}
