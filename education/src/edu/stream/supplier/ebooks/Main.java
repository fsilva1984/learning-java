
package edu.stream.supplier.ebooks;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<Ebook> ebook = () -> new Ebook("Clean Code", "Robert C. Martin", 2008);
		
		LibraryEbook  library = new LibraryEbook(ebook);
		
		System.out.println(library.getEbook());
		
		System.out.println();
		
	
		
	}
}
