package com.example.springdata

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@Configuration
@EnableMongoRepositories(basePackages = arrayOf("com.example.springdata"))
class MongoConfig : AbstractMongoClientConfiguration() {

    override fun getDatabaseName(): String = "test"

    override fun mongoClient(): MongoClient {
        val connectionString = ConnectionString("mongodb://spring:password@localhost:27017/test")
        val mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build()
        return MongoClients.create(mongoClientSettings)
    }


}