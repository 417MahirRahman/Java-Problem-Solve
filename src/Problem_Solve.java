public class Problem_Solve {
    public static void main(String[] args) {
        //1.Sum of Array Elements:
        int[] a11={10,20,30,40,50};
        System.out.println("1.Sum of Array Elements:"+Sum(a11));

        //2.Largest Element in the Array is:
        int[] a12={10,5,58,26,19};
        System.out.println("\n2.Largest Element in the Array is:"+large(a12));

        //3.Count Even-Odd in a String:
        int[] a1 = {3,10,13,14,6,17,25};
        Even_Odd(a1);

        //4.Reverse an Array:
        int[] a2=Reverse();
        for (int i=0; i< a2.length; i++){
            System.out.print(a2[i]+" ");
        }

        //5.Factorial using Recursion:
        int a=5;
        System.out.println("\n\n5.The Factorial of "+a+" is: "+Factorial(a));

        //6.Checking  A String Palindrome or Not:
        String s1 = "Madam";
        System.out.println("\n6.The Word "+s1+" is "+Palindrome(s1));

        //7.Checking A Number Prime or not:
        Prime();

        //8.Creating Fibonacci Series using Recursion:
        int num = 8; //Range of Fibonacci Series
        System.out.println("\n8.The Fibonacci Series is:");
        for (int i=1; i<=num; i++){
            System.out.print(" "+Fibonacci(i)+" ");
        }

        //9.Linear Search:
        int[] ary = {12,5,13,17,25,9};
        System.out.println("\n\n9."+Linear_Search(ary));

        //10.Binary Search:
        int[] ary2 = {5,12,15,23,27,31,35,40};
        System.out.println("\n10."+Binary_Search(ary2));

        //11.Finding Duplicate Letter in a Word:
        String st = "JAVA";
        System.out.println("\n11."+Duplicate_Value(st));

        //12.Counting Vowel and Consonent in a Word:
        Vowel_Cons();

        //13.Multiplication Table:
        Multiplication_Table();

        //14.Sum of 2D Array Matrix:
        Sum_of_2D_Array();

        //15.Calculating Avarage of an Array:
        int[] ary3 = {12,13,15,17,19};
        System.out.println("\n15.The Avarage of the Array Number is: "+Avarage(ary3));


        //16.Checking a Year Leap-Year or Not:
        Leap_Year();

        //17.Printing a Pattern("Pyramid"):
        Pattern();

        //18.String Reverse:
        String_Reverse();

        //19.Checking a Number Armstrong or Not:
        Armstrong_Number();

        //20.Finding Maximum and Minimum Value of an Array:
        Max_And_Min();

        //21.Calculating Interest:
        int principle = 500 , time = 3;
        double rate = 0.2;
        System.out.println("\n21.The Amount of Interest is: "+Interest(principle,rate,time)+"Taka.");

        //22.Converting Temparature From Celcius to Farenheit and Vice-Versa:
        double Celcius = 30 , Farenheit = 72;
        Converting_Temperature(Celcius,Farenheit);

        //23.Checking a Character:
        char ch = '@';
        Check(ch);

        //24.Finding Second Maximum Number in an Array:
        System.out.println("\n24.The Second Maximum Number is: "+Second_Max());

        //25.Summation of Numbers in a String:
        String str = "ab13cd57lk";
        System.out.println("\n25.The Summation of the Number is: "+Addition(str));

    }
   //1.
    public static int Sum(int[] a1){
        int sum=0;
        for (int i=0; i< a1.length; i++){
            sum=sum+a1[i];
        }
        return sum;
    }

    //2.
    public static int large(int[] a1){
       int max = a1[0];
       for (int i=1; i< a1.length; i++){
           if (max < a1[i]){
               max=a1[i];
           }
       }
       return max;
    }

    //3.
    public static void Even_Odd(int[] a1){
        int count1=0 , count2=0;
        for (int i=0; i< a1.length; i++){
          if (a1[i]%2==0){
            count1++;
          }
          else{
              count2++;
          }
        }
        System.out.println("\n3.There are "+count1+" Even Numbers and "+count2+" Odd Numbers in the Array.");
    }

    //4.
    public static int[] Reverse(){
        int[] a2={3,10,13,14,6,17,25};
        int n= a2.length;
        int j = 0;
        int[] ar1 = new int[n];
        System.out.print("\n4.Before Reverse: ");
        for (int i=0; i < n; i++){
            System.out.print(a2[i]+" ");
        }
        System.out.println("");
        System.out.print("  After Reverse: ");
        for (int i=n-1; i>=0; i--){
            ar1[j] = a2[i];
            j++;
        }
        return ar1;
    }

    //5.
    public static int Factorial(int n){
        if (n>0){
            return n* Factorial(n-1);
        }
        else {
          return 1;
        }

    }

    //6.
    public static String Palindrome(String s1){

        String s2 = "";
        for (int i=s1.length()-1; i>=0; i--){
            s2=s2+s1.charAt(i);
        }
        if (s1.equalsIgnoreCase(s2)){
            return "Palindrome";
        }
        return "Not Palindrome";
    }

    //7.
    public static void Prime(){
        int n=13, count=0;
        for (int i=2; i<n; i++){
           if (n%i==0) count++;
        }
        if(count==0){
            System.out.println("\n7."+n+" is a Prime Number.");
        }
        else{
            System.out.println("\n7."+n+" is not a Prime Number.");
        }
    }

    //8.
    public static int Fibonacci(int n){
        if (n==1){
            return 0;
        } else if (n==2 || n==3) {
            return 1;
        }else{
            return (Fibonacci(n-1) + Fibonacci(n-2));
        }
    }

    //9.
    public static boolean Linear_Search(int[] a1){
        int num = 13;
        for (int i=0; i<a1.length; i++){
            if (a1[i] == num){
                return true;
            }
        }
        return false;

    }

    //10.
    public static boolean Binary_Search(int[] a1){
        int num = 13;
        int left = 0, right= a1.length-1, mid=0;
        while (left <= right){
            mid = (left + right) / 2;
            if (num == a1[mid]){
                return true;
            } else if (num < a1[mid]) {
                right = mid-1;
                left=left;
            }else {
                left = mid+1;
                right=right;
            }
        }
        return false;
    }

    //11.
    public static boolean Duplicate_Value(String s1){
        int count=0;
        char[] str = new char[10];
        for (int i=0; i<s1.length()-1; i++){
            str = new char[]{s1.charAt(i)};
        }
        for (int j=0; j<s1.length()-1; j++){
            for (int k=0; k<s1.length()-1; k++){
                if (s1.charAt(j)==s1.charAt(k)){
                    count++;
                }
            }
        }
        if (count>0) return true;
        else return false;
    }

    //12.
    public static void Vowel_Cons(){
        String s1 = "BANGLADESH";
        int count1=0 , count2=0;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U'){
                count1++;
            }
            else{count2++;}
        }
        System.out.println("\n12.There are "+count1+" Vowels and "+count2+" Consonents in "+s1+" Word");
    }

    //13.
    public static void Multiplication_Table(){
        int n=5;
        System.out.println("\n13.Multiplication Table of 5:");
        for (int i=1; i<=10; i++){
            System.out.println("    "+n+" * "+i+" = "+n*i);
        }
    }

    //14.
    public static void Sum_of_2D_Array(){
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{10,11,12},{13,14,15},{16,17,18}};
        int[][] array3 = new int[3][3];
        System.out.println("\n14.Sum of 2D Array:");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(" "+array3[i][j]+" ");
            }
            System.out.println("");
        }
    }

    //15.
    public static float Avarage(int[] a1){
        int n= a1.length;
        int sum=0;
        float Avg;
        for (int i=0; i < n ; i++){
            sum=sum+a1[i];
        }
        Avg=(float)sum/n;
        return Avg;
    }

    //16.
    public static void Leap_Year(){
        int n=2005;
        if (n % 4 == 0){
            System.out.println("\n16."+n+" is a Leap-Year.");
        } else if (n % 100 == 0) {
            System.out.println("\n16."+n+" is a Leap-Year.");
        } else if ((n % 400) == 0) {
            System.out.println("\n16."+n+" is a Leap-Year.");
        }else {
            System.out.println("\n16."+n+" is not a Leap-Year.");
        }

    }

    //17.
    public static void Pattern(){
        int n = 4;
        System.out.println("\n17.Pattern: ");
    for (int row=1; row<=n; row++){
        for (int col=1; col<=(2*n-1); col++){
            if (col >= n-(row-1) && col <= n+(row-1)){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    }

    //18.
    public static void String_Reverse(){
        String s1 = "BANGLADESH";
        System.out.print("\n18.String Before Reverse: ");
        for (int i=0; i<s1.length(); i++){
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.print("\n   String After Reverse : ");
        for (int i=s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i)+" ");
        }

    }

    //19.
    public static void Armstrong_Number(){
        int n = 407;
        int sum1=0, sum2=0, rem, a;
        a=n;
        while(a != 0){
            rem = a % 10;
            sum1 = sum1 + (rem * rem * rem);
            a=(a - rem) / 10;
            sum2 = sum2 + sum1;
            sum1=0;
        }
        if (sum2==n){
            System.out.println("\n\n19.The Number "+n+" is an Armstrong Number.");
        }
        else {
            System.out.println("\n\n19.The Number "+n+" is not an Armstrong Number.");
        }
    }

    //20.
    public static void Max_And_Min(){
       int[] a1 = {12,5,21,17,35,8};
       int max = a1[0], min = a1[0];
       for (int i=1; i< a1.length; i++){
           if (max < a1[i]){
               max = a1[i];
           }
       }
        System.out.println("\n20.The Maximum value of the Array is: "+max);
        for (int i=1; i< a1.length; i++){
            if (min > a1[i]){
                min = a1[i];
            }
        }
        System.out.println("   The Minimum value of the Array is: "+min);
    }

    //21.
    public static double Interest(int principle, double rate, int time){
        double interest = (double)principle * rate * (double)time;
        return interest;
    }

    //22.
    public static void Converting_Temperature(double Celcius, double Farenheit){
        double f = ((9* Celcius)/5)+32;
        double c = (5*(Farenheit -32))/9;
        System.out.printf("\n22. The Value of "+ Celcius +" Celcius in Farenheit is %.2f ",f);
        System.out.printf("\n\tThe Value of "+ Farenheit +" Farenheit in Celcius is %.2f ",c);
    }

    //23.
    public static void Check(char ch){
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("\n\n23.The Input Character is Lower-Case Letter.");
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("\n\n23.The Input Character is Upper-Case Letter.");
        }else if (ch >= '0' && ch <= '9'){
            System.out.println("\n\n23.The Input Character is a Number.");
        }else {
            System.out.println("\n\n23.The Input Character is a Special-Case Character.");
        }
    }

    //24.
    public static int Second_Max(){
        int[] a1 = {12,5,9,15,23,7,33};
        int max = a1[0] , secmax=0;
        for (int i=1; i< a1.length; i++){
            if (max < a1[i]){
             max = a1[i];
            }
        }
        for (int i=0; i< a1.length; i++){
            if (a1[i] > a1[0] && a1[i] != max){
                secmax = a1[i];
            }
        }
        return secmax;
    }

    //25.
    public static int Addition(String str){
        int num = 0 , sum=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                continue;
            }
            else{
                num = num + (int) str.charAt(i) - (int) '0';
                sum = num +sum;
                num = 0;
            }
        }
       return sum;
    }
}
