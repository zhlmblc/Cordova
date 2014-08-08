package cn.wisesign.plugin.toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.widget.Toast;

public class ToastPlugin extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		final CordovaInterface cordova = this.cordova;
		final String message = args.getString(0);
		
		if("toastShort".equals(action)){
			Toast.makeText(cordova.getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
			return true;
		}else if("toastLong".equals(action)){
			Toast.makeText(cordova.getActivity().getApplicationContext(), message, Toast.LENGTH_LONG).show();
			return true;
		}else{
			
		}
		return false;
	}

}
