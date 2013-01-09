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


