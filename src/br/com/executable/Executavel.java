package br.com.executable;

import br.com.controller.BoletimController;
import br.com.controller.ProfissionalController;
import br.com.view.FrmLogin;

public class Executavel {

    public static void main(String[] args) {
        ProfissionalController profissional = new ProfissionalController();
        profissional.criarProfissionalPadrao();

        BoletimController boletimController = new BoletimController();
        boletimController.criarBoletim();

        new FrmLogin().setVisible(true);
    }
}
