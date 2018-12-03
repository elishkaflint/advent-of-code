package DayThree;

public class Claim {

    String claim;

    public Claim(String claim) {
        this.claim = claim;
    }

    public int getX() {
        return Integer.valueOf(parse(this.claim)[4]);
    }

    public int getY() {
        return Integer.valueOf(parse(this.claim)[5]);
    }

    public int getWidth() {
        return Integer.valueOf(parse(this.claim)[7]);
    }

    public int getHeight() {
        return Integer.valueOf(parse(this.claim)[8]);
    }

    public static String[] parse(String claim) {
        String[] parsed = claim.split("[^0-9]");
        return parsed;
    }

    public static void main (String[] args) throws Exception {
        Claim claim = new Claim("#1 @ 146,196: 19x14");
        System.out.println(claim.getX());
        System.out.println(claim.getY());
        System.out.println(claim.getHeight());
        System.out.println(claim.getWidth());
    }

}
