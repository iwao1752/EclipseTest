
public class ArrayTest {
	public static void main(String args[]){
	    int n[] = {1,2,3,4,5,6,7,8,9};
	    System.out.println(n[0]);
	    System.out.println(n[1]);
	    System.out.println( "--------------");
	    System.out.println( "array's length is " + n.length );
	    System.out.println( "--------------");
	    
	    for(int i = 0; i < n.length; i++){
	    	System.out.println( "n[" + i + "]-->" + n[i]);
	    }
	    System.out.println( "--<extended ForLoop statement>--");
	    for(int i : n){
	    	System.out.println( "array n[" + (i-1) + "]-->" + i );
	    }
    }
}
