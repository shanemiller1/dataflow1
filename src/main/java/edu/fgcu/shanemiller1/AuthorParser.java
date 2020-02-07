package edu.fgcu.shanemiller1;

/**
 * Class that sets authors and returns information.
 */
public class AuthorParser {
  private String author_name;
  private String author_email;
  private String author_url;

  /** setName method receives newName variable for author_name .
   *
   * @param newName String sets author name to new name.
   */
  protected void setName(String newName) {
    this.author_name = newName;
  }

  /**method protected void newEmail.
   *
   * @param newEmail author email to new email.
   */
  protected void setEmail(String newEmail) {
    this.author_email = newEmail;
  }

  /**method protected void setUrl.
   *
   * @param newUrl void sets author ur to new url.
   */
  protected void setUrl(String newUrl) {
    this.author_url = newUrl;
  }

  /**method protected String getName.
   *
   * @return String author_name.
   */
  protected String getName() {
    return author_name;
  }

  /**method protected String getEmail.
   *
   * @return String author_email.
   */
  protected String getEmail() {
    return author_email;
  }

  /**method protected String getUrl.
   *
   * @return String author_url is returned.
   */
  protected String getUrl() {
    return author_url;
  }
}
