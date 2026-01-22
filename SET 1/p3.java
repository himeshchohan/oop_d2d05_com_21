import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch)){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print("character is a vowel");
            }
            else{
                System.out.print("character is a consonant");
            }

        }
        else{
            System.out.print("Invalid input... Please Enter a Character");
        }
    }
}
