package com.elasticsearch.example.service;

import com.elasticsearch.example.model.Product;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ElasticsearchOperations operations;

    public ProductService(ElasticsearchOperations operations) {
        this.operations = operations;
    }

    public List<SearchHit<Product>> search() {
        Criteria criteria = new Criteria("price").greaterThan(1299);
        Query query = new CriteriaQuery(criteria);
        SearchHits<Product> search = operations.search(query, Product.class);
        return search.getSearchHits();
    }
}
