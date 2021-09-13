package com.company.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.flinch;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80.0D, 100.0D);
    }

    protected String describe() {
        return "использует Waterfall";
    }

    public void applyOppEffects(Pokemon var1) {
        if (Math.random() < 0.2) {
            flinch(var1);
        }
    }
}
