
########################################shopping center schema###################################

create table if not exists `city`
(
  `name`        VARCHAR(100),
  `orientation` VARCHAR(50),
  PRIMARY KEY `pk_city_name` (`name`)
);

create table if not exists `country`
(
  `name`      varchar(100),
  `continent` varchar(100),
  `cityname`  varchar(100),
  primary key `pk_country_cityname` (`cityname`)
);

# create table if not exists `product`
# (
#   `id`            integer not null,
#   `description`   varchar(200),
#   `price`         double,
#   `name`          varchar(100),
#   `origencountry` varchar(100),
#   primary key `pk_product_id` (`id`)
# );
#
# create table if not exists `status_order`
# (
#   `status`      varchar(50),
#   `description` varchar(200),
#   primary key `pk_order_status` (`status`)
# );
#
# create table if not exists `user_session`
# (
#   `status`      varchar(50),
#   `description` varchar(200),
#   `starttime`   date,
#   `endtime`     date,
#   primary key `pk_session_status` (`status`)
# );
#
# create table if not exists `user`
# (
#   `username`    varchar(100),
#   `password`    varchar(150),
#   `usersession` varchar(100),
#   primary key `pk_user_username` (`username`)
# );
#
# create table if not exists `order`
# (
#   `id`          integer not null,
#   `username`    varchar(100),
#   `productid`   integer,
#   `statusorder` varchar(50),
#   `orderdate`   date,
#   primary key `pk_order_id` (`id`)
#
# );

#################################################################################################################
alter table `country` add constraint `fk_country_city` foreign key (`cityname`) references city (`name`);
# alter table `product` add constraint `fk_product_country` foreign key (`id`) references country (`id`);
# alter table `user` add constraint `fk_user_usersession` foreign key  (`usersession`) references user_session (`status`);
# alter table `order` add constraint `fk_order_user` foreign key  (`username`) references user (`username`);
# alter table `order` add  constraint `fk_order_product` foreign key (`productid`) references product (`id`);
# alter table `order` add constraint `fk_order_statusorder` foreign key  (`statusorder`) references status_order (`status`);


