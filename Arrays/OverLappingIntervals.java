

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        List<int[]> li = new ArrayList<>();
        int[] row = new int[2];
        row[0]=arr[0][0];
        row[1]=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(row[1]>=arr[i][0]){
                row[1]=Math.max(row[1],arr[i][1]);
            }
            else{
                li.add(new int[]{row[0],row[1]});
                row[0]=arr[i][0];
                row[1]=arr[i][1];
            }
        }
        li.add(new int[]{row[0],row[1]});
        return li;
    }
}