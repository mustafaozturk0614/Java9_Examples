package com.bilgeadam.lesson009.polimorfizm;

/*
 * super keyword==> bir üst(super Class ) sınıftaki bir veriye bir metoda ulaşmak için kullanılır  
 * 
 */
public class SuPokemonu extends Pokemon {

	int suBasincGucu;
	int yuzmeHizi;

	public SuPokemonu(long id, String ad, int seviye, int guc, int can, int suBasincGucu, int yuzmeHizi) {
		super(id, ad, seviye, guc, can);
		setTur("Su");
		this.suBasincGucu = suBasincGucu;
		this.yuzmeHizi = yuzmeHizi;
	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("basıncg gücü=" + suBasincGucu);
		System.out.println("yuzme hızı=" + yuzmeHizi);
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adlı pokemon su saldırısı yapıyor");
	}
}
