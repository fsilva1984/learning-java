package edu.stream.supplier.ebooks;

import java.util.function.Supplier;

public class LibraryEbook {
	private Supplier<Ebook> ebook;
	
	public LibraryEbook(Supplier<Ebook> ebook) {
		super();
		this.ebook = ebook;
	}

	public Ebook getEbook() {
		if (ebook != null) {
			return ebook.get();
		} else {
			throw new IllegalStateException("No Ebook supplier set!");
		}
	}
}
