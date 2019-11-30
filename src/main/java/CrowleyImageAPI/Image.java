package CrowleyImageAPI;

public class Image{

  private final String id;
  private String mood = "";
  private String theme = "";
  private String setting = "";
  private String subject = "";
  private String character = "";

  public Image(String id) {
    this.id = id;
  }

  public setMood(String s){
    this.mood = s;
  }

  public setTheme(String s){
    this.theme = s;
  }

  public setSetting(String s){
    this.setting = s;
  }

  public setSubject(String s){
    this.subject = s;
  }

  public setCharacter(String s){
    this.character =s;
  }

  public String getId() {
    return id;
  }
}
