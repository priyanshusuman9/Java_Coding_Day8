package employee.wage;

public class Uc3 {
    static int store = 0;
    static int per_Hour_Wage = 20;
    static int part_Time_per_Hour_Wage = 20;
    static int part_Time = 2;
    static int empHr = 8;
    static int empWage = 0;
    static int count = empHr * per_Hour_Wage;
    static int part_time_Wage = empHr * part_Time_per_Hour_Wage;

    static double empValue = Math.floor(Math.random() * 10) % 2;

    public static void main(String[] args) {

        Uc3.PartTime();


    }

    static void PartTime() {


        if (store == empValue && store == 1) {
            System.out.println("Wage is " + count);
        } else if (store == empValue && part_Time == 2) {
            System.out.println("Wage is " + part_Time_per_Hour_Wage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
