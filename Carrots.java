import java.util.Scanner;

public class Carrots{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int n=kb.nextInt();
    int p = kb.nextInt(); 
    if(1<=n && n<=1000 && 1<=p && p<=1000){
      for(int i=0;i<=n;i++) kb.nextLine();   
      System.out.println(p);
    }
  }  
} 