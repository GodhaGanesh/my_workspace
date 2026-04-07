class StringDemo {
    public static void main(String[] args) {
        String str, sample = "I Love Java";
        str = new String(sample);
        // System.out.println(str);
        // System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('I'));
        int a = 1080;
        str = String.valueOf(a);
        System.out.println(str.length());
    }
}