class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        backtrack(n,l,new StringBuilder(),0,0);
        return l;
    }
    public static void backtrack(int n,List<String> l,StringBuilder curr,int c,int o){
        if(o==0){
            curr.append('(');
            o++;
        }
        if(curr.length()==2*n){
            l.add(curr.toString());
            return;
        }
        if(o<n){
            curr.append('(');
            backtrack(n,l,curr,c,o+1);
            curr.deleteCharAt(curr.length()-1);
        }
        if(c<o){
            curr.append(')');
            backtrack(n,l,curr,c+1,o);
            curr.deleteCharAt(curr.length()-1);
        }

    }
}