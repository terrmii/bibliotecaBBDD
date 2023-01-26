package clases;
/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public class Libro {
	
	private int id;
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro() {
		
	}
	
	public Libro(int id, String titulo, String autor, int numPag) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	
	
}
