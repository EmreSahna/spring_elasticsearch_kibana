package com.elasticsearch.example.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "product")
@Builder
@Data
public class Product {
    @Id
    private String id;
    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Text)
    private String description;
    @Field(type = FieldType.Text)
    private String category;
    @Field(type = FieldType.Text)
    private String brand;
    @Field(type = FieldType.Double)
    private Double price;
    @Field(type = FieldType.Integer)
    private Integer quantity;
}
