package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.a;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.k;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Vector;
import org.json.JSONObject;

public final class JsApiCreateAudioInstance
  extends k
{
  public static final int CTRL_INDEX = 291;
  public static final String NAME = "createAudioInstance";
  public static Vector<String> hZM;
  public static boolean hZN;
  
  static
  {
    GMTrace.i(19737924861952L, 147059);
    hZM = new Vector();
    hZN = true;
    GMTrace.o(19737924861952L, 147059);
  }
  
  public JsApiCreateAudioInstance()
  {
    GMTrace.i(19737656426496L, 147057);
    GMTrace.o(19737656426496L, 147057);
  }
  
  public final String a(final j paramj, final JSONObject paramJSONObject)
  {
    GMTrace.i(19737790644224L, 147058);
    hZN = true;
    paramJSONObject = paramj.hyD;
    w.i("MicroMsg.JsApiCreateAudioInstance", "createAudioInstance appId:%s", new Object[] { paramJSONObject });
    String str = com.tencent.mm.ab.b.Dg();
    HashMap localHashMap = new HashMap();
    localHashMap.put("audioId", str);
    w.i("MicroMsg.JsApiCreateAudioInstance", "createAudioInstance ok audioId:%s", new Object[] { str });
    CreateAudioTask localCreateAudioTask = new CreateAudioTask(this, paramj);
    localCreateAudioTask.eAL = str;
    localCreateAudioTask.eQl = 0;
    localCreateAudioTask.appId = paramJSONObject;
    AppBrandMainProcessService.a(localCreateAudioTask);
    paramj = new c.b()
    {
      public final void a(c.c paramAnonymousc)
      {
        GMTrace.i(19733227241472L, 147024);
        w.i("MicroMsg.JsApiCreateAudioInstance", "onPause, appId:%s", new Object[] { paramJSONObject });
        JsApiCreateAudioInstance.hZN = false;
        paramAnonymousc = new JsApiCreateAudioInstance.CreateAudioTask();
        paramAnonymousc.eQl = 1;
        paramAnonymousc.appId = paramJSONObject;
        paramAnonymousc.hYK = paramj;
        AppBrandMainProcessService.a(paramAnonymousc);
        GMTrace.o(19733227241472L, 147024);
      }
      
      public final void onCreate()
      {
        GMTrace.i(20704292503552L, 154259);
        JsApiCreateAudioInstance.hZN = true;
        GMTrace.o(20704292503552L, 154259);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(19733361459200L, 147025);
        w.i("MicroMsg.JsApiCreateAudioInstance", "onDestroy, appId:%s", new Object[] { paramJSONObject });
        JsApiCreateAudioInstance.hZN = false;
        JsApiCreateAudioInstance.CreateAudioTask localCreateAudioTask = new JsApiCreateAudioInstance.CreateAudioTask();
        localCreateAudioTask.eQl = 2;
        localCreateAudioTask.appId = paramJSONObject;
        localCreateAudioTask.hYK = paramj;
        AppBrandMainProcessService.b(localCreateAudioTask);
        c.b(paramJSONObject, this);
        com.tencent.mm.plugin.appbrand.media.b.rf(paramJSONObject);
        JsApiCreateAudioInstance.hZM.remove(paramJSONObject);
        GMTrace.o(19733361459200L, 147025);
      }
      
      public final void onResume()
      {
        GMTrace.i(20704426721280L, 154260);
        JsApiCreateAudioInstance.hZN = true;
        GMTrace.o(20704426721280L, 154260);
      }
    };
    if (!hZM.contains(paramJSONObject))
    {
      c.a(paramJSONObject, paramj);
      hZM.add(paramJSONObject);
    }
    paramj = d("ok", localHashMap);
    GMTrace.o(19737790644224L, 147058);
    return paramj;
  }
  
  private static class CreateAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<CreateAudioTask> CREATOR;
    public String appId;
    public String eAL;
    public int eQl;
    private d hYJ;
    public j hYK;
    private String hZP;
    public boolean hZQ;
    
    static
    {
      GMTrace.i(19739267039232L, 147069);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19739267039232L, 147069);
    }
    
    public CreateAudioTask()
    {
      GMTrace.i(19738461732864L, 147063);
      this.appId = "";
      this.eAL = "";
      this.hZP = "";
      this.eQl = 0;
      this.hZQ = false;
      GMTrace.o(19738461732864L, 147063);
    }
    
    public CreateAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19738595950592L, 147064);
      this.appId = "";
      this.eAL = "";
      this.hZP = "";
      this.eQl = 0;
      this.hZQ = false;
      f(paramParcel);
      GMTrace.o(19738595950592L, 147064);
    }
    
    public CreateAudioTask(d paramd, j paramj)
    {
      GMTrace.i(19738327515136L, 147062);
      this.appId = "";
      this.eAL = "";
      this.hZP = "";
      this.eQl = 0;
      this.hZQ = false;
      this.hYJ = paramd;
      this.hYK = paramj;
      GMTrace.o(19738327515136L, 147062);
    }
    
    public final void RY()
    {
      GMTrace.i(19738730168320L, 147065);
      w.i("MicroMsg.JsApiCreateAudioInstance", "runInMainProcess flag:%d, appId:%s", new Object[] { Integer.valueOf(this.eQl), this.appId });
      this.hZP = "";
      String str;
      Object localObject;
      if (this.eQl == 0)
      {
        str = this.appId;
        localObject = this.eAL;
        w.i("MicroMsg.AudioPlayerHelper", "createAudioPlayer, appId:%s, audioId:%s", new Object[] { str, localObject });
        t localt = new t();
        localt.eAJ.action = 10;
        localt.eAJ.appId = str;
        localt.eAJ.eAL = ((String)localObject);
        a.vgX.m(localt);
        this.eAL = localt.eAJ.eAL;
        w.i("MicroMsg.JsApiCreateAudioInstance", "player audioId:%s", new Object[] { this.eAL });
        if (TextUtils.isEmpty(this.eAL)) {
          this.hZP = "fail to create audio instance";
        }
      }
      for (;;)
      {
        VL();
        GMTrace.o(19738730168320L, 147065);
        return;
        if (this.eQl == 3)
        {
          str = this.appId;
          w.i("MicroMsg.AudioPlayerHelper", "getAudioPlayerCount, appId:%s", new Object[] { str });
          localObject = new t();
          ((t)localObject).eAJ.action = 11;
          ((t)localObject).eAJ.appId = str;
          a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          int i = ((t)localObject).eAK.count;
          w.i("MicroMsg.JsApiCreateAudioInstance", "getAudioPlayerCount appId:%s, count:%d", new Object[] { this.appId, Integer.valueOf(i) });
          if (i < 10)
          {
            this.hZQ = true;
          }
          else
          {
            this.hZQ = false;
            this.hZP = "create audio player count is exceed max count";
          }
        }
        else if (this.eQl == 1)
        {
          w.i("MicroMsg.JsApiCreateAudioInstance", "pauseAllAudioPlayer");
          str = this.appId;
          w.i("MicroMsg.AudioPlayerHelper", "pauseAllAudioPlayer appId:%s", new Object[] { str });
          localObject = new t();
          ((t)localObject).eAJ.action = 12;
          ((t)localObject).eAJ.appId = str;
          a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        }
        else if (this.eQl == 2)
        {
          w.i("MicroMsg.JsApiCreateAudioInstance", "stopAllAudioPlayer");
          str = this.appId;
          w.i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayer appId:%s", new Object[] { str });
          localObject = new t();
          ((t)localObject).eAJ.action = 9;
          ((t)localObject).eAJ.appId = str;
          a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          com.tencent.mm.plugin.appbrand.media.b.rf(this.appId);
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19738864386048L, 147066);
      if (this.eQl == 0)
      {
        if (!TextUtils.isEmpty(this.eAL))
        {
          w.i("MicroMsg.JsApiCreateAudioInstance", "create player ok");
          GMTrace.o(19738864386048L, 147066);
          return;
        }
        w.e("MicroMsg.JsApiCreateAudioInstance", "create player failed");
        GMTrace.o(19738864386048L, 147066);
        return;
      }
      if (this.eQl == 3)
      {
        w.i("MicroMsg.JsApiCreateAudioInstance", "can create player? isCanCreate:%b", new Object[] { Boolean.valueOf(this.hZQ) });
        GMTrace.o(19738864386048L, 147066);
        return;
      }
      w.e("MicroMsg.JsApiCreateAudioInstance", "destroy audio instance end");
      GMTrace.o(19738864386048L, 147066);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19738998603776L, 147067);
      this.eQl = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.eAL = paramParcel.readString();
      this.hZP = paramParcel.readString();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.hZQ = bool;
        GMTrace.o(19738998603776L, 147067);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19739132821504L, 147068);
      paramParcel.writeInt(this.eQl);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eAL);
      paramParcel.writeString(this.hZP);
      if (this.hZQ) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        GMTrace.o(19739132821504L, 147068);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiCreateAudioInstance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */