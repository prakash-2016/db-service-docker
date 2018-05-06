CREATE TABLE quotes (
	id BIGINT NOT NULL AUTO_INCREMENT,
	user_name varchar(255) NOT NULL,
	quote varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

insert into quotes (user_name, quote) values ('Rujia', '43');

