package com.allan.studies.abstractfactory.orc;

import com.allan.studies.abstractfactory.King;

public class OrcKing implements King {

    private static final String DESCRIPTION = "This is Orc King";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
