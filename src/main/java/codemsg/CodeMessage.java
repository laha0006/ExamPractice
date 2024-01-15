package codemsg;

import java.util.ArrayList;
import java.util.List;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private int shiftvalue;

    public CodeMessage(String plainText,int shiftvalue) {
        this.plainText = plainText;
        this.ciphers = new int[plainText.length()];
        this.shiftvalue = shiftvalue;
    }

    public int convertSymbol(char symbol) {
        char symbolToConvert =  Character.toLowerCase(symbol);
        return symbolToConvert - 'a' + 1;
    }

    public void dechiper() {
        int index = 0;
        for (char c : plainText.toCharArray()) {
            ciphers[index++] = convertSymbol(c);
        }
    }

    public void printCiphers() {
        for (int i : ciphers) {
            System.out.print(i + " ");
        }
    }
}
