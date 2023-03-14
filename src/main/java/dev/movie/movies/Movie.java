package dev.movie.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //tells that this is Document class or in NoSQl format that's why we see leaf..lol
@Data //this is like getter/setter
@AllArgsConstructor //annotation for taking all param
@NoArgsConstructor //no param
public class Movie {
    @Id // this is like PK
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference //basically it will save on id's in table and create another for reviews
    private List<Review> reviews;

}
