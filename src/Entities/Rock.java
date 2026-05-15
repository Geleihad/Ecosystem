package Entities;

public class Rock extends Entity {
    @Override
    public String getSprite() {
        return "🪨";
    }

    //идея: камень рассыпается каждые 10 ходов?
}
