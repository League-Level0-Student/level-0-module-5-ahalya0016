package _06_for_loop_gauntlet;

public class For_loop_gauntlent {
public static void main(String[] args) {
	//for (int i = 0; i < 101; i++) {
		//System.out.println(i);
	//}
	
	
//NESTED FOR LOOPS:	
//NUMBER 1:
	/*for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
			System.out.println(i+" " +j);   
		}
	}*/
	
	/*for(int i = 1; i <8; i+=3) {
		String o = "";
	for (int j = i+1;j<i+3; j++) { 
o=o +  " " + j;
		
	}
	System.out.println(i + " " + o );
		}*/
	
	/*for(int i = 1; i <100; i+=10) {
	String o = "";
for (int j = i+1;j<i+10; j++) { 
o=o +  " " + j;
	
}
System.out.println(i + " " + o );
	}*/
	
String o = "";
	for(int i=1; i<7;i+=1) {
		for(int j = i+1; j<i+2; j++) {
		o=o + " " + j;
}

System.out.println(i + "" + 0);
	}


}

}

