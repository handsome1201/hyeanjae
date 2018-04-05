package admn;

import java.util.Scanner;

public class adminwork {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int total,hour,minute,second;
	
		System.out.print("전체 초를 입력하시오.");
	    total=input.nextInt();

	    hour=total/3600;
	    
	    minute=(total%3600)/60;
	    		
	    second=((total%3600)%60);
		
	    System.out.print("전체 시간은 "+hour+"시간"+minute+"분"+second+"초입니다.");
}    
	}

