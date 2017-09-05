package core;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        System.out.print("Enter a date [dd/mm/yyyy]: ");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine(); input.close();
        System.out.print("Day of the week: ");

        // Start coding
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(number.split("/")[2]));
        cal.set(Calendar.DATE, Integer.parseInt(number.split("/")[1]));
        cal.set(Calendar.MONTH, Integer.parseInt(number.split("/")[0]) - 1);

        System.out.print(new java.text.SimpleDateFormat("EEEE").format(cal.getTime()));
        // End coding
    }
}
