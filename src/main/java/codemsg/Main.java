package codemsg;

public class Main {
    public static void main(String[] args) {
        CodeMessage msg = new CodeMessage("abcdefghijklmnopqrstu",10);
        msg.dechiper();
        msg.printCiphers();
    }
}
