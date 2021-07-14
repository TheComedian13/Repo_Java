package Class4;

public class Homework3 {
    public static void main(String[] args ){
///Question 1
        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use: Ternary operator
         *
         */
        String sentence_1 = "hello dear, how are you?";
        int result_1 = 0;
        result_1 = sentence_1.length() > 10 ? 100 : 15;
        System.out.println("result_1 = " + result_1);



///Question 2
        /**
         * replace all 'R/r' with 'F'
         */
        String sentence_2 = "We all ARe GOod ProgrAMmer";
        System.out.println(sentence_2.replace("r","F").replace("R","F"));
// Question - 3
        /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console.
         */

        String sentence_3 = "ABC Networks";
        String result_3 = "";
        System.out.println(sentence_3 + " has " + sentence_3.length() + " characthers");
        System.out.println("Does " + sentence_3 + " start with a? : " + sentence_3.startsWith("a"));
        System.out.println("Does " + sentence_3 + " end with k? : " + sentence_3.endsWith("k"));
        result_3 = result_3.startsWith("a") ? "Media" : "Entertainment";
        System.out.println(result_3);


    }
}
