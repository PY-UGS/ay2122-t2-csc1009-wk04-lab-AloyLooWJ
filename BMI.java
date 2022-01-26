public class BMI 
{
    private static double weight;
    private static double height;
    private static double BMI;

    public double getBMI()
    {
        return calcBMI();
    }

    public String getCat()
    {
        return BMICat();
    }

    public void setWeight(double new_weight)
    {
        weight = new_weight;
    }

    public void setHeight(double new_height)
    {
        height = new_height;
    }

    private double conWeight()
    {
        double weightKg = weight * 0.45359237;
        return weightKg;
    }

    private double conHeight()
    {
        double heightM = height * 0.0254;
        return heightM;
    }

    private double calcBMI()
    {
        double sqHeight = (conHeight()) * (conHeight());
        BMI = conWeight()/sqHeight;
        return BMI;
    }

    private String BMICat()
    {
        String cat = "NIL";
        if (calcBMI()<18.5)
        {
            cat = "Underweight";
        }
        else if (18.5<=calcBMI() && calcBMI()<25)
        {
            cat = "Normal";
        }
        else if (25<=calcBMI() && calcBMI()<30)
        {
            cat = "Overweight";
        }
        else if (30<=calcBMI())
        {
            cat = "Obese";
        }

        return cat;
    }
}