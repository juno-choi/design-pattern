package com.simol.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books;
    private int last;

    public BookShelf() {
        this.books = new ArrayList<>();
        this.last = 0;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        this.last++;
    }

    public int getLength() {
        return last;
    }

    public List<Book> getBooks() {
        return this.books.stream().toList();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
