package project1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import project1.operation;

public class operation {
	public static void handleWelcomeScreenInput() {
		File folder = new File("C:\\Users\\HP\\Desktop\\test");
		folder.mkdirs(); // Created a Directory named Project and inside it created a main folder
		Scanner scan = new Scanner(System.in);

		while (true) {

			MenuScreen.displayMenu();
			int input = scan.nextInt();

			switch (input) {
			case 1:

				File arr[] = folder.listFiles();
				Arrays.sort(arr);

				for (File s : arr) {
					System.out.println(s.getName());
				}
				break;

			case 2:
				Boolean temp = true;
				while (temp) {

					MenuScreen.displayFileMenuOptions();

					int choice2 = scan.nextInt();

					switch (choice2) {
					case 1:

						System.out.println("Enter a file name");
						String name = scan.next();
						if (new File(folder, name).exists()) {
							System.out.println("file already exist");
						} else {
							File folder1 = new File(folder, name);
							folder1.mkdir();
							if (new File(folder, name).exists()) {
								System.out.println("file added successfully");
								
	
						}
						}

						break;

					case 2:
						System.out.println("Enter a file name");
						String name1 = scan.next();
						boolean folder2 = new File(folder, name1).exists();
						System.out.println(folder2);
						if (folder2 == true) {
							File folder3 = new File(folder, name1);
							folder3.delete();
							System.out.println("File successfully deleted");
						} else {
							System.out.println("file does not exist");
						}
						/* folder2.delete(); */
						break;

					case 3:
						System.out.println("Enter a keyword to search");
						String search = scan.next();

						File arr1[] = folder.listFiles();
						for (int a = 0; a < arr1.length; a++) {
							if (arr1[a].getName().startsWith(search)) {
								System.out.println(arr1[a]);
							} else {
								System.out.println("No file found");
							}
						}
						break;

					case 4:

						temp = false;
						break;

					
					default:
						System.out.println("Input correct value and retry");

					}

				}
				break;

			case 3:
				System.out.println("Closing the Application");
				System.exit(0);

			default:
				System.out.println("Input correct value and retry");
				break;

			}
		}
	}

}
