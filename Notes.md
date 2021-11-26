## Spring


### Java Function Interface play

```aidl
public class Play {

    public static void main(String[] args) {
        getSum1(5);
        funcGetSum(Play::getSum1, 3);
        funcGetSum(Play::getSum3, 3);
        System.out.println(funcGetSum((nr) -> nr + 7, 3)); // anonymous

        // -------
        // JS callback inspired example https://www.w3schools.com/js/js_callback.asp -------
        // calling two function
        int result = sumTest(3);
        updateCounter(result);

        // stuck with updateCounter implementation
        sumTestWithUpdate(3);

        funcSumCallback(3, Play::updateCounter);
        
        // ---- returning a function
        Function<Integer, Integer> square = squareFunction;
        System.out.println(square.apply(2));
    }

    public static int getSum1(int nr) {
        System.out.println("sum" + nr + 1);
        return nr + 1;
    }

    public static int getSum3(int nr) {
        System.out.println("sum" + nr + 3);
        return nr + 3;
    }

    public static int funcGetSum(Function<Integer, Integer> fun, int nr) {
        return fun.apply(nr);
    }

    // JS inspired example ---------

    private static int counter = 0;

    public static void updateCounter(int nr) {
        counter = counter + nr;
    }

    public static int sumTest(int nr) {
        return nr + 5;
    }

    public static void sumTestWithUpdate(int nr) {
        int result = nr + 5;
        updateCounter(result);
    }

    public static void funcSumCallback(int nr, Consumer<Integer> fun) {
        int result = nr + 5;
        fun.accept(result);
    }
    
    
   // ---- returning a function
   
   public static final Function<Integer, Integer> squareFunction = input -> input * 2;
}
```

