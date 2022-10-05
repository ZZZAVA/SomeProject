create extension hstore;
create schema worklist;
create table if not exists worklist."Company" ("id" BIGSERIAL NOT NULL PRIMARY KEY,"company" VARCHAR NOT NULL);
create table if not exists worklist."Employee" ("id" BIGSERIAL NOT NULL PRIMARY KEY, "name" VARCHAR NOT NULL);
create table if not exists worklist."Worklist" ("id" BIGSERIAL NOT NULL PRIMARY KEY,"company" INT, "name" INT);