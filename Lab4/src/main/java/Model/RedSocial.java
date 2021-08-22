package Model;

public interface RedSocial {
    boolean post(String tipoPublicacion,String contenido);
    boolean follow(String nombreUsuarioASeguir);
    boolean share(int idPost);



}
