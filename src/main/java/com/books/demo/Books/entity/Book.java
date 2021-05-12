package com.books.demo.Books.entity;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BOOK_ID", nullable=false)
    private Integer bookId;
    @Column(name="ISBN", length=255, nullable=false, unique=false)
    private String isbn;
    @Column(name="NAME", length=255, nullable=false, unique=false)
    private String bookName;
    @Column(name="AUTHOR", length=255, unique=false)
    private String author;
    @Column(name="PRICE", unique=false)
    private Double price;
    @Column(name="RATING", unique=false)
    private Integer rating;
}
