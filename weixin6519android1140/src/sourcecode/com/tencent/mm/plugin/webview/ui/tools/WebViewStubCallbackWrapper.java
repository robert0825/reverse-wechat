package com.tencent.mm.plugin.webview.ui.tools;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.stub.e.a;

public class WebViewStubCallbackWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewStubCallbackWrapper> CREATOR;
  public int id;
  public e rKr;
  
  static
  {
    GMTrace.i(12110868250624L, 90233);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(12110868250624L, 90233);
  }
  
  public WebViewStubCallbackWrapper(IBinder paramIBinder)
  {
    GMTrace.i(12110465597440L, 90230);
    this.rKr = e.a.Y(paramIBinder);
    GMTrace.o(12110465597440L, 90230);
  }
  
  public WebViewStubCallbackWrapper(e parame, int paramInt)
  {
    GMTrace.i(12110062944256L, 90227);
    this.rKr = parame;
    this.id = paramInt;
    GMTrace.o(12110062944256L, 90227);
  }
  
  public int describeContents()
  {
    GMTrace.i(12110197161984L, 90228);
    GMTrace.o(12110197161984L, 90228);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(12110599815168L, 90231);
    if (!(paramObject instanceof WebViewStubCallbackWrapper))
    {
      GMTrace.o(12110599815168L, 90231);
      return false;
    }
    if (((WebViewStubCallbackWrapper)paramObject).id == this.id)
    {
      GMTrace.o(12110599815168L, 90231);
      return true;
    }
    GMTrace.o(12110599815168L, 90231);
    return false;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(12110331379712L, 90229);
    paramParcel.writeStrongBinder(this.rKr.asBinder());
    GMTrace.o(12110331379712L, 90229);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\WebViewStubCallbackWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */