package arrayListProject;
import java.util.Scanner;
import java.util.ArrayList;
public class arrayListProject {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("----Menu----");
			System.out.println("1:----Add Task----");
			System.out.println("2:----View Task----");
			System.out.println("3:----Remove Task----");
			System.out.println("4----Exit---");
			System.out.println("Which operation to perform?");
			int choice = scnr.nextInt();
			scnr.nextLine();//Consume
			
			switch(choice) {
			
			case 1:
			System.out.println("Enter Task = ");
			String task = scnr.nextLine();
			tasks.add(task);
			System.out.println("Task Added");
			break;
			case 2:
				if(tasks.size() == 0) {
					System.out.println("Your list is empty");
				}else {
					System.out.println("Your Tasks");
					for(int i = 0; i < tasks.size(); i++) {
						System.out.println(tasks.get(i));
				}
				
			}
			break;
			case 3:
			System.out.println("Enter Number Of Task You Want To Delete");
			int index =  scnr.nextInt();
			index = index - 1;
			if(index < 0 || index > tasks.size()) {
				System.out.println("Invalid Input");
			}else {
				tasks.remove(index);
				System.out.println("Task Is Deleted");
			}
			
			break;
			case 4:
			isTrue = false;
			System.out.println("Task exited successfully, goodbye!");
			break;
			default:
			System.out.println("Invalid Input");
			}
			
			
			
		}
		
	}
}
