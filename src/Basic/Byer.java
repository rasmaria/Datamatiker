package Basic;

public class Byer {
    public static void main(String[] args){
        String a = "Umbrella";
        boolean per = false;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 'l'){
                per = true;
                break;
            }
        }
        System.out.println(per);

    }
}