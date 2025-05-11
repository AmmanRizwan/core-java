import java.time.LocalDate;
import java.time.LocalTime;

public class JavaTime {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    LocalDate newMonth = today.plusMonths(1);
    System.out.println(tomorrow);
    System.out.println(newMonth);

    LocalTime now = LocalTime.now();
    System.out.println(now);

  }
}