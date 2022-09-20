package com.email.main;

import com.email.model.Employee;	
import java.util.Scanner;

import com.email.service.CredentialService;

public class CredentialApp {
	
	public static void main(String[] args) {
		
		Employee employee=new Employee("Arun","Kumar");
		CredentialService credentialService=new CredentialService();
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		
		if(option==1)  {
			generatedEmail=credentialService.generateEmailAddress(employee.getfirstName(),employee.getLastName,"tech");
			generatedPwd=credentialService.generatePassword();
		}else if(option==2) {
			generatedEmail=credentialService.generateEmailAddress(employee.getfirstName(),employee.getLastName,"adm");
			generatedPwd=credentialService.generatePassword();
						
		}else if(option==3) {
			generatedEmail=credentialService.generateEmailAddress(employee.getfirstName(),employee.getLastName,"hr");
			generatedPwd=credentialService.generatePassword();
				
		}else if(option==4)	{
			
			generatedEmail=credentialService.generateEmailAddress(employee.getfirstName(),employee.getLastName,"lg");
			generatedPwd=credentialService.generatePassword();	
		}else {
			System.out.println("Enter a vaid option");
			scanner.close();
			System.exit(-1);
		}
		generatedPwd=credentialService.generatePassword();
		credentialService.showCredentials(employee.getFirstName(),generatedEmail,generatedPwd);
		scanner.close();
		
	}

}
