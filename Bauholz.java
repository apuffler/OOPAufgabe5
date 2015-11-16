//Smaller needs generics
public abstract class Bauholz implements Smaller{
    
	private int length;

	public Bauholz(int length)
	{
		this.length = length;
	}

	abstract double festmeter();
}
