public class Jogo {

    private CaretakerJogo caretaker;

    public Jogo(){
        caretaker = new CaretakerJogo();
    }

    public void iniciarJogo(EstadoJogo estadoInicial){
        if (estadoInicial == null){
            throw new IllegalArgumentException("Estado inicial é nulo!");
        }
        caretaker.addMemento(new MementoJogo(estadoInicial));
    }

    public void salvarJogo(EstadoJogo estado){
        if (estado == null){
            throw new IllegalArgumentException("Estado é nulo!");
        }
        caretaker.addMemento(new MementoJogo(estado));
    }

    public EstadoJogo carregarJogo(int indice){
        MementoJogo memento = caretaker.getMemento(indice);

        return memento.getEstado();
    }
}
