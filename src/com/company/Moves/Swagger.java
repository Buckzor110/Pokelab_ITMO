package com.company.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.confuse;

public class Swagger  extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    protected String describe(){
        return "использует Swagger";
    }
    public void applyOppEffects(Pokemon var1) {
        confuse(var1);
        var1.setMod(Stat.ATTACK,+2);
    }
}
