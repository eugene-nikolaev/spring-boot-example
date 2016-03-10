CREATE TABLE user (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	email varchar(255) not null,
	encrypted_password varchar(255) not null,
	UNIQUE KEY(email)
);