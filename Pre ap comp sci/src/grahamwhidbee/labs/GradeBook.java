package grahamwhidbee.labs;

import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		double finalGrade2, testGrades2, dailyGrades2, majorTestGrade2, quizGrades2, finalGrade1, dailyGradeCount, dailyGrades, quizGrades, testGrades, testGradeCount, majorTestGrade, quizWeight, dailyWeight, testWeight, majorTestWeight, majorTestCount, quizCount;
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		
		finalGrade2 = 0;
		quizWeight = .30;
		dailyWeight = .15;
		testWeight = .55;
		majorTestWeight = .15;
		quizGrades = 0;
		majorTestGrade = 0;
		dailyGrades = 0;
		testGrades = 0;
		quizCount = 0;
		quizGrades2 = 0;
		majorTestGrade2 = 0;
		dailyGrades2 = 0;
		testGrades2 = 0;
		
		//Quiz grade calculations
			System.out.println("How many quiz grades will you enter");
			quizCount = keyboard.nextInt();
			for(count=0; count < quizCount; count++)
			{
				System.out.println("Enter quiz grade");
				quizGrades2 = keyboard.nextDouble();
				quizGrades = quizGrades2+quizGrades;
			}
			quizGrades = quizGrades/quizCount;
			System.out.println("grade for the quizzes " + quizGrades);
		
			
			
		//Major grade calculations
			System.out.println("How many Major grade grades will you enter");
			majorTestCount = keyboard.nextInt();
			for(count =0; count < majorTestCount; count++)
			{
				System.out.println("Enter major test grade grade");
				majorTestGrade2 = keyboard.nextDouble();
				majorTestGrade = majorTestGrade2+majorTestGrade;
			}
			majorTestGrade = majorTestGrade/majorTestCount;
			System.out.println("grade for the major test " + majorTestGrade);
			
			
			
		//Daily Grade calculations
			System.out.println("How many Daily grades will you enter");
			dailyGradeCount = keyboard.nextInt();
			for(count =0; count < dailyGradeCount; count++)
			{
				System.out.println("Enter daily grade grade");
				dailyGrades2 = keyboard.nextDouble();
				dailyGrades = dailyGrades+dailyGrades2;
			}
			dailyGrades = dailyGrades/dailyGradeCount;
			System.out.println("Daily grades average to " + dailyGrades);
			
			
			
		//Test grade calculations
			System.out.println("How many Test grades will you enter");
			testGradeCount = keyboard.nextInt();
			for(count =0; count < testGradeCount; count++)
			{
				System.out.println("Enter quiz grade");
				testGrades2 = keyboard.nextDouble();
				testGrades = testGrades2+testGrades;
			}
			testGrades = testGrades/testGradeCount;
			System.out.println("Daily grades average to " + testGrades);
			
		finalGrade2 = (quizGrades*quizWeight)+(dailyGrades*dailyWeight)+(testGrades*testWeight);
		System.out.println("The adverage of the dg, q and t are " + finalGrade2);
		finalGrade1 = (quizGrades*quizWeight)+(dailyGrades*dailyWeight)+(testGrades*testWeight)+(majorTestGrade*majorTestWeight);
		finalGrade1 = Math.round(finalGrade1);
		System.out.println("Nine weeks average is " + finalGrade1);
		System.out.println("Major test grade was " + majorTestGrade);
		if (finalGrade1>=90){
			
		}
	}

}
