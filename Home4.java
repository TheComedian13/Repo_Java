import java.util.Locale;

public class Home4 {
        public static void main(String[] args) {

            // Due: July 18

            // Question - 1:
            /**
             * String threeWordSentence = "hApPy nEW yeAr"
             * // code
             * String threeWordSentence = "Happy New Year"
             */
            String threeWordSentence_1 = "hApPy nEW yeAr";
            System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"
            // code
            System.out.println("After code : " + threeWordSentence_1.toUpperCase().replace("APPY NEW YEAR", "appy New Year"));      // "Happy New Year"


            // Question - 2:
            /**
             * create the abbreviation  // HNY
             */
            String threeWordSentence_2 = "very gOOD MorNING";
            String abbr = threeWordSentence_2.substring(0).substring(4).substring(9);

            // code

            System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr.toUpperCase());
            // Abbreviation for 'very gOOD MorNING' is : VGM


            // Question - 3:
            /**
             * print the number of words in the sentence.
             */
            String sentence_3 = "We all are here to learn programming and testing";
            String[] WordCount = {"We","all","here","to","learn","to","programming","and","testing"};
            System.out.println(WordCount.length);


        }

    }