public class Password {

    // to store all the chars in the string
    private char[] passChar;

    // split the string into chars
    public void name(String string) {
        passChar = string.toCharArray();
    }

    // check for a number present inside the string
    public Boolean numberPresent() {

        // start from the first position of the array and go through it
        for(int i = 0; i < passChar.length; i++){
            // check whether the specific char is anywhere between 0 - 9
            if(passChar[i] >= '0' && passChar[i] <= '9'){
                // if so, return true
                return true;
            }
        }
        // else return false
        return false;
    }

    // check the length of the string and return true if it is between 8 - 15
    public Boolean correctLength() {
        if(passChar.length >= 8 && passChar.length <= 15){
            return true;
        }else{
            return false;
        }
    }

    // check if there is a lowercase letter
    public Boolean checkLowercase() {
        // go through the char array
        for(int i = 0; i < passChar.length; i++){
            // if the specific char is between a - z, return true
            if(passChar[i] >= 'a' && passChar[i] <= 'z'){
                return true;
            }
        }
        // else return false
        return false;
    }

    // check if there is a uppercase letter
    public Boolean checkUppercase() {
        // go through the char array
        for(int i = 0; i < passChar.length; i++){
            // if the specific char is between A - Z, return true
            if(passChar[i] >= 'A' && passChar[i] <= 'Z'){
                return true;
            }
        }
        // else return false
        return false;
    }

    // check for a special character
    public Boolean specialChar() {

        // go through all the chars in the array
        for(int i = 0; i < passChar.length; i++){
            // if the char is equal to any of these special chars, return true
            if(passChar[i] >= '!'||passChar[i] >= '@'||passChar[i] >= '#'||passChar[i] >= '$'||passChar[i] >= '%'){
                return true;
            }
        }
        // else return false
        return false;
    }

    // check all methods at once
    public Boolean passwordValid() {
        // if all methods return true (number, length, lowercase, uppercase, special char)
        if(numberPresent() && correctLength() && checkLowercase() && checkUppercase() && specialChar()){
            return true;
        }
        //else return false
        return false;
    }

}
