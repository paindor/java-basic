
import java.util.Scanner;

class WhereLive{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("어디사십니까?");

        String input = scan.next();

        System.out.println(String.format("%s에 살고있어요", input) );
        


    }

}