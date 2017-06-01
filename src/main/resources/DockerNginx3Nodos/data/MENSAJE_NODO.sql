USE `mysql`;

DROP TABLE IF EXISTS `MENSAJE_NODO`;

CREATE TABLE `MENSAJE_NODO` (
  `ID_NODO` varchar(15) NOT NULL,
  `DESC_NODO` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_NODO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `MENSAJE_NODO` WRITE;

INSERT INTO `MENSAJE_NODO` VALUES ('001','Hola !!! Tu petición esta siendo atendida por el nodo 1'),('002','Soy el nodo 2, encantado de atender tu petición'),('003','Vaya, por fin alguna petición para el nodo 3');

UNLOCK TABLES;

