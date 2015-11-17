import java.lang.Math;
public class Baurundholz extends Bauholz {
    
	private int diameter;

	/**
     * Baurundholz, based on Bauholz.
     * @param (length): Must be positive!
     * @param (diameter): Must be positive!
     **/ 
	public Baurundholz(int length, int diameter)
	{
		if (diameter < 0)
		{
			throw new IllegalArgumentException("Baurundholz: diameter must be positive!");
		}

		super(length);
		this.diameter = diameter;
	}


	/**
     * Returns the volume of the wood in "festmeter"
     **/ 
	@Override
	public double festmeter()
	{
		return Math.PI * ((double) this.diameter/2.0) * ((double) this.diameter/2.0) * (double) this.length ;
	}



}
