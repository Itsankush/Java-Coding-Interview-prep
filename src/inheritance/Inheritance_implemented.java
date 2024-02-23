package inheritance;

public class Inheritance_implemented implements human {

	@Override
	public void eyecolor() {
		// TODO Auto-generated method stub
		System.out.println("Eye color:- Black");
	}

	@Override
	public void haricolor() {
		// TODO Auto-generated method stub
		System.out.println("Hair color:- Black");
	}

	@Override
	public void feelings_are_there() {
		// TODO Auto-generated method stub
		System.out.println("feelings are there:- Yes");
	}

	@Override
	public void eyeBrows() {
		// TODO Auto-generated method stub
		System.out.println("Eye Brows included");
	}

	public static void main(String[] args) {
		humanBody m = new Inheritance_implemented();
		human h=new Inheritance_implemented();
//function call
		h.eyecolor();
		m.haricolor();
		h.feelings_are_there();
		m.eyeBrows();
		m.ear();
		humanBody.brain();
	}

}
