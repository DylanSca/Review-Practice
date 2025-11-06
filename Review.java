import java.util.ArrayList;
import java.util.HashMap;


/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    //1
    public String name;
    //2
    public int age;
    //3
    public ArrayList<String> words = new ArrayList<>();
    //4
    private int year;
    //5
    public final double CENTS = 100.0;
    //7
    private HashMap<String, Integer> groupsize = new HashMap<>();
    //9
    public double netPay;
    public double pay;
    public double taxes;
    /**
     * Constructor for objects of class Review
     */
    public Review()
    {
        
        
    }

    //6
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //7
    public HashMap<String,Integer>getGroupSize(){
        return this.groupsize;
    }
    //8
    public boolean canRide(int age){
        if(age>10){
            System.out.println("can ride");
            return true;
        }else{
            System.out.println("cant ride");
            return false;
        }
        }
    //9
    public double calculatePay(double hours,double wage){
        pay=hours*wage;
        taxes=pay*0.30;
        netPay=pay-taxes;
        return netPay;

    }
    //10
    public void paySalary(String name,double wage,double hours){
        double transfer = calculatePay(hours,wage);
        System.out.println(name + " " + "earned" +" "+"$"+ transfer);
    }
    }
