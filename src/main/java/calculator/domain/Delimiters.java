package calculator.domain;

public class Delimiters {
    String[] delimiters;
    private Delimiters(String inputText){}

    public String toRegex(){
        return delimitersRegex;
    }

    public static Delimiters createDelimiters(String inputText){
        return new Delimiters(inputText);
    }

    public String splitCustomDelimiter() {
        return "";
    }
    public String getRegex() {
        return "";
    }
}
