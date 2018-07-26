package com.tj.ex2;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.tj.ex2.dto.RegisterMember;
import com.tj.ex2.service.ChangePwService;
import com.tj.ex2.service.ListPrintService;
import com.tj.ex2.service.MemberInsertService;

public class MainClass {
	private static AbstractApplicationContext ctx; // 공유할 bean 객체 변수
	
	public static void main(String[] args) {
		String location = "classpath:applicationCTX.xml";
		ctx = new GenericXmlApplicationContext(location);
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("명령1 : exit/EXIT");		
			System.out.println("명령2 : new 메일 이름 암호 확인용암호");		
			System.out.println("명령3 : change 메일 현암호 새암호");		
			System.out.println("명령4 : list");
			System.out.println("원하는 명령은? ");
			
			String service = sc.nextLine(); 
			
			if (service.equalsIgnoreCase("exit")) {
				
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else if (service.startsWith("new ")) {
				
				processInsert(service.split(" "));
				
			} else if (service.startsWith("change ")) {
				
				processChange(service.split(" "));
				
			} else if (service.startsWith("list")) {
				
				processList();
				
			}
			// if
		}// while
		sc.close();
	} // main()

	private static void processList() {
		// 가입된 회원 모두 출력 하는 listPrint() 를 호출
		ListPrintService listPrintService = ctx.getBean("listService", ListPrintService.class);
		listPrintService.printAll();
	}

	private static void processChange(String[] split) {
		// 명령3 :slite[0] =  change  slite[1] = 메일  slite[2] = 현암호 slite[3] = 새암호
		if (split.length != 4) {
			System.out.println("명령 형식이 바르지 않아요.");
			return;
		}
		// Change 서비스를 이용하여 splite[1] 에서 암호를 변경한다.
		ChangePwService changeService = ctx.getBean("changeService", ChangePwService.class);
		int result = changeService.changePw(split[1], split[2], split[3]);
		
		System.out.println(result == 1 ? "수정 성공" : "수정 실패");
	}

	private static void processInsert(String[] split) {
		// slite[0] = new splite[1] = mail splite[2] = 이름 splite[3] = 암호 splite[4] 확인용
		if (split.length != 5) {
			System.out.println("명형 형식이 바르지 않아요.");
			return;
		} 
		// MemberInsert 서비스 이용하여 splite[1] splite[2] splite[3] insert
		MemberInsertService insertService = ctx.getBean("insertService", MemberInsertService.class);
		RegisterMember registermember = new RegisterMember(split[1], split[2], split[3], split[4]);
		
		int result = insertService.insert(registermember);
		
		if (result == 1) {
			System.out.println("멤버 가입성공");
		} else {
			System.out.println("멤버 가입실패");
		}
		
	}

}
