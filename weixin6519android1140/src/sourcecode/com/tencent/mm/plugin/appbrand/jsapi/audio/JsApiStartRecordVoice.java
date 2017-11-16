package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiStartRecordVoice
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 31;
  public static final String NAME = "startRecord";
  static volatile String iaY;
  private int iaA;
  private StartRecordVoice iaZ;
  public AppBrandPageView iaz;
  
  static
  {
    GMTrace.i(19739803910144L, 147073);
    iaY = null;
    GMTrace.o(19739803910144L, 147073);
  }
  
  public JsApiStartRecordVoice()
  {
    GMTrace.i(19739401256960L, 147070);
    GMTrace.o(19739401256960L, 147070);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    int j = 600;
    GMTrace.i(19739535474688L, 147071);
    com.tencent.mm.plugin.appbrand.a.a(paramj.hyD, new android.support.v4.app.a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19724771524608L, 146961);
        if (paramAnonymousInt != 116)
        {
          GMTrace.o(19724771524608L, 146961);
          return;
        }
        if (paramAnonymousArrayOfInt[0] == 0)
        {
          JsApiStartRecordVoice.this.a(paramj, paramJSONObject, paramInt);
          GMTrace.o(19724771524608L, 146961);
          return;
        }
        paramj.v(paramInt, JsApiStartRecordVoice.this.d("fail:system permission denied", null));
        GMTrace.o(19724771524608L, 146961);
      }
    });
    MMActivity localMMActivity = a(paramj);
    int m;
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      m = 0;
    }
    while (m == 0)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19739535474688L, 147071);
      return;
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(localMMActivity, "android.permission.RECORD_AUDIO", 116, "", "");
      m = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nJ(paramj.hyD);
        m = bool;
      }
    }
    this.iaz = b(paramj);
    if (this.iaz == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19739535474688L, 147071);
      return;
    }
    int k = paramJSONObject.optInt("duration", 60);
    int i = k;
    if (k <= 0)
    {
      w.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, less than 0");
      i = 60;
    }
    if (i > 600)
    {
      w.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, more than %d", new Object[] { Integer.valueOf(600) });
      i = j;
    }
    for (;;)
    {
      this.iaz.a(new AppBrandPageView.b()
      {
        public final void Wb()
        {
          GMTrace.i(19719939686400L, 146925);
          JsApiStopRecordVoice.d(paramj);
          JsApiStartRecordVoice.this.iaz.b(this);
          GMTrace.o(19719939686400L, 146925);
        }
      });
      this.iaz.a(new AppBrandPageView.c()
      {
        public final void onDestroy()
        {
          GMTrace.i(19740072345600L, 147075);
          JsApiStopRecordVoice.d(paramj);
          JsApiStartRecordVoice.this.iaz.b(this);
          GMTrace.o(19740072345600L, 147075);
        }
      });
      this.iaZ = new StartRecordVoice(this, paramj, i, paramInt);
      iaY = this.iaZ.filePath;
      AppBrandMainProcessService.a(this.iaZ);
      cd(true);
      GMTrace.o(19739535474688L, 147071);
      return;
    }
  }
  
  public final void cd(final boolean paramBoolean)
  {
    GMTrace.i(19739669692416L, 147072);
    if (this.iaz == null)
    {
      GMTrace.o(19739669692416L, 147072);
      return;
    }
    if (!af.isMainThread())
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19743562006528L, 147101);
          JsApiStartRecordVoice.this.cd(paramBoolean);
          GMTrace.o(19743562006528L, 147101);
        }
      });
      GMTrace.o(19739669692416L, 147072);
      return;
    }
    if (paramBoolean)
    {
      this.iaA = com.tencent.mm.plugin.appbrand.page.a.j(this.iaz.hzM).je(o.i.hFo);
      i.oe(this.iaz.hyD).hzL = this.iaA;
      GMTrace.o(19739669692416L, 147072);
      return;
    }
    com.tencent.mm.plugin.appbrand.page.a.j(this.iaz.hzM).jf(this.iaA);
    GMTrace.o(19739669692416L, 147072);
  }
  
  private static class StartRecordVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StartRecordVoice> CREATOR;
    private String appId;
    public int duration;
    public String filePath;
    private j hYK;
    private int hYL;
    private JsApiStartRecordVoice ibb;
    public boolean ibc;
    public int result;
    
    static
    {
      GMTrace.i(19719402815488L, 146921);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19719402815488L, 146921);
    }
    
    StartRecordVoice(Parcel paramParcel)
    {
      GMTrace.i(19718329073664L, 146913);
      this.ibc = false;
      f(paramParcel);
      GMTrace.o(19718329073664L, 146913);
    }
    
    StartRecordVoice(JsApiStartRecordVoice paramJsApiStartRecordVoice, j paramj, int paramInt1, int paramInt2)
    {
      GMTrace.i(19718194855936L, 146912);
      this.ibc = false;
      this.ibb = paramJsApiStartRecordVoice;
      this.hYK = paramj;
      this.duration = paramInt1;
      this.hYL = paramInt2;
      this.appId = paramj.hyD;
      paramJsApiStartRecordVoice = u.mU(this.appId);
      this.filePath = c.aE(this.appId, paramJsApiStartRecordVoice);
      GMTrace.o(19718194855936L, 146912);
    }
    
    public final void RY()
    {
      GMTrace.i(19718463291392L, 146914);
      com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19712691929088L, 146871);
          JsApiStartRecordVoice.StartRecordVoice.this.ibc = com.tencent.mm.plugin.appbrand.media.a.a(JsApiStartRecordVoice.StartRecordVoice.this.filePath, new com.tencent.mm.plugin.appbrand.media.a.a()
          {
            public final void iB(int paramAnonymous2Int)
            {
              GMTrace.i(19714570977280L, 146885);
              JsApiStartRecordVoice.StartRecordVoice.this.result = paramAnonymous2Int;
              JsApiStartRecordVoice.StartRecordVoice.a(JsApiStartRecordVoice.StartRecordVoice.this);
              GMTrace.o(19714570977280L, 146885);
            }
          }, JsApiStartRecordVoice.StartRecordVoice.this.duration * 1000);
          if (!JsApiStartRecordVoice.StartRecordVoice.this.ibc) {
            JsApiStartRecordVoice.StartRecordVoice.b(JsApiStartRecordVoice.StartRecordVoice.this);
          }
          GMTrace.o(19712691929088L, 146871);
        }
      });
      GMTrace.o(19718463291392L, 146914);
    }
    
    public final void VK()
    {
      GMTrace.i(19718597509120L, 146915);
      if (this.result == -1)
      {
        w.e("MicroMsg.JsApiStartRecordVoice", "fail:record_error");
        this.hYK.v(this.hYL, this.ibb.d("fail:record_error", null));
        GMTrace.o(19718597509120L, 146915);
        return;
      }
      if (this.ibc)
      {
        AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.b(this.hYK.hyD, this.filePath, "silk", true);
        if (localAppBrandLocalMediaObject != null)
        {
          HashMap localHashMap = new HashMap(1);
          localHashMap.put("tempFilePath", localAppBrandLocalMediaObject.eHy);
          this.hYK.v(this.hYL, this.ibb.d("ok", localHashMap));
        }
      }
      for (;;)
      {
        w.i("MicroMsg.JsApiStartRecordVoice", "runInClientProcess, appId = %s, startRecordOk = %b", new Object[] { this.appId, Boolean.valueOf(this.ibc) });
        this.ibb.cd(false);
        GMTrace.o(19718597509120L, 146915);
        return;
        this.hYK.v(this.hYL, this.ibb.d("fail", null));
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(19718865944576L, 146917);
      GMTrace.o(19718865944576L, 146917);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19718731726848L, 146916);
      this.hYL = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.filePath = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.ibc = bool;
        this.duration = paramParcel.readInt();
        this.result = paramParcel.readInt();
        GMTrace.o(19718731726848L, 146916);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19719000162304L, 146918);
      paramParcel.writeInt(this.hYL);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.filePath);
      if (this.ibc) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.duration);
        paramParcel.writeInt(this.result);
        GMTrace.o(19719000162304L, 146918);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiStartRecordVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */