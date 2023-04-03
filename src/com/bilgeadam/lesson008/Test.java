package com.bilgeadam.lesson008;

public class Test {

	public static void main(String[] args) {

		Pokemon pokemon2 = new Pokemon(2, "charizard", "Ateş", 3, 5000, 350);
		pokemon2.saldir();
		pokemon2.kacinma();
		pokemon2.pokedex();
		Pokemon pokemon3 = new Pokemon(3, "Zapdos", "Elektrik", 1, 6000, 450);
		pokemon3.saldir();
		pokemon3.kacinma();
		pokemon3.pokedex();

		ElektrikPokemonu elektrikPokemonu = new ElektrikPokemonu(4, "Rayichu", 2, 1000, 350, 500);
		elektrikPokemonu.pokedex();
		elektrikPokemonu.saldir();
		elektrikPokemonu.kacinma();
		System.out.println(elektrikPokemonu.getCan());

		Pokemon pokemon = new Pokemon(1, "pikachu", "Elektrik", 1, 300, 150);
		pokemon.saldir();
		pokemon.kacinma();
		pokemon.pokedex();
		System.out.println(pokemon.getAd());

	}

}
