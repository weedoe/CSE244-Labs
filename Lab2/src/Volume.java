//java file to calculate volume of different shapes using static methods
//Written by: OCdt Paterson 30648 Sept 24, 2023

public class Volume { //creating a class
    static int L,W,H,R,B; //declaring variables
    public static class Calculator { //creating a static class
        static void rectangle() {
            int volume = L * W * H;
            System.out.println("Volume is " + volume);
        }

        static void cube() {
            double volume = Math.pow(L, 3);
            System.out.println("Volume is " + volume);
        }

        static void cylinder() {
            double volume = (Math.PI * Math.pow(L, 2) * H);
            System.out.println("Volume is " + volume);
        }

        static void prism() {
            double volume = (Math.pow(L, 2) * H);
            System.out.println("Volume is " + volume);
        }

        static void sphere() {
            double volume = (((double) 4 /3) * Math.PI * Math.pow(R, 3));
            System.out.println("Volume is " + volume);
        }

        static void pyramid() {
            double volume = (((double) 1 /3) * B * H);
            System.out.println("Volume is " + volume);
        }

        static void rcc() {
            double volume = (((double) 1 /3) * Math.PI * Math.pow(R, 2) * H);
            System.out.println("Volume is " + volume);
        }
    }
}