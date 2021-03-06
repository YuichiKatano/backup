drop database if exists ecsite;
create database ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16),
user_name varchar(16),
login_pass varchar(50),
insert_date datetime,
updated_date datetime
);


drop table if exists buy_item_transaction;
create table buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id varchar(16),
total_count int,
total_price int,
user_master_id varchar(16),
pay varchar(30),
insert_date varchar(50),
updated_date varchar(50)
);

drop table if exists item_info_transaction;
create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price varchar(30),
item_stock int,
insert_date datetime,
updated_date datetime
);

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);

insert into item_info_transaction(item_name,item_price,item_stock) values("日本","30000",20);
insert into item_info_transaction(item_name,item_price,item_stock) values("韓国","30000",10);
insert into item_info_transaction(item_name,item_price,item_stock) values("オーストラリア","50000",2);
insert into item_info_transaction(item_name,item_price,item_stock) values("アメリカ","80000",5);
insert into item_info_transaction(item_name,item_price,item_stock) values("カナダ","70000",10);
insert into login_user_transaction(login_id,login_pass,user_name) values("internous","internous01","yuichi");


