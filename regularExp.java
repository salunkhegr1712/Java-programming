public class regularExp {
    
    // first of all read regularExp.txt in resources folder 
    public static void main(String args[]){
        // System.out.println("hello world");
        // here in this code we will study about the code that is check that our string does follow the regular expression or not 
        // so "[]" this method only true if you check for single character and that perticualar character is
        // there in []
        // System.out.println("abc".matches("[abc]"));// false
        // System.out.println("a".matches("[abc]")); //true

        // use following method to check that string matches exactly or not use it for multiple characters
        // System.out.println("abc".matches("[abc][abc][abc]")); //true

        // if you want to check two strings are equal or not use this method in java you cant use == as it is
        // used to check reference 
        // System.out.println("abc".matches("abc")); //true
        // System.out.println("abc".matches("abcd")); //false

        // System.out.println("a".matches("[^abc]")); //FALSE
        //it is also check single character   
        // ^ = not in so if character is nit a or b or c return true 
        // System.out.println("Z".matches("[^abc]")); //true

        // if you want first character as any character and next is number use 
        // System.out.println("abc".matches(".")); //. is used to check only one character 
        // System.out.println("%".matches(".")); //true

        // System.out.println("abc".matches("."));

        // to check between two or three outcome use | it is just exactly same as the []
        // System.out.println("a".matches("[A%]")); //false 
        // System.out.println("%".matches("[A%]")); //true
// 
        // if you want to search in range 
        // System.out.println("Grs17".matches("G|r|s|1|7")); // false as it only check for single character 
        // so what is correct way 
        // System.out.println("Grs17".matches("[G-H][r-s][r-s][0-1][7-8]"));  //true 
        // but then following is better way to use it  
        // System.out.println("Grs17".matches("Grs17")); //true

        // meta character  

        // \d true if digit 
        // all meta character will check for single character not for entire string 
        // System.out.println("1".matches("\\d")); //true
        // System.out.println("a".matches("\\d")); //false  
        // System.out.println(" ".matches("\\d")); //false
        // System.out.println("%".matches("\\d")); //false

        // \D true if not digit 
        // System.out.println("1".matches("\\D")); //false
        // System.out.println("a".matches("\\D")); //true  
        // System.out.println(" ".matches("\\D")); //true
        // System.out.println("%".matches("\\D")); //true

        // \s true if character is space 
        // System.out.println("1".matches("\\s")); //false
        // System.out.println("a".matches("\\s")); //false 
        // System.out.println(" ".matches("\\s")); //true
        // System.out.println("%".matches("\\s")); //false


        // \S true if character is  not space 
        // System.out.println("1".matches("\\S")); //true
        // System.out.println("a".matches("\\S")); //true 
        // System.out.println(" ".matches("\\S")); //false
        // System.out.println("%".matches("\\S")); //true

        // // \w true if character is digit or alphabet
        // System.out.println("1".matches("\\w")); //true
        // System.out.println("a".matches("\\w")); //true 
        // System.out.println(" ".matches("\\w")); //false
        // System.out.println("%".matches("\\w")); //false

        // // \W true if character is not a digit or alphabet
        // System.out.println("1".matches("\\W")); //false
        // System.out.println("a".matches("\\W")); //false 
        // System.out.println(" ".matches("\\W")); //true
        // System.out.println("%".matches("\\W")); //true

        // now after this two as we have to limit ourself to the single character to expan our boundry we have
        // quantisers for regex 
        String s="abcd";

        // System.out.println(s.matches(".")); //false 
        // System.out.println(s.matches(".*"));//true
        // System.out.println(s.matches(".?"));// false
        // System.out.println(s.matches(".+"));// true 

        // System.out.println(s.matches("[abcd]"));//false
        // System.out.println(s.matches("[abcd]*")); //true
        // System.out.println(s.matches("[a-d]"));//false
        // System.out.println(s.matches("[a-d]*"));//true

        // System.out.println(s.matches("\\w"));//false
        // System.out.println(s.matches("\\w*"));//true
        String z="12345";
        // System.out.println(z.matches("[0=9]"));//false
        // System.out.println(z.matches("[0-9]*"));//true
        // System.out.println(z.matches("\\d"));//false
        // System.out.println(z.matches("\\d*"));//true

        String zz="Grs1712";
        // System.out.println(zz.matches("[a-zA-Z0-9]")); //false
        // System.out.println(zz.matches("[a-zA-Z0-9]*")); //true 
        // System.out.println(zz.matches("[a-zA-Z0-9]+")); //true 

        // if you want to check suffix prefix or substring of string 
        // zz="ghanshamsalunkhe@gmail.com";
        // System.out.println(zz.matches("sham.*")); //false

        // FOR prefix 
        // System.out.println(zz.matches("ghansham.*")); //true
        // sham +.* any character after sham 
        // intermediate substring 
        // System.out.println(zz.matches(".*sham.*")); //TRUE

        // FOR suffix
        // it is very easy and good approach when you want to deal with string questions 
        // System.out.println(zz.matches(".*com")); //true 

        // also toverify that there shuould be no symbol before @
        // System.out.println(zz.matches("[a-z].*@.*"));//true 
        // System.out.println("#A@gmail.com".matches("[a-z0-9].*@.*"));//false 

        // string operations become far more eassy with use of java funcitonalities 
    }
    
}
