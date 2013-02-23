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
                                
TRUNCATE TABLE krtrain_book_t;

INSERT INTO krtrain_book_t (id,obj_id,ver_nbr,title,typ_cd,isbn,pub_nm,pub_cd,pub_add,pub_st,fict,formats,bind_typ,lang,summary,pub_dt,price)
  VALUES (1, '6bbbdb82-d614-49c2-8716-4234e72f9f61', 1, 'KRAD in Action!', 'IT', '34598-33', 'OReilly', '08','1356 39th New York','NY','N','P,K','Sprial','E','See the KRAD framework in Action. Full code examples',now(),'19.99');
  
INSERT INTO krtrain_chapter_t (book_id,num,obj_id,ver_nbr,title,part,summ,num_pages,rec,rec_page_num)
  VALUES (1, 1, '6bbbdb82-d614-49c2-8716-4234e72f9f62', 1, 'Basics', 'Introduction','Introduction to the framework',30,'Y', 31);
  
INSERT INTO krtrain_chapter_t (book_id,num,obj_id,ver_nbr,title,part,summ,num_pages,rec,rec_page_num)
  VALUES (1, 2, '6bbbdb82-d614-49c2-8716-4234e72f9f63', 1, 'Setup', 'Introduction','Project Setup',15,'Y', 16);
  
INSERT INTO krtrain_book_t (id,obj_id,ver_nbr,title,typ_cd,isbn,pub_nm,pub_cd,pub_add,pub_st,fict,formats,bind_typ,lang,summary,pub_dt,price)
  VALUES (2, '6bbbdb82-d614-49c2-8716-4234e72f9f64', 1, 'Kuali Applications', 'IT', '34598-67', 'OReilly', '08','1356 39th New York','NY','N','P,K','Sprial','E','Learn all about the various Kuali Applications',now(),'39.99');
  
INSERT INTO krtrain_chapter_t (book_id,num,obj_id,ver_nbr,title,part,summ,num_pages,rec,rec_page_num)
  VALUES (2, 1, '6bbbdb82-d614-49c2-8716-4234e72f9f65', 1, 'The Financial System', 'App Tour','Introduction to the Kuali financial system',13,'N', 0);
  
INSERT INTO krtrain_chapter_t (book_id,num,obj_id,ver_nbr,title,part,summ,num_pages,rec,rec_page_num)
  VALUES (2, 2, '6bbbdb82-d614-49c2-8716-4234e72f9f66', 1, 'The Research System', 'App Tour','Introduction to the Kuali research system',11,'N', 0);

INSERT INTO krtrain_book_t (id,obj_id,ver_nbr,title,typ_cd,isbn,pub_nm,pub_cd,pub_add,pub_st,fict,formats,bind_typ,lang,summary,pub_dt,price)
  VALUES (3, '6bbbdb82-d614-49c2-8716-4234e72f9f67', 1, 'The Future of Software', 'SCI-FI', '34598-88', 'OReilly', '08','1356 39th New York','NY','Y','P,K','Sprial','E','A story of what software will become in the future',now(),'18.99');
  
INSERT INTO krtrain_chapter_t (book_id,num,obj_id,ver_nbr,title,part,summ,num_pages,rec,rec_page_num)
  VALUES (3, 1, '6bbbdb82-d614-49c2-8716-4234e72f9f68', 1, 'New Tools', '2040','In 2040 we will see many new tools',25,'N', 0);
  
INSERT INTO krtrain_chapter_t (book_id,num,obj_id,ver_nbr,title,part,summ,num_pages,rec,rec_page_num)
  VALUES (3, 2, '6bbbdb82-d614-49c2-8716-4234e72f9f69', 1, 'Software that corrects itself', '2040','In the future we will have software that finds its own bugs and applies fixes',11,'N', 0);

INSERT INTO krtrain_book_id_s values (4);

INSERT INTO krcr_nmspc_t values ('krtrain', uuid(), 1, 'KRAD Training', 'Y', 'RICE');

UPDATE krim_perm_attr_data_t set attr_val = '*' where perm_id = '150';