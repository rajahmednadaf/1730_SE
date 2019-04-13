public class App {
    public static void main(String[] args) {
        Modem modem = new Modem("raj");
        modem.ping("192.168.0.1");
        modem.ping("192.168.1.2");
    }
}
