package org.spsolutions.news.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.spsolutions.news.domain.NewsCategory;

import java.util.List;


@ApplicationScoped
public class NewsCategoryServiceImpl implements INewsCategoryService {
    @Override
    public List<NewsCategory> getAll() {
        return List.of();
    }
}
