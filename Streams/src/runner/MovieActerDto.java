package runner;

import mapBucketing.ActerDto;
import mapBucketing.MovieDto;

import java.util.HashMap;
import java.util.Map;

public class MovieActerDto {
    public static <ActorDto> void main(String[] args) {
        MovieDto movieDto1 = new MovieDto("Dangal", "Nitesh Tiwari", 2016);
        MovieDto movieDto2 = new MovieDto("3 Idiots", "Rajkumar Hirani", 2009);
        MovieDto movieDto3 = new MovieDto("Lagaan", "Ashutosh Gowariker", 2001);
        MovieDto movieDto4 = new MovieDto("Baahubali: The Beginning", "S.S. Rajamouli", 2015);
        MovieDto movieDto5 = new MovieDto("Gully Boy", "Zoya Akhtar", 2019);
        MovieDto movieDto6 = new MovieDto("Padmaavat", "Sanjay Leela Bhansali", 2018);
        MovieDto movieDto7 = new MovieDto("PK", "Rajkumar Hirani", 2014);
        MovieDto movieDto8 = new MovieDto("Chennai Express", "Rohit Shetty", 2013);
        MovieDto movieDto9 = new MovieDto("Bajrangi Bhaijaan", "Aamir Khan", 2015);
        MovieDto movieDto10 = new MovieDto("Taare Zameen Par", "Aamir Khan", 2007);

        ActerDto actorDto1 = new ActerDto("Amitabh Bachchan", 79, 6.2);
        ActerDto actorDto2 = new ActerDto("Shah Rukh Khan", 56, 5.8);
        ActerDto actorDto3 = new ActerDto("Aamir Khan", 57, 5.6);
        ActerDto actorDto4 = new ActerDto("Salman Khan", 56, 5.7);
        ActerDto actorDto5 = new ActerDto("Rajinikanth", 71, 5.9);
        ActerDto actorDto6 = new ActerDto("Akshay Kumar", 54, 6.0);
        ActerDto actorDto7 = new ActerDto("Hrithik Roshan", 48, 6.1);
        ActerDto actorDto8 = new ActerDto("Ajay Devgn", 53, 5.10);
        ActerDto actorDto9 = new ActerDto("Shahid Kapoor", 41, 5.9);
        ActerDto actorDto10 = new ActerDto("Ranbir Kapoor", 39, 6.0);

        Map<MovieDto,ActerDto> movieDtoActerDtoMap = new HashMap<>();
        movieDtoActerDtoMap.put(movieDto1,actorDto1);
        movieDtoActerDtoMap.put(movieDto2,actorDto2);
        movieDtoActerDtoMap.put(movieDto3,actorDto3);
        movieDtoActerDtoMap.put(movieDto4,actorDto4);
        movieDtoActerDtoMap.put(movieDto5,actorDto5);
        movieDtoActerDtoMap.put(movieDto6,actorDto6);
        movieDtoActerDtoMap.put(movieDto7,actorDto7);
        movieDtoActerDtoMap.put(movieDto8,actorDto8);
        movieDtoActerDtoMap.put(movieDto9,actorDto9);
        movieDtoActerDtoMap.put(movieDto10,actorDto10);

        System.out.println("Exiting :"+movieDtoActerDtoMap.containsKey(movieDto10));
        movieDtoActerDtoMap.forEach((k,v)-> System.out.println(k +" "+v));



    }
}
