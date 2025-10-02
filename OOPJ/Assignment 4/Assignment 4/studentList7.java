import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class studentList7{
	

	public static void main(String args[]) throws FileNotFoundException {
		
		File f = new File("student_list.txt");
		//System.out.println("File Found Successfully");
		
		try{
		FileReader fr = new FileReader(f);
		}catch(FileNotFoundException e){
		System.out.println("File Not Found");
		}
	}

}

