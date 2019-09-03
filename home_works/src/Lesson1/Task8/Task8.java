package Lesson1.Task8;

/* Human readable duration format
Your task in order to complete this Kata is to write a function which formats a duration, given as a
number of seconds, in a human-friendly way.
The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the
duration is expressed as a combination of years, days, hours, minutes and seconds.
It is much easier to understand with an example:
TimeFormatter.formatDuration(62) //returns "1 minute and 2 seconds"
TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"*/

public class Task8 {
    public static void main(String[] args) throws Exception{
        Task8.formatDuration(62); //returns "1 minute and 2 seconds"
        Task8.formatDuration(3662); //returns "1 hour, 1 minute and 2 seconds"*/
        Task8.formatDuration(992583662);
        Task8.formatDuration(0);
        Task8.formatDuration(-56985);
    }

    public static void formatDuration(long number){

        long years, days, hours, minutes, seconds;

        if (number < 0) System.out.println("Ошибка");
        else if (number == 0) System.out.println("Сейчас");
        else {
            years = number / (365 * 24 * 60 * 60);
            days = (number - (years * 365 * 24 * 60 * 60)) / (24 * 60 * 60);
            hours = (number - (years * 365 * 24 * 60 * 60) - (days * 24 * 60 * 60)) / (60*60);
            minutes = (number - (years * 365 * 24 * 60 * 60) - (days * 24 * 60 * 60) - (hours * 60 * 60)) / 60;
            seconds = number - (years * 365 * 24 * 60 * 60) - (days * 24 * 60 * 60) - (hours * 60 * 60) - (minutes * 60);

            System.out.println(years + " years " + "end " + days + " days " + "end " + hours + " hours " + "end " + minutes + " minutes " + "end " + seconds + " seconds");
        }

    }
}
