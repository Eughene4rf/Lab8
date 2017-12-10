import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;


public class  Lab8
{

    public static void main(String args[]) throws IOException
    {

        ArrayList<String> obj = new ArrayList<>();

        System.out.println("Добавление и изменение элементов: ");
        obj.add("Sasha");
        obj.add("Sasha");
        obj.add("Misha");
        obj.add("Anton");
        obj.add("Senya");
        obj.add("Dima");
        System.out.println("Список элементов:"+obj);

        obj.add(0, "Dasha");
        obj.add(1, "Ann");
        System.out.println("Cписок поле добавления элементов:"+obj);

        //Remove elements
        obj.remove("Dima");
        obj.remove("Misha");
        System.out.println("Список после удаления элементов:"+obj  +"\n");


        System.out.println("Количество повторений элементов: ");
        HashMap<String, Integer> letters = new HashMap<String, Integer>();
        for (int i = 0; i < obj.size(); i++)
        {
            String tempChar = obj.get(i);
            if (!letters.containsKey(tempChar))
            {
                letters.put(tempChar, 1);
            }
            else
            {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            System.out.println(""+ entry.getKey() + ", Количество повторений = " + entry.getValue());
        }

        System.out.println("\n" + "Перестановка элементов: ");
        Collections.reverse(obj);
        System.out.println("После перестановки" + obj +"\n");


        int max = obj.get(0).length();
        for (int i = 0; i < obj.size(); i++)
        {
            if (obj.get(i).length() > max)
            {
                max = obj.get(i).length();
                System.out.println("Самое длинное слово: "+obj.get(i));
            }
            else if (obj.get(i).length() < max)
            {
                max = obj.get(i).length();
                System.out.println("Самое короткое слово: "+obj.get(i));
            }
        }
    }
}

