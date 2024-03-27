public class Burgers {

    String bun;
    int meat =0;
    String cheese;
    String salad;
    boolean mayo;

    public Burgers(String bun, int meat, String cheese, String salad, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayo = mayo;
        System.out.println(toString());
    }

    public Burgers(String bun, String cheese, String salad) {
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println(toString());
    }

    public Burgers(String bun, String cheese, int meat, String salad, boolean mayo) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.salad = salad;
        this.mayo = mayo;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Burgers{" +
                "bun='" + bun + '\'' +
                ", meat=" + (meat==0 ? "без м'яса" : meat +" х м'яса") +
                ", cheese='" + cheese + '\'' +
                ", salad='" + salad + '\'' +
                ", mayo=" + (mayo ? " з майонезом" : "без майонезу") +
                '}';
    }
}
