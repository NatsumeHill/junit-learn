create schema if not exists learnjunit;

create table if not exists user
(
	id int auto_increment
		primary key,
	name varchar(20) null,
	phone varchar(20) null
);

insert into user (name, phone) values ('kiki','12121');
