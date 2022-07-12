public class FizzBuzz {

    public String fizzBuzzString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("FizzBuzz String cannot be null");
        }

        else {

            if( str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

            else if (str.startsWith("f")) return "Fizz";

            else if (str.endsWith("b")) return "Buzz";

            else return str;
        }
    }

    public String[] fizzBuzzStringArray(String[] strArray){
        int i = 0;
        String[] dupArray = new String[strArray.length];
        for (String str : strArray) {
            dupArray[i++] = fizzBuzzString(str);
        }
        return dupArray;
    }
}
