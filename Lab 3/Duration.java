import java.util.*;
import java.time.*;
import java.time.format.*;
public class Duration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Enter the date in format: (dd/mm/yyyy): ");
		String date = sc.nextLine();
		LocalDate setDate = LocalDate.parse(date, df);
		LocalDate presentDate = LocalDate.now();
		Period diff = Period.between(setDate,presentDate);
		System.out.println("The duration:\n" + diff.getYears() + " year(s), " + diff.getMonths() + " month(s), " + diff.getDays()+" day(s)");
		sc.close();
	}

}
