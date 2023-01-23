public class Abbreviate {
    public static void main(String[] args) {
        
        String word = args[0];
        String first2 = word.substring(0, 2);
        String last2 = word.substring(word.length() - 2, word.length());
        

        if(word.length() < 8) {
            System.out.println(word);
        } else {
            System.out.println(first2 + "..." + last2);
        }
    }
}
