package com.tencent.mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public abstract class BaseResp
{
  public int errCode;
  public String errStr;
  public String openId;
  public String transaction;
  
  public BaseResp()
  {
    GMTrace.i(10200547328L, 76);
    GMTrace.o(10200547328L, 76);
  }
  
  public abstract boolean checkArgs();
  
  public void fromBundle(Bundle paramBundle)
  {
    GMTrace.i(10603200512L, 79);
    this.errCode = paramBundle.getInt("_wxapi_baseresp_errcode");
    this.errStr = paramBundle.getString("_wxapi_baseresp_errstr");
    this.transaction = paramBundle.getString("_wxapi_baseresp_transaction");
    this.openId = paramBundle.getString("_wxapi_baseresp_openId");
    GMTrace.o(10603200512L, 79);
  }
  
  public abstract int getType();
  
  public void toBundle(Bundle paramBundle)
  {
    GMTrace.i(10468982784L, 78);
    paramBundle.putInt("_wxapi_command_type", getType());
    paramBundle.putInt("_wxapi_baseresp_errcode", this.errCode);
    paramBundle.putString("_wxapi_baseresp_errstr", this.errStr);
    paramBundle.putString("_wxapi_baseresp_transaction", this.transaction);
    paramBundle.putString("_wxapi_baseresp_openId", this.openId);
    GMTrace.o(10468982784L, 78);
  }
  
  public static abstract interface ErrCode
  {
    public static final int ERR_AUTH_DENIED = -4;
    public static final int ERR_BAN = -6;
    public static final int ERR_COMM = -1;
    public static final int ERR_OK = 0;
    public static final int ERR_SENT_FAILED = -3;
    public static final int ERR_UNSUPPORT = -5;
    public static final int ERR_USER_CANCEL = -2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelbase\BaseResp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */