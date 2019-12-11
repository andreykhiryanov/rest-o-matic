# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table link (
  restaurant_name               varchar(255),
  visitor_name                  varchar(255)
);

create table restaurant (
  restaurant_name               varchar(255) not null,
  legal_name                    varchar(255),
  inn                           integer not null,
  address                       varchar(255),
  constraint pk_restaurant primary key (restaurant_name)
);

create table visitor (
  first_name                    varchar(255) not null,
  last_name                     varchar(255),
  email                         varchar(255),
  phone_number                  varchar(255),
  constraint pk_visitor primary key (first_name)
);


# --- !Downs

drop table if exists link cascade;

drop table if exists restaurant cascade;

drop table if exists visitor cascade;

