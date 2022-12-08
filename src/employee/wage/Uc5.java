package employee.wage;

import java.security.PublicKey;

public class Uc5 {
    // variable
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;
    static final int EMP_RATE_PER_HOUR=20;
    static final int NUM_OF_WORKING_DAYS=2;
    static int empHrs = 10, empWage=10, totalEmpWage=10;

    static void main(String[] args){



            }
            static void Assignment(){
                // computation
                for (int day= 0; day < NUM_OF_WORKING_DAYS; day++){
                    int empCheck = (int) Math.floor(Math.random()*10)%3;
                    switch (empCheck){
                        case IS_PART_TIME:
                            empHrs=4;
                            break;
                        case IS_FULL_TIME:
                            empHrs=8;
                            break;
                        default:
                            empHrs=0;
            }

            empWage=empHrs *EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}

