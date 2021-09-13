package com.company.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.sleep;

public class Sing  extends StatusMove {
    public Sing(){
        super(Type.NORMAL, 0, 55);
    }
    protected String describe(){
        return "использует Sing";
    }

    public void applyOppEffects(Pokemon var1) {
        sleep(var1);
    }

}
