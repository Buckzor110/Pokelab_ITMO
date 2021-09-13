package com.company.Pokemons;

import com.company.Moves.DarkPulse;
import com.company.Moves.PoisonTail;
import com.company.Moves.Rest;
import com.company.Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Seviper extends Pokemon {
    public Seviper(String name,double hp,double att,double def, double spAtt, double spDef, double speed, int lvl){
        super(name,lvl);
        setStats(hp,att, def, spAtt, spDef, speed);
        setType(Type.POISON);
        setMove(new PoisonTail(), new DarkPulse(), new Swagger(), new Rest());

    }
    public Seviper(String name, int lvl){
        super(name,lvl);
        setStats(73.0D,100.0D,60.0D,100.0D,60.0D,65.0D);
        setType(Type.POISON);
        setMove(new PoisonTail(), new DarkPulse(), new Swagger(), new Rest());

    }

}
