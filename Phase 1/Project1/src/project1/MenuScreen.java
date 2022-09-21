package project1;

public class MenuScreen {
	public static void printWelcomeScreen(String appName, String developerName) {
		String applicationDetails = String.format("*****************************************************\n"
				+ " Welcome to %s \n" + " This application is developed by %s\n"
				+ "*****************************************************\n", appName, developerName);
		System.out.println(applicationDetails);

	}

	public static void displayMenu() {
		String menu = "\n Choose the Option number you like to perform: \n\n"
				+ "1.To return the current file names in Ascending order \n" + "2. Display menu for File operations\n"
				+ "3. Exit the Application\n";
		System.out.println(menu);
	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n Select any option number for File Operations \n\n" + "1. Add a file \n"
				+ "2. Delete a file \n" + "3. Search for a file \n" + "4. Show Main Menu\n";

		System.out.println(fileMenu);
	}
}