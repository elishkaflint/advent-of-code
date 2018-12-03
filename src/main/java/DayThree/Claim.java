package DayThree;

public class Claim {

    String claim;

    public Claim(String claim) {
        this.claim = claim;
    }

    public int getX() {
        return 1;
    }

    public String[] parse() {
        String[] parsed = this.claim.split("[0-9]+|[A-Z]+");
        return parsed;
    }

    public static void main (String[] args) throws Exception {
        Claim claim = new Claim("#1 @ 146,196: 19x14");
        System.out.println(claim.parse().length);
    }

}
