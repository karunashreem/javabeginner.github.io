
class Solution{
    String removeSpecialCharacter(String s) {
        // code here
        String str=s.replaceAll("[^a-zA-Z]","");
        if(str.length()==0){
            return "-1";
        }
        return str;
    }
}