<h2>A project aimed at developing email sending service</h2>
Ready made Scripts that can be hosted and/or ported into other projects for simplicity purposes

<h1>Java</h1>
 Based on springboot it the root project<br/>

usage<br/>
build a jar file (springboot projects come with their on Tomcat/web server pre configured<br/>
mvn clean install

run the jar file in your machine<br/>

<H1>Testing</H1>
Request = POST <br/>
Endpoint = [server-url]/send-mail<br/>

Body <br/>
{
  "type" : "object",
  "properties" : {
    "recipientUsername" : {
      "type" : "string"
    },
    "attachementFile" : {
      "type" : "string"
    },
    "mailContent" : {
      "type" : "string"
    },
    "subject" : {
      "type" : "string"
    },
    "senderAccount" : {
      "type" : "object",
      "properties" : {
        "emailAddress" : {
          "type" : "string"
        },
        "password" : {
          "type" : "string"
        }
      }
    },
    "headerContent" : {
      "type" : "string"
    },
    "recipientEmail" : {
      "type" : "string"
    }
  }
}

<h1>php </h1>
In the Php folder use of php mail function 

Request = POST <br/>
Endpoint = [server-url]/php-mail-send.php <br/>
Body <br/>
 {
 "message": "your message",
 "subject" :"your subject",
 "to" : "email reciever",
 "from": "email sender"
 }
