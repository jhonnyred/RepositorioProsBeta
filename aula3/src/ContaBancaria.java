class ContaBancaria{
    // ATRIBUTOS
    String id;
    double saldo;

    // MÉTODOS
    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido");
        }else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("voce nao possui saldo suficiente pra isso");
        }else{
            this.saldo -= valor;
        }
    }

    public void imprimir(){
        System.out.println(this.saldo);
    }

    
    // GETTERS
    public String getId(){
        return this.id;
    }

    public double getSaldo(){
        return this.saldo;
    }

    // SETTERS
    public void setId(String id){
        this.id = id;
    }
}