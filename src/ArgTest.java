public class ArgTest {
	public static void main(String args[]){
		System.out.println( "Start Method 'PrintName'");
		PrintName("abc");
		PrintName("def");
		PrintName("");
		
		System.out.println( "---------------" );
		System.out.println( "Start Method 'ArgCalc'" );
		ArgCalc( 2,4,6);
	}
	
	public static void PrintName(String name){
		System.out.println( "Hello!," + name );
	}
	
	public static void ArgCalc(int x, int y, int z){
		System.out.println("x = " + x + " / y = " + y + " / z = " + z );
		System.out.println("------------------");
		System.out.println(" add(x+y+z) result is... " + (x + y + z));
		System.out.println(" div(x-y-z) result is... " + (x - y - z));
	}

}
