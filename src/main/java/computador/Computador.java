package computador;

public class Computador {

    private String processador;
    private int memoriaGB;
    private String armazenamento;
    private String placaVideo;
    private int fonteWatts;
    private String gabinete;
    private String sistemaOperacional;

    public Computador() {
        this.processador = "";
        this.memoriaGB = 0;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaGB() {
        return memoriaGB;
    }

    public void setMemoriaGB(int memoriaGB) {
        this.memoriaGB = memoriaGB;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public int getFonteWatts() {
        return fonteWatts;
    }

    public void setFonteWatts(int fonteWatts) {
        this.fonteWatts = fonteWatts;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaGB=" + memoriaGB +
                ", armazenamento='" + armazenamento + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                ", fonteWatts=" + fonteWatts +
                ", gabinete='" + gabinete + '\'' +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                '}';
    }
}
