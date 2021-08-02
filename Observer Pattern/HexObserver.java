public class HexObserver implements Observer{

    private Subject subject;

    public HexObserver(Subject subject){
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hex: " + Integer.toHexString(subject.getState()));
    }
}
