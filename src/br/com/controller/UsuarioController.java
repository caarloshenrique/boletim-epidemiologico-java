package br.com.controller;

import br.com.dao.UsuarioDao;
import br.com.dao.UsuarioDaoImpl;
import br.com.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioController {

    UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public void salvarUsuario(Usuario usuario) {
        if (usuario != null && !usuario.getEmail().equals("")
                && !usuario.getSenha().equals("")
                && usuario.getProfissionalId() != 0) {
            usuarioDao.salvarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void alterarUsuario(Usuario usuario) {
        if (usuario != null && !usuario.getEmail().equals("")
                && !usuario.getSenha().equals("")
                && usuario.getProfissionalId() != 0) {
            usuarioDao.alterarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void excluirUsuario(int id) {
        if (id != 0) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
            } else {
                usuarioDao.excluirUsuario(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um usuário para ser excluído!");
        }
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> lista = new ArrayList<Usuario>();
        lista = usuarioDao.getUsuarios();
        return lista;
    }

    public boolean login(String email, String senha) {
        boolean acesso = false;
        if (!email.equals("") && !senha.equals("")) {
            acesso = usuarioDao.login(email, senha);
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
        return acesso;
    }

    public void criarUsuarioPadrao(int profissionalId) {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = getUsuarios();
        if (usuarios.isEmpty()) {
            Usuario novoUsuario = new Usuario();
            novoUsuario.setEmail("admin@covid19.gov.br");
            novoUsuario.setSenha("admin");
            novoUsuario.setProfissionalId(profissionalId);
            salvarUsuario(novoUsuario);
        }
    }

    public int buscarUltimoId() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = getUsuarios();

        if (usuarios.isEmpty()) {
            return 0;
        } else {
            int id = usuarios.get(usuarios.size() - 1).getId();
            return id;
        }
    }
}
