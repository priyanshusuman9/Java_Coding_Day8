//package employee.wage;
//
//public class Uc2 {
//    static int days = 1;
//    static int per_Hour = 20;
//    static int empHr = 8;
//    static int empWage = 0;
//    static int count = empHr * per_Hour;
//    static double empValue = Math.floor(Math.random() * 10) % 2;
//
//    public static void main(String[] args) {
//
//        Uc2.Present();
//
//    }
//
//        static void Present(){
//            if (days == empValue && days == 1) {
//                System.out.println("Wage is " + count);
//            } else {
//                System.out.println("Employee is Absent");
//            }
//        }
//    }
package employee.wage;

public class Uc2 {
     int days = 1;
     int per_Hour = 20;
     int empHr = 8;
     int empWage = 0;
     int  count = empHr * per_Hour;
     double empValue = Math.floor(Math.random() * 10) % 2;


    public static void main(String[] args) {
        Uc2 wages= new Uc2();
        wages.Present();

    }

      void Present(){
        if (days == empValue && days == 1) {
            System.out.println("Wage is " + count);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
