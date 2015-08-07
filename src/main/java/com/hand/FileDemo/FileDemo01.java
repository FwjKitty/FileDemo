package com.hand.FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		//是否存在
		if(file.exists()){
			//文件
			System.out.println(file.isFile());
			//路径（文件夹）
			System.out.println(file.isDirectory());
			/*file.delete();
			System.out.println("文件删除成功");*/
			
			File nameto = new File("new Hello.txt");
			//文件重命名，也可以移动文件
			file.renameTo(nameto);
		}else{
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("文件创建成功");
			} catch (IOException e) {
				System.out.println("文件无法创建");
			}
		}
	}
}