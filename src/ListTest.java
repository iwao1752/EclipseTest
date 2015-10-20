import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args){
    	// リスト変数の初期化
    	ArrayList<String> array = new ArrayList<String>();
    	
    	String[] name = {"aaa","bbb","ccc","ddd","eee"};

		System.out.println("output name's value");
    	for( String n : name){
    		System.out.println(n);
    	}
    	System.out.println("---finished---");
    	
    	// arrayにnameの値を格納
    	for( int i = 0; i < name.length; i++){
    		// arrayの中身を出力
    		array.add(name[i]);
    		System.out.println(array.size());
    	}
    	
    	//　arrayにnameの格納を値し、それぞれの値を出力する
    	for(int j = 0; j < name.length; j++){
    		array.add(name[j]);
    		System.out.println(array.get(j));
    	}
    }
}
