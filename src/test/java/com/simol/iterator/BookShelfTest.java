package com.simol.iterator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfTest {
    @Test
    void bookTest() {
        // given
        BookShelf bookShelf = new BookShelf();
        Book design = new Book("디자인 패턴");
        Book ddd = new Book("DDD");
        Book test = new Book("테스트 코드");
        bookShelf.appendBook(design);
        bookShelf.appendBook(ddd);
        bookShelf.appendBook(test);
        //when
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            System.out.println(b.getName());
        }

        for (Book book : bookShelf.getBooks()) {
            System.out.println(book.getName());
        }
        //then
        Assertions.assertThat(bookShelf.getBooks()).contains(design);
        Assertions.assertThat(bookShelf.getBooks()).contains(ddd);
        Assertions.assertThat(bookShelf.getBooks()).contains(test);
    }

}