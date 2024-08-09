package estruturasCondicionais;

public class SistemaMedida {
    public static void main(String[] args) {

        String tamanho = "m";

        switch (tamanho) {
            case "p":
                System.out.println("Pequeno");
                break;
            case "m":
                System.out.println("Médio");
                break;
            case "g":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
