public class main {
  public static void main(String arg[]){
    String usedNoun = noun.getNoun();
    String usedVerb = verb.getVerb();
    String usedAdjective = adjective.getAdjective();
    int usedNumber = (new numbers()).check();
    System.out.print(madlib.createMadlib(picker.choice(), usedNoun, usedVerb, usedAdjective, usedNumber);
  }
}
