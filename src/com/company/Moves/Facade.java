package com.company.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class  Facade extends PhysicalMove {
    static double strength = 70.0D;
    public Facade(){
        super(Type.NORMAL, Facade.strength,100.0D);
    }
    protected String describe(){
        return "использует Facade";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.POISON || pokemon.getCondition() == Status.PARALYZE)
            strength*=2;
    }
}
