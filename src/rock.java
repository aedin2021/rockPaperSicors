import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Random;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;

public class rock {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        boolean playGame;
        byte yesOrNo;
        String computer;
        String mace;
        String sword;
        String knife;


        int[] arr = new int[]{0,1,2};
        arr[0] = mace;
        arr[1] = knife;
        arr[2] = sword;

       do {System.out.println("This is a game of mace, knife, and sword.");

           System.out.print(" you'll be face the computer to see who wins");

           System.out.println("How you win is mace beats knife, knife beats sword, and sword beats mace.");


           System.out.println("Do you want to go again?(1/2)");

           yesOrNo = key.nextByte();
       } while (yesOrNo == 1);
        if (yesOrNo ==2);{
            System.out.println("Just know your next");
        }












    }
}