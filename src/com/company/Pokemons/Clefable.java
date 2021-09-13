package com.company.Pokemons;

import com.company.Moves.Thunder;
import com.company.Moves.WakeUpSlap;

public class Clefable extends Clefairy {
    public Clefable(String name,double hp,double att,double def, double spAtt, double spDef, double speed, int lvl){
        super(name,lvl);
        setStats(hp,att, def, spAtt, spDef, speed);
        addMove(new Thunder());

    }
    public Clefable(String name, int lvl){
        super(name,lvl);
        setStats(95.0D,70.0D,73.0D,95.0D,90.0D,60.0D);
        addMove(new Thunder());

    }
}
