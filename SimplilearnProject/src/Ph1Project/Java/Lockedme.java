package Ph1Project.Java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lockedme {
	static String filePath = "D:\\SimpliLearnProject\\";

	// creating File
	public static void createFile(String fileName) throws IOException {

		ArrayList<String> al = new ArrayList<String>();

		System.out.println("Enter name to create File with name ");
		String finalname = filePath + fileName;

		File f = new File(finalname);
		boolean b = f.createNewFile();
		if (b != true) {
			System.out.println("File not created");

		} else {
			al.add(fileName);
			System.out.println("File created");
		}

		System.out.println("Your File is  " + al);
	}

	// to Delete

	public static void deleteFile(String fileName) {

		String finalfile = filePath + fileName;
		File file = new File(finalfile);
		file.delete();
		System.out.println("File deleted");

	}
	// To Search

	public static void searchFile(String searchFileName) {

		File f = new File(filePath);
		File filename[] = f.listFiles();
		int count = 0;
		for (File ff : filename) {

			if (ff.getName().equals(searchFileName)) {
				count++;
				break;
			} else {
				count = 0;
			}
		}
		if (count != 0) {
			System.out.println("You have " + searchFileName + " File :)");

		} else {
			System.out.println("File is not found");
		}
	}

	// To Display File List

	public static void displayFile() {

		File f = new File(filePath);
		File filename[] = f.listFiles();
		System.out.println("Your Files List");
		for (File ff : filename) {
			System.out.println(ff.getName());
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("Enter number to ");
			System.out.println("'1'To diplay Files,'2' To add file ,'3'To search file ,'4' To delete file,'5' To Exit");

			int i = scanner.nextInt();

			switch (i) {
			case 1:

				System.out.println("File Displaying");
				displayFile();
				System.out.println();
				break;
			case 2:
				System.out.println("Enter the File Name to Create");
				String FileForCreate = scanner.next();
				createFile(FileForCreate);
				System.out.println();
				break;

			case 3:
				System.out.println("Enter the File Name for Searching");
				String FileSearch = scanner.next();
				searchFile(FileSearch);
				System.out.println();
				break;
			case 4:
				System.out.println("Enter the File Name for Delete");
				String FileForDelete = scanner.next();
				deleteFile(FileForDelete);
				System.out.println();
				break;

			case 5:
				System.out.println("System Closed");
				b = false;
				break;
			default:
				System.out.println("Check u r choice");
				break;
			}
		}
	}

}
