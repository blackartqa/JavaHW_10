package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
  @Test
  public void shouldOutput10MoviesWhenAdded10() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1001, "Movie 1", "Action","https://image1.png");
    MovieItem second = new MovieItem(1002, "Movie 2", "Comedy","https://image2.png");
    MovieItem third = new MovieItem(1003, "Movie 3", "Fantasy","https://image3.png");
    MovieItem fourth = new MovieItem(1004, "Movie 4", "Adventure","https://image4.png");
    MovieItem fifth = new MovieItem(1005, "Movie 5", "Thrill","https://image5.png");
    MovieItem sixth = new MovieItem(1006, "Movie 6", "Horror","https://image6.png");
    MovieItem seventh = new MovieItem(1007, "Movie 7", "Fantasy","https://image7.png");
    MovieItem eighth = new MovieItem(1008, "Movie 8", "Cartoon","https://image8.png");
    MovieItem ninth = new MovieItem(1009, "Movie 9", "Cartoon","https://image9.png");
    MovieItem tenth = new MovieItem(1010, "Movie 10", "Action","https://image10.png");
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldOutput10MoviesWhenAddedMore10() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1001, "Movie 1", "Action","https://image1.png");
    MovieItem second = new MovieItem(1002, "Movie 2", "Comedy","https://image2.png");
    MovieItem third = new MovieItem(1003, "Movie 3", "Fantasy","https://image3.png");
    MovieItem fourth = new MovieItem(1004, "Movie 4", "Adventure","https://image4.png");
    MovieItem fifth = new MovieItem(1005, "Movie 5", "Thrill","https://image5.png");
    MovieItem sixth = new MovieItem(1006, "Movie 6", "Horror","https://image6.png");
    MovieItem seventh = new MovieItem(1007, "Movie 7", "Fantasy","https://image7.png");
    MovieItem eighth = new MovieItem(1008, "Movie 8", "Cartoon","https://image8.png");
    MovieItem ninth = new MovieItem(1009, "Movie 9", "Cartoon","https://image9.png");
    MovieItem tenth = new MovieItem(1010, "Movie 10", "Action","https://image10.png");
    MovieItem eleventh = new MovieItem(1011, "Movie 11", "Documentary","https://image11.png");
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{eleventh,tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldOutputLess10MoviesWhenAddedLess10() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1001, "Movie 1", "Action","https://image1.png");
    MovieItem second = new MovieItem(1002, "Movie 2", "Comedy","https://image2.png");
    MovieItem third = new MovieItem(1003, "Movie 3", "Fantasy","https://image3.png");
    MovieItem fourth = new MovieItem(1004, "Movie 4", "Adventure","https://image4.png");
    MovieItem fifth = new MovieItem(1005, "Movie 5", "Thrill","https://image5.png");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{fifth,fourth,third,second,first};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldOutput5MoviesWhenAddedMore() {
    MovieManager manager = new MovieManager(5);
    MovieItem first = new MovieItem(1001, "Movie 1", "Action","https://image1.png");
    MovieItem second = new MovieItem(1002, "Movie 2", "Comedy","https://image2.png");
    MovieItem third = new MovieItem(1003, "Movie 3", "Fantasy","https://image3.png");
    MovieItem fourth = new MovieItem(1004, "Movie 4", "Adventure","https://image4.png");
    MovieItem fifth = new MovieItem(1005, "Movie 5", "Thrill","https://image5.png");
    MovieItem sixth = new MovieItem(1006, "Movie 6", "Horror","https://image6.png");
    MovieItem seventh = new MovieItem(1007, "Movie 7", "Fantasy","https://image7.png");
    MovieItem eighth = new MovieItem(1008, "Movie 8", "Cartoon","https://image8.png");
    MovieItem ninth = new MovieItem(1009, "Movie 9", "Cartoon","https://image9.png");
    MovieItem tenth = new MovieItem(1010, "Movie 10", "Action","https://image10.png");
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);


    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{tenth,ninth,eighth,seventh,sixth};

    assertArrayEquals(expected, actual);
  }
}