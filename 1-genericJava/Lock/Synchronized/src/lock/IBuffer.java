package lock;

public interface IBuffer {
    public void write() throws InterruptedException;

    public void read() throws InterruptedException;
}
