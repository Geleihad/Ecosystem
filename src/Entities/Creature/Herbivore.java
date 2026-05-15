package Entities.Creature;

import Entities.Eatable;

public class Herbivore extends Creature implements Eatable {


    @Override
    public String getSprite() {
        return "🐭";
    }

    @Override
    int getSpeed() {
        return 1;
    }

    @Override
    int getHP() {
        return 10;
    }

    @Override
    public boolean canBeEatenNow() {
        return true;

        //если травоядное только что было надкушено, оно становится на 5 ходов несъедобным?
    }
}
