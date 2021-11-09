public class Main {

    public static String longToIP(long ip) {
        return String.format("%d.%d.%d.%d", ip>>>24, (ip>>16)&0xff, (ip>>8)&0xff, ip&0xff);
    }

    public static void main(String[] args) {
        long ip = 32;
        String m = longToIP(ip);
        System.out.println(m);
    }
}