package erwin.suarez.Lab2;

public class TestCryptography {

    public static void main(String[] args){

        String text = "THIS IS A SECRET MESSAGE!";
        String txt = Cryptography.encrypt(text, 5);
        String xtx = Cryptography.decrypt(txt, 5);

        System.out.println("This is the original message:\n" + text + "\n");

        System.out.println("Message on top will be encrypted");
        System.out.println("Encrypted message below");
        System.out.println(txt + "\n");
        System.out.println("Will try to decrypt this message");
        System.out.println(xtx + "\n");
        System.out.println("Message now decryted below");
        System.out.println(xtx);
    }
}
