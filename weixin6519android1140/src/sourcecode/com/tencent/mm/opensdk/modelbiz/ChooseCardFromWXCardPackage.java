package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public class ChooseCardFromWXCardPackage
{
  private static final String TAG = "MicroMsg.ChooseCardFromWXCardPackage";
  
  public ChooseCardFromWXCardPackage()
  {
    GMTrace.i(13824425984L, 103);
    GMTrace.o(13824425984L, 103);
  }
  
  public static class Req
    extends BaseReq
  {
    public String appId;
    public String canMultiSelect;
    public String cardId;
    public String cardSign;
    public String cardType;
    public String locationId;
    public String nonceStr;
    public String signType;
    public String timeStamp;
    
    public Req()
    {
      GMTrace.i(12482248704L, 93);
      GMTrace.o(12482248704L, 93);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(12750684160L, 95);
      if ((this.appId == null) || (this.appId.length() <= 0))
      {
        GMTrace.o(12750684160L, 95);
        return false;
      }
      if ((this.signType == null) || (this.signType.length() <= 0))
      {
        GMTrace.o(12750684160L, 95);
        return false;
      }
      if ((this.cardSign == null) || (this.cardSign.length() <= 0))
      {
        GMTrace.o(12750684160L, 95);
        return false;
      }
      GMTrace.o(12750684160L, 95);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(12616466432L, 94);
      GMTrace.o(12616466432L, 94);
      return 16;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(12884901888L, 96);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_app_id", this.appId);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_location_id", this.locationId);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_sign_type", this.signType);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_card_sign", this.cardSign);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_time_stamp", this.timeStamp);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_nonce_str", this.nonceStr);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_card_id", this.cardId);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_card_type", this.cardType);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_can_multi_select", this.canMultiSelect);
      GMTrace.o(12884901888L, 96);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public String cardItemList;
    
    public Resp()
    {
      GMTrace.i(13019119616L, 97);
      GMTrace.o(13019119616L, 97);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(13153337344L, 98);
      fromBundle(paramBundle);
      GMTrace.o(13153337344L, 98);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(13421772800L, 100);
      if ((this.cardItemList == null) || (this.cardItemList.length() == 0))
      {
        GMTrace.o(13421772800L, 100);
        return false;
      }
      GMTrace.o(13421772800L, 100);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(13690208256L, 102);
      super.fromBundle(paramBundle);
      paramBundle = paramBundle.getString("_wxapi_choose_card_from_wx_card_list");
      if ((paramBundle != null) && (paramBundle.length() > 0))
      {
        this.cardItemList = paramBundle;
        GMTrace.o(13690208256L, 102);
        return;
      }
      Log.i("MicroMsg.ChooseCardFromWXCardPackage", "cardItemList is empty!");
      GMTrace.o(13690208256L, 102);
    }
    
    public int getType()
    {
      GMTrace.i(13287555072L, 99);
      GMTrace.o(13287555072L, 99);
      return 16;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(13555990528L, 101);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_choose_card_from_wx_card_list", this.cardItemList);
      GMTrace.o(13555990528L, 101);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\ChooseCardFromWXCardPackage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */