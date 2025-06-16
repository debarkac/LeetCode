class Solution {
    private int getSecondLast(List<Integer> res){
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr[arr.length-2];
    }
    public int calPoints(String[] operations) {
        List<Integer> res=new LinkedList<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int score1=res.getLast();
                int score2=getSecondLast(res);
                res.add(score1+score2);
            }
            else if(operations[i].equals("D")){
                res.add(res.getLast()*2);
            }
            else if(operations[i].equals("C")){
                res.removeLast();
            }
            else{
                res.add(Integer.parseInt(operations[i]));
            }
            System.out.println(res);
        }
        for(int i=0;i<res.size();i++){
            sum=sum+res.get(i);
        }
        return sum;

    }
}