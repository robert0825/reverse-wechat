package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.media.c;
import com.tencent.mm.plugin.appbrand.media.c.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsApiGetMusicPlayerState
  extends a
{
  public static final int CTRL_INDEX = 46;
  public static final String NAME = "getMusicPlayerState";
  private GetMusicPlayerState hZY;
  
  public JsApiGetMusicPlayerState()
  {
    GMTrace.i(19716718460928L, 146901);
    GMTrace.o(19716718460928L, 146901);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19716852678656L, 146902);
    this.hZY = new GetMusicPlayerState(this, paramj, paramInt);
    this.hZY.hZZ = paramj.hyD;
    AppBrandMainProcessService.a(this.hZY);
    GMTrace.o(19716852678656L, 146902);
  }
  
  private static class GetMusicPlayerState
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetMusicPlayerState> CREATOR;
    private com.tencent.mm.plugin.appbrand.jsapi.d hYJ;
    private j hYK;
    private int hYL;
    public String hZP;
    public boolean hZR;
    public String hZZ;
    public int iaa;
    public String iab;
    public int jP;
    public int kE;
    public int mStatus;
    
    static
    {
      GMTrace.i(19731079757824L, 147008);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19731079757824L, 147008);
    }
    
    public GetMusicPlayerState(Parcel paramParcel)
    {
      GMTrace.i(19730408669184L, 147003);
      this.hZR = false;
      f(paramParcel);
      GMTrace.o(19730408669184L, 147003);
    }
    
    public GetMusicPlayerState(com.tencent.mm.plugin.appbrand.jsapi.d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19730274451456L, 147002);
      this.hZR = false;
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19730274451456L, 147002);
    }
    
    public final void RY()
    {
      int i = -1;
      GMTrace.i(19730542886912L, 147004);
      Object localObject = c.a.irp.irn;
      if ((!bg.nm((String)localObject)) && (!((String)localObject).equals(this.hZZ)))
      {
        w.i("MicroMsg.JsApiGetMusicPlayerState", "appid not match cannot operate");
        this.hZR = true;
        this.hZP = "appid not match cannot operate";
        VL();
        GMTrace.o(19730542886912L, 147004);
        return;
      }
      localObject = b.JS();
      int j;
      if (localObject != null)
      {
        com.tencent.mm.at.d locald = b.JT();
        if (locald == null) {
          break label243;
        }
        j = locald.kE;
        i = locald.jP;
        this.mStatus = locald.mStatus;
        this.iaa = locald.gOP;
      }
      for (;;)
      {
        this.kE = (j / 1000);
        this.jP = (i / 1000);
        this.iab = ((apv)localObject).uFw;
        this.hZP = "";
        for (this.hZR = false;; this.hZR = false)
        {
          w.i("MicroMsg.JsApiGetMusicPlayerState", "duration %d , position %d ,status %s , downloadpercent %d , dataurl %s", new Object[] { Integer.valueOf(this.kE), Integer.valueOf(this.jP), Integer.valueOf(this.mStatus), Integer.valueOf(this.iaa), this.iab });
          VL();
          GMTrace.o(19730542886912L, 147004);
          return;
          this.mStatus = 2;
          this.hZP = "";
        }
        label243:
        j = -1;
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19730677104640L, 147005);
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.kE));
      localHashMap.put("currentPosition", Integer.valueOf(this.jP));
      localHashMap.put("status", Integer.valueOf(this.mStatus));
      localHashMap.put("downloadPercent", Integer.valueOf(this.iaa));
      localHashMap.put("dataUrl", this.iab);
      j localj = this.hYK;
      int i = this.hYL;
      com.tencent.mm.plugin.appbrand.jsapi.d locald = this.hYJ;
      StringBuilder localStringBuilder;
      if (this.hZR)
      {
        localStringBuilder = new StringBuilder("fail");
        if (TextUtils.isEmpty(this.hZP)) {
          str = "";
        }
      }
      for (String str = str;; str = "ok")
      {
        localj.v(i, locald.d(str, localHashMap));
        GMTrace.o(19730677104640L, 147005);
        return;
        str = ":" + this.hZP;
        break;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19730811322368L, 147006);
      this.hZZ = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.hZR = bool;
        this.kE = paramParcel.readInt();
        this.jP = paramParcel.readInt();
        this.mStatus = paramParcel.readInt();
        this.iaa = paramParcel.readInt();
        this.iab = paramParcel.readString();
        this.hZP = paramParcel.readString();
        GMTrace.o(19730811322368L, 147006);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19730945540096L, 147007);
      paramParcel.writeString(this.hZZ);
      if (this.hZR) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.kE);
        paramParcel.writeInt(this.jP);
        paramParcel.writeInt(this.mStatus);
        paramParcel.writeInt(this.iaa);
        paramParcel.writeString(this.iab);
        paramParcel.writeString(this.hZP);
        GMTrace.o(19730945540096L, 147007);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiGetMusicPlayerState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */