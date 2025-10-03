import java.util.*;
class ArrayPrac{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of A:");
        int a = obj.nextInt();
        int [] data = {1,3,7,8,9};
        boolean dat = false;
        for(int i=0;i<data.length;i++){
            if(data[i]==a){
                dat = true;
                
                break;
                
                
            
            }
            
           
        }
        if(dat == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
        
        

    }
}