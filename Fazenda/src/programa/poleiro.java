package programa;

public class poleiro {
    public static void main(String[] args) {
        double sf = 100;
        double tf = 121;
        double qf = 117;

        double mediaDiariaDeOvos = (sf + tf + qf) / 3;
        double mediaMensalDeOvos = mediaDiariaDeOvos * 30;
        
        double lucroPorOvo = 0.18;
        double lucroMensalPorOvo = lucroPorOvo * mediaMensalDeOvos;

        System.out.printf("Média de ovos diário: %.0f%n", mediaDiariaDeOvos);
        System.out.printf("Média de ovos mensal: %.0f%n", mediaMensalDeOvos);
        System.out.printf("Lucro mensal de ovos: R$%.2f%n", lucroMensalPorOvo);

    }
}
