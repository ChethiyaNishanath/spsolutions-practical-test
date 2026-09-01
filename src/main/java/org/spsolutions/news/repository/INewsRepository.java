package org.spsolutions.news.repository;

import org.spsolutions.news.domain.News;

import java.util.List;
import java.util.Optional;

public interface INewsRepository {
    Optional<News> getNewsById(int id);
    List<News> getNewsByCategory(int newsCategoryId);
}
