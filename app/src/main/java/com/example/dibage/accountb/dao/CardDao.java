package com.example.dibage.accountb.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.dibage.accountb.entitys.Card;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CARD".
*/
public class CardDao extends AbstractDao<Card, Long> {

    public static final String TABLENAME = "CARD";

    /**
     * Properties of entity Card.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Card_name = new Property(1, String.class, "card_name", false, "CARD_NAME");
        public final static Property Username = new Property(2, String.class, "username", false, "USERNAME");
        public final static Property Card_number = new Property(3, String.class, "card_number", false, "CARD_NUMBER");
        public final static Property Remark = new Property(4, String.class, "remark", false, "REMARK");
    }

    private DaoSession daoSession;


    public CardDao(DaoConfig config) {
        super(config);
    }
    
    public CardDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CARD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CARD_NAME\" TEXT NOT NULL ," + // 1: card_name
                "\"USERNAME\" TEXT NOT NULL ," + // 2: username
                "\"CARD_NUMBER\" TEXT NOT NULL ," + // 3: card_number
                "\"REMARK\" TEXT);"); // 4: remark
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CARD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Card entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getCard_name());
        stmt.bindString(3, entity.getUsername());
        stmt.bindString(4, entity.getCard_number());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(5, remark);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Card entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getCard_name());
        stmt.bindString(3, entity.getUsername());
        stmt.bindString(4, entity.getCard_number());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(5, remark);
        }
    }

    @Override
    protected final void attachEntity(Card entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Card readEntity(Cursor cursor, int offset) {
        Card entity = new Card( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // card_name
            cursor.getString(offset + 2), // username
            cursor.getString(offset + 3), // card_number
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // remark
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Card entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCard_name(cursor.getString(offset + 1));
        entity.setUsername(cursor.getString(offset + 2));
        entity.setCard_number(cursor.getString(offset + 3));
        entity.setRemark(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Card entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Card entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Card entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}