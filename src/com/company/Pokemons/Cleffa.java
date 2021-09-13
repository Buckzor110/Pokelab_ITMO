package com.company.Pokemons;

import com.company.Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    public Cleffa(String name,double hp,double att,double def, double spAtt, double spDef, double speed, int lvl){
        super(name,lvl);
        setStats(hp,att, def, spAtt, spDef, speed);
        setType(Type.FAIRY);
        setMove(new Sing(), new Flamethrower());

    }
    public Cleffa(String name, int lvl){
        super(name,lvl);
        setStats(50.0D,25.0D,28.0D,45.0D,55.0D,15.0D);
        setType(Type.FAIRY);
        setMove(new Sing(), new Flamethrower());

    }
}
