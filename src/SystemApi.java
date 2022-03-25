import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SystemApi {
    final static String QUIT_STRING="q";
    public static void main(String[] args) {
        readArrPrintAve();
    }
    public static void readArrPrintAve(){
        Scanner sc=new Scanner(System.in);
        String input="";
        List<Double> arr=new ArrayList<>();
        System.out.println("输入q结束输入 输入回车下一个");
        while (!SystemApi.QUIT_STRING.equalsIgnoreCase(input)){
            input=sc.nextLine();
            try{
                arr.add(Double.parseDouble(input));
            }catch (NumberFormatException e){
                System.out.println("请输入正确的参数");
            }
        }
        System.out.println("平均数为"+average(arr.toArray(new Double[arr.size()])));
    }
    public  static  double average(Double[] arr){
        if(arr.length==0){
            return  0;
        }
         return Arrays.stream(arr)
                .reduce(0.0, Double::sum)/ arr.length;
    }
    public  static  double average(double[] arr){
        if(arr.length==0){
            return  0;
        }
        return Arrays.stream(arr)
                .reduce(0, Double::sum)/ arr.length;
    }

}
