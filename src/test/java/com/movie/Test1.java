package com.movie;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.support.ValuesSourceType;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.movie.MovieInfo;

import java.io.IOException;
import java.util.List;

public class Test1 {
    JestClient jestClient = new JestClientFactory().getObject();

    @Test
    public void testSearch(){
        //查询表达式
        String json = "{\n" +
                      "      \"query\":{\n" +
                      "           \"multi_match\": {\n" +
                      "               \"query\" : \"剧情\" ," +
                      "               \"fields\": [\"mintro\",\"mactor\"]" +
                      "            }" +
                      "       }\n" +
                      "}";
        /*String json="{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"mintro\" : \"天网\"\n" +
                "        }\n" +
                "    }\n" +
                "}";*/
        //构建搜索功能
        //Search search=new Search.Builder(json).addIndex("movieinfo_new").addType("movieinfo").build();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.multiMatchQuery("剧情","mintro","mcator"));
        searchSourceBuilder.from(1);
        searchSourceBuilder.size(1);
        Search search = new Search.Builder(searchSourceBuilder.toString())
                // multiple index or types can be added.
                .addIndex("movieinfo_new")
                .addType("movieinfo")
                .build();

        try {
            SearchResult result=jestClient.execute(search);
            List<SearchResult.Hit<MovieInfo, Void>> searchResults = result.getHits(MovieInfo.class);
            searchResults.forEach(hit -> {
                System.out.println(hit.source.toString());
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
