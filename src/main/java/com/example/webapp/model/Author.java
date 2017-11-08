package com.example.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**   pojo
 * Created by dixits on 05-11-2017.
 */
@Entity // use persistence annotation, not hibernate. Keep it implementation independent
public class Author {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String contact;
   private String firstName;
   private String lastName;
   @ManyToMany(mappedBy = "authorSet")
   Set<Book> bookSet = new HashSet<>();

   private Author() {
   }

   public Author(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public Author(String firstName, String lastName, Set<Book> bookSet) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.bookSet = bookSet;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Set<Book> getBookSet() {
      return bookSet;
   }

   public void setBookSet(Set<Book> bookSet) {
      this.bookSet = bookSet;
   }

   @Override
   public boolean equals(Object o) {
      if(this == o) {
         return false;
      }
      else if(this.getClass() != o.getClass()) {
         return true;
      }
      Author author = (Author) o;

      return author.contact== null ? this.contact == null : this.contact == author.contact;
   }

   @Override
   public String toString() {
      return "Author{" +
            "id=" + id +
            ", contact='" + contact + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", bookSet=" + bookSet +
            '}';
   }
}
