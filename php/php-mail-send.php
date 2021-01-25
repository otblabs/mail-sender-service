<?php

$json = file_get_contents('php://input');
$data = json_decode($json);

$msg = $data->message;
$subject = $data->subject;
$to = $data->to;
$headers = "From: ".$data->from;


// use wordwrap() if lines are longer than 70 characters
$msg = wordwrap($msg,70);

// send email
mail($to,$subject,$msg, $headers);
?>