package behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.INFO,"hello world");
        logObject.log(LogProcessor.DEBUG,"hello world..........");
        logObject.log(LogProcessor.ERROR,"hello world.,.l,.....");
    }
}
