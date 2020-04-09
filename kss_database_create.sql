create table owners (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), address varchar(255), city varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table pets (id bigint not null auto_increment, birth_date date, name varchar(255), owner_id bigint, pet_id bigint, primary key (id)) engine=InnoDB
create table specialties (id bigint not null auto_increment, description varchar(255), primary key (id)) engine=InnoDB
create table types (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table vets (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table vets_specialties (vet_id bigint not null, specialty_id bigint not null, primary key (vet_id, specialty_id)) engine=InnoDB
create table visits (id bigint not null auto_increment, description varchar(255), date date, pet_id bigint, primary key (id)) engine=InnoDB
alter table pets add constraint FK6teg4kcjcnjhduguft56wcfoa foreign key (owner_id) references owners (id)
alter table pets add constraint FK2o2d9igdyhcboppjnan3omt5d foreign key (pet_id) references types (id)
alter table vets_specialties add constraint FKhxfl56b7o0g0vwj2xghl7kwp5 foreign key (specialty_id) references specialties (id)
alter table vets_specialties add constraint FKtoao78ifvra3xnjjhmk67g7fc foreign key (vet_id) references vets (id)
alter table visits add constraint FK6jcifhlqqlsfseu67utlouauy foreign key (pet_id) references pets (id)
create table owners (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), address varchar(255), city varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table pets (id bigint not null auto_increment, birth_date date, name varchar(255), owner_id bigint, pet_id bigint, primary key (id)) engine=InnoDB
create table specialties (id bigint not null auto_increment, description varchar(255), primary key (id)) engine=InnoDB
create table types (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table vets (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table vets_specialties (vet_id bigint not null, specialty_id bigint not null, primary key (vet_id, specialty_id)) engine=InnoDB
create table visits (id bigint not null auto_increment, description varchar(255), date date, pet_id bigint, primary key (id)) engine=InnoDB
alter table pets add constraint FK6teg4kcjcnjhduguft56wcfoa foreign key (owner_id) references owners (id)
alter table pets add constraint FK2o2d9igdyhcboppjnan3omt5d foreign key (pet_id) references types (id)
alter table vets_specialties add constraint FKhxfl56b7o0g0vwj2xghl7kwp5 foreign key (specialty_id) references specialties (id)
alter table vets_specialties add constraint FKtoao78ifvra3xnjjhmk67g7fc foreign key (vet_id) references vets (id)
alter table visits add constraint FK6jcifhlqqlsfseu67utlouauy foreign key (pet_id) references pets (id)
create table owners (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), address varchar(255), city varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table pets (id bigint not null auto_increment, birth_date date, name varchar(255), owner_id bigint, pet_id bigint, primary key (id)) engine=InnoDB
create table specialties (id bigint not null auto_increment, description varchar(255), primary key (id)) engine=InnoDB
create table types (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table vets (id bigint not null auto_increment, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table vets_specialties (vet_id bigint not null, specialty_id bigint not null, primary key (vet_id, specialty_id)) engine=InnoDB
create table visits (id bigint not null auto_increment, description varchar(255), date date, pet_id bigint, primary key (id)) engine=InnoDB
alter table pets add constraint FK6teg4kcjcnjhduguft56wcfoa foreign key (owner_id) references owners (id)
alter table pets add constraint FK2o2d9igdyhcboppjnan3omt5d foreign key (pet_id) references types (id)
alter table vets_specialties add constraint FKhxfl56b7o0g0vwj2xghl7kwp5 foreign key (specialty_id) references specialties (id)
alter table vets_specialties add constraint FKtoao78ifvra3xnjjhmk67g7fc foreign key (vet_id) references vets (id)
alter table visits add constraint FK6jcifhlqqlsfseu67utlouauy foreign key (pet_id) references pets (id)
