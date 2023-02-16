
class Main{

    public static void main(String[] args){
        String str = "abc";
        int j = str.length()-1;
        StringBuilder sb = new StringBuilder();

        while(j>=0){
            sb.append(str.charAt(j));
            j--;
        }
        System.out.println(sb.toString());
    }
   
}