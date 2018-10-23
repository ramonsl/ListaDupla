public class ListaDupla {
    Elemento inicio;
    Elemento fim;
    int qtd;


    public boolean add(Elemento e){
        if(this.inicio==null){
            this.inicio=e;
            this.fim=e;
            this.qtd++;
            return true;
        }else{
            //  Elemento aux=inicio;
            e.proximo=inicio;
            inicio.anterior=e;
            this.inicio=e;
            qtd++;
            return true;
        }
    }

    public boolean addFim(Elemento e){
        if(this.inicio==null){
            return add(e);
        }else{
            this.fim.proximo=e;
            e.anterior=this.fim;
            this.fim=e;
            qtd++;
            return true;
        }
    }

    
}
