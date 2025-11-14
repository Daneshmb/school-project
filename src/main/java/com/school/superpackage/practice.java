package com.school.superpackage;

public class practice {

	public static void main(String[] args) {
		String str="JaVa";
		StringBuilder upper=new StringBuilder();
		StringBuilder lower=new StringBuilder();
		for(char ch:str.toCharArray()){
			if(Character.isLowerCase(ch)) {
				upper.append(ch);
			}else {
				lower.append(ch);
			}
			
		}System.out.println(upper);
		System.out.println(lower);
}}