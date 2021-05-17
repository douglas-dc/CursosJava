
package com.douglas.aula36.relacionamentoEntreClasses;

public class PrincipalAgenda {
    
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        agenda.setNome("Agenda 2021");
        
        Contato contato1 = new Contato();
        contato1.setNome("Maria");
        contato1.setTelefone("99999-9999");
        contato1.setEmail("maria123@gmail.com");
        
        Contato contato2 = new Contato();
        contato2.setNome("João");
        contato2.setTelefone("99999-8888");
        contato2.setEmail("joao@gmail.com");
        
        Contato contato3 = new Contato();
        contato3.setNome("Carla");
        contato3.setTelefone("99999-5555");
        contato3.setEmail("carla777@gmail.com");
        
        Contato[] contatos = new Contato[3];
        contatos[0] = contato1;
        contatos[1] = contato2;
        contatos[2] = contato3;

        agenda.setContatos(contatos);
        if (agenda != null && agenda.getNome() != null) {
            System.out.println(agenda.getNome());
        }
                
                
        if (agenda != null && agenda.getContatos() != null) {
            for (Contato c : agenda.getContatos()) {
                System.out.println(c.getNome() + " " + c.getTelefone() + " " + c.getEmail());
            }
        }       
    }
    
}
