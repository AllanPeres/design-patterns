package com.allan.studies.abstractfactory.elf;

import com.allan.studies.abstractfactory.Army;

public class ElfArmy implements Army {

    private static final String DESCRIPTION = "This is the elven army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
