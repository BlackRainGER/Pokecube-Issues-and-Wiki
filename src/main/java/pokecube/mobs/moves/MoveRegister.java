package pokecube.mobs.moves;

import pokecube.core.moves.implementations.MovesAdder;

public class MoveRegister
{
    public static void init()
    {
        MovesAdder.packages.add(MoveRegister.class.getPackage());
    }
}
