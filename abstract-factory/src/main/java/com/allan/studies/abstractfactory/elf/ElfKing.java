package com.allan.studies.abstractfactory.elf;

import com.allan.studies.abstractfactory.King;

public class ElfKing implements King {

    private static final String DESCRIPTION = "This is the elf king";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
