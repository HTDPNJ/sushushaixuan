public class ZuHe
{ ////返回求组合问题，data[5][3],5个里面随机选3个
    public static int[][] init(){
        int[][]data=new int[51][51];
        data[0][0]=1;
        for(int i=1;i<51;i++){
            data[i][0]=1;
            for(int j=1;j<51;j++){
                data[i][j]=(data[i-1][j-1]+data[i-1][j])%1000000007;
            }
        }
        return data;
    }

    public static void main(String[] args)
    {
        int [][]data=init();
        System.out.println(data[3][5]);
    }
}
