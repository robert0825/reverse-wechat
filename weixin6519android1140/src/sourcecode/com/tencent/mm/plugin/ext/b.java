package com.tencent.mm.plugin.ext;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.qq.wx.voice.embed.recognizer.Grammar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.g.a.eq;
import com.tencent.mm.g.a.ey;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.i.a;
import com.tencent.mm.pluginsdk.model.i.b;
import com.tencent.mm.protocal.c.aeo;
import com.tencent.mm.protocal.c.bmr;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class b
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  public static boolean kMr;
  private String fYU;
  m.b kAQ;
  private final long kMb;
  private com.tencent.mm.storage.t kMc;
  private ax kMd;
  private be kMe;
  private a kMf;
  private b kMg;
  public HashMap<String, Integer> kMh;
  private c.a kMi;
  i.a kMj;
  private ae kMk;
  public LinkedList<String> kMl;
  private final long kMm;
  public ae kMn;
  private j.a kMo;
  public boolean kMp;
  public boolean kMq;
  
  static
  {
    GMTrace.i(5717943648256L, 42602);
    int i = com.tencent.mm.compatible.d.l.sK();
    try
    {
      if (!Build.CPU_ABI.contains("armeabi")) {
        w.e("hakon SilkCodec", "x86 machines not supported.");
      }
      for (;;)
      {
        HashMap localHashMap = new HashMap();
        fIv = localHashMap;
        localHashMap.put(Integer.valueOf("OPENMSGLISTENER_TABLE".hashCode()), new g.d()
        {
          public final String[] rf()
          {
            GMTrace.i(5718212083712L, 42604);
            String[] arrayOfString = ax.fTX;
            GMTrace.o(5718212083712L, 42604);
            return arrayOfString;
          }
        });
        fIv.put(Integer.valueOf("USEROPENIDINAPP_TABLE".hashCode()), new g.d()
        {
          public final String[] rf()
          {
            GMTrace.i(5743176581120L, 42790);
            String[] arrayOfString = be.fTX;
            GMTrace.o(5743176581120L, 42790);
            return arrayOfString;
          }
        });
        kMr = false;
        GMTrace.o(5717943648256L, 42602);
        return;
        if ((i & 0x400) == 0) {
          break;
        }
        k.b("wechatvoicesilk_v7a", b.class.getClassLoader());
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("hakon SilkCodec", "load library failed!");
        continue;
        if ((i & 0x200) != 0) {
          k.b("wechatvoicesilk", b.class.getClassLoader());
        } else {
          w.e("hakon SilkCodec", "load library failed! silk don't support armv5!!!!");
        }
      }
    }
  }
  
  public b()
  {
    GMTrace.i(5714722422784L, 42578);
    this.kMb = 1600L;
    this.kMh = new HashMap();
    this.kMi = new c.a()
    {
      public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.c arg1, c.c paramAnonymousc1)
      {
        GMTrace.i(5711366979584L, 42553);
        if ((??? == null) || (paramAnonymousc1 == null) || (paramAnonymousc1.mVa == null))
        {
          w.e("MicroMsg.SubCoreExt", "onMsgChange, wrong args");
          GMTrace.o(5711366979584L, 42553);
          return;
        }
        for (;;)
        {
          int i;
          synchronized (b.this)
          {
            Object localObject = b.avj().bUk();
            if (localObject == null)
            {
              w.i("MicroMsg.SubCoreExt", "onMsgChange onNotifyChange getValidOpenMsgListener cu == null");
              GMTrace.o(5711366979584L, 42553);
              return;
            }
            w.d("MicroMsg.SubCoreExt", "onMsgChange onNotifyChange listener count = %s", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
            if (((Cursor)localObject).getCount() <= 0)
            {
              ((Cursor)localObject).close();
              w.i("MicroMsg.SubCoreExt", "onMsgChange onNotifyChange cu.getCount() <= 0");
              GMTrace.o(5711366979584L, 42553);
              return;
            }
            ((Cursor)localObject).close();
            i = 0;
            if (i < paramAnonymousc1.mVa.size())
            {
              localObject = (au)paramAnonymousc1.mVa.get(i);
              if ((localObject == null) || (((ce)localObject).field_isSend != 0) || (((ce)localObject).field_status == 4) || (((ce)localObject).field_type == 9999) || (((ce)localObject).field_type == 10000) || (s.gn(((ce)localObject).field_talker))) {
                break label405;
              }
              Integer localInteger = (Integer)b.this.kMh.get(((ce)localObject).field_talker);
              if (localInteger == null)
              {
                b.this.kMh.put(((ce)localObject).field_talker, Integer.valueOf(1));
                w.d("MicroMsg.SubCoreExt", "onMsgChange %s, %d", new Object[] { ((ce)localObject).field_talker, Integer.valueOf(1) });
              }
              else
              {
                b.this.kMh.put(((ce)localObject).field_talker, Integer.valueOf(localInteger.intValue() + 1));
                w.d("MicroMsg.SubCoreExt", "onMsgChange %s, %d", new Object[] { ((ce)localObject).field_talker, Integer.valueOf(localInteger.intValue() + 1) });
              }
            }
          }
          if (b.this.kMh.size() > 0) {
            b.this.avn();
          }
          for (;;)
          {
            GMTrace.o(5711366979584L, 42553);
            return;
            w.i("MicroMsg.SubCoreExt", "notifyMsgUsers.size < 1");
          }
          label405:
          i += 1;
        }
      }
    };
    this.kMj = new i.a()
    {
      public final void a(com.tencent.mm.pluginsdk.model.l paramAnonymousl)
      {
        GMTrace.i(5711635415040L, 42555);
        if (paramAnonymousl == null)
        {
          GMTrace.o(5711635415040L, 42555);
          return;
        }
        Object localObject1;
        int i;
        if (paramAnonymousl.kzP == null)
        {
          localObject1 = null;
          localObject1 = ((aeo)localObject1).uum.iterator();
          i = 0;
        }
        for (;;)
        {
          if (!((Iterator)localObject1).hasNext()) {
            break label283;
          }
          Object localObject2 = (bmr)((Iterator)localObject1).next();
          w.v("MicroMsg.SubCoreExt", "AppId[%s], UserName[%s], Xml[%s]", new Object[] { paramAnonymousl.tmY, ((bmr)localObject2).jhi, ((bmr)localObject2).uWV });
          if ((!bg.nm(((bmr)localObject2).jhi)) && (!bg.nm(((bmr)localObject2).uWV)))
          {
            at.AR();
            Object localObject3 = com.tencent.mm.y.c.yK().TC(((bmr)localObject2).jhi);
            if ((localObject3 == null) || ((int)((com.tencent.mm.l.a)localObject3).fTq <= 0))
            {
              w.e("MicroMsg.SubCoreExt", "contact is null");
              continue;
              localObject1 = (aeo)paramAnonymousl.kzP.gtD.gtK;
              break;
            }
            if (((x)localObject3).bSA())
            {
              w.w("MicroMsg.SubCoreExt", "isBizContact");
            }
            else
            {
              localObject3 = com.tencent.mm.pluginsdk.model.i.Ok(((bmr)localObject2).uWV);
              if ((localObject3 != null) && (!bg.nm(((i.b)localObject3).tmS)))
              {
                w.v("MicroMsg.SubCoreExt", "AppId[%s], openId[%s]", new Object[] { paramAnonymousl.tmY, ((i.b)localObject3).tmS });
                localObject2 = new bd(paramAnonymousl.tmY, ((bmr)localObject2).jhi, ((i.b)localObject3).tmS);
                b.avk().a((bd)localObject2);
                i = 1;
              }
            }
          }
        }
        label283:
        if (i != 0) {
          b.this.avn();
        }
        GMTrace.o(5711635415040L, 42555);
      }
    };
    this.kMk = new ae(Looper.getMainLooper())
    {
      @JgMethodChecked(author=20, fComment="checked", lastDate="20140514", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
      public final void handleMessage(Message arg1)
      {
        GMTrace.i(5742371274752L, 42784);
        if ((ab.getContext() == null) || (!at.AU()))
        {
          w.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong status");
          GMTrace.o(5742371274752L, 42784);
          return;
        }
        Cursor localCursor = b.avj().bUk();
        if (localCursor == null)
        {
          w.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler getValidOpenMsgListener cu == null");
          GMTrace.o(5742371274752L, 42784);
          return;
        }
        w.d("MicroMsg.SubCoreExt", "notifyMsgChangeHandler listener count = %s", new Object[] { Integer.valueOf(localCursor.getCount()) });
        if (localCursor.getCount() <= 0)
        {
          localCursor.close();
          w.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler cu.getCount() <= 0");
          GMTrace.o(5742371274752L, 42784);
          return;
        }
        LinkedList localLinkedList;
        ArrayList localArrayList;
        try
        {
          if (!localCursor.moveToFirst()) {
            break label326;
          }
          HashMap localHashMap = new HashMap();
          synchronized (b.this)
          {
            localHashMap.putAll(b.this.kMh);
            b.this.kMh.clear();
            localLinkedList = new LinkedList();
            localArrayList = new ArrayList();
            if (localHashMap.entrySet() == null)
            {
              w.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler waitForNotify.entrySet() == null");
              GMTrace.o(5742371274752L, 42784);
              return;
            }
          }
          localaw = new aw();
        }
        catch (Exception ???)
        {
          w.e("MicroMsg.SubCoreExt", "Exception in handleMessage, %s", new Object[] { ???.getMessage() });
          if (localCursor != null) {
            localCursor.close();
          }
          GMTrace.o(5742371274752L, 42784);
          return;
        }
        aw localaw;
        localaw.b(localCursor);
        if ((bg.nm(localaw.field_appId)) || (bg.nm(localaw.field_packageName)))
        {
          w.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong msgListener, appid = %s, package = %s", new Object[] { localaw.field_appId, localaw.field_packageName });
          label317:
          if (!localCursor.moveToNext())
          {
            label326:
            localCursor.close();
            GMTrace.o(5742371274752L, 42784);
          }
        }
        else
        {
          Object localObject2 = ((HashMap)localObject1).entrySet().iterator();
          Object localObject3;
          Object localObject4;
          while (((Iterator)localObject2).hasNext())
          {
            ??? = (Map.Entry)((Iterator)localObject2).next();
            localObject3 = bg.nl((String)???.getKey());
            localObject4 = (Integer)???.getValue();
            at.AR();
            ??? = com.tencent.mm.y.c.yP().TO((String)localObject3);
            if ((??? != null) && (!bg.nm(???.field_username)) && (???.field_unReadCount <= 0))
            {
              w.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler no unread in conversation");
            }
            else if ((!s.gn((String)localObject3)) && (!s.eb((String)localObject3)) && (!s.fD((String)localObject3)))
            {
              Object localObject5 = b.avk();
              ??? = localaw.field_appId;
              if ((??? == null) || (???.length() <= 0) || (localObject3 == null)) {
                break label1150;
              }
              if (((String)localObject3).length() <= 0)
              {
                break label1150;
                label507:
                if ((??? != null) && (!bg.nm(???.field_openId)) && (!bg.nm(???.field_username))) {
                  break label724;
                }
                w.d("MicroMsg.SubCoreExt", "notifyMsgChangeHandler openId is null, go get it.");
                ??? = (Integer)b.this.kMh.get(localObject3);
                if (??? != null) {
                  break label695;
                }
                b.this.kMh.put(localObject3, localObject4);
              }
              for (;;)
              {
                localLinkedList.add(localObject3);
                break;
                localObject5 = ((be)localObject5).fTZ.a("UserOpenIdInApp", null, "appId=? and username=? ", new String[] { bg.nk(???), bg.nk((String)localObject3) }, null, null, null, 2);
                if (!((Cursor)localObject5).moveToFirst())
                {
                  w.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with appId-%s, username-%s:", new Object[] { ???, localObject3 });
                  ((Cursor)localObject5).close();
                  ??? = null;
                  break label507;
                }
                ??? = new bd();
                ???.b((Cursor)localObject5);
                ((Cursor)localObject5).close();
                break label507;
                label695:
                b.this.kMh.put(localObject3, Integer.valueOf(???.intValue() + ((Integer)localObject4).intValue()));
              }
              label724:
              w.v("MicroMsg.SubCoreExt", "username[%s], appId[%s], openId[%s]", new Object[] { ???.field_username, ???.field_appId, ???.field_openId });
              localArrayList.add(String.format("%s,%s,%s", new Object[] { ???.field_openId, localObject4, Long.valueOf(System.currentTimeMillis() - 1600L) }));
            }
          }
          if (localLinkedList.size() > 0)
          {
            w.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler doGetGetUserInfoInApp");
            localObject4 = b.this;
            ??? = localaw.field_appId;
            if ((!bg.nm(???)) && (localLinkedList.size() > 0))
            {
              localObject2 = com.tencent.mm.pluginsdk.model.i.bJf();
              localObject3 = ab.getContext();
              localObject4 = ((b)localObject4).kMj;
              w.d("MicroMsg.GetUserInfoInAppLogic", "getGetUserInfoInApp");
              if (!com.tencent.mm.pluginsdk.model.i.tmP) {
                ((com.tencent.mm.pluginsdk.model.i)localObject2).bJg();
              }
              if ((at.AU()) && (localObject3 != null))
              {
                if (localLinkedList.size() != 0) {
                  break label940;
                }
                w.d("MicroMsg.GetUserInfoInAppLogic", "userNameList empty");
              }
            }
          }
          while (localArrayList.size() <= 0)
          {
            localCursor.close();
            w.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler userDataList.size() <= 0");
            GMTrace.o(5742371274752L, 42784);
            return;
            label940:
            ((com.tencent.mm.pluginsdk.model.i)localObject2).tmR = ((i.a)localObject4);
            ??? = new com.tencent.mm.pluginsdk.model.l(???, localLinkedList);
            an.aGk();
            com.tencent.mm.pluginsdk.model.app.d.a(14, ???);
          }
          if (localaw.field_status != 1) {
            break label1155;
          }
        }
        label1150:
        label1155:
        for (int i = 1;; i = 0)
        {
          if (i == 0)
          {
            w.w("MicroMsg.SubCoreExt", "invalid msgListener, appid = %s, package = %s", new Object[] { localaw.field_appId, localaw.field_packageName });
            break label317;
          }
          if ((bg.nm(localaw.field_appId)) || (bg.nm(localaw.field_packageName))) {
            break label317;
          }
          w.i("MicroMsg.SubCoreExt", "notify app, appId = %s, package = %s", new Object[] { localaw.field_appId, localaw.field_packageName });
          ??? = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_NOTIFY_MSG");
          ???.addCategory("com.tencent.mm.category." + localaw.field_packageName);
          com.tencent.mm.compatible.a.a.a(12, new a.a()
          {
            public final void run()
            {
              GMTrace.i(5744250322944L, 42798);
              paramAnonymousMessage.setFlags(32);
              GMTrace.o(5744250322944L, 42798);
            }
          });
          ???.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "NEW_MESSAGE");
          ???.putStringArrayListExtra("EXTRA_EXT_OPEN_USER_DATA", localArrayList);
          ab.getContext().sendBroadcast(???);
          break label317;
          break;
          ??? = null;
          break label507;
        }
      }
    };
    this.kMl = new LinkedList();
    this.kMm = 60L;
    this.kMn = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(5744518758400L, 42800);
        Object localObject1;
        Object localObject2;
        label142:
        do
        {
          for (;;)
          {
            try
            {
              i = b.this.kMl.size();
              if (i <= 0)
              {
                GMTrace.o(5744518758400L, 42800);
                return;
              }
              paramAnonymousMessage = b.this.kMl.iterator();
              if (!paramAnonymousMessage.hasNext()) {
                break label365;
              }
              localObject1 = (String)paramAnonymousMessage.next();
              if ("*".equals(localObject1)) {
                continue;
              }
              localObject2 = com.tencent.mm.pluginsdk.model.app.g.aP((String)localObject1, false);
              if (localObject2 == null)
              {
                w.w("MicroMsg.SubCoreExt", "appInfo is null");
                continue;
              }
              if (!bg.nm(((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId)) {
                break label142;
              }
            }
            catch (Exception paramAnonymousMessage)
            {
              w.e("MicroMsg.SubCoreExt", "exception in onAppInfoStgChange, %s", new Object[] { paramAnonymousMessage.getMessage() });
              GMTrace.o(5744518758400L, 42800);
              return;
            }
            w.w("MicroMsg.SubCoreExt", "appId is null");
            continue;
            w.d("MicroMsg.SubCoreExt", "onAppInfoStgChange, notify[%s], appFlag[%s], id[%s]", new Object[] { localObject1, Integer.valueOf(((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appInfoFlag), ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId });
            localObject1 = b.avj().Us(((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId);
            if (localObject1 != null) {
              break;
            }
            w.w("MicroMsg.SubCoreExt", "openMsgListener is null, appId = %s", new Object[] { ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId });
          }
          if (!com.tencent.mm.pluginsdk.model.app.g.i((com.tencent.mm.pluginsdk.model.app.f)localObject2)) {
            break;
          }
        } while (((aw)localObject1).field_status == 1);
        ax localax;
        for (((aw)localObject1).field_status = 1;; ((aw)localObject1).field_status = 0)
        {
          localax = b.avj();
          localObject2 = ((com.tencent.mm.pluginsdk.model.app.f)localObject2).field_appId;
          if ((!bg.nm((String)localObject2)) && (localObject1 != null) && (!bg.nm(((aw)localObject1).field_appId))) {
            break label294;
          }
          w.w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
          break;
          if (((aw)localObject1).field_status == 0) {
            break;
          }
        }
        label294:
        ContentValues localContentValues = ((aw)localObject1).qL();
        if (localContentValues.size() > 0) {}
        for (int i = localax.fTZ.update("OpenMsgListener", localContentValues, "appId=?", new String[] { bg.nk((String)localObject2) });; i = 0)
        {
          w.d("MicroMsg.OpenMsgListenerStorage", "update: id=%s, ret=%s ", new Object[] { ((aw)localObject1).field_appId, Integer.valueOf(i) });
          break;
          label365:
          b.this.kMl.clear();
          GMTrace.o(5744518758400L, 42800);
          return;
        }
      }
    };
    this.kMo = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(5741834403840L, 42780);
        if (!b.this.kMl.contains(paramAnonymousString)) {
          b.this.kMl.add(paramAnonymousString);
        }
        b.this.kMn.removeMessages(0);
        b.this.kMn.sendEmptyMessageDelayed(0, 60L);
        GMTrace.o(5741834403840L, 42780);
      }
    };
    this.kAQ = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(5743445016576L, 42792);
        if ((paramAnonymousObject == null) || (!(paramAnonymousObject instanceof String)))
        {
          w.d("MicroMsg.SubCoreExt", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousm, paramAnonymousObject });
          GMTrace.o(5743445016576L, 42792);
          return;
        }
        if (!at.AU())
        {
          w.i("MicroMsg.SubCoreExt", "onNotifyChange acc not ready");
          GMTrace.o(5743445016576L, 42792);
          return;
        }
        at.AR();
        if (paramAnonymousm == com.tencent.mm.y.c.yK()) {
          b.this.eg(false);
        }
        GMTrace.o(5743445016576L, 42792);
      }
    };
    this.kMp = true;
    this.kMq = false;
    GMTrace.o(5714722422784L, 42578);
  }
  
  public static b avh()
  {
    GMTrace.i(5714856640512L, 42579);
    b localb2 = (b)at.AK().gZ("plugin.ext");
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = new b();
      at.AK().a("plugin.ext", localb1);
    }
    GMTrace.o(5714856640512L, 42579);
    return localb1;
  }
  
  public static com.tencent.mm.storage.t avi()
  {
    GMTrace.i(5714990858240L, 42580);
    h.xw().wG();
    if (avh().kMc == null)
    {
      localObject = avh();
      at.AR();
      ((b)localObject).kMc = new com.tencent.mm.storage.t(com.tencent.mm.y.c.yH());
    }
    Object localObject = avh().kMc;
    GMTrace.o(5714990858240L, 42580);
    return (com.tencent.mm.storage.t)localObject;
  }
  
  public static ax avj()
  {
    GMTrace.i(5715125075968L, 42581);
    h.xw().wG();
    if (avh().kMd == null)
    {
      localObject = avh();
      at.AR();
      ((b)localObject).kMd = new ax(com.tencent.mm.y.c.yH());
    }
    Object localObject = avh().kMd;
    GMTrace.o(5715125075968L, 42581);
    return (ax)localObject;
  }
  
  public static be avk()
  {
    GMTrace.i(5715259293696L, 42582);
    h.xw().wG();
    if (avh().kMe == null)
    {
      localObject = avh();
      at.AR();
      ((b)localObject).kMe = new be(com.tencent.mm.y.c.yH());
    }
    Object localObject = avh().kMe;
    GMTrace.o(5715259293696L, 42582);
    return (be)localObject;
  }
  
  public static String avl()
  {
    GMTrace.i(5715930382336L, 42587);
    String str = avh().fYU + "image/ext/pcm";
    GMTrace.o(5715930382336L, 42587);
    return str;
  }
  
  public static void avm()
  {
    GMTrace.i(5716064600064L, 42588);
    Object localObject = (String)avi().get(w.a.vuV, null);
    w.i("MicroMsg.SubCoreExt", "sendSportBroadcast pkgNames = " + (String)localObject);
    if (localObject != null)
    {
      localObject = ((String)localObject).split(";");
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        String str = localObject[i];
        Intent localIntent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP");
        localIntent.setPackage(str);
        com.tencent.mm.compatible.a.a.a(12, new a.a()
        {
          public final void run()
          {
            GMTrace.i(5742102839296L, 42782);
            this.val$intent.setFlags(32);
            GMTrace.o(5742102839296L, 42782);
          }
        });
        localIntent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "SPORT_MESSAGE");
        ab.getContext().sendBroadcast(localIntent);
        i += 1;
      }
    }
    GMTrace.o(5716064600064L, 42588);
  }
  
  public static x bU(long paramLong)
  {
    GMTrace.i(5716333035520L, 42590);
    if ((at.AU()) && (paramLong > 0L))
    {
      at.AR();
      x localx = com.tencent.mm.y.c.yK().eQ(paramLong);
      GMTrace.o(5716333035520L, 42590);
      return localx;
    }
    GMTrace.o(5716333035520L, 42590);
    return null;
  }
  
  public static void bV(long paramLong)
  {
    GMTrace.i(5716467253248L, 42591);
    if (paramLong <= 0L)
    {
      GMTrace.o(5716467253248L, 42591);
      return;
    }
    try
    {
      at.AR();
      if (com.tencent.mm.y.c.yM().cP(paramLong))
      {
        at.AR();
        com.tencent.mm.plugin.messenger.foundation.a.a.c localc = com.tencent.mm.y.c.yM();
        at.AR();
        localc.Q(com.tencent.mm.y.c.yM().cM(paramLong));
        GMTrace.o(5716467253248L, 42591);
        return;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SubCoreExt", localException.getMessage());
      w.printErrStackTrace("MicroMsg.SubCoreExt", localException, "", new Object[0]);
      GMTrace.o(5716467253248L, 42591);
      return;
    }
    w.e("MicroMsg.SubCoreExt", "msgId is out of range, " + paramLong);
    GMTrace.o(5716467253248L, 42591);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5715661946880L, 42585);
    Object localObject = new eq();
    ((eq)localObject).eGn.op = 1;
    if (!com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject)) {
      w.e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountPostReset");
    }
    com.tencent.mm.pluginsdk.model.i.bJf().bJg();
    at.AR();
    com.tencent.mm.y.c.yM().a(this.kMi, null);
    if (this.kMf == null) {
      this.kMf = new a();
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.kMf);
    if (this.kMg == null) {
      this.kMg = new b();
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.kMg);
    localObject = an.aWy();
    if (localObject != null) {
      ((com.tencent.mm.pluginsdk.model.app.i)localObject).c(this.kMo);
    }
    localObject = ab.bPV();
    this.kMq = ((SharedPreferences)localObject).getBoolean("hasTryToInitVoiceControlData", false);
    kMr = ((SharedPreferences)localObject).getBoolean("hasCallVoiceControlApi", false);
    w.i("MicroMsg.SubCoreExt", "onAccountPostReset,hasTryToInit:%s,hasCallApi:%s", new Object[] { Boolean.valueOf(this.kMq), Boolean.valueOf(kMr) });
    at.AR();
    com.tencent.mm.y.c.yK().a(this.kAQ);
    eg(true);
    com.tencent.mm.plugin.ext.c.c.avC();
    GMTrace.o(5715661946880L, 42585);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5715527729152L, 42584);
    at.AR();
    this.fYU = com.tencent.mm.y.c.zo();
    File localFile = new File(this.fYU);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    localFile = new File(this.fYU + "image/ext/pcm");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(5715527729152L, 42584);
  }
  
  public final void avn()
  {
    GMTrace.i(5716601470976L, 42592);
    this.kMk.removeMessages(0);
    this.kMk.sendEmptyMessageDelayed(0, 1600L);
    GMTrace.o(5716601470976L, 42592);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5716198817792L, 42589);
    GMTrace.o(5716198817792L, 42589);
  }
  
  public final void eg(boolean paramBoolean)
  {
    GMTrace.i(5716735688704L, 42593);
    if (!this.kMp)
    {
      GMTrace.o(5716735688704L, 42593);
      return;
    }
    if ((paramBoolean) && (this.kMq))
    {
      w.i("MicroMsg.SubCoreExt", "fromStartApp and already try to init");
      GMTrace.o(5716735688704L, 42593);
      return;
    }
    if ((!paramBoolean) && (!kMr))
    {
      GMTrace.o(5716735688704L, 42593);
      return;
    }
    w.i("MicroMsg.SubCoreExt", "initLocalVoiceControl,fromStartApp:%s,hasTryToInit:%s,hasCallApi:%s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.kMq), Boolean.valueOf(kMr) });
    this.kMp = false;
    at.xB().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5742639710208L, 42786);
        Object localObject2;
        int i;
        int j;
        try
        {
          localObject2 = com.tencent.mm.k.g.ut().getValue("VoiceRecognizeSprSoMD5");
          localObject3 = com.tencent.mm.k.g.ut().getValue("VoiceRecognizeSprDataMD5");
          if ((localObject2 == null) || (localObject3 == null))
          {
            w.i("MicroMsg.SubCoreExt", "error mMd5So:%s,  mMd5Data:%s", new Object[] { localObject2, localObject3 });
            b.this.kMp = true;
            GMTrace.o(5742639710208L, 42786);
            return;
          }
          Object localObject1 = "/system/lib/";
          if (Build.VERSION.SDK_INT >= 24) {
            localObject1 = "/vendor/lib/";
          }
          w.i("MicroMsg.SubCoreExt", "mMd5So:%s,  mMd5Data:%s,  mSoPath:%s", new Object[] { localObject2, localObject3, localObject1 });
          l = System.currentTimeMillis();
          Object localObject5 = com.qq.wx.voice.embed.recognizer.b.a.aDm;
          Object localObject4 = ab.getContext();
          localObject5 = ((com.qq.wx.voice.embed.recognizer.b)localObject5).aDl;
          if (((com.qq.wx.voice.embed.recognizer.e)localObject5).d) {
            i = 0;
          }
          for (;;)
          {
            localObject1 = ab.bPV();
            w.i("MicroMsg.SubCoreExt", "checkFiles ret:%s,use time:%s", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
            if (i != 0) {
              break label704;
            }
            l = System.currentTimeMillis();
            localObject3 = new LinkedList();
            ((List)localObject3).add("tmessage");
            ((List)localObject3).add("officialaccounts");
            ((List)localObject3).add("helper_entry");
            at.AR();
            localObject2 = com.tencent.mm.y.c.yS().CB("@t.qq.com");
            if (localObject2 != null) {
              ((List)localObject3).add(((ay)localObject2).name);
            }
            localObject2 = new ArrayList();
            at.AR();
            localObject3 = com.tencent.mm.y.c.yK().a("@all.contact.android", null, (List)localObject3, null, true, true);
            if (localObject3 != null) {
              break;
            }
            w.w("MicroMsg.SubCoreExt", "initLocalVoiceControl cu is null");
            b.this.kMp = true;
            GMTrace.o(5742639710208L, 42786);
            return;
            j = ((com.qq.wx.voice.embed.recognizer.e)localObject5).aDs.checkFiles((Context)localObject4, (String)localObject1, (String)localObject2, (String)localObject3);
            i = j;
            if (j >= 0)
            {
              ((com.qq.wx.voice.embed.recognizer.e)localObject5).d = true;
              i = 0;
            }
          }
          if (((Cursor)localObject3).moveToFirst()) {
            while (!((Cursor)localObject3).isAfterLast())
            {
              localObject4 = new com.tencent.mm.storage.f();
              ((com.tencent.mm.storage.f)localObject4).b((Cursor)localObject3);
              ((ArrayList)localObject2).add(new com.qq.wx.voice.embed.recognizer.d(((com.tencent.mm.storage.f)localObject4).field_username, ((com.tencent.mm.storage.f)localObject4).field_nickname, ((com.tencent.mm.storage.f)localObject4).field_conRemark));
              ((Cursor)localObject3).moveToNext();
            }
          }
          ((Cursor)localObject3).close();
        }
        catch (Exception localException)
        {
          w.i("MicroMsg.SubCoreExt", "initLocalVoiceControl Exception:%s", new Object[] { localException.getMessage() });
          GMTrace.o(5742639710208L, 42786);
          return;
        }
        w.i("MicroMsg.SubCoreExt", "init cusor,count:%s,use time:%s", new Object[] { Integer.valueOf(((Cursor)localObject3).getCount()), Long.valueOf(System.currentTimeMillis() - l) });
        long l = System.currentTimeMillis();
        Object localObject3 = com.qq.wx.voice.embed.recognizer.b.a.aDm.aDl;
        if (!((com.qq.wx.voice.embed.recognizer.e)localObject3).d) {
          i = 65232;
        }
        for (;;)
        {
          if (i == 0)
          {
            localException.edit().putBoolean("hasInitVoiceControlData", true).putBoolean("hasTryToInitVoiceControlData", true).commit();
            b.this.kMq = true;
            label571:
            w.i("MicroMsg.SubCoreExt", "init ret:%s,use time:%s", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
            b.this.kMp = true;
          }
          for (;;)
          {
            b.this.kMp = true;
            GMTrace.o(5742639710208L, 42786);
            return;
            if (((com.qq.wx.voice.embed.recognizer.e)localObject3).e)
            {
              j = ((com.qq.wx.voice.embed.recognizer.e)localObject3).aDs.update((ArrayList)localObject2);
              i = j;
              if (j < 0) {
                break;
              }
              break label745;
            }
            j = ((com.qq.wx.voice.embed.recognizer.e)localObject3).aDs.init((ArrayList)localObject2);
            i = j;
            if (j < 0) {
              break;
            }
            ((com.qq.wx.voice.embed.recognizer.e)localObject3).e = true;
            break label745;
            localException.edit().putBoolean("hasInitVoiceControlData", false).commit();
            break label571;
            label704:
            localException.edit().putBoolean("hasInitVoiceControlData", false).putBoolean("hasTryToInitVoiceControlData", true).commit();
            b.this.kMq = true;
          }
          label745:
          i = 0;
        }
      }
    }, 10000L);
    GMTrace.o(5716735688704L, 42593);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5715796164608L, 42586);
    if (this.kMf != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.kMf);
    }
    if (this.kMg != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.kMg);
    }
    Object localObject = an.aWy();
    if (localObject != null) {
      ((com.tencent.mm.pluginsdk.model.app.i)localObject).j(this.kMo);
    }
    at.AR();
    com.tencent.mm.y.c.yM().a(this.kMi);
    localObject = new eq();
    ((eq)localObject).eGn.op = 2;
    if (!com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject)) {
      w.e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountRelease");
    }
    localObject = com.tencent.mm.pluginsdk.model.i.bJf();
    if (at.AU())
    {
      com.tencent.mm.pluginsdk.model.i.tmP = false;
      an.aGk().b(14, (com.tencent.mm.pluginsdk.model.app.t)localObject);
    }
    this.fYU = "";
    at.AR();
    com.tencent.mm.y.c.yK().b(this.kAQ);
    com.tencent.mm.plugin.ext.c.c.avD();
    GMTrace.o(5715796164608L, 42586);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5715393511424L, 42583);
    HashMap localHashMap = fIv;
    GMTrace.o(5715393511424L, 42583);
    return localHashMap;
  }
  
  public static final class a
    extends com.tencent.mm.sdk.b.c<ey>
  {
    public a()
    {
      GMTrace.i(5714453987328L, 42576);
      this.vhf = ey.class.getName().hashCode();
      GMTrace.o(5714453987328L, 42576);
    }
  }
  
  public static final class b
    extends com.tencent.mm.sdk.b.c<fe>
  {
    public b()
    {
      super();
      GMTrace.i(5742773927936L, 42787);
      this.vhf = fe.class.getName().hashCode();
      GMTrace.o(5742773927936L, 42787);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */