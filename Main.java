public class Main {

    public static void main(String[] args) {
      PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
        .useDigits(true)
        .useLower(true)
        .useUpper(true)
        .usePunctuation(true)
        .build();

      try{
        String password = passwordGenerator.generate(Integer.parseInt(args[0]));
        System.out.println("A password generated : " + password);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.err.println("Please enter a valid password length. For example : 8 or 16");
      }
    }
}
