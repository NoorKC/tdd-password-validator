import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordTest {
    
    //create var for password
    private Password password;

    // before you start testing...
    @Before 
    public void init(){
        this.password = new Password();
    }

    // 1st test: must contain atleast one number
    @Test
    public void testNum(){
        //a method called name will take in a string value
        this.password.name("user123");
        //a method called numberPresent will check if there is a number 
        Boolean numCheck = password.numberPresent();
        // if there is a number, the test is true
        assertTrue(numCheck);
    }

    // 2nd test: must be between 8 to 15 digits long
    @Test
    public void tesCount(){
        this.password.name("hotpotato");
        // a method called correctLength will tell whether the string is between 8 - 15 characters
        Boolean lengthCheck = password.correctLength();
        // if lengthCheck is true, the test passes
        assertTrue(lengthCheck);
    }

    // 3rd test: must contain atleast one lowercase
    @Test
    public void testLowercase(){
        this.password.name("MIKEwazouski");
        // check if there is a lowercase letter
        Boolean lowercase = password.checkLowercase();
        // if there is a lowercase letter, test passes
        assertTrue(lowercase);
    }

    // 4th test: must contain atleast one uppercase
    @Test
    public void testUppercase(){
        this.password.name("MIKEwazouski");
        // check if there is a uppercase letter
        Boolean uppercase = password.checkUppercase();
        // if there is a uppercase letter, test passes
        assertTrue(uppercase);
    }

    // 5th test: must contain a special character (! @ # $ %)
    @Test
    public void testSpecial(){
        this.password.name("eknoor@huron");
        // check if there is a special character in the string
        Boolean special = password.specialChar();
        // if there is, test passes
        assertTrue(special);
    }

    // 6th test: check all conditions together
    @Test
    public void testValid(){
        this.password.name("Huron2023$");
        Boolean valid = password.passwordValid();
        // if all conditions are true, test passes
        assertTrue(valid);
    }

}
