-- apply changes
create table agenda (
  id                            bigint auto_increment not null,
  data                          date not null,
  descricao                     varchar(500) not null,
  array                         longblob not null,
  created_at                    datetime(6) not null,
  updated_at                    datetime(6) not null,
  version                       integer not null,
  constraint pk_agenda primary key (id)
);

