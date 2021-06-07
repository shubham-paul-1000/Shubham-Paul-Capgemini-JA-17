import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		File sm_source=new File("G:\\Capgemini-JA-17\\Lab 8\\Exercise 1\\source.txt"); // initializing Shrijit Majumder's source file
		File sm_target=new File("G:\\Capgemini-JA-17\\Lab 8\\Exercise 1\\target.txt"); // initializing Shrijit Majumder's target file
		CopyDataThread cdt = new CopyDataThread(sm_source,sm_target);
		cdt.start();
	}

}