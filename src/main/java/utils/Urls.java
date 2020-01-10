package utils;

public class Urls {

    private static final String BOOKS_URL = "https://openlibrary.org/api/books";
    private static final String SEARCH_URL = "http://openlibrary.org/search.json";
    private static final String LISTS_URL = "http://openlibrary.org/people/%s/lists.json";

    public static String getBooksApiUrl() {
        return BOOKS_URL;
    }

    public static String getSearchApiUrl() {
        return SEARCH_URL;
    }

    public static String getListsApiUrl() {
        return LISTS_URL;
    }
}
