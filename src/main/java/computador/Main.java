package computador;

public class Main {

    public static void main(String[] args) {
        Computador pc = new ComputadorBuilder()
                .setProcessador("Ryzen 7 5800X")
                .setMemoriaGB(32)
                .setArmazenamento("SSD 1TB")
                .setPlacaVideo("RTX 4070")
                .setFonteWatts(750)
                .setGabinete("Mid Tower")
                .setSistemaOperacional("Linux")
                .build();

        System.out.println(pc);

        Computador basico = new ComputadorBuilder()
                .setProcessador("Core i3 12100")
                .setMemoriaGB(8)
                .build();

        System.out.println(basico);
    }
}
