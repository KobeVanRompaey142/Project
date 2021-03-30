

insert into GROUPP (
    ID, GROUP_NAME, LINK_MORE_INFO, ADRESSE,
    SCHOOL,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR)
values (
           1, 'sloebers', 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos','leerjaar', true, '14u30', '18u');

insert into GROUPP (
    ID, GROUP_NAME, LINK_MORE_INFO, ADRESSE,
    SCHOOL,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR)
values (
           2, 'speelclub', 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos','leerjaar',  true, '14u30', '18u');

insert into GROUPP (
    ID, GROUP_NAME, LINK_MORE_INFO, ADRESSE,
    SCHOOL,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR)
values (
           3, 'rakkers', 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos','leerjaar',  true, '14u30', '18u');

insert into GROUPP (
    ID, GROUP_NAME, LINK_MORE_INFO, ADRESSE,
    SCHOOL,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR)
values (
           4, 'toppers', 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos','middelbaar',  true, '14u30', '19u');

insert into GROUPP (
    ID, GROUP_NAME, LINK_MORE_INFO, ADRESSE,
    SCHOOL,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR)
values (
           5, 'kerels', 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos','middelbaar',true, '14u30', '20u');

insert into GROUPP (
    ID, GROUP_NAME, LINK_MORE_INFO, ADRESSE,
    SCHOOL,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR)
values (
           6, 'aspiranten', 'https://jongenschirokodb.be/',
           'Mechelseweg 100A, 1880 Kapelle-op-den-Bos','middelbaar',  true, '14u30', '21u');

insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST, FOOD_PROVIDED, INDOOR,OUTDOOR, DISTANCE_FROM_CHIRO_IN_KM)
values (
           1,'Toneel: het gedroomde land', 'sloebers', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
           'leerjaar',200,  true, '15u30', '18u',5,true,true,false,12);

insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST,FOOD_PROVIDED, INDOOR,OUTDOOR, DISTANCE_FROM_CHIRO_IN_KM)
values (
           2,'Toneel: Het zwarte woud', 'speelclub', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
           'leerjaar',200,  true, '15u30', '18u',5,true,false,true,25);

insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST,FOOD_PROVIDED, INDOOR,OUTDOOR, DISTANCE_FROM_CHIRO_IN_KM)
values (
           3, 'Toneel: Niemandsland', 'rakkers', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
           'leerjaar',200,  true, '15u30', '18u',5,true,false,true,30);

insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST,FOOD_PROVIDED, INDOOR,OUTDOOR, DISTANCE_FROM_CHIRO_IN_KM)
values (
           4,'Theater: Notenkraker', 'toppers', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
           'middelbaar',200,  true, '15u30', '19u',9,true,true,false,5);

insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST,FOOD_PROVIDED, INDOOR,OUTDOOR, DISTANCE_FROM_CHIRO_IN_KM)
values (
           5,'Theater : No way!', 'kerels', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
           'middelbaar',400,  true, '15u30', '20u',9,true,true,false,5);

insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST,FOOD_PROVIDED, INDOOR,OUTDOOR, DISTANCE_FROM_CHIRO_IN_KM)
values (
           6,'Comedy show: Nu of nooit', 'aspiranten', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
           'middelbaar',400,  true, '15u30', '20u',9,true,false,true,7);




INSERT INTO NEWS
(ID, name, price_presale_in_eur, price_in_eur, extra_info, date,  activity_Id)
VALUES
(1,  'Het gedroomde land toneel', null, null, 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
 '2020-03-28',  1);

INSERT INTO NEWS
(ID, name, price_presale_in_eur, price_in_eur, extra_info, date,  activity_Id)
VALUES
(2,  'Zwarte woud toneel', null, null, 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
 '2020-03-30',  2);

INSERT INTO NEWS
(ID, name, price_presale_in_eur, price_in_eur, extra_info, date,  activity_Id)
VALUES
(3,  'Niemandsland toneel', null, null, 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
 '2020-03-30',  3);


INSERT INTO NEWS
(ID, name, price_presale_in_eur, price_in_eur, extra_info, date,  activity_Id)
VALUES
(4,  'De theater notenkraker', null, null, 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
 '2020-03-28',  4);

INSERT INTO NEWS
(ID, name, price_presale_in_eur, price_in_eur, extra_info, date,  activity_Id)
VALUES
(5,  'No way: breaking news', null, null, 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
 '2020-03-30',  5);

INSERT INTO NEWS
(ID, name, price_presale_in_eur, price_in_eur, extra_info, date,  activity_Id)
VALUES
(6,  'Comedy show gaat het door ?', null, null, 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
 '2020-03-30',  6);




