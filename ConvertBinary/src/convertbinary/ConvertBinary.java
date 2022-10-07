package convertbinary;

import java.util.Scanner;
import java.util.Stack;
//import br.unicap.edi.ana.Stack;
import br.unicap.edi.ana.LSENode;

public class ConvertBinary {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack();
        Scanner in = new Scanner(System.in);
        int num, resto, quoc;
        System.out.println("Digite um número inteiro em decimal: ");
        num = Integer.parseInt(in.nextLine());
        do {
            quoc = num / 2;
            resto = num % 2;
            pilha.push(resto);
            num = quoc;
        } while (quoc != 0);
        while (!pilha.isEmpty()) {
            resto = pilha.pop();
            System.out.print(resto);
        }
    }
}
