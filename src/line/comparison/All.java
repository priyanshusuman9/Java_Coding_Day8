package line.comparison;

public class All {


    //        EQUALS METHOD

        public static void main(String[] args) {

            // Get some Strings to compare
            String s1 = "A";
            String s2 = "A";
            String s3 = "a";
            String s4 = new String("A");

            // Compare s1 and s2
            // It should return true as they both
            // have the same content
            System.out.println(s1 + " .equals " + s2
                    + ": " + s1.equals(s2));

            // Compare s1 and s3
            // It should return false as they both
            // have the different content
            System.out.println(s1 + " .equals " + s3
                    + ": " + s1.equals(s3));

            // Compare s2 and s3
            // It should return false as they both
            // have the different content
            System.out.println(s2 + " .equals " + s3
                    + ": " + s2.equals(s3));

            // Compare s1 and s4
            // It should return true as they both
            // have the same content
            System.out.println(s1 + " .equals " + s4
                    + ": " + s1.equals(s4));


            //  COMPARETO METHOD
            // Get some Strings to compare
            String T1 = "A";
            String T2 = "A";
            String T3 = "a";
            String T4 = new String("A");

            // Compare s1 and s2
            // It should return 0 as they both
            // have the same ASCII value
            System.out.println(T1 + " .compareTo " + T2
                    + ": " + T1.compareTo(T2));

            // Compare s1 and s3
            // It should return -32 as they both
            // have the different ASCII value
            System.out.println(T1 + " .compareTo " + T3
                    + ": " + T1.compareTo(T3));

            // Compare s3 and s2
            // It should return 32 as they both
            // have the different ASCII value
            System.out.println(T3 + " .compareTo " + T2
                    + ": " + T3.compareTo(T2));

            // Compare s1 and s4
            // It should return 0 as they both
            // have the same ASCII value
            System.out.println(T1 + " .compareTo " + T4
                    + ": " + T1.compareTo(T4));


            //     EQUALSIGNORECASE()




            // Get some Strings to compare
            String R1 = "A";
            String R2 = "A";
            String R3 = "a";
            String R4 = new String("A");

            // Compare s1 and s2
            // It should return true as they both
            // have the same content
            System.out.println(R1 + " .equalsIgnoreCase " + R2
                    + ": " + R1.equalsIgnoreCase(R2));

            // Compare s1 and s3
            // It should return true as they both
            // have the same content being case insensitive
            System.out.println(R1 + " .equalsIgnoreCase " + R3
                    + ": " + R1.equalsIgnoreCase(R3));

            // Compare s2 and s3
            // It should return true as they both
            // have the same content being case insensitive
            System.out.println(R2 + " .equalsIgnoreCase " + R3
                    + ": " + R2.equalsIgnoreCase(R3));

            // Compare s1 and s4
            // It should return true as they both
            // have the same content
            System.out.println(R1 + " .equalsIgnoreCase " + R4
                    + ": " + R1.equalsIgnoreCase(R4));



        }
}





