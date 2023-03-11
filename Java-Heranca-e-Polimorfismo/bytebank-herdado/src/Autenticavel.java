public abstract interface Autenticavel {

// Interface não pode possuir códigos concretos. Ex: private int senha, métodos com implementações
    public  void setSenha(int senha);
    public abstract boolean autentica(int senha);

}


