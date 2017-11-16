package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class WebViewJSSDKVideoItem
  extends WebViewJSSDKFileItem
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewJSSDKVideoItem> CREATOR;
  public int duration;
  public int height;
  public int size;
  public int width;
  
  static
  {
    GMTrace.i(16929284685824L, 126133);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16929284685824L, 126133);
  }
  
  public WebViewJSSDKVideoItem()
  {
    GMTrace.i(11995843657728L, 89376);
    this.eGK = 4;
    GMTrace.o(11995843657728L, 89376);
  }
  
  protected WebViewJSSDKVideoItem(Parcel paramParcel)
  {
    super(paramParcel);
    GMTrace.i(16928882032640L, 126130);
    this.eGK = paramParcel.readInt();
    this.duration = paramParcel.readInt();
    this.size = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    GMTrace.o(16928882032640L, 126130);
  }
  
  public final WebViewJSSDKFileItem bCk()
  {
    GMTrace.i(11995977875456L, 89377);
    this.eHy = ai.Ln(this.hOo);
    GMTrace.o(11995977875456L, 89377);
    return this;
  }
  
  public final String bCl()
  {
    GMTrace.i(11996112093184L, 89378);
    GMTrace.o(11996112093184L, 89378);
    return "mp4";
  }
  
  public final String bCm()
  {
    GMTrace.i(11996246310912L, 89379);
    GMTrace.o(11996246310912L, 89379);
    return "video";
  }
  
  public int describeContents()
  {
    GMTrace.i(16929016250368L, 126131);
    GMTrace.o(16929016250368L, 126131);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16929150468096L, 126132);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.eGK);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    GMTrace.o(16929150468096L, 126132);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\WebViewJSSDKVideoItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */