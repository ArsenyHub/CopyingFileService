import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileCopyingService {
	
	public static void fileCopy(String locationFile, String targetFile) throws IOException  {
		try(InputStream is = new FileInputStream(locationFile); OutputStream os = new FileOutputStream(targetFile)) {
			long bytes = is.transferTo(os);
			System.out.println(bytes+" bytes copied");
		} catch (IOException e) {
			//do some actions
			throw e;
		}
	}
	
	
    public static void findFiles(String dirSrc, ArrayList<String> list) throws Exception {

        File dir = new File(dirSrc);
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i] != null && files[i].isFile()) {     
                list.add(files[i].getName());              
            }
        }
    }
 }
