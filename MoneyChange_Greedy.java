// Java program to find minimum
// number of denominations
import java.util.Vector;
  
class MoneyChange_Greedy 
{
  
    // All denominations of Indian Currency 
    static int deno[] = {1000, 2000, 5000, 10000, 20000, 
    50000, 100000, 200000, 500000};
    static int n = deno.length;
  
    static void findMin(int V)
    {
        // Initialize result 
        Vector<Integer> ans = new Vector<>();
  
        // Traverse through all denomination 
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations 
            while (V >= deno[i]) 
            {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }
  
        // Print result 
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                " " + ans.elementAt(i));
        }
    }
  
    // Driver code 
    public static void main(String[] args) 
    {
        int n = 487000;
        System.out.print(
            "Following is minimal number "
            +"of change for " + n + ": ");
        findMin(n);
    }
}
  