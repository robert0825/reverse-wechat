package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class JsApiSetClipboardData
  extends a
{
  public static final int CTRL_INDEX = 168;
  public static final String NAME = "setClipboardData";
  
  public JsApiSetClipboardData()
  {
    GMTrace.i(10348455264256L, 77102);
    GMTrace.o(10348455264256L, 77102);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10348589481984L, 77103);
    paramJSONObject = paramJSONObject.optString("data");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10348589481984L, 77103);
      return;
    }
    w.d("MicroMsg.JsApiSetClipboardData", "stevyang dataStr %s", new Object[] { paramJSONObject });
    Object localObject = (ClipboardManager)paramj.mContext.getSystemService("clipboard");
    if (localObject == null)
    {
      w.i("MicroMsg.JsApiSetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10348589481984L, 77103);
      return;
    }
    ((ClipboardManager)localObject).setPrimaryClip(ClipData.newPlainText("text", paramJSONObject));
    paramj.v(paramInt, d("ok", null));
    if (!bg.nm(paramJSONObject))
    {
      localObject = paramj.hyD;
      paramj = b(paramj);
      if (paramj == null) {
        break label190;
      }
    }
    label190:
    for (paramj = paramj.ivj.hZo;; paramj = "")
    {
      AppBrandMainProcessService.a(new ReportClipBoardTask((String)localObject, paramj, paramJSONObject.getBytes(Charset.forName("UTF-8")).length));
      GMTrace.o(10348589481984L, 77103);
      return;
    }
  }
  
  private static class ReportClipBoardTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<ReportClipBoardTask> CREATOR;
    private String hZo;
    private String hyD;
    private int mLength;
    
    static
    {
      GMTrace.i(20745094692864L, 154563);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(20745094692864L, 154563);
    }
    
    public ReportClipBoardTask(Parcel paramParcel)
    {
      GMTrace.i(20744692039680L, 154560);
      f(paramParcel);
      GMTrace.o(20744692039680L, 154560);
    }
    
    public ReportClipBoardTask(String paramString1, String paramString2, int paramInt)
    {
      GMTrace.i(20744423604224L, 154558);
      this.hyD = paramString1;
      this.hZo = paramString2;
      this.mLength = paramInt;
      GMTrace.o(20744423604224L, 154558);
    }
    
    public final void RY()
    {
      GMTrace.i(20744557821952L, 154559);
      int i = com.tencent.mm.plugin.secinforeport.a.a.oEY;
      com.tencent.mm.plugin.secinforeport.a.a.q(this.mLength, this.hyD, this.hZo);
      GMTrace.o(20744557821952L, 154559);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(20744826257408L, 154561);
      this.hyD = paramParcel.readString();
      this.hZo = paramParcel.readString();
      this.mLength = paramParcel.readInt();
      GMTrace.o(20744826257408L, 154561);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(20744960475136L, 154562);
      paramParcel.writeString(this.hyD);
      paramParcel.writeString(this.hZo);
      paramParcel.writeInt(this.mLength);
      GMTrace.o(20744960475136L, 154562);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiSetClipboardData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */