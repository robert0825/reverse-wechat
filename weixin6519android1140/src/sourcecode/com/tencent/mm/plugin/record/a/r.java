package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.g;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  implements g.a, g.b, SensorController.a
{
  public static SensorController jrf;
  private int eIv;
  public List<a> fIz;
  private boolean jri;
  private ax jrj;
  public long jrk;
  private boolean jrl;
  private boolean jrp;
  public g lbS;
  public String path;
  
  public r()
  {
    GMTrace.i(7501428817920L, 55890);
    this.jri = true;
    this.jrp = false;
    this.jrk = -1L;
    this.fIz = new LinkedList();
    this.lbS = ((n)h.h(n.class)).ps();
    at.AR();
    Boolean localBoolean = (Boolean)c.xh().get(26, Boolean.valueOf(false));
    this.jrl = localBoolean.booleanValue();
    boolean bool;
    if (!localBoolean.booleanValue())
    {
      bool = true;
      this.jri = bool;
      if (this.lbS == null) {
        break label193;
      }
      this.lbS.a(this);
      this.lbS.a(this);
      this.lbS.ay(this.jri);
    }
    for (;;)
    {
      if (jrf == null) {
        jrf = new SensorController(ab.getContext());
      }
      if (this.jrj == null) {
        this.jrj = new ax(ab.getContext());
      }
      GMTrace.o(7501428817920L, 55890);
      return;
      bool = false;
      break;
      label193:
      w.w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
    }
  }
  
  public final boolean aV(String paramString, int paramInt)
  {
    GMTrace.i(7501563035648L, 55891);
    if (this.lbS == null)
    {
      w.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(7501563035648L, 55891);
      return false;
    }
    this.lbS.stop();
    Object localObject = this.fIz.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).Fx(paramString);
    }
    if ((jrf != null) && (!jrf.vkU))
    {
      jrf.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7517266509824L, 56008);
          r.this.jrk = bg.Pw();
          GMTrace.o(7517266509824L, 56008);
        }
      };
      if (!this.jrj.J((Runnable)localObject)) {
        break label192;
      }
    }
    label192:
    for (this.jrk = 0L;; this.jrk = -1L)
    {
      this.path = paramString;
      this.eIv = paramInt;
      if ((bg.nm(paramString)) || (!this.lbS.a(paramString, this.jri, true, paramInt))) {
        break;
      }
      ad.RS("keep_app_silent");
      GMTrace.o(7501563035648L, 55891);
      return true;
    }
    GMTrace.o(7501563035648L, 55891);
    return false;
  }
  
  public final void ahM()
  {
    GMTrace.i(7502234124288L, 55896);
    if (jrf != null) {
      jrf.bQD();
    }
    if (this.jrj != null) {
      this.jrj.bQE();
    }
    GMTrace.o(7502234124288L, 55896);
  }
  
  public final void ahO()
  {
    GMTrace.i(7501831471104L, 55893);
    w.d("MicroMsg.RecordVoiceHelper", "stop play");
    ad.RT("keep_app_silent");
    if (this.lbS != null) {
      this.lbS.stop();
    }
    ahM();
    GMTrace.o(7501831471104L, 55893);
  }
  
  public final boolean axU()
  {
    GMTrace.i(7501697253376L, 55892);
    if (this.lbS == null)
    {
      w.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
      GMTrace.o(7501697253376L, 55892);
      return false;
    }
    boolean bool = this.lbS.isPlaying();
    GMTrace.o(7501697253376L, 55892);
    return bool;
  }
  
  public final void jdMethod_do(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(7502368342016L, 55897);
    if (bg.nm(this.path))
    {
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if (this.jrp)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.jrp = paramBoolean;
        GMTrace.o(7502368342016L, 55897);
        return;
      }
    }
    if ((!paramBoolean) && (this.jrk != -1L) && (bg.aI(this.jrk) > 400L))
    {
      this.jrp = true;
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    this.jrp = false;
    if ((this.lbS != null) && (this.lbS.qk()))
    {
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if (this.jrl)
    {
      if (this.lbS != null) {
        this.lbS.ay(false);
      }
      this.jri = false;
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if ((this.lbS != null) && (!this.lbS.isPlaying()))
    {
      this.lbS.ay(true);
      this.jri = true;
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if (this.lbS != null) {
      this.lbS.ay(paramBoolean);
    }
    this.jri = paramBoolean;
    if (!paramBoolean) {
      aV(this.path, this.eIv);
    }
    GMTrace.o(7502368342016L, 55897);
  }
  
  public final void onCompletion()
  {
    GMTrace.i(7502099906560L, 55895);
    w.d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
    ahO();
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(7502099906560L, 55895);
  }
  
  public final void onError()
  {
    GMTrace.i(7501965688832L, 55894);
    w.d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
    ahO();
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(7501965688832L, 55894);
  }
  
  public static abstract interface a
  {
    public abstract void Fx(String paramString);
    
    public abstract void onFinish();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */