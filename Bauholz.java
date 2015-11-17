//Smaller needs generics
public abstract class Bauholz implements Smaller<Bauholz>{
    
	protected int length;


	/**
     * Abstract class which other wood types are based on. 
     * @param (length): Must be positive!
     **/ 
	public Bauholz(int length)
	{

		if (length < 0)
		{
			throw new IllegalArgumentException("Bauholz: Length must be positive!");
		}
		this.length = length;
	}

	/**
     * Returns the volume of the wood in "festmeter"
     **/ 
	abstract double festmeter();



	/**
     * Returns true if the festmeter volume of this is smaller than the arguments festmeter volume.
     * @param (x): Must NOT be NULL!
     **/ 
	public boolean smaller(Bauholz x)
	{	
		if (x == null)
		{
			throw new IllegalArgumentException("smaller: Argument must NOT be NULL!");
		}
		return this.festmeter() < x.festmeter(); 
	}
}
