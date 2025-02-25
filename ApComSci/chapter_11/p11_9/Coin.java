package p11_9;

/**
   A coin with a monetary value.
*/
public class Coin implements Comparable<Object>
{
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   private double value;
   private String name;

public int compareTo(Object arg0) {
	return (int) value;
	}
}
