import java.util.*;
public class GuviEg3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char n=sc.next().charAt(0);
int asc=(int)n; 
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
{
  System.out.println("Vowel");
}
else 
{
    if(asc>=97&&asc<=122)
    {
     System.out.println("consonant");
    }
    else System.out.println("Invalid");
}
}
}
