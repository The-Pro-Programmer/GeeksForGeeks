package techprep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindIntersectionInFiles {

	static List<String> allLines = new ArrayList<>();
	static List<String> allLines2 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Stream<String> lines1 = null, lines2 = null;
		
		try {
			String file1Path = "...SomePath1...";
			lines1 = Files.lines(Paths.get(file1Path));
			
			String file2Path ="...SomePath2...";
			lines2 = Files.lines(Paths.get(file2Path));
			
			lines1.forEach(line -> appendList(line, 1));
			lines2.forEach(line -> appendList(line, 2));
			
			allLines2.retainAll(allLines);
			System.out.println("Lines common in two files: " + allLines2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			lines1.close();
			lines2.close();
		}

	}
	
	static void appendList(String str, int n) {
		if(n==1) {
			allLines.add(str);
		}else if(n==2) {
			allLines2.add(str);
		}
	}

}
