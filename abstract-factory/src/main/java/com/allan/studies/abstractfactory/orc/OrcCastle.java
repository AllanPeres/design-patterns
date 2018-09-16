package com.allan.studies.abstractfactory.orc;

import com.allan.studies.abstractfactory.Castle;

public class OrcCastle implements Castle {

    private static final String DESCRIPTION = "This is orc castle";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
