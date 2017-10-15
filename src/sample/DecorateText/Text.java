package sample.DecorateText;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Text extends DecorateText
{
    private String text;

    @Override
    public void setTextToUpper(String text)
    {
        this.text = "Mayuscula: " + text.toUpperCase();
    }

    public void setTextToLower (String text)
    {
        this.text = " Minuscula: " + text.toLowerCase();
    }

    @Override
    public void PrintCaps(String text)
    {
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter("text.txt", true));
            writer.write(this.text + "\n");
            writer.flush();
            writer.close();

        }

        catch (IOException e)
        {
            System.err.println(e + "Error al crear el archivo");
        }
    }

    @Override
    public String readText(String fileName)
    {
        System.out.println("Resultado: ");
        StringBuilder sb = new StringBuilder();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String ln = "";
            while( (ln = reader.readLine()) != null)
            {
                sb.append(ln).append("\n");
            }
        }
        catch ( IOException i)
        {
            System.err.println(i);
        }

        return sb.toString();
    }
}
