public class ZCount {
    public static void main(String[] args) {
        String input = readString();
        int z = zCount(input);
        System.out.println("z count = " + z);
    }

    public static String readString() {
        System.out.print("String: ");
        return In.nextLine();
    }

    public static int zCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'z') {
                count++;
            }
        }
        return count;
    }
}
