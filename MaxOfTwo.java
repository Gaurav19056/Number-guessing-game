public class MaxOfTwo {
    public static int maximum(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Max of 10 and 20 is " + 
            maximum(10, 20));    
            
        System.out.println("Max of 8 and 4 is " + 
            maximum(8, 4));      
            
        System.out.println("Max of -5 and -2 is " + 
            maximum(-5, -2));    
            
        System.out.println("Max of 7 and 7 is " + 
            maximum(7, 7));      
    }
}

