public class ZWordCount {

    // Top Procedure
    // Goal: print sentences, show number of words containing z
    // for-each loop
    // output
    public static void main(String[] args) {
        String[] sentences = {
            "green ideas Zleep furiously",
            "a zebra graZed",
            "zorro WAZ zore",
            "I feel snoozy"
        };

        for (String sentence : sentences){
            System.out.println(sentence);
        }
        System.out.println("Words containing a 'z' = " + countZ(sentences));
    }

    // Function level 2
    //multiple sentences
    // Goal: Count the total number of z words in all the sentances
    // Parameters: String[] sentences
    // return an int (count)
    // for-each loop
    // sum
    public static int countZ(String[] sentences){
        int sum = 0;
        for(String sentence : sentences){
            sum += countZ(sentence);
        }
        return sum;
    }

    // Function level 3
    // singular sentence
    // Goal: Count the number of words in a sentence containing a z
    // Parameters: String sentences
    // return an int (count)
    // split the sentence into words
    // for-each loop
    public static int countZ(String sentence){
        String[] words = sentence.split(" +");
        int count = 0;
        for(String word : words){
            if(containsZ(word)){
                count++;
            }
        }
        return count;
    }

    // Function level 4
    // words
    // Goal: Check if the word contains a Z/z
    // Parameters: String word
    // Return a boolean
    // word.contains("z"), word.contains("Z")
    public static boolean containsZ(String word){
        return word.contains("Z") || word.contains("z");
    }
}
