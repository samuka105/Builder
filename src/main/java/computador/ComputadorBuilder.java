package computador;

public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build() {
        if (computador.getProcessador().equals("")) {
            throw new IllegalArgumentException("Processador é obrigatório");
        }
        if (computador.getMemoriaGB() <= 0) {
            throw new IllegalArgumentException("Memória inválida");
        }
        return computador;
    }

    public ComputadorBuilder setProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder setMemoriaGB(int memoriaGB) {
        computador.setMemoriaGB(memoriaGB);
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    public ComputadorBuilder setPlacaVideo(String placaVideo) {
        computador.setPlacaVideo(placaVideo);
        return this;
    }

    public ComputadorBuilder setFonteWatts(int fonteWatts) {
        computador.setFonteWatts(fonteWatts);
        return this;
    }

    public ComputadorBuilder setGabinete(String gabinete) {
        computador.setGabinete(gabinete);
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        computador.setSistemaOperacional(sistemaOperacional);
        return this;
    }
}
