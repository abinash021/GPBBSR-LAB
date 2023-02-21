<?php
   $dbhost = 'localhost';
   $dbuser = 'root';
   $dbpass = '';
   $con = mysqli_connect($dbhost, $dbuser, $dbpass);
   
   if(! $con ) {
      die('Could not connect: ' . mysqli_error($con));
   }
      echo 'Connected successfully';
      $sql = 'CREATE Database student';
   $retval = mysqli_query($con,$sql);
   
   if(! $retval ) {
      die('Could not create database: ' . mysqli_error($con));
   }
      echo "Database Student created successfully\n";
   mysqli_close($con);
?>
