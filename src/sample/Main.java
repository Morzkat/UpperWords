package sample;

import sample.DecorateText.Text;

import java.util.Scanner;

public class Main
{

    public Main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto a alterar");

        String str = sc.nextLine();
        Text txt = new Text();

        txt.setTextToUpper(str);
        txt.PrintCaps(str);

        txt.setTextToLower(str);
        txt.PrintCaps(str);

        String read = txt.readText("text.txt");

        System.out.println(read);
    }

    public static void main(String[] args)
    {
        Main m = new Main();
    }


}
