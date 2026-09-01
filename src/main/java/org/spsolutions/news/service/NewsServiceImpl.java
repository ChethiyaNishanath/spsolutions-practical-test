package org.spsolutions.news.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.spsolutions.news.domain.News;
import org.spsolutions.news.repository.INewsRepository;

import java.util.List;


@ApplicationScoped
public class NewsServiceImpl implements INewsService {

    private final INewsRepository newsRepository;

    @Inject
    public NewsServiceImpl(INewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public News getNewsById(int id) {
        return this.newsRepository.getNewsById(id).orElseThrow();
    }

    @Override
    public List<News> getNewsByCategory(int newsCategoryId) {
        return List.of();
    }
}
