class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int end=Math.min(i+k,s.length());
            String p=s.substring(i,end);
            if(p.length()<k){
                StringBuilder sb=new StringBuilder(p);
                while(sb.length()<k)
                    sb.append(fill);
                p=sb.toString();
            }
            res.add(p);
            i=i+k;
        }
        return res.toArray(new String[0]);
    }
}