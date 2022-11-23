import java.util.*;
class TestClass{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String words[] = new String[n];
        for(int i=0;i<n;i++){
            words[i]=unique(sc.next());
        }
        int count = 0;
        for(int i=0;i<n;i++){
            int c1 = 1;
            for(int j=i+1;j<n;j++){
                if(words[i].equals(words[j])){
                    c1++;
                    words[i] = "";
                }
            }
            if(c1>1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static String unique(String s){
        ArrayList<Character> arr = new ArrayList<>();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        String n = "";
        for(int i=0;i<c.length;i++){
            if(!arr.contains(c[i])){
                arr.add(c[i]);
                n+=c[i];
            }
        }
        return n;
    } 
}

