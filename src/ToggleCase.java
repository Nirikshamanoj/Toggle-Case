import java.util.Scanner;
public class ToggleCase
{
    static String stringToggleCase(String A)
    {
        char[] s=A.toCharArray();
        for(int i=0;i<A.length()-1;i++)
        {
            s[i]= (char) (s[i]^(1<<5));
        }
        return new String(s);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        String large=stringToggleCase(A);
        System.out.println(large);
    }
}
