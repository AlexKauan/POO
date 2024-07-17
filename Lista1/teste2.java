package Lista1;

public class teste2 {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,-5};
        int count = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > 0){
                count++;
            }
        }
        System.out.println("É o Baki retornou: " + count);
    }
}
