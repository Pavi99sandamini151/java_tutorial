import java.time.*;  
public class MonthDayExample1 {  
  public static void main(String[] args) {  
    MonthDay month = MonthDay.now();  
    LocalDate date = month.atYear(2022);  
    System.out.println(date);  
  }  
}  