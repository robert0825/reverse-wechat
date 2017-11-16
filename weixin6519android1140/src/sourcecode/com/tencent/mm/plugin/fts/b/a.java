package com.tencent.mm.plugin.fts.b;

import android.content.Context;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.rr;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.g.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.s;
import com.tencent.wcdb.database.SQLiteStatement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import junit.framework.AssertionFailedError;

public final class a
  extends com.tencent.mm.plugin.fts.a.b
{
  private static Set<String> lxK;
  public k fTu;
  public com.tencent.mm.plugin.fts.a.h laK;
  public HashMap<String, List<Long>> lxA;
  private Method lxB;
  private m.b lxC;
  private m.b lxD;
  private j.a lxE;
  private j.a lxF;
  private com.tencent.mm.sdk.b.c lxG;
  private com.tencent.mm.sdk.b.c lxH;
  private aj lxI;
  public aj lxJ;
  public com.tencent.mm.plugin.fts.c.a lxw;
  public HashSet<String> lxx;
  public HashMap<String, List<Long>> lxy;
  public HashMap<String, String[]> lxz;
  
  static
  {
    GMTrace.i(18519898980352L, 137984);
    lxK = new HashSet();
    String[] arrayOfString = ab.getContext().getString(g.a.dma).split(";");
    if (arrayOfString != null)
    {
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        lxK.add(str);
        i += 1;
      }
    }
    GMTrace.o(18519898980352L, 137984);
  }
  
  public a()
  {
    GMTrace.i(18518959456256L, 137977);
    this.lxC = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(18537347284992L, 138114);
        paramAnonymousm = (String)paramAnonymousObject;
        if (!a.yU(paramAnonymousm))
        {
          w.i("MicroMsg.FTS.FTS5SearchContactLogic", "onConversationChangeListener filterByUsername %s", new Object[] { paramAnonymousm });
          GMTrace.o(18537347284992L, 138114);
          return;
        }
        paramAnonymousObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(paramAnonymousm);
        if ((paramAnonymousObject != null) && ((!a.C((x)paramAnonymousObject)) || (((x)paramAnonymousObject).bSA())))
        {
          w.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", new Object[] { paramAnonymousm });
          GMTrace.o(18537347284992L, 138114);
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(18537347284992L, 138114);
          return;
          if (!a.this.lxy.containsKey(paramAnonymousm))
          {
            a.this.fTu.a(65556, new a.h(a.this, paramAnonymousm));
            GMTrace.o(18537347284992L, 138114);
            return;
            if ((!a.this.lxx.contains(paramAnonymousm)) && (!a.this.lxy.containsKey(paramAnonymousm))) {
              a.this.fTu.a(65556, new a.i(a.this, paramAnonymousm));
            }
          }
        }
      }
    };
    this.lxD = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(18514798706688L, 137946);
        paramAnonymousm = (String)paramAnonymousObject;
        if (!a.yU(paramAnonymousm))
        {
          w.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener filterByUsername %s", new Object[] { paramAnonymousm });
          GMTrace.o(18514798706688L, 137946);
          return;
        }
        paramAnonymousObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(paramAnonymousm);
        if ((paramAnonymousObject != null) && (!a.C((x)paramAnonymousObject)))
        {
          w.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", new Object[] { paramAnonymousm });
          GMTrace.o(18514798706688L, 137946);
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(18514798706688L, 137946);
          return;
          if (!a.this.lxy.containsKey(paramAnonymousm))
          {
            a.this.fTu.a(65556, new a.h(a.this, paramAnonymousm));
            GMTrace.o(18514798706688L, 137946);
            return;
            a.this.fTu.a(65556, new a.e(a.this, paramAnonymousm));
            GMTrace.o(18514798706688L, 137946);
            return;
            a.this.fTu.a(65556, new a.d(a.this, paramAnonymousm));
          }
        }
      }
    };
    this.lxE = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(18520570068992L, 137989);
        if ((paramAnonymousString.equals("*")) || (paramAnonymousString.equals("chatroomname")))
        {
          GMTrace.o(18520570068992L, 137989);
          return;
        }
        if (!a.this.lxy.containsKey(paramAnonymousString)) {
          a.this.fTu.a(65556, new a.h(a.this, paramAnonymousString));
        }
        GMTrace.o(18520570068992L, 137989);
      }
    };
    this.lxF = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(18515067142144L, 137948);
        paramAnonymousString = paramAnonymousString.split(" ");
        if ((paramAnonymousString == null) || (paramAnonymousString.length == 0))
        {
          GMTrace.o(18515067142144L, 137948);
          return;
        }
        if (paramAnonymousString[0].equals("update"))
        {
          int i = 1;
          while (i < paramAnonymousString.length)
          {
            long l = bg.getLong(paramAnonymousString[i], 0L);
            a.this.fTu.a(65554, new a.u(a.this, l));
            i += 1;
          }
          a.this.fTu.a(65556, new a.t(a.this));
        }
        GMTrace.o(18515067142144L, 137948);
      }
    };
    this.lxG = new com.tencent.mm.sdk.b.c() {};
    this.lxH = new com.tencent.mm.sdk.b.c() {};
    this.lxI = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      private int lxM;
      
      public final boolean pM()
      {
        GMTrace.i(18540568510464L, 138138);
        PluginFTS localPluginFTS = (PluginFTS)com.tencent.mm.kernel.h.j(PluginFTS.class);
        if ((localPluginFTS.isCharging()) || (!localPluginFTS.isInBackground())) {}
        for (int i = 1; i == 0; i = 0)
        {
          i = this.lxM + 1;
          this.lxM = i;
          if (i >= 6) {
            break;
          }
          GMTrace.o(18540568510464L, 138138);
          return true;
        }
        a.this.fTu.a(131093, new a.t(a.this));
        this.lxM = 0;
        GMTrace.o(18540568510464L, 138138);
        return true;
      }
      
      public final String toString()
      {
        GMTrace.i(18540702728192L, 138139);
        String str = super.toString() + "|delayIndexTimer";
        GMTrace.o(18540702728192L, 138139);
        return str;
      }
    }, true);
    this.lxJ = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(18525267689472L, 138024);
        a.this.fTu.a(131093, new a.t(a.this));
        GMTrace.o(18525267689472L, 138024);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(18525401907200L, 138025);
        String str = super.toString() + "|atOnceIndexTimer";
        GMTrace.o(18525401907200L, 138025);
        return str;
      }
    }, false);
    GMTrace.o(18518959456256L, 137977);
  }
  
  static boolean C(x paramx)
  {
    GMTrace.i(18519362109440L, 137980);
    if (paramx.isHidden())
    {
      GMTrace.o(18519362109440L, 137980);
      return false;
    }
    if (paramx.uZ())
    {
      GMTrace.o(18519362109440L, 137980);
      return false;
    }
    if (paramx.field_deleteFlag != 0)
    {
      GMTrace.o(18519362109440L, 137980);
      return false;
    }
    if (!com.tencent.mm.l.a.eE(paramx.field_type))
    {
      if (paramx.uY())
      {
        GMTrace.o(18519362109440L, 137980);
        return false;
      }
      if (paramx.bSA())
      {
        GMTrace.o(18519362109440L, 137980);
        return false;
      }
    }
    GMTrace.o(18519362109440L, 137980);
    return true;
  }
  
  static boolean yU(String paramString)
  {
    GMTrace.i(18519227891712L, 137979);
    if (bg.nm(paramString))
    {
      GMTrace.o(18519227891712L, 137979);
      return false;
    }
    if (paramString.endsWith("@stranger"))
    {
      GMTrace.o(18519227891712L, 137979);
      return false;
    }
    if (paramString.endsWith("@qqim"))
    {
      GMTrace.o(18519227891712L, 137979);
      return false;
    }
    if (paramString.endsWith("@app"))
    {
      GMTrace.o(18519227891712L, 137979);
      return false;
    }
    if (paramString.startsWith("fake_"))
    {
      GMTrace.o(18519227891712L, 137979);
      return false;
    }
    GMTrace.o(18519227891712L, 137979);
    return true;
  }
  
  final void B(x paramx)
  {
    GMTrace.i(18519093673984L, 137978);
    try
    {
      this.lxB.invoke(paramx, new Object[0]);
      GMTrace.o(18519093673984L, 137978);
      return;
    }
    catch (Exception paramx)
    {
      w.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", paramx, "Failed parsing RContact LVBuffer.", new Object[0]);
      GMTrace.o(18519093673984L, 137978);
    }
  }
  
  final boolean D(x paramx)
  {
    GMTrace.i(18519496327168L, 137981);
    String str = paramx.field_username;
    if (!C(paramx))
    {
      GMTrace.o(18519496327168L, 137981);
      return false;
    }
    if (!yU(str))
    {
      GMTrace.o(18519496327168L, 137981);
      return false;
    }
    if (!com.tencent.mm.l.a.eE(paramx.field_type))
    {
      if ((!paramx.uY()) && (!paramx.bSA()))
      {
        if (this.laK.yN(str))
        {
          GMTrace.o(18519496327168L, 137981);
          return true;
        }
        GMTrace.o(18519496327168L, 137981);
        return false;
      }
      GMTrace.o(18519496327168L, 137981);
      return false;
    }
    GMTrace.o(18519496327168L, 137981);
    return true;
  }
  
  final int E(x paramx)
  {
    GMTrace.i(18519630544896L, 137982);
    Object localObject1;
    Object localObject3;
    if (s.eb(paramx.field_username))
    {
      localObject1 = String.format("SELECT memberlist, roomdata FROM %s WHERE chatroomname = ?", new Object[] { "chatroom" });
      localObject3 = this.laK.g((String)localObject1, new String[] { paramx.field_username });
    }
    for (;;)
    {
      try
      {
        if (!((Cursor)localObject3).moveToNext()) {
          break label498;
        }
        localObject2 = ((Cursor)localObject3).getString(0);
        localObject1 = ((Cursor)localObject3).getBlob(1);
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
        if ((bg.nm((String)localObject2)) || (localObject1 == null))
        {
          w.i("MicroMsg.FTS.FTS5SearchContactLogic", "error chatroom data %s", new Object[] { paramx.field_username });
          i = h(paramx.field_username, null);
          if (i > 0) {
            w.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", new Object[] { paramx.field_username, Integer.valueOf(i) });
          }
          GMTrace.o(18519630544896L, 137982);
          return 0;
        }
      }
      finally
      {
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
      }
      Object localObject2 = c.a.lwq.split((CharSequence)localObject2);
      Arrays.sort((Object[])localObject2, new Comparator() {});
      int i = h(paramx.field_username, (String[])localObject2);
      if (i > 0) {
        w.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", new Object[] { paramx.field_username, Integer.valueOf(i) });
      }
      localObject3 = new HashMap();
      Object localObject4 = "SELECT rowid, username, alias, conRemark, nickname , lvbuff FROM rcontact WHERE username IN " + d.u((String[])localObject2) + ";";
      localObject4 = this.laK.g((String)localObject4, null);
      try
      {
        while (((Cursor)localObject4).moveToNext())
        {
          x localx = new x();
          localx.fTq = ((Cursor)localObject4).getLong(0);
          localx.setUsername(((Cursor)localObject4).getString(1));
          localx.ci(((Cursor)localObject4).getString(2));
          localx.cj(((Cursor)localObject4).getString(3));
          localx.cl(((Cursor)localObject4).getString(4));
          localx.u(((Cursor)localObject4).getBlob(5));
          ((HashMap)localObject3).put(localx.field_username, localx);
        }
        i = a(paramx.field_username, paramx, (String[])localObject2, (byte[])localObject1, (HashMap)localObject3);
      }
      finally
      {
        if (localObject4 != null) {
          ((Cursor)localObject4).close();
        }
      }
      GMTrace.o(18519630544896L, 137982);
      return i;
      i = F(paramx);
      GMTrace.o(18519630544896L, 137982);
      return i;
      label498:
      localObject1 = null;
      localObject2 = null;
    }
  }
  
  final int F(x paramx)
  {
    GMTrace.i(18519764762624L, 137983);
    long l2 = paramx.fTq;
    String str4 = paramx.field_username;
    String str7 = paramx.qQ();
    String str1 = paramx.field_nickname;
    Object localObject1 = d.ad(str1, false);
    Object localObject2 = d.ad(str1, true);
    String str2 = paramx.field_conRemark;
    Object localObject5 = d.ad(str2, false);
    String str3 = d.ad(str2, true);
    String str5 = paramx.fjt;
    Object localObject7 = paramx.field_contactLabelIds;
    String str6 = paramx.fjz;
    int i = paramx.field_verifyFlag;
    long l1 = System.currentTimeMillis();
    int j;
    if ((i & x.bSC()) != 0)
    {
      i = 0;
      j = 131076;
    }
    for (;;)
    {
      Object localObject3 = d.cm(str4, str7);
      if ((localObject3 != null) && (((String)localObject3).length() != 0))
      {
        this.lxw.a(j, 15, l2, str4, l1, (String)localObject3);
        i += 1;
      }
      for (;;)
      {
        Object localObject4;
        if ((str2 == null) || (str2.length() == 0))
        {
          localObject5 = null;
          str2 = str1;
          str1 = null;
          localObject4 = localObject1;
          localObject3 = localObject2;
          localObject2 = null;
          localObject1 = localObject5;
        }
        for (;;)
        {
          int k = i;
          if (str2 != null)
          {
            k = i;
            if (str2.length() != 0)
            {
              if (!str2.equalsIgnoreCase((String)localObject4)) {
                break label1399;
              }
              localObject4 = null;
            }
          }
          label391:
          label898:
          label1146:
          label1312:
          label1399:
          for (;;)
          {
            if ((localObject4 == null) || (((String)localObject4).length() == 0) || (((String)localObject4).equalsIgnoreCase((String)localObject3))) {
              localObject3 = null;
            }
            for (;;)
            {
              this.lxw.a(j, 1, l2, str4, l1, str2);
              if ((localObject4 != null) && (((String)localObject4).length() != 0)) {
                this.lxw.a(j, 2, l2, str4, l1, (String)localObject4);
              }
              if ((localObject3 != null) && (((String)localObject3).length() != 0)) {
                this.lxw.a(j, 3, l2, str4, l1, (String)localObject3);
              }
              k = i + 3;
              if ((str1 != null) && (str1.length() != 0))
              {
                localObject3 = localObject2;
                if (str1.equalsIgnoreCase((String)localObject2)) {
                  localObject3 = null;
                }
                if ((localObject3 == null) || (((String)localObject3).length() == 0) || (((String)localObject3).equalsIgnoreCase((String)localObject1)))
                {
                  localObject1 = null;
                  this.lxw.a(j, 5, l2, str4, l1, str1);
                  if ((localObject3 != null) && (((String)localObject3).length() != 0)) {
                    this.lxw.a(j, 6, l2, str4, l1, (String)localObject3);
                  }
                  if ((localObject1 != null) && (((String)localObject1).length() != 0)) {
                    this.lxw.a(j, 7, l2, str4, l1, (String)localObject1);
                  }
                  k += 3;
                }
              }
              for (;;)
              {
                i = k;
                if (str5 != null)
                {
                  i = k;
                  if (str5.length() > 0)
                  {
                    this.lxw.a(j, 4, l2, str4, l1, str5);
                    i = k + 1;
                  }
                }
                k = i;
                if (j == 131072)
                {
                  if (bg.nm(str6)) {
                    break label1312;
                  }
                  localObject1 = str6.replace(",", "​");
                  this.lxw.a(j, 16, l2, str4, l1, (String)localObject1);
                  i += 1;
                  localObject2 = paramx.getProvince();
                  localObject1 = localObject2;
                  if (lxK.contains(localObject2)) {
                    localObject1 = "";
                  }
                  if ((localObject1 != null) && (((String)localObject1).length() != 0)) {
                    this.lxw.a(j, 18, l2, str4, l1, (String)localObject1);
                  }
                  paramx = paramx.getCity();
                  k = i;
                  if (paramx != null)
                  {
                    k = i;
                    if (paramx.length() != 0)
                    {
                      this.lxw.a(j, 17, l2, str4, l1, paramx);
                      k = i;
                    }
                  }
                }
                GMTrace.o(18519764762624L, 137983);
                return k;
                l1 = this.laK.yO(str4);
                if ((localObject7 == null) || (((String)localObject7).length() <= 0)) {
                  break label1428;
                }
                Object localObject6 = null;
                localObject3 = localObject6;
                if (localObject7 != null)
                {
                  localObject4 = localObject7;
                  if (((String)localObject7).endsWith("\000")) {
                    localObject4 = ((String)localObject7).substring(0, ((String)localObject7).length() - 1);
                  }
                  localObject3 = localObject6;
                  if (((String)localObject4).length() != 0)
                  {
                    localObject4 = c.a.lwx.split((CharSequence)localObject4);
                    localObject3 = localObject6;
                    if (localObject4.length != 0)
                    {
                      localObject3 = new ArrayList(localObject4.length);
                      j = localObject4.length;
                      i = 0;
                      while (i < j)
                      {
                        ((List)localObject3).add(Long.valueOf(bg.getLong(localObject4[i], 0L)));
                        i += 1;
                      }
                    }
                  }
                }
                localObject4 = (List)this.lxA.get(str4);
                if (localObject4 == null)
                {
                  this.lxw.yY(str4);
                  if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
                  {
                    this.lxw.g(str4, (List)localObject3);
                    this.lxA.put(str4, localObject3);
                  }
                  if ((localObject3 != null) && (!((List)localObject3).isEmpty())) {
                    break label1146;
                  }
                  i = 0;
                }
                for (;;)
                {
                  j = 131072;
                  i += 0;
                  break;
                  if ((localObject3 == null) || (((List)localObject3).isEmpty()))
                  {
                    this.lxw.yY(str4);
                    this.lxA.remove(str4);
                    break label898;
                  }
                  localObject4 = new HashSet((Collection)localObject4);
                  localObject6 = ((List)localObject3).iterator();
                  long l3;
                  while (((Iterator)localObject6).hasNext())
                  {
                    l3 = ((Long)((Iterator)localObject6).next()).longValue();
                    if (!((HashSet)localObject4).remove(Long.valueOf(l3)))
                    {
                      localObject7 = this.lxw;
                      ((com.tencent.mm.plugin.fts.c.a)localObject7).lzb.bindString(1, str4);
                      ((com.tencent.mm.plugin.fts.c.a)localObject7).lzb.bindLong(2, l3);
                      ((com.tencent.mm.plugin.fts.c.a)localObject7).lzb.execute();
                    }
                  }
                  localObject4 = ((HashSet)localObject4).iterator();
                  while (((Iterator)localObject4).hasNext())
                  {
                    l3 = ((Long)((Iterator)localObject4).next()).longValue();
                    localObject6 = this.lxw;
                    ((com.tencent.mm.plugin.fts.c.a)localObject6).lzc.bindString(1, str4);
                    ((com.tencent.mm.plugin.fts.c.a)localObject6).lzc.bindLong(2, l3);
                    ((com.tencent.mm.plugin.fts.c.a)localObject6).lzc.execute();
                  }
                  this.lxA.put(str4, localObject3);
                  break label898;
                  localObject4 = new StringBuilder(512);
                  localObject6 = new String[1];
                  localObject3 = ((List)localObject3).iterator();
                  while (((Iterator)localObject3).hasNext())
                  {
                    localObject6[0] = Long.toString(((Long)((Iterator)localObject3).next()).longValue());
                    localObject7 = this.laK.g("SELECT labelName FROM ContactLabel WHERE labelID=?;", (String[])localObject6);
                    if (((Cursor)localObject7).moveToFirst()) {
                      ((StringBuilder)localObject4).append(((Cursor)localObject7).getString(0)).append("​");
                    }
                    ((Cursor)localObject7).close();
                  }
                  if (((StringBuilder)localObject4).length() == 0)
                  {
                    i = 0;
                  }
                  else
                  {
                    ((StringBuilder)localObject4).setLength(((StringBuilder)localObject4).length() - 1);
                    this.lxw.a(131072, 11, l2, str4, l1, ((StringBuilder)localObject4).toString());
                    i = 1;
                  }
                }
                localObject1 = this.laK.g("SELECT moblie FROM addr_upload2 WHERE username=?;", new String[] { str4 });
                if (((Cursor)localObject1).moveToFirst())
                {
                  localObject2 = ((Cursor)localObject1).getString(0);
                  this.lxw.a(j, 16, l2, str4, l1, (String)localObject2);
                  i += 1;
                }
                for (;;)
                {
                  ((Cursor)localObject1).close();
                  break;
                }
                break label391;
              }
            }
          }
          localObject3 = str3;
          localObject4 = localObject5;
          localObject5 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject5;
        }
      }
      label1428:
      j = 131072;
      i = 0;
    }
  }
  
  final int a(String paramString, x paramx, String[] paramArrayOfString, byte[] paramArrayOfByte, HashMap<String, x> paramHashMap)
  {
    GMTrace.i(18518691020800L, 137975);
    int j = 0;
    paramx = paramx.field_nickname;
    String str1 = d.ad(paramx, false);
    String str2 = d.ad(paramx, true);
    long l1 = 0L;
    long l3 = this.laK.yO(paramString);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramArrayOfString != null)
    {
      long l2 = paramArrayOfString.length;
      HashMap localHashMap = new HashMap();
      Object localObject = new com.tencent.mm.i.a.a.a();
      int k;
      try
      {
        ((com.tencent.mm.i.a.a.a)localObject).aD(paramArrayOfByte);
        paramArrayOfByte = ((com.tencent.mm.i.a.a.a)localObject).fMv.iterator();
        while (paramArrayOfByte.hasNext())
        {
          localObject = (com.tencent.mm.i.a.a.b)paramArrayOfByte.next();
          if (!bg.nm(((com.tencent.mm.i.a.a.b)localObject).fMz)) {
            localHashMap.put(((com.tencent.mm.i.a.a.b)localObject).userName, ((com.tencent.mm.i.a.a.b)localObject).fMz);
          }
        }
      }
      catch (Exception paramArrayOfByte)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", paramArrayOfByte, "parse chatroom data", new Object[0]);
        }
        k = paramArrayOfString.length;
        i = 0;
      }
      l1 = l2;
      if (i < k)
      {
        paramArrayOfByte = paramArrayOfString[i];
        localObject = (x)paramHashMap.get(paramArrayOfByte);
        String str4;
        String str3;
        if (localObject != null)
        {
          str4 = ((com.tencent.mm.g.b.af)localObject).field_conRemark;
          str3 = ((com.tencent.mm.g.b.af)localObject).field_nickname;
          if (!bg.nm(str4)) {
            break label364;
          }
          localStringBuffer.append("‌‌‌");
          label244:
          if (!bg.nm(str3)) {
            break label425;
          }
          localStringBuffer.append("‌‌‌");
        }
        for (;;)
        {
          localStringBuffer.append(bg.aq((String)localHashMap.get(paramArrayOfByte), "")).append("‌");
          B((x)localObject);
          localStringBuffer.append(bg.aq(((com.tencent.mm.g.b.af)localObject).fjt, "")).append("‌");
          localStringBuffer.append(bg.aq(d.cm(paramArrayOfByte, ((x)localObject).qQ()), "")).append("‌");
          localStringBuffer.append("​");
          i += 1;
          break;
          label364:
          String str5 = d.ad(str4, false);
          String str6 = d.ad(str4, true);
          localStringBuffer.append(str4).append("‌");
          localStringBuffer.append(str5).append("‌");
          localStringBuffer.append(str6).append("‌");
          break label244;
          label425:
          str4 = d.ad(str3, false);
          str5 = d.ad(str3, true);
          localStringBuffer.append(str3).append("‌");
          localStringBuffer.append(str4).append("‌");
          localStringBuffer.append(str5).append("‌");
        }
      }
    }
    int i = j;
    if (!bg.nm(paramx))
    {
      this.lxw.a(131075, 5, l1, paramString, l3, paramx);
      if (bg.nm(str1)) {
        break label645;
      }
      this.lxw.a(131075, 6, l1, paramString, l3, str1);
    }
    label645:
    for (j = 2;; j = 1)
    {
      i = j;
      if (!bg.nm(str2))
      {
        this.lxw.a(131075, 7, l1, paramString, l3, str2);
        i = j + 1;
      }
      j = i;
      if (localStringBuffer.length() > 0)
      {
        localStringBuffer.setLength(localStringBuffer.length() - 1);
        this.lxw.a(131075, 38, l1, paramString, l3, localStringBuffer.toString());
        j = i + 1;
      }
      GMTrace.o(18518691020800L, 137975);
      return j;
    }
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18518154149888L, 137971);
    switch (paramf.lwS)
    {
    default: 
      paramf = new j(paramf);
    }
    for (;;)
    {
      paramf = this.fTu.a(-65536, paramf);
      GMTrace.o(18518154149888L, 137971);
      return paramf;
      paramf = new q(paramf);
      continue;
      paramf = new n(paramf);
      continue;
      paramf = new s(paramf);
      continue;
      paramf = new l(paramf);
      continue;
      paramf = new k(paramf);
      continue;
      paramf = new m(paramf);
      continue;
      paramf = new r(paramf);
      continue;
      paramf = new o(paramf);
      continue;
      paramf = new p(paramf);
    }
  }
  
  public final String getName()
  {
    GMTrace.i(18518556803072L, 137974);
    GMTrace.o(18518556803072L, 137974);
    return "FTS5SearchContactLogic";
  }
  
  public final int h(String paramString, String[] paramArrayOfString)
  {
    int j = 0;
    GMTrace.i(18518825238528L, 137976);
    Object localObject = (String[])this.lxz.get(paramString);
    this.lxw.beginTransaction();
    int i;
    if (localObject == null)
    {
      this.lxw.za(paramString);
      j = (int)this.lxw.lze.simpleQueryForLong() + 0;
      i = j;
      if (paramArrayOfString != null)
      {
        this.lxw.i(paramString, paramArrayOfString);
        this.lxz.put(paramString, paramArrayOfString);
        i = j + paramArrayOfString.length;
      }
    }
    for (;;)
    {
      this.lxw.commit();
      GMTrace.o(18518825238528L, 137976);
      return i;
      if (paramArrayOfString == null)
      {
        this.lxw.za(paramString);
        i = (int)this.lxw.lze.simpleQueryForLong() + 0;
        this.lxz.remove(paramString);
      }
      else
      {
        localObject = new HashSet(Arrays.asList((Object[])localObject));
        int m = paramArrayOfString.length;
        String str;
        int k;
        com.tencent.mm.plugin.fts.c.a locala;
        for (i = 0; j < m; i = k)
        {
          str = paramArrayOfString[j];
          k = i;
          if (!((HashSet)localObject).remove(str))
          {
            locala = this.lxw;
            locala.lyY.bindString(1, paramString);
            locala.lyY.bindString(2, str);
            locala.lyY.execute();
            k = i + 1;
          }
          j += 1;
        }
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          str = (String)((Iterator)localObject).next();
          locala = this.lxw;
          locala.lyZ.bindString(1, paramString);
          locala.lyZ.bindString(2, str);
          locala.lyZ.execute();
          i += 1;
        }
        this.lxz.put(paramString, paramArrayOfString);
      }
    }
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(18518288367616L, 137972);
    if (!((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Fail!");
      GMTrace.o(18518288367616L, 137972);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Success!");
    this.lxw = ((com.tencent.mm.plugin.fts.c.a)((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSIndexStorage(3));
    this.fTu = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSTaskDaemon();
    this.laK = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSMainDB();
    this.lxx = new HashSet();
    this.lxy = new HashMap();
    this.lxz = new HashMap();
    this.lxA = new HashMap();
    try
    {
      this.lxB = com.tencent.mm.g.b.af.class.getDeclaredMethod("qT", new Class[0]);
      this.lxB.setAccessible(true);
      this.fTu.a(131072, new f());
      this.fTu.a(131082, new a());
      this.fTu.a(131092, new b());
      this.fTu.a(Integer.MAX_VALUE, new c());
      ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().c(this.lxE);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this.lxD);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(this.lxC);
      j.a locala = this.lxF;
      if (com.tencent.mm.aq.b.gLz != null) {
        com.tencent.mm.aq.b.gLz.a(locala);
      }
      this.lxI.z(600000L, 600000L);
      this.lxG.bPu();
      this.lxH.bPu();
      GMTrace.o(18518288367616L, 137972);
      return true;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      AssertionFailedError localAssertionFailedError = new AssertionFailedError("Can't find BaseContact.parseBuff method, class prototype has changed.");
      localAssertionFailedError.initCause(localNoSuchMethodException);
      throw localAssertionFailedError;
    }
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18518422585344L, 137973);
    this.lxG.dead();
    this.lxH.dead();
    this.lxJ.stopTimer();
    this.lxI.stopTimer();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(this.lxD);
    ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().j(this.lxE);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(this.lxC);
    j.a locala = this.lxF;
    if (com.tencent.mm.aq.b.gLz != null) {
      com.tencent.mm.aq.b.gLz.b(locala);
    }
    if (this.lxy != null) {
      this.lxy.clear();
    }
    if (this.lxx != null) {
      this.lxx.clear();
    }
    this.lxw = null;
    this.fTu = null;
    GMTrace.o(18518422585344L, 137973);
    return true;
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int laR;
    private int laS;
    
    public a()
    {
      GMTrace.i(18527683608576L, 138042);
      this.laR = 0;
      this.laS = 0;
      GMTrace.o(18527683608576L, 138042);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18527817826304L, 138043);
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building chatroom index.");
      Object localObject1 = new HashSet();
      Object localObject2 = a.this.lxw.lvN.rawQuery("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers;", null);
      while (((Cursor)localObject2).moveToNext()) {
        ((HashSet)localObject1).add(((Cursor)localObject2).getString(0));
      }
      ((Cursor)localObject2).close();
      localObject2 = a.this.laK.g("SELECT chatroomname, memberlist FROM chatroom;", null);
      int i = 5;
      int j;
      while (((Cursor)localObject2).moveToNext())
      {
        if (Thread.interrupted())
        {
          ((Cursor)localObject2).close();
          a.this.lxw.commit();
          throw new InterruptedException();
        }
        String str = ((Cursor)localObject2).getString(0);
        String[] arrayOfString = c.a.lwq.split(((Cursor)localObject2).getString(1));
        a.this.lxz.put(str, arrayOfString);
        if (!((HashSet)localObject1).remove(str))
        {
          j = i;
          if (i >= 5)
          {
            a.this.lxw.commit();
            a.this.lxw.beginTransaction();
            j = 0;
          }
          a.this.lxw.i(str, arrayOfString);
          i = j + 1;
          this.laR += 1;
        }
      }
      ((Cursor)localObject2).close();
      a.this.lxw.commit();
      localObject1 = ((HashSet)localObject1).iterator();
      for (i = 5; ((Iterator)localObject1).hasNext(); i = j + 1)
      {
        localObject2 = (String)((Iterator)localObject1).next();
        j = i;
        if (i >= 5)
        {
          a.this.lxw.commit();
          a.this.lxw.beginTransaction();
          j = 0;
        }
        a.this.lxw.za((String)localObject2);
        this.laS += 1;
      }
      a.this.lxw.commit();
      GMTrace.o(18527817826304L, 138043);
      return true;
    }
    
    public final int getId()
    {
      GMTrace.i(18528220479488L, 138046);
      GMTrace.o(18528220479488L, 138046);
      return 3;
    }
    
    public final String getName()
    {
      GMTrace.i(18527952044032L, 138044);
      GMTrace.o(18527952044032L, 138044);
      return "BuildChatroomIndexTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18528086261760L, 138045);
      String str = "BuildChatroomIndex [new: " + this.laR + ", removed: " + this.laS + "]";
      GMTrace.o(18528086261760L, 138045);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private HashSet<String> lxN;
    private HashMap<String, x> lxO;
    private long lxP;
    private long lxQ;
    private int lxR;
    private int lxS;
    private int lxT;
    private int lxU;
    private int lxV;
    private int lxW;
    private int lxX;
    
    public b()
    {
      GMTrace.i(18528354697216L, 138047);
      this.lxO = new HashMap();
      this.lxP = -1L;
      this.lxQ = -1L;
      this.lxR = 0;
      this.lxS = 0;
      this.lxT = 0;
      this.lxU = 0;
      GMTrace.o(18528354697216L, 138047);
    }
    
    /* Error */
    public final boolean execute()
    {
      // Byte code:
      //   0: ldc2_w 72
      //   3: ldc 74
      //   5: invokestatic 44	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: ldc 76
      //   10: ldc 78
      //   12: invokestatic 83	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   15: aload_0
      //   16: ldc 85
      //   18: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   21: aload_0
      //   22: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   25: ifnonnull +221 -> 246
      //   28: aload_0
      //   29: new 93	java/util/HashSet
      //   32: dup
      //   33: invokespecial 94	java/util/HashSet:<init>	()V
      //   36: putfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   39: aload_0
      //   40: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   43: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   46: getstatic 104	com/tencent/mm/plugin/fts/a/c:lwd	[I
      //   49: iconst_1
      //   50: iconst_0
      //   51: iconst_1
      //   52: iconst_0
      //   53: iconst_1
      //   54: invokevirtual 110	com/tencent/mm/plugin/fts/c/a:a	([IZZZZZ)Landroid/database/Cursor;
      //   57: astore 7
      //   59: aload 7
      //   61: invokeinterface 115 1 0
      //   66: ifeq +134 -> 200
      //   69: aload 7
      //   71: iconst_1
      //   72: invokeinterface 119 2 0
      //   77: astore 8
      //   79: aload 7
      //   81: iconst_2
      //   82: invokeinterface 123 2 0
      //   87: istore_1
      //   88: aload 7
      //   90: iconst_0
      //   91: invokeinterface 127 2 0
      //   96: lstore_3
      //   97: iload_1
      //   98: iconst_1
      //   99: if_icmpne +70 -> 169
      //   102: aload_0
      //   103: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   106: getfield 130	com/tencent/mm/plugin/fts/b/a:lxy	Ljava/util/HashMap;
      //   109: aload 8
      //   111: invokevirtual 134	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   114: checkcast 136	java/util/List
      //   117: astore 6
      //   119: aload 6
      //   121: astore 5
      //   123: aload 6
      //   125: ifnonnull +29 -> 154
      //   128: new 138	java/util/ArrayList
      //   131: dup
      //   132: bipush 16
      //   134: invokespecial 141	java/util/ArrayList:<init>	(I)V
      //   137: astore 5
      //   139: aload_0
      //   140: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   143: getfield 130	com/tencent/mm/plugin/fts/b/a:lxy	Ljava/util/HashMap;
      //   146: aload 8
      //   148: aload 5
      //   150: invokevirtual 145	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   153: pop
      //   154: aload 5
      //   156: lload_3
      //   157: invokestatic 151	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   160: invokeinterface 155 2 0
      //   165: pop
      //   166: goto -107 -> 59
      //   169: aload_0
      //   170: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   173: aload 8
      //   175: invokevirtual 156	java/util/HashSet:add	(Ljava/lang/Object;)Z
      //   178: pop
      //   179: iload_1
      //   180: iconst_2
      //   181: if_icmpne -122 -> 59
      //   184: aload_0
      //   185: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   188: getfield 159	com/tencent/mm/plugin/fts/b/a:lxx	Ljava/util/HashSet;
      //   191: aload 8
      //   193: invokevirtual 156	java/util/HashSet:add	(Ljava/lang/Object;)Z
      //   196: pop
      //   197: goto -138 -> 59
      //   200: aload 7
      //   202: invokeinterface 162 1 0
      //   207: aload_0
      //   208: aload_0
      //   209: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   212: getfield 130	com/tencent/mm/plugin/fts/b/a:lxy	Ljava/util/HashMap;
      //   215: invokevirtual 166	java/util/HashMap:size	()I
      //   218: putfield 168	com/tencent/mm/plugin/fts/b/a$b:lxV	I
      //   221: aload_0
      //   222: aload_0
      //   223: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   226: getfield 159	com/tencent/mm/plugin/fts/b/a:lxx	Ljava/util/HashSet;
      //   229: invokevirtual 169	java/util/HashSet:size	()I
      //   232: putfield 171	com/tencent/mm/plugin/fts/b/a$b:lxW	I
      //   235: aload_0
      //   236: aload_0
      //   237: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   240: invokevirtual 169	java/util/HashSet:size	()I
      //   243: putfield 173	com/tencent/mm/plugin/fts/b/a$b:lxX	I
      //   246: aload_0
      //   247: ldc -81
      //   249: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   252: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   255: ifeq +11 -> 266
      //   258: new 182	java/lang/InterruptedException
      //   261: dup
      //   262: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   265: athrow
      //   266: aload_0
      //   267: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   270: getfield 130	com/tencent/mm/plugin/fts/b/a:lxy	Ljava/util/HashMap;
      //   273: invokevirtual 166	java/util/HashMap:size	()I
      //   276: ifle +82 -> 358
      //   279: new 138	java/util/ArrayList
      //   282: dup
      //   283: invokespecial 184	java/util/ArrayList:<init>	()V
      //   286: astore 5
      //   288: aload_0
      //   289: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   292: getfield 130	com/tencent/mm/plugin/fts/b/a:lxy	Ljava/util/HashMap;
      //   295: invokevirtual 188	java/util/HashMap:values	()Ljava/util/Collection;
      //   298: invokeinterface 194 1 0
      //   303: astore 6
      //   305: aload 6
      //   307: invokeinterface 199 1 0
      //   312: ifeq +24 -> 336
      //   315: aload 5
      //   317: aload 6
      //   319: invokeinterface 203 1 0
      //   324: checkcast 136	java/util/List
      //   327: invokeinterface 207 2 0
      //   332: pop
      //   333: goto -28 -> 305
      //   336: aload_0
      //   337: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   340: getfield 130	com/tencent/mm/plugin/fts/b/a:lxy	Ljava/util/HashMap;
      //   343: invokevirtual 210	java/util/HashMap:clear	()V
      //   346: aload_0
      //   347: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   350: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   353: aload 5
      //   355: invokevirtual 214	com/tencent/mm/plugin/fts/c/a:aH	(Ljava/util/List;)V
      //   358: aload_0
      //   359: ldc -40
      //   361: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   364: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   367: ifeq +11 -> 378
      //   370: new 182	java/lang/InterruptedException
      //   373: dup
      //   374: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   377: athrow
      //   378: aload_0
      //   379: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   382: getfield 159	com/tencent/mm/plugin/fts/b/a:lxx	Ljava/util/HashSet;
      //   385: invokevirtual 169	java/util/HashSet:size	()I
      //   388: ifle +78 -> 466
      //   391: aload_0
      //   392: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   395: getfield 159	com/tencent/mm/plugin/fts/b/a:lxx	Ljava/util/HashSet;
      //   398: invokevirtual 217	java/util/HashSet:iterator	()Ljava/util/Iterator;
      //   401: astore 5
      //   403: aload 5
      //   405: invokeinterface 199 1 0
      //   410: ifeq +46 -> 456
      //   413: aload 5
      //   415: invokeinterface 203 1 0
      //   420: checkcast 219	java/lang/String
      //   423: astore 6
      //   425: aload_0
      //   426: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   429: getfield 223	com/tencent/mm/plugin/fts/b/a:laK	Lcom/tencent/mm/plugin/fts/a/h;
      //   432: aload 6
      //   434: invokeinterface 229 2 0
      //   439: lstore_3
      //   440: aload_0
      //   441: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   444: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   447: aload 6
      //   449: lload_3
      //   450: invokevirtual 233	com/tencent/mm/plugin/fts/c/a:x	(Ljava/lang/String;J)V
      //   453: goto -50 -> 403
      //   456: aload_0
      //   457: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   460: getfield 159	com/tencent/mm/plugin/fts/b/a:lxx	Ljava/util/HashSet;
      //   463: invokevirtual 234	java/util/HashSet:clear	()V
      //   466: aload_0
      //   467: ldc -20
      //   469: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   472: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   475: ifeq +11 -> 486
      //   478: new 182	java/lang/InterruptedException
      //   481: dup
      //   482: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   485: athrow
      //   486: aload_0
      //   487: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   490: getfield 223	com/tencent/mm/plugin/fts/b/a:laK	Lcom/tencent/mm/plugin/fts/a/h;
      //   493: ldc -18
      //   495: iconst_1
      //   496: anewarray 219	java/lang/String
      //   499: dup
      //   500: iconst_0
      //   501: aload_0
      //   502: getfield 53	com/tencent/mm/plugin/fts/b/a$b:lxP	J
      //   505: invokestatic 242	java/lang/Long:toString	(J)Ljava/lang/String;
      //   508: aastore
      //   509: invokeinterface 246 3 0
      //   514: astore 6
      //   516: bipush 50
      //   518: istore_1
      //   519: aload 6
      //   521: invokeinterface 115 1 0
      //   526: ifeq +353 -> 879
      //   529: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   532: ifeq +28 -> 560
      //   535: aload 6
      //   537: invokeinterface 162 1 0
      //   542: aload_0
      //   543: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   546: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   549: invokevirtual 249	com/tencent/mm/plugin/fts/c/a:commit	()V
      //   552: new 182	java/lang/InterruptedException
      //   555: dup
      //   556: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   559: athrow
      //   560: aload 6
      //   562: iconst_0
      //   563: invokeinterface 127 2 0
      //   568: lstore_3
      //   569: aload_0
      //   570: lload_3
      //   571: putfield 53	com/tencent/mm/plugin/fts/b/a$b:lxP	J
      //   574: new 251	com/tencent/mm/storage/x
      //   577: dup
      //   578: invokespecial 252	com/tencent/mm/storage/x:<init>	()V
      //   581: astore 5
      //   583: aload 5
      //   585: lload_3
      //   586: putfield 255	com/tencent/mm/storage/x:fTq	J
      //   589: aload 5
      //   591: aload 6
      //   593: iconst_1
      //   594: invokeinterface 119 2 0
      //   599: invokevirtual 258	com/tencent/mm/storage/x:setUsername	(Ljava/lang/String;)V
      //   602: aload 5
      //   604: aload 6
      //   606: iconst_2
      //   607: invokeinterface 119 2 0
      //   612: invokevirtual 261	com/tencent/mm/storage/x:ci	(Ljava/lang/String;)V
      //   615: aload 5
      //   617: aload 6
      //   619: iconst_3
      //   620: invokeinterface 119 2 0
      //   625: invokevirtual 264	com/tencent/mm/storage/x:cj	(Ljava/lang/String;)V
      //   628: aload 5
      //   630: aload 6
      //   632: iconst_4
      //   633: invokeinterface 119 2 0
      //   638: invokevirtual 267	com/tencent/mm/storage/x:cl	(Ljava/lang/String;)V
      //   641: aload 5
      //   643: aload 6
      //   645: iconst_5
      //   646: invokeinterface 123 2 0
      //   651: invokevirtual 270	com/tencent/mm/storage/x:dk	(I)V
      //   654: aload 5
      //   656: aload 6
      //   658: bipush 6
      //   660: invokeinterface 123 2 0
      //   665: invokevirtual 273	com/tencent/mm/storage/x:setType	(I)V
      //   668: aload 5
      //   670: aload 6
      //   672: bipush 7
      //   674: invokeinterface 277 2 0
      //   679: invokevirtual 281	com/tencent/mm/storage/x:u	([B)V
      //   682: aload 5
      //   684: aload 6
      //   686: bipush 8
      //   688: invokeinterface 119 2 0
      //   693: invokevirtual 284	com/tencent/mm/storage/x:cs	(Ljava/lang/String;)V
      //   696: aload 5
      //   698: iconst_0
      //   699: invokevirtual 287	com/tencent/mm/storage/x:dm	(I)V
      //   702: aload_0
      //   703: getfield 49	com/tencent/mm/plugin/fts/b/a$b:lxO	Ljava/util/HashMap;
      //   706: aload 5
      //   708: getfield 293	com/tencent/mm/g/b/af:field_username	Ljava/lang/String;
      //   711: aload 5
      //   713: invokevirtual 145	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   716: pop
      //   717: aload 5
      //   719: getfield 293	com/tencent/mm/g/b/af:field_username	Ljava/lang/String;
      //   722: invokestatic 299	com/tencent/mm/y/s:eb	(Ljava/lang/String;)Z
      //   725: ifne -206 -> 519
      //   728: aload_0
      //   729: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   732: aload 5
      //   734: invokevirtual 303	com/tencent/mm/plugin/fts/b/a:D	(Lcom/tencent/mm/storage/x;)Z
      //   737: ifeq -218 -> 519
      //   740: aload_0
      //   741: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   744: aload 5
      //   746: getfield 293	com/tencent/mm/g/b/af:field_username	Ljava/lang/String;
      //   749: invokevirtual 306	java/util/HashSet:remove	(Ljava/lang/Object;)Z
      //   752: ifne -233 -> 519
      //   755: iload_1
      //   756: bipush 50
      //   758: if_icmplt +616 -> 1374
      //   761: aload_0
      //   762: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   765: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   768: invokevirtual 249	com/tencent/mm/plugin/fts/c/a:commit	()V
      //   771: aload_0
      //   772: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   775: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   778: invokevirtual 309	com/tencent/mm/plugin/fts/c/a:beginTransaction	()V
      //   781: iconst_0
      //   782: istore_1
      //   783: aload 5
      //   785: getfield 293	com/tencent/mm/g/b/af:field_username	Ljava/lang/String;
      //   788: ldc_w 311
      //   791: invokevirtual 314	java/lang/String:endsWith	(Ljava/lang/String;)Z
      //   794: ifne +29 -> 823
      //   797: aload 5
      //   799: getfield 317	com/tencent/mm/g/b/af:field_verifyFlag	I
      //   802: invokestatic 320	com/tencent/mm/storage/x:bSC	()I
      //   805: iand
      //   806: ifne +17 -> 823
      //   809: aload_0
      //   810: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   813: aload 5
      //   815: invokevirtual 324	com/tencent/mm/plugin/fts/b/a:B	(Lcom/tencent/mm/storage/x;)V
      //   818: aload 5
      //   820: invokevirtual 327	com/tencent/mm/storage/x:bSE	()V
      //   823: aload_0
      //   824: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   827: aload 5
      //   829: invokevirtual 331	com/tencent/mm/plugin/fts/b/a:F	(Lcom/tencent/mm/storage/x;)I
      //   832: istore_2
      //   833: iload_2
      //   834: iload_1
      //   835: iadd
      //   836: istore_1
      //   837: aload_0
      //   838: aload_0
      //   839: getfield 59	com/tencent/mm/plugin/fts/b/a$b:lxS	I
      //   842: iconst_1
      //   843: iadd
      //   844: putfield 59	com/tencent/mm/plugin/fts/b/a$b:lxS	I
      //   847: goto -328 -> 519
      //   850: astore 5
      //   852: ldc 76
      //   854: aload 5
      //   856: ldc_w 333
      //   859: iconst_0
      //   860: anewarray 335	java/lang/Object
      //   863: invokestatic 339	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   866: aload_0
      //   867: aload_0
      //   868: getfield 63	com/tencent/mm/plugin/fts/b/a$b:lxU	I
      //   871: iconst_1
      //   872: iadd
      //   873: putfield 63	com/tencent/mm/plugin/fts/b/a$b:lxU	I
      //   876: goto -357 -> 519
      //   879: aload 6
      //   881: invokeinterface 162 1 0
      //   886: aload_0
      //   887: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   890: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   893: invokevirtual 249	com/tencent/mm/plugin/fts/c/a:commit	()V
      //   896: aload_0
      //   897: ldc_w 341
      //   900: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   903: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   906: ifeq +11 -> 917
      //   909: new 182	java/lang/InterruptedException
      //   912: dup
      //   913: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   916: athrow
      //   917: aload_0
      //   918: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   921: getfield 223	com/tencent/mm/plugin/fts/b/a:laK	Lcom/tencent/mm/plugin/fts/a/h;
      //   924: ldc_w 343
      //   927: iconst_1
      //   928: anewarray 219	java/lang/String
      //   931: dup
      //   932: iconst_0
      //   933: aload_0
      //   934: getfield 55	com/tencent/mm/plugin/fts/b/a$b:lxQ	J
      //   937: invokestatic 242	java/lang/Long:toString	(J)Ljava/lang/String;
      //   940: aastore
      //   941: invokeinterface 246 3 0
      //   946: astore 6
      //   948: bipush 50
      //   950: istore_1
      //   951: aload 6
      //   953: invokeinterface 115 1 0
      //   958: ifeq +237 -> 1195
      //   961: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   964: ifeq +28 -> 992
      //   967: aload 6
      //   969: invokeinterface 162 1 0
      //   974: aload_0
      //   975: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   978: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   981: invokevirtual 249	com/tencent/mm/plugin/fts/c/a:commit	()V
      //   984: new 182	java/lang/InterruptedException
      //   987: dup
      //   988: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   991: athrow
      //   992: aload_0
      //   993: aload 6
      //   995: iconst_0
      //   996: invokeinterface 127 2 0
      //   1001: putfield 55	com/tencent/mm/plugin/fts/b/a$b:lxQ	J
      //   1004: aload 6
      //   1006: iconst_1
      //   1007: invokeinterface 119 2 0
      //   1012: astore 5
      //   1014: aload_0
      //   1015: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   1018: aload 5
      //   1020: invokevirtual 306	java/util/HashSet:remove	(Ljava/lang/Object;)Z
      //   1023: ifne -72 -> 951
      //   1026: aload 6
      //   1028: iconst_2
      //   1029: invokeinterface 119 2 0
      //   1034: astore 8
      //   1036: aload 6
      //   1038: iconst_3
      //   1039: invokeinterface 277 2 0
      //   1044: astore 7
      //   1046: getstatic 349	com/tencent/mm/plugin/fts/a/c$a:lwq	Ljava/util/regex/Pattern;
      //   1049: aload 8
      //   1051: invokevirtual 355	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;)[Ljava/lang/String;
      //   1054: astore 8
      //   1056: aload 8
      //   1058: new 9	com/tencent/mm/plugin/fts/b/a$b$1
      //   1061: dup
      //   1062: aload_0
      //   1063: invokespecial 358	com/tencent/mm/plugin/fts/b/a$b$1:<init>	(Lcom/tencent/mm/plugin/fts/b/a$b;)V
      //   1066: invokestatic 364	java/util/Arrays:sort	([Ljava/lang/Object;Ljava/util/Comparator;)V
      //   1069: aload_0
      //   1070: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   1073: aload 5
      //   1075: aload 8
      //   1077: invokevirtual 368	com/tencent/mm/plugin/fts/b/a:h	(Ljava/lang/String;[Ljava/lang/String;)I
      //   1080: istore_2
      //   1081: iload_2
      //   1082: iload_1
      //   1083: iadd
      //   1084: istore_2
      //   1085: iload_2
      //   1086: istore_1
      //   1087: iload_2
      //   1088: aload_0
      //   1089: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   1092: aload 5
      //   1094: aload_0
      //   1095: getfield 49	com/tencent/mm/plugin/fts/b/a$b:lxO	Ljava/util/HashMap;
      //   1098: aload 5
      //   1100: invokevirtual 134	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   1103: checkcast 251	com/tencent/mm/storage/x
      //   1106: aload 8
      //   1108: aload 7
      //   1110: aload_0
      //   1111: getfield 49	com/tencent/mm/plugin/fts/b/a$b:lxO	Ljava/util/HashMap;
      //   1114: invokevirtual 371	com/tencent/mm/plugin/fts/b/a:a	(Ljava/lang/String;Lcom/tencent/mm/storage/x;[Ljava/lang/String;[BLjava/util/HashMap;)I
      //   1117: iadd
      //   1118: istore_2
      //   1119: iload_2
      //   1120: istore_1
      //   1121: aload_0
      //   1122: aload_0
      //   1123: getfield 57	com/tencent/mm/plugin/fts/b/a$b:lxR	I
      //   1126: iconst_1
      //   1127: iadd
      //   1128: putfield 57	com/tencent/mm/plugin/fts/b/a$b:lxR	I
      //   1131: iload_2
      //   1132: istore_1
      //   1133: iload_2
      //   1134: bipush 50
      //   1136: if_icmplt -185 -> 951
      //   1139: aload_0
      //   1140: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   1143: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   1146: invokevirtual 249	com/tencent/mm/plugin/fts/c/a:commit	()V
      //   1149: aload_0
      //   1150: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   1153: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   1156: invokevirtual 309	com/tencent/mm/plugin/fts/c/a:beginTransaction	()V
      //   1159: iconst_0
      //   1160: istore_1
      //   1161: goto -210 -> 951
      //   1164: astore 5
      //   1166: ldc 76
      //   1168: aload 5
      //   1170: ldc_w 333
      //   1173: iconst_0
      //   1174: anewarray 335	java/lang/Object
      //   1177: invokestatic 339	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1180: aload_0
      //   1181: aload_0
      //   1182: getfield 63	com/tencent/mm/plugin/fts/b/a$b:lxU	I
      //   1185: iconst_1
      //   1186: iadd
      //   1187: putfield 63	com/tencent/mm/plugin/fts/b/a$b:lxU	I
      //   1190: iload_1
      //   1191: istore_2
      //   1192: goto -61 -> 1131
      //   1195: aload 6
      //   1197: invokeinterface 162 1 0
      //   1202: aload_0
      //   1203: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   1206: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   1209: invokevirtual 249	com/tencent/mm/plugin/fts/c/a:commit	()V
      //   1212: aload_0
      //   1213: ldc_w 373
      //   1216: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   1219: invokestatic 180	java/lang/Thread:interrupted	()Z
      //   1222: ifeq +11 -> 1233
      //   1225: new 182	java/lang/InterruptedException
      //   1228: dup
      //   1229: invokespecial 183	java/lang/InterruptedException:<init>	()V
      //   1232: athrow
      //   1233: aload_0
      //   1234: aload_0
      //   1235: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   1238: invokevirtual 169	java/util/HashSet:size	()I
      //   1241: putfield 61	com/tencent/mm/plugin/fts/b/a$b:lxT	I
      //   1244: aload_0
      //   1245: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   1248: invokevirtual 217	java/util/HashSet:iterator	()Ljava/util/Iterator;
      //   1251: astore 5
      //   1253: aload 5
      //   1255: invokeinterface 199 1 0
      //   1260: ifeq +53 -> 1313
      //   1263: aload 5
      //   1265: invokeinterface 203 1 0
      //   1270: checkcast 219	java/lang/String
      //   1273: astore 6
      //   1275: aload_0
      //   1276: getfield 32	com/tencent/mm/plugin/fts/b/a$b:lxL	Lcom/tencent/mm/plugin/fts/b/a;
      //   1279: getfield 98	com/tencent/mm/plugin/fts/b/a:lxw	Lcom/tencent/mm/plugin/fts/c/a;
      //   1282: getstatic 104	com/tencent/mm/plugin/fts/a/c:lwd	[I
      //   1285: aload 6
      //   1287: invokevirtual 376	com/tencent/mm/plugin/fts/c/a:a	([ILjava/lang/String;)V
      //   1290: ldc_w 378
      //   1293: invokestatic 384	com/tencent/mm/kernel/h:j	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
      //   1296: checkcast 378	com/tencent/mm/plugin/fts/PluginFTS
      //   1299: invokevirtual 388	com/tencent/mm/plugin/fts/PluginFTS:getTopHitsLogic	()Lcom/tencent/mm/plugin/fts/b/e;
      //   1302: getstatic 104	com/tencent/mm/plugin/fts/a/c:lwd	[I
      //   1305: aload 6
      //   1307: invokevirtual 393	com/tencent/mm/plugin/fts/b/e:c	([ILjava/lang/String;)V
      //   1310: goto -57 -> 1253
      //   1313: aload_0
      //   1314: getfield 91	com/tencent/mm/plugin/fts/b/a$b:lxN	Ljava/util/HashSet;
      //   1317: invokevirtual 234	java/util/HashSet:clear	()V
      //   1320: aload_0
      //   1321: getfield 49	com/tencent/mm/plugin/fts/b/a$b:lxO	Ljava/util/HashMap;
      //   1324: invokevirtual 210	java/util/HashMap:clear	()V
      //   1327: aload_0
      //   1328: ldc_w 395
      //   1331: invokevirtual 89	com/tencent/mm/plugin/fts/b/a$b:yS	(Ljava/lang/String;)V
      //   1334: invokestatic 399	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
      //   1337: pop
      //   1338: invokestatic 403	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
      //   1341: invokevirtual 409	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
      //   1344: getstatic 415	com/tencent/mm/storage/w$a:vyG	Lcom/tencent/mm/storage/w$a;
      //   1347: iconst_1
      //   1348: invokestatic 420	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1351: invokevirtual 425	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
      //   1354: ldc2_w 72
      //   1357: ldc 74
      //   1359: invokestatic 66	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   1362: iconst_1
      //   1363: ireturn
      //   1364: astore 5
      //   1366: goto -200 -> 1166
      //   1369: astore 5
      //   1371: goto -519 -> 852
      //   1374: goto -591 -> 783
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1377	0	this	b
      //   87	1104	1	i	int
      //   832	360	2	j	int
      //   96	490	3	l	long
      //   121	707	5	localObject1	Object
      //   850	5	5	localException1	Exception
      //   1012	87	5	str	String
      //   1164	5	5	localException2	Exception
      //   1251	13	5	localIterator	Iterator
      //   1364	1	5	localException3	Exception
      //   1369	1	5	localException4	Exception
      //   117	1189	6	localObject2	Object
      //   57	1052	7	localObject3	Object
      //   77	1030	8	localObject4	Object
      // Exception table:
      //   from	to	target	type
      //   837	847	850	java/lang/Exception
      //   1046	1081	1164	java/lang/Exception
      //   1087	1119	1364	java/lang/Exception
      //   1121	1131	1364	java/lang/Exception
      //   783	823	1369	java/lang/Exception
      //   823	833	1369	java/lang/Exception
    }
    
    public final int getId()
    {
      GMTrace.i(18528891568128L, 138051);
      GMTrace.o(18528891568128L, 138051);
      return 1;
    }
    
    public final String getName()
    {
      GMTrace.i(18528757350400L, 138050);
      GMTrace.o(18528757350400L, 138050);
      return "BuildContactIndexTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18528623132672L, 138049);
      String str = String.format("%s [build: %d newContact: %d, newChatroom: %d, remove: %d, dirty: %d, timestamp: %d, fail: %d]", new Object[] { super.toString(), Integer.valueOf(this.lxX), Integer.valueOf(this.lxS), Integer.valueOf(this.lxR), Integer.valueOf(this.lxT), Integer.valueOf(this.lxV), Integer.valueOf(this.lxW), Integer.valueOf(this.lxU) });
      GMTrace.o(18528623132672L, 138049);
      return str;
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public c()
    {
      GMTrace.i(18536944631808L, 138111);
      GMTrace.o(18536944631808L, 138111);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18537078849536L, 138112);
      a.this.lxw.h(com.tencent.mm.plugin.fts.a.c.lwb);
      GMTrace.o(18537078849536L, 138112);
      return true;
    }
  }
  
  private final class d
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String fKP;
    private int lxZ;
    
    public d(String paramString)
    {
      GMTrace.i(18537481502720L, 138115);
      this.lxZ = 0;
      this.fKP = paramString;
      GMTrace.o(18537481502720L, 138115);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18537615720448L, 138116);
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "Delete Contact %s", new Object[] { this.fKP });
      a.this.lxw.a(com.tencent.mm.plugin.fts.a.c.lwd, this.fKP);
      ((PluginFTS)com.tencent.mm.kernel.h.j(PluginFTS.class)).getTopHitsLogic().c(com.tencent.mm.plugin.fts.a.c.lwd, this.fKP);
      Object localObject1 = a.this.lxw.yZ(this.fKP);
      Object localObject2 = new HashSet();
      while (((Cursor)localObject1).moveToNext()) {
        ((HashSet)localObject2).add(((Cursor)localObject1).getString(0));
      }
      ((Cursor)localObject1).close();
      localObject1 = ((HashSet)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!a.this.lxy.containsKey(localObject2))
        {
          List localList = a.this.lxw.b(com.tencent.mm.plugin.fts.a.c.lwd, (String)localObject2);
          a.this.lxy.put(localObject2, localList);
          ((PluginFTS)com.tencent.mm.kernel.h.j(PluginFTS.class)).getTopHitsLogic().yX((String)localObject2);
          this.lxZ += 1;
        }
      }
      GMTrace.o(18537615720448L, 138116);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18537749938176L, 138117);
      StringBuilder localStringBuilder = new StringBuilder("DeleteContact(\"").append(this.fKP).append("\")");
      if (this.lxZ > 0) {}
      for (String str = " [dirty: " + this.lxZ + "]";; str = "")
      {
        str = str;
        GMTrace.o(18537749938176L, 138117);
        return str;
      }
    }
  }
  
  private final class e
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String fKP;
    private boolean fTM;
    
    public e(String paramString)
    {
      GMTrace.i(18534126059520L, 138090);
      this.fTM = false;
      this.fKP = paramString;
      GMTrace.o(18534126059520L, 138090);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18534260277248L, 138091);
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "Insert Contact %s", new Object[] { this.fKP });
      x localx = a.this.laK.yM(this.fKP);
      if ((localx != null) && (localx.field_username.length() > 0) && (a.this.D(localx))) {
        a.this.E(localx);
      }
      for (;;)
      {
        a.this.lxy.remove(this.fKP);
        a.this.lxx.remove(this.fKP);
        GMTrace.o(18534260277248L, 138091);
        return true;
        this.fTM = true;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(18534394494976L, 138092);
      StringBuilder localStringBuilder = new StringBuilder("InsertContact(\"").append(this.fKP).append("\")");
      if (this.fTM) {}
      for (String str = " [skipped]";; str = "")
      {
        str = str;
        GMTrace.o(18534394494976L, 138092);
        return str;
      }
    }
  }
  
  private final class f
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int lya;
    private int lyb;
    
    public f()
    {
      GMTrace.i(18538555244544L, 138123);
      this.lya = 0;
      this.lyb = 0;
      GMTrace.o(18538555244544L, 138123);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18538689462272L, 138124);
      Cursor localCursor = a.this.lxw.lvN.rawQuery("SELECT user, label_id FROM FTS5ContactLabels;", null);
      while (localCursor.moveToNext())
      {
        String str = localCursor.getString(0);
        long l = localCursor.getLong(1);
        List localList = (List)a.this.lxA.get(str);
        Object localObject = localList;
        if (localList == null)
        {
          localObject = new ArrayList(16);
          a.this.lxA.put(str, localObject);
          this.lya += 1;
        }
        ((List)localObject).add(Long.valueOf(l));
        this.lyb += 1;
      }
      localCursor.close();
      GMTrace.o(18538689462272L, 138124);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18538823680000L, 138125);
      String str = "LoadLabelCache [users: " + this.lya + ", labels: " + this.lyb + "]";
      GMTrace.o(18538823680000L, 138125);
      return str;
    }
  }
  
  private final class g
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int[] lyc;
    private int lyd;
    private int lye;
    
    public g(int[] paramArrayOfInt)
    {
      GMTrace.i(18532783882240L, 138080);
      this.lyd = 0;
      this.lye = 0;
      this.lyc = paramArrayOfInt;
      GMTrace.o(18532783882240L, 138080);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18532918099968L, 138081);
      Object localObject = a.this.lxw.e(this.lyc, 1);
      this.lyd = ((List)localObject).size();
      HashMap localHashMap = new HashMap();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.fts.a.a.b localb = (com.tencent.mm.plugin.fts.a.a.b)localIterator.next();
        String str = localb.lwH;
        if (!a.this.lxy.containsKey(str))
        {
          List localList = (List)localHashMap.get(str);
          localObject = localList;
          if (localList == null)
          {
            localObject = new ArrayList(16);
            localHashMap.put(str, localObject);
          }
          ((List)localObject).add(Long.valueOf(localb.lwG));
        }
      }
      a.this.lxy.putAll(localHashMap);
      this.lye = localHashMap.size();
      GMTrace.o(18532918099968L, 138081);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18533186535424L, 138083);
      GMTrace.o(18533186535424L, 138083);
      return "MarkAllContactDirtyTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18533052317696L, 138082);
      String str = String.format("%s [touched: " + this.lyd + ", users: " + this.lye + "]", new Object[] { super.toString() });
      GMTrace.o(18533052317696L, 138082);
      return str;
    }
  }
  
  private final class h
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String fKP;
    private boolean fTM;
    private boolean lyf;
    
    public h(String paramString)
    {
      GMTrace.i(18527146737664L, 138038);
      this.lyf = false;
      this.fTM = false;
      this.fKP = paramString;
      GMTrace.o(18527146737664L, 138038);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18527280955392L, 138039);
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "Dirty Contact %s", new Object[] { this.fKP });
      if (a.this.lxy.containsKey(this.fKP))
      {
        this.lyf = true;
        GMTrace.o(18527280955392L, 138039);
        return true;
      }
      Object localObject1 = a.this.lxw.b(com.tencent.mm.plugin.fts.a.c.lwd, this.fKP);
      a.this.lxy.put(this.fKP, localObject1);
      if (((List)localObject1).isEmpty())
      {
        this.fTM = true;
        a.this.fTu.a(65556, new a.e(a.this, this.fKP));
        GMTrace.o(18527280955392L, 138039);
        return true;
      }
      localObject1 = a.this.lxw.yZ(this.fKP);
      Object localObject2 = new HashSet();
      while (((Cursor)localObject1).moveToNext()) {
        ((HashSet)localObject2).add(((Cursor)localObject1).getString(0));
      }
      ((Cursor)localObject1).close();
      localObject1 = ((HashSet)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!a.this.lxy.containsKey(localObject2))
        {
          List localList = a.this.lxw.b(com.tencent.mm.plugin.fts.a.c.lwd, (String)localObject2);
          a.this.lxy.put(localObject2, localList);
        }
      }
      a.this.lxx.remove(this.fKP);
      ((PluginFTS)com.tencent.mm.kernel.h.j(PluginFTS.class)).getTopHitsLogic().yX(this.fKP);
      GMTrace.o(18527280955392L, 138039);
      return true;
    }
    
    public final int getId()
    {
      GMTrace.i(18527549390848L, 138041);
      GMTrace.o(18527549390848L, 138041);
      return 17;
    }
    
    public final String toString()
    {
      GMTrace.i(18527415173120L, 138040);
      StringBuilder localStringBuilder = new StringBuilder("MarkContactDirty(\"").append(this.fKP).append("\")");
      if (this.lyf)
      {
        str = " [cached]";
        localStringBuilder = localStringBuilder.append(str);
        if (!this.fTM) {
          break label81;
        }
      }
      label81:
      for (String str = " [skipped]";; str = "")
      {
        str = str;
        GMTrace.o(18527415173120L, 138040);
        return str;
        str = "";
        break;
      }
    }
  }
  
  private final class i
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private boolean lyg;
    private String username;
    
    public i(String paramString)
    {
      GMTrace.i(18529831092224L, 138058);
      this.username = paramString;
      GMTrace.o(18529831092224L, 138058);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18529965309952L, 138059);
      if (a.this.lxy.containsKey(this.username))
      {
        this.lyg = true;
        GMTrace.o(18529965309952L, 138059);
        return true;
      }
      if (!a.this.lxx.add(this.username))
      {
        this.lyg = true;
        GMTrace.o(18529965309952L, 138059);
        return true;
      }
      Object localObject = a.this.laK.yM(this.username);
      if ((localObject != null) && (!a.this.D((x)localObject)))
      {
        this.lyg = true;
        GMTrace.o(18529965309952L, 138059);
        return true;
      }
      localObject = a.this.lxw;
      String str = this.username;
      ((com.tencent.mm.plugin.fts.a.a)localObject).lvT.bindLong(1, 2L);
      ((com.tencent.mm.plugin.fts.a.a)localObject).lvT.bindString(2, str);
      ((com.tencent.mm.plugin.fts.a.a)localObject).lvT.bindLong(3, 0L);
      ((com.tencent.mm.plugin.fts.a.a)localObject).lvT.execute();
      GMTrace.o(18529965309952L, 138059);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18530099527680L, 138060);
      String str = String.format("MarkContactTimestampTask %s isSkip %b", new Object[] { this.username, Boolean.valueOf(this.lyg) });
      GMTrace.o(18530099527680L, 138060);
      return str;
    }
  }
  
  private final class j
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    private int[] fTN;
    private int[] fTO;
    
    public j(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18543387082752L, 138159);
      this.fTN = paramf.lwT;
      this.fTO = paramf.lwU;
      GMTrace.o(18543387082752L, 138159);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18543521300480L, 138160);
      Object localObject2 = a.this.lxw.a(paramArrayOfString, this.fTN, this.fTO);
      Object localObject1 = new HashMap();
      HashMap localHashMap = new HashMap();
      j localj;
      while (((Cursor)localObject2).moveToNext())
      {
        localj = new j().e((Cursor)localObject2);
        if (!paramf.lwW.contains(localj.lwH))
        {
          i locali;
          if (d.f(com.tencent.mm.plugin.fts.a.c.lwd, localj.type))
          {
            locali = (i)((HashMap)localObject1).get(localj.lwH);
            if ((locali == null) || (d.b(com.tencent.mm.plugin.fts.a.c.lwn, localj.gRk, locali.gRk) < 0)) {
              ((HashMap)localObject1).put(localj.lwH, localj);
            }
          }
          while (Thread.interrupted())
          {
            ((Cursor)localObject2).close();
            throw new InterruptedException();
            if (d.f(com.tencent.mm.plugin.fts.a.c.lwf, localj.type))
            {
              locali = (i)localHashMap.get(Long.valueOf(localj.lxe));
              if ((locali == null) || (d.b(com.tencent.mm.plugin.fts.a.c.lwn, localj.gRk, locali.gRk) < 0)) {
                localHashMap.put(Long.valueOf(localj.lxe), localj);
              }
            }
          }
        }
      }
      ((Cursor)localObject2).close();
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      localObject2 = new ArrayList(((HashMap)localObject1).size());
      localObject1 = ((HashMap)localObject1).values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localj = (j)((Iterator)localObject1).next();
        localj.aCl();
        localj.d(paramArrayOfString, this.lwP.eQb);
        ((ArrayList)localObject2).add(localj);
      }
      ((ArrayList)localObject2).addAll(localHashMap.values());
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      if (paramf.lwX != null) {
        Collections.sort((List)localObject2, paramf.lwX);
      }
      GMTrace.o(18543521300480L, 138160);
      return (List<i>)localObject2;
    }
    
    public final int getId()
    {
      GMTrace.i(18543789735936L, 138162);
      GMTrace.o(18543789735936L, 138162);
      return 11;
    }
    
    public final String getName()
    {
      GMTrace.i(18543655518208L, 138161);
      GMTrace.o(18543655518208L, 138161);
      return "SearchContactLogic.SearchTask";
    }
  }
  
  private final class k
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public k(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18536541978624L, 138108);
      GMTrace.o(18536541978624L, 138108);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18536676196352L, 138109);
      paramArrayOfString = a.this.lxw;
      paramf = paramf.eQb;
      Object localObject = String.format("SELECT aux_index FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075 ORDER BY timestamp desc", new Object[] { paramArrayOfString.aCf() });
      paramArrayOfString = paramArrayOfString.lvN.rawQuery((String)localObject, new String[] { paramf });
      paramf = new ArrayList();
      while (paramArrayOfString.moveToNext())
      {
        localObject = new i();
        ((i)localObject).lwH = paramArrayOfString.getString(0);
        paramf.add(localObject);
      }
      paramArrayOfString.close();
      GMTrace.o(18536676196352L, 138109);
      return paramf;
    }
    
    public final String getName()
    {
      GMTrace.i(18536810414080L, 138110);
      GMTrace.o(18536810414080L, 138110);
      return "SearchChatroomByMemberTask";
    }
  }
  
  private final class l
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public l(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18523522859008L, 138011);
      GMTrace.o(18523522859008L, 138011);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      int i = 0;
      GMTrace.i(18523657076736L, 138012);
      paramArrayOfString = a.this.lxw;
      paramf = paramf.eQb;
      paramArrayOfString = paramArrayOfString.lvN.rawQuery("SELECT count(*) FROM FTS5ChatRoomMembers WHERE member=?", new String[] { paramf });
      if (paramArrayOfString.moveToNext()) {
        i = paramArrayOfString.getInt(0);
      }
      paramArrayOfString.close();
      paramArrayOfString = new i();
      paramArrayOfString.userData = Integer.valueOf(i);
      paramf = new ArrayList();
      paramf.add(paramArrayOfString);
      GMTrace.o(18523657076736L, 138012);
      return paramf;
    }
    
    public final String getName()
    {
      GMTrace.i(18523791294464L, 138013);
      GMTrace.o(18523791294464L, 138013);
      return "SearchChatroomCountTask";
    }
  }
  
  private final class m
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public m(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18522717552640L, 138005);
      GMTrace.o(18522717552640L, 138005);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18522851770368L, 138006);
      Object localObject1 = a.this.lxw;
      paramf = paramf.eDs;
      paramArrayOfString = d.t(paramArrayOfString);
      Object localObject2 = String.format("SELECT aux_index FROM %s NOT INDEXED JOIN (SELECT docid, aux_index, timestamp FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=?) as temp ON (%s.rowid = temp.docid) WHERE %s MATCH '%s' ORDER BY -timestamp;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), paramArrayOfString });
      paramArrayOfString = ((com.tencent.mm.plugin.fts.a.a)localObject1).lvN.rawQuery((String)localObject2, new String[] { paramf, paramArrayOfString });
      paramf = new HashSet();
      localObject1 = new ArrayList();
      while (paramArrayOfString.moveToNext())
      {
        localObject2 = new i();
        ((i)localObject2).lwH = paramArrayOfString.getString(0);
        if (paramf.add(((i)localObject2).lwH)) {
          ((List)localObject1).add(localObject2);
        }
      }
      paramArrayOfString.close();
      GMTrace.o(18522851770368L, 138006);
      return (List<i>)localObject1;
    }
    
    public final String getName()
    {
      GMTrace.i(18522985988096L, 138007);
      GMTrace.o(18522985988096L, 138007);
      return "SearchChatroomInMemberTask";
    }
  }
  
  private final class n
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public n(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18539226333184L, 138128);
      GMTrace.o(18539226333184L, 138128);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18539360550912L, 138129);
      Object localObject2 = a.this.lxw.a(paramArrayOfString, new int[] { 131075 }, null);
      Object localObject1 = new HashMap();
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = ((Cursor)localObject2).getString(4);
        if (!paramf.lwW.contains(localObject3))
        {
          i = ((Cursor)localObject2).getInt(2);
          localObject3 = (i)((HashMap)localObject1).get(localObject3);
          if ((localObject3 == null) || (d.b(com.tencent.mm.plugin.fts.a.c.lwn, i, ((i)localObject3).gRk) < 0))
          {
            localObject3 = new j().e((Cursor)localObject2);
            ((HashMap)localObject1).put(((j)localObject3).lwH, localObject3);
          }
          if (Thread.interrupted())
          {
            ((Cursor)localObject2).close();
            throw new InterruptedException();
          }
        }
      }
      ((Cursor)localObject2).close();
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      localObject2 = new ArrayList(((HashMap)localObject1).size());
      Object localObject3 = ((HashMap)localObject1).values().iterator();
      Object localObject4;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (j)((Iterator)localObject3).next();
        ((j)localObject4).aCl();
        ((j)localObject4).d(paramArrayOfString, this.lwP.eQb);
        ((ArrayList)localObject2).add(localObject4);
      }
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      if (paramf.lwX != null) {
        Collections.sort((List)localObject2, paramf.lwX);
      }
      localObject1 = new ArrayList(((HashMap)localObject1).size());
      localObject3 = new StringBuffer();
      int i = 0;
      while (i < ((ArrayList)localObject2).size())
      {
        localObject4 = (i)((ArrayList)localObject2).get(i);
        ((StringBuffer)localObject3).append(((i)localObject4).lwM);
        ((StringBuffer)localObject3).append("|");
        ((StringBuffer)localObject3).append(((i)localObject4).timestamp);
        ((StringBuffer)localObject3).append(" ");
        ((ArrayList)localObject1).add(localObject4);
        if (i >= paramf.lwV) {
          break;
        }
        i += 1;
      }
      if ((paramArrayOfString.length > 1) && (a.this.lxw.w(paramArrayOfString)))
      {
        paramArrayOfString = new i();
        paramArrayOfString.lwH = "create_chatroom​";
        ((ArrayList)localObject1).add(0, paramArrayOfString);
        ((StringBuffer)localObject3).append(" needCreateChatroom");
      }
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "rank score: %s", new Object[] { ((StringBuffer)localObject3).toString() });
      GMTrace.o(18539360550912L, 138129);
      return (List<i>)localObject1;
    }
    
    public final int getId()
    {
      GMTrace.i(18539628986368L, 138131);
      GMTrace.o(18539628986368L, 138131);
      return 19;
    }
    
    public final String getName()
    {
      GMTrace.i(18539494768640L, 138130);
      GMTrace.o(18539494768640L, 138130);
      return "SearchChatroomTask";
    }
  }
  
  public final class o
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public o(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18530904834048L, 138066);
      GMTrace.o(18530904834048L, 138066);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18531039051776L, 138067);
      paramf = bg.g(paramf.eQb.split(","));
      paramArrayOfString = a.this.lxw;
      Object localObject = new StringBuffer();
      ((StringBuffer)localObject).append("member IN (");
      int i = 0;
      while (i < paramf.size())
      {
        ((StringBuffer)localObject).append("'");
        ((StringBuffer)localObject).append((String)paramf.get(i));
        ((StringBuffer)localObject).append("'");
        if (i != paramf.size() - 1) {
          ((StringBuffer)localObject).append(",");
        }
        i += 1;
      }
      ((StringBuffer)localObject).append(")");
      paramf = String.format("SELECT member, chatroom, entity_id FROM FTS5ChatRoomMembers, %s WHERE %s AND chatroom = aux_index", new Object[] { paramArrayOfString.aCf(), ((StringBuffer)localObject).toString() });
      localObject = paramArrayOfString.lvN.rawQuery(paramf, null);
      paramf = new HashMap();
      if (((Cursor)localObject).moveToNext())
      {
        String str = ((Cursor)localObject).getString(0);
        if (paramf.containsKey(str)) {}
        for (paramArrayOfString = (List)paramf.get(str);; paramArrayOfString = new ArrayList())
        {
          i locali = new i();
          locali.lwH = ((Cursor)localObject).getString(1);
          locali.lxe = ((Cursor)localObject).getLong(2);
          paramArrayOfString.add(locali);
          paramf.put(str, paramArrayOfString);
          break;
        }
      }
      ((Cursor)localObject).close();
      paramArrayOfString = new ArrayList();
      localObject = new i();
      ((i)localObject).userData = paramf;
      paramArrayOfString.add(localObject);
      GMTrace.o(18531039051776L, 138067);
      return paramArrayOfString;
    }
    
    public final String getName()
    {
      GMTrace.i(18531173269504L, 138068);
      GMTrace.o(18531173269504L, 138068);
      return "SearchCommonChatroomTask";
    }
  }
  
  public final class p
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public p(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18537884155904L, 138118);
      GMTrace.o(18537884155904L, 138118);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18538018373632L, 138119);
      long l = Long.valueOf(paramf.eQb).longValue();
      paramArrayOfString = a.this.lxw;
      paramf = String.format("SELECT distinct(aux_index) FROM %s WHERE timestamp < %d AND type = %d", new Object[] { paramArrayOfString.aCf(), Long.valueOf(l), Integer.valueOf(131072) });
      paramArrayOfString = paramArrayOfString.lvN.rawQuery(paramf, null);
      paramf = new ArrayList();
      while (paramArrayOfString.moveToNext())
      {
        i locali = new i();
        locali.lwH = paramArrayOfString.getString(0);
        paramf.add(locali);
      }
      paramArrayOfString.close();
      GMTrace.o(18538018373632L, 138119);
      return paramf;
    }
    
    public final String getName()
    {
      GMTrace.i(18538152591360L, 138120);
      GMTrace.o(18538152591360L, 138120);
      return "SearchContactSmallerTimestampTask";
    }
  }
  
  private final class q
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public q(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18544460824576L, 138167);
      GMTrace.o(18544460824576L, 138167);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18544595042304L, 138168);
      Object localObject2 = a.this.lxw;
      Object localObject1 = paramf.lwT;
      Object localObject3 = d.t(paramArrayOfString);
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        localObject1 = " AND type IN " + d.j((int[])localObject1);
        localObject1 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, 1, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + (String)localObject1 + " AND status >= 0 ORDER BY subtype;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject2).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject2).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject2).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject2).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject2).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject2).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject2).aCg(), localObject3 });
        localObject1 = ((com.tencent.mm.plugin.fts.a.a)localObject2).lvN.rawQuery((String)localObject1, null);
        localObject2 = new ArrayList();
        localObject3 = new HashSet();
        ((HashSet)localObject3).addAll(paramf.lwW);
        i = 0;
      }
      label342:
      for (;;)
      {
        if (!((Cursor)localObject1).moveToNext()) {
          break label344;
        }
        if (((HashSet)localObject3).add(((Cursor)localObject1).getString(3)))
        {
          j localj = new j().e((Cursor)localObject1);
          if (i >= localj.gRk) {
            ((List)localObject2).add(localj);
          }
          for (;;)
          {
            if (!Thread.interrupted()) {
              break label342;
            }
            ((Cursor)localObject1).close();
            throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
            localObject1 = "";
            break;
            if (((List)localObject2).size() > paramf.lwV) {
              break label344;
            }
            i = localj.gRk;
            ((List)localObject2).add(localj);
          }
        }
      }
      label344:
      ((Cursor)localObject1).close();
      localObject1 = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (j)((Iterator)localObject2).next();
        ((j)localObject3).aCl();
        ((j)localObject3).d(paramArrayOfString, this.lwP.eQb);
        ((ArrayList)localObject1).add(localObject3);
      }
      if (paramf.lwX != null) {
        Collections.sort((List)localObject1, paramf.lwX);
      }
      if (Thread.interrupted()) {
        throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
      }
      paramArrayOfString = new StringBuffer();
      localObject2 = new ArrayList();
      int i = 0;
      while (i < ((ArrayList)localObject1).size())
      {
        localObject3 = (i)((ArrayList)localObject1).get(i);
        paramArrayOfString.append(((i)localObject3).lwM);
        paramArrayOfString.append(" ");
        ((List)localObject2).add(localObject3);
        if (i >= paramf.lwV) {
          break;
        }
        i += 1;
      }
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "getName() rank score: %s", new Object[] { paramArrayOfString.toString() });
      if (Thread.interrupted()) {
        throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
      }
      GMTrace.o(18544595042304L, 138168);
      return (List<i>)localObject2;
    }
    
    public final int getId()
    {
      GMTrace.i(18544863477760L, 138170);
      GMTrace.o(18544863477760L, 138170);
      return 20;
    }
    
    public final String getName()
    {
      GMTrace.i(18544729260032L, 138169);
      GMTrace.o(18544729260032L, 138169);
      return "SearchContactTask";
    }
  }
  
  private final class r
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public r(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18521106939904L, 137993);
      GMTrace.o(18521106939904L, 137993);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18521241157632L, 137994);
      yS("start");
      Object localObject1 = a.this.lxw;
      Object localObject2 = paramf.eQb;
      Object localObject3 = d.t(paramArrayOfString);
      long l = System.currentTimeMillis();
      localObject3 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, -1, type, subtype) AS Offsets, MMChatroomRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, entity_id) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 ORDER BY Rank, timestamp desc ;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), Long.valueOf(l - 1209600000L), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), localObject3 });
      localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject1).lvN.rawQuery((String)localObject3, new String[] { localObject2 });
      localObject1 = new ArrayList();
      localObject3 = new HashSet();
      ((HashSet)localObject3).addAll(paramf.lwW);
      while (((Cursor)localObject2).moveToNext()) {
        if (((HashSet)localObject3).add(((Cursor)localObject2).getString(4)))
        {
          j localj = new j();
          localj.lxc = ((Cursor)localObject2).getLong(0);
          localj.type = ((Cursor)localObject2).getInt(1);
          localj.gRk = ((Cursor)localObject2).getInt(2);
          localj.lxe = ((Cursor)localObject2).getLong(3);
          localj.lwH = ((Cursor)localObject2).getString(4);
          localj.timestamp = ((Cursor)localObject2).getLong(5);
          localj.content = ((Cursor)localObject2).getString(6);
          localj.lxg = ((Cursor)localObject2).getString(7);
          localj.lxm = ((Cursor)localObject2).getLong(8);
          if (((List)localObject1).size() <= paramf.lwV)
          {
            ((List)localObject1).add(localj);
            if (Thread.interrupted())
            {
              ((Cursor)localObject2).close();
              throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
            }
          }
        }
      }
      ((Cursor)localObject2).close();
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      yS("orm");
      localObject2 = new ArrayList(((List)localObject1).size());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (j)((Iterator)localObject1).next();
        ((j)localObject3).aCl();
        ((j)localObject3).d(paramArrayOfString, this.lwP.eQb);
        ((ArrayList)localObject2).add(localObject3);
      }
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      if (paramf.lwX != null) {
        Collections.sort((List)localObject2, paramf.lwX);
      }
      yS("calOffsets");
      if ((paramArrayOfString.length > 1) && (a.this.lxw.w(paramArrayOfString)))
      {
        paramArrayOfString = new i();
        paramArrayOfString.lwH = "create_chatroom​";
        if (((ArrayList)localObject2).size() <= 3) {
          break label616;
        }
        ((ArrayList)localObject2).add(3, paramArrayOfString);
      }
      for (;;)
      {
        yS("checkChatroom");
        GMTrace.o(18521241157632L, 137994);
        return (List<i>)localObject2;
        label616:
        ((ArrayList)localObject2).add(paramArrayOfString);
      }
    }
    
    public final int getId()
    {
      GMTrace.i(18521509593088L, 137996);
      GMTrace.o(18521509593088L, 137996);
      return 25;
    }
    
    public final String getName()
    {
      GMTrace.i(18521375375360L, 137995);
      GMTrace.o(18521375375360L, 137995);
      return "SearchTopChatroomInnerRankTask";
    }
  }
  
  private final class s
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public s(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18540836945920L, 138140);
      GMTrace.o(18540836945920L, 138140);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18540971163648L, 138141);
      Object localObject1 = a.this.lxw;
      Object localObject2 = d.t(paramArrayOfString);
      long l = System.currentTimeMillis();
      localObject2 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, 1, type, subtype), CASE WHEN timestamp - %d > 0 THEN 1 ELSE 0 END AS time_range FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131072 ORDER BY time_range desc, subtype ;", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), Long.valueOf(l - 1105032704L), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject1).aCg(), localObject2 });
      localObject1 = ((com.tencent.mm.plugin.fts.a.a)localObject1).lvN.rawQuery((String)localObject2, null);
      localObject2 = new ArrayList();
      Object localObject3 = new HashSet();
      ((HashSet)localObject3).addAll(paramf.lwW);
      int i = 0;
      while (((Cursor)localObject1).moveToNext()) {
        if (((HashSet)localObject3).add(((Cursor)localObject1).getString(4)))
        {
          j localj = new j().e((Cursor)localObject1);
          if (i >= localj.gRk) {
            ((List)localObject2).add(localj);
          }
          while (Thread.interrupted())
          {
            ((Cursor)localObject1).close();
            throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
            if (((List)localObject2).size() > paramf.lwV) {
              break label296;
            }
            i = localj.gRk;
            ((List)localObject2).add(localj);
          }
        }
      }
      label296:
      ((Cursor)localObject1).close();
      localObject1 = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (j)((Iterator)localObject2).next();
        ((j)localObject3).aCl();
        ((j)localObject3).d(paramArrayOfString, this.lwP.eQb);
        ((ArrayList)localObject1).add(localObject3);
      }
      if (paramf.lwX != null) {
        Collections.sort((List)localObject1, paramf.lwX);
      }
      if (Thread.interrupted()) {
        throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
      }
      paramArrayOfString = new StringBuffer();
      localObject2 = new ArrayList();
      i = 0;
      while (i < ((ArrayList)localObject1).size())
      {
        localObject3 = (i)((ArrayList)localObject1).get(i);
        paramArrayOfString.append(((i)localObject3).lwM);
        paramArrayOfString.append("|");
        paramArrayOfString.append(((i)localObject3).lxm);
        paramArrayOfString.append(" ");
        ((List)localObject2).add(localObject3);
        if (i >= paramf.lwV) {
          break;
        }
        i += 1;
      }
      w.i("MicroMsg.FTS.FTS5SearchContactLogic", "getName() rank score: %s", new Object[] { paramArrayOfString.toString() });
      if (Thread.interrupted()) {
        throw new InterruptedException("Task is Cancel: " + this.lwP.eQb);
      }
      GMTrace.o(18540971163648L, 138141);
      return (List<i>)localObject2;
    }
    
    public final int getId()
    {
      GMTrace.i(18541239599104L, 138143);
      GMTrace.o(18541239599104L, 138143);
      return 22;
    }
    
    public final String getName()
    {
      GMTrace.i(18541105381376L, 138142);
      GMTrace.o(18541105381376L, 138142);
      return "SearchTopContactTask";
    }
  }
  
  private final class t
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int lyh;
    private int lyi;
    private int lyj;
    
    public t()
    {
      GMTrace.i(18534528712704L, 138093);
      this.lyh = 0;
      this.lyi = 0;
      this.lyj = 0;
      GMTrace.o(18534528712704L, 138093);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18534662930432L, 138094);
      yS("start");
      Object localObject1 = a.this.lxy.entrySet().iterator();
      int i = 50;
      if (((Iterator)localObject1).hasNext())
      {
        if (Thread.interrupted())
        {
          a.this.lxw.commit();
          throw new InterruptedException();
        }
        if (i < 50) {
          break label533;
        }
        a.this.lxw.commit();
        a.this.lxw.beginTransaction();
        i = 0;
      }
      label527:
      label533:
      for (;;)
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        Object localObject3 = ((List)((Map.Entry)localObject2).getValue()).iterator();
        long l;
        while (((Iterator)localObject3).hasNext())
        {
          l = ((Long)((Iterator)localObject3).next()).longValue();
          a.this.lxw.h(Long.valueOf(l));
          i += 1;
        }
        localObject2 = (String)((Map.Entry)localObject2).getKey();
        localObject3 = a.this.laK.yM((String)localObject2);
        if ((localObject3 != null) && (((com.tencent.mm.g.b.af)localObject3).field_username.length() > 0) && (a.this.D((x)localObject3))) {
          i += a.this.E((x)localObject3);
        }
        for (;;)
        {
          ((Iterator)localObject1).remove();
          a.this.lxx.remove(localObject2);
          this.lyh += 1;
          break;
          yS("dirtyContact");
          localObject1 = a.this.lxx.iterator();
          if (((Iterator)localObject1).hasNext())
          {
            if (Thread.interrupted())
            {
              a.this.lxw.commit();
              throw new InterruptedException();
            }
            if (i < 50) {
              break label527;
            }
            a.this.lxw.commit();
            a.this.lxw.beginTransaction();
            i = 0;
          }
          for (;;)
          {
            localObject2 = (String)((Iterator)localObject1).next();
            l = a.this.laK.yO((String)localObject2);
            localObject3 = a.this.laK.yM((String)localObject2);
            if ((localObject3 != null) && (((com.tencent.mm.g.b.af)localObject3).field_username.length() > 0) && (a.this.D((x)localObject3)))
            {
              a.this.lxw.x((String)localObject2, l);
              i += 1;
            }
            for (;;)
            {
              ((Iterator)localObject1).remove();
              this.lyi += 1;
              break;
              a.this.lxw.commit();
              yS("timestampContact");
              localObject1 = ((PluginFTS)com.tencent.mm.kernel.h.j(PluginFTS.class)).getTopHitsLogic();
              ((e)localObject1).lyO.clear();
              this.lyj = ((e)localObject1).lyN.aCv();
              yS("topHits");
              GMTrace.o(18534662930432L, 138094);
              return true;
            }
          }
        }
      }
    }
    
    public final int getId()
    {
      GMTrace.i(18535065583616L, 138097);
      GMTrace.o(18535065583616L, 138097);
      return 16;
    }
    
    public final String getName()
    {
      GMTrace.i(18534931365888L, 138096);
      GMTrace.o(18534931365888L, 138096);
      return "UpdateDirtyAndTimestampContactTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18534797148160L, 138095);
      String str = String.format("%s [Dirty: %d Timestamp: %d tophitsCount: %d]", new Object[] { super.toString(), Integer.valueOf(this.lyh), Integer.valueOf(this.lyi), Integer.valueOf(this.lyj) });
      GMTrace.o(18534797148160L, 138095);
      return str;
    }
  }
  
  private final class u
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private long lyk;
    private int lyl;
    
    public u(long paramLong)
    {
      GMTrace.i(18539763204096L, 138132);
      this.lyl = 0;
      this.lyk = paramLong;
      GMTrace.o(18539763204096L, 138132);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18539897421824L, 138133);
      Object localObject1 = new ArrayList(32);
      Object localObject2 = a.this.lxw;
      long l = this.lyk;
      localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject2).lvN.rawQuery("SELECT user FROM FTS5ContactLabels WHERE label_id=?;", new String[] { Long.toString(l) });
      while (((Cursor)localObject2).moveToNext()) {
        ((ArrayList)localObject1).add(((Cursor)localObject2).getString(0));
      }
      ((Cursor)localObject2).close();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!a.this.lxy.containsKey(localObject2))
        {
          List localList = a.this.lxw.b(com.tencent.mm.plugin.fts.a.c.lwe, (String)localObject2);
          a.this.lxy.put(localObject2, localList);
        }
      }
      GMTrace.o(18539897421824L, 138133);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18540031639552L, 138134);
      String str = "UpdateLabel(" + this.lyk + ") [contacts: " + this.lyl + "]";
      GMTrace.o(18540031639552L, 138134);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */