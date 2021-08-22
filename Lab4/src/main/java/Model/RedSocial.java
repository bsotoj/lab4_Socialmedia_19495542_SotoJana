package Model;

public interface RedSocial {
    boolean post(String tipoPublicacion,String contenido);
    boolean follow(String nombreUsuarioASeguir);
    void share(int idPost);



}
