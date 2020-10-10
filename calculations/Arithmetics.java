package calculations;

public class Arithmetics {
		int num1,num2;
		
		
	void add() {
		System.out.println("The Addition of Two Numbers is :" +(num1+num2));
		
	}
	
	void sub() {
		System.out.println("The Subtraction of Two Numbers is :" + (num1-num2));
		
	}
	
	void mul() {
		System.out.println("The Multiplication of Two Numbers is :" + (num1*num2));
		
	}
	
	void div() {
		System.out.println("The Division of Two Numbers is :" + (num1/num2));
		
	}

	void findPrime(int num) {
		 int i,j=0,flag=0;        
		        
		  if(num==0||num==1){
			  
		   System.out.println(num+" is not prime number");      
		  }
		  else{ 
			  j=num/2;
			  
		   for(i=2;i<=j;i++){ 
			   
		    if(num%i==0){   
		    	
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is a prime number"); }  
		  }
	}

}
