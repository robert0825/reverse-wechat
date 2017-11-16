package com.tencent.mm.opensdk.modelpay;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;

public class PayReq
  extends BaseReq
{
  private static final int EXTDATA_MAX_LENGTH = 1024;
  private static final String TAG = "MicroMsg.PaySdk.PayReq";
  public String appId;
  public String extData;
  public String nonceStr;
  public Options options;
  public String packageValue;
  public String partnerId;
  public String prepayId;
  public String sign;
  public String signType;
  public String timeStamp;
  
  public PayReq()
  {
    GMTrace.i(46170898432L, 344);
    GMTrace.o(46170898432L, 344);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(46305116160L, 345);
    if ((this.appId == null) || (this.appId.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid appId");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.partnerId == null) || (this.partnerId.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid partnerId");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.prepayId == null) || (this.prepayId.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid prepayId");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.nonceStr == null) || (this.nonceStr.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid nonceStr");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.timeStamp == null) || (this.timeStamp.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid timeStamp");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.packageValue == null) || (this.packageValue.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid packageValue");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.sign == null) || (this.sign.length() == 0))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, invalid sign");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    if ((this.extData != null) && (this.extData.length() > 1024))
    {
      Log.e("MicroMsg.PaySdk.PayReq", "checkArgs fail, extData length too long");
      GMTrace.o(46305116160L, 345);
      return false;
    }
    GMTrace.o(46305116160L, 345);
    return true;
  }
  
  public void fromBundle(Bundle paramBundle)
  {
    GMTrace.i(46573551616L, 347);
    super.fromBundle(paramBundle);
    this.appId = a.b(paramBundle, "_wxapi_payreq_appid");
    this.partnerId = a.b(paramBundle, "_wxapi_payreq_partnerid");
    this.prepayId = a.b(paramBundle, "_wxapi_payreq_prepayid");
    this.nonceStr = a.b(paramBundle, "_wxapi_payreq_noncestr");
    this.timeStamp = a.b(paramBundle, "_wxapi_payreq_timestamp");
    this.packageValue = a.b(paramBundle, "_wxapi_payreq_packagevalue");
    this.sign = a.b(paramBundle, "_wxapi_payreq_sign");
    this.extData = a.b(paramBundle, "_wxapi_payreq_extdata");
    this.signType = a.b(paramBundle, "_wxapi_payreq_sign_type");
    this.options = new Options();
    this.options.fromBundle(paramBundle);
    GMTrace.o(46573551616L, 347);
  }
  
  public int getType()
  {
    GMTrace.i(46707769344L, 348);
    GMTrace.o(46707769344L, 348);
    return 5;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    GMTrace.i(46439333888L, 346);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_payreq_appid", this.appId);
    paramBundle.putString("_wxapi_payreq_partnerid", this.partnerId);
    paramBundle.putString("_wxapi_payreq_prepayid", this.prepayId);
    paramBundle.putString("_wxapi_payreq_noncestr", this.nonceStr);
    paramBundle.putString("_wxapi_payreq_timestamp", this.timeStamp);
    paramBundle.putString("_wxapi_payreq_packagevalue", this.packageValue);
    paramBundle.putString("_wxapi_payreq_sign", this.sign);
    paramBundle.putString("_wxapi_payreq_extdata", this.extData);
    paramBundle.putString("_wxapi_payreq_sign_type", this.signType);
    if (this.options != null) {
      this.options.toBundle(paramBundle);
    }
    GMTrace.o(46439333888L, 346);
  }
  
  public static class Options
  {
    public static final int INVALID_FLAGS = -1;
    public String callbackClassName;
    public int callbackFlags;
    
    public Options()
    {
      GMTrace.i(45768245248L, 341);
      this.callbackFlags = -1;
      GMTrace.o(45768245248L, 341);
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(46036680704L, 343);
      this.callbackClassName = a.b(paramBundle, "_wxapi_payoptions_callback_classname");
      this.callbackFlags = a.a(paramBundle, "_wxapi_payoptions_callback_flags");
      GMTrace.o(46036680704L, 343);
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(45902462976L, 342);
      paramBundle.putString("_wxapi_payoptions_callback_classname", this.callbackClassName);
      paramBundle.putInt("_wxapi_payoptions_callback_flags", this.callbackFlags);
      GMTrace.o(45902462976L, 342);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelpay\PayReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */