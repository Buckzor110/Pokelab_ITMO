package com.company.Pokemons;

import com.company.Moves.Flamethrower;
import com.company.Moves.Sing;
import com.company.Moves.WakeUpSlap;

public class Clefairy extends Cleffa {
    public Clefairy(String name,double hp,double att,double def, double spAtt, double spDef, double speed, int lvl){
        super(name,lvl);
        setStats(hp,att, def, spAtt, spDef, speed);
        addMove(new WakeUpSlap());

    }
    public Clefairy(String name, int lvl){
        super(name,lvl);
        setStats(70.0D,45.0D,48.0D,60.0D,65.0D,35.0D);
        setMove(new Sing(), new Flamethrower());
        addMove(new WakeUpSlap());
    }
}
