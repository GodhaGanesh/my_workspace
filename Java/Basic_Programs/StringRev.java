public class StringRev {
    public static void main(String[] args) {
        String str = "Hii Good Morning";
        String res = "";
        
        for(int i = 0; i < str.length(); i++) {
            res = str.charAt(i) + res;
        }
        System.out.println(res);
    }
}
