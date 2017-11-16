package com.tencent.mm.plugin.shake.d.a;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.e.c;
import com.tencent.mm.plugin.shake.e.c.a;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.bdl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class l
  extends l.b
{
  public static boolean aDI;
  private static boolean ndo;
  private Context context;
  private boolean eAo;
  public long oOB;
  private a oOz;
  
  static
  {
    GMTrace.i(6598143508480L, 49160);
    ndo = false;
    aDI = false;
    GMTrace.o(6598143508480L, 49160);
  }
  
  public l(Context paramContext, l.a parama)
  {
    super(parama);
    GMTrace.i(6595593371648L, 49141);
    this.eAo = false;
    this.oOz = new a();
    this.context = paramContext;
    aDI = false;
    GMTrace.o(6595593371648L, 49141);
  }
  
  public static void Gp(String paramString)
  {
    GMTrace.i(16032978698240L, 119455);
    if (bg.nm(paramString)) {
      paramString = null;
    }
    while (paramString == null)
    {
      GMTrace.o(16032978698240L, 119455);
      return;
      localObject1 = bh.q(paramString, "tvinfo");
      paramString = null;
      if (localObject1 != null)
      {
        localObject2 = (String)((Map)localObject1).get(".tvinfo.username");
        if (bg.nm((String)localObject2))
        {
          paramString = null;
        }
        else
        {
          paramString = new n();
          paramString.field_username = ((String)localObject2);
          paramString.field_iconurl = bg.nl((String)((Map)localObject1).get(".tvinfo.iconurl"));
          paramString.field_title = bg.nl((String)((Map)localObject1).get(".tvinfo.title"));
          paramString.field_deeplink = bg.nl((String)((Map)localObject1).get(".tvinfo.deeplinkjumpurl"));
          paramString.field_createtime = bg.getLong((String)((Map)localObject1).get(".tvinfo.createtime"), 0L);
        }
      }
    }
    Object localObject2 = m.bfm();
    Object localObject1 = paramString.field_username;
    localObject2 = ((o)localObject2).fTZ.a("shaketvhistory", null, "username=?", new String[] { localObject1 }, null, null, null, 2);
    if (!((Cursor)localObject2).moveToFirst())
    {
      w.i("MicroMsg.ShakeTvHistoryStorage", "get null with username:" + (String)localObject1);
      ((Cursor)localObject2).close();
      localObject1 = null;
    }
    while (localObject1 != null)
    {
      w.i("Micromsg.ShakeTVService", "processShakeTvHistory upate");
      localObject1 = m.bfm();
      localObject2 = paramString.field_username;
      if (bg.nm((String)localObject2))
      {
        w.w("MicroMsg.ShakeTvHistoryStorage", "update fail username null");
        GMTrace.o(16032978698240L, 119455);
        return;
        localObject1 = new n();
        ((n)localObject1).b((Cursor)localObject2);
        ((Cursor)localObject2).close();
      }
      else
      {
        ((o)localObject1).fTZ.update("shaketvhistory", paramString.qL(), "username=?", new String[] { localObject2 });
        GMTrace.o(16032978698240L, 119455);
        return;
      }
    }
    w.i("Micromsg.ShakeTVService", "processShakeTvHistory new insert");
    m.bfm().b(paramString);
    GMTrace.o(16032978698240L, 119455);
  }
  
  public final void beX()
  {
    GMTrace.i(6596264460288L, 49146);
    super.beX();
    this.oOz.qn();
    if (aDI)
    {
      long l = System.currentTimeMillis() - this.oOB;
      w.d("Micromsg.ShakeTVService", "destroyShakeMgr, costTime=%s, isRunning=%s", new Object[] { Long.valueOf(l), Boolean.valueOf(aDI) });
      g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(2), Integer.valueOf((int)l) });
      aDI = false;
    }
    GMTrace.o(6596264460288L, 49146);
  }
  
  public final void e(List<d> paramList, long paramLong)
  {
    GMTrace.i(6596532895744L, 49148);
    if (this.oMx != null) {
      this.oMx.d(paramList, paramLong);
    }
    GMTrace.o(6596532895744L, 49148);
  }
  
  public final void init()
  {
    GMTrace.i(6595861807104L, 49143);
    if (!ndo)
    {
      if (!this.oOz.bfJ())
      {
        w.e("Micromsg.ShakeTVService", "init MusicFingerPrintRecorder false");
        GMTrace.o(6595861807104L, 49143);
        return;
      }
      ndo = true;
    }
    GMTrace.o(6595861807104L, 49143);
  }
  
  public final void pause()
  {
    GMTrace.i(6596130242560L, 49145);
    GMTrace.o(6596130242560L, 49145);
  }
  
  public final void reset()
  {
    GMTrace.i(6595996024832L, 49144);
    GMTrace.o(6595996024832L, 49144);
  }
  
  public final void resume()
  {
    GMTrace.i(6596398678016L, 49147);
    GMTrace.o(6596398678016L, 49147);
  }
  
  public final void start()
  {
    GMTrace.i(6595727589376L, 49142);
    if (this.oMx == null)
    {
      w.w("Micromsg.ShakeTVService", "shakeGetListener == null");
      GMTrace.o(6595727589376L, 49142);
      return;
    }
    if (!(this.context instanceof Activity))
    {
      w.e("Micromsg.ShakeTVService", "context not an Activity");
      this.oMx.d(new ArrayList(), 0L);
      GMTrace.o(6595727589376L, 49142);
      return;
    }
    aDI = true;
    this.oOB = System.currentTimeMillis();
    this.oOz.a(408, new a.a()
    {
      public final void a(azh paramAnonymousazh, long paramAnonymousLong, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6594519629824L, 49133);
        Object localObject3;
        ArrayList localArrayList;
        Object localObject2;
        Object localObject1;
        int i;
        if (paramAnonymousLong > l.this.oOB)
        {
          paramAnonymousLong = System.currentTimeMillis() - paramAnonymousLong;
          if ((paramAnonymousazh == null) || (bg.nm(((bdl)paramAnonymousazh).tWx))) {
            break label1934;
          }
          localObject3 = (bdl)paramAnonymousazh;
          w.w("Micromsg.ShakeTVService", "resCallback Type:%d, xml:%s", new Object[] { Integer.valueOf(((bdl)localObject3).jib), ((bdl)localObject3).tWx });
          localArrayList = null;
          localObject2 = null;
          localObject1 = localObject2;
          paramAnonymousazh = localArrayList;
          if (((bdl)localObject3).tWx != null)
          {
            ((bdl)localObject3).tWx = ((bdl)localObject3).tWx.trim();
            i = ((bdl)localObject3).tWx.indexOf("<tvinfo>");
            if (i <= 0) {
              break label333;
            }
            paramAnonymousazh = ((bdl)localObject3).tWx.substring(0, i);
            localObject1 = ((bdl)localObject3).tWx.substring(i);
          }
          label154:
          l.Gp((String)localObject1);
          i = 0;
          switch (((bdl)localObject3).jib)
          {
          default: 
            w.w("Micromsg.ShakeTVService", "parse unknown type:" + ((bdl)localObject3).jib);
            l.this.e(new ArrayList(), 4L);
            label250:
            if (i != 0) {
              g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(1), Integer.valueOf((int)(System.currentTimeMillis() - l.this.oOB)) });
            }
            break;
          }
        }
        for (;;)
        {
          l.aDI = false;
          GMTrace.o(6594519629824L, 49133);
          return;
          paramAnonymousLong = System.currentTimeMillis() - l.this.oOB;
          break;
          label333:
          if (i == 0)
          {
            localObject1 = ((bdl)localObject3).tWx;
            paramAnonymousazh = localArrayList;
            break label154;
          }
          paramAnonymousazh = ((bdl)localObject3).tWx;
          localObject1 = localObject2;
          break label154;
          localObject1 = l.this;
          localArrayList = new ArrayList();
          localObject2 = m.e.Gu(paramAnonymousazh);
          if ((localObject2 != null) && (((m.e)localObject2).gVf != null))
          {
            w.d("Micromsg.ShakeTVService", "parse url: link=" + ((m.e)localObject2).gVf + ", title=" + ((m.e)localObject2).title + ", thumburl=" + ((m.e)localObject2).thumbUrl);
            localObject3 = new d();
            ((d)localObject3).field_username = ((m.e)localObject2).gVf;
            ((d)localObject3).field_nickname = ((m.e)localObject2).title;
            ((d)localObject3).field_distance = ((m.e)localObject2).ePK;
            ((d)localObject3).field_sns_bgurl = ((m.e)localObject2).thumbUrl;
            ((d)localObject3).field_type = 7;
            ((d)localObject3).field_insertBatch = 1;
            ((d)localObject3).field_lvbuffer = paramAnonymousazh.getBytes();
            m.bfk().a((d)localObject3, true);
            localArrayList.add(localObject3);
            ((l)localObject1).e(localArrayList, 1L);
            i = 1;
            break label250;
          }
          w.w("Micromsg.ShakeTVService", "parse url fail");
          ((l)localObject1).e(localArrayList, 4L);
          i = 0;
          break label250;
          localObject1 = l.this;
          paramAnonymousazh = m.f.Gv(paramAnonymousazh);
          localArrayList = new ArrayList();
          if ((paramAnonymousazh != null) && (paramAnonymousazh.userName != null))
          {
            w.d("Micromsg.ShakeTVService", "parse user: username=" + paramAnonymousazh.userName + ", nickname=" + paramAnonymousazh.aDn + ", showchat=" + paramAnonymousazh.oOH);
            localObject2 = new d();
            ((d)localObject2).field_username = paramAnonymousazh.userName;
            ((d)localObject2).field_nickname = paramAnonymousazh.aDn;
            ((d)localObject2).field_type = 6;
            ((d)localObject2).field_insertBatch = 1;
            ((d)localObject2).field_distance = paramAnonymousazh.oOH;
            m.bfk().a((d)localObject2, true);
            localArrayList.add(localObject2);
            ((l)localObject1).e(localArrayList, 1L);
            i = 1;
            break label250;
          }
          w.w("Micromsg.ShakeTVService", "parse user fail");
          ((l)localObject1).e(localArrayList, 4L);
          i = 0;
          break label250;
          localObject1 = l.this;
          localArrayList = new ArrayList();
          if ((paramAnonymousazh == null) || (!paramAnonymousazh.startsWith("<tv")))
          {
            if (paramAnonymousazh == null) {}
            for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
            {
              w.e("Micromsg.ShakeTVService", "wrong args, xml == null ? [%s]", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
              ((l)localObject1).e(localArrayList, 2L);
              i = 0;
              break;
            }
          }
          localObject3 = c.Gx(paramAnonymousazh);
          if (localObject3 == null)
          {
            w.e("Micromsg.ShakeTVService", "shakeTV resCallback xml error");
            l.aDI = false;
            ((l)localObject1).e(localArrayList, 4L);
            i = 0;
            break label250;
          }
          localObject2 = new d();
          ((d)localObject2).field_username = bg.nl(((c.a)localObject3).field_subtitle);
          ((d)localObject2).field_nickname = bg.nl(((c.a)localObject3).field_topic);
          ((d)localObject2).field_distance = bg.nl(((c.a)localObject3).field_title);
          if (((c.a)localObject3).field_thumburl != null) {
            ((d)localObject2).field_sns_bgurl = ((c.a)localObject3).field_thumburl;
          }
          ((d)localObject2).field_type = 8;
          ((d)localObject2).field_insertBatch = 1;
          ((d)localObject2).field_lvbuffer = paramAnonymousazh.getBytes();
          ((d)localObject2).field_reserved2 = ((int)bg.Pu());
          localArrayList.add(localObject2);
          paramAnonymousazh = m.bfk().bfa();
          if ((paramAnonymousazh.field_type == 8) && (((d)localObject2).field_distance.equals(paramAnonymousazh.field_distance)) && (((d)localObject2).field_nickname.equals(paramAnonymousazh.field_nickname)) && (((d)localObject2).field_reserved2 - paramAnonymousazh.field_reserved2 < 1800))
          {
            w.d("Micromsg.ShakeTVService", "Del the old tv item history, curTime=" + ((d)localObject2).field_reserved2 + ", oldOneCreatedTime=" + paramAnonymousazh.field_reserved2);
            m.bfk().tM(paramAnonymousazh.field_shakeItemID);
          }
          m.bfk().a((d)localObject2, true);
          ((l)localObject1).e(localArrayList, 1L);
          w.d("Micromsg.ShakeTVService", "process get tv OK");
          i = 1;
          break label250;
          localObject1 = l.this;
          localArrayList = new ArrayList();
          localObject2 = m.b.Gr(paramAnonymousazh);
          if ((localObject2 != null) && (((m.b)localObject2).oOF != null))
          {
            w.d("Micromsg.ShakeTVService", "parese pay: wx_pay_url=" + ((m.b)localObject2).oOF + ", title=" + ((m.b)localObject2).title + ", thumbUrl=" + ((m.b)localObject2).thumbUrl);
            localObject3 = new d();
            ((d)localObject3).field_username = ((m.b)localObject2).oOF;
            ((d)localObject3).field_nickname = ((m.b)localObject2).title;
            ((d)localObject3).field_sns_bgurl = ((m.b)localObject2).thumbUrl;
            ((d)localObject3).field_distance = ((m.b)localObject2).nFF;
            ((d)localObject3).field_type = 9;
            ((d)localObject3).field_insertBatch = 1;
            ((d)localObject3).field_lvbuffer = paramAnonymousazh.getBytes();
            m.bfk().a((d)localObject3, true);
            localArrayList.add(localObject3);
            ((l)localObject1).e(localArrayList, 1L);
            i = 1;
            break label250;
          }
          w.w("Micromsg.ShakeTVService", "parse pay fail");
          ((l)localObject1).e(localArrayList, 4L);
          i = 0;
          break label250;
          localObject1 = l.this;
          localArrayList = new ArrayList();
          localObject2 = m.c.Gs(paramAnonymousazh);
          if ((localObject2 != null) && (((m.c)localObject2).id != null))
          {
            w.d("Micromsg.ShakeTVService", "parese pruduct: product_id=" + ((m.c)localObject2).id + ", title=" + ((m.c)localObject2).title + ", thumbUrl=" + ((m.c)localObject2).thumbUrl);
            localObject3 = new d();
            ((d)localObject3).field_username = ((m.c)localObject2).id;
            ((d)localObject3).field_nickname = ((m.c)localObject2).title;
            ((d)localObject3).field_sns_bgurl = ((m.c)localObject2).thumbUrl;
            ((d)localObject3).field_type = 10;
            ((d)localObject3).field_insertBatch = 1;
            ((d)localObject3).field_lvbuffer = paramAnonymousazh.getBytes();
            m.bfk().a((d)localObject3, true);
            localArrayList.add(localObject3);
            ((l)localObject1).e(localArrayList, 1L);
            i = 1;
            break label250;
          }
          w.w("Micromsg.ShakeTVService", "parse product fail");
          ((l)localObject1).e(localArrayList, 4L);
          i = 0;
          break label250;
          localObject1 = l.this;
          localArrayList = new ArrayList();
          localObject2 = m.d.Gt(paramAnonymousazh);
          if ((localObject2 != null) && (!bg.nm(((m.d)localObject2).oOG)))
          {
            localObject3 = new d();
            ((d)localObject3).field_username = ((m.d)localObject2).oOG;
            ((d)localObject3).field_nickname = ((m.d)localObject2).title;
            ((d)localObject3).field_distance = ((m.d)localObject2).username;
            ((d)localObject3).field_sns_bgurl = ((m.d)localObject2).thumbUrl;
            ((d)localObject3).field_type = 12;
            ((d)localObject3).field_insertBatch = 1;
            ((d)localObject3).field_lvbuffer = paramAnonymousazh.getBytes();
            m.bfk().a((d)localObject3, true);
            localArrayList.add(localObject3);
            ((l)localObject1).e(localArrayList, 1L);
            i = 1;
            break label250;
          }
          w.w("Micromsg.ShakeTVService", "parse TempSession fail");
          ((l)localObject1).e(localArrayList, 4L);
          i = 0;
          break label250;
          localObject1 = l.this;
          localArrayList = new ArrayList();
          localObject2 = m.a.Gq(paramAnonymousazh);
          if ((localObject2 != null) && (!bg.nm(((m.a)localObject2).path)))
          {
            localObject3 = new d();
            ((d)localObject3).field_username = ((m.a)localObject2).username;
            ((d)localObject3).field_nickname = ((m.a)localObject2).title;
            ((d)localObject3).field_reserved3 = ((m.a)localObject2).path;
            ((d)localObject3).field_sns_bgurl = ((m.a)localObject2).thumbUrl;
            ((d)localObject3).field_reserved2 = ((m.a)localObject2).version;
            ((d)localObject3).field_type = 13;
            ((d)localObject3).field_insertBatch = 1;
            ((d)localObject3).field_lvbuffer = paramAnonymousazh.getBytes();
            m.bfk().a((d)localObject3, true);
            localArrayList.add(localObject3);
            ((l)localObject1).e(localArrayList, 1L);
            i = 1;
            break label250;
          }
          w.w("Micromsg.ShakeTVService", "parse appBrand fail");
          ((l)localObject1).e(localArrayList, 4L);
          i = 0;
          break label250;
          g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(5), Long.valueOf(paramAnonymousLong) });
          continue;
          label1934:
          if (paramAnonymousBoolean)
          {
            l.this.e(new ArrayList(), 4L);
            g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(4), Integer.valueOf((int)paramAnonymousLong) });
          }
          else
          {
            l.this.e(new ArrayList(), 4L);
            g.ork.i(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(3), Integer.valueOf((int)paramAnonymousLong) });
          }
        }
      }
    });
    GMTrace.o(6595727589376L, 49142);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */