# FtpClient
Java-Android Class for Upload File to Server by FTP ( http://www.jibble.org/simpleftp/ )<br>
this is simple java class for upload file to FTP with your ftp user and password .

# How
* first download simpleFtp.jar from http://www.jibble.org/files/simpleftp.jar .<br>
* after this add FtpClient.java class from this repository.<br>
* then add below AsyncTask class to your activity .<br>
* then new the class in your code  :<br>
<code>
 File destination = new File(...);
 
 new upload(destination, getBaseContext()).execute();
</code>
