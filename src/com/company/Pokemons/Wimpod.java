package com.company.Pokemons;

import com.company.Moves.DarkPulse;
import com.company.Moves.DoubleTeam;
import com.company.Moves.Facade;
import com.company.Moves.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {
    public Wimpod(String name,double hp,double att,double def, double spAtt, double spDef, double speed, int lvl){
        super(name,lvl);
        setStats(hp,att, def, spAtt, spDef, speed);
        setType(Type.BUG);
        addType(Type.WATER);
        setMove(new Facade(), new Waterfall(), new DoubleTeam());

    }
    public Wimpod(String name, int lvl){
        super(name,lvl);
        setStats(25.0D,35.0D,40.0D,20.0D,30.0D,80.0D);
        setType(Type.BUG);
        addType(Type.WATER);
        setMove(new Facade(), new Waterfall(), new DoubleTeam());
    }
}
