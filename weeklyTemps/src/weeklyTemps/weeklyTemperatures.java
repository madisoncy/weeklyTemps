package weeklyTemps;

import java.util.Scanner;
import java.util.ArrayList;

public class weeklyTemperatures {

	public static void main(String[] args) {
		
		ArrayList<String> dayName = new ArrayList<>();
		ArrayList<Integer> dayTemp = new ArrayList<>();
		
		// Add days of week
		dayName.add("Monday");
		dayName.add("Tuesday");
		dayName.add("Wednesday");
		dayName.add("Thursday");
		dayName.add("Friday");
		dayName.add("Saturday");
		dayName.add("Sunday");
		
		// Add temperatures
		dayTemp.add(60);
		dayTemp.add(57);
		dayTemp.add(65);
		dayTemp.add(67);
		dayTemp.add(61);
		dayTemp.add(54);
		dayTemp.add(58);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a day of the week, if weekly average is desired please enter week: ");
		String weekDay = scanner.nextLine();
		scanner.close();
		
		int weekDayIndex = dayName.indexOf(weekDay);
		
		if (weekDayIndex != -1) {
			System.out.println("The temperature of " + dayName.get(weekDayIndex) + " is " + dayTemp.get(weekDayIndex) + " degrees fahrenheit.");
		}else if (weekDay.equals("week")) {
			int weeklyTempAverage = 0;
			// Use of enhanced loop
			for (Integer dayTemps : dayTemp) {
				weeklyTempAverage += dayTemps;
			}
			weeklyTempAverage /= dayTemp.size();
			System.out.println("The average weekly temperature is " + weeklyTempAverage + " degrees fahrenheit.");
		}else {
			System.out.println("Invalid entry, please try again.");
		}
	}

}
