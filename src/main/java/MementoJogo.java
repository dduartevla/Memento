public class MementoJogo {

    private EstadoJogo estado;

    public MementoJogo(EstadoJogo estado){
        if (estado == null){
            throw new IllegalArgumentException("Objeto EstafoJogo é nulo!");
        }
        this.estado = estado;
    }

    public EstadoJogo getEstado(){
        return estado;
    }
}
