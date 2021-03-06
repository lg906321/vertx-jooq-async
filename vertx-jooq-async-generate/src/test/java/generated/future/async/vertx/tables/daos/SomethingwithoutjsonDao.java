/*
 * This file is generated by jOOQ.
*/
package generated.future.async.vertx.tables.daos;


import generated.future.async.vertx.tables.Somethingwithoutjson;
import generated.future.async.vertx.tables.records.SomethingwithoutjsonRecord;

import io.github.jklingsporn.vertx.jooq.async.future.VertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.async.future.AsyncJooqSQLClient;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingwithoutjsonDao extends DAOImpl<SomethingwithoutjsonRecord, generated.future.async.vertx.tables.pojos.Somethingwithoutjson, Integer> implements VertxDAO<generated.future.async.vertx.tables.records.SomethingwithoutjsonRecord,generated.future.async.vertx.tables.pojos.Somethingwithoutjson,java.lang.Integer> {

    /**
     * Create a new SomethingwithoutjsonDao without any configuration
     */
    public SomethingwithoutjsonDao() {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.future.async.vertx.tables.pojos.Somethingwithoutjson.class);
    }

    /**
     * Create a new SomethingwithoutjsonDao with an attached configuration
     */
    public SomethingwithoutjsonDao(Configuration configuration) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.future.async.vertx.tables.pojos.Somethingwithoutjson.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.future.async.vertx.tables.pojos.Somethingwithoutjson object) {
        return object.getSomeid();
    }

    /**
     * Fetch records that have <code>someId IN (values)</code>
     */
    public List<generated.future.async.vertx.tables.pojos.Somethingwithoutjson> fetchBySomeid(Integer... values) {
        return fetch(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID, values);
    }

    /**
     * Fetch a unique record that has <code>someId = value</code>
     */
    public generated.future.async.vertx.tables.pojos.Somethingwithoutjson fetchOneBySomeid(Integer value) {
        return fetchOne(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID, value);
    }

    /**
     * Fetch records that have <code>someString IN (values)</code>
     */
    public List<generated.future.async.vertx.tables.pojos.Somethingwithoutjson> fetchBySomestring(String... values) {
        return fetch(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING, values);
    }

    /**
     * Fetch records that have <code>someId IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.future.async.vertx.tables.pojos.Somethingwithoutjson>> fetchBySomeidAsync(List<Integer> values) {
        return fetchAsync(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID,values);
    }

    /**
     * Fetch a unique record that has <code>someId = value</code> asynchronously
     */
    public CompletableFuture<generated.future.async.vertx.tables.pojos.Somethingwithoutjson> fetchOneBySomeidAsync(Integer value) {
        return fetchOneAsync(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID,value);
    }

    /**
     * Fetch records that have <code>someString IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.future.async.vertx.tables.pojos.Somethingwithoutjson>> fetchBySomestringAsync(List<String> values) {
        return fetchAsync(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING,values);
    }

    private AsyncJooqSQLClient client;

    @Override
    public void setClient(AsyncJooqSQLClient client) {
        this.client = client;
    }

    @Override
    public AsyncJooqSQLClient client() {
        return this.client;
    }

    @Override
    public java.util.function.Function<io.vertx.core.json.JsonObject, generated.future.async.vertx.tables.pojos.Somethingwithoutjson> jsonMapper() {
        return generated.future.async.vertx.tables.pojos.Somethingwithoutjson::new;
    }

}
