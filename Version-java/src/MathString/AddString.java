package MathString;

public class AddString {
    //交叉合并两个数组中的元素
    public String[] addString(int[] a,String[] b ){
        String[] c=new String[a.length+b.length];
        //数组c的0、2、4、6、8.....位为数，1、3、5、7、9位为符号
        for(int i=0;i<a.length;i++){
            int j=0;
            c[j]=a[i]+" ";
            j=j+2;
        }
        for(int i=0;i<b.length;i++){
            int j=1;
            c[j]=b[i];
            j=j+2;
        }
        return c;
    }
}
