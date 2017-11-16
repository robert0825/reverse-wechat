package com.tencent.mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.a;

public abstract class BaseReq
{
  public String openId;
  public String transaction;
  
  public BaseReq()
  {
    GMTrace.i(9529458688L, 71);
    GMTrace.o(9529458688L, 71);
  }
  
  public abstract boolean checkArgs();
  
  public void fromBundle(Bundle paramBundle)
  {
    GMTrace.i(9932111872L, 74);
    this.transaction = a.b(paramBundle, "_wxapi_basereq_transaction");
    this.openId = a.b(paramBundle, "_wxapi_basereq_openid");
    GMTrace.o(9932111872L, 74);
  }
  
  public abstract int getType();
  
  public void toBundle(Bundle paramBundle)
  {
    GMTrace.i(9797894144L, 73);
    paramBundle.putInt("_wxapi_command_type", getType());
    paramBundle.putString("_wxapi_basereq_transaction", this.transaction);
    paramBundle.putString("_wxapi_basereq_openid", this.openId);
    GMTrace.o(9797894144L, 73);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelbase\BaseReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */