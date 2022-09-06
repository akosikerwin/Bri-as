public class student {
     // Character class 
     String surname;
     String firstname;
     char middleinitial;
     String dateOfBirth;
     int studentNumber;
     String EmailAddress;
     boolean iAmAwesome;

     // Character method
    public void sayMyStudentNumber(){
        System.out.println("sayMyStudentNumber" + studentNumber);
    }
    public void saMyEmailAddress(){
        System.out.println("sayMyEmailAddress" + EmailAddress);
    }
    public void amIAwesome(){
        System.out.println("iAmAwesome" + iAmAwesome);
    }

}

