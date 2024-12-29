public class Main {
    public static void main(String[] args) {
        Factory factory = new ServerFactory("4gb", "12th gen");
        Computer sunucu1 = factory.createComputer();
        System.out.println(sunucu1.getCpu() + " " + sunucu1.getRam());
    }
}
