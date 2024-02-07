import java.util.Scanner;

public class Uni6Exe5 {

    public static void main(String[] args) {
        String[] rapaz = new String[5];
        rapaz[0] = "Gosta de música sertaneja?";
        rapaz[1] = "Gosta de futebol?";
        rapaz[2] = "Gosta de seriados?";
        rapaz[3] = "Gosta de redes sociais?";
        rapaz[4] = "Gosta da Oktoberfest?";
        String[] mulher = new String[5];
        mulher[0] = "Gosta de música sertaneja?";
        mulher[1] = "Gosta de futebol?";
        mulher[2] = "Gosta de seriados?";
        mulher[3] = "Gosta de redes sociais?";
        mulher[4] = "Gosta da Oktoberfest?";

        lerResp(rapaz, mulher);
        int afinidade = calcAfin(rapaz, mulher);
        resultado(afinidade);
    }

    public static void lerResp(String[] rapaz, String[] mulher) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("reponda com  SIM, NÃO ou IND (vez do rapaz)");
        for (int i = 0; i < rapaz.length; i++) {
            System.out.print(rapaz[i]);
            rapaz[i] = teclado.next().toLowerCase();

        }

        System.out.println("reponda com  SIM, NAO ou IND (vez do Moça)");
        for (int o = 0; o < mulher.length; o++) {
            System.out.print(mulher[o]);
            mulher[o] = teclado.next().toLowerCase();

        }
        teclado.close();
    }

    public static int calcAfin(String[] rapaz, String[] mulher) {
        int afinidade = 0;
        for (int i = 0; i < rapaz.length; i++) {

            if (rapaz[i].equals("sim") && mulher[i].equals("sim") || rapaz[i].equals("nao") && mulher[i].equals("nao")
                    || rapaz[i].equals("ind") && mulher[i].equals("ind")) {
                afinidade += 3;
            }

            if (rapaz[i].equals("ind") && mulher[i].equals("sim") && mulher[i].equals("nao")) {
                afinidade += 1;
            }

            if (mulher[i].equals("ind") && rapaz[i].equals("sim") && rapaz[i].equals("nao")) {
                afinidade += 1;
            }

            if (mulher[i].equals("sim") && rapaz[i].equals("nao")) {
                afinidade -= 2;
            }

            if (rapaz[i].equals("sim") && mulher[i].equals("nao")) {
                afinidade -= 2;
            }

        }
        return afinidade;
    }

    public static void resultado(int afinidade) {

        System.out.println("afinidade =" + afinidade);
        System.out.println(" ");
        if (afinidade == 15) {
            System.out.println("Casem!");
        }

        else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        }

        else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :( ");
        }

        else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        }

        else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        }

        else if (afinidade == -10) {
            System.out.println("Vocês se odeiam");
        }

    }

}
