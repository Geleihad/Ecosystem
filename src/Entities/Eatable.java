package Entities;

public interface Eatable {

    // нужен для надкушенных травоядных, чтобы они могли уйти, и деревьев, которые съедобны не всегда
    boolean canBeEatenNow ();

}
