public class MailDecorator {

    final private Mail mail;
    final private String myName;

    public MailDecorator(Mail mail, String myName) {
        this.mail = mail;
        this.myName = myName;
    }

    public void send() {
        System.out.println("Doing spellcheck...");
        this.mail.send();
        System.out.println("~ " + myName);
        System.out.println("Potpis firme");
        System.out.println("www.exmaple.com");
        System.out.println("Disclaimer text...");
    }
}
