package keyword;

import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;
    private ArrayList<Keyword> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        seeAlso = new ArrayList<>();
    }

    public void addSeeAlsoKeyword(Keyword keyword) {
        seeAlso.add(keyword);
    }

    public boolean matches(String word) {
        return this.word.toLowerCase().contains(word.toLowerCase());
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Word: " + word +"\n" + "Definition: " + definition;
        if(!seeAlso.isEmpty()) {
            output += "\nsee also: ";
            for (Keyword kw : seeAlso) {
                output += kw.getWord() + ". ";
            }
        }
        return output;
    }
}