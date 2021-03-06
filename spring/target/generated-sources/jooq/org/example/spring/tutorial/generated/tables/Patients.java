/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.example.spring.tutorial.generated.Keys;
import org.example.spring.tutorial.generated.Public;
import org.example.spring.tutorial.generated.tables.records.PatientsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class Patients extends TableImpl<PatientsRecord> {

    private static final long serialVersionUID = -11808272;

    /**
     * The reference instance of <code>public.patients</code>
     */
    public static final Patients PATIENTS = new Patients();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientsRecord> getRecordType() {
        return PatientsRecord.class;
    }

    /**
     * The column <code>public.patients.id</code>.
     */
    public final TableField<PatientsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('patients_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.patients.idd</code>.
     */
    public final TableField<PatientsRecord, Integer> IDD = createField(DSL.name("idd"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.patients.card_number</code>.
     */
    public final TableField<PatientsRecord, Integer> CARD_NUMBER = createField(DSL.name("card_number"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.patients.name</code>.
     */
    public final TableField<PatientsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.patients.age</code>.
     */
    public final TableField<PatientsRecord, Integer> AGE = createField(DSL.name("age"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.patients.address</code>.
     */
    public final TableField<PatientsRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.patients.insurance_number</code>.
     */
    public final TableField<PatientsRecord, String> INSURANCE_NUMBER = createField(DSL.name("insurance_number"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.patients.phone_number</code>.
     */
    public final TableField<PatientsRecord, String> PHONE_NUMBER = createField(DSL.name("phone_number"), org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>public.patients.create_date</code>.
     */
    public final TableField<PatientsRecord, LocalDateTime> CREATE_DATE = createField(DSL.name("create_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.patients.delete_date</code>.
     */
    public final TableField<PatientsRecord, LocalDateTime> DELETE_DATE = createField(DSL.name("delete_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.patients</code> table reference
     */
    public Patients() {
        this(DSL.name("patients"), null);
    }

    /**
     * Create an aliased <code>public.patients</code> table reference
     */
    public Patients(String alias) {
        this(DSL.name(alias), PATIENTS);
    }

    /**
     * Create an aliased <code>public.patients</code> table reference
     */
    public Patients(Name alias) {
        this(alias, PATIENTS);
    }

    private Patients(Name alias, Table<PatientsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Patients(Name alias, Table<PatientsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Patients(Table<O> child, ForeignKey<O, PatientsRecord> key) {
        super(child, key, PATIENTS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<PatientsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PATIENTS;
    }

    @Override
    public UniqueKey<PatientsRecord> getPrimaryKey() {
        return Keys.PK_PATIENTS_ID;
    }

    @Override
    public List<UniqueKey<PatientsRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientsRecord>>asList(Keys.PK_PATIENTS_ID, Keys.PATIENTS_IDD_KEY, Keys.PATIENTS_CARD_NUMBER_KEY);
    }

    @Override
    public Patients as(String alias) {
        return new Patients(DSL.name(alias), this);
    }

    @Override
    public Patients as(Name alias) {
        return new Patients(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Patients rename(String name) {
        return new Patients(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Patients rename(Name name) {
        return new Patients(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, Integer, String, Integer, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
