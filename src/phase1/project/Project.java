package phase1.project;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Project {
	void details() {
		System.out.println("---Project Details---");
		System.out.println("Developer :  Rajamuri Pavan Kumar Reddy");
		System.out.println("Project :  Lockers Pvt. Ltd.");
		System.out.println();
		
	}
	void projectOptions() {
		System.out.println("--Project Options--");
		System.out.println("1.List Files");
		System.out.println("2.Options");
		System.out.println("3.Exit Application");
		System.out.println();
		System.out.println("Select an option");
	}

	public static void main(String[] args) {
		Project project=new Project();
		project.details();
		project.projectOptions();
		Scanner sc=new Scanner(System.in);
		int input=0;
		int subInput=0;
		if(sc.hasNext() && sc.hasNextInt()) {
			input=sc.nextInt();
			System.out.println("Selected Option is "+input);
		}
		if(input ==3) {
			return ;
		}
		
		if(input ==2) {
			System.out.println("1.Add a File");
			System.out.println("2.Delete a File");
			System.out.println("3.Search a File");
			System.out.println("4.Main Menu");
			if(sc.hasNext() && sc.hasNextInt()) {
				subInput=sc.nextInt();
				if(subInput == 4) {
					project.projectOptions();
				}else if (subInput == 1) {
					System.out.println("Enter the file to be added");
					if(sc.hasNext()) {
					String fileName=sc.next();
					File file = new File(fileName);
					System.out.println("File name "+fileName);
					try {
						boolean value=file.createNewFile();
						if(value) {
							System.out.println("File Created with name "+fileName);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
				}else if(subInput == 2) {
					System.out.println("Enter the file to be deleted");
					if(sc.hasNext()) {
					String toBeDeletedFile =sc.next();
					File file = new File(toBeDeletedFile);
						boolean value=file.delete();
						if(value) {
							System.out.println("File Deleted");
						}
					}

				}
				else if(subInput == 3) {
					System.out.println("Enter the file to be searched");
					if(sc.hasNext()) {
					String toBeDeletedFile =sc.next();
					File file = new File(toBeDeletedFile);
						boolean value=file.exists();
						if(value) {
							System.out.println("File exists");
						}else {
							System.out.println("File doesn't exists");
						}
					}

				}

			}
			return;
		}
		
		if(input ==1 ) {
			File files = new File("C:\\Users\\USER\\eclipse-workspace\\JavaProject");
			String[] pathNames=files.list();
			System.out.println("Files List");
			for(String path:pathNames) {
				System.out.println(path);
			}
		}
		
		
	}

}
