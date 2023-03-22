package customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class CustomerApplication {


	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		CustomerEntity customerEntity = new CustomerEntity();
		
		System.out.print("이름 : ");
		customerEntity.setName(scanner.nextLine());
		System.out.print("성별 : ");
		customerEntity.setGender(scanner.nextLine());
		System.out.print("주소 : ");
		customerEntity.setAddress(scanner.nextLine());
		System.out.print("전화번호 : ");
		customerEntity.setPhoneNumber(scanner.nextLine());
		System.out.print("마케팅 수신여부 : ");
		customerEntity.setMarketing(scanner.nextBoolean());
		System.out.print("개인정보 수집 동의여부 : ");
		customerEntity.setIndiInformation(scanner.nextBoolean());
		
		LocalDate currentDate = LocalDate.now();
		String createDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		System.out.println("사용자 UUID : " + customerEntity.getCustomerId());
		System.out.println("이름 : " + customerEntity.getName());
		System.out.println("성별 : " + customerEntity.getGender());
		System.out.println("생성날짜 : " + createDate);
		System.out.println("주소 : " + customerEntity.getAddress());
		System.out.println("전화번호 : " + customerEntity.getPhoneNumber());
		
		if(customerEntity.isMarketing() == true) {
			System.out.println("마케팅 수신여부 : o");
		}
		
		if(customerEntity.isMarketing() == false) {
			System.out.println("마케팅 수신여부 : x");
		}
		
		if(customerEntity.isIndiInformation() == true) {
			System.out.println("개인정보 수집 동의 여부 : o");
		}
		if(customerEntity.isIndiInformation() == false) {
			System.out.println("개인정보 수집 동의 여부 : x");
		}
		
		
	}
	
}