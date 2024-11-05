

// User function Template for Java//User function Template for Java
class Solution {
    
    // public static void solveIt(ArrayList<Integer> arr, int index, int n, ArrayList<Integer> result, int sum) {
    //     if (index == n) {
    //         result.add(sum);
    //         return;
    //     }
        
    //     solveIt(arr, index + 1, n, result, sum);
    //     solveIt(arr, index + 1, n, result, sum + arr.get(index));
    // }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        class Box {
             public void solveIt(ArrayList<Integer> arr, int index, int n, ArrayList<Integer> result, int sum) {
                if (index == n) {
                    result.add(sum);
                    return;
                }
                
                solveIt(arr, index + 1, n, result, sum);
                solveIt(arr, index + 1, n, result, sum + arr.get(index));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        Box obj = new Box();
        obj.solveIt(arr, 0, arr.size(), result, 0);
        return result;
    }
}