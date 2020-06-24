package com.spring.tutorial.springboot.basics.springbootin10steps;

public class Book {
  long id;
  String name;
  String author;

  public Book(long id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Book{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", author='").append(author).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
