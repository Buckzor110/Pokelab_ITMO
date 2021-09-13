package com.company.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.burn;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90.0D,100.0D);
    }
    protected String describe(){
        return "использует Flamethrower";
    }
    public void applyOppEffects(Pokemon var1) {
        if (Math.random()<0.1) {
            burn(var1);
        }
    }
}
