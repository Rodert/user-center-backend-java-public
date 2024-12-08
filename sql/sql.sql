-- auto-generated definition
create table user
(
    id          bigint auto_increment
        primary key,
    nickname    varchar(255) null comment '昵称',
    name        varchar(255) not null,
    password    varchar(255) not null,
    phone       varchar(255) null,
    create_time datetime     null,
    update_time datetime     null,
    role        varchar(255) null,
    planet_code     varchar(255) null comment '星球ID'
);

