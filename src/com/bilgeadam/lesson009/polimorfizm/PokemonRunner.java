package com.bilgeadam.lesson009.polimorfizm;

import java.util.ArrayList;
import java.util.Random;

/*
 * Bir metot yaratalım bu metot 0 ile 2 arasında 2 dahil  bir sayı uretsin bu gelen sayıya gore 
 * uygulamadaki pokemonlardan birini kullanıcının pokemonu yapsın;
 * 
 * 
 * her pokemonun yakalanmaya direnci olsa 
 * elektrik pokemonunu 3 ateşin 4 , suyun 2 olsa;
 * 
 * pokemon yakala metodunda birde bize pokemon yakalama puanı uretilsin 1-8 arasında bir puan
 *  bu puan direnc katsayısından buyukse pokemon yakalnmıstır buna gore bize pokemonun yakalanıp yakalnamadıgını donsun; 
 * 
 * 
 * 
 */
public class PokemonRunner {

	public static void main(String[] args) {
		// (2, "charizard", "Ateş", 3, 5000, 350)
		Pokemon pokemon1 = new ElektrikPokemonu(1, "Rayichu", 2, 1000, 350, 500);
		Pokemon pokemon2 = new AtesPokemonu(2, "charizard", 3, 5000, 350, 500);
		Pokemon pokemon3 = new SuPokemonu(3, "staryu", 1, 500, 150, 200, 3);
		Kullanici kullanici = new Kullanici("Mustafa");
		ArrayList<Pokemon> bosPokemonlar = new ArrayList<>();
		bosPokemonlar.add(pokemon1);
		bosPokemonlar.add(pokemon2);
		bosPokemonlar.add(pokemon3);

		for (int i = 0; i < bosPokemonlar.size(); i++) {
			System.out.println(bosPokemonlar.get(i).getAd()); // [i]
		}

		Pokemon secilmişPokemon = pokemonYakala(bosPokemonlar, kullanici);
		System.out.println(secilmişPokemon.getAd());
	}

	public static Pokemon pokemonYakala(ArrayList<Pokemon> pokemonListesi, Kullanici kullanici) {
		Random random = new Random();
		int index = random.nextInt(pokemonListesi.size());// arraylistin boyutu dısında bir sayı uretmez!!!
		Pokemon pokemon = pokemonListesi.get(index);
		kullanici.getPokemonlar().add(pokemon);
		pokemon.setSahibiVarmi(true);
		return pokemon;
	}

	public static void saldir(Pokemon pokemon) {

		pokemon.saldir();
	}

	public static void saldir2(Pokemon pokemon) {

		if (pokemon instanceof ElektrikPokemonu) {
			System.out.println(pokemon.getAd() + " adlı pokemon elektrik saldırısı yapıyor");
		} else if (pokemon instanceof SuPokemonu) {
			System.out.println(pokemon.getAd() + " adlı pokemon su saldırısı yapıyor");
		} else {
			System.out.println(pokemon.getAd() + " adlı pokemon ateş saldırısı yapıyor");
		}
	}
}
