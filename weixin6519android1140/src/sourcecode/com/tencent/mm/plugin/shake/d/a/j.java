package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.e;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.e.c;
import com.tencent.mm.plugin.shake.e.c.a;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bdh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class j
  extends l.b
{
  public static boolean ndo;
  public static j oOA;
  private boolean eAo;
  public long oOB;
  public a oOz;
  
  static
  {
    GMTrace.i(6600693645312L, 49179);
    ndo = false;
    GMTrace.o(6600693645312L, 49179);
  }
  
  private j(l.a parama)
  {
    super(parama);
    GMTrace.i(6598411943936L, 49162);
    this.eAo = false;
    this.oOz = new a();
    GMTrace.o(6598411943936L, 49162);
  }
  
  public static j a(l.a parama)
  {
    GMTrace.i(6598277726208L, 49161);
    if ((oOA == null) || (oOA.oMx == null)) {
      oOA = new j(parama);
    }
    parama = oOA;
    GMTrace.o(6598277726208L, 49161);
    return parama;
  }
  
  public final void beX()
  {
    GMTrace.i(6599083032576L, 49167);
    this.oOz.qn();
    super.beX();
    GMTrace.o(6599083032576L, 49167);
  }
  
  public final void e(List<d> paramList, long paramLong)
  {
    GMTrace.i(6599351468032L, 49169);
    if (this.oMx != null) {
      this.oMx.d(paramList, paramLong);
    }
    GMTrace.o(6599351468032L, 49169);
  }
  
  public final void init()
  {
    GMTrace.i(6598680379392L, 49164);
    if (!ndo)
    {
      if (!this.oOz.bfJ())
      {
        w.e("Micromsg.ShakeMusicMgr", "init MusicFingerPrintRecorder false");
        GMTrace.o(6598680379392L, 49164);
        return;
      }
      ndo = true;
    }
    GMTrace.o(6598680379392L, 49164);
  }
  
  public final void pause()
  {
    GMTrace.i(6598948814848L, 49166);
    GMTrace.o(6598948814848L, 49166);
  }
  
  public final void reset()
  {
    GMTrace.i(6598814597120L, 49165);
    GMTrace.o(6598814597120L, 49165);
  }
  
  public final void resume()
  {
    GMTrace.i(6599217250304L, 49168);
    GMTrace.o(6599217250304L, 49168);
  }
  
  public final void start()
  {
    GMTrace.i(6598546161664L, 49163);
    if (this.oMx == null)
    {
      w.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
      GMTrace.o(6598546161664L, 49163);
      return;
    }
    this.oOB = System.currentTimeMillis();
    this.oOz.a(367, new a.a()
    {
      public final void a(azh paramAnonymousazh, long paramAnonymousLong, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6595056500736L, 49137);
        if (j.a(j.this) == null)
        {
          w.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
          GMTrace.o(6595056500736L, 49137);
          return;
        }
        Object localObject2 = (bdh)paramAnonymousazh;
        if (localObject2 == null)
        {
          w.w("Micromsg.ShakeMusicMgr", "resp null & return");
          j.this.e(new ArrayList(), 4L);
          GMTrace.o(6595056500736L, 49137);
          return;
        }
        Object localObject1;
        if (((bdh)localObject2).uPv == 1)
        {
          int i;
          if (paramAnonymousLong > j.this.oOB)
          {
            paramAnonymousLong = System.currentTimeMillis() - paramAnonymousLong;
            if ((localObject2 == null) || (bg.nm(((bdh)localObject2).uPx))) {
              break label1566;
            }
            w.w("Micromsg.ShakeMusicMgr", "resCallback Type:%d, xml:%s", new Object[] { Integer.valueOf(((bdh)localObject2).uPw), ((bdh)localObject2).uPx });
            localObject1 = ((bdh)localObject2).uPx;
            paramAnonymousazh = (azh)localObject1;
            if (localObject1 != null) {
              paramAnonymousazh = ((String)localObject1).trim();
            }
            switch (((bdh)localObject2).uPw)
            {
            default: 
              w.w("Micromsg.ShakeMusicMgr", "parse unknown type:" + ((bdh)localObject2).uPw);
              j.this.e(new ArrayList(), 4L);
              i = 0;
            }
          }
          for (;;)
          {
            if (i == 0) {
              break label1518;
            }
            g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(1), Integer.valueOf((int)(System.currentTimeMillis() - j.this.oOB)) });
            GMTrace.o(6595056500736L, 49137);
            return;
            paramAnonymousLong = System.currentTimeMillis() - j.this.oOB;
            break;
            localObject1 = j.this;
            localObject2 = new ArrayList();
            Object localObject3 = m.e.Gu(paramAnonymousazh);
            Object localObject4;
            if ((localObject3 != null) && (((m.e)localObject3).gVf != null))
            {
              w.d("Micromsg.ShakeMusicMgr", "parse url: link=" + ((m.e)localObject3).gVf + ", title=" + ((m.e)localObject3).title + ", thumburl=" + ((m.e)localObject3).thumbUrl);
              localObject4 = new d();
              ((d)localObject4).field_username = ((m.e)localObject3).gVf;
              ((d)localObject4).field_nickname = ((m.e)localObject3).title;
              ((d)localObject4).field_distance = ((m.e)localObject3).ePK;
              ((d)localObject4).field_sns_bgurl = ((m.e)localObject3).thumbUrl;
              ((d)localObject4).field_type = 7;
              ((d)localObject4).field_insertBatch = 1;
              ((d)localObject4).field_lvbuffer = paramAnonymousazh.getBytes();
              m.bfk().a((d)localObject4, true);
              ((List)localObject2).add(localObject4);
              ((j)localObject1).e((List)localObject2, 1L);
              i = 1;
            }
            else
            {
              w.w("Micromsg.ShakeMusicMgr", "parse url fail");
              ((j)localObject1).e((List)localObject2, 4L);
              i = 0;
              continue;
              localObject1 = j.this;
              paramAnonymousazh = m.f.Gv(paramAnonymousazh);
              localObject2 = new ArrayList();
              if ((paramAnonymousazh != null) && (paramAnonymousazh.userName != null))
              {
                w.d("Micromsg.ShakeMusicMgr", "parse user: username=" + paramAnonymousazh.userName + ", nickname=" + paramAnonymousazh.aDn + ", showchat=" + paramAnonymousazh.oOH);
                localObject3 = new d();
                ((d)localObject3).field_username = paramAnonymousazh.userName;
                ((d)localObject3).field_nickname = paramAnonymousazh.aDn;
                ((d)localObject3).field_type = 6;
                ((d)localObject3).field_insertBatch = 1;
                ((d)localObject3).field_distance = paramAnonymousazh.oOH;
                m.bfk().a((d)localObject3, true);
                ((List)localObject2).add(localObject3);
                ((j)localObject1).e((List)localObject2, 1L);
                i = 1;
              }
              else
              {
                w.w("Micromsg.ShakeMusicMgr", "parse user fail");
                ((j)localObject1).e((List)localObject2, 4L);
                i = 0;
                continue;
                localObject1 = j.this;
                localObject2 = new ArrayList();
                if ((paramAnonymousazh == null) || (!paramAnonymousazh.startsWith("<tv")))
                {
                  if (paramAnonymousazh == null) {}
                  for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
                  {
                    w.e("Micromsg.ShakeMusicMgr", "wrong args, xml == null ? [%s]", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
                    ((j)localObject1).e((List)localObject2, 2L);
                    i = 0;
                    break;
                  }
                }
                localObject4 = c.Gx(paramAnonymousazh);
                if (localObject4 == null)
                {
                  w.e("Micromsg.ShakeMusicMgr", "shakeTV resCallback xml error");
                  ((j)localObject1).e((List)localObject2, 4L);
                  i = 0;
                }
                else
                {
                  localObject3 = new d();
                  ((d)localObject3).field_username = bg.nl(((c.a)localObject4).field_subtitle);
                  ((d)localObject3).field_nickname = bg.nl(((c.a)localObject4).field_topic);
                  ((d)localObject3).field_distance = bg.nl(((c.a)localObject4).field_title);
                  if (((c.a)localObject4).field_thumburl != null) {
                    ((d)localObject3).field_sns_bgurl = ((c.a)localObject4).field_thumburl;
                  }
                  ((d)localObject3).field_type = 8;
                  ((d)localObject3).field_insertBatch = 1;
                  ((d)localObject3).field_lvbuffer = paramAnonymousazh.getBytes();
                  ((d)localObject3).field_reserved2 = ((int)bg.Pu());
                  ((List)localObject2).add(localObject3);
                  paramAnonymousazh = m.bfk().bfa();
                  if ((paramAnonymousazh.field_type == 8) && (((d)localObject3).field_distance.equals(paramAnonymousazh.field_distance)) && (((d)localObject3).field_nickname.equals(paramAnonymousazh.field_nickname)) && (((d)localObject3).field_reserved2 - paramAnonymousazh.field_reserved2 < 1800))
                  {
                    w.d("Micromsg.ShakeMusicMgr", "Del the old tv item history, curTime=" + ((d)localObject3).field_reserved2 + ", oldOneCreatedTime=" + paramAnonymousazh.field_reserved2);
                    m.bfk().tM(paramAnonymousazh.field_shakeItemID);
                  }
                  m.bfk().a((d)localObject3, true);
                  ((j)localObject1).e((List)localObject2, 1L);
                  w.d("Micromsg.ShakeMusicMgr", "process get tv OK");
                  i = 1;
                  continue;
                  localObject1 = j.this;
                  localObject2 = new ArrayList();
                  localObject3 = m.b.Gr(paramAnonymousazh);
                  if ((localObject3 != null) && (((m.b)localObject3).oOF != null))
                  {
                    w.d("Micromsg.ShakeMusicMgr", "parese pay: wx_pay_url=" + ((m.b)localObject3).oOF + ", title=" + ((m.b)localObject3).title + ", thumbUrl=" + ((m.b)localObject3).thumbUrl);
                    localObject4 = new d();
                    ((d)localObject4).field_username = ((m.b)localObject3).oOF;
                    ((d)localObject4).field_nickname = ((m.b)localObject3).title;
                    ((d)localObject4).field_sns_bgurl = ((m.b)localObject3).thumbUrl;
                    ((d)localObject4).field_distance = ((m.b)localObject3).nFF;
                    ((d)localObject4).field_type = 9;
                    ((d)localObject4).field_insertBatch = 1;
                    ((d)localObject4).field_lvbuffer = paramAnonymousazh.getBytes();
                    m.bfk().a((d)localObject4, true);
                    ((List)localObject2).add(localObject4);
                    ((j)localObject1).e((List)localObject2, 1L);
                    i = 1;
                  }
                  else
                  {
                    w.w("Micromsg.ShakeMusicMgr", "parse pay fail");
                    ((j)localObject1).e((List)localObject2, 4L);
                    i = 0;
                    continue;
                    localObject1 = j.this;
                    localObject2 = new ArrayList();
                    localObject3 = m.c.Gs(paramAnonymousazh);
                    if ((localObject3 != null) && (((m.c)localObject3).id != null))
                    {
                      w.d("Micromsg.ShakeMusicMgr", "parese pruduct: product_id=" + ((m.c)localObject3).id + ", title=" + ((m.c)localObject3).title + ", thumbUrl=" + ((m.c)localObject3).thumbUrl);
                      localObject4 = new d();
                      ((d)localObject4).field_username = ((m.c)localObject3).id;
                      ((d)localObject4).field_nickname = ((m.c)localObject3).title;
                      ((d)localObject4).field_sns_bgurl = ((m.c)localObject3).thumbUrl;
                      ((d)localObject4).field_type = 10;
                      ((d)localObject4).field_insertBatch = 1;
                      ((d)localObject4).field_lvbuffer = paramAnonymousazh.getBytes();
                      m.bfk().a((d)localObject4, true);
                      ((List)localObject2).add(localObject4);
                      ((j)localObject1).e((List)localObject2, 1L);
                      i = 1;
                    }
                    else
                    {
                      w.w("Micromsg.ShakeMusicMgr", "parse product fail");
                      ((j)localObject1).e((List)localObject2, 4L);
                      i = 0;
                    }
                  }
                }
              }
            }
          }
          label1518:
          g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(5), Long.valueOf(paramAnonymousLong) });
          GMTrace.o(6595056500736L, 49137);
          return;
          label1566:
          if (paramAnonymousBoolean)
          {
            j.this.e(new ArrayList(), 4L);
            g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(4), Integer.valueOf((int)paramAnonymousLong) });
            GMTrace.o(6595056500736L, 49137);
            return;
          }
          j.this.e(new ArrayList(), 4L);
          g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(3), Integer.valueOf((int)paramAnonymousLong) });
          GMTrace.o(6595056500736L, 49137);
          return;
        }
        paramAnonymousazh = new ArrayList();
        if (localObject2 != null)
        {
          localObject1 = new d();
          if ((((bdh)localObject2).uPr != null) && (((bdh)localObject2).uPr.uNP != null)) {
            ((d)localObject1).field_username = ((bdh)localObject2).uPr.uNP.bNS();
          }
          if ((((bdh)localObject2).uPq != null) && (((bdh)localObject2).uPq.uNP != null)) {
            ((d)localObject1).field_nickname = ((bdh)localObject2).uPq.uNP.bNS();
          }
          if ((((bdh)localObject2).uPr != null) && (((bdh)localObject2).uPr.uNP != null)) {
            ((d)localObject1).field_distance = ((bdh)localObject2).uPr.uNP.bNS();
          }
          if ((((bdh)localObject2).usW != null) && (((bdh)localObject2).usW.uNP != null)) {
            ((d)localObject1).field_sns_bgurl = ((bdh)localObject2).usW.uNP.bNS();
          }
          ((d)localObject1).field_type = 4;
          ((d)localObject1).field_insertBatch = 1;
        }
        try
        {
          ((d)localObject1).field_lvbuffer = ((bdh)localObject2).toByteArray();
          m.bfk().a((d)localObject1, true);
          paramAnonymousazh.add(localObject1);
          j.b(j.this).d(paramAnonymousazh, paramAnonymousLong);
          GMTrace.o(6595056500736L, 49137);
          return;
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            w.w("Micromsg.ShakeMusicMgr", "insertItem, to lvbuf error [%s]", new Object[] { localIOException.getLocalizedMessage() });
          }
        }
      }
    });
    GMTrace.o(6598546161664L, 49163);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */