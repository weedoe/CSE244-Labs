//client class to call the methods in Volume.java and OfficerCadet.java. Results are found by inputting data here.
//Written by: OCdt Paterson 30648 Sept 24, 2023

public class client {
    public static void main(String[] args) {
        OfficerCadet c = new OfficerCadet(); //creating a new instance of OfficerCadet
        //calling the average method and setting parameters to be calculated
        c.average("Paterson", 70, 80);

        Volume.L = 1; //setting the length
        Volume.W = 2; //setting the width
        Volume.H = 3; //setting the height
        Volume.Calculator.cube(); //calling the cube method with given data

    }
}
//Expected results with this data is as follows:
//Paterson's test average is 75%
//Volume is 1.0
//The difference between the average calculator and volume calculator is that average uses a non-static class
//while volume uses a static class. This means that the static class can be called without creating an instance
//of the class. The non-static class must be called by creating an instance of the class. The non-static class
//allows for you to provide different data for each instance of the class while the static class needs the variables
//to be set before calling the methods.
