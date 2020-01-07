package utils;

public class Urls {

    private static final String BOOKS_API = "https://openlibrary.org/api/books";
    private static final String SEARCH_API = "http://openlibrary.org/search.json";

    public static String getBooksApiUrl() {
        return BOOKS_API;
    }

    public static String getSearchApiUrl() {
        return SEARCH_API;
    }
}
