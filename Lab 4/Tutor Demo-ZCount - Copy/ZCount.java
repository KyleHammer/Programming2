public class ZCount {
    public static void main(String[] args){
        String input = readString();
        int z = zCount(input);
        System.out.println("z count = " + z);
    }

    // Top procedure - Level 1
    // Goal: Reading the string, show the number of 'zs'
    // read string
    // output
    public static String readString(){
        System.out.print("String: ");
        return In.nextLine();
    }

    // Function - Level 2
    // Goal: Count how many z's are in the string 
    // count
    // string loop
    public static int zCount(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'z' || s.charAt(i) == 'Z'){
                count++;
            }
        }
        return count;
    }
}
