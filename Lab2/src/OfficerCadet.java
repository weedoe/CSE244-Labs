//Non-static class to calculate the average of two marks of a student
//Written by: OCdt Paterson 30648 Sept 24, 2023
public class OfficerCadet { //creating a class
public void average(String studentName, int CSE250mark, int CSE244mark) {
    int avg; //declaring variables
    avg = ((CSE250mark + CSE244mark) / 2); //calculating the average
    System.out.println(studentName +"'s class average is " + avg + "%"); //printing the average
}
}

