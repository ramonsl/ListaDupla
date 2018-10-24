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

    public boolean add(Elemento e, int pos){
        if(this.inicio==null || pos<=0){
            return add(e);
        }
        if (pos>this.qtd){
            return addFim(e);
        }
        Elemento aux=this.inicio;
        for (int i=0;i<pos;i++){
            aux=aux.proximo;
        }
        e.anterior= aux.anterior;
        aux.anterior.proximo =e;
        e.proximo = aux;
        aux.anterior=e;
        this.qtd++;
        return true;
    }


    public boolean del()

}
