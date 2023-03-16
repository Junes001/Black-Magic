package Lagrange;
public class hoocne {
	double c;
	int n;
	public double []a=new double [10000];
	public double []b=new double[10000];
	public double []d=new double[10000];
	public double solve() {
		b[n]=a[n];
		for(int i=n-1;i>=1;i--)
    {
			b[i]=b[i+1]*c + a[i];
    }
		return b[1];}
	public void mul() {
		b[n]=a[n];
	    b[0]=a[1]*(-c);
	    for(int i=n-1;i>=1;i--)
	    {
	        b[i]=a[i+1]*(-c)+a[i];
	    }
		
	}
	public void div()
	{
	    b[n]=a[n];
	    for(int i=n-1;i>=1;i--)
	    {
	        b[i]=b[i+1]*c+a[i];
	    }
	    }
	public double Derivative() {
	    b[n]=a[n];
	    for(int i=n-1;i>=1;i--)
	    {
	        b[i]=b[i+1]*c+a[i];
	    }
	    d[n]=b[n];
	    for(int i=n-1;i>=2;i--)
	    {
	        d[i]=d[i+1]*c+b[i];
	    }
	    return d[2];
	}

}
