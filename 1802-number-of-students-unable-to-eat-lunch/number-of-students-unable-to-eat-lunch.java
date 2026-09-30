class Solution {
    public int countStudents(int[] st, int[] sand) {
     Queue<Integer> q = new LinkedList<>();
    int top = 0, count = 0;

    for(int e : st)
        q.add(e);

    while(!q.isEmpty() && count != q.size()){
        if(q.peek() == sand[top]) {
            count = 0;
            top++;
            q.poll();
        } else {
            q.add(q.poll());
            count++;
        }
    }
    return q.size();
}
}