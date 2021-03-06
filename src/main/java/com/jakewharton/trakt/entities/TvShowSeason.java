package com.jakewharton.trakt.entities;

import com.jakewharton.trakt.TraktEntity;

import java.util.List;

public class TvShowSeason implements TraktEntity {
    private static final long serialVersionUID = -1283154821327471366L;

    public static class Episodes implements TraktEntity {
        private static final long serialVersionUID = -8143500365188820979L;

        public Integer count;
        public List<Integer> numbers;
        public List<TvShowEpisode> episodes;
    }

    public Integer season;
    public Episodes episodes;
    public String url;
    public Images images;

}
