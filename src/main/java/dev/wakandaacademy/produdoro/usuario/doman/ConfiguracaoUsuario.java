package dev.wakandaacademy.produdoro.usuario.doman;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter
public class ConfiguracaoUsuario {

	private Integer tempoMinutoFoco;
	private Integer tempoMinutoPausaCurta;
	private Integer tempoMinutoPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
}
