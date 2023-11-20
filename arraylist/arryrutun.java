package arraylist;
import java.util.ArrayList;

public class arryrutun {
    public static void main(String[] args) {

        int [] arr = {2,3,1,4,4,5};
        System.out.println(ans(arr, 4, 0, new ArrayList<>()));
    }
    // ArrayList<Integer> list = new ArrayList<Integer>();
    static ArrayList<Integer> ans(int arr[],int target,int index,ArrayList<Integer> list ){
    if(index == arr.length){
        return list;

    }
    if(arr[index]== target){
        list.add(index);
    }
    return ans(arr, target, index+1, list);
    }
    
}
