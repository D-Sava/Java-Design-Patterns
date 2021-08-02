public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer binary = new BinaryObserver(subject);
        Observer hexa = new HexObserver(subject);
        Observer octal = new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);

        System.out.println("Third state change: 553");
        subject.setState(553);

        System.out.println("Fourth state change: 2631");
        subject.setState(2631);

    }
}
