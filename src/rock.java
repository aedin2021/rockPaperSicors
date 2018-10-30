


import java.util.Scanner;



public class rock {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        boolean playGame;
        byte yesOrNo;
        String computer;
        String mace;
        String sword;
        String knife;
        String thing;

        int[] arr;arr = new int[3];
        arr[0] = new thing(1,"mace");
        arr[2] = 20;
        arr[1] = 30;

       do {System.out.println("This is a game of mace, knife, and sword.");

           System.out.print(" you'll be face the computer to see who wins");

           System.out.println("How you win is mace beats knife, knife beats sword, and sword beats mace.");


           System.out.println("Do you want to go again?(1/2)");

           yesOrNo = key.nextByte();
       } while (yesOrNo == 1);
        if (yesOrNo ==2);{
            System.out.println("YOU BETRAYED ME!");
        }
    }
}