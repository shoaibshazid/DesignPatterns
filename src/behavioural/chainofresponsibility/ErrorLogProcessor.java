package behavioural.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message) {
        if (logLevel == LogProcessor.ERROR) {
            System.out.println("Error: " + message);
        }else{
            nextLogProcessor.log(logLevel, message);
        }
    }
}
