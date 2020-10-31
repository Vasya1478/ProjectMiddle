/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.example.spring.tutorial.generated.Keys;
import org.example.spring.tutorial.generated.Public;
import org.example.spring.tutorial.generated.tables.records.NameOfServiceRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NameOfService extends TableImpl<NameOfServiceRecord> {

    private static final long serialVersionUID = -1868773134;

    /**
     * The reference instance of <code>public.name_of_service</code>
     */
    public static final NameOfService NAME_OF_SERVICE = new NameOfService();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NameOfServiceRecord> getRecordType() {
        return NameOfServiceRecord.class;
    }

    /**
     * The column <code>public.name_of_service.id</code>.
     */
    public final TableField<NameOfServiceRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('name_of_service_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.name_of_service.idd</code>.
     */
    public final TableField<NameOfServiceRecord, Integer> IDD = createField(DSL.name("idd"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.name_of_service.type_of_service</code>.
     */
    public final TableField<NameOfServiceRecord, String> TYPE_OF_SERVICE = createField(DSL.name("type_of_service"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.name_of_service.create_date</code>.
     */
    public final TableField<NameOfServiceRecord, LocalDateTime> CREATE_DATE = createField(DSL.name("create_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.name_of_service.delete_date</code>.
     */
    public final TableField<NameOfServiceRecord, LocalDateTime> DELETE_DATE = createField(DSL.name("delete_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.name_of_service</code> table reference
     */
    public NameOfService() {
        this(DSL.name("name_of_service"), null);
    }

    /**
     * Create an aliased <code>public.name_of_service</code> table reference
     */
    public NameOfService(String alias) {
        this(DSL.name(alias), NAME_OF_SERVICE);
    }

    /**
     * Create an aliased <code>public.name_of_service</code> table reference
     */
    public NameOfService(Name alias) {
        this(alias, NAME_OF_SERVICE);
    }

    private NameOfService(Name alias, Table<NameOfServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private NameOfService(Name alias, Table<NameOfServiceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> NameOfService(Table<O> child, ForeignKey<O, NameOfServiceRecord> key) {
        super(child, key, NAME_OF_SERVICE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<NameOfServiceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NAME_OF_SERVICE;
    }

    @Override
    public UniqueKey<NameOfServiceRecord> getPrimaryKey() {
        return Keys.PK_NAME_OF_SERVICE_ID;
    }

    @Override
    public List<UniqueKey<NameOfServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<NameOfServiceRecord>>asList(Keys.PK_NAME_OF_SERVICE_ID, Keys.NAME_OF_SERVICE_IDD_KEY);
    }

    @Override
    public NameOfService as(String alias) {
        return new NameOfService(DSL.name(alias), this);
    }

    @Override
    public NameOfService as(Name alias) {
        return new NameOfService(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NameOfService rename(String name) {
        return new NameOfService(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NameOfService rename(Name name) {
        return new NameOfService(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
