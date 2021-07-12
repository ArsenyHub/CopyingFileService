import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		String sourceDir = "C:\\Users\\arsen\\OneDrive\\Робочий стіл\\Location\\";
		String targetDir = "C:\\Users\\arsen\\OneDrive\\Робочий стіл\\Target\\";
		try {
			FileCopyingService.findFiles(sourceDir, list); 
		} catch (IOException e) {
			throw e;
		}
		 
			for(String s: list) {
				if(s.substring(s.length() - 4)==".txt") {
					File file = new File(targetDir, s);
					String sourceFile = sourceDir + s;
					String targetFile = targetDir + s;
					try {
						FileCopyingService.fileCopy(sourceFile, targetFile);
					} catch (IOException e) {
						//.....
						throw e;
					}
				}
			}
		
		System.out.println("Files copied");
	}

}
