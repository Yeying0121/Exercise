package number;

public class Number {
    public void number(int [] arr){//创建一个组合类
        int result=0;//声明一个实例变量，用来存放组合的数量
        //int t;
        //ArrayList<Integer>first=new ArrayList<Integer>();
        //Set set=new HashSet();
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length;j++)
                for(int k=0;k<arr.length;k++){//三重循环，得到组合的结果
            //t=arr[i]*100+arr[j]*10+arr[k];
                //boolean isIn=first.contains(t);
                //while(isIn==false) {
                   // first.add(t);
                //}
            //if(result%arr.length==0)
               result+=1;//每组合一次，自加1
                }
                //for(int i=0;i<first.size();i++){
            //set.add(first[i]);
                System.out.println("一共可以组成"+result+"种不同的三位数！");//输出组合的数量结果
    }
}
