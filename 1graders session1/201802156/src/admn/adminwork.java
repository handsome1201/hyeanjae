package admn;

import java.util.Scanner;

public class adminwork {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int total,hour,minute,second;
	
		System.out.print("��ü �ʸ� �Է��Ͻÿ�.");
	    total=input.nextInt();

	    hour=total/3600;
	    
	    minute=(total%3600)/60;
	    		
	    second=((total%3600)%60);
		
	    System.out.print("��ü �ð��� "+hour+"�ð�"+minute+"��"+second+"���Դϴ�.");
}    
	}

