package com.example.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dixits on 05-11-2017.
 */
@Entity
public class Book {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String title;
   private String publisher;
   private String isn;
   @ManyToMany
   @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
   Set<Author> authorSet = new HashSet<>();


   public Book(String title, String publisher, String isn, Set<Author> authorSet) {
      this.title = title;
      this.publisher = publisher;
      this.isn = isn;
      this.authorSet = authorSet;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   public String getIsn() {
      return isn;
   }

   public void setIsn(String isn) {
      this.isn = isn;
   }

   public Set<Author> getAuthorSet() {
      return authorSet;
   }

   public void setAuthorSet(Set<Author> authorSet) {
      this.authorSet = authorSet;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Book book = (Book) o;

      return isn != null ? isn.equals(book.isn) : book.isn == null;

   }

   @Override
   public int hashCode() {
      return isn.hashCode();
   }
}
