-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 02, 2019 at 09:46 PM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.15-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dXrzjYnA8J`
--

-- --------------------------------------------------------

--
-- Table structure for table `Chat_Log`
--

CREATE TABLE `Chat_Log` (
  `message_id` int(20) NOT NULL,
  `post_on` date DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `message` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Games`
--

CREATE TABLE `Games` (
  `game_id` int(100) NOT NULL,
  `game_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `game_category` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(750) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` decimal(4,0) DEFAULT NULL,
  `publisher` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `producer` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Games`
--

INSERT INTO `Games` (`game_id`, `game_name`, `game_category`, `description`, `price`, `publisher`, `producer`) VALUES
(1, 'Apex Legends', 'Action', 'Conquer with character in Apex Legends, a free-to-play* Battle Royale shooter where legendary characters with powerful abilities team up to battle for fame & fortune on the fringes of the Frontier. Master an ever-growing roster of diverse Legends, deep tactical squad play and bold new innovations that level up the Battle Royale experience—all within a rugged world where anything goes. Welcome to the next evolution of Battle Royale.', '0', 'Respawn Entertainment', 'Origin');

-- --------------------------------------------------------

--
-- Table structure for table `User_Account`
--

CREATE TABLE `User_Account` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `User_Account`
--

INSERT INTO `User_Account` (`user_id`, `user_name`, `user_email`, `user_password`) VALUES
(1, 'Exile', 'exile29@gmail.com', 'password123');

-- --------------------------------------------------------

--
-- Table structure for table `User_Library`
--

CREATE TABLE `User_Library` (
  `user_id` int(11) DEFAULT NULL,
  `game_id` int(100) DEFAULT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `User_Library`
--

INSERT INTO `User_Library` (`user_id`, `game_id`, `installed`) VALUES
(1, 1, 'Y');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Chat_Log`
--
ALTER TABLE `Chat_Log`
  ADD PRIMARY KEY (`message_id`);

--
-- Indexes for table `Games`
--
ALTER TABLE `Games`
  ADD PRIMARY KEY (`game_id`);

--
-- Indexes for table `User_Account`
--
ALTER TABLE `User_Account`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `User_Library`
--
ALTER TABLE `User_Library`
  ADD KEY `PK/FK` (`user_id`,`game_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
