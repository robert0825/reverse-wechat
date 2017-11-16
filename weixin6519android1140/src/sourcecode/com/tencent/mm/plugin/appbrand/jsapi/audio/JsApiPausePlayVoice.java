package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.af;
import org.json.JSONObject;

public final class JsApiPausePlayVoice
  extends a
{
  public static final int CTRL_INDEX = 34;
  public static final String NAME = "pauseVoice";
  private PausePlayVoice iaK;
  
  public JsApiPausePlayVoice()
  {
    GMTrace.i(19738059079680L, 147060);
    GMTrace.o(19738059079680L, 147060);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19738193297408L, 147061);
    this.iaK = new PausePlayVoice();
    AppBrandMainProcessService.a(this.iaK);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(19738193297408L, 147061);
  }
  
  private static class PausePlayVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<PausePlayVoice> CREATOR;
    
    static
    {
      GMTrace.i(19712423493632L, 146869);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19712423493632L, 146869);
    }
    
    public PausePlayVoice()
    {
      GMTrace.i(19712155058176L, 146867);
      GMTrace.o(19712155058176L, 146867);
    }
    
    public final void RY()
    {
      GMTrace.i(19712289275904L, 146868);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19742622482432L, 147094);
          ((e)h.h(e.class)).pause();
          GMTrace.o(19742622482432L, 147094);
        }
      });
      GMTrace.o(19712289275904L, 146868);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiPausePlayVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */