package org.example.exercism.LogsLogsLogs;

public class LogLine {
    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        LogLevel fullLogLevel = null;
        if (logLine.contains("[TRC]:")){
            fullLogLevel =  LogLevel.TRACE;
        }
        else if (logLine.contains("[DBG]:")){
            fullLogLevel =  LogLevel.DEBUG;
        }
        else if (logLine.contains("[INF]:")){
            fullLogLevel =  LogLevel.INFO;
        }
        else if (logLine.contains("[WRN]:")){
            fullLogLevel =  LogLevel.WARNING;
        }
        else if (logLine.contains("[ERR]:")){
            fullLogLevel =  LogLevel.ERROR;
        }
        else if (logLine.contains("[FTL]:")){
            fullLogLevel =  LogLevel.FATAL;
        }
        else fullLogLevel = LogLevel.UNKNOWN;
        return fullLogLevel;
    }

    public String getOutputForShortLog() {
        String fullLogLevel = null;
        if (logLine.contains("[TRC]:")){
            fullLogLevel =  LogLevel.TRACE.getTypeLog()+ ":You know the rules and so do I";
        }
        else if (logLine.contains("[DBG]:")){
            fullLogLevel =  LogLevel.DEBUG.getTypeLog() + ":A full commitment's what I'm thinking of";
        }
        else if (logLine.contains("[INF]:")){
            fullLogLevel =  LogLevel.INFO.getTypeLog() + ":You wouldn't get this from any other guy";
        }
        else if (logLine.contains("[WRN]:")){
            fullLogLevel =  LogLevel.WARNING.getTypeLog() + ":I just wanna tell you how I'm feeling";
        }
        else if (logLine.contains("[ERR]:")){
            fullLogLevel =  LogLevel.ERROR.getTypeLog() + ":Gotta make you understand";
        }
        else if (logLine.contains("[FTL]:")){
            fullLogLevel =  LogLevel.FATAL.getTypeLog() + ":Never gonna give you up";
        }
        else fullLogLevel = LogLevel.UNKNOWN.getTypeLog()+ ":We're no strangers to love";

        return fullLogLevel;
    }

    public static void main(String[] args) {
        //Task1
        LogLine logLine1 = new LogLine("[INF]: File deleted");
        System.out.println("LogLevel." + logLine1.getLogLevel());
        //Task2
        LogLine logLine2 = new LogLine("[XYZ]: File deleted");
        System.out.println("LogLevel." + logLine2.getLogLevel());
        //Task 3
        LogLine logLine3 = new LogLine("[ERR]: Stack Overflow");
        System.out.println(logLine3.getOutputForShortLog());

    }
}
