package com.orilore.dk.test;

import java.util.*;

public class homeworktest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生个数");
		int number = s.nextInt();

		boolean a = true;
		int temp = 0;
		double sum = 0;
		while (a) {
			temp++;

			if (temp <= number) {
				System.out.println("请输入第" + temp + "个学生的学号");
				int input = s.nextInt();
				System.out.println("请输入第" + temp + "个学生的姓名");
				String input1 = s.next();
				System.out.println("请输入第" + temp + "个学生的成绩");
				double score = s.nextDouble();
				
				ArrayList<Double> list = new ArrayList<Double>();
				list.add(score);
				
				for (int i = 0; i < list.size(); i++) {

					double object =(double)list.get(i);
					sum+=object;
					Map<Integer, String> student = new HashMap<Integer, String>();
					student.put(input, input1);

					Set<Integer> stu = student.keySet();
					Iterator<Integer> stu1 = stu.iterator();
					while (stu1.hasNext()) {
						Integer str1 = stu1.next();
						System.out.println("学号是:" + str1 + "  姓名是:" + student.get(str1));
						System.out.println("该学生成绩是" + list);
					}
					
				
				}
			} else {
				break;
			}
		}
		
	
		System.out.println("平均成绩是：" + sum / number);
	
	}
}
