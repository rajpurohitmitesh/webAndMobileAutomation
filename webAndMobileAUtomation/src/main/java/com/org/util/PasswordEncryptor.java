package com.org.util;

import java.security.CryptoPrimitive;
import java.util.Base64;
import java.util.Scanner;

public class PasswordEncryptor {
	Scanner sc = new Scanner(System.in);
	String plain;

	public void getEncrypt() {
		System.out.println("Enter password to get encrypted :");
		plain = sc.nextLine();
		byte[] encodedBytes = Base64.getEncoder().encode(plain.getBytes());
		System.out.println("Encrypted password :" + new String(encodedBytes));
	}
	
	public void getDecrypt() {
		System.out.println("Enter encrypted password to get decrypted :");
		plain = sc.nextLine();
		byte[] encodedBytes = Base64.getDecoder().decode(plain.getBytes());
		System.out.println("Decrypted password :" + new String(encodedBytes));
	}
	
	public static void main(String args[]) {
		PasswordEncryptor obj = new PasswordEncryptor();
	//	obj.getEncrypt();
	//	obj.getDecrypt();			
	}
	
	
	
}
