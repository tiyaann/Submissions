use mydb;

CREATE TABLE `bookings` (
	  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
	  `username` varchar(10) DEFAULT NULL,
	  `user_id_proof` varchar(20) DEFAULT NULL,
	  `no_of_people` int default null,
	  `date_of_travel` date default null,
      `fno` varchar(10),
	  PRIMARY KEY (`uid`),
	  FOREIGN KEY (fno) REFERENCES flights(fno)
	);
	
CREATE TABLE `flights` (
	  `fno` bigint(20) NOT NULL,
	  `airlinename` varchar(20) DEFAULT NULL,
	  `boardinglocation` varchar(20) DEFAULT NULL,
      `destinationlocation` varchar(20) default Null,
      `price` int default null,
	  PRIMARY KEY (`fno`)
	);
	
create table `admin`(
`username` varchar(10) DEFAULT NULL,
	  `password` varchar(10) DEFAULT NULL);