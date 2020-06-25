import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        passGen passGen = new passGen();
        Scanner in = new Scanner(System.in);

        int length;
        String specifyLength;

        System.out.println("Would you like to specify length [Y/N]");
        specifyLength = in.next().toLowerCase();

        if(specifyLength.equals("y")){
            System.out.println("Enter the length: ");
            length = Integer.parseInt(in.next());
            passGen.generator(length);
        }else{
            passGen.generator();
        }
        in.nextLine();
        in.close();

    }


}
