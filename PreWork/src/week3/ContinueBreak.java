package week3;

public class ContinueBreak {

	public static void main(String[] args) {
		
     int a = 1;
     
     for(;;a++) {
    	 
    	if(a%2!=0)continue;
    	 
    	else if (a>20)break;
    	System.out.println(a);
     }
	}

}
