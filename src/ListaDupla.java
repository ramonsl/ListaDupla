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


    public boolean delInicio(){
        if(this.inicio==null){
            return false;
        }
        if(this.inicio.proximo==null){
            this.inicio=null;
            this.fim=null;
            qtd--;
            return true;
        }else {
            Elemento aux = inicio.proximo;
            inicio = aux;
            aux.anterior = null;
            qtd--;
            return true;
        }
    }
    public boolean delFim(){
        if (this.fim==null || this.qtd==1) {
          return   delInicio();
        }else{
            Elemento aux= this.fim;
            Elemento penultimo= aux.anterior;
            penultimo.proximo=null;
            ///segunda forma
            //  aux.anterior.proximo =null;
           //   this.fim =aux.anterior;
            ///terceira foma
            //this.fim.anterior.proximo=null;
           // this.fim=this.fim.anterior;

            this.fim = penultimo;
            qtd--;
            return true;

        }

    }
    public boolean delEmX(){

        
    }


}
