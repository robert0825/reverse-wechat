package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class i
  implements f.a
{
  public LinkedList<au> hbo;
  long hbp;
  private int hbq;
  private int hbr;
  public boolean hbs;
  public boolean hbt;
  private boolean hbu;
  private boolean hbv;
  public f hbw;
  long hbx;
  
  public i()
  {
    GMTrace.i(17456491921408L, 130061);
    this.hbo = new LinkedList();
    this.hbp = 0L;
    this.hbq = 0;
    this.hbr = 0;
    this.hbs = false;
    this.hbt = false;
    this.hbu = false;
    this.hbv = false;
    this.hbw = null;
    this.hbx = 0L;
    GMTrace.o(17456491921408L, 130061);
  }
  
  public final void Nb()
  {
    GMTrace.i(17456760356864L, 130063);
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17457431445504L, 130068);
        if (o.Nm().eyX)
        {
          GMTrace.o(17457431445504L, 130068);
          return;
        }
        if (i.this.hbw != null)
        {
          GMTrace.o(17457431445504L, 130068);
          return;
        }
        if ((i.this.hbs) || (i.this.hbt))
        {
          GMTrace.o(17457431445504L, 130068);
          return;
        }
        Object localObject1;
        int i;
        if (i.this.hbo.isEmpty())
        {
          localObject1 = i.this;
          if (bg.aG(((i)localObject1).hbx) > 600L) {
            ((i)localObject1).hbx = bg.Pu();
          }
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              i.this.Nc();
            }
            GMTrace.o(17457431445504L, 130068);
            return;
          }
        }
        Object localObject5 = new PBool();
        for (;;)
        {
          Object localObject6;
          synchronized (i.this.hbo)
          {
            Iterator localIterator = i.this.hbo.iterator();
            localObject1 = null;
            if (!localIterator.hasNext()) {
              break label679;
            }
            localObject1 = (au)localIterator.next();
            localObject6 = i.this;
            if (localObject1 == null)
            {
              ((PBool)localObject5).value = true;
              i = 0;
              if (!((PBool)localObject5).value) {
                break label938;
              }
              localIterator.remove();
              break label938;
            }
            r localr = t.mw(((ce)localObject1).field_imgPath);
            if ((localr != null) && (localr.Nw()))
            {
              w.i("MicroMsg.PreloadVideoService", "%d it finish download all file[%s], needn't preload", new Object[] { Integer.valueOf(localObject6.hashCode()), localr.getFileName() });
              String str = (String)bh.q(localr.Nt(), "msg").get(".msg.videomsg.$newmd5");
              boolean bool = com.tencent.mm.y.s.eb(localr.Nq());
              if (!bool) {
                break label945;
              }
              i = 2;
              ((i)localObject6).a(str, i, localr.gsL);
              g.ork.a(354L, 146L, 1L, false);
              if (bool)
              {
                g.ork.a(354L, 126L, 1L, false);
                ((PBool)localObject5).value = true;
                i = 0;
                continue;
              }
              g.ork.a(354L, 125L, 1L, false);
            }
          }
          if (bg.aH(((ce)localObject2).field_createTime) >= 86400000L)
          {
            w.i("MicroMsg.PreloadVideoService", "%d more than 1 day don't preload", new Object[] { Integer.valueOf(localObject6.hashCode()) });
            ((PBool)localObject5).value = true;
            i = 0;
          }
          else
          {
            if (((i)localObject6).bH(true)) {
              w.i("MicroMsg.PreloadVideoService", "%d check c2c video preload timestamp[%d]", new Object[] { Integer.valueOf(localObject6.hashCode()), Long.valueOf(((i)localObject6).hbp) });
            }
            label666:
            for (;;)
            {
              ((PBool)localObject5).value = false;
              i = 0;
              break;
              w.i("MicroMsg.PreloadVideoService", "%d check c2c video preload %d %s", new Object[] { Integer.valueOf(localObject6.hashCode()), Long.valueOf(((ce)localObject2).field_msgId), ((ce)localObject2).fwv });
              localObject6 = bc.gT(((ce)localObject2).fwv);
              if (localObject6 == null)
              {
                ((PBool)localObject5).value = true;
                i = 0;
                break;
              }
              if (((bc.b)localObject6).god <= 0)
              {
                ((PBool)localObject5).value = true;
                i = 0;
                break;
              }
              if (!b.jD(((bc.b)localObject6).gof))
              {
                if (am.isWifi(ab.getContext())) {
                  i = ((bc.b)localObject6).goe & 0x1;
                }
                for (;;)
                {
                  if (i <= 0) {
                    break label666;
                  }
                  ((PBool)localObject5).value = false;
                  i = 1;
                  break;
                  if (am.is4G(ab.getContext()))
                  {
                    i = ((bc.b)localObject6).goe & 0x2;
                  }
                  else
                  {
                    if (!am.is3G(ab.getContext())) {
                      break label668;
                    }
                    i = ((bc.b)localObject6).goe & 0x4;
                  }
                }
              }
            }
            label668:
            ((PBool)localObject5).value = false;
            i = 0;
            continue;
            label679:
            label938:
            do
            {
              if (localObject2 == null)
              {
                GMTrace.o(17457431445504L, 130068);
                return;
              }
              i.this.hbw = new f(((ce)localObject2).field_msgId);
              w.i("MicroMsg.PreloadVideoService", "%s start to preload video[%s]", new Object[] { Integer.valueOf(i.this.hashCode()), i.this.hbw.MZ() });
              if (i.this.hbw.a(i.this) < 0)
              {
                w.w("MicroMsg.PreloadVideoService", "%s curr preload task do scene error.", new Object[] { Integer.valueOf(i.this.hashCode()) });
                synchronized (i.this.hbo)
                {
                  ??? = i.this.hbo.iterator();
                  while (((Iterator)???).hasNext())
                  {
                    localObject5 = (au)((Iterator)???).next();
                    if ((localObject5 != null) && (((ce)localObject5).field_msgId == i.this.hbw.eDr))
                    {
                      w.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", new Object[] { Integer.valueOf(i.this.hashCode()), Long.valueOf(i.this.hbw.eDr) });
                      ((Iterator)???).remove();
                    }
                  }
                }
                i.this.hbw = null;
              }
              GMTrace.o(17457431445504L, 130068);
              return;
            } while (i != 0);
            continue;
            label945:
            i = 1;
          }
        }
      }
    });
    GMTrace.o(17456760356864L, 130063);
  }
  
  public final boolean Nc()
  {
    GMTrace.i(18680289165312L, 139179);
    long l1 = bg.Pw();
    int i = ((a)h.h(a.class)).ut().getInt("PreLoadVideoExpiredTime", 1);
    long l2 = bg.Pu() - i * 86400L;
    w.i("MicroMsg.PreloadVideoService", "%d start to delete expired file limit[%d] status[%d] expiredTime[%d] isC2C[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(1), Integer.valueOf(111), Long.valueOf(l2), Boolean.valueOf(true) });
    List localList = o.Nh().a(111, 1, l2);
    if ((localList == null) || (localList.isEmpty()))
    {
      GMTrace.o(18680289165312L, 139179);
      return false;
    }
    Iterator localIterator = localList.iterator();
    i = 0;
    r localr;
    while (localIterator.hasNext())
    {
      localr = (r)localIterator.next();
      if (localr != null)
      {
        o.Nh();
        String str = s.mk(localr.getFileName());
        if (bg.nm(str)) {
          break label399;
        }
        File localFile = new File(str);
        if (!localFile.exists()) {
          break label399;
        }
        l2 = localFile.length();
        w.i("MicroMsg.PreloadVideoService", "%s file[%d %d] lastmodifytime[%d] path[%s]", new Object[] { localr.getFileName(), Long.valueOf(l2), Integer.valueOf(localr.eMO), Long.valueOf(localr.hct), str });
        if ((l2 <= 0L) || (l2 > localr.eMO)) {
          break label399;
        }
        localFile.delete();
        i += 1;
      }
    }
    label399:
    for (;;)
    {
      localr.eMO = 0;
      localr.eQl = 1;
      t.e(localr);
      break;
      g.ork.a(354L, 144L, i, false);
      w.i("MicroMsg.PreloadVideoService", "%d delete expire file size %d delete count %d costTime[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(localList.size()), Integer.valueOf(i), Long.valueOf(bg.aI(l1)) });
      GMTrace.o(18680289165312L, 139179);
      return false;
    }
  }
  
  public final void a(final f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(17456894574592L, 130064);
    if (paramf == null)
    {
      w.e("MicroMsg.PreloadVideoService", "%d on preload finish but scene is null?", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(17456894574592L, 130064);
      return;
    }
    if (this.hbw != paramf) {
      w.w("MicroMsg.PreloadVideoService", "%d on preload finish, but scene callback not same object.", new Object[] { Integer.valueOf(hashCode()) });
    }
    w.i("MicroMsg.PreloadVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", new Object[] { Integer.valueOf(hashCode()), paramf.MZ(), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17448304640000L, 130000);
        long l = paramf.eDr;
        synchronized (i.this.hbo)
        {
          Iterator localIterator = i.this.hbo.iterator();
          while (localIterator.hasNext())
          {
            au localau = (au)localIterator.next();
            if ((localau != null) && (localau.field_msgId == l))
            {
              w.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", new Object[] { Integer.valueOf(i.this.hashCode()), Long.valueOf(l) });
              localIterator.remove();
            }
          }
        }
        i.this.bG(true);
        if (i.this.hbw != null) {
          i.this.hbw.haX = null;
        }
        i.this.hbw = null;
        i.this.Nc();
        i.this.Nb();
        GMTrace.o(17448304640000L, 130000);
      }
    });
    GMTrace.o(17456894574592L, 130064);
  }
  
  public final void a(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(18680423383040L, 139180);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(bg.Pu()).append(",");
    localStringBuffer.append(bg.Pu()).append(",");
    localStringBuffer.append(0).append(",");
    localStringBuffer.append(paramString).append(",");
    localStringBuffer.append(paramInt).append(",");
    localStringBuffer.append(0).append(",");
    localStringBuffer.append(paramLong);
    paramString = localStringBuffer.toString();
    w.d("MicroMsg.PreloadVideoService", "%d rpt content[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    g.ork.A(14499, paramString);
    GMTrace.o(18680423383040L, 139180);
  }
  
  public final void bG(boolean paramBoolean)
  {
    GMTrace.i(18680020729856L, 139177);
    if (paramBoolean)
    {
      this.hbq = ((Integer)h.xy().xh().get(w.a.vyh, Integer.valueOf(0))).intValue();
      this.hbq += 1;
      h.xy().xh().a(w.a.vyh, Integer.valueOf(this.hbq));
      GMTrace.o(18680020729856L, 139177);
      return;
    }
    this.hbr = ((Integer)h.xy().xh().get(w.a.vyi, Integer.valueOf(0))).intValue();
    this.hbr += 1;
    h.xy().xh().a(w.a.vyi, Integer.valueOf(this.hbr));
    GMTrace.o(18680020729856L, 139177);
  }
  
  public final boolean bH(boolean paramBoolean)
  {
    int k = 100;
    GMTrace.i(18680154947584L, 139178);
    this.hbp = ((Long)h.xy().xh().get(w.a.vyg, Long.valueOf(-1L))).longValue();
    if (bg.aH(this.hbp) >= 86400000L)
    {
      this.hbp = bg.Pv();
      h.xy().xh().a(w.a.vyg, Long.valueOf(this.hbp));
      h.xy().xh().a(w.a.vyh, Integer.valueOf(0));
      h.xy().xh().a(w.a.vyi, Integer.valueOf(0));
      this.hbv = false;
      this.hbu = false;
    }
    this.hbq = ((Integer)h.xy().xh().get(w.a.vyh, Integer.valueOf(0))).intValue();
    this.hbr = ((Integer)h.xy().xh().get(w.a.vyi, Integer.valueOf(0))).intValue();
    int j;
    int i;
    if (paramBoolean)
    {
      j = this.hbq;
      i = ((a)h.h(a.class)).ut().getInt("C2CMaxPreloadVideo", 100);
      if (i > 0) {
        break label398;
      }
      i = k;
    }
    label221:
    label369:
    label398:
    for (;;)
    {
      boolean bool;
      if (j >= i)
      {
        bool = true;
        w.i("MicroMsg.PreloadVideoService", "%d check more preload count result[%b] config[%d] hadPreloadCount[%d %d %d] ", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.hbq), Integer.valueOf(this.hbr) });
        if (bool)
        {
          if (!paramBoolean) {
            break label369;
          }
          if (!this.hbu)
          {
            this.hbu = true;
            g.ork.a(354L, 127L, 1L, false);
          }
        }
      }
      for (;;)
      {
        GMTrace.o(18680154947584L, 139178);
        return bool;
        j = this.hbr;
        i = ((a)h.h(a.class)).ut().getInt("SnsMaxPreloadVideo", 100);
        break;
        bool = false;
        break label221;
        if (!this.hbv)
        {
          this.hbv = true;
          g.ork.a(354L, 128L, 1L, false);
        }
      }
    }
  }
  
  public final void stopDownload()
  {
    GMTrace.i(17456626139136L, 130062);
    w.i("MicroMsg.PreloadVideoService", "%d stop download", new Object[] { Integer.valueOf(hashCode()) });
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17455149744128L, 130051);
        if (i.this.hbw != null) {
          i.this.hbw.stop();
        }
        i.this.hbw = null;
        GMTrace.o(17455149744128L, 130051);
      }
    });
    GMTrace.o(17456626139136L, 130062);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */