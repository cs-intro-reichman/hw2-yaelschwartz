//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String name = args[0];
        int cheering = Integer.parseInt(args[1]);
        name = name.toUpperCase();

        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < name.length(); i++) {
               char ch = name.charAt(i);

               if (anLetters.indexOf(ch) != -1) {
                  System.out.println("Give me an " + ch + ": " + ch + "!");
               } else {
                  System.out.println("Give me a  " + ch + ": " + ch + "!");
               }
        }
        
        System.out.println("What does that spell?");

        for (int i = 0; i < cheering; i++) {
                System.out.println(name + "!!!");
        }
    }
}
