package com.tencent.mm.opensdk.modelpay;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class PayResp
  extends BaseResp
{
  public String extData;
  public String prepayId;
  public String returnKey;
  
  public PayResp()
  {
    GMTrace.i(46841987072L, 349);
    GMTrace.o(46841987072L, 349);
  }
  
  public PayResp(Bundle paramBundle)
  {
    GMTrace.i(46976204800L, 350);
    fromBundle(paramBundle);
    GMTrace.o(46976204800L, 350);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(47513075712L, 354);
    GMTrace.o(47513075712L, 354);
    return true;
  }
  
  public void fromBundle(Bundle paramBundle)
  {
    GMTrace.i(47244640256L, 352);
    super.fromBundle(paramBundle);
    this.prepayId = paramBundle.getString("_wxapi_payresp_prepayid");
    this.returnKey = paramBundle.getString("_wxapi_payresp_returnkey");
    this.extData = paramBundle.getString("_wxapi_payresp_extdata");
    GMTrace.o(47244640256L, 352);
  }
  
  public int getType()
  {
    GMTrace.i(47378857984L, 353);
    GMTrace.o(47378857984L, 353);
    return 5;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    GMTrace.i(47110422528L, 351);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_payresp_prepayid", this.prepayId);
    paramBundle.putString("_wxapi_payresp_returnkey", this.returnKey);
    paramBundle.putString("_wxapi_payresp_extdata", this.extData);
    GMTrace.o(47110422528L, 351);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelpay\PayResp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */