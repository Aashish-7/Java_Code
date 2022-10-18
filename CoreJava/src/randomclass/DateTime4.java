import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime4 {
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting : " + myDateObj);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");

		String FormattedDate = myDateObj.format(myFormatObj);
		System.out.println("After Formatting : " + FormattedDate);
	}
}
