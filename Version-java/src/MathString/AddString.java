package MathString;

public class AddString {
    //交叉合并两个数组中的元素
    public String[] addString(int[] a,String[] b ){
        String[] c=new String[a.length+b.length];
        //数组c的0、2、4、6、8.....位为数，1、3、5、7、9位为符号

        int z=0;
        for(int i=0;i<a.length;i++){
            c[z]=a[i]+" ";
            z=z+2;
        }

        int x=1;
        for(int i=0;i<b.length;i++){
            c[x]=b[i];
            x=x+2;
        }
        return c;
    }
}
