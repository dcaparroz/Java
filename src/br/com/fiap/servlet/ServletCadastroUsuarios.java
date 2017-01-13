package br.com.fiap.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Usuario;

@WebServlet("/admin/cadUsuarios")
public class ServletCadastroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("mensagem", "Chamada realizada pelo servlet");
		request.getRequestDispatcher("cadUsuarios.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String senha = request.getParameter("senha");
			int nivel = Integer.parseInt(request.getParameter("nivel"));
			
			Usuario usuario = new Usuario();
			usuario.setNome(nome);
			usuario.setSenha(senha);
			usuario.setNivel(nivel);
			
			GenericDao<Usuario> dao = new GenericDao<>(Usuario.class);
			dao.adicionar(usuario);
			
			request.setAttribute("mensagem", "Usu�rio " + 
			                 usuario.getId() + " inclu�do com sucesso");
			
			request.getRequestDispatcher("cadUsuarios.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadUsuarios.jsp").forward(request, response);

		}
	}
}
