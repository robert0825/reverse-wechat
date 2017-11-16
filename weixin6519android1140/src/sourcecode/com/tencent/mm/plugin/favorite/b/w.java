package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.g;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class w
  implements g.a, g.b, SensorController.a
{
  public static SensorController jrf;
  private int eIv;
  private List<a> fIz;
  private boolean jri;
  public ax jrj;
  public long jrk;
  private boolean jrl;
  private boolean jrp;
  private g lbS;
  public boolean lbT;
  private int lbU;
  public String path;
  
  public w()
  {
    GMTrace.i(6295348314112L, 46904);
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
      GMTrace.o(6295348314112L, 46904);
      return;
      bool = false;
      break;
      label193:
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "get voice player fail, it is null");
    }
  }
  
  private void ahM()
  {
    GMTrace.i(6297227362304L, 46918);
    if (jrf != null) {
      jrf.bQD();
    }
    if (this.jrj != null) {
      this.jrj.bQE();
    }
    GMTrace.o(6297227362304L, 46918);
  }
  
  public final boolean E(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(6296019402752L, 46909);
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt1) });
      GMTrace.o(6296019402752L, 46909);
      return false;
    }
    this.lbS.stop();
    Object localObject = this.fIz.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).aW(paramString, paramInt2);
    }
    if ((jrf != null) && (!jrf.vkU))
    {
      jrf.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6294811443200L, 46900);
          w.this.jrk = bg.Pw();
          GMTrace.o(6294811443200L, 46900);
        }
      };
      if (!this.jrj.J((Runnable)localObject)) {
        break label210;
      }
    }
    label210:
    for (this.jrk = 0L;; this.jrk = -1L)
    {
      this.path = paramString;
      this.eIv = paramInt1;
      if ((bg.nm(paramString)) || (!this.lbS.a(paramString, this.jri, paramInt1, paramInt2))) {
        break;
      }
      ad.RS("keep_app_silent");
      at.AS().e(this.jri, false);
      GMTrace.o(6296019402752L, 46909);
      return true;
    }
    GMTrace.o(6296019402752L, 46909);
    return false;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6295482531840L, 46905);
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      if (parama == (a)localIterator.next())
      {
        GMTrace.o(6295482531840L, 46905);
        return;
      }
    }
    this.fIz.add(parama);
    GMTrace.o(6295482531840L, 46905);
  }
  
  public final boolean aV(String paramString, int paramInt)
  {
    GMTrace.i(6295885185024L, 46908);
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(6295885185024L, 46908);
      return false;
    }
    this.lbS.stop();
    Object localObject = this.fIz.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).aW(paramString, 0);
    }
    if ((jrf != null) && (!jrf.vkU))
    {
      jrf.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6265015107584L, 46678);
          w.this.jrk = bg.Pw();
          GMTrace.o(6265015107584L, 46678);
        }
      };
      if (!this.jrj.J((Runnable)localObject)) {
        break label193;
      }
    }
    label193:
    for (this.jrk = 0L;; this.jrk = -1L)
    {
      this.path = paramString;
      this.eIv = paramInt;
      if ((bg.nm(paramString)) || (!this.lbS.a(paramString, this.jri, true, paramInt))) {
        break;
      }
      ad.RS("keep_app_silent");
      GMTrace.o(6295885185024L, 46908);
      return true;
    }
    GMTrace.o(6295885185024L, 46908);
    return false;
  }
  
  public final void ahO()
  {
    GMTrace.i(6296824709120L, 46915);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceLogic", "stop play");
    ad.RT("keep_app_silent");
    if (this.lbS != null) {
      this.lbS.stop();
    }
    ahM();
    GMTrace.o(6296824709120L, 46915);
  }
  
  public final boolean axU()
  {
    GMTrace.i(6296153620480L, 46910);
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "check is play, but player is null");
      GMTrace.o(6296153620480L, 46910);
      return false;
    }
    boolean bool = this.lbS.isPlaying();
    GMTrace.o(6296153620480L, 46910);
    return bool;
  }
  
  public final boolean axV()
  {
    GMTrace.i(6296556273664L, 46913);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceLogic", "resume play");
    ad.RS("keep_app_silent");
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "resum play error, player is null");
      GMTrace.o(6296556273664L, 46913);
      return false;
    }
    boolean bool = this.lbS.qj();
    GMTrace.o(6296556273664L, 46913);
    return bool;
  }
  
  public final boolean axW()
  {
    GMTrace.i(6296690491392L, 46914);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceLogic", "pause play");
    ad.RT("keep_app_silent");
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "pause play error, player is null");
      GMTrace.o(6296690491392L, 46914);
      return false;
    }
    boolean bool = this.lbS.pause();
    GMTrace.o(6296690491392L, 46914);
    return bool;
  }
  
  public final void destroy()
  {
    GMTrace.i(6295616749568L, 46906);
    pause();
    ahM();
    jrf = null;
    this.fIz.clear();
    GMTrace.o(6295616749568L, 46906);
  }
  
  public final void jdMethod_do(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(6297361580032L, 46919);
    if (bg.nm(this.path))
    {
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (this.jrp)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.jrp = paramBoolean;
        GMTrace.o(6297361580032L, 46919);
        return;
      }
    }
    if ((!paramBoolean) && (this.jrk != -1L) && (bg.aI(this.jrk) > 400L))
    {
      this.jrp = true;
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    this.jrp = false;
    if ((this.lbS != null) && (this.lbS.qk()))
    {
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (this.jrl)
    {
      if (this.lbS != null) {
        this.lbS.ay(false);
      }
      at.AS().e(false, false);
      this.jri = false;
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if ((this.lbS != null) && (!this.lbS.isPlaying()) && (!this.lbT))
    {
      this.lbS.ay(true);
      this.jri = true;
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (this.lbS != null) {
      this.lbS.ay(paramBoolean);
    }
    this.jri = paramBoolean;
    if ((this.lbT) && (!paramBoolean))
    {
      E(this.path, this.eIv, this.lbU);
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (!paramBoolean) {
      aV(this.path, this.eIv);
    }
    GMTrace.o(6297361580032L, 46919);
  }
  
  public final boolean isPause()
  {
    GMTrace.i(6296287838208L, 46911);
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "check is pause, but player is null");
      GMTrace.o(6296287838208L, 46911);
      return false;
    }
    boolean bool = this.lbS.isPause();
    GMTrace.o(6296287838208L, 46911);
    return bool;
  }
  
  public final void onCompletion()
  {
    GMTrace.i(6297093144576L, 46917);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceLogic", "on completion, do stop play");
    ahO();
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(6297093144576L, 46917);
  }
  
  public final void onError()
  {
    GMTrace.i(6296958926848L, 46916);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceLogic", "on error, do stop play");
    ahO();
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(6296958926848L, 46916);
  }
  
  public final void pause()
  {
    GMTrace.i(6295750967296L, 46907);
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "do pause, but player is null");
      GMTrace.o(6295750967296L, 46907);
      return;
    }
    if (this.lbS.isPlaying()) {
      axW();
    }
    Iterator localIterator = this.fIz.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onPause();
    }
    GMTrace.o(6295750967296L, 46907);
  }
  
  public final double qm()
  {
    GMTrace.i(6296422055936L, 46912);
    if (this.lbS == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "get now progress error, player is null");
      GMTrace.o(6296422055936L, 46912);
      return 0.0D;
    }
    double d = this.lbS.qm();
    GMTrace.o(6296422055936L, 46912);
    return d;
  }
  
  public static abstract interface a
  {
    public abstract void aW(String paramString, int paramInt);
    
    public abstract void onFinish();
    
    public abstract void onPause();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */