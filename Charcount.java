class Charcount{
      public static void main(String [] args)
      {
            String name = "hello i am hasnain haidar and my contact no is : 7880992170";
            System.out.println(name);
            count(name);
      }
      public static void count(String x)
      {
            char[] ch = x.toCharArray();

            int letter = 0;
            int space = 0;
            int num = 0;
            int other = 0;

           for (int i = 0; i < x.length(); i++) {
            // Check if the character is a letter
            if (Character.isLetter(ch[i])) {
                letter++;
            }
            // Check if the character is a digit (number)
            else if (Character.isDigit(ch[i])) {
                num++;
            }
            // Check if the character is a space
            else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
            // Character falls into the "other" category if none of the above conditions are met
            else {
                other++;
            }

           }
           System.out.println("Letters: " + letter);
           System.out.println("Spaces: " + space);
           System.out.println("Numbers: " + num);
           System.out.println("Other characters: " + other);
      }
}