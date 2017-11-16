package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

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

public class a
  implements g.a, g.b, SensorController.a
{
  public static volatile a skj;
  private int eIv;
  public List<a> fIz;
  public SensorController jrf;
  private boolean jri;
  public ax jrj;
  public long jrk;
  private boolean jrl;
  private boolean jrp;
  private g lbS;
  String path;
  
  static
  {
    GMTrace.i(17170339725312L, 127929);
    skj = null;
    GMTrace.o(17170339725312L, 127929);
  }
  
  private a()
  {
    GMTrace.i(17169265983488L, 127921);
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
        break label195;
      }
      this.lbS.a(this);
      this.lbS.a(this);
      this.lbS.ay(this.jri);
    }
    for (;;)
    {
      if (this.jrf == null) {
        this.jrf = new SensorController(ab.getContext());
      }
      if (this.jrj == null) {
        this.jrj = new ax(ab.getContext());
      }
      GMTrace.o(17169265983488L, 127921);
      return;
      bool = false;
      break;
      label195:
      w.w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
    }
  }
  
  public static a bII()
  {
    GMTrace.i(17169400201216L, 127922);
    if (skj == null) {}
    try
    {
      if (skj == null) {
        skj = new a();
      }
      a locala = skj;
      GMTrace.o(17169400201216L, 127922);
      return locala;
    }
    finally {}
  }
  
  public final boolean aV(String paramString, int paramInt)
  {
    GMTrace.i(17169534418944L, 127923);
    if (this.lbS == null)
    {
      w.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(17169534418944L, 127923);
      return false;
    }
    this.lbS.stop();
    Object localObject;
    if ((this.jrf != null) && (!this.jrf.vkU))
    {
      this.jrf.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17170608160768L, 127931);
          a.this.jrk = bg.Pw();
          GMTrace.o(17170608160768L, 127931);
        }
      };
      if (!this.jrj.J((Runnable)localObject)) {
        break label194;
      }
    }
    label194:
    for (this.jrk = 0L;; this.jrk = -1L)
    {
      this.path = paramString;
      this.eIv = paramInt;
      if ((bg.nm(paramString)) || (!this.lbS.a(paramString, this.jri, true, paramInt))) {
        break label214;
      }
      ad.RS("keep_app_silent");
      localObject = this.fIz.iterator();
      while (((Iterator)localObject).hasNext())
      {
        a locala = (a)((Iterator)localObject).next();
        if (locala != null) {
          locala.NS(paramString);
        }
      }
    }
    GMTrace.o(17169534418944L, 127923);
    return true;
    label214:
    GMTrace.o(17169534418944L, 127923);
    return false;
  }
  
  public final void ahO()
  {
    GMTrace.i(17169668636672L, 127924);
    w.i("MicroMsg.RecordVoiceHelper", "stop play");
    ad.RT("keep_app_silent");
    if (this.lbS != null)
    {
      this.lbS.stop();
      Iterator localIterator = this.fIz.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala != null) {
          locala.bIH();
        }
      }
    }
    if (this.jrf != null) {
      this.jrf.bQD();
    }
    if (this.jrj != null) {
      this.jrj.bQE();
    }
    GMTrace.o(17169668636672L, 127924);
  }
  
  public final boolean axU()
  {
    GMTrace.i(17169802854400L, 127925);
    if (this.lbS == null)
    {
      w.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
      GMTrace.o(17169802854400L, 127925);
      return false;
    }
    boolean bool = this.lbS.isPlaying();
    GMTrace.o(17169802854400L, 127925);
    return bool;
  }
  
  public final void jdMethod_do(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(17170205507584L, 127928);
    if (bg.nm(this.path))
    {
      GMTrace.o(17170205507584L, 127928);
      return;
    }
    if (this.jrp)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.jrp = paramBoolean;
        GMTrace.o(17170205507584L, 127928);
        return;
      }
    }
    if ((!paramBoolean) && (this.jrk != -1L) && (bg.aI(this.jrk) > 400L))
    {
      this.jrp = true;
      GMTrace.o(17170205507584L, 127928);
      return;
    }
    this.jrp = false;
    if ((this.lbS != null) && (this.lbS.qk()))
    {
      GMTrace.o(17170205507584L, 127928);
      return;
    }
    if (this.jrl)
    {
      if (this.lbS != null) {
        this.lbS.ay(false);
      }
      this.jri = false;
      GMTrace.o(17170205507584L, 127928);
      return;
    }
    if ((this.lbS != null) && (!this.lbS.isPlaying()))
    {
      this.lbS.ay(true);
      this.jri = true;
      GMTrace.o(17170205507584L, 127928);
      return;
    }
    if (this.lbS != null) {
      this.lbS.ay(paramBoolean);
    }
    this.jri = paramBoolean;
    if (!paramBoolean) {
      aV(this.path, this.eIv);
    }
    GMTrace.o(17170205507584L, 127928);
  }
  
  public final void onCompletion()
  {
    GMTrace.i(17170071289856L, 127927);
    w.d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
    ahO();
    GMTrace.o(17170071289856L, 127927);
  }
  
  public final void onError()
  {
    GMTrace.i(17169937072128L, 127926);
    w.d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
    ahO();
    GMTrace.o(17169937072128L, 127926);
  }
  
  public static abstract interface a
  {
    public abstract void NS(String paramString);
    
    public abstract void bIH();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\voiceview\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */