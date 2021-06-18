/**This program switch "e"s with "o"s 
 * @author (Fikri Şan Köktaş)
 * @version (19 October 2020)*/
 
import java.awt.Rectangle;
import java.util.Scanner; //I import in any case
public class KFS_HollePrinter_Main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word, program will switch its 'e's with 'o's: ");
        String word = input.next();
        
        String replaceword1 = word.replace("e", "a"); // replaces e with a
        String replaceword2 = replaceword1.replace("o","e");
        String replaceword3 = replaceword2.replace("a","o");
        
        System.out.println("Modified version of your word: " + replaceword3);
        
        String s1 = "Hello,World"; // actual string 
        String sm1 = s1.replace("e", "a"); // replaces e with a
        String sm2 = sm1.replace("o","e");
        String sm3 = sm2.replace("a","o");
        
        
        System.out.println("Actual:" + s1); // prints actual 
        System.out.println("Modified:" + sm3); // prints modified
    }
}


