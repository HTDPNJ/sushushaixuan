import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static int[]init(){
        int[]data=new int[10000001];
        for(int i=2;i<Math.sqrt(1000001);i++){
            if(data[i]==0){
                for(int j=i*i;j<1000001;j=j+i){
                    data[j]=1;
                }
            }
        }
        return data;
    }
}