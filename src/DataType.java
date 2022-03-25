/**
 * @author ssy
 */
public class DataType {
    public static void main(String[] args) {
        int intData=1;
        String stringData="屠威傻逼";
        Double doubleData=6.666;
        float floatData= (float) (0.2+0.1);
        System.out.println("我是"+stringData);
        System.out.println("平均值"+average(1,2,3));
    }
    public  static  float average(int a,int b,int c){
        return  (a+b+c)/3;
    }
}
