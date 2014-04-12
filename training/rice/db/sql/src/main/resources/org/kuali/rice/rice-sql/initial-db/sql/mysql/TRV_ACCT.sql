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

TRUNCATE TABLE TRV_ACCT
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,VER_NBR)
  VALUES (1,'a1','a1',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,VER_NBR)
  VALUES (2,'a14','a14',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,VER_NBR)
  VALUES (2,'a2','a2',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,SUB_ACCT,SUB_ACCT_NAME,VER_NBR)
  VALUES (3,'a3','a3','a3-sub','sub-a3',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,SUB_ACCT,SUB_ACCT_NAME,VER_NBR)
  VALUES (2,'a6','a6','a6-sub','sub-a6',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,VER_NBR)
  VALUES (2,'a8','a8',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,VER_NBR)
  VALUES (2,'a9','a9',0)
/
INSERT INTO TRV_ACCT (ACCT_FO_ID,ACCT_NAME,ACCT_NUM,VER_NBR)
  VALUES (1,'a1','a1',0)
/
