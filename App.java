package week05_CodingProject;

public class App {

	public static void main(String[] args) {
		 Logger asteriskLogger = new AsteriskLogger();
		 Logger spacedLogger = new SpacedLogger();
		 
		
		 asteriskLogger.error("Hello");
		 
		 spacedLogger.log("Hello");
		 spacedLogger.error("Hello");
	}

}
