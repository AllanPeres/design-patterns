package com.allan.studies.abstractfactory;

import com.allan.studies.abstractfactory.elf.ElfKingdomFactory;
import com.allan.studies.abstractfactory.orc.OrcKingdomFactory;

public class FactoryMaker {

    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(FactoryMaker.KingdomType kingdomType) {
        switch (kingdomType) {
            case ELF: return new ElfKingdomFactory();
            case ORC: return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("Kingdom type not supported");
        }
    }
}
