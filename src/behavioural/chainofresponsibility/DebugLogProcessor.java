package behavioural.chainofresponsibility;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message) {
        if (logLevel == LogProcessor.DEBUG) {
            System.out.println("DEBUG: " + message);
        }else{
            nextLogProcessor.log(logLevel, message);
        }
    }
}
