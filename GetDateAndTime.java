import java.util.*;

public class GetDateAndTime {
  public static void main(String[] args) {
    int day, month, year;
    int hour, minute, second;
    GregorianCalendar g = new GregorianCalendar();
    day = g.get(Calendar.DAY_OF_MONTH);
    month = g.get(Calendar.MONTH);
    year = g.get(Calendar.YEAR);
    hour = g.get(Calendar.HOUR);
    minute = g.get(Calendar.MINUTE);
    second = g.get(Calendar.SECOND);
    System.out.println("date=" + day + "/ " + month + " /" + year);
    System.out.println("time =" + hour + ":" + minute + ":" + second);

  }

}
