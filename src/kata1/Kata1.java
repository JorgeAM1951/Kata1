
package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Luis", new Date(95, 10, 18));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    

}
