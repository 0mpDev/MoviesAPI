package com.patniom3.MoviesAPI.repository;

import com.patniom3.MoviesAPI.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    // Optional<Movie> findMovieByImdb(String imdbId);
}
