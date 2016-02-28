package br.com.dojo.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.dojo.model.GameRanking;

/**
 * @author Jefferson Gandolfi
 * @since 28/02/2016
 * 
 */
public interface GameSystem {

	/**
	 * Retorna o dir do arquivo LOG
	 *  @return FileInputStream
	 * @throws FileNotFoundException
	 */
	public abstract FileInputStream getResourceFile() throws FileNotFoundException;

	/**
	 * Le o arquivo de log e retorna o obj GameRanking populado com as
	 * informações do arquivo.
	 * @return GameRanking
	 * @throws IOException
	 */
	public abstract GameRanking readFile() throws IOException;
}
