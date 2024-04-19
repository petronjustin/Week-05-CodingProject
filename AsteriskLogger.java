package week05_CodingProject;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String wooPig) {
		// TODO Auto-generated method stub
		System.out.println("***" + wooPig + "***");
	}

	@Override
	public void error(String razorback) {
		System.out.println("****************");
		System.out.println("***Error: " + razorback + "***");
		System.out.println("****************");
		
		System.out.println();
		
	}

}
