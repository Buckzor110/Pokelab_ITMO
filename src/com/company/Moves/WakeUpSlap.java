package com.company.Moves;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    static double sterngth = 70.0D;
    public WakeUpSlap(){
        super(Type.FIGHTING, WakeUpSlap.sterngth,100.0D);
    }
    protected String describe(){
        return "использует Wake-Up Slap";
    }
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.SLEEP) {
            sterngth *= 2;
            Effect var2 = (new Effect()).condition(Status.NORMAL);
            pokemon.setCondition(var2);
        }
    }
}
