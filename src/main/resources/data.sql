INSERT INTO combo.customers_dictionary(category,name,description) VALUES('KLIENT_TYP','OSOBA','Osoba fizyczna');
INSERT INTO combo.customers_dictionary(category,name,description) VALUES('KLIENT_TYP','PODMIOT','Podmiot prawny');
INSERT INTO combo.customers_dictionary(category,name,description) VALUES('ADRES_TYP','ZAMIESZKANIA','Adres zamieszkania');
INSERT INTO combo.customers_dictionary(category,name,description) VALUES('ADRES_TYP','KORESPONDENCYJNY','Adres korespondencyjny');
INSERT INTO combo.customers_dictionary(category,name,description) VALUES('ADRES_TYP','ZAMELDOWANIA','Adres korespondencyjny');

INSERT INTO combo.customers_classification(code,description,parent_id) VALUES('B2C','Segment B2C',NULL);
INSERT INTO combo.customers_classification(code,description,parent_id) VALUES('B2B','Segment B2B',NULL);
INSERT INTO combo.customers_classification(code,description,parent_id) VALUES('HOME','Segment HOME',1);

INSERT INTO combo.customers_customer(name,surname,type_id) VALUES('ADAM','ABACKI',1);
INSERT INTO combo.customers_customer(name,surname,type_id) VALUES('BOGDAN','BABACKI',1);
INSERT INTO combo.customers_customer(name,surname,type_id) VALUES('CZESŁAW','CABACKI',1);
INSERT INTO combo.customers_customer(name,surname,type_id) VALUES('DARIUSZ','DABACKI',1);
INSERT INTO combo.customers_location(city,street,number,apartment) VALUES('Pcim Dolny','Cicha','12','1a');
INSERT INTO combo.customers_location(city,street,number,apartment) VALUES('Pcim Górny','Daleka','1a','5');
INSERT INTO combo.customers_location(city,street,number,apartment) VALUES('Pcim Dolny','Wąska','15','11');
INSERT INTO combo.customers_location(city,street,number,apartment) VALUES('Pcim Górny','Szeroka','1','5');
INSERT INTO combo.customers_address(location_id,type_id,customer_id) VALUES(1,3,1);
INSERT INTO combo.customers_address(location_id,type_id,customer_id) VALUES(2,4,1);
INSERT INTO combo.customers_address(location_id,type_id,customer_id) VALUES(3,3,2);
INSERT INTO combo.customers_address(location_id,type_id,customer_id) VALUES(4,4,2);