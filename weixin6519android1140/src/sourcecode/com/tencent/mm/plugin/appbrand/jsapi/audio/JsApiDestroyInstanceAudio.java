package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiDestroyInstanceAudio
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 290;
  public static final String NAME = "destroyAudioInstance";
  
  public JsApiDestroyInstanceAudio()
  {
    GMTrace.i(19717926420480L, 146910);
    GMTrace.o(19717926420480L, 146910);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19718060638208L, 146911);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiDestroyInstanceAudio", "destroyAudioInstance fail, data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19718060638208L, 146911);
      return;
    }
    w.i("MicroMsg.JsApiDestroyInstanceAudio", "destroyAudioInstance data:%s", new Object[] { paramJSONObject.toString() });
    paramJSONObject = paramJSONObject.optString("audioId");
    if (TextUtils.isEmpty(paramJSONObject))
    {
      w.e("MicroMsg.JsApiDestroyInstanceAudio", "audioId is empty");
      paramj.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19718060638208L, 146911);
      return;
    }
    DestroyAudioTask localDestroyAudioTask = new DestroyAudioTask(this, paramj, paramInt);
    localDestroyAudioTask.appId = paramj.hyD;
    localDestroyAudioTask.eAL = paramJSONObject;
    AppBrandMainProcessService.a(localDestroyAudioTask);
    GMTrace.o(19718060638208L, 146911);
  }
  
  private static class DestroyAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<DestroyAudioTask> CREATOR;
    public String appId;
    public String eAL;
    private d hYJ;
    public j hYK;
    public int hYL;
    public boolean hZR;
    
    static
    {
      GMTrace.i(19720879210496L, 146932);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19720879210496L, 146932);
    }
    
    public DestroyAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19720208121856L, 146927);
      this.appId = "";
      this.eAL = "";
      this.hZR = false;
      f(paramParcel);
      GMTrace.o(19720208121856L, 146927);
    }
    
    public DestroyAudioTask(d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19720073904128L, 146926);
      this.appId = "";
      this.eAL = "";
      this.hZR = false;
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19720073904128L, 146926);
    }
    
    public final void RY()
    {
      GMTrace.i(19720342339584L, 146928);
      w.i("MicroMsg.JsApiDestroyInstanceAudio", "runInMainProcess");
      String str = this.eAL;
      w.i("MicroMsg.AudioPlayerHelper", "destroyAudio, audioId:%s", new Object[] { str });
      t localt = new t();
      localt.eAJ.action = 5;
      localt.eAJ.eAL = str;
      com.tencent.mm.sdk.b.a.vgX.m(localt);
      this.hZR = localt.eAK.eAO;
      VL();
      GMTrace.o(19720342339584L, 146928);
    }
    
    public final void VK()
    {
      GMTrace.i(19720476557312L, 146929);
      w.i("MicroMsg.JsApiDestroyInstanceAudio", "runInClientProcess");
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiDestroyInstanceAudio", "server is null");
        GMTrace.o(19720476557312L, 146929);
        return;
      }
      if (this.hZR)
      {
        this.hYK.v(this.hYL, this.hYJ.d("fail", null));
        GMTrace.o(19720476557312L, 146929);
        return;
      }
      this.hYK.v(this.hYL, this.hYJ.d("ok", null));
      GMTrace.o(19720476557312L, 146929);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19720610775040L, 146930);
      this.appId = paramParcel.readString();
      this.eAL = paramParcel.readString();
      GMTrace.o(19720610775040L, 146930);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19720744992768L, 146931);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eAL);
      GMTrace.o(19720744992768L, 146931);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiDestroyInstanceAudio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */