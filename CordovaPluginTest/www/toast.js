var exec = require('cordova/exec');

var Toast={
	toastShort:function(msg){
		exec(null, null, "ToastPlugin", "toastShort", [msg]);
	},
	toastLong:function(msg){
		exec(null, null, "ToastPlugin", "toastLong", [msg]);
	}
};

module.exports = Toast;