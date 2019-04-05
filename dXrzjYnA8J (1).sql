-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 05, 2019 at 12:23 AM
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
-- Table structure for table `Apex_Legends`
--

CREATE TABLE `Apex_Legends` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Apex_Legends`
--

INSERT INTO `Apex_Legends` (`user_id`, `purchased`, `installed`) VALUES
(1, 'N', 'N'),
(2, 'N', 'Y'),
(3, 'Y', 'Y'),
(4, 'Y', 'N'),
(5, 'Y', 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `Battlefield_V`
--

CREATE TABLE `Battlefield_V` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Battlefield_V`
--

INSERT INTO `Battlefield_V` (`user_id`, `purchased`, `installed`) VALUES
(1, 'N', 'Y'),
(2, 'Y', 'N'),
(3, 'Y', 'Y'),
(4, 'N', 'N'),
(5, 'N', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `Borderlands 2`
--

CREATE TABLE `Borderlands 2` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Borderlands 2`
--

INSERT INTO `Borderlands 2` (`user_id`, `purchased`, `installed`) VALUES
(1, 'Y', 'Y'),
(2, 'N', 'N'),
(3, 'Y', 'N'),
(4, 'Y', 'Y'),
(5, 'Y', 'N');

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
-- Table structure for table `Counter_Strike`
--

CREATE TABLE `Counter_Strike` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Counter_Strike`
--

INSERT INTO `Counter_Strike` (`user_id`, `purchased`, `installed`) VALUES
(1, 'Y', 'Y'),
(2, 'N', 'N'),
(3, 'Y', 'N'),
(4, 'Y', 'Y'),
(5, 'N', 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `Fifa_19`
--

CREATE TABLE `Fifa_19` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Fifa_19`
--

INSERT INTO `Fifa_19` (`user_id`, `purchased`, `installed`) VALUES
(1, 'Y', 'Y'),
(2, 'Y', 'Y'),
(3, 'Y', 'N'),
(4, 'N', 'Y'),
(5, 'N', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `Football Manager 2019`
--

CREATE TABLE `Football Manager 2019` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Football Manager 2019`
--

INSERT INTO `Football Manager 2019` (`user_id`, `purchased`, `installed`) VALUES
(1, 'Y', 'Y'),
(2, 'Y', 'N'),
(3, 'N', 'N'),
(4, 'Y', 'Y'),
(5, 'N', 'N');

-- --------------------------------------------------------

--
-- Table structure for table `Fortnite`
--

CREATE TABLE `Fortnite` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Fortnite`
--

INSERT INTO `Fortnite` (`user_id`, `purchased`, `installed`) VALUES
(1, 'Y', 'Y'),
(2, 'N', 'N'),
(3, 'N', 'N'),
(4, 'Y', 'N'),
(5, 'N', 'Y');

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
(1, 'Apex Legends', 'Action', 'Conquer with character in Apex Legends, a free-to-play* Battle Royale shooter where legendary characters with powerful abilities team up to battle for fame & fortune on the fringes of the Frontier. Master an ever-growing roster of diverse Legends, deep tactical squad play and bold new innovations that level up the Battle Royale experience—all within a rugged world where anything goes. Welcome to the next evolution of Battle Royale.', '0', 'Respawn Entertainment', 'Origin'),
(2, 'Counter-Strike: Global Offensive', 'FPS', 'Counter-Strike: Global Offensive (CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago. CS: GO features new maps, characters, weapons, and game modes, and delivers updated versions of the classic CS content (de_dust2, etc.).', '0', 'Valve', 'Valve'),
(3, 'Fortnite', 'Action', 'Fortnite Battle Royale is the FREE 100-player PvP mode in Fortnite. One giant map. A battle bus. Fortnite building skills and destructible environments combined with intense PvP combat. The last one standing wins.', '0', 'Epic Games', 'Epic Games'),
(4, 'Fifa 19', 'Sport', 'FIFA 19 delivers a champion-caliber experience on and off the pitch. Led by the prestigious UEFA Champions League, FIFA 19 offers enhanced gameplay features that allow you to control the pitch in every moment.', '55', 'Origin', 'EA Sports'),
(5, 'Battlefield V', 'Shooter', 'The Battlefield series goes back to its roots in a never-before-seen portrayal of World War 2. Take on physical, all-out multiplayer with your squad in modes like the vast Grand Operations and the cooperative Combined Arms, or witness human drama set against global combat in the single player War Stories. As you fight in epic, unexpected locations across the globe, enjoy the richest and most immersive Battlefield yet. Now also includes Firestorm – Battle Royale, reimagined for Battlefield.', '55', 'Origin', 'DICE'),
(6, 'Grand Theft Auto V', 'Open World', 'The game is played from either a third-person or first-person perspective and its world is navigated on foot or by vehicle. Players control the three lead protagonists throughout single-player and switch between them both during and outside missions. The story is centred on the heist sequences, and many missions involve shooting and driving gameplay. A \"wanted\" system governs the aggression of law enforcement response to players who commit crimes.', '25', 'Rockstar Games', 'Rockstar North'),
(7, 'Football Manager 2019', 'Sport', 'Simulation gaming perfected. Create your unique footballing story by taking charge of the club you love. Complete control of this stunningly realistic game world is yours - every decision in your hands, or yours to delegate. Your call, your way, your story. Everything you\'ve ever dreamed of!', '38', 'SEGA', 'Sports Interactive'),
(8, 'Borderlands 2', 'FPS', 'Shoot and loot as you explore the mayhem-filled world of Pandora in Borderlands 2 and the lunar madness of Borderlands: The Pre-Sequel in Borderlands: The Handsome Collection. Experience the award-winning FPS-RPG series, including its bazillions of guns, trademark cooperative gameplay, and all bonus add-on content.\r\n', '20', '2K', 'Gearbox Software'),
(9, 'RollarCoaster Tycoon Adventures ', 'Simulation', 'Casual, user-friendly park simulation and a cheery new visual style let players of all ages create the theme park of their dreams!', '25', 'Atari', 'Nvizzio Creations');

-- --------------------------------------------------------

--
-- Table structure for table `Grand_Theft_Auto_V`
--

CREATE TABLE `Grand_Theft_Auto_V` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Grand_Theft_Auto_V`
--

INSERT INTO `Grand_Theft_Auto_V` (`user_id`, `purchased`, `installed`) VALUES
(1, 'N', 'N'),
(2, 'N', 'Y'),
(3, 'Y', 'N'),
(4, 'N', 'N'),
(5, 'Y', 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `RollarCoaster Tycoon Adventures`
--

CREATE TABLE `RollarCoaster Tycoon Adventures` (
  `user_id` int(11) NOT NULL,
  `purchased` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `installed` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `RollarCoaster Tycoon Adventures`
--

INSERT INTO `RollarCoaster Tycoon Adventures` (`user_id`, `purchased`, `installed`) VALUES
(1, 'N', 'N'),
(2, 'Y', 'Y'),
(3, 'N', 'N'),
(4, 'N', 'N'),
(5, 'Y', 'N');

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
(1, 'Exile', 'exile29@gmail.com', 'password123'),
(2, 'Nour-07', 'a.m.nour7@gmail.com', 'N290897'),
(3, 'Shooter007', 'shooter007@gmail.com', 'Sh007070'),
(4, 'HardGamer01', 'gamer_hard01@gmail.com', 'Abc1234'),
(5, 'PortsmouthBoy2019', 'up555555@myport.ac.uk', 'Qvcg5696');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Apex_Legends`
--
ALTER TABLE `Apex_Legends`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Battlefield_V`
--
ALTER TABLE `Battlefield_V`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Borderlands 2`
--
ALTER TABLE `Borderlands 2`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Chat_Log`
--
ALTER TABLE `Chat_Log`
  ADD PRIMARY KEY (`message_id`);

--
-- Indexes for table `Counter_Strike`
--
ALTER TABLE `Counter_Strike`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Fifa_19`
--
ALTER TABLE `Fifa_19`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Football Manager 2019`
--
ALTER TABLE `Football Manager 2019`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Fortnite`
--
ALTER TABLE `Fortnite`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `Games`
--
ALTER TABLE `Games`
  ADD PRIMARY KEY (`game_id`);

--
-- Indexes for table `Grand_Theft_Auto_V`
--
ALTER TABLE `Grand_Theft_Auto_V`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `RollarCoaster Tycoon Adventures`
--
ALTER TABLE `RollarCoaster Tycoon Adventures`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `User_Account`
--
ALTER TABLE `User_Account`
  ADD PRIMARY KEY (`user_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Apex_Legends`
--
ALTER TABLE `Apex_Legends`
  ADD CONSTRAINT `Apex_Legends_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Battlefield_V`
--
ALTER TABLE `Battlefield_V`
  ADD CONSTRAINT `Battlefield_V_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Borderlands 2`
--
ALTER TABLE `Borderlands 2`
  ADD CONSTRAINT `borderlands_2_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Counter_Strike`
--
ALTER TABLE `Counter_Strike`
  ADD CONSTRAINT `Counter_Strike_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Fifa_19`
--
ALTER TABLE `Fifa_19`
  ADD CONSTRAINT `Fifa_19_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Football Manager 2019`
--
ALTER TABLE `Football Manager 2019`
  ADD CONSTRAINT `football_manager_2019_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Fortnite`
--
ALTER TABLE `Fortnite`
  ADD CONSTRAINT `Fortnite_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `Grand_Theft_Auto_V`
--
ALTER TABLE `Grand_Theft_Auto_V`
  ADD CONSTRAINT `Grand_Theft_Auto_V_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `RollarCoaster Tycoon Adventures`
--
ALTER TABLE `RollarCoaster Tycoon Adventures`
  ADD CONSTRAINT `rollercoaster_tycoon_adventures_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `User_Account` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
