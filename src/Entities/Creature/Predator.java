package Entities.Creature;

public class Predator extends Creature {

    int bitePower = 5;

    @Override
    public String getSprite() {
        return "🐱";
    }

    @Override
    int getSpeed() {
        return 1;
    }

    @Override
    int getHP() {
        return 20;
    }

    void bite(Herbivore prey) {

//  количество HP травоядного уменьшается на силу атаки хищника.

        // идея - вероятность успеха атаки?


    }

}
