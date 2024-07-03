package com.udacity.graphql.exception;

import java.util.Map;

public class DogNotFoundException extends RuntimeException implements GraphQLError {
    
    private Map<String, Object> extensions = new HashMap<>();

    public DogNotFoundException(String message, Long invalidDogId) {
        super(message);
        extensions.put("invalidDogId", invalidDogId);
    }

    @Override
    public  List<SourceLocation> getLocations() { return null; }

    @Override
    public Map<String, Object> getExtensions() { return extensions; }

    @Override
    public ErrorType getErrorType() { return ErrorType.DataFetchingException; }
}