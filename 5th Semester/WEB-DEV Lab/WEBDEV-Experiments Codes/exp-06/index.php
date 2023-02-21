<?php
    $insert = false;
    if(isset($_POST['name'])){
    //connection variables
    $server="localhost";
    $username="root";
    $password="";
    //create connection
    $connection = mysqli_connect($server,$username,$password);

    if (!$connection) {
        die("Could not connect to database" . mysqli_connect_error());
    }
    //echo "Connection established";
        
    //collect post variables
    $email = $_POST['email']?? "";
    $name = $_POST['name']?? "";
    $gend= $_POST['gender']?? "";
    $age = $_POST['age']?? "";
    $desc = $_POST['desc']?? "";

    $sql = "INSERT INTO `trip`.`trip` ( `name`, `email`, `gender`, `age`, `msg`) VALUES ( '$name', '$email', '$gend', '$age', '$desc');";
    //echo $sql;

    //Execute tthe query
    if($connection->query($sql) == true) {
        //echo "Successfully inserted trip";
        
        //flag for successful insertion
        $insert = true;
    }
    else {
        echo "Error: $sql <br> $connection->error";
    }
    
    //close connection
    $connection->close();
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">

</head>
<body>
    <div class="cont">
        <h3>Welcome to GPBBSR</h3>
        <p>Fillup the form for comform your participation</p>
        <?php
        if($insert == true) {
        echo "<p class='submsg' style='color:rgb(0, 128, 0); font-weight:bold;'>Thanks For submitting your form</p>";
        }
?> 
        <form action="index.php" method="post">
            <input type="text" name="name" id="name" placeholder="Full name" required>
            <input type="text" name="email" id="email" placeholder="Email" required>
            <input type="text" name="gender" id="gender" placeholder="gender" required>
            <input type="text" name="age" id="age" placeholder="Age" required>
            <textarea name="desc" id="desc" cols="30" rows="10" placeholder="your message"></textarea>
            <button class="btn">Submit</button>
            <button class="btn">Reset</button>
    </div>
    <script src="script.js"></script>
</body>
</html>
