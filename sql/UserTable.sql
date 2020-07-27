create table LT_USER_TEST(
    id number primary key ,
    name varchar2(20) not null,
    sex varchar2(8),
    mobile_number varchar2(20),
    is_using number default 0
);

create sequence seq_user_test
    increment by 1
    start with 1
    minvalue 1
    nocycle
    cache 20;

insert into
    LT_USER_TEST(id, name, sex, mobile_number, is_using)
    VALUES (SEQ_USER_TEST.nextval, '龙腾', '男', '18311110000', 1);


-- delete LT_USER_TEST where id > 0;
--
-- drop table LT_USER_TEST;