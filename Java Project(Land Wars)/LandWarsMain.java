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
			
			
			System.out.println("�÷��̾��� �� �Դϴ�.");
			while(player == 1) {
				System.out.print("[1]�ֻ��� ������ [2]���� Ȯ�� [3]�� ���� >>");
				int menu = sc.nextInt();
				
				if (menu == 1) {
		
					if(diceCnt == 0) {
						int dice1 = rd.nextInt(6)+1;
						int dice2 = rd.nextInt(6)+1;
						System.out.println("�ֻ����� ���� '" + (dice1+dice2) + "'�Դϴ�." );
						playerPosition += dice1+dice2;
						if(playerPosition<32){
							System.out.println("�÷��̾ ��� ��" + playerPosition);
						} else if (playerPosition>=32) {
							playerPosition -= 32;
							System.out.println("�÷��̾ ��� ��" + playerPosition);
						}
						diceCnt++;
						
						
						
					} else {
						System.out.println("�ֻ��� ���� Ƚ���� �ʰ��߽��ϴ�.");
					}
					
				} else if (menu == 2) {
					
				} else if (menu == 3) {
					diceCnt--;
					break;
				}
			}
			
			System.out.println("PC�� �� �Դϴ�.");
			while(pc == 2) {
				System.out.print("[1]�ֻ��� ������ [2]���� Ȯ�� [3]�� ���� >>");
				int menu = sc.nextInt();
				
				if (menu == 1) {
		
					if(diceCnt == 0) {
						int dice1 = rd.nextInt(6)+1;
						int dice2 = rd.nextInt(6)+1;
						System.out.println("�ֻ����� ���� '" + (dice1+dice2) + "'�Դϴ�." );
						pcPosition += dice1+dice2;
						if(pcPosition<32){
							System.out.println("pc�� ��� ��" + pcPosition);
						} else if (pcPosition>=32) {
							pcPosition -= 32;
							System.out.println("pc�� ��� ��" + pcPosition);
						}
						diceCnt++;
					} else {
						System.out.println("�ֻ��� ���� Ƚ���� �ʰ��߽��ϴ�.");
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
