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

    public int print(int num1, int num2) {
        if (paper >= (num1 * num2)) {
            toner -= (num1 * num2);
            return paper -= (num1 * num2);
        } else {
            return paper;
        }
    }

    public int refill(){
        return paper += 100;
    }





}


