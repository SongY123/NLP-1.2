package Segmetation;

import java.util.Scanner;


public class Main {
	public static void main(String[]args){
	Dictionary dict = new Dictionary("src//ce£¨ms-word£©.txt");
	while(true){
		System.out.println("Please input the sentence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		for(int i = 0,j = 1,ex_j = j;i<sentence.length()&&j<=sentence.length();){
			if(dict.findWord(sentence.substring(i,j))!=null)ex_j = j;
			if(j==sentence.length()){
				if(j==ex_j){
					System.out.print(sentence.substring(i,j)+"   ");
					break;
				}
				else{
					j = ex_j;
					System.out.print(sentence.substring(i,j)+"/");
					i = j;
					j++;
					ex_j = j;
				}
				continue;
			}
			if(dict.findExWord(sentence.substring(i,j))==null){
				if(dict.findWord(sentence.substring(i,j))!=null){
					//the dictionary contains the word
					System.out.print(sentence.substring(i,j)+"/");
					i = j;
					j = j+1;
					ex_j = j;
				}
				else{
					j = ex_j;
					System.out.print(sentence.substring(i,j)+"/");
					i = j;
					j++;
					ex_j = j;
				}
			}
			else j++;
		}
		System.out.println("");
	}

	}
}
