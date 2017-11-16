package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class ChooseInvoiceTitle
{
  public ChooseInvoiceTitle()
  {
    GMTrace.i(21035810291712L, 156729);
    GMTrace.o(21035810291712L, 156729);
  }
  
  public static final class Req
    extends BaseReq
  {
    private static final String TAG = "MicroMsg.SDK.ChooseInvoiceTitle.Req";
    private static final int URL_LENGTH_LIMIT = 10240;
    public String url;
    
    public Req()
    {
      GMTrace.i(21034468114432L, 156719);
      GMTrace.o(21034468114432L, 156719);
    }
    
    public final boolean checkArgs()
    {
      GMTrace.i(21034736549888L, 156721);
      if (d.a(this.url))
      {
        Log.i("MicroMsg.SDK.ChooseInvoiceTitle.Req", "url should not be empty");
        GMTrace.o(21034736549888L, 156721);
        return false;
      }
      if (this.url.length() > 10240)
      {
        Log.e("MicroMsg.SDK.ChooseInvoiceTitle.Req", "url must be in 10k");
        GMTrace.o(21034736549888L, 156721);
        return false;
      }
      GMTrace.o(21034736549888L, 156721);
      return true;
    }
    
    public final void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(21035004985344L, 156723);
      super.fromBundle(paramBundle);
      this.url = paramBundle.getString("_wxapi_choose_invoice_title_req_url");
      GMTrace.o(21035004985344L, 156723);
    }
    
    public final int getType()
    {
      GMTrace.i(21034602332160L, 156720);
      GMTrace.o(21034602332160L, 156720);
      return 20;
    }
    
    public final void toBundle(Bundle paramBundle)
    {
      GMTrace.i(21034870767616L, 156722);
      super.fromBundle(paramBundle);
      paramBundle.putString("_wxapi_choose_invoice_title_req_url", this.url);
      GMTrace.o(21034870767616L, 156722);
    }
  }
  
  public static final class Resp
    extends BaseResp
  {
    public Resp()
    {
      GMTrace.i(21035139203072L, 156724);
      GMTrace.o(21035139203072L, 156724);
    }
    
    public final boolean checkArgs()
    {
      GMTrace.i(21035407638528L, 156726);
      GMTrace.o(21035407638528L, 156726);
      return true;
    }
    
    public final void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(21035676073984L, 156728);
      super.fromBundle(paramBundle);
      GMTrace.o(21035676073984L, 156728);
    }
    
    public final int getType()
    {
      GMTrace.i(21035273420800L, 156725);
      GMTrace.o(21035273420800L, 156725);
      return 20;
    }
    
    public final void toBundle(Bundle paramBundle)
    {
      GMTrace.i(21035541856256L, 156727);
      super.fromBundle(paramBundle);
      GMTrace.o(21035541856256L, 156727);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\ChooseInvoiceTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */