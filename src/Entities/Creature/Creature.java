package Entities.Creature;

import Entities.Entity;

public abstract class Creature extends Entity {

    int HP;

    abstract int getSpeed();

    abstract int getHP();

    void die() {
        // Если значение HP жертвы опускается до 0, травоядное исчезает
    }

    public void makeMove() {
        // продвинуться за 1 ход на кол-во клеток = getSpeed
    }

    ;


    void eat(Entity food) {
        // если еда canBeEatenNow, тогда хп еды переходит едоку


        //    или?
//    public void makeMove (Coordinate destination) {};


    }

}
