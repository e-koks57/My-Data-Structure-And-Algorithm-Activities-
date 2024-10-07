import java.util.Scanner;

public class palindrome{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Word: ");
    String word = sc.nextLine();
    
    String richmond="";
    
    for(int i = word.length(); i>=0; i-—){
      richmond += word.charAt(i);
      }
      if(word.equals(richmond){
        System.out.println("Palindrome");
        }else{
        System.out.println("Not Palindrome")
        }
    }
 }
 
