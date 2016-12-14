# PerformanceReport
##Performance Dozer vs mapstruct Object Mapping

###System Congifuration
####********************
#####OS 			  Windows 32 bit
#####RAM 		    4gb
#####jdk 		    1.6
#####mapstruct	1.0.0Final
#####Dozer 		  5.4.1


###Performance Result for 1000000 Object Mappings
####**********************************************
####MapStruct Data Mapping :Start
####*****************************
#####Dec 14, 2016 4:17:02 PM com.mappipng.framework.Performance.Main mapWithMapStruct
#####INFO: Start mapping with MapStruct...
#####Dec 14, 2016 4:17:02 PM com.mappipng.framework.Performance.Main mapWithMapStruct
#####INFO: Mapping with MapStruct done in 5.65300 seconds

####MapStruct Data Mapping :End
####***************************

####Dozer Data Mapping : Start
####**************************
#####Dec 14, 2016 4:17:02 PM com.mappipng.framework.Performance.Main mapWithDozer
#####INFO: Start mapping with Dozer...
#####Dec 14, 2016 4:17:07 PM com.mappipng.framework.Performance.Main mapWithDozer
#####INFO: Mapping with Dozer done in 20.50100 seconds

###Dozer Data Mapping : End
####************************


###Time Taken to Map 1000000 Objects
####*********************************
#####MapStruct 	: 5.65300 Miliseconds
#####Dozer 	  	:	20.50100 Miliseconds

