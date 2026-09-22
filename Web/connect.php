<?php
$con = mysqli_connect("localhost","root","","databaseweb");
if($con){
    echo("เชื่อมต่อได้");
}
else{
    echo("ไม่ได้");
}




?>
