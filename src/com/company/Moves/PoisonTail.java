package com.company.Moves;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.poison;

public class PoisonTail extends PhysicalMove {
    public PoisonTail(){
        super(Type.POISON,50.0D,100.0D);

    }
    protected String describe(){
        return "использует Poison Tail";
    }
    public void applyOppEffects(Pokemon var1) {
        if (Math.random()<0.1) {
            poison(var1);
        }
    }
}