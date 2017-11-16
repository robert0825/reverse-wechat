package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;

public class OpenBusiLuckyMoney
{
  public OpenBusiLuckyMoney()
  {
    GMTrace.i(21072183296L, 157);
    GMTrace.o(21072183296L, 157);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int MAX_URL_LENGHT = 10240;
    public String appId;
    public String nonceStr;
    public String packageExt;
    public String signType;
    public String signature;
    public String timeStamp;
    
    public Req()
    {
      GMTrace.i(20535312384L, 153);
      GMTrace.o(20535312384L, 153);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(20803747840L, 155);
      if ((this.appId == null) || (this.appId.length() <= 0))
      {
        GMTrace.o(20803747840L, 155);
        return false;
      }
      if ((this.timeStamp == null) || (this.timeStamp.length() <= 0))
      {
        GMTrace.o(20803747840L, 155);
        return false;
      }
      if ((this.nonceStr == null) || (this.nonceStr.length() <= 0))
      {
        GMTrace.o(20803747840L, 155);
        return false;
      }
      if ((this.signType == null) || (this.signType.length() <= 0))
      {
        GMTrace.o(20803747840L, 155);
        return false;
      }
      if ((this.signature == null) || (this.signature.length() <= 0))
      {
        GMTrace.o(20803747840L, 155);
        return false;
      }
      GMTrace.o(20803747840L, 155);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(20669530112L, 154);
      GMTrace.o(20669530112L, 154);
      return 13;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(20937965568L, 156);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_open_busi_lucky_money_appid", this.appId);
      paramBundle.putString("_wxapi_open_busi_lucky_money_timeStamp", this.timeStamp);
      paramBundle.putString("_wxapi_open_busi_lucky_money_nonceStr", this.nonceStr);
      paramBundle.putString("_wxapi_open_busi_lucky_money_signType", this.signType);
      paramBundle.putString("_wxapi_open_busi_lucky_money_signature", this.signature);
      paramBundle.putString("_wxapi_open_busi_lucky_money_package", this.packageExt);
      GMTrace.o(20937965568L, 156);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\OpenBusiLuckyMoney.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */