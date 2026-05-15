package Tools;

import Entities.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Field {

    private final int WIDTH = 15;
    private final int HEIGHT = 10;

    private final HashMap<Coordinate, Entity> cells = new HashMap<>();

    public Field() {
        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                cells.put(new Coordinate(col, row), null);
            }
        }
    }

    public Entity getEntityAt(Coordinate coordinate) {
        // опшнл сюда?

        return cells.get(coordinate);
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }



    boolean isEmpty (Coordinate coordinate) {
        return cells.get(coordinate) == null;
    }

    public void placeEntity (Entity what, Coordinate where) {
        if (isEmpty(where)) {

            cells.put(where, what);
        }

    }

    public void removeEntity (Entity removing) {
        for (Map.Entry<Coordinate, Entity> current : cells.entrySet()) {
            if (current.getValue().equals(removing)) {
                cells.put(current.getKey(), null);
                return;
            }
        }
    }


}
