
public class Aaba {

	public static void main(String[] args) {
		String tmp = "C:\\..\\ temp.pdf";
		
		String fileName = tmp.substring(tmp.lastIndexOf(".") + 1);
		System.out.println(fileName);
		
		fileName = tmp.replaceAll(":", "");
		fileName = tmp.replace("\\", "/").replace("..", "").replace(":", "");
		System.out.println(fileName.substring(fileName.lastIndexOf("/") + 1));
		
		//ystem.out.println(stringes);
		
	}
}
