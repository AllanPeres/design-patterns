package com.allan.studies.abstractfactory.orc;

import com.allan.studies.abstractfactory.Army;
import com.allan.studies.abstractfactory.Castle;
import com.allan.studies.abstractfactory.King;
import com.allan.studies.abstractfactory.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
