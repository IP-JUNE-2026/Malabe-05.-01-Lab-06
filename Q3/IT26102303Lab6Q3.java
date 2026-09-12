import java.util.Scanner;
     
public class IT26102303Lab6Q3{
    
	public static void main(String args[]) {
	
	    int number;
	    double meanOfSquare, rms;
	
	    double sumOfSquare = 0;
        int count = 0;
		
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter positive integers(terminate input with -99):");
	 
	 while(true){
	 System.out.print("Enter a number:");
	 number= input.nextInt();
	 
	 if(number == -99) {
	  break;
	 }
	 
	 if(number > 0){
	 sumOfSquare += Math.pow(number,2);
	 
	 count++;
	 
	 } else{ 
	 
	  System.out.println("Invalid input please input positive integer or -99 to terminate");
	  
	  }
	}
	
	if(count > 0){
	 meanOfSquare = sumOfSquare/count;
	 rms = Math.sqrt(meanOfSquare);
	 System.out.println("The Root Mean Square (RMS) is: " +rms);
	  
	 } else {
	   System.out.println("No valid numbers were entered to calculate rms.");
	   
	    	 }
	  
	    }
		
	}
     
	 
	 