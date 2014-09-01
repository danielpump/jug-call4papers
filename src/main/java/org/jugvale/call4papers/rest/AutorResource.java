package org.jugvale.call4papers.rest;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jugvale.call4papers.model.impl.Autor;
import org.jugvale.call4papers.model.impl.Paper;

@Path("autor")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AutorResource {

	@POST
	@PermitAll
	public Response criar(Autor autor);

	@GET
	@PermitAll
	public List<Autor> listarTodos();

	@DELETE
	@Path("/{id}")
	@RolesAllowed({ "ADMINISTRADOR" })
	public void apagaPorId(@PathParam("id") Long id);

	@GET
	@Path("/{id}")
	@PermitAll
	public Autor buscaPorId(@PathParam("id") Long id);

	@GET
	@Path("/{autorId}/papers")
	@PermitAll
	public List<Paper> listaPapersPorAutor(@PathParam("autorId") Long autorId);

	@PUT
	@Path("/{id}")
	@RolesAllowed({ "ADMINISTRADOR", "AUTOR" })
	public void atualizar(@PathParam("id") long id, Autor entidade);

}