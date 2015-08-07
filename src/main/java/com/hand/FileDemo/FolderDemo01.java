package com.hand.FileDemo;

import java.io.File;

public class FolderDemo01 {

	public static void main(String[] args) {
		File folder = new File("my new folder");
		//文件夹的创建
		if(folder.mkdir()){//folder.mkdirs()创建多级文件结构
			System.out.println("文件夹创建成功");
		}else{
			if(folder.exists()){
				System.out.println("文件夹已经存在");
			}else{
				System.out.println("文件夹创建失败");
			}
		}
		//文件夹重命名，也可以移动文件夹
		//处于同一个分区中
		File newfolder = new File("my new folder-new");
		if(folder.renameTo(newfolder)){
			System.out.println("done");
		}else{
			System.out.println("fail");
		}
		//删除文件夹，文件夹为空才能被删除
		if(folder.delete()){
			System.out.println("删除文件夹成功");
		}else{
			System.out.println("删除文件夹失败");
		}
	}
}