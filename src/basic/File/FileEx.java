package basic.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.stream.events.Namespace;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\seoye\\Desktop\\2-1\\JAVA 프로그래밍 응용\\Temp");
		File f2 = new File("C:\\Users\\seoye\\Desktop\\2-1\\JAVA 프로그래밍 응용\\Temp\\test");
		File f3 = new File("C:\\Users\\seoye\\Desktop\\2-1\\JAVA 프로그래밍 응용\\Temp\\ttt.txt");
		
		
		String res = "";
		if(f1.isFile()) {
			res = "파일";
		} else {
			res = "폴더";
		}
		System.out.println("결과 : " + res);
		
		if(!f2.exists()) {
			f2.mkdir();
		}
		
		f3.renameTo(new File("C:\\\\Users\\\\seoye\\\\Desktop\\\\2-1\\\\JAVA 프로그래밍 응용\\\\Temp\\\\sss.txt"));
		
		if(!f3.exists()) {
			f3.createNewFile();
		}
		
		File[] names = f1.listFiles();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names [i].getName());
		}
		System.out.println("========================");
		for (File str : names) {
			System.out.println(str);
		}
		System.out.println("=================================================================");
		System.out.println("날짜시간                   형태\t 크기\t이름");
		System.out.println("=================================================================");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for (File file : names) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t<FILE>\t"+ file.length()+ "\t" + file.getName());
			}
			System.out.println();
		}
		System.out.println("=================================================================");
	}

}
