package com.bilgeadam.lesson008;

public class AtesPokemonu extends Pokemon {

	int yakicilikGucu;

	public AtesPokemonu(long id, String ad, int seviye, int guc, int can, int yakicilikGucu) {
		super(id, ad, seviye, guc, can);
		// super.setTur("Ateş");
		setTur("Ateş");
		this.yakicilikGucu = yakicilikGucu;

	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yakcılık gücü= " + yakicilikGucu);
	}

}
