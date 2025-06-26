package com.patniom3.MoviesAPI.service;

import com.patniom3.MoviesAPI.entity.Movie;
import com.patniom3.MoviesAPI.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private static final Logger logger = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        logger.info("Found {} movies", movies.size());
        return movies;
    }

    public Optional<Movie> singleMovie(String id) {
        Optional<Movie> movie = movieRepository.findById(id);
        logger.info("Found movie with id {}: {}", id, movie.isPresent());
        return movie;
    }
}
//package com.patniom3.MoviesAPI.service;
//
//import com.patniom3.MoviesAPI.entity.Movie;
//import com.patniom3.MoviesAPI.repository.MovieRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Slf4j  // Add this Lombok annotation for logging
//public class MovieService {
//    @Autowired
//    private MovieRepository movieRepository;
//
//    public List<Movie> findAllMovies() {
//        List<Movie> movies = movieRepository.findAll();
//        log.info("Found {} movies", movies.size());
//        movies.forEach(movie -> log.debug("Movie: {}", movie));
//        return movies;
//    }
//
//    public Optional<Movie> singleMovie(ObjectId id) {
//        Optional<Movie> movie = movieRepository.findById(id);
//        log.info("Found movie with id {}: {}", id, movie.isPresent());
//        return movie;
//    }
//}

//@Service
//public class MovieService {
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    public List<Movie> findAllMovies(){
//            return movieRepository.findAll();
//    }
//
//    public Optional<Movie> singleMovie(String id){
//        return movieRepository.findById(id);
//    }
//}
