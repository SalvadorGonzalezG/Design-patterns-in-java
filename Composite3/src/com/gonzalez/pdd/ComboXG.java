package com.gonzalez.pdd;

public class ComboXG implements IComboCine{
	
	// agregamos el atributo de tipo IComboCine  
	private IComboCine comboCine;
	
	public ComboXG(IComboCine comboCine) {
		this.comboCine = comboCine;
	}

	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return "Combo Extragrande palomitas, refresco, nachos y 1 entrada extra";
	}

	@Override
	public String nota() {
		// TODO Auto-generated method stub
		return this.comboCine.nota();
	}

	@Override
	public float precio() {
		// TODO Auto-generated method stub
		return this.comboCine.precio() + 2.0f;
	}
	
	

}
