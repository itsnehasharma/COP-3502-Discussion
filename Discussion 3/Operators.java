    
/**
 * COP3502 Discussion 3
 *
 * @author (Neha Sharma)
 * @version (January 29th, 2019)
 */
public class Operators
{  
    int a = 6, b = 25, c = 2, d = 3, e, f = 6;
    public void orderOfOperations()
    {
        e = a * c + b - d;
        //on the board: what is the output going to be?
        //what order do the numbers get calculated?
        System.out.println("a * c + b - d = " + e);
        
        e = d - b * c / d;
        //on the board: what is the output going to be?
        //what order do the numbers get calculated?
        System.out.println("d - b * c / d = " + e + "\n");
    }
    
    public void checkEquals(){
        //what does == do? what is the result of using it?
        System.out.println("a == f: " + (a == f));
        System.out.println("b == c: " + (b == c));
        System.out.println("c == d: " + (c == d) + "\n");
    }
    
    public void relationalOperators(){
        //what does >, <, and >= do? what is the result of using it?
        System.out.println("a > f: " + (a > f));
        System.out.println("b < c: " + (b < c));
        System.out.println("c >= d: " + (c >= d) + "\n");
    }
    
    public void logicalOperators(){
        //what does && do?
        System.out.println("a == f && b == c: " + (a == f && b == c));
        
        //what does || do?
        System.out.println("a == f || b == c: " + (a == f || b == c));
        
        //what is the precedence of the operators?
        System.out.println("a == f || b == c && c == d: " + (a == f || b == c && c == d) + "\n");  
    }
    
    public void comboOperators(){
        //what will be the outcome of each of these? (3 people)
        System.out.println("a >= f && b > c: " + (a >= f && b > c));
        
        System.out.println("a == f || c <= a: " + (a == f || c <= a));
        
        //what does the '!' operator mean?
        System.out.println("a < f || b >= c && c != d: " + (a < f || b >= c && c != d));
        
    }
    
    public void printNums(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f + "\n");
        
    }
    
    //what is debugging?
    //what is a breakpoint?
    public void debugOperators(){
        a = 6; b = 25; c = 2; d = 3; e = 0; f = 6;
    
        e = a * c + b - d;
        System.out.println("a * c + b - d = " + e);
        e = d - b * c / d;
        System.out.println("d - b * c / d = " + e);
        
        System.out.println(a == f);
        System.out.println(b == c);
        System.out.println(c == d);
        
        System.out.println(a > f);
        System.out.println(b < c);
        System.out.println(c >= d);
        
        System.out.println(a == f && b == c);
        System.out.println(a == f || b == c);
        System.out.println(a == f || b == c && c == d);
        
        System.out.println(a >= f && b > c);
        System.out.println(a == f || c <= a);
        System.out.println(a < f || b >= c && c != d);  


        
    }
    
    public void problem4(){
        //declare variables x,y,e, and alpha
        //initialize variables to 4, 10, 2.3, a respectfully
        
        
        //print the variable name and value separated by a tab so it looks like
        //x       4
        //y       10
        //e       2.3
        //alpha   a
    }
    
    public void problem5(){
        //1. Rename the method to logicalANDTruthTable()
        
        //create a formatted display for the truth table of Logical AND
        
        //what is a truth table? Do it on the board first
    }
}
