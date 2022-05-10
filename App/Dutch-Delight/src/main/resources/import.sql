/*POPULARE TABEL MESE*/
/*In functie de numarul de mese ale restautantului se mai poate adauga de aici un anume numar de mese default */
/*In aceasta aplicatie am configurat default numarul de 7 mese*/
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('1','1');
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('2','2');
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('3','3');
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('4','4');
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('5','5');
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('6','6');
INSERT INTO `dutch_delight`.`tables` (`id`, `number`) VALUES ('7','7');

/*Acestea sunt rolurile si utilizatori default cu care vine aplicatia*/
/*POPULARE TABEL ROLES*/
INSERT INTO `dutch_delight`.`roles` (`id`, `name`) VALUES ('1', 'Admin');
INSERT INTO `dutch_delight`.`roles` (`id`, `name`) VALUES ('2', 'Angajat');
INSERT INTO `dutch_delight`.`roles` (`id`, `name`) VALUES ('3', 'Client');

/*POPULARE TABEL USERS*/
INSERT INTO `dutch_delight`.`users` (`id`, `email`, `first_name`, `last_name`, `password`,`masa_id`) VALUES ('1', 'admin@hotmail.com', 'Gabriel', 'Procopie', '$2a$10$jvhIOmJjV810OI6KTnCyM.2/58T/9Dv5gNcjBEtdEdSc0jArLfeKO','1');
INSERT INTO `dutch_delight`.`users` (`id`, `email`, `first_name`, `last_name`, `password`,`masa_id`) VALUES ('2', 'lucagehl@gmail.com', 'Luke-Joseph', 'Gehl', '$2a$10$KMPOY8Euhskrd5omDxfjAuAr0V.8KH/n6pfjADA/vnilNHNYJS/fy','2');
INSERT INTO `dutch_delight`.`users` (`id`, `email`, `first_name`, `last_name`, `password`,`masa_id`) VALUES ('3', 'madalina_maria@gmail.com', 'Madalina', 'Maria', '$2a$10$Iap4pnrLhnHA/lItUkuyqejbHss271ktVuGv30mcamK1kv45QVBo2','3');

/*POPULARE TABEL ASOCIATIV USERS - ROLES*/
INSERT INTO `dutch_delight`.`users_roles` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `dutch_delight`.`users_roles` (`user_id`, `role_id`) VALUES ('2', '2');
INSERT INTO `dutch_delight`.`users_roles` (`user_id`, `role_id`) VALUES ('3', '3');

/*POPULARE TABEL CATEGORY*/
/* Acestea sunt o serie de categorii cu care vine aplicatia default */
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('1','Salate');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('2','Mic dejun');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('3','Gratar');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('4','Aperitive');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('5','Bauturi racoritoare');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('6','Bauturi alcoolice');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('7','Diverse');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('8','Desert');
INSERT INTO `dutch_delight`.`category` (`id`, `name`) VALUES ('9','Fructe de mare');

/*POPULARE TABEL PRODUCTS*/
INSERT INTO `dutch_delight`.`products` (`id`, `name`, `price`, `categorie_id`) VALUES ('1', 'Salata bulgareasca', '25', '1');
INSERT INTO `dutch_delight`.`products` (`id`, `name`, `price`, `categorie_id`) VALUES ('2', 'Salata de varza', '20', '1');
INSERT INTO `dutch_delight`.`products` (`id`, `name`, `price`, `categorie_id`) VALUES ('3', 'Coca-Cola 330ml', '5','5');
INSERT INTO `dutch_delight`.`products` (`id`, `name`, `price`, `categorie_id`) VALUES ('4', 'Pastrav la gratar', '30', '3');

/*POPULARE TABEL INGREDIENTS*/
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('1', 'branza','1');
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('2', 'varza','2');
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('3', 'sare','2');
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('4', 'piper','1');
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('5', 'zahar','3');
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('6', 'smantana','4');
INSERT INTO `dutch_delight`.`ingredients` (`id`, `name`, `produs_id`) VALUES ('7', 'paine','1');




--INSERT INTO `dutch_delight`.`tables` (`id`, `number`, `user_id`) VALUES ('1', '1', '3');
--INSERT INTO `dutch_delight`.`tables` (`id`, `number`, `user_id`) VALUES ('2', '2', '4');

--UPDATE `dutch_delight`.`users` SET `masa_id` = '1' WHERE (`id` = '1');
--UPDATE `dutch_delight`.`users` SET `masa_id` = '1' WHERE (`id` = '2');
--UPDATE `dutch_delight`.`users` SET `masa_id` = '1' WHERE (`id` = '3');
--UPDATE `dutch_delight`.`users` SET `masa_id` = '2' WHERE (`id` = '4');

/*POPULARE TABEL ASOCIATIV USERS - TABLES*/
--INSERT INTO `dutch_delight`.`tables_products` (`table_id`, `product_id`) VALUES ('1', '1');
--INSERT INTO `dutch_delight`.`tables_products` (`table_id`, `product_id`) VALUES ('1', '2');
--INSERT INTO `dutch_delight`.`tables_products` (`table_id`, `product_id`) VALUES ('2', '1');















