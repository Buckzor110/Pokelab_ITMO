package com.company.Pokemons;


import com.company.Moves.DoubleTeam;
import com.company.Moves.Facade;
import com.company.Moves.Liquidation;
import com.company.Moves.Waterfall;

public class Golisopod extends Wimpod {
    public Golisopod(String name,double hp,double att,double def, double spAtt, double spDef, double speed, int lvl){
        super(name,lvl);
        setStats(hp,att, def, spAtt, spDef, speed);
        setMove(new Facade(), new Waterfall(), new DoubleTeam());
        addMove(new Liquidation());


    }
    public Golisopod(String name, int lvl){
        super(name,lvl);
        setStats(75.0D,125.0D,140.0D,60.0D,90.0D,40.0D);
        setMove(new Facade(), new Waterfall(), new DoubleTeam());
        addMove(new Liquidation());


    }
}
