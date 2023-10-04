package com.green.revfile.ch5;

public class Ch5_Ex15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-", "-..", "."
                        , "..-.", "--.", "....", "..", ".---"
                        , "-.-", ".-..", "--", "-.", "---"
                        , ".--.", "--.-", ".-.", "...", "-"
                        , "..-", "...-", ".--", "-..-", "-.--"
                        , "--.."};
        String result="";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i)-'A']; // ex) 'S' - 'A' > 83 - 65 > 18 > result += "..."
        }
        System.out.println("source: "+ source);
        System.out.println("morse: "+ result);
    }
}
