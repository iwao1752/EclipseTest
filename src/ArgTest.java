public class ArgTest {
	public static void main(String args[]){
		PrintName("abc");
		PrintName("def");
		PrintName("");
	}
	
	public static void PrintName(String name){
		System.out.println( "Hello!," + name );
	}

}
