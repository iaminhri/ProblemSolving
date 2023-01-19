//Unsolved -> Try Later
public class Task3 {
    public Task3(){
        System.out.println("First: " + solution("BANANA"));
        System.out.println("Second: " + solution("asfc"));
    }

    public boolean doesContain(String str){
        int b = 0;
        int a = 0;
        int c = 0;

        for(char s : str.toCharArray()){
            if( s == 'B')
                b++;
            else if(s == 'A')
                a++;
            else if(s == 'N')
                c++;
        }

        return b >= 1 && a >= 3 && c >= 2;
    }

    public String deleteChars(String str){
        StringBuilder s = new StringBuilder();
        int a = 0, b = 0, n = 0;
        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'N'){
                if(a > 3 || b > 1 || n > 2){
                    s.append(str.charAt(i));
                }
            }
            else{
                s.append(str.charAt(i));
            }

            if(a < 3){
                if(s.charAt(i) == 'A'){
                    a++;
                }
            }
            else if(b < 1){
                if(s.charAt(i) == 'B'){
                    b++;
                }
            }
            else if(n < 2){
                if(s.charAt(i) == 'N'){
                    n++;
                }
            }
        }
        return s.toString();
    }

    public int solution(String S){
        int count = 0;
        if(!S.matches("[A-Z]+"))
            return 0;
        else{
            while(doesContain(S))
            {
                deleteChars(S);
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        new Task3();
    }
}
