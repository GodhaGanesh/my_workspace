public class SeventyOne {
    public static void main(String[] args){
        String str = "Hii Good Morning";
        String res = "";
        String[] arrStr = str.split(" ");

        for(int i = 0;i<arrStr.length;i++){
            String st = arrStr[i];
            res += revWord(st)+" ";
        }
        System.out.println(res);
    }
    public static String revWord(String str) {
        String res = "";
        for(int i = 0;i<str.length();i++){
            res = str.charAt(i) + res;
        }
        return res;
    }
}
