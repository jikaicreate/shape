package example;

import java.util.List;
import java.util.ArrayList;

public class Shape {
	private double sides[] ;
	public Shape(double sides[]) {
		this.sides = sides;
	}
	public boolean isValidShape() {
		if(isEverySidesLengthMoreThanZero() == false)
		{
			return false;
		}
		if(isSidesAmountMoreThanTwO() == false)
		{
			return false;
		}		
		if(isTheOneSideLengthMoreThanOtherLengthsum() ==false)
		{
			return false;
		}
		return true;
	}
	private boolean isEverySidesLengthMoreThanZero() 
	{	
		int i = 0;
		for(;i<sides.length;++i)
		{
			if(sides[i]<=0)
			{
				return false;
			}
		}
		return true;
	}
	private boolean isSidesAmountMoreThanTwO() {
		
		if(sides.length<=2)
		{
			return false;
		}
		return true;
	}
	private boolean isTheOneSideLengthMoreThanOtherLengthsum() {
		int i = 0;
		double sum = 0,ExceptOnelength = 0;	
		sum = lengthsum();		
		for(;i<sides.length;i++)
		{
			ExceptOnelength = sum - sides[i];
			if(ExceptOnelength < sides[i])
			{
				return false;
			}
		}
		return true;
	}

	private double lengthsum() {	
		double lengthsum = 0;
		for(int i=0;i<sides.length;i++)
		{
			lengthsum += sides[i];
		}
		return lengthsum;
	}
	
public boolean hasNEqualSides(int n) {
		
		if(isValidShape() == false)
		{
			return false;
		}
		List<Double>  list = new ArrayList<Double>();
		boolean flag = false;
		for(int i=0;i<sides.length;i++)
		{
			list.add(sides[i]);
		}
		int count=sides.length;
		if(count!=n) return false;
		for(int i=1;i<list.size();i++)
		{
			if(list.get(0). doubleValue() != list.get(i).doubleValue())
				flag=false;
			else
				flag=true;
		}
		return flag;
	}

}
