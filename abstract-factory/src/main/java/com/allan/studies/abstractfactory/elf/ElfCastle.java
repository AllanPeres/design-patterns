package com.allan.studies.abstractfactory.elf;

import com.allan.studies.abstractfactory.Castle;

public class ElfCastle implements Castle {

    private static final String DESCRIPTION = "This is the Elf castle";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
