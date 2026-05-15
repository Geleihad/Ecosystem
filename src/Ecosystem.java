import Actions.Action;
import Actions.Initialization.PopulateCreatures;
import Actions.Initialization.PopulateObjects;
import Actions.MoveCreatures;
import Actions.RepopulateCreatures;
import Tools.ConsoleRenderer;
import Tools.Field;

public class Ecosystem {

    final Field field;
    final ConsoleRenderer consoleRenderer;

    static int turnCounter = 0;



    // отладка, убрать

    public static void main(String[] args) throws InterruptedException {
        Field field = new Field();
        ConsoleRenderer renderer = new ConsoleRenderer(field);
        Ecosystem ecosystem = new Ecosystem(field, renderer);
        for (Action action : ecosystem.initActions) {
            action.perform(field);
        }


        while (true) {
            turnCounter++;
            System.out.println("TURN " + turnCounter);


            renderer.printField();
            Thread.sleep(300);
        }
    }











    Action[] initActions = {new PopulateCreatures(), new PopulateObjects ()}; // действия, совершаемые перед стартом симуляции. Пример - расставить объекты и существ на карте
    Action[] turnActions = {new MoveCreatures(), new RepopulateCreatures(), new PopulateObjects ()}; // действия, совершаемые каждый ход. Примеры - передвижение существ, добавить травы или травоядных, если их осталось слишком мало

    public Ecosystem(Field field, ConsoleRenderer consoleRenderer) {
        this.field = field;
        this.consoleRenderer = consoleRenderer;
    }

    void startSimulation(){
        // TODO запустить бесконечный цикл симуляции и рендеринга
    }

    void pauseSimulation() {
        // TODO приостановить бесконечный цикл симуляции и рендеринга

    }

    void nextTurn () {
        // TODO просимулировать и отрендерить один ход

    }







}
