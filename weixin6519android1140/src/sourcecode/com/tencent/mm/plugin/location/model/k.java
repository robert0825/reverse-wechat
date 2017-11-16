package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.location.a;
import com.tencent.mm.pluginsdk.location.b;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  implements com.tencent.mm.ad.e
{
  List<a> fIz;
  public ar gEP;
  public int h;
  LinkedList<b> mxp;
  public b mxq;
  public int w;
  
  public k()
  {
    GMTrace.i(9640054095872L, 71824);
    this.gEP = new ar(1, "location_worker");
    this.mxp = new LinkedList();
    this.mxq = null;
    this.fIz = new ArrayList();
    this.w = 300;
    this.h = 300;
    start();
    GMTrace.o(9640054095872L, 71824);
  }
  
  public static String b(b paramb)
  {
    GMTrace.i(9640590966784L, 71828);
    paramb = com.tencent.mm.a.g.n(paramb.toString().getBytes());
    Object localObject = new StringBuilder();
    at.AR();
    localObject = c.yV() + paramb.charAt(0) + paramb.charAt(1) + "/" + paramb.charAt(3) + paramb.charAt(4) + "/";
    if (!com.tencent.mm.a.e.aZ((String)localObject)) {
      new File((String)localObject).mkdirs();
    }
    paramb = (String)localObject + "static_map_" + paramb;
    GMTrace.o(9640590966784L, 71828);
    return paramb;
  }
  
  final void Iq()
  {
    GMTrace.i(9640456749056L, 71827);
    if ((this.mxq == null) && (this.mxp.size() > 0))
    {
      this.mxq = ((b)this.mxp.removeFirst());
      try
      {
        i = Integer.valueOf(bg.aq(com.tencent.mm.k.g.ut().getValue("StaticMapGetClient"), "")).intValue();
        w.i("MicroMsg.StaticMapServer", "run local %d", new Object[] { Integer.valueOf(i) });
        if (i == 0)
        {
          g localg = new g(this.mxq.gEJ, this.mxq.gEK, this.mxq.eMn + 1, this.w, this.h, b(this.mxq), v.bPK());
          at.wS().a(localg, 0);
          GMTrace.o(9640456749056L, 71827);
          return;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          i = 0;
        }
        int j = this.w;
        for (int i = this.h; j * i > 270000; i = (int)(i / 1.2D)) {
          j = (int)(j / 1.2D);
        }
        if (bg.Jw())
        {
          str = String.format("https://maps.googleapis.com/maps/api/staticmap?size=%dx%d&center=%f,%f&zoom=%d&format=jpg&language=%s&sensor=true", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Float.valueOf(this.mxq.gEJ), Float.valueOf(this.mxq.gEK), Integer.valueOf(this.mxq.eMn), v.bPK() });
          this.gEP.c(new a(true, str, b(this.mxq)));
          GMTrace.o(9640456749056L, 71827);
          return;
        }
        String str = String.format("http://st.map.qq.com/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Float.valueOf(this.mxq.gEK), Float.valueOf(this.mxq.gEJ), Integer.valueOf(this.mxq.eMn) });
        this.gEP.c(new a(false, str, b(this.mxq)));
      }
    }
    GMTrace.o(9640456749056L, 71827);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(9640859402240L, 71830);
    if (paramk.getType() == 648)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0) && (this.mxq != null))
      {
        fD(true);
        GMTrace.o(9640859402240L, 71830);
        return;
      }
      fD(false);
    }
    GMTrace.o(9640859402240L, 71830);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(9639919878144L, 71823);
    this.fIz.remove(parama);
    w.i("MicroMsg.StaticMapServer", "removeCallback " + this.fIz.size());
    if (this.fIz.size() == 0)
    {
      w.i("MicroMsg.StaticMapServer", "clean task");
      this.mxp.clear();
      this.mxq = null;
      stop();
    }
    GMTrace.o(9639919878144L, 71823);
  }
  
  public final void fD(boolean paramBoolean)
  {
    GMTrace.i(9640725184512L, 71829);
    w.i("MicroMsg.StaticMapServer", "httpgetStaticmapDone %b", new Object[] { Boolean.valueOf(paramBoolean) });
    Iterator localIterator;
    a locala;
    if (paramBoolean)
    {
      if (this.mxq != null)
      {
        localIterator = this.fIz.iterator();
        while (localIterator.hasNext())
        {
          locala = (a)localIterator.next();
          if (locala != null) {
            locala.a(b(this.mxq), this.mxq);
          }
        }
      }
    }
    else if (this.mxq != null)
    {
      localIterator = this.fIz.iterator();
      while (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if (locala != null) {
          locala.a(this.mxq);
        }
      }
    }
    this.mxq = null;
    Iq();
    GMTrace.o(9640725184512L, 71829);
  }
  
  public final void start()
  {
    GMTrace.i(9640188313600L, 71825);
    at.wS().a(648, this);
    GMTrace.o(9640188313600L, 71825);
  }
  
  public final void stop()
  {
    GMTrace.i(9640322531328L, 71826);
    w.i("MicroMsg.StaticMapServer", "stop static map server");
    at.wS().b(648, this);
    GMTrace.o(9640322531328L, 71826);
  }
  
  public final class a
    implements ar.a
  {
    private byte[] data;
    private String mFilePath;
    boolean mxr;
    private int mxs;
    private int mxt;
    String url;
    
    public a(boolean paramBoolean, String paramString1, String paramString2)
    {
      GMTrace.i(9627974500352L, 71734);
      this.url = "";
      this.mxr = true;
      this.mxr = paramBoolean;
      this.mxs = k.this.w;
      this.mxt = k.this.h;
      this.url = paramString1;
      while (this.mxs * this.mxt > 270000)
      {
        this.mxs = ((int)(this.mxs / 1.2D));
        this.mxt = ((int)(this.mxt / 1.2D));
      }
      this.mFilePath = paramString2;
      w.i("MicroMsg.StaticMapServer", "get url %s %s", new Object[] { paramString1, bg.aq(this.mFilePath, "") });
      GMTrace.o(9627974500352L, 71734);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(9628108718080L, 71735);
      this.data = bg.SC(this.url);
      if (this.data != null) {
        com.tencent.mm.a.e.b(this.mFilePath, this.data, this.data.length);
      }
      GMTrace.o(9628108718080L, 71735);
      return true;
    }
    
    public final boolean Dk()
    {
      GMTrace.i(9628242935808L, 71736);
      StringBuilder localStringBuilder = new StringBuilder("http onPostExecute ");
      if (this.data == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.i("MicroMsg.StaticMapServer", bool + " isGoole: " + this.mxr);
        if (this.data != null) {
          break label245;
        }
        if (!this.mxr) {
          break label227;
        }
        if (k.this.mxq != null) {
          break;
        }
        k.this.fD(false);
        GMTrace.o(9628242935808L, 71736);
        return false;
      }
      this.url = String.format("http://st.map.qq.com/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin", new Object[] { Integer.valueOf(this.mxs), Integer.valueOf(this.mxt), Float.valueOf(k.this.mxq.gEK), Float.valueOf(k.this.mxq.gEJ), Integer.valueOf(k.this.mxq.eMn) });
      k.this.gEP.c(new a(k.this, false, this.url, k.b(k.this.mxq)));
      GMTrace.o(9628242935808L, 71736);
      return false;
      label227:
      k.this.fD(false);
      GMTrace.o(9628242935808L, 71736);
      return false;
      label245:
      k.this.fD(true);
      GMTrace.o(9628242935808L, 71736);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */