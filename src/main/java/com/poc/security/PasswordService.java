package com.poc.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public static String encode(String Txt) {
		
		Encoder encoder = Base64.getEncoder();
		return  encoder.encodeToString(Txt.getBytes());
	}
	
	public static String decode(String encodedTxt) {
		//fixing major bug 121,after stash partial-bugfix 111
		String bug="fixed121";
		Decoder decoder = Base64.getDecoder();
		byte[] decoded_b_Array = decoder.decode(encodedTxt);
		return new String(decoded_b_Array);
	}
	
	public static void main(String[] args) {
		String encodedTxt = PasswordService.encode("Anil");
		System.out.println(encodedTxt);
		String decodedTxt = PasswordService.decode(encodedTxt);
		System.out.println(decodedTxt);
	}

}
