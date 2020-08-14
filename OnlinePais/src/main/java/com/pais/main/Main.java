package com.pais.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.pais.entidades.Clientes;
import com.pais.entidades.Pais;

public class Main 
{
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	public static void main(String[]args) 
	{
		Pais pais1 = new Pais("ECUADOR");
		ingresoPais(pais1);
		
		Clientes nombre = new Clientes("andres","jacome","jara");
		ingresoCliente(nombre);
			
	}
	
	static void ingresoPais(Pais pais) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pais);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	static void ingresoCliente(Clientes clientes) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(clientes);
		session.getTransaction().commit();
		session.close();
	}
	

	
	
	
	
	


}
