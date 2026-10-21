import java.util.Scanner;
public class numbers{
    
    public numbers(){}
    public int check(){
        /*creates the initial input */
        System.out.println("Input a number");
        Scanner cb = new Scanner(System.in);
        String n =cb.nextLine();
        String temp = n;
        int thing = 1;
        Boolean pass = false;
        /*only returns a value when the inputed string can be converted to an int */
        while(pass == false){
            try{
                thing = Integer.parseInt(temp);
                pass = true;
            }
            catch(NumberFormatException e){
                System.out.println("Enter a valid number");
                temp = cb.nextLine();
            }
        }
        return thing;
    }
    /*to dissuade poor programming in main */
    public String toString(){
        return "dumb dog";
    }
}
