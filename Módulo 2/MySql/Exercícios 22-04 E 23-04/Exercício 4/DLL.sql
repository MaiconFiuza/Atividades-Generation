
-- MySQL Script generated by MySQL Workbench
-- Fri Apr 23 16:56:55 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_cidade_das_carnes
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_cidade_das_carnes
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_cidade_das_carnes` DEFAULT CHARACTER SET utf8 ;
USE `db_cidade_das_carnes` ;

-- -----------------------------------------------------
-- Table `db_cidade_das_carnes`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cidade_das_carnes`.`tb_categoria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `marca`  VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_cidade_das_carnes`.`tb_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cidade_das_carnes`.`tb_produto` (
  `id` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `preco` FLOAT NOT NULL,
  `kgs` VARCHAR(45) NOT NULL,
  `tb_categoria_id` INT NOT NULL,
  PRIMARY KEY (`id`, `tb_categoria_id`),
    FOREIGN KEY (`tb_categoria_id`)
    REFERENCES `db_cidade_das_carnes`.`tb_categoria` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
