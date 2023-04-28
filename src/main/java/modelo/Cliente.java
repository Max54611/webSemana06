package modelo;

import java.util.Map;
import java.util.HashMap;

public class Cliente {
	private String codigo;
	private String nombre;
	private double sueldo;
	private int numhijos;
	
	//el constructor solo lo generamos porque trabajaremos con arreglos
	public Cliente(String codigo, String nombre, double sueldo, int numhijos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numhijos = numhijos;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public int getNumhijos() {
		return numhijos;
	}


	public void setNumhijos(int numhijos) {
		this.numhijos = numhijos;
	}
	
	private static Map clientes;
	static {
		clientes=new HashMap();
		clientes.put("C001", new Cliente("C001","Miguel",3500,2));
		clientes.put("C002", new Cliente("C002","Rosario",4200,3));
		clientes.put("C003", new Cliente("C003","Cesar",3800,1));
		clientes.put("C004", new Cliente("C004","Mabel",3000,1));
	}
	
	public static Cliente busqueda(String codigo) {
		return (Cliente)clientes.get(codigo);
	}
	
}
