package com.hand.FileDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadWriteFileDemo01 {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		if(file.exists()){
			System.out.println("file exits-------");
			try {
				//字节流
				FileInputStream fis = new FileInputStream(file);
				//字符流（字节流向字符流转换的时候，要指定编码，否则会乱码）
				InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String line;
				while((line = br.readLine()) != null){
					System.out.println(line);
				}
				br.close();
				isr.close();
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			File newfile = new File("newhello.txt");
			try {
				FileOutputStream fos = new FileOutputStream(newfile);
				OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write("fwj01\n");
				bw.write("fwj02\n");
				bw.write("fwj03\n");
				bw.write("fwj04\n");
				bw.write("fwj05\n");
				bw.close();
				osw.close();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}