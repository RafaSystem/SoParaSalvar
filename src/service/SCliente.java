package service;

import java.util.ArrayList;

import model.Cliente;

public class SCliente {
	ArrayList<Cliente>arCliente;

	public SCliente() {
		super();
		this.arCliente = new ArrayList<Cliente> ();
	}

	public ArrayList<Cliente> getArCliente() {
		return arCliente;
	}

	public void setArCliente(ArrayList<Cliente> arCliente) {
		this.arCliente = arCliente;
	}
	
}