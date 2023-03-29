package homeWork;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.event.SwingPropertyChangeSupport;

public class DictionarySystem {

 private Dictionary d = new Dictionary();
private Scanner scanner;
private boolean systemOn;

		
			
public void printMenu() {
	System.out.println();
	System.out.println("Add Entry..........add");
	System.out.println("Find Word..........find");
	System.out.println("Edit Entry..........edit");
	System.out.println("Delete Entry..........delete");
	System.out.println("Show All Entry Words..........all");
	System.out.println("Exit..........x");
	System.out.println("Enter Your Choice");
}

	
public void start() {
//	d = new Dictionary();
	scanner = new Scanner(System.in);
	systemOn = true;
	
	while(systemOn) {
		try {
	
		printMenu();
		
	String input = scanner.nextLine();
	switch (input) {
	case "add": 
		doAdd();
		break;	
	case "find": 
		doFind();
		break;	
		case "edit": 
			doEdit();
			break;	
		case "delete": 
			doDelete();
			break;	
			case "all": 
				doAll();
				break;	
			case "x":
				systemOn = false;
			break;	
	default:
		System.out.println("error");
		break;
	}
		}	catch(DictionaryException e) {
			System.out.println("error "+ e.getMessage());
		}
		}scanner.close();
		System.out.println("Bye");
		}
		
		
		
	private void doAdd() throws DictionaryException{
		System.out.print("enter the word to add");
		 String str = scanner.nextLine();
		 System.out.print("enter the definition");
		 String st = scanner.nextLine();
		 d.addEntry(str, st);
		 System.out.println("word added successfully");
	}
		
	private void doFind() {
		System.out.print("enter the word to find");
		 String str = scanner.nextLine();
		 String st = d.getDefinition(str);
		 if (st!=null) {
			 System.out.println(str + " definition: " + st);
		 }else {
			  System.out.println(str + " word not found");
	}	
	}	 
		 
		 private void doEdit() throws DictionaryException{
				System.out.print("enter the word to edit");
				 String str = scanner.nextLine();
				 System.out.print("enter the definition");
				 String st = scanner.nextLine();
				 d.editEntry(str, st);
				 System.out.println("word edit successfully" + str + " " + st);
			}	
		
		 private void doDelete(){
				System.out.print("enter the word to delete");
				 String str = scanner.nextLine();
				
					 d.deleteEntry(str);
				//	 System.out.println(str + " delete");
			//	 }else {
			//		 System.out.println("Entry not delete - wotd not found");
			//	 }	
		 }	
		
		
		
		 private void doAll() {
				Set<String> words= d.getAllEntriesSorted();
				for (String word : words) {
					System.out.println(word);
				}
			}	





// try
// {
//		d.addEntry(str, st);
//	} catch (Exception e) {
// throw new DictionaryException("the word is writed");

// }

// try {
// if (str.equals(d.map.keySet())) {

// d.editEntry(str, st);
//}
// } catch (Exception e) {
// throw new DictionaryException("the word is writed");

// }

}
