package Entities;

public class Grass extends Entity implements Eatable {
    @Override
    public String getSprite() {
        return "🌿";
    }

    @Override
    public boolean canBeEatenNow() {
        return true;
    }
}
