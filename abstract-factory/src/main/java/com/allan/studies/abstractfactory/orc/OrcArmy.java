package com.allan.studies.abstractfactory.orc;

import com.allan.studies.abstractfactory.Army;

public class OrcArmy implements Army {

    private static final String DESCRIPTION = "This is Orc army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
