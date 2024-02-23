package inheritance;

public interface humanBody {
	final String name = "name";
	static int height = 5;

	public static void brain() {
		System.out.println("Brain is present");
	}

	public static void eyecolor() {
		System.out.println("Default eyecolor is black");
	}

	void haricolor();

	public abstract void eyeBrows();

	public default void ear() {
		System.out.println("Ears present");
	}

}

interface human extends humanBody {
	public void feelings_are_there();

	void eyecolor();

}
