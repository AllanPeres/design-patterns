package com.allan.studies.abstractfactory.elf;

import com.allan.studies.abstractfactory.Army;
import com.allan.studies.abstractfactory.Castle;
import com.allan.studies.abstractfactory.King;
import com.allan.studies.abstractfactory.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
