package com.gonzalez.pdd;

public class TigreHibrido implements IFelino{
	
	//creamos un atributo de tipo IFelino
	private IFelino felino;
	
	public TigreHibrido(IFelino felino) {
		this.felino = felino;
	}
	
	@Override
	public String cazar() {
		return this.felino.cazar() + " y en otros lados de la sabana Africa, es Hibrido";
	}
	
	@Override
	public int crias() {
		return this.felino.crias() + 3;
	}
	
	@Override
	public int gestacion() {
		return this.felino.gestacion() -2;
	}

}
