--
-- Copyright 2005-2014 The Kuali Foundation
--
-- Licensed under the Educational Community License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
--
-- http://www.opensource.org/licenses/ecl2.php
--
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

TRUNCATE TABLE KREW_ATT_T DROP STORAGE
/
INSERT INTO KREW_ATT_T (ATTACHMENT_ID,FILE_LOC,FILE_NM,MIME_TYP,NTE_ID,VER_NBR)
  VALUES ('2001','/opt/ears/wf_att_2213_G1_Example1_For_version094_EDL_xml_204458687.tmp','G1.Example1.For.version094.EDL.xml','text/xml','2000',1)
/
INSERT INTO KREW_ATT_T (ATTACHMENT_ID,FILE_LOC,FILE_NM,MIME_TYP,NTE_ID,VER_NBR)
  VALUES ('2003','/opt/ears/wf_att_2219_hasActiveNode_class_204558692.tmp','hasActiveNode.class','text/plain','2002',1)
/
INSERT INTO KREW_ATT_T (ATTACHMENT_ID,FILE_LOC,FILE_NM,MIME_TYP,NTE_ID,VER_NBR)
  VALUES ('2005','/opt/ears/wf_att_2219_ReadMe_txt_204658693.tmp','ReadMe.txt','text/plain','2004',1)
/
