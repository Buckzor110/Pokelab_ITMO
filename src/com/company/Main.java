package com.company;

import com.company.Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        Seviper lexa = new Seviper("Alexey", 10);
        Golisopod dima = new Golisopod("Dmitriy", 10);
        Wimpod leshka = new Wimpod("Leshka", 10);
        Cleffa dashynia = new Cleffa("Dashynia",10);
        Clefairy dasha = new Clefairy("Dasha",10);
        Cleffa daria = new Cleffa("Daria",10);

        b.addAlly(lexa);
        b.addAlly(leshka);
        b.addAlly(dasha);
        b.addFoe(dima);
        b.addFoe(daria);
        b.addFoe(dashynia);
        b.go();

    }
}
