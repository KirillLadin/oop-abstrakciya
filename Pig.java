public class Pig extends Race implements Berserk {

    Pig() {
        super("Pig-baby", "berserk");
    }

    @Override
    public final void swordStrike() {
        System.out.println(this.toString() + "разбегается и насаживает противника на клыкушки");
    }

    @Override
    public final void hidingBehindShield() {
        System.out.println(this.toString() + "издает ультразвуковой поросячий визг");
    }

    @Override
    public final void run() {
        System.out.println(this.toString() + "перебирает копытцами, помахивая хвостиком");
    }
}
