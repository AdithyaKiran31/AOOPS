package W4_4b;

public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleLog(LogLevel level, String message);
}