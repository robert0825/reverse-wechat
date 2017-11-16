package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiChooseVideo
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 36;
  public static final String NAME = "chooseVideo";
  public static volatile boolean ihM;
  
  static
  {
    GMTrace.i(19792551477248L, 147466);
    ihM = false;
    GMTrace.o(19792551477248L, 147466);
  }
  
  public JsApiChooseVideo()
  {
    GMTrace.i(19792283041792L, 147464);
    GMTrace.o(19792283041792L, 147464);
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19792417259520L, 147465);
    if (ihM)
    {
      paramj.v(paramInt, d("cancel", null));
      GMTrace.o(19792417259520L, 147465);
      return;
    }
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19792417259520L, 147465);
      return;
    }
    ChooseRequest localChooseRequest = new ChooseRequest();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("sourceType");
    String str = paramJSONObject.optString("maxDuration");
    w.i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, maxDuration = %s", new Object[] { localJSONArray, str });
    int i;
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      localChooseRequest.ihd = true;
      localChooseRequest.ihe = true;
      localChooseRequest.ihO = paramJSONObject.optBoolean("compressed", true);
      if (!localChooseRequest.ihd) {
        break label286;
      }
      com.tencent.mm.plugin.appbrand.a.a(paramj.hyD, new a.a()
      {
        public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
        {
          GMTrace.i(19785437937664L, 147413);
          if (paramAnonymousInt != 115)
          {
            GMTrace.o(19785437937664L, 147413);
            return;
          }
          if (paramAnonymousArrayOfInt[0] == 0)
          {
            JsApiChooseVideo.this.a(paramj, paramJSONObject, paramInt);
            GMTrace.o(19785437937664L, 147413);
            return;
          }
          paramj.v(paramInt, JsApiChooseVideo.this.d("fail:system permission denied", null));
          GMTrace.o(19785437937664L, 147413);
        }
      });
      paramJSONObject = a(paramj);
      if (paramJSONObject != null) {
        break label249;
      }
      paramj.v(paramInt, d("fail", null));
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        break label286;
      }
      GMTrace.o(19792417259520L, 147465);
      return;
      localChooseRequest.ihd = localJSONArray.toString().contains("camera");
      localChooseRequest.ihe = localJSONArray.toString().contains("album");
      break;
      label249:
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(paramJSONObject, "android.permission.CAMERA", 115, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nJ(paramj.hyD);
        i = bool;
      }
    }
    label286:
    ihM = true;
    com.tencent.mm.plugin.appbrand.c.a(paramj.hyD, new c.b()
    {
      public final void onResume()
      {
        GMTrace.i(19773895213056L, 147327);
        JsApiChooseVideo.ihM = false;
        com.tencent.mm.plugin.appbrand.c.b(paramj.hyD, this);
        GMTrace.o(19773895213056L, 147327);
      }
    });
    localChooseRequest.maxDuration = bg.getInt(str, 60);
    localChooseRequest.appId = paramj.hyD;
    com.tencent.mm.plugin.appbrand.ipc.a.b(localMMActivity, localChooseRequest, new AppBrandProxyUIProcessTask.b() {});
    GMTrace.o(19792417259520L, 147465);
  }
  
  private static final class ChooseRequest
    extends AppBrandProxyUIProcessTask.ProcessRequest
  {
    public static final Parcelable.Creator<ChooseRequest> CREATOR;
    String appId;
    boolean ihO;
    boolean ihd;
    boolean ihe;
    int maxDuration;
    
    static
    {
      GMTrace.i(19778324398080L, 147360);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19778324398080L, 147360);
    }
    
    ChooseRequest()
    {
      GMTrace.i(19778055962624L, 147358);
      GMTrace.o(19778055962624L, 147358);
    }
    
    ChooseRequest(Parcel paramParcel)
    {
      GMTrace.i(19778190180352L, 147359);
      h(paramParcel);
      GMTrace.o(19778190180352L, 147359);
    }
    
    protected final boolean VG()
    {
      GMTrace.i(19777921744896L, 147357);
      GMTrace.o(19777921744896L, 147357);
      return true;
    }
    
    protected final String VH()
    {
      GMTrace.i(19777384873984L, 147353);
      GMTrace.o(19777384873984L, 147353);
      return "GalleryChooseVideo";
    }
    
    protected final Class<? extends AppBrandProxyUIProcessTask> VI()
    {
      GMTrace.i(19777250656256L, 147352);
      GMTrace.o(19777250656256L, 147352);
      return JsApiChooseVideo.a.class;
    }
    
    public final int describeContents()
    {
      GMTrace.i(19777653309440L, 147355);
      GMTrace.o(19777653309440L, 147355);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19777519091712L, 147354);
      this.appId = paramParcel.readString();
      this.maxDuration = paramParcel.readInt();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.ihd = bool1;
        if (paramParcel.readByte() == 0) {
          break label82;
        }
        bool1 = true;
        label49:
        this.ihe = bool1;
        if (paramParcel.readByte() == 0) {
          break label87;
        }
      }
      label82:
      label87:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.ihO = bool1;
        GMTrace.o(19777519091712L, 147354);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label49;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19777787527168L, 147356);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.maxDuration);
      if (this.ihd)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.ihe) {
          break label84;
        }
        b1 = 1;
        label50:
        paramParcel.writeByte(b1);
        if (!this.ihO) {
          break label89;
        }
      }
      label84:
      label89:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        GMTrace.o(19777787527168L, 147356);
        return;
        b1 = 0;
        break;
        b1 = 0;
        break label50;
      }
    }
  }
  
  private static final class ChooseResult
    extends AppBrandProxyUIProcessTask.ProcessResult
  {
    public static final Parcelable.Creator<ChooseResult> CREATOR;
    int aGY;
    AppBrandLocalVideoObject ihP;
    
    static
    {
      GMTrace.i(19779935010816L, 147372);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19779935010816L, 147372);
    }
    
    ChooseResult()
    {
      GMTrace.i(19779666575360L, 147370);
      GMTrace.o(19779666575360L, 147370);
    }
    
    ChooseResult(Parcel paramParcel)
    {
      GMTrace.i(19779800793088L, 147371);
      h(paramParcel);
      GMTrace.o(19779800793088L, 147371);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19779398139904L, 147368);
      GMTrace.o(19779398139904L, 147368);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      GMTrace.i(19779263922176L, 147367);
      this.aGY = paramParcel.readInt();
      this.ihP = ((AppBrandLocalVideoObject)paramParcel.readParcelable(AppBrandLocalVideoObject.class.getClassLoader()));
      GMTrace.o(19779263922176L, 147367);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19779532357632L, 147369);
      paramParcel.writeInt(this.aGY);
      paramParcel.writeParcelable(this.ihP, paramInt);
      GMTrace.o(19779532357632L, 147369);
    }
  }
  
  private static final class a
    extends AppBrandProxyUIProcessTask
  {
    public String ihD;
    public JsApiChooseVideo.ChooseResult ihQ;
    public JsApiChooseVideo.ChooseRequest ihR;
    private r ihl;
    private DialogInterface.OnCancelListener ihm;
    
    private a()
    {
      GMTrace.i(19797517533184L, 147503);
      this.ihQ = new JsApiChooseVideo.ChooseResult();
      GMTrace.o(19797517533184L, 147503);
    }
    
    private void WZ()
    {
      GMTrace.i(19797920186368L, 147506);
      this.ihm = new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19790806646784L, 147453);
          JsApiChooseVideo.a.this.ihQ.aGY = 0;
          JsApiChooseVideo.a.a(JsApiChooseVideo.a.this, JsApiChooseVideo.a.this.ihQ);
          GMTrace.o(19790806646784L, 147453);
        }
      };
      MMActivity localMMActivity = VD();
      int i = o.i.cUG;
      ab.getResources().getString(i);
      i = o.i.hEq;
      this.ihl = h.a(localMMActivity, ab.getResources().getString(i), true, this.ihm);
      GMTrace.o(19797920186368L, 147506);
    }
    
    public final AppBrandLocalVideoObject N(String paramString, boolean paramBoolean)
    {
      GMTrace.i(19798188621824L, 147508);
      Object localObject = paramString;
      if (paramBoolean) {}
      try
      {
        paramBoolean = com.tencent.mm.plugin.a.c.np(paramString);
        w.i("MicroMsg.JsApiChooseVideo", "checkRemux, isMp4 = %b", new Object[] { Boolean.valueOf(paramBoolean) });
        i = 55536;
        if (!paramBoolean) {
          break label495;
        }
        i = SightVideoJNI.shouldRemuxing(paramString, 660, 500, 20971520, 300000.0D, 1000000);
        w.i("MicroMsg.JsApiChooseVideo", "checkRemux, ret = %d", new Object[] { Integer.valueOf(i) });
      }
      catch (Exception localException)
      {
        try
        {
          for (;;)
          {
            paramString = new MediaMetadataRetriever();
            paramString.setDataSource((String)localObject);
            if (paramString != null) {
              break;
            }
            w.e("MicroMsg.JsApiChooseVideo", "addVideoItem, null meta data");
            GMTrace.o(19798188621824L, 147508);
            return null;
            i = 1;
            break label507;
            i = 1;
            continue;
            i = -50006;
            continue;
            i = -50002;
            continue;
            localObject = new int[2];
            com.tencent.mm.pluginsdk.model.j.b(paramString, (int[])localObject);
            i = localObject[0];
            j = localObject[1];
            localObject = com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".mp4";
            w.i("MicroMsg.JsApiChooseVideo", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { paramString, localObject, Integer.valueOf(SightVideoJNI.remuxing(paramString, (String)localObject, i, j, b.oRE, b.oRD, 8, 2, 25.0F, b.oRF, null, 0, false)), Integer.valueOf(i), Integer.valueOf(j) });
            continue;
            localException = localException;
            w.e("MicroMsg.JsApiChooseVideo", "addVideoItem, remux failed, exp = %s", new Object[] { bg.f(localException) });
            str = paramString;
          }
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiChooseVideo", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { paramString });
            paramString = null;
          }
          i = bg.getInt(paramString.extractMetadata(18), 0);
          j = bg.getInt(paramString.extractMetadata(19), 0);
          k = bg.getInt(paramString.extractMetadata(9), 0);
          paramString.release();
          paramString = com.tencent.mm.plugin.appbrand.appstorage.c.aG(this.ihR.appId, str);
          if (paramString != null) {
            break label435;
          }
          GMTrace.o(19798188621824L, 147508);
          return null;
          label435:
          paramString.duration = ((k + 500) / 1000);
          paramString.width = i;
          paramString.height = j;
          paramString.size = com.tencent.mm.a.e.aY(str);
          w.i("MicroMsg.JsApiChooseVideo", "addVideoItem, return %s", new Object[] { paramString });
          GMTrace.o(19798188621824L, 147508);
          return paramString;
        }
      }
      int i = com.tencent.mm.a.e.aY(paramString);
      w.i("MicroMsg.JsApiChooseVideo", "fileLength = %d", new Object[] { Integer.valueOf(i) });
      if (i > 20971520) {
        i = -1;
      }
      for (;;)
      {
        w.e("MicroMsg.JsApiChooseVideo", "unknown check type");
        i = -50001;
        if (i != -50006) {
          localObject = paramString;
        }
        int j;
        String str;
        int k;
        label495:
        if ((i == -1) || (!paramBoolean)) {
          break;
        }
        label507:
        switch (i)
        {
        }
      }
    }
    
    protected final void VF()
    {
      GMTrace.i(19797785968640L, 147505);
      super.VF();
      if (this.ihl != null)
      {
        this.ihl.dismiss();
        this.ihl = null;
      }
      GMTrace.o(19797785968640L, 147505);
    }
    
    public final void a(int paramInt1, int paramInt2, final Intent paramIntent)
    {
      GMTrace.i(19798054404096L, 147507);
      if (paramInt2 == 0)
      {
        this.ihQ.aGY = 0;
        a(this.ihQ);
        GMTrace.o(19798054404096L, 147507);
        return;
      }
      if (-1 != paramInt2)
      {
        this.ihQ.aGY = -2;
        a(this.ihQ);
        GMTrace.o(19798054404096L, 147507);
        return;
      }
      switch (paramInt1)
      {
      }
      do
      {
        do
        {
          this.ihQ.aGY = -2;
          a(this.ihQ);
          GMTrace.o(19798054404096L, 147507);
          return;
        } while (bg.nm(this.ihD));
        WZ();
        com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19797383315456L, 147502);
            if (new File(JsApiChooseVideo.a.this.ihD).exists())
            {
              JsApiChooseVideo.a.this.ihQ.aGY = -1;
              JsApiChooseVideo.a.this.ihQ.ihP = JsApiChooseVideo.a.this.N(JsApiChooseVideo.a.this.ihD, JsApiChooseVideo.a.this.ihR.ihO);
              JsApiChooseVideo.a.b(JsApiChooseVideo.a.this, JsApiChooseVideo.a.this.ihQ);
              GMTrace.o(19797383315456L, 147502);
              return;
            }
            JsApiChooseVideo.a.this.ihQ.aGY = -2;
            JsApiChooseVideo.a.c(JsApiChooseVideo.a.this, JsApiChooseVideo.a.this.ihQ);
            GMTrace.o(19797383315456L, 147502);
          }
        });
        GMTrace.o(19798054404096L, 147507);
        return;
        paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
      } while (bg.cc(paramIntent));
      paramIntent = (String)paramIntent.get(0);
      WZ();
      com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19776042696704L, 147343);
          JsApiChooseVideo.a.this.ihQ.aGY = -1;
          JsApiChooseVideo.a.this.ihQ.ihP = JsApiChooseVideo.a.this.N(paramIntent, JsApiChooseVideo.a.this.ihR.ihO);
          JsApiChooseVideo.a.d(JsApiChooseVideo.a.this, JsApiChooseVideo.a.this.ihQ);
          GMTrace.o(19776042696704L, 147343);
        }
      });
      GMTrace.o(19798054404096L, 147507);
    }
    
    protected final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
    {
      GMTrace.i(19797651750912L, 147504);
      this.ihR = ((JsApiChooseVideo.ChooseRequest)paramProcessRequest);
      this.ihR.maxDuration = Math.min(Math.max(this.ihR.maxDuration, 60), 0);
      if (bg.eD(VD()) > 200L) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0)
        {
          paramProcessRequest = VD();
          i = o.i.hEq;
          u.makeText(paramProcessRequest, ab.getResources().getString(i), 1).show();
        }
        VD().vKC = this;
        paramProcessRequest = new Intent();
        paramProcessRequest.putExtra("key_send_raw_image", false);
        paramProcessRequest.putExtra("query_media_type", 2);
        if ((!this.ihR.ihd) || (!this.ihR.ihe)) {
          break;
        }
        this.ihD = (com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".mp4");
        paramProcessRequest.putExtra("record_video_force_sys_camera", true);
        paramProcessRequest.putExtra("record_video_quality", 1);
        paramProcessRequest.putExtra("record_video_time_limit", this.ihR.maxDuration);
        paramProcessRequest.putExtra("video_full_path", this.ihD);
        k.c(VD(), 1, 7, paramProcessRequest);
        GMTrace.o(19797651750912L, 147504);
        return;
      }
      if (this.ihR.ihd)
      {
        this.ihD = (com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".mp4");
        i = this.ihR.maxDuration;
        k.a(VD(), this.ihD, 5, i, 1, false);
        GMTrace.o(19797651750912L, 147504);
        return;
      }
      if (this.ihR.ihe)
      {
        paramProcessRequest.putExtra("show_header_view", false);
        k.c(VD(), 1, 7, paramProcessRequest);
        GMTrace.o(19797651750912L, 147504);
        return;
      }
      this.ihQ.aGY = -2;
      a(this.ihQ);
      GMTrace.o(19797651750912L, 147504);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\JsApiChooseVideo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */