public class Menu {

    private Db banco;


    Menu(Db banco){
        this.banco = banco;
    }



    public void mainLoop(){
        
        while(true){

            System.out.println("\n");
            String op = Inputs.getInput("1. Listar Usuarios\n2. Cadastrar usuario\n3. Remover usuario\n4. Editar usuario\n0. Sair");
            System.out.println("\n");

            if (op.equals("1")){
                banco.listarUsuarios();
            }


            else if (op.equals("2")){
                String nome = Inputs.getInput("Nome: ");
                String idade = Inputs.getInput("Idade: ");

                banco.cadastrarUsuario(new Usuario(nome, idade));
            }


            else if (op.equals("3")){
                banco.listarUsuarios();

                banco.excluirUsuario(Inputs.getInputInt("Digite o id: ")-1);
            }


            else if (op.equals("4")){
                banco.listarUsuarios();

                int id = Inputs.getInputInt("Digite o id do usuario: ")-1;
                String name = Inputs.getInput("Digite o novo nome: ");

                banco.editarUsuario(id, name);
            }


            else if (op.equals("0")){
                break;
            }

            else{
                System.out.println("Invalido");
            }
        }
    }

}
