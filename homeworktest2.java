package com.orilore.dk.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class homeworktest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList list1 = new ArrayList();
		File f = new File("F:\\a.txt");

		if (f.exists()) {
			try {
				f.createNewFile();
				FileInputStream f3 = new FileInputStream(f);
				int sum0 = (int) f.length();
				byte[] m = new byte[sum0];
				for (byte file : m) {
					f3.read(m);
					String str0 = new String(m);
					System.out.println(str0);
					list1.add(str0);

					break;

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File f1 = new File("F:\\test.txt");
		if (f1.exists()) {
			try {
				f1.createNewFile();
				FileInputStream f2 = new FileInputStream(f1);
				int sum = (int) f1.length();
				byte[] t = new byte[sum];
				for (byte file : t) {
					f2.read(t);
					String str = new String(t);
					System.out.println(str);
					list1.add(str);
					list1.addAll(list);
					break;
				}
				System.out.println(list1);
				for (Object kk : list1) {
					String str2 = (String) kk;
					Object str3 = kk;
					FileOutputStream kk1 = new FileOutputStream(f, true);
					kk1.write(((String) str3).getBytes());
					kk1.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
