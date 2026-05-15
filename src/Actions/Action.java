package Actions;


import Entities.Creature.Creature;
import Tools.Field;

import java.util.ArrayList;

public interface Action {


void perform(Field field);


//    Actions.Action - действие, совершаемое над миром. Например - сходить всеми существами.
//    Это действие итерировало бы существ и вызывало каждому makeMove().
//    Каждое действие описывается отдельным классом и совершает операции над картой.


}
