import java.io.Serializable;

public class Movie implements Serializable {

    private String _name;
    private int _produceYear;
    private String _produceCountry;
    private String _genre;
    private float _totalBudget;

    public Movie(String _name, int _produceYear, String _produceCountry, String _genre, float _totalBudget) {
        this._name = _name;
        this._produceYear = _produceYear;
        this._produceCountry = _produceCountry;
        this._genre = _genre;
        this._totalBudget = _totalBudget;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_produceYear() {
        return _produceYear;
    }

    public void set_produceYear(int _produceYear) {
        this._produceYear = _produceYear;
    }

    public String get_produceCountry() {
        return _produceCountry;
    }

    public void set_produceCountry(String _produceCountry) {
        this._produceCountry = _produceCountry;
    }

    public String get_genre() {
        return _genre;
    }

    public void set_genre(String _genre) {
        this._genre = _genre;
    }

    public float get_totalBudget() {
        return _totalBudget;
    }

    public void set_totalBudget(float _totalBudget) {
        this._totalBudget = _totalBudget;
    }
}
