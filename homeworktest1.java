package com.orilore.dk.test;

import java.util.*;

public class homeworktest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ������");
		int number = s.nextInt();

		boolean a = true;
		int temp = 0;
		double sum = 0;
		while (a) {
			temp++;

			if (temp <= number) {
				System.out.println("�������" + temp + "��ѧ����ѧ��");
				int input = s.nextInt();
				System.out.println("�������" + temp + "��ѧ��������");
				String input1 = s.next();
				System.out.println("�������" + temp + "��ѧ���ĳɼ�");
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
						System.out.println("ѧ����:" + str1 + "  ������:" + student.get(str1));
						System.out.println("��ѧ���ɼ���" + list);
					}
					
				
				}
			} else {
				break;
			}
		}
		
	
		System.out.println("ƽ���ɼ��ǣ�" + sum / number);
	
	}
}
