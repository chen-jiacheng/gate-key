-- 用户表
create table t_user (
                        id          bigint primary key auto_increment,
                        username    varchar(64)  not null unique,
                        password    char(60)     not null,          -- BCrypt 哈希后固定 60 位
                        status      tinyint      default 1,         -- 1 正常 0 禁用
                        created_at  datetime     default now()
);

-- 角色表
create table t_role (
                        id   bigint primary key auto_increment,
                        name varchar(32) not null unique   -- 如 ADMIN、USER、GUEST
);

-- 用户-角色关联表
create table t_user_role (
                             user_id bigint not null,
                             role_id bigint not null,
                             primary key (user_id, role_id)
);