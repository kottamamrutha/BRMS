package com.revature.constants;

public class Constant {
	 
		 
 		public static final String INSERT_QUERY="INSERT INTO `project_brms`.`trip_management`(`Trip_Id`,`Boarding_Time`,`Arrival_Time`,`Ticket_Charges`,`Route_Id`)  VALUES (?,?,?,?,?) ";
 		public static final String DELETE_QUERY="DELETE FROM `project_brms`.`trip_management` WHERE `Trip_Id`=? ";
 		public static final String UPDATE_QUERY="UPDATE `project_brms`.`trip_management` SET `Trip_Id`=? WHERE `Trip_Id`=? ";
		public static final String UPDATE_QUERY1="UPDATE `project_brms`.`trip_management` SET `Boarding_Time`=? WHERE `Trip_Id`=? ";
		public static final String UPDATE_QUERY2="UPDATE `project_brms`.`trip_management` SET `Arrival_Time`=?  WHERE `Trip_Id`=? ";
		public static final String UPDATE_QUERY3="UPDATE `project_brms`.`trip_management` SET `Ticket_Charges`=?  WHERE `Trip_Id`=? ";
		public static final String SELECT_ALL_QUERY="SELECT `Trip_Id`,`Boarding_Time`,`Arrival_Time`,`Ticket_Charges`,`Route_Id` FROM `project_brms`.`trip_management` ";
		private Constant() {}

}
