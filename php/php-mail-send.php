<?php
// the message
$msg = "First line of text\nSecond line of text";
$subject = "Subject";
// use wordwrap() if lines are longer than 70 characters
$msg = wordwrap($msg,70);

// send email
mail($message,$subject,$msg);
?>