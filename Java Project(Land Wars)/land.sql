drop table Land cascade constraints;

create table Land(
landName varchar2(50),
price number(10),
building number(10),
hotel number(10),
pass number(10),
passBuilding number(10),
passHotel number(10),
interceptPrice number(10),
interceptPrice2 number(10),
interceptPrice3 number(10)
)

select * from land
select * from landmember


insert into land
values ('출발', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('수서동', 50, 70, 200, 2, 25, 175, 75, 180, 480)
insert into land
values ('방배동', 80, 70, 200, 4, 52, 315, 120, 225, 525)
insert into land
values ('노량진동', 80, 70, 200, 6, 52, 315, 120, 225, 525)
insert into land
values ('보너스', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('도곡동', 100, 70, 200, 6, 78, 385, 150, 255, 555)
insert into land
values ('신당동', 100, 70, 200, 6, 78, 385, 150, 255, 555)
insert into land
values ('사당동', 120, 70, 200, 8, 91, 420, 180, 285, 585)
insert into land
values ('무인도', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('자곡동', 140, 130, 400, 10, 130, 525, 210, 405, 1005)
insert into land
values ('대방동', 160, 130, 400, 12, 156, 630, 240, 435, 1035)
insert into land
values ('논현동', 160, 130, 400, 12, 156, 630, 240, 435, 1035)
insert into land
values ('서초동', 180, 130, 400, 14, 180, 665, 270, 465, 1065)
insert into land
values ('보너스', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('아현동', 160, 130, 400, 12, 156, 630, 240, 435, 1035)
insert into land
values ('교북동', 200, 130, 400, 16, 195, 700, 300, 495, 1095)
insert into land
values ('사회복지기금', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('성수동', 220, 190, 550, 18, 221, 735, 330, 615, 1440)
insert into land
values ('수유동', 240, 190, 550, 20, 260, 770, 360, 645, 1470)
insert into land
values ('반포동', 240, 190, 550, 20, 260, 770, 360, 645, 1470)
insert into land
values ('삼성동', 260, 190, 550, 22, 286, 805, 390, 675, 1500)
insert into land
values ('신계동', 260, 190, 550, 22, 286, 805, 390, 675, 1500)
insert into land
values ('보너스', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('수서동', 280, 190, 550, 24, 312, 840, 420, 705, 1530)
insert into land
values ('우주여행', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('대치동', 300, 250, 700, 26, 338, 889, 450, 825, 1875)
insert into land
values ('잠실동', 320, 250, 700, 28, 390, 980, 480, 855, 1905)
insert into land
values ('보너스', 0, 0, 0, 0, 0, 0, 0, 0, 0)
insert into land
values ('잠원동', 320, 250, 700, 28, 390, 980, 480, 855, 1905)
insert into land
values ('개포동', 350, 250, 700, 35, 444, 1050, 525, 900, 1950)
insert into land
values ('청담동', 350, 250, 700, 35, 444, 1050, 525, 900, 1950)
insert into land
values ('압구정동', 350, 250, 700, 40, 481, 1120, 525, 900, 1950)