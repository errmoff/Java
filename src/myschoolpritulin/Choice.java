package myschoolpritulin;

import FileReader.Reader;
import java.util.Scanner;

/**
 *
 * @author ERRMOFF
 */
public class Choice {
    public static void UserChoice(){
        System.out.println("Добро пожаловать в систему НедоЭколь \n");
        System.out.println("Если у тебя хорошее настроение, не советую вообще продолжать запуск \n");
        System.out.println("1)Ты злюка? Ну давай, поставь ученику плохую оценку, чтобы ему этот java уже в кошмарах снился.. \n");
        System.out.println("2)Тебе лень ставить оценки? Ну можешь тогда просто посмотреть оценки уже выставленные ученикам! \n");
        System.out.println("3)Ты хороший препод,и зашел сюда по ошибке, никогда не ставишь двойки? Тогда предлагаю лучше пойти попить кофеечка с печеньками, ты заслужил! )))\n");
        System.out.println("Выбери свой выриант: ");
        Scanner c = new Scanner(System.in);
        int choice = c.nextInt();
        switch(choice){
            case 1:
                System.out.println("Не ну это бан. Хотя, ладно, продолжай.");
                AppRun.AddOtsenka();
                break;
            case 2:
                System.out.println("Список наших счастливчиков");
                Reader.ReaderFromFileInfo();
                break;
            case 3:
                System.out.println("Мое почтение, мисье! Приятного аппетита!");
                 System.exit(0);
                break;
        }
        
    }
    public static void RestartChoice(){
        System.out.println("Нажми 1 если хочешь выйти, нажми 2 чтобы выбрать дальнейший список действий"); //Зачем я сделал 2 чойса? А не знаю, но вроде работает, значит можно и оставить!
        Scanner r = new Scanner(System.in);
        int rchoice = r.nextInt();
        switch(rchoice){
            case 1:
                System.out.println("Удачной охоты, сталкер.");
                System.exit(0);
                break;
            case 2:
                System.out.println("А ты целеустремленный чел, я удивлен, что код еще работает");
                UserChoice();
                break;
        }

        
    }
    
}
