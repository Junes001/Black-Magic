package week6;
import java.util.ArrayList;
import java.util.List;
 //Ngo Ngoc Vuowng 20206221
public class temp {;
	
    public static void main(String args[]) {
        List<String> temperatures = new ArrayList<String>();
        double arr[] = new double[] {1.2, 5.6, 3.4, 2.9, 9.7};
        temperatures.add("25");
        temperatures.add("26");
        temperatures.add("27");
        temperatures.add("28");
        int count=0;
        int count1=0;
        double conut3=0;
        double min=25;
        for (String obj : temperatures) {
        	if(Integer.parseInt(obj)>25) {
        		count++;}}
        System.out.println("the number of temperatures that equal or exceed 25 degrees");

		System.out.println(count);}
        public static int GreaterCount(List<String> temperatures, double min,int count1) {
		for (String obj : temperatures) {
        	if(Integer.parseInt(obj)>25) {
        		count1++;
        	}}
		return count1;}
        public double findNumber(double arr[],double count3) {
        double min=arr[0];
        for (double value : arr) {
            if(value<min) {
            	min=value;
            	count3++;
            }
         }
		return count3;}}



