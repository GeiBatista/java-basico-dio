public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("4276064");
            System.out.println(cepFormatado);
        } catch (ExcecoesCustomizadas e) {
            System.out.println("O cep não corresponde com as regras de negócio!");
        }
    }
    static String formatarCep(String cep) throws ExcecoesCustomizadas{
        if(cep.length() != 8)
        throw new ExcecoesCustomizadas();

        return "42.760-064";
    }
    
}
