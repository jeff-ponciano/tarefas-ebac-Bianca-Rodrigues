public class Main {
    
    public static void main(String []args){
   
        Cliente cliente = new Cliente();
        cliente.setNome("Bianca");
        cliente.setCpf(123456789);
        cliente.setCep(12345678);
        cliente.setIdade(23);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("CEP: " + cliente.getCep());
        System.out.println("Idade: " + cliente.getIdade() + " anos");

        MoveisPlanejados moveis = new MoveisPlanejados();
        moveis.setMaterial("madeirra");
        System.out.println("Material: " + moveis.getMaterial());
    }

    
    
}
