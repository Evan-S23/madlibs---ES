public class picker {
    public picker(){}
    public String choice(){
        /*creates a random number between 1 and 4*/
        int choice = (int)(Math.random()*4+1);
        /*prints the madlib corresponding to the number*/
        if(choice == 1){
            return"The @ $ likes to ^ when it sees exactly # pieces of cheese.";
        }
        else if(choice == 2){
            return "Suddenly out of nowhere, a wild $ decided to ^ the cheese!";
        }
        else if(choice == 3){
            return "It's always super @ to watch the fighting and chaos unfold.";
        }
        else if(choice == 4){
            return  "To put an end to the madness, you have to ^ a @ $ with # scales.";
        }
        /*to prevent errors in compilation*/
        return "error";
    }
}
