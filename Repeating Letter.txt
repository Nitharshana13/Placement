public class Main {
    public static void main(String[] args) {
        String a= "t6hj7ui";
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (Character.isLetter(ch)) {
                temp.append(ch); 
            } 
            else if (Character.isDigit(ch))
            {
                int count = Character.getNumericValue(ch);
                for (int j = 0; j < count; j++) {
                    result.append(temp);
                }
                temp.setLength(0); 
            } 
            else
            {
                result.append(ch); 
            }
        }
        result.append(temp);

        System.out.println(result);
    }
}