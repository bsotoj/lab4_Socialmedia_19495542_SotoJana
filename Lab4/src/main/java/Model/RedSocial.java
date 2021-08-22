package Model;

public interface RedSocial {
    boolean post(String tipoPublicacion,String contenido);
    void follow(String nombreUsuarioASeguir);
    void share(int idPost);



}
