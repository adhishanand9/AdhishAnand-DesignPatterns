package org.example.creational;
import java.io.*;

abstract class Plan
{
    protected double rate;
    abstract void getRate();
    public void calculateBill(int unitsRecorded)
    {
        System.out.print("BILL : ");
        System.out.println(unitsRecorded*rate);
    }
}

class LocalPlan extends Plan
{
    public void getRate()
    {
        rate = 3.75;
    }
}

class CommercialPlan extends Plan
{
    public void getRate(){ rate = 7.52; }
}

class CollegePlan extends Plan
{
    public void getRate(){ rate = 5.56; }
}

class callPlan
{
    public Plan getPlanType(String planType)
    {
        if(planType==null)
            return null;
        else if(planType.equalsIgnoreCase("local"))
            return new LocalPlan();
        else if(planType.equalsIgnoreCase("commercial"))
            return new CommercialPlan();
        else if(planType.equalsIgnoreCase("college"))
            return new CollegePlan();
        else
            return null;
    }
}

public class FactoryMethod
{
    public static void main(String[] args) throws IOException
    {
        callPlan getPlan = new callPlan();
        System.out.println("Choose between Local/ Commercial/ College");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planType = br.readLine();
        System.out.println("Enter number of units for bill");
        int units = Integer.parseInt(br.readLine());

        Plan p = getPlan.getPlanType(planType);
        p.getRate();
        p.calculateBill(units);
    }
}
