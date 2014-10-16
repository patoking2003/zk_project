package com.dom.yei.base.object.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;


/**
 * QYeiUser is a Querydsl query type for YeiUser
 */
public class QYeiUser extends EntityPathBase<YeiUser> {

    private static final long serialVersionUID = -2026068039;

    public static final QYeiUser yeiUser = new QYeiUser("yeiUser");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath username = createString("username");

    public final NumberPath<Integer> yeiUserId = createNumber("yeiUserId", Integer.class);

    public QYeiUser(String variable) {
        super(YeiUser.class, forVariable(variable));
    }

    public QYeiUser(BeanPath<? extends YeiUser> entity) {
        super(entity.getType(), entity.getMetadata());
    }

    public QYeiUser(PathMetadata<?> metadata) {
        super(YeiUser.class, metadata);
    }

}

