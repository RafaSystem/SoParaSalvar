package service;

import java.util.ArrayList;
import model.Vendedor;

public class SVendedor {
	ArrayList<Vendedor> arVendedor;

	public SVendedor() {
		super();
		this.arVendedor = new ArrayList<Vendedor>();
	}

	public ArrayList<Vendedor> getArVendedor() {
		return arVendedor;
	}

	public void setArVendedor(ArrayList<Vendedor> arVendedor) {
		this.arVendedor = arVendedor;
	}
	
}