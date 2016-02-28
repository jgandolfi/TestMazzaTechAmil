package br.com.dojo.view;

import br.com.dojo.model.GameRanking;
/**
 * @author Jefferson Gandolfi
 * @since 28/02/2016
 * 
 */
public interface RankingView {

	/**
	 * Metodo responsavel por montar o StringBuilder de saida e
	 * chamar a impressao do mesmo.
	 * @param gameRanking
	 */
	public void printReport(GameRanking gameRanking);
}
