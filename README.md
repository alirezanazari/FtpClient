# FtpClient
Java-Android Class for Upload File to Server by FTP ( http://www.jibble.org/simpleftp/ )<br>
this is simple java class to do upload file to FTP with your ftp user and password .

# How
* first download simpleFtp.jar from http://www.jibble.org/files/simpleftp.jar .<br>
* after this add FtpClient.java class from this repository.<br>
* then add below AsyncTask class to your activity .<br>
* then new the class into your code like this :<br>
<code>
 File destination = new File(...);
 
 new upload(destination, getBaseContext()).execute();
</code>

# AsyncTask
you can use this by AsyncTask and use like this :
<br>


class upload extends AsyncTask<String, Void, String>{

        File destination;<br>
        Context context;<br>
        FtpClient ftp;<br>
        public uploadImage(File dis, Context con) {
            destination = dis;
            context = con;
        }
		
        @Override
        protected String doInBackground(String... params) {
            try {
                // upload
                ftp = new FtpClient(YOUR_URL , YOUR_FTP_NAME, YOUR_FTP_PASS,
                        YOUR_FTP_FILE_DIR , destination.getPath(), destination);
				//ftp file dir is your directory name on ftp 
				//ftp url(YOUR_URL) is like: ftp.YOURDOMAIN.com
				
                ftp.upload();

                return "SUCCESS";
            } catch (Exception e) {
                String t = "Failure : " + e.getLocalizedMessage();
                return t;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            boolean result = ftp.getResult();
            if (result) {
                Log.e("upload", "success");

            }else {
                Log.e("upload" , "FAIL TO UPLOAD");
            }
        }}
	
# 

http://www.jibble.org/simpleftp/
