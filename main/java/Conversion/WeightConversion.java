package Conversion;

import java.text.DecimalFormat;

public class WeightConversion {


    float Kilo, Pound;
    private static final DecimalFormat decfor=new DecimalFormat("0.00");
    public String PtoK(Float pound)
    { 
    	Kilo = (float) (pound * 0.453592);

        return decfor.format(Kilo);
    }
    public String KtoP(Float Kilo)
    {
    	Pound= (float) (Kilo/0.453592);

    	return decfor.format(Pound);
    }
}
