/*
 * This file is generated by jOOQ.
*/
package generated.rx.async.vertx.tables;


import generated.rx.async.vertx.DefaultSchema;
import generated.rx.async.vertx.Keys;
import generated.rx.async.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.async.shared.JsonArrayConverter;
import io.github.jklingsporn.vertx.jooq.async.shared.JsonObjectConverter;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Something extends TableImpl<SomethingRecord> {

    private static final long serialVersionUID = 301209539;

    /**
     * The reference instance of <code>something</code>
     */
    public static final Something SOMETHING = new Something();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingRecord> getRecordType() {
        return SomethingRecord.class;
    }

    /**
     * The column <code>something.someId</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEID = createField("someId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>something.someString</code>.
     */
    public final TableField<SomethingRecord, String> SOMESTRING = createField("someString", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>something.someHugeNumber</code>.
     */
    public final TableField<SomethingRecord, Long> SOMEHUGENUMBER = createField("someHugeNumber", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>something.someSmallNumber</code>.
     */
    public final TableField<SomethingRecord, Short> SOMESMALLNUMBER = createField("someSmallNumber", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>something.someRegularNumber</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEREGULARNUMBER = createField("someRegularNumber", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>something.someDouble</code>.
     */
    public final TableField<SomethingRecord, Double> SOMEDOUBLE = createField("someDouble", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>something.someEnum</code>.
     */
    public final TableField<SomethingRecord, String> SOMEENUM = createField("someEnum", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>something.someJsonObject</code>.
     */
    public final TableField<SomethingRecord, JsonObject> SOMEJSONOBJECT = createField("someJsonObject", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "", new JsonObjectConverter());

    /**
     * The column <code>something.someJsonArray</code>.
     */
    public final TableField<SomethingRecord, JsonArray> SOMEJSONARRAY = createField("someJsonArray", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "", new JsonArrayConverter());

    /**
     * Create a <code>something</code> table reference
     */
    public Something() {
        this("something", null);
    }

    /**
     * Create an aliased <code>something</code> table reference
     */
    public Something(String alias) {
        this(alias, SOMETHING);
    }

    private Something(String alias, Table<SomethingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Something(String alias, Table<SomethingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SomethingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SOMETHING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SomethingRecord> getPrimaryKey() {
        return Keys.KEY_SOMETHING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SomethingRecord>> getKeys() {
        return Arrays.<UniqueKey<SomethingRecord>>asList(Keys.KEY_SOMETHING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Something as(String alias) {
        return new Something(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Something rename(String name) {
        return new Something(name, null);
    }
}
