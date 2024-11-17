public class Main {


    public static String obterResultado(int numero){
        String resultado = "";

        if (numero % 3 == 0){
            resultado +="Pim";
        }
        if (numero % 5 == 0){
            resultado +="Pam";
        }
        if (numero % 7 == 0){
            resultado +="Pum";
        }

        String numeroEmString = Integer.toString(numero);
        for (char digito : numeroEmString.toCharArray()){
            if (digito == '3'){
                resultado +="Pim";
            }else if (digito == '5'){
                resultado +="Pam";
            }else if (digito == '7'){
                resultado +="Pum";
            }
        }

        if (resultado.isEmpty()){
            return numeroEmString;
        }else {
            return resultado;
        }
    }
}
