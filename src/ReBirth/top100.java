package ReBirth;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class top100 {

    public static int reverseNumber(int n)
    {
        int reverse=0;
      while(n!=0)
      {
         reverse = reverse*10;
         reverse = reverse + n%10;
         n = n/10;
      }
      return reverse;
    }

    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
       // breaks(n);
        //continueBreak(n);
        //2writeAllAlphabet();
        primeNumbers(n);
       // factorialUsingRecursion(5);
        createHashTable();
        stringToDate("22/03/21");
        createList();
        LinkedList();
        
    }

    public static void breaks(int n)
    { 
      

        while(n<9)
        {
        if(n==0)
        {
            System.out.println("you entered "
            +n);
            break;
        }
        System.out.println("you entered "
            +n
        );
    }
    }
    
    public static void continueBreak(int n)
    {
      while(n>0)
      {
        if(n<6){
            System.out.println("the number is less than 6");
            continue;
        }else
            System.out.println("the number is greater than 6");
            break;
      }
    }

    public static void writeAllAlphabet()
    {
        char ch;
        for(ch='a';ch<='z';ch++)
        {
            System.out.println("alphabets are "+ch);
        }

        // for(char c:ch){

        // }
    }

    public static void primeNumbers(int n)
    {
        //Prime numbers are 1,2,3,5,7,11,13
        //Numbers which are divisible by 1 and itself are prime number
        if(n<=2|| n%2==1)
        {
            System.out.println("Number is Prime");
        }
        else
            System.out.println("Number is not Prime");

    }

    public static void printAllPrime(int n)
    {
        //lets n=8 
        // P=1,2,3,5,7
        //NP=4,6,8  
        // if n>2 then all even number non prime 
        //n%2==1 then Prime 

        while(n>1)
        {
            if(n>2 || n%2==0)
            {
                System.out.println("All numbers non prime");
            }else
            {

            }
        }

    }

    public List<Integer> sieveOfEratosthenes(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i;j<=n;j=j+1)
                {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime[i])primes.add(i);
        }
        return primes;
    }  
    
    public static void reversestr1(String str)
    {
        char[] ch = str.toCharArray();
        int right =0;
        int left=str.length();
       while(left<right)
       {
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        left++;
        right--;
       }
    }

    public static void reverseStr2(String str){
        char[] ch = str.toCharArray();
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse = reverse+ str.charAt(i);
            System.out.println("the reverse of array is :" +reverse);
        }


    }   

    public static int[][] addTwoDArray(int[][] a, int[][]b)
    {
        int[][] sum = new int[a.length][b.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                sum[i][j] = a[i][j]+b[i][j]; 
            }
        }
        for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum.length;j++)
            {
                System.out.println(sum[i][j]+"");
            }
        }
        return sum;
    }
    public static void validateage(int age) {
        if (age > 18) {
            throw new ArithmeticException();
        } else {
            System.out.println("welcome ji");
        }
    }

    public static void throwtest1() {
        int age = 20; // Example age value
        validateage(age);
    }

    // public static int factorialUsingRecursion(int n)
    // {
    //     if(n==1)
    //     {
    //         return 1;
    //     }else
    //         return factorialUsingRecursion(n*factorialUsingRecursion(-1));
    // }


    public static void createHashTable()
    {
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(1,"Aartha" );
        hashtable.put(2, "Taani");
        hashtable.put(3, "Mumma");

        for(Map.Entry m:hashtable.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }

    public static void stringToDate(String date) throws Exception
    {
        date = "31/02/11";
        SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date date1 =  format.parse(date);
        System.out.println(date1);
        
    }

    public static void createList()
    {
        List<String> list = new ArrayList<>();
        list.add("Aartha");
        list.add("Koyla");
        list.add("Mumma");
        list.add("Papa");

        Iterator it = list.iterator();
        while (it.hasNext()) {
           System.out.println(it.next());
            
        }

        for(String str:list)
        {
            System.out.println("here printing thrown the for each :" +str);
        }
    }

    public static void LinkedList()
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hero");
        list.add("worldHero");
        list.add("wonderWoman");

        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println("LinkedList elements are: "+it.next());
        }

    }
}


