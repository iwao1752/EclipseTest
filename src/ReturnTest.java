public class ReturnTest {
    public static void main(String args[]){
    	int result;
    	
    	result = ReturnVal(1234567, 7654321);
    	System.out.println( result );
    }    	
  	private static int ReturnVal(int x , int y){
   		return x * y;
    }
}
