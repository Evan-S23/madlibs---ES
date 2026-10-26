public class madlib {
  public static String createMadlib(String a, String noun, String verb, String adj, int num) {
    System.out.print("Randomly selected Madlib: " + a )
    String base = a;
    String withNoun = base.replace("$", noun);
    String withVerb = withNoun.replace("^", verb);
    String withAdj = withVerb.replace("@", adj);
    String completed = withAdj.replace("#", Integer.toString(num));

    return completed;
  }
}
