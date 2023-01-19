public class Panda extends Race implements Berserk {

    Panda() {
        super("Panda-men", "berserk");
    }

    @Override
    public final void swordStrike() {
        System.out.println(this.toString() + "захватывает в медвежьи объятия");
    }

    @Override
    public final void hidingBehindShield() {
        System.out.println(this.toString() + "залезает на дерево");
    }

    @Override
    public final void run() {
        System.out.println(this.toString() + "ломится через лес ломая деревья");
    }
}
