package com.tencent.mm.plugin.webview.modeltools;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.ClipboardManager.OnPrimaryClipChangedListener;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.charset.Charset;

public final class WebViewClipBoardHelper
  implements ClipboardManager.OnPrimaryClipChangedListener
{
  private long lastReportTime;
  private WebViewUI rHq;
  public ClipboardManager rHr;
  
  public WebViewClipBoardHelper(WebViewUI paramWebViewUI)
  {
    GMTrace.i(19111664943104L, 142393);
    this.lastReportTime = 0L;
    this.rHq = paramWebViewUI;
    this.rHr = ((ClipboardManager)this.rHq.getSystemService("clipboard"));
    this.rHr.addPrimaryClipChangedListener(this);
    GMTrace.o(19111664943104L, 142393);
  }
  
  public final void onPrimaryClipChanged()
  {
    GMTrace.i(19111799160832L, 142394);
    long l = System.currentTimeMillis();
    if (l - this.lastReportTime < 200L)
    {
      GMTrace.o(19111799160832L, 142394);
      return;
    }
    this.lastReportTime = l;
    Object localObject = this.rHr.getPrimaryClip();
    if (localObject == null)
    {
      GMTrace.o(19111799160832L, 142394);
      return;
    }
    localObject = ((ClipData)localObject).getItemAt(0);
    if (localObject == null)
    {
      GMTrace.o(19111799160832L, 142394);
      return;
    }
    ClipBoardDataWrapper localClipBoardDataWrapper = new ClipBoardDataWrapper();
    localClipBoardDataWrapper.url = this.rHq.aEr();
    if (bg.L(((ClipData.Item)localObject).getText()))
    {
      w.w("MicroMsg.WebViewClipBoardHelper", "onPrimaryClipChanged text is null");
      GMTrace.o(19111799160832L, 142394);
      return;
    }
    localClipBoardDataWrapper.length = ((ClipData.Item)localObject).getText().toString().getBytes(Charset.forName("UTF-8")).length;
    XIPCInvoker.a("com.tencent.mm", localClipBoardDataWrapper, a.class, null);
    GMTrace.o(19111799160832L, 142394);
  }
  
  private static final class ClipBoardDataWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ClipBoardDataWrapper> CREATOR;
    int length;
    String url;
    
    static
    {
      GMTrace.i(19112470249472L, 142399);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19112470249472L, 142399);
    }
    
    ClipBoardDataWrapper()
    {
      GMTrace.i(19112201814016L, 142397);
      GMTrace.o(19112201814016L, 142397);
    }
    
    ClipBoardDataWrapper(Parcel paramParcel)
    {
      GMTrace.i(19112336031744L, 142398);
      this.url = paramParcel.readString();
      this.length = paramParcel.readInt();
      GMTrace.o(19112336031744L, 142398);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19111933378560L, 142395);
      GMTrace.o(19111933378560L, 142395);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19112067596288L, 142396);
      paramParcel.writeString(this.url);
      paramParcel.writeInt(this.length);
      GMTrace.o(19112067596288L, 142396);
    }
  }
  
  private static final class a
    implements g<WebViewClipBoardHelper.ClipBoardDataWrapper, Object>
  {
    private a()
    {
      GMTrace.i(19111396507648L, 142391);
      GMTrace.o(19111396507648L, 142391);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\WebViewClipBoardHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */