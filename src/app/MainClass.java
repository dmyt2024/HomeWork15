package app;

import app.Enums.Day;
import app.Service.AdviseOfDay;

public class MainClass {
    public static void main(String[] args) {
        AdviseOfDay dima = new AdviseOfDay();
        dima.advise(Day.FRIDAY);
    }
}
