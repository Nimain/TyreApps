package com.vehicleemo.tyreapps;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;



public class SignupForm extends Activity {
	
	public final static String userName ;
	public final static String userPassword;
	public final static String apiURL = "http://ws.strikeiron.com/StrikeIron/EMV6Hygiene/VerifyEmail?";

	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_form);
        
        
      //  EditText e1 = (EditText)
        
       // ActionBar bar = getSupportActionBar();
        

       // bar.setDisplayHomeAsUpEnabled(true);
    }
	
	
	private class CallAPI extends AsyncTask<String, String, String> {
		 
	    @Override
	    protected String doInBackground(String... params) {
	 
	        return "";
	 
	    }
	 
	    protected void onPostExecute(String result) {
	 
	    }
	    
	} // end CallAPI
	
	public void verifyEmail(View view) {
		 
	    EditText emailEditText = (EditText) findViewById(R.id.email_address);
	    String email = emailEditText.getText().toString();
	 
	    if( email != null && !email.isEmpty()) {
	 
	       String urlString = apiURL + "LicenseInfo.RegisteredUser.UserID=" + userName + "&LicenseInfo.RegisteredUser.Password=" + strikeIronPassword + "&VerifyEmail.Email=" + email + "&VerifyEmail.Timeout=30";
	 
	       new CallAPI().execute(urlString); 
	 
	    }
	}
	 
	
	
	
}
