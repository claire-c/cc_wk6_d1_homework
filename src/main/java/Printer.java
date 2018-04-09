public class Printer {

    private int paper;

    public Printer(int paper){
        this.paper = paper;

    }

    public int getPaper(){
        return this.paper;
    }

    public int print(int num1, int num2){
        if (paper >= (num1 * num2)){
            return paper -= (num1 * num2);
        }else{return paper;

        }

    }





//    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//

}

