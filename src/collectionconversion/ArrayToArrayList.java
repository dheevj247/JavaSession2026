package collectionconversion;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"Samsung", "Nokia", "Apple"};
		ArrayList<String> mobileArrayList = toList(strArray); //method call statement
		System.out.println(mobileArrayList);
	}
	
	//modifier accessmodifier returnType methodName(parameter)
	public static ArrayList<String> toList(String[] str){
		ArrayList<String> arrList = new ArrayList<String>();
		for(int i=0;i<str.length;i++) {
			arrList.add(str[i]);
		}
		return arrList;
	}

}
