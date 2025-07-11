package main.java.com.kanablast.model;

/**
 * JapaneseCharacter represents a single character in the Japanese writing system,
 * either Hiragana or Katakana, along with its Romaji representation
 * 
 * @author hippityhopecodes
 */
public class JapaneseCharacter {
    /** The character itself */
    private String character;
    /** The Romaji representation of the character */
    private String romaji;
    /** The type of the character, either Hiragana or Katakana */
    private CharType type;

    /**
     * Enum representing the type of Japanese character.
     */
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

    /**
     * Returns the character as a string.
     *
     * @return the character
     */
    public String getCharacter() {
        return character;
    }

    /**
     * Returns the Romaji representation of the character.
     *
     * @return the Romaji representation
     */
    public String getRomaji() {
        return romaji;
    }

    /**
     * Returns the type of the character, either Hiragana or Katakana.
     *
     * @return the type of the character
     */
    public CharType getType() {
        return type;
    }

    /**
     * Sets the character to the given string.
     *
     * @param character the character to set
     */
    public void setCharacter(String character) {
        this.character = character;
    }

    /**
     * Sets the Romaji representation of the character.
     *
     * @param romaji the Romaji representation to set
     */
    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    /**
     * Sets the type of the character.
     *
     * @param type the type to set, either Hiragana or Katakana
     */
    public void setType(CharType type) {
        this.type = type;
    }
}
