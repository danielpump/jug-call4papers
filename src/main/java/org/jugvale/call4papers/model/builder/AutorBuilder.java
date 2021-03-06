package org.jugvale.call4papers.model.builder;

import org.jugvale.call4papers.model.impl.Autor;

/**
 * @author Pedro Hos
 *
 */
public class AutorBuilder {
	
	private Autor autor;
	
	public AutorBuilder() {
		autor = new Autor();
	}
	
	public Autor build() {
		return autor;
	}
	
	public AutorBuilder comNome(String nome) {
		autor.setNome(nome);
		return this;
	}
	
	public AutorBuilder comEmail(String email) {
		autor.setEmail(email);
		return this;
	}
	
	public AutorBuilder comTelefone(String telefone) {
		autor.setTelefone(telefone);
		return this;
	}
	
	public AutorBuilder comSite(String site) {
		autor.setSite(site);
		return this;
	}
	
	public AutorBuilder comMiniCV(String miniCurriculo) {
		autor.setMiniCurriculo(miniCurriculo);
		return this;
	}
	
}
