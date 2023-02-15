

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new Scanner(System.in);
		
		int lastArticleID = 0;
		List<Article> articles = new ArrayList<>();
		
		while(true) {
			System.out.print("명령어 )");
			String command = sc.nextLine();
			
			if (command.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			if(command.equals("system exit")) {
				break;
			}
			
			if (command.equals("article list")) {
				if(articles.size() == 0) {
				System.out.println("게시글이 없습니다");
			}else {
				System.out.println("게시글 있음");
			}
				
			}else if (command.equals("article write")) {
				int id = lastArticleID + 1;
				System.out.printf("제목:");
				String title = sc.nextLine();
				System.out.printf("내용:");
				String body = sc.nextLine();
				
				System.out.printf("%s / %s ", title, body);
				
				Article aticle = new Article(id , title, body);
				articles.add(aticle);
				
				System.out.println(System.lineSeparator() + (lastArticleID + 1) + "번 글이 생성되었습니다");
				lastArticleID++;
				
				
				
			}
				
//			else if (command.equals("article list")) { 
//				System.out.printf("번호 / 제목" + System.lineSeparator() );
//				System.out.printf("2 /" + title);
//				System.out.printf("1 /" + title);
//			}
//			
			

//			else if(command.equals("article list")) {
//				System.out.println("게시글이 없습니다");
//			}
			
			else { 
				System.out.println("존재하지 않는 명령어 입니다");
			}
			
		}
		 System.out.println("==프로그램 끝==");
		 
		 sc.close();
		 
    }
}
class Article {
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
//		System.out.println("제목: article" + System.lineSeparator() + "내용: write");
//		
//		System.out.println(System.lineSeparator() + "1번글이 생성되었습니다");
//		
//		while (true) {
//			System.out.println("명령어 )");
//			String command = sc.nextLine();
//			if(command.equals("article write")) {
//				break;
//			}
//			
//		}
//		
//		System.out.println("제목: article2" + System.lineSeparator() + "내용: write2");
//		
//		System.out.println(System.lineSeparator() + "2번글이 생성되었습니다");
//		
//		while (true) {
//			System.out.println("명령어 )");
//			String command = sc.nextLine();
//			if(command.equals("system exit")) {
//				break;
//			}
//			else {
//				System.out.println("존재하지 않는 명령어 입니다");
//			}
//		}
//		System.out.println("==시스템 종료==");
//		
//		sc.close();


