package com.allan.studies.abstractfactory;

public class App {

    private King king;
    private Castle castle;
    private Army army;

    public void createKingdom(final KingdomFactory kingdomFactory) {
        setKing(kingdomFactory.createKing());
        setCastle(kingdomFactory.createCastle());
        setArmy(kingdomFactory.createArmy());
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Elf Kingdom");
        app.createKingdom(com.allan.studies.abstractfactory.FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

        System.out.println("Orc Kingdom");
        app.createKingdom(com.allan.studies.abstractfactory.FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());
    }

}
