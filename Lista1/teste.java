package Lista1;

public class teste {
    public static void main(String[] args) {
        int [] x = {2,3,5};
        int y = 3;

        for (int i = x.length - 1; i > 0; i--){
            if (x[i] == y){
                System.out.println("aqui : " + i);
            }else{
                System.out.println("Entrou aqui");
            }
        }

    }
}
