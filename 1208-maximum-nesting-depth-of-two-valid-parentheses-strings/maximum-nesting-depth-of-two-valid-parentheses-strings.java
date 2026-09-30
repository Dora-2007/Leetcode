class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(i^seq.charAt(i)) & 1;

        }
        return arr;
    }
}