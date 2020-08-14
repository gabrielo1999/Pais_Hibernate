package com.pais.entidades;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Clientes 
{
	@GeneratedValue
	@Id
	private int id;
	private String nombre;
	private String apellidop;
	private String apellidom;
	
	@OneToOne
	private Pais pais;
	
	
	
	public Clientes(String nombre, String apellidop, String apellidom) {
		super();
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
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
	public String getApellidop() {
		return apellidop;
	}
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}
	public String getApellidom() {
		return apellidom;
	}
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}
	
	

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidop=" + apellidop + ", apellidom=" + apellidom
				+ ", pais=" + "]";
	}
	
	
	
	
	

	
}
