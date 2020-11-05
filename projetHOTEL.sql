create  database GESTION_HOTEL_BD;
use GESTION_HOTEL_BD;
create table CLIENT(
id_Facture int null,
id_Client int null,
adresse varchar(50) not null,
telephone varchar(50) not null,
Mail varchar(100) not null,
nom varchar(50) not null,
prenom varchar(50) not null,
primary key (id_Facture)
primary key (id_Client));

-- drop 
 create table FACTURE(
 id_Facture int not null,
 Date date,
 montant double,
 primary key (id_Facture));
 
 create table RESERVATION(
 id_RESERVATION INT NOT NULL,
 
 
 
 
 

