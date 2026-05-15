package Tools;

public class ConsoleRenderer {

    Field field;

    public ConsoleRenderer(Field field) {
        this.field = field;
    }




    public void printField() {
        for (int row = 0; row < field.getHEIGHT(); row++) {
            for (int col = 0; col < field.getWIDTH(); col++) {
                Coordinate coordinate = new Coordinate(col, row);
                if (field.getEntityAt(coordinate) == null) {
                    System.out.print("🟫");
                } else {
                    System.out.print(field.getEntityAt(coordinate).getSprite());
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
