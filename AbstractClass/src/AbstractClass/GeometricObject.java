package AbstractClass;
public abstract class GeometricObject {
	
	protected String color;
	protected double weight;
	// Default construct 
	protected GeometricObject()
	{
	color = "white";
	weight = 1.0;
	}
	// Construct a geometric object
	protected GeometricObject(String color, double weight)
	{
	this.color = color;
	this.weight = weight;
	}
	public String getColor()
	{
	return color;
	}
	void setColor(String color){
		this.color = color;
	       }
	
		double getWeight()
			{
			return weight;

			}
		void setWeight(double weight)
		{
			this.weight = weight;
	}
	
	// Abstract method
	public abstract double findArea();
	// Abstract method
	public abstract double findPerimeter();
	}
