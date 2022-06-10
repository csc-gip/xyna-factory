-----------------------------------------------------
-- Copyright 2022 GIP SmartMercial GmbH, Germany
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
--
--  http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
-----------------------------------------------------

DEFINE path=&1;

WHENEVER SQLERROR EXIT FAILURE ROLLBACK;

--ADJUSTMENT: create needed scripts and enable matching steps

--Tabellen anlegen
PROMPT Tables
@&path./createTables.sql


--Queues anlegen
PROMPT Queues
--@&path./createQueues.sql


--Prozedures anlegen
PROMPT Procedures
--@&path./createProcedures.sql


--Anlegen der Packages
PROMPT Packages
--@&path./createPackages.sql

EXIT;