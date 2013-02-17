CREATE TABLE krtrain_book_typ_t
(
	typ_cd VARCHAR(40) NOT NULL,
	obj_id VARCHAR(36) NOT NULL,
	ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
	nm VARCHAR(100),
	desc_txt VARCHAR(255),
	actv_ind VARCHAR(1) DEFAULT 'Y',
	PRIMARY KEY (typ_cd),
	UNIQUE krtrain_book_typ_tc0(obj_id)
);

CREATE TABLE krtrain_author_t
(
	author_id BIGINT NOT NULL,
    obj_id VARCHAR(36) NOT NULL,
 	ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
	nm VARCHAR(100),
	address VARCHAR(200),
	email VARCHAR(50),
	phone_nbr VARCHAR(20),
	PRIMARY KEY (author_id),
	UNIQUE bk_author_tc0(obj_id)
);

CREATE TABLE krtrain_author_id_s
(
	id BIGINT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);

CREATE TABLE krtrain_pub_cd_t
(
	pub_cd VARCHAR(40) NOT NULL,
	obj_id VARCHAR(36) NOT NULL,
	ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
	nm VARCHAR(100),
	PRIMARY KEY (pub_cd),
	UNIQUE krtrain_pub_cd_tc0(obj_id)
);

CREATE TABLE krtrain_book_t
(
	id INT NOT NULL,
	obj_id VARCHAR(36) NOT NULL,
	ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
	title VARCHAR(100),
	typ_cd VARCHAR(100),
	isbn VARCHAR(100),
	pub_nm VARCHAR(100),
	pub_cd VARCHAR(5),
	pub_add VARCHAR(100),
	pub_st VARCHAR(2),
	fict VARCHAR(1),
	formats VARCHAR(200),
	bind_typ VARCHAR(100),
	lang VARCHAR(200),
	summary VARCHAR(250),
	pub_dt DATE,
	price DECIMAL(19,2),
	PRIMARY KEY (id),
	UNIQUE krtrain_book_tc0(obj_id)
);

CREATE TABLE krtrain_chapter_t
(
	book_id INT NOT NULL,
	num INT NOT NULL,
	obj_id VARCHAR(36) NOT NULL,
	ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
	title VARCHAR(100),
	part VARCHAR(100),
	summ VARCHAR(200),
	num_pages INT,
	rec VARCHAR(1),
	rec_page_num INT,
	PRIMARY KEY (book_id, num),
	UNIQUE krtrain_chapter_tc0(obj_id)
);

CREATE TABLE krtrain_book_doc_t
(
	fdoc_nbr VARCHAR(14) NOT NULL,
	obj_id VARCHAR(36) NOT NULL,
	ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
	book_id INT NOT NULL,
	PRIMARY KEY (fdoc_nbr),
	UNIQUE krtrain_book_doc_tc0(obj_id)
);

CREATE TABLE krtrain_book_id_s
(
	id BIGINT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);