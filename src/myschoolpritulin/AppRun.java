/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myschoolpritulin;

import entity.Ucheniki;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ERRMOFF
 */
public class AppRun {
    public static void AddOtsenka(){
    //сбор данных
    System.out.println("Введите имя и фамилию ученика");
    Scanner n = new Scanner(System.in);
    String name = n.nextLine();
    
    System.out.println("Введите название предмета");
    Scanner p = new Scanner(System.in);
    String predmet = n.nextLine();
    
    Date d = new Date();
    String date = d.toString();
    
    System.out.println("Введите оценку");
    Scanner o = new Scanner(System.in);
    int otsenka = o.nextInt();
    
    Ucheniki uchenik1 = new Ucheniki(1L, name, predmet, otsenka, date); //создаем нового ученика с данными, собранными выше
    String uInfo = uchenik1.toString(); //Конвертация в строку
    
          
    //System.out.println(uchenik1.toString());
    //запись в файл 
        try(FileWriter writer = new FileWriter("UchenikiInfo/Info.txt", true)) //место хранения
        {
           // запись всей строки
            String text = uInfo + "\n"; //сохранение в качестве строки введеных нами данных
            writer.write(text);
            // запись по символам
            
            writer.flush();
            System.out.println("Оценка " + otsenka + " успешно выставлена ученику " + name + " за предмет " + predmet); 
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
            //Вывод ошибки
        } 
    Choice.RestartChoice();
    }
    
}
