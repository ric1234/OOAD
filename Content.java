public abstract class Content{

  private String contentID;
  public int thumbsUpCount;

  abstract void updateContent();
  abstract void thumbsUp();
  abstract void contentStatus();

}
