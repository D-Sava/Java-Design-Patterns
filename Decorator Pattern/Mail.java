public class Mail {

    private String toAddress, subject, content;

    public Mail(String toAddress, String subject, String content) {
        this.toAddress = toAddress;
        this.subject = subject;
        this.content = content;
    }

    public Mail() { }

    public String getToAddress() {
        return toAddress;
    }

    public Mail setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Mail setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Mail setContent(String content) {
        this.content = content;
        return this;
    }

    final public void send() {
        System.out.println("To: " + toAddress);
        System.out.println("Subject: " + subject);
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println(content);
    }
}
