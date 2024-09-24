import com.company.Vehicle;
// The test class is not in the same package with Vehicle. So protected attributes will not work there.

public class test {
    //Vehicle vehicle2 = new Vehicle(); //Vehicle() constructor is not public so it will not work.

    /* In Java, if you do not specify an access modifier for the constructor,
     it uses the default access modifier (also called package-private).
      This means the constructor is accessible only within the same package. */
}
