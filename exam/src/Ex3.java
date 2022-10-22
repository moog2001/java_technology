import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    private String _fileName = "src/movies.txt";

    public static void main(String[] args) throws Exception {
        new Ex3();
    }

    Ex3() throws Exception {


        setUpFinal();
        List<Movie> tempList = new ArrayList<>();
        readMoviesFinal(_fileName, tempList);
        System.out.println("Max Budget Movie Info: ");
        output(findMaxBudget(tempList));
        System.out.println("\n");
        System.out.println("Earliest Year Movie Info: ");
        output(findEarliestMovieYear(tempList));


    }

//    not used in the final version.
//    private void setUp() throws IOException {
//        Movie movieAvatar = new Movie("Avatar", 2009, "USA", "Action Adventure Fantasy Sci-Fi", 237000000f);
//        Movie movieAvengers = new Movie("Avengers: Endgame", 2019, "USA", "Action Adventure Drama Sci-Fi", 356000000f);
//        Movie movieTitanic = new Movie("Titanic", 1997, "USA", "Drama Romance", 200000000f);
//
//        List<Movie> movies = new ArrayList<>();
//        movies.add(movieAvatar);
//        movies.add(movieAvengers);
//        movies.add(movieTitanic);
//        StringBuilder stringBuilder = new StringBuilder();
//
//
//        for (Movie var : movies) {
//            stringBuilder.append(var.get_name()).append("\n");
//            stringBuilder.append(var.get_produceYear()).append("\n");
//            stringBuilder.append(var.get_produceCountry()).append("\n");
//            stringBuilder.append(var.get_genre()).append("\n");
//            stringBuilder.append(var.get_totalBudget()).append("\n");
//            stringBuilder.append("---").append("\n");
//        }
//
//        File file = new File(_fileName);
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//
//        FileWriter fileWriter = new FileWriter(file);
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//
//        printWriter.printf(stringBuilder.toString());
//        printWriter.close();
//    }

    // final version.
    private void setUpFinal() throws IOException {
        Movie movieAvatar = new Movie("Avatar", 2009, "USA", "Action Adventure Fantasy Sci-Fi", 237000000f);
        Movie movieAvengers = new Movie("Avengers: Endgame", 2019, "USA", "Action Adventure Drama Sci-Fi", 356000000f);
        Movie movieTitanic = new Movie("Titanic", 1997, "USA", "Drama Romance", 200000000f);

        List<Movie> movies = new ArrayList<>();
        movies.add(movieAvatar);
        movies.add(movieAvengers);
        movies.add(movieTitanic);

        FileOutputStream fileOutputStream = new FileOutputStream(_fileName);
        ObjectOutput output = new ObjectOutputStream(fileOutputStream);

        for (Movie var : movies) {
            output.writeObject(var);
        }

        output.close();
    }


    // not used in final version.
//    private void readMovies(String inputFileName, List<Movie> inputList) throws Exception {
//        File file = new File(_fileName);
//        if (!file.exists()) {
//            throw new FileNotFoundException("No file found!");
//        }
//
//        Scanner input = new Scanner(file);
//        while (true) {
//            String tempName = input.nextLine();
//            int tempYear = Integer.parseInt(input.nextLine());
//            String tempCountry = input.nextLine();
//            String tempGenre = input.nextLine();
//            float tempRevenue = Float.parseFloat(input.nextLine());
//            String temp = input.nextLine();
//            if (temp.equals("---")) {
//                inputList.add(new Movie(tempName, tempYear, tempCountry, tempGenre, tempRevenue));
//            }
//            if (!input.hasNext()) {
//                break;
//            }
//        }
//    }

    private void readMoviesFinal(String inputFileName, List<Movie> inputList) throws Exception {
        File file = new File(_fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("No file found!");
        }
        FileInputStream input = new FileInputStream(_fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(input);
        while (true) {
            try {
                inputList.add((Movie) objectInputStream.readObject());
            } catch (EOFException e) {
                break;
            }
        }
    }

    void output(Movie movie) {
        System.out.print(movie.get_name() + " " + movie.get_produceYear() + " " + movie.get_produceCountry() + " " + movie.get_genre() + " " + movie.get_totalBudget());
    }

    Movie findMaxBudget(List<Movie> inputList) {
        Movie tempMovie = new Movie("temp", 0, "temp", "temp", 0f);
        for (Movie var : inputList
        ) {
            if (var.get_totalBudget() > tempMovie.get_totalBudget()) {
                tempMovie = var;
            }
        }
        return tempMovie;
    }

    Movie findEarliestMovieYear(List<Movie> inputList) {
        Movie tempMovie = new Movie("temp", 3000, "temp", "temp", 0f);
        for (Movie var : inputList
        ) {
            if (var.get_produceYear() < tempMovie.get_produceYear()) {
                tempMovie = var;
            }
        }
        return tempMovie;
    }

}
