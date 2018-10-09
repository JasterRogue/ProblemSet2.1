public class Film {

    private String title;
    private String director;
    private int duration;
    int numberOfFilms;

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getNumberOfFilms()
    {
        return numberOfFilms;
    }

    public Film()
    {
        this.title = "Unknown";
        this.director = "Unknown";
        this.duration = 0;
        this.numberOfFilms = 0;
    }

    public Film(String title, String director, int duration)
    {
        this.title = title;
        this.director = director;
        this.duration = duration;
       // numberOfFilms++;
    }




}
