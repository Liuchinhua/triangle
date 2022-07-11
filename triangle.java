import java.util.Scanner;

class triangle{
    public static void main(String args[]){
        //製作一個三角形
        // Scanner sc=new Scanner(System.in);
        // System.out.print("請輸入層數：");
        // int line=sc.nextInt(); 
        // int counter=0; //印出目前層數

        // //line-->總層數 
        // //i--> 該層層號 
          
        // //1. ooo*
        // //2. oo***
        // //3. o*****
        // //4. *******    

        // //空格數=總層數-該層層數 = line-i
        // //星星數=該層層數*2-1 = i*2-1
        
        // for(int i=1;i<=line;i++){
        //     counter++;
        //     System.out.print(counter+"\t");//顯示層數
        //     for(int j=1;j<=line-i;j++)
        //         System.out.print(" ");
        //     for(int k=1;k<2*i;k++)
        //         System.out.print("*");
        //     System.out.println();
        // }

//---------------------------------------------------------

        // //印出一個漏斗
        // Scanner sc=new Scanner(System.in);
        // System.out.print("請輸入層數：");
        // int line=sc.nextInt(); 
        // int counter=0; //印出目前層數
        
        // for(int i=1;i<=line;i++){
        //     counter++;
        //     System.out.print(counter+"\t");//顯示層數
        //     for(int j=1;j<=line-i;j++)
        //         System.out.print(" ");
        //     for(int k=1;k<2*i;k++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        // for(int i=line-1;i>=1;i--){ //line-1是為了減去重複的那層
        //     counter++;
        //     System.out.print(counter+"\t");//顯示層數
        //     for(int j=1;j<=line-i;j++)
        //         System.out.print(" ");
        //     for(int k=1;k<2*i;k++)
        //         System.out.print("*");
        //     System.out.println();
        // }

//---------------------------------------------------------

        // //製作特殊三角形
        // // 1.    *
        // // 2.   * *
        // // 3.  * * *
        // // 4. * * * * 
        // Scanner sc=new Scanner(System.in);
        // System.out.print("請輸入層數：");
        // int line=sc.nextInt(); 
        // int counter=0; //印出目前層數

        // for(int i=1;i<=line;i++){
        //     counter++;
        //     System.out.print(counter+"\t");//顯示層數
        //     for(int j=1;j<=line-i;j++)
        //         System.out.print(" ");
        //     for(int k=1;k<2*i;k++){
        //         if(k%2==0){ //k為偶數時 不要輸出* 改輸出空格
        //             System.out.print(" ");
        //             continue;
        //         }
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}