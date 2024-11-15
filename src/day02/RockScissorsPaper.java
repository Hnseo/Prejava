package day02;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		System.out.println("=== 가위, 바위, 보 게임 ===");
		System.out.println("게임을 시작하겠습니다.");
		System.out.println("당신은 무엇을 내겠습니까?");
		System.out.println("(1. 가위, 2. 바위, 3.보)");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println("선택 :" + number);
		System.out.println("당신은 이겼습니다");
		
		// === 가위, 바위, 보 게임 ===
		// 게임을 시작하겠습니다.
		// 당신은 무엇을 내겠습니까?
		// (1. 가위, 2. 바위, 3.보)
		// 선택 : 2
		// 당신은 이겼습니다
		// === 가위, 바위, 보 게임 ===
		// 게임을 시작하겠습니다.
		// 당신은 무엇을 내겠습니까?
		// (1. 가위, 2. 바위, 3.보)
		// 선택 : 1
		// 당신이 졌습니다
		// === 가위, 바위, 보 게임 ===
		// 게임을 시작하겠습니다.
		// 당신은 무엇을 내겠습니까?
		// (1. 가위, 2. 바위, 3.보)
		// 선택 : 3
		// 당신은 비겼습니다
		

	}

}
