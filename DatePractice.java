import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {

        System.out.println("\n**************************\n");
        System.out.println("****** DatePractice ******\n");
        System.out.println("**************************\n");

        Date today = new Date();

        Date afterToday = new Date();
        Date nextYear = new Date(11);

        nextYear.setYear(121);

        System.out.println("\ntoday " + today);
        System.out.println("afterToday " + afterToday);
        System.out.println("Next Year " + nextYear);

        System.out.println("\nToday is after afterToday? " + today.after(afterToday));
        System.out.println("Today is before afterToday? " + today.after(afterToday));
        System.out.println("Today is before nextYear? " + today.after(nextYear));
        System.out.println("Today is after nextYear? " + today.after(nextYear));

        System.out.println("\nToday's day of the week is" + today.getDay());
        System.out.println("Today's month is" + today.getMonth());
        System.out.println("\nToday's time since 1978 is" + today.getTime());
        System.out.println("Today's time since 1970's + 60s is" + (today.getTime() + 60000));

        System.out.println("Today's date + 60s is " + new Date(today.getTime() + 60000));  

        Date copyToday = today;
        System.out.println("\nCopy_Today " + copyToday);
        today.setHours(11);
        System.out.println("\nCopy_Today " + copyToday);

        Date cloneToday = (Date) today.clone();
        System.out.println("\nClone_Today " + cloneToday);
        today.setHours(12);
        System.out.println("\nClone_Today " + cloneToday);



    }

}