public class BMI 
{
    private double weight;
    private double height;
    private double BMI;

    public BMI(double weight, double height)
    {
        setWeight(weight);
        setHeight(height);
    }

    public double getBMI()
    {
        return calcBMI();
    }

    public String getCat()
    {
        return BMICat();
    }

    private void setWeight(double weight)
    {
        this.weight = weight;
    }

    private void setHeight(double height)
    {
        this.height = height;
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
