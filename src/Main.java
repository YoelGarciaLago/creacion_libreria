import com.damLibrerias.Calc;
import com.damLibrerias.Entrada;
import com.damLibrerias.Salida;

public class Main {
    
    public static void main(String[] args) {
        float [] lista = Entrada.elegirNúmeros();
        float n1 = lista[0], n2 = lista [1];
        System.out.println(Calc.Calc(n1,n2,1));;
    }
}