package lab;

public class EmployeeData {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        short age;
        char gender;
        long personalID;

        firstName = "Tom";
        lastName = "Smith";
        age = 30;
        gender = 'm';
        personalID = 8306112507L;

        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("personalID: " + personalID);

    }



   /*
    First name
- Last name
- Age (0...100)
- Gender (m or f)
- Personal ID number (e.g. 8306112507)*/
}
