package zpf;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void show() {
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.print("--------------------------------"+"\n");//输入用户信息
		System.out.print("姓名\n");
		student.name = scanner.next();
		System.out.print("学号\n");
		student.number = scanner.next();
		System.out.print("性别\n");
		student.sex = scanner.next();
		System.out.print("年龄\n");
		student.age = scanner.next();
		System.out.print("班级\n");
		student.banji = scanner.next();
		System.out.print("--------------------------------");
		System.out.println(student.toString());                    //输出用户信息
		System.out.print("--------------------------------"+"\n");
	}
	
	public static void txt(){   
		System.out.print("                      《长恨歌》"+"\n");
		try {
			FileReader fInputStream=new FileReader("D:\\A.txt");     //读
			FileWriter fOutputStream=new FileWriter("D:\\B.txt");   //写
			StringBuffer gushi=new StringBuffer();
			char[] a=new char[14];
			while((fInputStream.read(a))!=-1) {
			gushi.append(a,0,7);
			gushi.append(",");
			gushi.append(a,7,7);
			gushi.append("."+"\n");
			}
			System.out.println(gushi);
			fOutputStream.write(new String(gushi));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void txt2(){
		File file=new File("D:\\A.txt");
		try {
			FileReader fInputStream=new FileReader(file);
			FileWriter fOutputStream=new FileWriter("D:\\B.txt");
			int l=(int)file.length();
			char[] a=new char[l];
			fInputStream.read(a);
			int x=0;
			int y=7;
			for(int j=7;j<=file.length()-470;j=j+7,x+=7,y+=7) {
				if(j%2==0) {
					for(int i=x;i<j;i++) {
						char c=a[i];
					fOutputStream.write(c);
					}
					fOutputStream.write(".\n");
				}else {
					for(int i=x;i<j;i++) {
						char c=a[i];
					fOutputStream.write(c);
					}
					fOutputStream.write(",");
				}
			}
			fInputStream.close();
			fOutputStream.close();
		} catch (FileNotFoundException en) {
			en.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
}}