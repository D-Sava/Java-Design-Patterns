public class OctalObserver implements Observer{

    private Subject subject;

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
    }
}
