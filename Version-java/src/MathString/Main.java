package MathString;

public class Main {

    public static void main(String[] args) {
        IntegerFormula string=new IntegerFormula();
        String[] string1=string.formulaString(5,100);
        for (int i=0;i<string1.length;i++){
            System.out.println(string1[i]);
        }
    }
}
