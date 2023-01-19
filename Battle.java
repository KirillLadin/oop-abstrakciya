public final class Battle {

    public void start() {
        Cat cat = new Cat();
        Panda panda = new Panda();
        Pig pig = new Pig();
        cat.shoot();
        pig.swordStrike();
        panda.hidingBehindShield();
        pig.run();
        panda.swordStrike();
        pig.hidingBehindShield();
        cat.dodgedAttack();
        pig.swordStrike();
        panda.hidingBehindShield();
        pig.swordStrike();
        cat.run();
        panda.death();
        System.out.println("The End...");
    }
}
