package org.example.exercism.SqueakyClean;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder clean = new StringBuilder();
        boolean toUpperCase = false;

        for (char c : identifier.toCharArray()) {
            if (c == '-') {
                toUpperCase = true;
            } else if (c == ' ') {
                clean.append('_');
            } else if (Character.isLetterOrDigit(c) || c == '_') {
                if (toUpperCase) {
                    clean.append(Character.toUpperCase(c));
                    toUpperCase = false;
                } else {
                    clean.append(replaceLeetSpeak(c));
                }
            }
        }

        return clean.toString();
    }

    private static char replaceLeetSpeak(char c) {
        return switch (c) {
            case '4' -> 'a';
            case '3' -> 'e';
            case '0' -> 'o';
            case '1' -> 'l';
            case '7' -> 't';
            default -> c;
        };
    }




public static void main(String[] args) {

        System.out.println(clean("my   Id"));
        System.out.println(clean("a-bc"));
        System.out.println(clean("¡1337sp34k is fun!"));
        System.out.println(clean("4 73s7"));
        System.out.println(clean("a$#.b"));

    }

}
