public class App {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.add("ABC", 10);
        hashMap.add("DEF", 12);
        hashMap.add("GHI", 14);

        hashMap.remove("DEF");

        hashMap.getValue("ABC");

        hashMap.clearAll();

    }
}
