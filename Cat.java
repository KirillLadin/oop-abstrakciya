public class Cat extends Race implements Shooting {
    Cat() {
        super("Woman-cat", "shooter");
    }

    @Override
    public final void run() {
        System.out.println(this.toString() + "убегает с поджатым хвостом");
    }

    @Override
    public final void shoot() {
        System.out.println(this.toString() + "стреляет взглядом");
    }

    @Override
    public final void dodgedAttack() {
        System.out.println(this.toString() + "сворачивается клубочком");
    }
}
