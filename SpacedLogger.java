package week05_CodingProject;

public class SpacedLogger implements Logger{

	@Override
	public void log(String wooPig) {
		StringBuilder callThemHawgs = new StringBuilder();
		for (int i = 0; i < wooPig.length(); i++) {
			callThemHawgs.append(wooPig.charAt(i)).append(" ");
		}
		System.out.println(callThemHawgs.toString());
		
		System.out.println();
	}

	@Override
	public void error(String razorback) {
			StringBuilder mussBus = new StringBuilder("Error: ");
		for (int i = 0; i < razorback.length(); i++) {
			mussBus.append(razorback.charAt(i)).append(" ");
		}
			System.out.println(mussBus.toString());
	}

}
