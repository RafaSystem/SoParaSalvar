package service;

import java.util.ArrayList;
import model.ResponsavelVenda;

public class SResponsavelVenda {
	ArrayList<ResponsavelVenda> arRVenda;

	public SResponsavelVenda() {
		super();
		this.arRVenda = new ArrayList<ResponsavelVenda>();
	}

	public ArrayList<ResponsavelVenda> getArRVenda() {
		return arRVenda;
	}

	public void setArRVenda(ArrayList<ResponsavelVenda> arRVenda) {
		this.arRVenda = arRVenda;
	}
		
}