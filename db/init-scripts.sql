create extension hstore;
create schema worklist;
create table if not exists worklist."Worklist" ("id" BIGSERIAL NOT NULL PRIMARY KEY,"company" VARCHAR NOT NULL, "name" VARCHAR NOT NULL);