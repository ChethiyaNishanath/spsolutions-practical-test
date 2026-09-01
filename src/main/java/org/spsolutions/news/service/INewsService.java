package org.spsolutions.news.service;

import org.spsolutions.news.domain.News;

import java.util.List;
import java.util.Optional;

public interface INewsService {

    News getNewsById(int id);
    List<News> getNewsByCategory(int newsCategoryId);

}
