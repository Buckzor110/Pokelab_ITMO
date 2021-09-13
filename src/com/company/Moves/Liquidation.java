package com.company.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Liquidation extends PhysicalMove {
    public Liquidation(){
        super(Type.WATER, 85.0D,100.0D);
    }
    protected String describe(){
        return "использует Liquidation";
    }
    public void applyOppEffects(Pokemon var1) {
        if (Math.random() < 0.2) {
            var1.setMod(Stat.DEFENSE, -1);
        }
    }
}
