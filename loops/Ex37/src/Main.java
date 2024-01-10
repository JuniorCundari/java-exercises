import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int code;
        float height, weight;
        float higher = Float.MIN_VALUE, lower = Float.MAX_VALUE;
        float fatter = Float.MIN_VALUE, thinner = Float.MAX_VALUE;
        int codeHigher = 0, codeLower = 0, codeFatter = 0, codeThinner = 0;
        float sumHeight = 0, sumWeight = 0;

        int previousCode = 0; // adicionando variável para armazenar código anterior
        int count = 0;

        while (true) {
            while (true) {
                System.out.print("Digite o código do cliente: ");
                code = scan.nextInt();

                // verifica se o código digitado é 0, se sim encerra o programa.
                // no caso de ainda não tiver digitado nenhum código o programa informa que "Nenhum cliente foi inserido" e encerra.
                if (code == 0) {
                    break;
                }

                // insere a variável "code" no "previosCode" e verifica se algum "code" é igual
                if (code == previousCode ||
                        code == codeHigher || code == codeLower ||
                        code == codeFatter || code == codeThinner
                ) {
                    System.out.println("----------------------------------------");
                    System.out.println("Código inválido!");
                    continue; // Pede um novo código sem incrementar no count
                }

                System.out.print("Informe a altura: ");
                height = scan.nextFloat();

                // valida a altura máxima
                while (height > 2.20) {
                    System.out.println("Altura máxima 2,20 cm!");

                    System.out.print("Informe a altura: ");
                    height = scan.nextFloat();
                }

                System.out.print("Informe o peso: ");
                weight = scan.nextFloat();

                // valida o peso máximo
                while (weight > 250) {
                    System.out.println("Peso máximo 250 kg!");

                    System.out.print("Informe o peso: ");
                    weight = scan.nextFloat();
                }

                System.out.println("----------------------------------------");

                // soma as variáveis de altura e peso
                sumHeight += height;
                sumWeight += weight;

                // os passos abaixo verifica e atribui as variáveis de mais alto, mais baixo, mais gordo e mais magro
                if (height > higher) {
                    higher = height;
                    codeHigher = code;
                }

                if (height < lower) {
                    lower = height;
                    codeLower = code;
                }

                if (weight > fatter) {
                    fatter = weight;
                    codeFatter = code;
                }

                if (weight < thinner) {
                    thinner = weight;
                    codeThinner = code;
                }

                // atualiza o código anterior
                previousCode = code;
                count++;
            }

            if (count > 0) {
                // calculo das médias
                float averageHeight = sumHeight / count;
                float averageWeight = sumWeight / count;

                System.out.println("------------------------------------------------------");

                System.out.println("Cliente mais alto -> Código: " + codeHigher + " Altura: " + higher + " cm");
                System.out.println("Cliente mais baixo -> Código: " + codeLower + " Altura: " + lower + " cm");
                System.out.println("Cliente mais gordo -> Código: " + codeFatter + " Peso: " + fatter + " kg");
                System.out.println("Cliente mais magro -> Código: " + codeThinner + " Peso: " + thinner + " kg");
                System.out.println("Média das alturas: " + averageHeight + " cm");
                System.out.println("Média dos pesos: " + averageWeight + " kg");
            } else {
                System.out.println("Nenhum cliente foi inserido.");
            }

            System.out.println("------------------------------");

            System.out.print("Deseja continuar? (0 - sim / 1 - não) ");
            int next = scan.nextInt();

            if (next == 0) {
                // reseta os valores das variáveis
                higher = Float.MIN_VALUE; lower = Float.MAX_VALUE;
                fatter = Float.MIN_VALUE; thinner = Float.MAX_VALUE;
                codeHigher = 0; codeLower = 0; codeFatter = 0; codeThinner = 0;
                sumHeight = 0; sumWeight = 0;
                count = 1;
            } else {
                System.out.println("Encerrado");
                break;
            }
        }
    }
}