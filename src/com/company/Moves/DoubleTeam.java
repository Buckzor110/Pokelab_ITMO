package com.company.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }
    protected String describe(){
        return "использует Double Team";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, +1);
    }
}
