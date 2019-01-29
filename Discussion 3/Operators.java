    
/**
 * COP3502 Discussion 3
 *
 * @author (Neha Sharma)
 * @version (January 29th, 2019)
 */
public class Operators
{  
    int a = 6, b = 25, c = 2, d = 3, e, f = 6;
    
    public void escapeSequence(){
        //what is the escape sequence character?
        
        //what does it do?
        
        //how do you type a new line?
        System.out.println(" replace me ");
        
        //how do you type a tab?
        System.out.println(" replace me ");
        
        //how do you type a backslash?
        System.out.println(" replace me ");
        
        //how do you type a double quotation mark?
        System.out.println(" replace me ");
        
        
    }
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
        
        //what does % mean?
        //what will this output?
        System.out.println("5 % 2 = " + 5%2);
    }
    
    public void incAndDec(){
        int i = 0;
        
        //what does it mean to increment and decrement?
        
        //what is pre vs post increment or decrement?
        
        //what operator do you use to increment or decrement?
        
        //what will be the output of this sequence?
        //lets predice before running the sequence
        
        System.out.println("i = " + i + "\n");
        
        System.out.println("++i = " + ++i);
        System.out.println("i = " + i + "\n");
        
        System.out.println("i++ = " + i++);
        System.out.println("i = " + i + "\n");
        
        System.out.println("--i = " + --i);
        System.out.println("i = " + i + "\n");
        
        System.out.println("i-- = " + i--);
        System.out.println("i = " + i + "\n");
        
        
        
        
    }
    public void checkEquals(){
        //what does == do? what is the result of using it?
        System.out.println("a == f: " + (a == f));
        System.out.println("b == c: " + (b == c));
        System.out.println("c == d: " + (c == d) + "\n");
    }
    
    public void comparisonOperators(){
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
       int x = 4;
       int y = 20;
       int z = 5;
       
       int sum = x + y;
       
       int diff = y - z;
       
       int prod = x * 3;
       
       int quot = y / z;
       
       int mod = y % 3;
        
    }
    
    //take from notes
    
    public void variableTypes(){
        //declare and initialize for each of these values
        
        //1
        
        //6.3
        
        //a
        
        //-54
        
        //hello
        
        //false
        
    }
      
    //what is a truth table? Let's draw one on the board
}
