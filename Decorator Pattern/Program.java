public class Program {

    public static void main(String[] args) {

        Mail mail1 = new Mail();

        mail1.setToAddress("pperic@example.com");
        mail1.setSubject("Rezultati ispita");
        mail1.setContent("Neki duzi sadrzaj...\nU vise redova...");

        // Pozivom ovoga:
        // mail1.send();
        // Dobijamo ovo:
        /*
        To: pperic@example.com
        Subject: Rezultati ispita
        - - - - - - - - - - - - - - -
        Neki duzi sadrzaj...
        U vise redova...
        */

        // Koriscenjem dekoratora
        // MailDecorator md = new MailDecorator(mail1, "Milica Milic");
        // md.send();

        // Ili ovako:
        new MailDecorator(mail1, "Milica Milica").send();
        /*
        Doing spellcheck...
        To: pperic@example.com
        Subject: Rezultati ispita
        - - - - - - - - - - - - - - -
        Neki duzi sadrzaj...
        U vise redova...
        ~ Milica Milic
        Potpis firme
        www.exmaple.com
        Disclaimer text...
        */

        // Sve u jednom prolazu:
        new MailDecorator(
                new Mail()
                        .setToAddress("pperic@example.com")
                        .setSubject("Rezultati ispita")
                        .setContent("Neki duzi sadrzaj...\n" +
                                "U vise redova..."),
                "Milica Milic"
        ).send();
    }
}