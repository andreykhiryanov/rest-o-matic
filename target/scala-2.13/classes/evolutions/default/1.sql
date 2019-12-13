# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table restaurant (
  restaurant_id                 bigserial not null,
  restaurant_name               varchar(255) not null,
  legal_name                    varchar(255) not null,
  inn                           integer not null,
  address                       varchar(255) not null,
  constraint pk_restaurant primary key (restaurant_id)
);

create table has (
  restaurant_id                 bigint not null,
  visitor_id                    bigint not null,
  constraint pk_has primary key (restaurant_id,visitor_id)
);

create table visitor (
  visitor_id                    bigserial not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  email                         varchar(255) not null,
  phone_number                  varchar(255) not null,
  constraint pk_visitor primary key (visitor_id)
);

create index ix_has_restaurant on has (restaurant_id);
alter table has add constraint fk_has_restaurant foreign key (restaurant_id) references restaurant (restaurant_id) on delete restrict on update restrict;

create index ix_has_visitor on has (visitor_id);
alter table has add constraint fk_has_visitor foreign key (visitor_id) references visitor (visitor_id) on delete restrict on update restrict;


# --- !Downs

alter table if exists has drop constraint if exists fk_has_restaurant;
drop index if exists ix_has_restaurant;

alter table if exists has drop constraint if exists fk_has_visitor;
drop index if exists ix_has_visitor;

drop table if exists restaurant cascade;

drop table if exists has cascade;

drop table if exists visitor cascade;

