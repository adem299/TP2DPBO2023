-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2023 at 06:34 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_music`
--

-- --------------------------------------------------------

--
-- Table structure for table `singer`
--

CREATE TABLE `singer` (
  `singer_id` int(11) NOT NULL,
  `singer_name` varchar(255) NOT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `gender` enum('male','female') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `singer`
--

INSERT INTO `singer` (`singer_id`, `singer_name`, `nationality`, `birth_date`, `gender`) VALUES
(1, 'Miley Cyrus', 'USA', '1992-11-23', 'female'),
(2, 'Eminem', 'USA', '1972-10-17', 'male'),
(3, 'Doja Cat', 'USA', '1995-10-21', 'female'),
(4, 'Jisoo', 'Korea', '1995-01-03', 'female'),
(5, 'The Weekend', 'Canada', '1990-02-16', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `title_song`
--

CREATE TABLE `title_song` (
  `song_id` int(11) NOT NULL,
  `song_title` varchar(255) NOT NULL,
  `singer_id` int(11) DEFAULT NULL,
  `album` varchar(255) DEFAULT NULL,
  `duration` varchar(5) DEFAULT NULL,
  `image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `title_song`
--

INSERT INTO `title_song` (`song_id`, `song_title`, `singer_id`, `album`, `duration`, `image`) VALUES
(1, 'Flowers', 1, 'Endless Summer Vacation', '3:20', 'endless.jpg'),
(2, 'Mockingbird', 2, 'Encore (Deluxe Version)', '3:32', 'encore.jpg'),
(3, 'You Right', 3, 'Planet Her', '3:06', 'planet.jpg'),
(4, 'Need To Know', 3, 'Planet Her', '3:30', 'planet.jpg'),
(5, 'FLOWER', 4, 'ME', '2:53', 'me.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`username`, `password`) VALUES
('admin', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `singer`
--
ALTER TABLE `singer`
  ADD PRIMARY KEY (`singer_id`);

--
-- Indexes for table `title_song`
--
ALTER TABLE `title_song`
  ADD PRIMARY KEY (`song_id`),
  ADD KEY `singer_id` (`singer_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `singer`
--
ALTER TABLE `singer`
  MODIFY `singer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `title_song`
--
ALTER TABLE `title_song`
  MODIFY `song_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `title_song`
--
ALTER TABLE `title_song`
  ADD CONSTRAINT `title_song_ibfk_1` FOREIGN KEY (`singer_id`) REFERENCES `singer` (`singer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
