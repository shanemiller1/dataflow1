package edu.fgcu.dataengineering;

public class AuthorParser {
  private String author_name;
  private String author_email;
  private String author_url;

  protected void setName(String newName) {
    this.author_name = newName;
  }

  protected void setEmail(String newEmail) {
    this.author_email = newEmail;
  }

  protected void setUrl(String newUrl) {
    this.author_url = newUrl;
  }

  protected String getName() {
    return author_name;
  }

  protected String getEmail() {
    return author_email;
  }

  protected String getUrl() {
    return author_url;
  }
}
