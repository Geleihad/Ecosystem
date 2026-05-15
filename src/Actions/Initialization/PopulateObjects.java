package Actions.Initialization;

import Actions.Action;

import Entities.Grass;
import Entities.Rock;
import Entities.Tree;
import Tools.Coordinate;
import Tools.Field;


public class PopulateObjects implements Action {
    @Override
    public void perform(Field field) {


        // для отладки - убрать
        field.placeEntity(new Grass(), new Coordinate(0, 0));
        field.placeEntity(new Rock(), new Coordinate(1, 1));
        field.placeEntity(new Tree(), new Coordinate(2, 2));



        // TODO - расставить случайно камни, травы и деревья

        // Random random = new Random();
        // идея - отдельный метод для поиска рандомных пустых клеток?
    }
}
