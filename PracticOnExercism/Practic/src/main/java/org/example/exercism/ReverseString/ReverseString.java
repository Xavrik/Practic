package org.example.exercism.ReverseString;

public class ReverseString {
    String reverse(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(inputString);
        stringBuilder.reverse();
        return String.valueOf(stringBuilder);
    }
}
