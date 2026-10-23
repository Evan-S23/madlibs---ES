public class picker {
    public static String choice(){
        int choice = (int)(Math.random()*4+1);
        if(choice == 1){
            return"A @ $ swooped in to ^ my bed # times.";
        }
        else if(choice == 2){
            return "Yesterday, I met a @ $ who was # years old and loved to ^.";
        }
        else if(choice == 3){
            return "It's always super @ to watch the fighting and chaos unfold.";
        }
        else if(choice == 4){
            return  "To put an end to the madness, you have to ^ a @ $ with # scales.";
        }
        return "error";
    }
}
