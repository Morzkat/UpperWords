package sample;

import java.io.*;


public class Controller
{
    public void printCaps(String text, String fileName)
    {
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
            writer.write(text.toUpperCase() + "\n");
            writer.flush();
            writer.close();

            System.out.println("El archivo con el texto alterado a sido creado" + "\n");
        }

        catch (IOException e)
        {
            System.err.println(e + "Error al crear el archivo");
        }
    }

    public String readerFile(String fileName)
    {
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
