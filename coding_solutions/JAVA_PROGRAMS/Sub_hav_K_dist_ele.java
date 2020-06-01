import java.util.*; 
  
public class Sub_hav_K_dist_ele { 
    private static int atMostK(int arr[], int n, int k) 
    { 
        int count = 0; 
        int left = 0; 
        int right = 0; 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        while (right < n) { 
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1); 
            while (map.size() > k) { 
                map.put(arr[left], map.get(arr[left]) - 1); 
                if (map.get(arr[left]) == 0) 
                    map.remove(arr[left]); 
                left++; 
            } 
            count += right - left + 1; 
            right++; 
        } 
        return count; 
    } 
  
   
    private static int exactlyK(int arr[], int n, int k) 
    { 
            return (atMostK(arr, n, k) - atMostK(arr, n, k - 1)); 
    } 
  
   
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 1, 2, 1, 6 }; 
        int n = arr.length; 
        int k = 2; 
        System.out.print(exactlyK(arr, n, k)); 
    } 
} 