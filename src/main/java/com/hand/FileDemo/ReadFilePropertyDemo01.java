package com.hand.FileDemo;

import java.io.File;

public class ReadFilePropertyDemo01 {
	
	public static void main(String[] args) {
		File file = new File("hello.txt");
		//判断文件是否存在
		System.out.println("判断文件是否存在："+file.exists());
		//读取文件名称
		System.out.println("读取文件名称："+file.getName());
		//读取文件路径
		System.out.println("读取文件路径："+file.getPath());
		//读取文件绝对路径
		System.out.println("读取文件绝对路径："+file.getAbsolutePath());
		//获取文件的父级路径
		System.out.println("获取文件的父级路径："+new File(file.getAbsolutePath()).getParent());
		//读取文件大小
		System.out.println("读取文件大小:"+(float)file.length()/1000+"KB");
		//判断文件是否被隐藏
		System.out.println("判断文件是否被隐藏："+file.isHidden());
		//判断文件是否可读
		System.out.println("判断文件是否可读："+file.canRead());
		//判断文件是否可写
		System.out.println("判断文件是否可写："+file.canWrite());
		//判文件是否为文件夹
		System.out.println("判文件是否为文件夹："+file.isDirectory());
	}
}