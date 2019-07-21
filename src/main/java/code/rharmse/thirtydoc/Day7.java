package code.rharmse.thirtydoc;

//Complete this code or write your own from scratch
import java.util.*;

class Day7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name.toLowerCase(), phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (map.get(s.toLowerCase()) == null) {
                System.out.println("Not found");
            } else {
                System.out.printf("%s=%d\n", s.toLowerCase(), map.get(s.toLowerCase()));
            }
        }
        in.close();
    }
}

