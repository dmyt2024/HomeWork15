package app.Service;

import app.Enums.Day;
import app.Interface.DayAdvise;

public class AdviseOfDay implements DayAdvise {


    @Override
    public void advise(Day day) {

        switch (day) {
            case MONDAY:
                System.out.println("Доброго дня! " +
                        "Починаем працювати! Good luck!");
                break;
            case TUESDAY:
                System.out.println("Ти повний сил і " +
                        "хорошого настрою. Вперед! ");
                break;
            case WEDNESDAY:
                System.out.println("Вже середина. " +
                        "Ти можешь ще багато що зробити");
                break;
            case THURSDAY:
                System.out.println("Ура! Уже скоро " +
                        "найулюбленійший день!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Сьогодні можешь " +
                        "відпочити з друзями на рибалці");
                break;
            case SUNDAY:
                System.out.println("Ще цілий день вихідний. " +
                        "Краще провести його з родиною");
                break;


        }
    }
}
