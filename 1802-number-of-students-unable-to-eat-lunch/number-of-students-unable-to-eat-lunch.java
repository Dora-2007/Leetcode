class Solution {
    public int countStudents(int[] st, int[] sand) {
      int[] counts = new int[2];
        for (int stu : st) 
        counts[stu]++;
        
        int rem= sand.length;
        for (int s : sand) {
            if (counts[s] == 0)
             break;
            if (rem-- == 0) 
            break;
            counts[s]--;
        }
        
        return rem;   
    }
}