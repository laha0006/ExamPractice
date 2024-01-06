package keyword;

public class Main {
    public static void main(String[] args) {
        Keyword keyword = new Keyword("Keyword","a word or concept of great significance.\n" +
                "\"homes and jobs are the keywords in the campaign\"");
        Keyword password = new Keyword("Password", "a secret word or phrase that must be used to gain admission to a place.\n" +
                "\"if you don't know the password you can't come in\"");
        Keyword cipher = new Keyword("Cipher", "a secret or disguised way of writing; a code.\n" +
                "\"he wrote cryptic notes in a cipher\"");
        keyword.addSeeAlsoKeyword(password);
        keyword.addSeeAlsoKeyword(cipher);


        System.out.println(keyword);
    }
}
