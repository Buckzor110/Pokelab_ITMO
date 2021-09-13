package com.company.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.paralyze;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110.0D,70.0D);
    }
    protected String describe(){
        return "использует Thunder";
    }
    public void applyOppEffects(Pokemon var1) {
        if (Math.random()<0.3) {
            paralyze(var1);
        }
    }
}
