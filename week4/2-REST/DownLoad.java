import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class DownLoad {

	public static void main(String[] args) throws IOException {
		
		
		URL website = new URL("http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg");
		
		// BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));
		InputStream in = new BufferedInputStream(website.openStream());
		File file = new File("C:\\Users\\Lazarov94\\Desktop\\JPGG.jpg");
		FileOutputStream op = new FileOutputStream(file);
		int a = 0;
		while((a = in.read()) != -1){
			op.write(a);
		}
		in.close();
		op.close();
	}

}
