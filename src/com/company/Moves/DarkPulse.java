package com.company.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.flinch;

public class DarkPulse extends SpecialMove {
    public DarkPulse(){
        super(Type.DARK, 80.0D,100.0D);
    }
    protected String describe(){
        return "использует Dark Pulse";
    }
    public void applyOppEffects(Pokemon var1) {
        if (Math.random()<0.2) {
            flinch(var1);
        }
    }
}
