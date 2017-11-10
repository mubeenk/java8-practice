package coreservlets.writefiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteGibrFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> contents = Arrays.asList("1","2","3","4","5","6","7","8");
		try {
			Files.write(Paths.get("dummy.txt"), contents,Charset.defaultCharset());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
