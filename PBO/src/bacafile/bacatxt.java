//Nama : Muhamad Farhan Rajab
//NPM : 191106041495
//Kelas : Reguler A

package bacafile;

//import lib
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bacatxt {
	public static void main(String[]args) throws IOException{
			FileReader flread = null;
			BufferedReader bfread = null;
//			Tampilan Awal
			System.out.println("      ---Program Membaca File Teks---      "
							+ "\n      -------------------------------      \n");
			
//			Blok Try
			try {
				flread = new FileReader("data.txt");
				bfread = new BufferedReader(flread);
				String f;
				while((f = bfread.readLine()) !=null) {
					System.out.println(f);
				}
				flread.close();
				bfread.close();
			}
//			Blok Catch
			catch(FileNotFoundException fnfe){
				System.out.println(fnfe.getMessage());
			}
//			Blok Finally
			finally {
				System.out.println("\nEksekusi Berakhir...");
				if(flread !=null) {
					flread.close();
				}
				else if(bfread !=null) {
					bfread.close();
				}
			}
	}
}
