package br.com.dojo.business;

import br.com.dojo.model.GameRanking;
import br.com.dojo.model.Player;

/**
 * @author Jefferson Gandolfi
 * @since 28/02/2016
 * 
 */
public interface RankBO {

	/**
	 * Retorna e atualiza as informacoes dos Players envolvidos na rodada.
	 * 
	 * @param logLineContent
	 * @param gameRanking
	 * @return rankingInformations
	 */
	public abstract Player getPKInformations(String logLineContent, GameRanking gameRanking);

}
