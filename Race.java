public abstract class Race {
    private final String name;
    private final String specialization;

    public final String toString() {
        return specialization + " " + name + " ";
    }

    Race(final String name, final String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    public abstract void run();
    public final void death() {
        System.out.println(name + " погиб :(");
    }
}
