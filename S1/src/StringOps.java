public class StringOps {
    public String reverse(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
    public int wordcount(String str){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
        return cnt+1;
    }
}
