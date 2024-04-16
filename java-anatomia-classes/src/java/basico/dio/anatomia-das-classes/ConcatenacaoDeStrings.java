public class ConcatenacaoDeStrings {
    public static void main(String[] args) {
        String estado = "Bahia";
        String capital = "Salvador";
        String estadoCapital = capitalEEstado(capital, estado);

        System.out.println(estadoCapital);

    }

    public static String capitalEEstado(String capital, String estado){
        return capital.concat(", ").concat(estado);
    }    
}
