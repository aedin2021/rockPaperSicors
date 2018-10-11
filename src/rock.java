import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;

public class rock {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        boolean playGame;
        String playagin;
        boolean y;
        String yesOrNo;
        y=true;
       /* String computer;
        String mace;
        String sword;
        String knife;

        String[] arr = new String[3];
        arr[0]= mace;
        arr[1]= sword;
        arr[2]=knife;*/


            System.out.println("This is a game of mace, knife, and sword.");
            System.out.print(" you'll be face the computer to see who wins");
            System.out.println("How you win is mace beats knife, knife beats sword, and sword beats mace.");


            System.out.println("Do you want to go again?(Y/N)");
            yesOrNo = key.nextLine();

       while ((yesOrNo.equalsIgnoreCase("y"))) {
                System.out.println("This is a game of mace, knife, and sword.");
                System.out.print(" you'll be face the computer to see who wins");
                System.out.println("How you win is mace beats knife, knife beats sword, and sword beats mace.");
            }if (yesOrNo.equalsIgnoreCase("n"));
        else if (yesOrNo.equalsIgnoreCase("y"));






    }
}