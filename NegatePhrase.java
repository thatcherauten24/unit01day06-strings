// good, except:
// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        
        String phrase = args[0];
        
        if(phrase.substring(0, 3).equals("not")) {
            System.out.println(phrase);
        } else {
            System.out.println("not " + phrase);
        }
    }
}
//commit