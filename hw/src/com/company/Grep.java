package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Grep{
    public static void main(String[] args) {
    	StringBuilder arguments=new StringBuilder();
    	for(int i=0;i<args.length-1;i++){
    		arguments.append(args[i]);
    		arguments.append(",");
		}
    	arguments.append(args[args.length-1]);
		System.out.println("Будем искать строки,в которых есть словa " + arguments.toString());
		StringBuilder str ;
		ArrayList words = new ArrayList();
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Введите строку или 0,если хотите закончить ввод.");
			str = new StringBuilder(in.nextLine());
			int sum=0;
			for(int i=0;i<args.length;i++){
				int indexJava = str.toString().toUpperCase().indexOf(args[i].toUpperCase());
				if (indexJava >= 0) {
					sum+=1;
				}

			}
			if(sum==args.length){
				words.add(str);
			}
		}
		while (str.toString().equals("0") == false);
		int a = words.size();
		if(words.size()==0){
		    System.out.println("Таких строк нет");
        }
		for (int i = 0; i < a; i++) {
			System.out.println(words.get(i).toString());
		}

	}
}
