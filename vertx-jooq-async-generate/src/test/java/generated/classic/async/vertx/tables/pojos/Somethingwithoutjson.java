/*
 * This file is generated by jOOQ.
*/
package generated.classic.async.vertx.tables.pojos;


import generated.classic.async.vertx.tables.interfaces.ISomethingwithoutjson;

import javax.annotation.Generated;


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
public class Somethingwithoutjson implements ISomethingwithoutjson {

    private static final long serialVersionUID = 358548254;

    private Integer someid;
    private String  somestring;

    public Somethingwithoutjson() {}

    public Somethingwithoutjson(Somethingwithoutjson value) {
        this.someid = value.someid;
        this.somestring = value.somestring;
    }

    public Somethingwithoutjson(
        Integer someid,
        String  somestring
    ) {
        this.someid = someid;
        this.somestring = somestring;
    }

    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    @Override
    public Somethingwithoutjson setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    @Override
    public String getSomestring() {
        return this.somestring;
    }

    @Override
    public Somethingwithoutjson setSomestring(String somestring) {
        this.somestring = somestring;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Somethingwithoutjson (");

        sb.append(someid);
        sb.append(", ").append(somestring);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISomethingwithoutjson from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISomethingwithoutjson> E into(E into) {
        into.from(this);
        return into;
    }

    public Somethingwithoutjson(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
