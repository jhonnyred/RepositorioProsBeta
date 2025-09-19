public class Funcoes{
    public static void main(String[] args){
        String result = enviarEmail("mama eu otario");
        System.out.println(result);
    }

    public static String enviarEmail(String assunto){
        String destinatario = "cu@yopmail.com";
        String remetente = "fodase@email.com";
        String corpo = "fodaseeeeeee";
        String email = assunto +"\n"+ destinatario +"\n"+ remetente +"\n"+ corpo;

        return email; 
    }
}