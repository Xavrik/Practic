package org.example.exercism.logLevels;

public class LogLevels {
    public static String message(String logLine) {
        String[] logArray = logLine.split(":");
        String messageString = logArray[1];
        return messageString.trim();
    }
    public static String logLevel(String logLine) {
        String[] arrLog = logLine.split("[\\[:]+");
        String logString = arrLog[1];
        return logString.replaceAll("\\]"," ").toLowerCase().trim();
    }
    public static String reformat(String logLine) {
        String[] arrOfStr = logLine.split(":");
        String msg =arrOfStr[0];
        String str =arrOfStr[1];
        msg=msg.replaceAll("[\\[]","(").replaceAll("[\\]]",")").toLowerCase();
        msg=str.trim()+" "+msg;
        return msg;
    }
}
