public class MementoJogo {

    private EstadoJogo estado;

    public MementoJogo(EstadoJogo estado){
        this.estado = estado;
    }

    public EstadoJogo getEstado(){
        return estado;
    }
}
