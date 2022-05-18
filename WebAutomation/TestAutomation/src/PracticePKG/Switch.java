package PracticePKG;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class Switch {

	public static void main(String[] args) {
		
		String marks="Yellow";
		
		switch(marks){
		
		case "Green": 
			System.out.println("C Grade");
			break;
		case "Yellow":
			System.out.println("B Grade");
			break;
		case "Red":
			System.out.println("A Grade");
			break;
			default:
		System.out.println("Sorry Failed");
			
			
		
		}

	}

}
