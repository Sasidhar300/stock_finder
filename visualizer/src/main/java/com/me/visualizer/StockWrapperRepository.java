package com.me.visualizer;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.me.visualizer.model.StockWrapper;

public interface StockWrapperRepository extends MongoRepository<StockWrapper, String> {
    
}
