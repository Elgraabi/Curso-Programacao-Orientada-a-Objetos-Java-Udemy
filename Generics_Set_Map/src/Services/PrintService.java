package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	// Atributos
	private List<T> list = new ArrayList<T>();

	// Metodos Especificos
	public T first() {
		if (this.list.isEmpty()) {
			throw new IllegalStateException("List is empy");
		}
		return this.list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(this.list.get(0));
		}
		for (int i = 1; i < this.list.size(); i++) {
			System.out.print(", " + this.list.get(i));
		}
		System.out.println("]");
	}
	
	public void addValue(T object) {
		this.list.add(object);
	}
	
	// Metodos Especiais
	public PrintService(List<T> list) {
		super();
		this.list = list;
	}

	public PrintService() {
		super();
	}

	public List<T> getList() {
		return list;
	}
	
}
