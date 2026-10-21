public class picker {
    public picker(){}
    public String choice(){
        String[] arr = {"The @ $ likes to ^ when it sees exactly # pieces of cheese.",
        "Suddenly out of nowhere, a wild $ decided to ^ the cheese!",
        "It's always super @ to watch the fighting and chaos unfold.",
        "To put an end to the madness, you have to ^ a @ $ with # scales."};
        return arr[(int)(Math.random()*4+1)];
    }
}
