public class HomeWork7 {
     /* 
         إعداد: عمار ناصر عباس  عثمان
            task 6
    */
    public static void  main(String[] args){
        /* =========================
         *      تعريف المتغيرات
         * ========================= */
        String txt ="Demo text Demo text Demo text Demo text Demo text Demo text Demo text Demo text Demo text Demo text ";
        int age= 21;
        double height= 1.75;
        char initial= 'A';
        final double pi = 3.14;
        /* =========================
         *      العمليات الحسابية
         * ========================= */
        System.out.println("=========================\nArithmetic operations\n=========================");
        System.out.println("initial");
        System.out.println(age+pi);
        System.out.println(height-pi);
        System.out.println(age*pi);
        System.out.println(age/pi);
        /* =========================
         *      العمليات المقارنة
         * ========================= */
        System.out.println("=========================\nComparative operations\n=========================");
        System.out.println(age==pi);
        System.out.println(age!=pi);
        System.out.println(age>= pi);
        System.out.println(age<=pi);
        System.out.println(age<pi);
        System.out.println(age<pi);
        /* =========================
         *      التعامل مع النصوص
         * ========================= */
        System.out.println("=========================\nString operations\n=========================");
        System.out.println( "name in UpperCase :"+ txt.toUpperCase());
        System.out.println( "name in LowerCase :"+ txt.toLowerCase());
        System.out.println( "the length is :"+ txt.length());
        /* =========================
         *    دوال مكتبة الرياضيات
         * ========================= */
        System.out.println("=========================\nMath methods\n=========================");
        System.out.println( "Math.max = " + Math.max(age, (int)pi));
        System.out.println( "Math.min= " + Math.min(age, (int)pi));
        System.out.println( "Math.sqr= " + Math.sqrt(age));
        System.out.println( "Math.abs= " + Math.abs(age));  
       /* =========================
            تنسيقات النصوص الخاصة
         * ========================= */
        System.out.println("=========================\nSpecial characters formatting\n=========================");
        System.out.println("line one\nline Two");
        System.out.println("text one\t text Two");
        System.out.println("From among my followers there will be some people who will consider illegal sexual intercourse,\n the wearing of silk, the drinking of alcoholic drinks and the use of musical instruments\n \"Sahih al-Bukhari 5590\"");
        System.out.println("My files are in \\mnt\\mydata\\unvirsity folder\\s004\\programing method\\home work");

    }
}