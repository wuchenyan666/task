package MathString;

//根据要求产生N个数的加减乘除的式子
public class IntegerFormula {

    //a个整数的加减乘除
    public String[] formulaString(int a,int b){
        //随机生成a个整数,范围是0-b
        Number number = new Number();
        int[] arrayNumber=number.integerNumber(a,b);
        //随机生成a-1个符号
        Symbol symbol = new Symbol();
        String[] arrayFuhao= symbol.jiajian(a-1);
        //合并
        AddString addstring= new AddString();
        String[] string=addstring.addString(arrayNumber,arrayFuhao);

        return string;
    }
}
