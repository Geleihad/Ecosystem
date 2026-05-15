package Actions.Initialization;

import Actions.Action;
import Entities.Creature.Herbivore;
import Entities.Creature.Predator;
import Tools.Coordinate;
import Tools.Field;

import java.util.Random;


public class PopulateCreatures implements Action {
    @Override
    public void perform(Field field) {

        // для отладки - убрать
        field.placeEntity(new Herbivore(), new Coordinate(3, 3));
        field.placeEntity(new Predator(), new Coordinate(4,4));


        // TODO - расставить случайно хищников и травоядных (подальше друг от друга?)
        // Random random = new Random();
        // идея - отдельный метод для поиска рандомных пустых клеток?
    }
}
