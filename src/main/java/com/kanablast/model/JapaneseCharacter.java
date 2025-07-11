package main.java.com.kanablast.model;

public class JapaneseCharacter {
    private String character;
    private String romaji;
    private CharType type;

    public enum CharType {
        HIRAGANA,
        KATAKANA,
    }

    /**
     * Japanese character represented as a string.
     *
     * @param character
     * @param romaji
     * @param type
     */
    public JapaneseCharacter(String character, String romaji, CharType type) {
        setCharacter(character);
        setRomaji(romaji);
        setType(type);
    }

    public String getCharacter() {
        return character;
    }

    public String getRomaji() {
        return romaji;
    }

    public CharType getType() {
        return type;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    public void setType(CharType type) {
        this.type = type;
    }

    
}
