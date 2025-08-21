public class ZWordCount {
    public static void main(String[] args) {
        String[] sentences = {
            "green ideas Zleep furiously",
            "a zebra graZed",
            "zorro WAZ zore",
            "I feel snoozy"
        };
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
        System.out.println("Words containing a 'z' = " + countZ(sentences));
    }

    public static int countZ(String[] sentences) {
        int sum = 0;
        for(String sentence : sentences){
            sum += countZ(sentence);
        }
        return sum;
    }

    public static int countZ(String sentence) {
        String[] words = sentence.split(" +"); // The + means one OR MORE spaces
        int count = 0;
        for(String word : words){
            if(containsZ(word)){ // can talk about redundant == true
                count++;
            }
        }
        return count;
    }

    public static boolean containsZ(String word) {
        return word.contains("z") || word.contains("Z");
    }
}
