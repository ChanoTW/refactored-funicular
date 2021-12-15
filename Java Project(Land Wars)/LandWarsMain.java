import java.util.Random;
import java.util.Scanner;

public class LandWarsMain {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		final int player = 1;
		final int pc = 2;
		int playerMoney = 1000;
		int pcMoney = 1000;
		int playerPosition = 0;
		int pcPosition = 0;
		int diceCnt = 0;
		
		
		while(playerMoney > 0 && pcMoney > 0) {
			
			
			System.out.println("플레이어의 턴 입니다.");
			while(player == 1) {
				System.out.print("[1]주사위 굴리기 [2]정보 확인 [3]턴 종료 >>");
				int menu = sc.nextInt();
				
				if (menu == 1) {
		
					if(diceCnt == 0) {
						int dice1 = rd.nextInt(6)+1;
						int dice2 = rd.nextInt(6)+1;
						System.out.println("주사위의 합은 '" + (dice1+dice2) + "'입니다." );
						playerPosition += dice1+dice2;
						if(playerPosition<32){
							System.out.println("플레이어가 밟는 땅" + playerPosition);
						} else if (playerPosition>=32) {
							playerPosition -= 32;
							System.out.println("플레이어가 밟는 땅" + playerPosition);
						}
						diceCnt++;
						
						
						
					} else {
						System.out.println("주사위 던진 횟수를 초과했습니다.");
					}
					
				} else if (menu == 2) {
					
				} else if (menu == 3) {
					diceCnt--;
					break;
				}
			}
			
			System.out.println("PC의 턴 입니다.");
			while(pc == 2) {
				System.out.print("[1]주사위 굴리기 [2]정보 확인 [3]턴 종료 >>");
				int menu = sc.nextInt();
				
				if (menu == 1) {
		
					if(diceCnt == 0) {
						int dice1 = rd.nextInt(6)+1;
						int dice2 = rd.nextInt(6)+1;
						System.out.println("주사위의 합은 '" + (dice1+dice2) + "'입니다." );
						pcPosition += dice1+dice2;
						if(pcPosition<32){
							System.out.println("pc가 밟는 땅" + pcPosition);
						} else if (pcPosition>=32) {
							pcPosition -= 32;
							System.out.println("pc가 밟는 땅" + pcPosition);
						}
						diceCnt++;
					} else {
						System.out.println("주사위 던진 횟수를 초과했습니다.");
					}
					
				} else if (menu == 2) {
					
				} else if (menu == 3) {
					diceCnt--;
					break;
				}
			}
		}
		
		
		
	}
}
