
package br.senac.rn.gerenciador.web;

import br.senac.rn.gerenciador.dao.EmpresaDAO;
import br.senac.rn.gerenciador.model.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cadastra")
public class CadastrarEmpresa extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
        PrintWriter writer = resposta.getWriter();
        writer.println("<html><body>");
        String empresa = requisicao.getParameter("empresa");
        writer.print("Cadastra Empresa");
        writer.println("<ul>");
        new EmpresaDAO().adiciona(new Empresa(empresa));         
        writer.print("Inserção feita com sucesso!");
        writer.println("</body></html>");
    }
    
}   
    
    
    


    
    

