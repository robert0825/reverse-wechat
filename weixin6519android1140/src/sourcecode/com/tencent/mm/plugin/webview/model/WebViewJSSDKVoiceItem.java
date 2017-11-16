package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvoice.q;

public class WebViewJSSDKVoiceItem
  extends WebViewJSSDKFileItem
{
  public static final Parcelable.Creator<WebViewJSSDKVoiceItem> CREATOR;
  
  static
  {
    GMTrace.i(16933848088576L, 126167);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16933848088576L, 126167);
  }
  
  public WebViewJSSDKVoiceItem()
  {
    GMTrace.i(12012084002816L, 89497);
    this.eGK = 2;
    GMTrace.o(12012084002816L, 89497);
  }
  
  protected WebViewJSSDKVoiceItem(Parcel paramParcel)
  {
    super(paramParcel);
    GMTrace.i(16933713870848L, 126166);
    GMTrace.o(16933713870848L, 126166);
  }
  
  public final WebViewJSSDKFileItem bCk()
  {
    GMTrace.i(12012218220544L, 89498);
    this.hOo = q.getFullPath(this.euR);
    this.eHy = ai.Ln(this.hOo);
    GMTrace.o(12012218220544L, 89498);
    return this;
  }
  
  public final String bCl()
  {
    GMTrace.i(12012352438272L, 89499);
    GMTrace.o(12012352438272L, 89499);
    return "speex";
  }
  
  public final String bCm()
  {
    GMTrace.i(12012486656000L, 89500);
    GMTrace.o(12012486656000L, 89500);
    return "voice";
  }
  
  public int describeContents()
  {
    GMTrace.i(16933445435392L, 126164);
    GMTrace.o(16933445435392L, 126164);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16933579653120L, 126165);
    super.writeToParcel(paramParcel, paramInt);
    GMTrace.o(16933579653120L, 126165);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\WebViewJSSDKVoiceItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */