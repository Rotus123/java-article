package article;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		while(true) {
			System.out.printf("명령어 : ");
			String command = sc.nextLine();
			command = command.trim();
			
			if(command.equals("exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
				} else if(command.equals("article list")) {
					System.out.println("게시물이 없습니다.");
					
				} else if(command.equals("article write")) {
					int id = lastArticleId +1;
					lastArticleId = id;
					System.out.printf("제목 : ");
					String title = sc.nextLine();
					
					System.out.printf("내용 : ");
					String body = sc.nextLine();		
					
					System.out.printf("%d번째 게시물이 생성되었습니다.%n", lastArticleId);
					
				} else {
					System.out.println("존재하지 않는 명령어입니다.");
					
				}
			}
		
	}
}