drop table if exists Movie;
drop table if exists director;

create table Movie(
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    image_url varchar(500)
);

create table director(
    id int primary key auto_increment,
    name varchar(200) not null,
    age int
);

create table actor(
    id int primary key auto_increment,
    name varchar(200) not null,
    age int not null,
    status varchar(20) not null
);
insert into actor(name,age,status) value('Emia Shirou',15,'Alive');
insert into actor(name,age,status) values
('Emilia Clarke',34, 'Alive'),
('kanus reeve',56, 'Alive'),
('Andrew Garfield',37, 'Alive'),
('Tobey Maguire',45, 'Alive'),
('Rami Malek',39, 'Alive'),
('Tom Kenny',58,'Alive'),
('Emia Shirou',15,'Alive'),
('The whites',15, 'Alive');


insert into movie (name, description,image_url ) values
('Bob Esponja','Si vive una piña de bajo del mar','https://images-na.ssl-images-amazon.com/images/I/91VMURZ9jSL.jpg'),
('John Wick','John Wick es una franquicia de medios de acción y suspenso neo-noir estadounidense creada por el guionista Derek Kolstad y propiedad de Summit Entertainment. Keanu Reeves interpreta a John Wick, un sicario retirado que busca venganza por la muerte del perro que le dio su esposa recientemente fallecida.','https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2017/05/john-wick.jpg'),
('Bohemian Rhapsody','Bohemian Rhapsody es una película biográfica británica-estadounidense de 2018 sobre el cantante británico Freddie Mercury y el grupo de rock Queen. Fue dirigida por Bryan Singer, aunque Dexter Fletcher asumió el cargo de director las últimas semanas de rodaje tras el despido de Singer','https://img.europapress.es/fotoweb/fotonoticia_20151031080532_1024.jpg'),
('Fate Heavens Feel','Heavens Feel es una de las rutas de Fate/stay night. La heroína de esta ruta es Sakura Matou. Heavens Feel es la tercera y última ruta que se puede desbloquear al jugar Fate/stay night.','https://i1.wp.com/www.myepicnet.com/wp-content/uploads/2020/08/pjimage-12.jpg?fit=1024%2C576&ssl=1'),
('No game no life','No Game No Life es una serie japonesa de novelas ligeras escrita por Yuu Kamiya. Fue publicado por Media Factory bajo el sello MF Bunko J con diez volúmenes lanzados desde abril 25 del 2012 hasta febrero 26 del 2018','https://www.beahero.gg/wp-content/uploads/2019/06/No-Game-No-life-BD-909x600.jpg'),
('Spider-man 3','Peter Parker sufre una terrible transformación cuando su traje de Hombre Araña se vuelve negro y libera una personalidad oscura y vengativa.','https://media.revistagq.com/photos/5d5d19b10ef2260008f5cdb7/master/pass/mejor%20spider-man%20pelicula%20sony%20marvel.jpg'),
('The amazing spiderman','La investigación de Peter Parker para resolver la desaparición de sus padres lo coloca en el camino de un choque con el alter ego mortal de un científico conocido como el Lagarto.','https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2013/06/230866-ya-tienen-fecha-estreno-amazing-spider-man-3-4.jpg?itok=A1qMYhgx'),
('Me before you','La vida de Louisa Clark, una chica alegre y alocada, que va empalmando un trabajo con otro para ayudar a su familia a subsistir, cambia por completo cuando comienza a trabajar como cuidadora de un joven millonario, quien quedó paralítico tras un accidente.','https://images-na.ssl-images-amazon.com/images/I/91VMURZ9jSL.jpg');


insert into director (name, age) values
('Thea Sharrock',69),
('Chad Stahelski', 52),
('Stephen Hillenburg',57),
('Tomonori Sudou',30),
('Atsuko Ishizuka', 40),
('Bryan Singer', 55),
('Sam Raimi', 61);;

alter table Movie
add column director_id int not null,
add foreign key(director_id) references director(id);



alter table Movie
add column actor_id int not null,
add foreign key(actor_id) references actor(id);


update movie set director_id = 4 where id in (4);
update movie set director_id = 2 where id in (2);
update movie set director_id = 7 where id in (3);
update movie set director_id = 8 where id in (6);
update movie set director_id = 1 where id in (8);
update movie set director_id = 3 where id in (1);
update movie set director_id = 5 where id in (5);
update movie set director_id = 8 where id in (7);

update movie set actor_id = 1 where id in (8);
update movie set actor_id = 2 where id in (2);
update movie set actor_id = 6 where id in (5);
update movie set actor_id = 3 where id in (7);
update movie set actor_id = 4 where id in (6);
update movie set actor_id = 7 where id in (1);
update movie set actor_id = 5 where id in (3);
update movie set actor_id = 8 where id in (4);


alter table movie
modify director_id int not null;



alter table movie
modify actor_id int not null;

delete from movie where id = 9;


