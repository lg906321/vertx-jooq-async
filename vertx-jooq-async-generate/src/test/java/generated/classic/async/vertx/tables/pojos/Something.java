/*
 * This file is generated by jOOQ.
*/
package generated.classic.async.vertx.tables.pojos;


import generated.classic.async.vertx.tables.interfaces.ISomething;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

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
public class Something implements ISomething {

    private static final long serialVersionUID = -1160322407;

    private Integer    someid;
    private String     somestring;
    private Long       somehugenumber;
    private Short      somesmallnumber;
    private Integer    someregularnumber;
    private Double     somedouble;
    private String     someenum;
    private JsonObject somejsonobject;
    private JsonArray  somejsonarray;

    public Something() {}

    public Something(Something value) {
        this.someid = value.someid;
        this.somestring = value.somestring;
        this.somehugenumber = value.somehugenumber;
        this.somesmallnumber = value.somesmallnumber;
        this.someregularnumber = value.someregularnumber;
        this.somedouble = value.somedouble;
        this.someenum = value.someenum;
        this.somejsonobject = value.somejsonobject;
        this.somejsonarray = value.somejsonarray;
    }

    public Something(
        Integer    someid,
        String     somestring,
        Long       somehugenumber,
        Short      somesmallnumber,
        Integer    someregularnumber,
        Double     somedouble,
        String     someenum,
        JsonObject somejsonobject,
        JsonArray  somejsonarray
    ) {
        this.someid = someid;
        this.somestring = somestring;
        this.somehugenumber = somehugenumber;
        this.somesmallnumber = somesmallnumber;
        this.someregularnumber = someregularnumber;
        this.somedouble = somedouble;
        this.someenum = someenum;
        this.somejsonobject = somejsonobject;
        this.somejsonarray = somejsonarray;
    }

    @Override
    public Integer getSomeid() {
        return this.someid;
    }

    @Override
    public Something setSomeid(Integer someid) {
        this.someid = someid;
        return this;
    }

    @Override
    public String getSomestring() {
        return this.somestring;
    }

    @Override
    public Something setSomestring(String somestring) {
        this.somestring = somestring;
        return this;
    }

    @Override
    public Long getSomehugenumber() {
        return this.somehugenumber;
    }

    @Override
    public Something setSomehugenumber(Long somehugenumber) {
        this.somehugenumber = somehugenumber;
        return this;
    }

    @Override
    public Short getSomesmallnumber() {
        return this.somesmallnumber;
    }

    @Override
    public Something setSomesmallnumber(Short somesmallnumber) {
        this.somesmallnumber = somesmallnumber;
        return this;
    }

    @Override
    public Integer getSomeregularnumber() {
        return this.someregularnumber;
    }

    @Override
    public Something setSomeregularnumber(Integer someregularnumber) {
        this.someregularnumber = someregularnumber;
        return this;
    }

    @Override
    public Double getSomedouble() {
        return this.somedouble;
    }

    @Override
    public Something setSomedouble(Double somedouble) {
        this.somedouble = somedouble;
        return this;
    }

    @Override
    public String getSomeenum() {
        return this.someenum;
    }

    @Override
    public Something setSomeenum(String someenum) {
        this.someenum = someenum;
        return this;
    }

    @Override
    public JsonObject getSomejsonobject() {
        return this.somejsonobject;
    }

    @Override
    public Something setSomejsonobject(JsonObject somejsonobject) {
        this.somejsonobject = somejsonobject;
        return this;
    }

    @Override
    public JsonArray getSomejsonarray() {
        return this.somejsonarray;
    }

    @Override
    public Something setSomejsonarray(JsonArray somejsonarray) {
        this.somejsonarray = somejsonarray;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Something (");

        sb.append(someid);
        sb.append(", ").append(somestring);
        sb.append(", ").append(somehugenumber);
        sb.append(", ").append(somesmallnumber);
        sb.append(", ").append(someregularnumber);
        sb.append(", ").append(somedouble);
        sb.append(", ").append(someenum);
        sb.append(", ").append(somejsonobject);
        sb.append(", ").append(somejsonarray);

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
    public void from(ISomething from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
        setSomehugenumber(from.getSomehugenumber());
        setSomesmallnumber(from.getSomesmallnumber());
        setSomeregularnumber(from.getSomeregularnumber());
        setSomedouble(from.getSomedouble());
        setSomeenum(from.getSomeenum());
        setSomejsonobject(from.getSomejsonobject());
        setSomejsonarray(from.getSomejsonarray());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISomething> E into(E into) {
        into.from(this);
        return into;
    }

    public Something(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
