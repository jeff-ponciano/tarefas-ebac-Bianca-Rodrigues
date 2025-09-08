public class MoveisPlanejados {
    private String material;
    private String cor; 
    private double largura;
    private double altura;
    private double profundidade;
    private boolean temPortas;
    
    
    /*
     * Getters e Setters
     */
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
    public boolean isTemPortas() {
        return temPortas;
    }
    public void setTemPortas(boolean temPortas) {
        this.temPortas = temPortas;
    } 


    /**
     * Método para exibir os detalhes do móvel planejado
     */
    public void exibirDetalhes() {
        System.out.println("Detalhes do Móvel Planejado:");
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("Largura: " + largura + " metros");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Profundidade: " + profundidade + " metros");
        System.out.println("Tem Portas: " + (temPortas ? "Sim" : "Não"));
    }

    /**
     * Método para calcular o móvel pkanejado
     * @return
     */ 
    
    public  double calcularVolume(){
        return largura * altura * profundidade;

      }


        /**
         * Método para cadastrar características do móvel planejado 
         * @param material
         * @param cor
         * @param altura
         * @param largura
         * @param profundidade
         * @param temPortas
         */
     public void cadastrarMovel(String material, String cor, double altura, double largura, double profundidade, boolean temPortas){
        setMaterial(material);
        setCor(cor);
        setAltura(altura);
        setLargura(largura);
        setProfundidade(profundidade);
        setTemPortas(temPortas);
     }

     

     
    
}
