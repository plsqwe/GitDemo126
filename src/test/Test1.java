package test;

public class Test1 {
	public static void main(String[] args) {
	
		
		int score = 75;
		
		char grade = ' ';
		
		if ((score > 100) || (score < 0)) {
			System.out.println(score + "은(는)잘못된 점수입니다.");
		}
		else {
			if (score >= 90){
				grade = 'A';
		}
			else if (score >= 80) {
				grade = 'B';	
		}
			else if (score >= 70) {
				grade = 'C';
		}
			else if (score >= 60) {
				grade = 'D';
		}
			else {
				grade = 'F';
		}
	
		System.out.println("점수 : " + score + "," + " 학점 : " + grade );
		} //else

	}
}
