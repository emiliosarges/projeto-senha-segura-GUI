import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class PorjetoGeradorDeSenhaGUI extends Application {
	
	@Override
	public void start(Stage palco) {
		palco.setTitle("Gerador de Senhas");

		Label labelTamanhoSenha = new Label("Tamano da senha");
		TextField campoTamanhoSenha = new TextField();
		campoTamanhoSenha.setStyle("-fx-text-fill: cyan; -fx-background-color: black");
		campoTamanhoSenha.setText("8");

		Label labelSenhaGerada = new Label("Senha Gerada");
		TextField campoSenhaGerada = new TextField();
		campoSenhaGerada.setEditable(false);

		Button botaoGerar = new Button("Gerar Senha: ");
		botaoGerar.setOnAction(e -> {
		int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText());
		String senha = ProjetoGeradorDeSenhas.gerarSenha(tamanhoSenha);
		campoSenhaGerada.setText(senha);
		});

		VBox vBox = new VBox(labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelSenhaGerada, campoSenhaGerada);
		vBox.setSpacing(10);
		vBox.setPadding(new Insets(10));
		Scene cena = new Scene(vBox, 300, 180);
		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}