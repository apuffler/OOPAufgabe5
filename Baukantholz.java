public class Baukantholz extends Bauholz {
    
	public int breadth;
	public int height;

	/**
     * Baukantholz, based on Bauholz.
     * @param (length): Must be positive!
     * @param (breadth): Must be positive!
     * @param (height): Must be positive!
     **/ 
	public Baukantholz(int length, int breadth, int height)
	{
		super(length);
		
		if(breadth < 0 || height < 0)
		{
			throw new IllegalArgumentException("Baukantholz: breadth and height must be positive!");
		}

		this.breadth = breadth;
		this.height = height;
	}


	/**
     * Returns the volume of the wood in "festmeter"
     **/ 
	@Override
	public double festmeter()
	{
		return (double) length * (double) breadth * (double) height;
	}

}
