package org.spsolutions.news.service;

import org.spsolutions.news.domain.NewsCategory;

import java.util.List;

public interface INewsCategoryService {
    List<NewsCategory> getAll();
}
