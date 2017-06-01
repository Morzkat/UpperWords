package sample;

import java.util.Scanner;

public class Main
{

    public Main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto a alterar");

        String str = sc.nextLine();
        Controller controller = new Controller();
        controller.printCaps(str,"Output.txt");

        System.out.println("Resultado: ");
        String read = controller.readerFile("Output.txt");

        System.out.println(read);
    }

    public static void main(String[] args)
    {
        Main m = new Main();
    }


}
