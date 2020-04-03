package com.jse.app;
import java.util.Random;
import java.util.Scanner;
//import com.jse.app.Member;//package com.jse.app; 있는
//public class Member.java 파일을 가져(읽어온것)


public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		RPSGame rpsGame = null;
		Dice dice = null;
		Calculator calculator = null;
		Member member = null;
//		Kaup kaup = new Kaup();
		Kaup kaup = null;
		while(true) {
		
			System.out.println("0. 종료 " 
							+ "1.회원가입 " 
							+ "2.로그인 " 
							+ "3.계산기 " 
							+ "4.가위바위보 게임" 
							+ "5. 주사위 홀짝 맞추기게임" 
							+ "6. 1부터 100까지의 합"
							+ "7. 몸상태 체크 ");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("회원가입");
					 System.out.println("아이디 입력");
					 String userid = scanner.next();
					 member.setId(userid);
					 
					 
			 break;
			 case 2:
				 System.out.println("로그인");
				 System.out.println("아이디 입력");
				 String id2 = scanner.next();
				 String returnId =member.getId();
				 System.out.println("로그인된 아이디:"+returnId);
				 if (id2.equals(returnId)) {
					 System.out.println("로그인 성공");
				 }else {
					 System.out.println("로그인 실패");
				 }
				 break;
			 case 3:
				 System.out.println("계산기");
				 System.out.println("첫번쨰 수 입력");
				 int a =scanner.nextInt();
				 calculator.setNum1(a);
				 System.out.println("두번쨰 수 입력");
				 int b =scanner.nextInt();
				 calculator.setNum2(b);
				 int c =calculator.calaculate();
				 System.out.println("두수의 합"+ c);
				 break;
			 case 4:
				 System.out.println("**가위바위보 게임**");
				 System.out.println("가위1, 바위2, 보3 을 입력하세요");
				 int user = scanner.nextInt();
				 System.out.println("사용자가 입력한 값:" +user);
				 rpsGame.setUserValue(user);
				 
				 int com = random.nextInt(3)+1;
				 System.out.println("컴퓨터가 입력한 값" + com);
				 rpsGame.setComputerValue(com);
				 String gameResult = rpsGame.game();
				 System.out.println(gameResult);
				 break;
			 case 5:
				 System.out.println("주사위 홀짝 맞추기 게임");
				 System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
				 int expect = scanner.nextInt();
				 System.out.println(String.format("사용자가 입력한값 : %s", expect));
				 dice.setExpect(expect);
				 int diceNumber = random.nextInt();
				 System.out.println(String.format("컴퓨터가 생성한 값: %d",diceNumber));
				 
				 dice.setdiceNumber(diceNumber);
				 String result =dice.switchdice();
				 System.out.println(result);
				 
				 
			
				
				 break;
			 case 6:
				 break;
			 case 7:
				 kaup = new Kaup();//kaup kaup = null; 일경우 즉 한번만 쓸때 적어야함
				 System.out.println("키 얼마에요?");
				 double height =scanner.nextDouble();
				 System.out.println(String.format("당신의 키:%s", height));
				
				 //
				 kaup.setHeight(height);
				 
				 System.out.println("당신의 몸무게:"+scanner.nextDouble());
				 
				 //
				 kaup.setWeight(weight);
				 double result1 = height/weight;
				 System.out.println("당신의 몸은"+ result1);
				
				 String result2 = kaup.doublekaup();
				 System.out.println(result2);
				 
				 
				 
			}

			
	}

		

	}
}

//while(true) 무한loop