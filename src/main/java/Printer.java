public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;

    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int num1, int num2) {
        if (paper >= (num1 * num2)) {
            toner -= (num1 * num2);
            paper -= (num1 * num2);
        } else {}
    }

    public void refill(){
        paper += 100;
    }





}


