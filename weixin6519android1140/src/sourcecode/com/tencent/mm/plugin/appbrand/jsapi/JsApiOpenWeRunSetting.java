package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.sport.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class JsApiOpenWeRunSetting
  extends a
{
  public static final int CTRL_INDEX = 228;
  public static final String NAME = "openWeRunSetting";
  private OpenWeRunSetting hYT;
  
  public JsApiOpenWeRunSetting()
  {
    GMTrace.i(15465506144256L, 115227);
    GMTrace.o(15465506144256L, 115227);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = true;
    GMTrace.i(15465640361984L, 115228);
    if (paramJSONObject != null) {
      bool = paramJSONObject.optBoolean("checkSupport", true);
    }
    this.hYT = new OpenWeRunSetting(this, paramj, paramInt, bool);
    this.hYT.VM();
    AppBrandMainProcessService.a(this.hYT);
    GMTrace.o(15465640361984L, 115228);
  }
  
  private static class OpenWeRunSetting
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OpenWeRunSetting> CREATOR;
    private boolean eWB;
    public d hYJ;
    public j hYK;
    public int hYL;
    public boolean hYU;
    private boolean hYV;
    
    static
    {
      GMTrace.i(15470203764736L, 115262);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15470203764736L, 115262);
    }
    
    public OpenWeRunSetting(Parcel paramParcel)
    {
      GMTrace.i(15469130022912L, 115254);
      this.hYU = false;
      this.eWB = false;
      f(paramParcel);
      GMTrace.o(15469130022912L, 115254);
    }
    
    public OpenWeRunSetting(d paramd, j paramj, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(19802752024576L, 147542);
      this.hYU = false;
      this.eWB = false;
      w.i("MicroMsg.JsApiOpenWeRunSetting", "OpenWeRunSetting");
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      this.hYV = paramBoolean;
      GMTrace.o(19802752024576L, 147542);
    }
    
    public final void RY()
    {
      GMTrace.i(15469264240640L, 115255);
      this.hYU = ((b)h.h(b.class)).dh(ab.getContext());
      if ((this.hYV) && (!this.hYU))
      {
        ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a(new a.a()
        {
          public final void i(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
          {
            GMTrace.i(19815368491008L, 147636);
            JsApiOpenWeRunSetting.OpenWeRunSetting localOpenWeRunSetting = JsApiOpenWeRunSetting.OpenWeRunSetting.this;
            if ((paramAnonymousBoolean1) && (paramAnonymousBoolean2)) {}
            for (boolean bool = true;; bool = false)
            {
              localOpenWeRunSetting.hYU = bool;
              w.i("MicroMsg.JsApiOpenWeRunSetting", "After getUserState requestOk %b, hasStep %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean1), Boolean.valueOf(paramAnonymousBoolean2) });
              JsApiOpenWeRunSetting.OpenWeRunSetting.this.VV();
              GMTrace.o(19815368491008L, 147636);
              return;
            }
          }
        });
        GMTrace.o(15469264240640L, 115255);
        return;
      }
      VV();
      GMTrace.o(15469264240640L, 115255);
    }
    
    public final void VK()
    {
      GMTrace.i(15469398458368L, 115256);
      if ((this.hYV) && (!this.hYU))
      {
        this.hYK.v(this.hYL, this.hYJ.d("fail device not support", null));
        VN();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      if (this.eWB)
      {
        this.hYK.v(this.hYL, this.hYJ.d("ok", null));
        VN();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      MMActivity localMMActivity = this.hYJ.a(this.hYK);
      if (localMMActivity == null)
      {
        this.hYK.v(this.hYL, this.hYJ.d("fail", null));
        VN();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(this.hYK.hyD);
      if ((localAppBrandSysConfig == null) || (bg.nm(localAppBrandSysConfig.eEs)))
      {
        this.hYK.v(this.hYL, this.hYJ.d("fail", null));
        VN();
        GMTrace.o(15469398458368L, 115256);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("OpenWeRunSettingName", localAppBrandSysConfig.eEs);
      localMMActivity.vKC = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(18243947331584L, 135928);
          if (paramAnonymousInt1 != (JsApiOpenWeRunSetting.OpenWeRunSetting.this.hashCode() & 0xFFFF))
          {
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.VN();
            GMTrace.o(18243947331584L, 135928);
            return;
          }
          if (paramAnonymousInt2 == -1)
          {
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYK.v(JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYL, JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYJ.d("ok", null));
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.VN();
            GMTrace.o(18243947331584L, 135928);
            return;
          }
          if (paramAnonymousInt2 == 0)
          {
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYK.v(JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYL, JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYJ.d("cancel", null));
            JsApiOpenWeRunSetting.OpenWeRunSetting.this.VN();
            GMTrace.o(18243947331584L, 135928);
            return;
          }
          JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYK.v(JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYL, JsApiOpenWeRunSetting.OpenWeRunSetting.this.hYJ.d("fail", null));
          JsApiOpenWeRunSetting.OpenWeRunSetting.this.VN();
          GMTrace.o(18243947331584L, 135928);
        }
      };
      com.tencent.mm.bj.d.a(localMMActivity, "appbrand", ".ui.AppBrandOpenWeRunSettingUI", localIntent, hashCode() & 0xFFFF, false);
      VN();
      GMTrace.o(15469398458368L, 115256);
    }
    
    public final void VV()
    {
      GMTrace.i(18205426843648L, 135641);
      if ((!this.hYV) || (this.hYU))
      {
        this.eWB = ((b)h.h(b.class)).bqR();
        if ((this.hYV) && (this.eWB)) {
          ((b)h.h(b.class)).bqQ();
        }
      }
      VL();
      GMTrace.o(18205426843648L, 135641);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(15469532676096L, 115257);
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.hYU = bool1;
        if (paramParcel.readByte() == 0) {
          break label66;
        }
        bool1 = true;
        label33:
        this.eWB = bool1;
        if (paramParcel.readByte() == 0) {
          break label71;
        }
      }
      label66:
      label71:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.hYV = bool1;
        GMTrace.o(15469532676096L, 115257);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label33;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(15469666893824L, 115258);
      if (this.hYU)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.eWB) {
          break label68;
        }
        b1 = 1;
        label34:
        paramParcel.writeByte(b1);
        if (!this.hYV) {
          break label73;
        }
      }
      label68:
      label73:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        GMTrace.o(15469666893824L, 115258);
        return;
        b1 = 0;
        break;
        b1 = 0;
        break label34;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiOpenWeRunSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */