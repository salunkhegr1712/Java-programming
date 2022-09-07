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

        // to check between two or three outcome use | 
        // System.out.println("a".matches("A|%")); //false 
        // System.out.println("%".matches("A|%")); //true
// 
        // if you want to search in range 
        // System.out.println("Grs17".matches("G|r|s|1|7")); // false as it only check for single character 
        // so what is correct way 
        // System.out.println("Grs17".matches("[G-H][r-s][r-s][0-1][7-8]"));  //true 
        // but then following is better way to use it  
        // System.out.println("Grs17".matches("Grs17")); //true
    }
    
}
