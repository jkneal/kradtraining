TRUNCATE TABLE krtrain_book_typ_t;

INSERT INTO krtrain_book_typ_t (typ_cd,obj_id,ver_nbr,nm,desc_txt,actv_ind)
  VALUES ('ROM', '6bbbdb82-d614-49c2-8716-4234e72f9f5e', 1, 'Romantic', 'Romantic Books', 'Y');

INSERT INTO krtrain_book_typ_t (typ_cd,obj_id,ver_nbr,nm,desc_txt,actv_ind)
  VALUES ('SCI-FI', '482b3394-0327-4e93-bd80-c5dc3b2a9e1f', 1, 'Science Fiction', 'Science Fiction Story', 'Y');

INSERT INTO krtrain_book_typ_t (typ_cd,obj_id,ver_nbr,nm,desc_txt,actv_ind)
  VALUES ('IT', '482b3394-0327-4e93-bd80-c5dc3b2a9e20', 1, 'Technical', 'Computers and Technology', 'Y');

TRUNCATE TABLE krtrain_author_t;

INSERT INTO krtrain_author_t (author_id,obj_id,ver_nbr,nm,address,email,phone_nbr)
  VALUES ('1','a03ad608-84fa-4c89-8410-0a91ed56cb66', 1,'Roshan Mahanama','','roshan@jimail.com','123-123-1233');

INSERT INTO krtrain_author_t (author_id,obj_id,ver_nbr,nm,address,email,phone_nbr)
  VALUES ('2','a03ad608-84fa-4c89-8410-0a91ed56cb32', 1,'James Franklin','','jfranklin@jimail.com','999-433-4323');

TRUNCATE TABLE krtrain_pub_cd_t;

INSERT INTO krtrain_pub_cd_t (pub_cd,obj_id,ver_nbr,nm)
  VALUES ('1020', '6bbbdb82-d614-49c2-8716-4234e72f9f60', 1, 'A-Catalog');

INSERT INTO krtrain_pub_cd_t (pub_cd,obj_id,ver_nbr,nm)
  VALUES ('1050', '6bbbdb82-d614-49c2-8716-4234e72f9f61', 1, 'B-Catalog');

INSERT INTO krtrain_pub_cd_t (pub_cd,obj_id,ver_nbr,nm)
  VALUES ('1080', '6bbbdb82-d614-49c2-8716-4234e72f9f62', 1, 'C-Catalog');

INSERT INTO krtrain_pub_cd_t (pub_cd,obj_id,ver_nbr,nm)
  VALUES ('2000', '6bbbdb82-d614-49c2-8716-4234e72f9f63', 1, 'D-Catalog');

INSERT INTO krtrain_pub_cd_t (pub_cd,obj_id,ver_nbr,nm)
  VALUES ('2030', '6bbbdb82-d614-49c2-8716-4234e72f9f64', 1, 'E-Catalog');

INSERT INTO krtrain_pub_cd_t (pub_cd,obj_id,ver_nbr,nm)
  VALUES ('3000', '6bbbdb82-d614-49c2-8716-4234e72f9f65', 1, 'F-Catalog');

INSERT INTO KRCR_CMPNT_T VALUES ('KR-SAP', 'BookEntry', uuid(), 1, 'BookEntry', 'Y');

INSERT INTO KRCR_PARM_T VALUES ('KR-SAP', 'BookEntry', 'FormatsHelpUrl', uuid(), 1, 'CONFG',
                                'https://wiki.kuali.org/display/KULRICE/Developer+Documentation',
                                'Help URL for the Book Entry view formats section', 'A', 'KUALI');

INSERT INTO KRCR_PARM_T VALUES ('KR-SAP', 'BookEntry', 'RenderPublisherLogo', uuid(), 1, 'CONFG',
                                'N', 'Determines whether the publisher logo is rendered on the book entry view', 'A', 'KUALI');

