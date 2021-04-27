drop table shop_product cascade constraint;
drop table shop_user cascade constraint;

drop sequence shop_product_seq;

create sequence shop_product_seq;

select * from shop_user
select * from shop_user where username='luxw' and password='1234'
select * from shop_product
create table shop_user
( username varchar2(20) primary key,
  password varchar2(10) not null,
  name varchar2(20) not null,
  zip varchar2(6) ,
  address varchar2(30)
);

create table shop_product
( id number(7) primary key,
  productName varchar2(50) not null,
  price number(7,2),
  picpath varchar2(100)
);

insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'Java���˼��',96,'/image/product/cover.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'��ͨHibernate',68,'/image/product/zcover2.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'Java���ļ�����',87,'/image/product/zcover3.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'Effective Java���İ�',28,'/image/product/zcover4.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'Java��ģʽ',45,'/image/product/zcover5.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'����ǳ��Hibernate',60,'/image/product/zcover6.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'Tomcat��JavaWeb ���ļ������',29.3,'/image/product/zcover7.gif');
insert into shop_product(id,productname,price,picpath) 
values(shop_product_seq.nextval,'��ͨSpring',24.2,'/image/product/zcover8.gif');


insert into shop_user(username,password,name,zip,address)
values('luxw','1234','½��ΰ','100000','������');
insert into shop_user(username,password,name,zip,address)
values('liucy','2222','������','100000','��Է��԰');


