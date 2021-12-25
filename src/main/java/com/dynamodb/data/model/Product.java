package com.dynamodb.data.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "product")
public class Product {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;
    
    @DynamoDBAttribute
    private String name;
    
    @DynamoDBAttribute
    private String price;
}
