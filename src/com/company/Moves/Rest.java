package com.company.Moves;

import ru.ifmo.se.pokemon.*;

public class Rest  extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    protected String describe(){
        return "использует Rest";
    }

    protected void applySelfEffects(Pokemon var1) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP).stat(Stat.HP, 73);
        var1.setCondition(e);
    }
}
