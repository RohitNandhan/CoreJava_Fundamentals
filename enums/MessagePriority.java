package enums;

import java.util.Scanner;

public class MessagePriority {
public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Please, enter message type to check it priority: ");
				String userInput = sc.next();

				if (isValidMessageType(userInput)) {
					
					System.out.println(Types.valueOf(userInput).getPriority());
//					switch(userInput){
//					    case "A":
//					        System.out.println(Priority.HIGH);
//					        break;
//					    case "B":
//					        System.out.println(Priority.MEDIUM);
//					         break;
//					    case "C":
//					        System.out.println(Priority.LOW);
//					         break;
//					    case "D":
//					        System.out.println(Priority.LOW);
//					         break;
//					}
					break;
				} else {
					System.out.println("Please, enter valid "
							+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
					continue;
				}

			}

		}

		private static boolean isValidMessageType(String userInput) {
		    for(MessageType mes:MessageType.values()){
			if(mes.toString().equals(userInput)){
			    return true;
			} 
		}return false;

	}
	}

