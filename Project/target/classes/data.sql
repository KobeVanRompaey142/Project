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
    START_HOUR, END_HOUR,COST)
values (
    1,'Toneel: het gedroomde land', 'sloebers', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
    'leerjaar',200,  true, '15u30', '18u',5);

     insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST)
values (
    2,'Toneel: Het zwarte woud', 'speelclub', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
    'leerjaar',200,  true, '15u30', '18u',5);

     insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST)
values (
    3, 'Toneel: Niemandsland', 'rakkers', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
    'leerjaar',200,  true, '15u30', '18u',5);

     insert into ACTIVITY (
   ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST)
values (
    4,'Theater: Notenkraker', 'toppers', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
    'middelbaar',200,  true, '15u30', '19u',9);

     insert into ACTIVITY (
   ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST)
values (
    5,'Theater : No way!', 'kerels', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
    'middelbaar',400,  true, '15u30', '20u',9);

     insert into ACTIVITY (
    ID,ACTIVITY_NAME, GROUP_NAME, LINK_MORE_INFO,
    SCHOOL,CAPACITY,  FREE_PARKING_AVAILABLE,
    START_HOUR, END_HOUR,COST)
values (
    6,'Comedy show: Nu of nooit', 'aspiranten', 'https://www.uitinvlaanderen.be/agenda/e/de-kevins-met-we-muten-verder-online-live-impro-op/3f685f38-5a1c-421f-a0c1-1f4a388921b6',
    'middelbaar',400,  true, '15u30', '20u',9);