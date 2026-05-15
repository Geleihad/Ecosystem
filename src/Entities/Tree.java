package Entities;

public class Tree extends Entity implements Eatable {
    @Override
    public String getSprite() {
        return "🌳";
    }

    @Override
    public boolean canBeEatenNow() {
        return true;
        // идея: после поедания дерево становится лысым 🪾, остается непроходимым и становится снова съедобным через 10 ходов?

    }



}
