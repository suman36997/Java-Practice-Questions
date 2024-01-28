import java.util.ArrayList;

public class Recursion15 {
    public static ArrayList<Integer>ReturnAllIndex(int arr[],int target,int index,ArrayList<Integer>list){
        if(index>arr.length-1){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        
            return ReturnAllIndex(arr, target, index+1, list);
        
    }
    public static ArrayList<Integer>ReturnAllIndex1(int arr[],int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index>arr.length-1){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        
             ArrayList<Integer>ansbelowList= ReturnAllIndex1(arr, target, index+1);
              list.addAll(ansbelowList);
              return list;
        
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,3,6,3};
        ArrayList<Integer>list=new ArrayList<>();
        list=ReturnAllIndex1(arr, 3, 0);

        System.out.println(list);
    }
}
