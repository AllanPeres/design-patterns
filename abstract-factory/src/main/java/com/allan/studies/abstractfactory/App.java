package com.allan.studies.abstractfactory;

import com.allan.studies.abstractfactory.elf.ElfKingdomFactory;
import com.allan.studies.abstractfactory.orc.OrcKingdomFactory;

public class App {

    private King king;
    private Castle castle;
    private Army army;

    public void createKingdom(final KingdomFactory kingdomFactory) {
        setKing(kingdomFactory.createKing());
        setCastle(kingdomFactory.createCastle());
        setArmy(kingdomFactory.createArmy());
    }

    public King getKing(final KingdomFactory kingdomFactory) {
        return kingdomFactory.createKing();
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public Castle getCastle(final KingdomFactory kingdomFactory) {
        return kingdomFactory.createCastle();
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public Army getArmy(final KingdomFactory kingdomFactory) {
        return kingdomFactory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public static class FactoryMaker {
        public enum KingdomType {
            ELF, ORC
        }

        public static KingdomFactory makeFactory(KingdomType kingdomType) {
            switch (kingdomType) {
                case ELF: return new ElfKingdomFactory();
                case ORC: return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("Kingdom type not supported");
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Elf Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

        System.out.println("Orc Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());
    }

}
