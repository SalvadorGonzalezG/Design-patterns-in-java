package com.gonzalez.pdd;

public class TigreHCautiberio implements IFelino{
	// Generamos un atributo privado que retorne un objeto de tipo IFelino
	private IFelino felino;
	
	public TigreHCautiberio(IFelino felino) {
		this.felino = felino;
	}
	
	@Override
	public String cazar() {
		return this.felino.cazar() + " pero el es alimentado en cautiberio";
	}
	
	@Override
	public int crias() {
		return this.felino.crias() -4;
	}
	
	@Override
	public int gestacion() {
		return this.felino.gestacion() + 5;
	}
	
}
