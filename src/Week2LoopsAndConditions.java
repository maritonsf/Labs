
public class Week2LoopsAndConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age = 14;
      System.out.println(age >= 16);
      age = 19;
      System.out.println(age >= 16);
      Boolean hasLicense = true;
      
      
      if (age >= 16 && hasLicense) {
    	  System.out.println("You can drive.");
      } else {
    	  System.out.println("You cannot drive.");
      }
      
      double costOfMilk = 1.50;
      int thirstLevel = 4;
      
      if (costOfMilk < 2.50 || thirstLevel > 6) {
    	  System.out.println( "Milk Please!");
      }else {
    	  System.out.println("No Thanks.");
      }
      
      int numberOfCookies = 2;
      int numberOfChildren = 2;
      
      if (numberOfCookies % numberOfChildren > 5) {
    	  System.out.println("Jackpot!");
      }else if (numberOfCookies % numberOfChildren >= 2) {
    	  System.out.println("WooHoo!");
      }else if (numberOfCookies % numberOfChildren > 0) {
    	  System.out.println("Yes!");
      }else  {
    	  System.out.println("Sad Face");
      }
      
      
      String loyaltyMemberStatus = "Gold";
      Double loyaltyMemberDiscount = 0.0;
      
      switch(loyaltyMemberStatus) {
      	case "Silver":
    	  loyaltyMemberDiscount = 0.1;
    	  break;
      	case "Gold":
      		loyaltyMemberDiscount = 0.15;
      		break;
      	case "Platinum":
      		loyaltyMemberDiscount = 0.25;
      		break;
       }
    System.out.println("Your discount is" + " " +loyaltyMemberDiscount);
    
    double billTotal = 600;
    double adjustedTotal= billTotal - billTotal * loyaltyMemberDiscount;
    if (adjustedTotal > 500) {
    	if (loyaltyMemberStatus == "Silver") {
    		loyaltyMemberStatus = "Gold";
    	}else if (loyaltyMemberStatus == "Gold") {
    		loyaltyMemberStatus = "Platinum";
    	}
    }
    System.out.println(loyaltyMemberStatus);
    
    String username = "Tommy123";
    String password = "12345";
    
    if (username.equals("Tommy123") && password.equals("12345")) {
    	System.out.println("Login Successful");
    }else {
    	System.out.println("Access Denied");
    }
    
	
   
	
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
	
	for (int i = 10; i >= 0; i--) {
		System.out.println(i);
		}
	
	for (int i = 0; i <=100; i++) {
		if (i % 2 == 0 ) {
			System.out.println("even");
			}else {
				System.out.println("odd");
			}
	}
	
	int i = 100;
	while (i > 0) {
		System.out.println(i + " " + (i % 3));
		i--;
	}
	
	}
	}
