package com.tencent.mm.bu;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.DBDumpUtil;
import com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public class g
  implements com.tencent.mm.sdk.e.e
{
  public String TAG;
  public int field_MARK_CURSOR_CHECK_IGNORE;
  private long iWI;
  protected e vCT;
  private a vDu;
  public a vDv;
  private String vDw;
  public String vDx;
  public final LinkedList<b> vDy;
  private ae vDz;
  
  public g()
  {
    GMTrace.i(13560151277568L, 101031);
    this.field_MARK_CURSOR_CHECK_IGNORE = 1;
    this.TAG = "MicroMsg.SqliteDB";
    this.vCT = null;
    this.vDu = null;
    this.vDv = new a();
    this.vDw = "";
    this.vDx = "";
    this.vDy = new LinkedList();
    this.vDz = null;
    this.iWI = 0L;
    GMTrace.o(13560151277568L, 101031);
  }
  
  public g(a parama)
  {
    GMTrace.i(13560017059840L, 101030);
    this.field_MARK_CURSOR_CHECK_IGNORE = 1;
    this.TAG = "MicroMsg.SqliteDB";
    this.vCT = null;
    this.vDu = null;
    this.vDv = new a();
    this.vDw = "";
    this.vDx = "";
    this.vDy = new LinkedList();
    this.vDz = null;
    this.iWI = 0L;
    this.vDu = parama;
    GMTrace.o(13560017059840L, 101030);
  }
  
  private void UW(String paramString)
  {
    GMTrace.i(13560822366208L, 101036);
    String str1 = ab.vM();
    String str2 = ab.getPackageName();
    w.i(this.TAG, "check process :[%s] [%s] path[%s]", new Object[] { str1, str2, paramString });
    if ((str1 != null) && (str2 != null) && (!str2.equals(str1))) {
      Assert.assertTrue("processName:" + str1 + "  packagename:" + str2, false);
    }
    GMTrace.o(13560822366208L, 101036);
  }
  
  public static String ej(String paramString)
  {
    GMTrace.i(13561761890304L, 101043);
    if (bg.nm(paramString))
    {
      GMTrace.o(13561761890304L, 101043);
      return "";
    }
    paramString = DatabaseUtils.sqlEscapeString(paramString);
    GMTrace.o(13561761890304L, 101043);
    return paramString;
  }
  
  public final boolean UX(String paramString)
  {
    GMTrace.i(13563640938496L, 101057);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(13563640938496L, 101057);
      return false;
    }
    try
    {
      this.vCT.execSQL("DROP TABLE " + paramString);
      GMTrace.o(13563640938496L, 101057);
      return false;
    }
    catch (Exception paramString)
    {
      d.oqe.a(181L, 11L, 1L, false);
      w.e(this.TAG, "drop table Error :" + paramString.getMessage());
      b.h(paramString);
      GMTrace.o(13563640938496L, 101057);
    }
    return false;
  }
  
  public final long a(String paramString1, String paramString2, ContentValues paramContentValues, boolean paramBoolean)
  {
    GMTrace.i(16006537805824L, 119258);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(16006537805824L, 119258);
      return -2L;
    }
    b.begin();
    try
    {
      long l = this.vCT.insert(paramString1, paramString2, paramContentValues);
      b.a(paramString1, null, this.iWI);
      GMTrace.o(16006537805824L, 119258);
      return l;
    }
    catch (Exception paramString1)
    {
      d.oqe.a(181L, 11L, 1L, false);
      w.e(this.TAG, "insert Error :" + paramString1.getMessage());
      b.h(paramString1);
      if (paramBoolean) {
        throw paramString1;
      }
      GMTrace.o(16006537805824L, 119258);
    }
    return -1L;
  }
  
  public final Cursor a(final String paramString, final String[] paramArrayOfString, int paramInt)
  {
    GMTrace.i(13562298761216L, 101047);
    if (!bg.nm(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen()) {
        break;
      }
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      paramString = c.bVe();
      GMTrace.o(13562298761216L, 101047);
      return paramString;
    }
    b.begin();
    try
    {
      paramArrayOfString = this.vCT.a(paramString, paramArrayOfString, paramInt);
      if ((com.tencent.mm.sdk.a.b.bPo()) || (com.tencent.mm.sdk.a.b.bPq()))
      {
        if (this.vDz == null)
        {
          localObject = com.tencent.mm.sdk.f.e.SV("CheckCursor");
          ((HandlerThread)localObject).start();
          this.vDz = new ae(((HandlerThread)localObject).getLooper());
        }
        final Object localObject = new c();
        this.vDz.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(13556527398912L, 101004);
            long l1;
            boolean bool1;
            Object localObject7;
            int i;
            Object localObject8;
            Object localObject9;
            try
            {
              l1 = bg.Pv();
              if (paramArrayOfString != null)
              {
                bool1 = paramArrayOfString.isClosed();
                if (!bool1) {}
              }
              else
              {
                GMTrace.o(13556527398912L, 101004);
                return;
              }
              localObject7 = new HashMap();
              i = 0;
              Object localObject1 = null;
              synchronized (g.this.vDy)
              {
                localObject8 = g.this.vDy.iterator();
                if (!((Iterator)localObject8).hasNext()) {
                  break label558;
                }
                localObject9 = (g.b)((Iterator)localObject8).next();
                if ((localObject9 == null) || (((g.b)localObject9).vDD == null) || (((g.b)localObject9).vDD.isClosed())) {
                  ((Iterator)localObject8).remove();
                }
              }
              if ((l1 - ((g.b)localObject9).lastReportTime) / 1000L <= 100L) {
                break label315;
              }
            }
            catch (Exception localException1)
            {
              w.e(g.this.TAG, "checkCursor table:[%s] e:%s[%s]", new Object[] { paramString, localException1.getMessage(), bg.f(localException1) });
              GMTrace.o(13556527398912L, 101004);
              return;
            }
            ((g.b)localObject9).lastReportTime = l1;
            if (((g.b)localObject9).vDG) {
              if (TextUtils.isEmpty(((g.b)localObject9).vDH)) {
                w.w(g.this.TAG, "CheckCursorRES time:%d MSG: BadOut cu:%s caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l1 - ((g.b)localObject9).vDF), Integer.valueOf(((g.b)localObject9).vDD.hashCode()), ((g.b)localObject9).vDE, Boolean.valueOf(((g.b)localObject9).vDG), ((g.b)localObject9).vDH });
              }
            }
            label315:
            int j;
            label352:
            label367:
            Object localObject3;
            for (;;)
            {
              ??? = (Pair)((HashMap)localObject7).get(((g.b)localObject9).vDE);
              if (??? != null) {
                break label1286;
              }
              if (l1 - ((g.b)localObject9).vDF <= 30000L) {
                break label1292;
              }
              j = 1;
              ??? = new Pair(Integer.valueOf(j), localObject9);
              if (i >= ((Integer)((Pair)???).first).intValue()) {
                break;
              }
              i = ((Integer)((Pair)???).first).intValue();
              localObject3 = ((g.b)((Pair)???).second).vDI;
              break;
              w.w(g.this.TAG, "CheckCursorRES time:%d MSG: Adapter cu:%s caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l1 - ((g.b)localObject9).vDF), Integer.valueOf(((g.b)localObject9).vDD.hashCode()), ((g.b)localObject9).vDE, Boolean.valueOf(((g.b)localObject9).vDG), ((g.b)localObject9).vDH });
              continue;
              w.w(g.this.TAG, "CheckCursorRES time:%d MSG: NOTCLOSE cu:%s caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l1 - ((g.b)localObject9).vDF), Integer.valueOf(((g.b)localObject9).vDD.hashCode()), ((g.b)localObject9).vDE, Boolean.valueOf(((g.b)localObject9).vDG), ((g.b)localObject9).vDH });
            }
            label558:
            w.d(g.this.TAG, "CheckCursor: checkAss max:%d list:%d map:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(g.this.vDy.size()), Integer.valueOf(((HashMap)localObject7).size()) });
            label617:
            label645:
            label815:
            long l2;
            if (com.tencent.mm.sdk.a.b.bPo())
            {
              j = 20;
              if (i <= j)
              {
                j = g.this.vDy.size();
                if (!com.tencent.mm.sdk.a.b.bPo()) {
                  break label1311;
                }
                i = 50;
              }
              else
              {
                localObject8 = ((HashMap)localObject7).keySet().iterator();
                Pair localPair;
                for (??? = ""; ((Iterator)localObject8).hasNext(); ??? = (String)??? + (String)localObject9 + "," + localPair.first + "," + ((g.b)localPair.second).vDG + "," + ((g.b)localPair.second).vDH + ";")
                {
                  localObject9 = (String)((Iterator)localObject8).next();
                  localPair = (Pair)((HashMap)localObject7).get(localObject9);
                }
                if (localObject3 != null)
                {
                  ??? = new g.c((String)???);
                  ((g.c)???).setStackTrace(((g.c)localObject3).getStackTrace());
                  throw ((Throwable)???);
                }
                throw new AssertionError(???);
                l2 = bg.Pv();
                localObject3 = new g.b();
                ((g.b)localObject3).vDD = paramArrayOfString;
                ((g.b)localObject3).vmw = paramString;
                ((g.b)localObject3).vDF = l1;
                ((g.b)localObject3).vDE = "";
                ((g.b)localObject3).vDG = true;
                ((g.b)localObject3).vDI = localObject;
                ??? = localObject.getStackTrace();
                j = 0;
              }
            }
            for (;;)
            {
              if (j < ???.length)
              {
                localObject8 = ???[j].getClassName();
                ??? = ???[j].getMethodName();
                i = ???[j].getLineNumber();
                localObject7 = ((String)localObject8).replace("com.tencent.mm.", "") + ":" + (String)??? + "(" + i + ")";
                localObject8 = Class.forName((String)localObject8);
              }
              for (;;)
              {
                try
                {
                  localObject9 = ((Class)localObject8).getDeclaredField("field_MARK_CURSOR_CHECK_IGNORE");
                  if (localObject9 == null) {
                    continue;
                  }
                  i = 1;
                }
                catch (Exception localException2)
                {
                  int k;
                  boolean bool2;
                  label1286:
                  label1292:
                  label1311:
                  i = 0;
                  continue;
                  j += 1;
                }
                if (i != 0) {
                  continue;
                }
                if (TextUtils.isEmpty(((g.b)localObject3).vDE))
                {
                  ((g.b)localObject3).vDE = ((String)localObject7);
                  localObject7 = ((Class)localObject8).getMethods();
                  k = localObject7.length;
                  bool1 = false;
                  i = 0;
                  bool2 = bool1;
                  if (i < k)
                  {
                    localObject8 = localObject7[i];
                    if (((Method)localObject8).getName().equals(???))
                    {
                      bool1 = ((Method)localObject8).getReturnType().getName().contains(".Cursor");
                      bool2 = bool1;
                      if (bool1 != true) {}
                    }
                  }
                  else
                  {
                    ((g.b)localObject3).vDG = bool2;
                    continue;
                  }
                }
                else
                {
                  if (((g.b)localObject3).vDG)
                  {
                    ??? = ((String)localObject7).toLowerCase();
                    if ((!((String)???).contains("cursor")) && (!((String)???).contains("adapter"))) {
                      continue;
                    }
                    ((g.b)localObject3).vDH = ((String)localObject7);
                    continue;
                  }
                  if (TextUtils.isEmpty(((g.b)localObject3).vDE)) {
                    ((g.b)localObject3).vDE = ah.b((StackTraceElement[])???);
                  }
                  synchronized (g.this.vDy)
                  {
                    g.this.vDy.add(localObject3);
                    w.d(g.this.TAG, "checkCursor insert [%d,%d] caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(bg.aH(l1)), ((g.b)localObject3).vDE, Boolean.valueOf(((g.b)localObject3).vDG), ((g.b)localObject3).vDH });
                    GMTrace.o(13556527398912L, 101004);
                    return;
                  }
                  continue;
                  break label367;
                  break;
                  j = 0;
                  break label352;
                  if (j > i)
                  {
                    break label645;
                    j = 50;
                    break label617;
                    i = 100;
                    continue;
                  }
                  break label815;
                }
                i += 1;
                continue;
                i = 0;
              }
            }
          }
        }, 500L);
      }
      b.a(paramString, paramArrayOfString, this.iWI);
      GMTrace.o(13562298761216L, 101047);
      return paramArrayOfString;
    }
    catch (Exception paramString)
    {
      d.oqe.a(181L, 10L, 1L, false);
      w.e(this.TAG, "execSQL Error :" + paramString.getMessage());
      b.h(paramString);
      paramString = c.bVe();
      GMTrace.o(13562298761216L, 101047);
    }
    return paramString;
  }
  
  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    GMTrace.i(13562164543488L, 101046);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      paramString1 = c.bVe();
      GMTrace.o(13562164543488L, 101046);
      return paramString1;
    }
    b.begin();
    try
    {
      paramArrayOfString1 = this.vCT.a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramInt);
      b.a(paramString1, paramArrayOfString1, this.iWI);
      GMTrace.o(13562164543488L, 101046);
      return paramArrayOfString1;
    }
    catch (Exception paramString1)
    {
      d.oqe.a(181L, 10L, 1L, false);
      w.e(this.TAG, "execSQL Error :" + paramString1.getMessage());
      b.h(paramString1);
      paramString1 = c.bVe();
      GMTrace.o(13562164543488L, 101046);
    }
    return paramString1;
  }
  
  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, HashMap<Integer, d> paramHashMap)
  {
    GMTrace.i(13561225019392L, 101039);
    boolean bool = a(paramString1, paramString2, "", paramLong, paramString3, paramHashMap, true);
    GMTrace.o(13561225019392L, 101039);
    return bool;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, HashMap<Integer, d> paramHashMap, boolean paramBoolean)
  {
    GMTrace.i(13561090801664L, 101038);
    int i = paramString1.lastIndexOf("/");
    if (i != -1) {
      this.TAG = (this.TAG + "." + paramString1.substring(i + 1));
    }
    UW(paramString2);
    if ((this.vDv.a(paramString1, paramString2, paramString3, paramLong, paramString4, paramHashMap, paramBoolean)) && (this.vDv.vCT != null))
    {
      this.vDx = this.vDv.getError();
      this.vCT = this.vDv.vCT;
      GMTrace.o(13561090801664L, 101038);
      return true;
    }
    this.vDx = this.vDv.getError();
    this.vCT = null;
    this.vDv = null;
    w.i(this.TAG, "initDB failed. %s", new Object[] { this.vDx });
    GMTrace.o(13561090801664L, 101038);
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, List<String> paramList, DBDumpUtil.ExecuteSqlCallback paramExecuteSqlCallback)
  {
    GMTrace.i(14899107332096L, 111007);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(14899107332096L, 111007);
      return false;
    }
    boolean bool = DBDumpUtil.doRecoveryDb(this.vCT.vDc, paramString1, paramString2, paramString3, paramList, null, paramExecuteSqlCallback, true);
    GMTrace.o(14899107332096L, 111007);
    return bool;
  }
  
  public final int aL(long paramLong)
  {
    int i = 0;
    for (;;)
    {
      long l1;
      long l2;
      try
      {
        GMTrace.i(13563909373952L, 101059);
        l1 = bg.Pv();
        l2 = Thread.currentThread().getId();
        w.i(this.TAG, "endTransaction thr:%d ticket:(%d,%d) db:%b  {%s} ", new Object[] { Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(this.iWI), Boolean.valueOf(isOpen()), bg.bQW() });
        if (!isOpen())
        {
          w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
          i = -4;
          GMTrace.o(13563909373952L, 101059);
          return i;
        }
        if (paramLong != this.iWI)
        {
          w.e(this.TAG, "ERROR endTransaction ticket:" + paramLong + " transactionTicket:" + this.iWI);
          i = -1;
          GMTrace.o(13563909373952L, 101059);
          continue;
        }
        l3 = paramLong >> 32 & 0x7FFFFFFF;
      }
      finally {}
      long l3;
      if (l3 != l2)
      {
        w.e(this.TAG, "FORBID: endTrans UNKNOW_THREAD ticket:%s ParamID:%d nowThr:%d", new Object[] { Long.toHexString(paramLong), Long.valueOf(l3), Long.valueOf(l2) });
        i = -2;
        GMTrace.o(13563909373952L, 101059);
      }
      else
      {
        try
        {
          b.begin();
          this.vCT.endTransaction();
          w.i(this.TAG, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d) db:%b  {%s} ", new Object[] { Long.valueOf(bg.aH(l1)), Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(this.iWI), Boolean.valueOf(isOpen()), bg.bQW() });
          b.a("endTrans", null, 0L);
          this.iWI = 0L;
          if (this.vDu != null) {
            this.vDu.xq();
          }
          GMTrace.o(13563909373952L, 101059);
        }
        catch (Exception localException)
        {
          w.e(this.TAG, "endTransaction Error :" + localException.getMessage());
          d.oqe.a(181L, 9L, 1L, false);
          b.h(localException);
          i = -3;
          GMTrace.o(13563909373952L, 101059);
        }
      }
    }
  }
  
  public final boolean b(String paramString, HashMap<Integer, d> paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13560956583936L, 101037);
    int i = paramString.lastIndexOf("/");
    if (i != -1) {
      this.TAG = (this.TAG + "." + paramString.substring(i + 1));
    }
    UW(paramString);
    if ((this.vDv.a(paramString, paramHashMap, true, paramBoolean2)) && (this.vDv.vCT != null))
    {
      this.vCT = this.vDv.vCT;
      GMTrace.o(13560956583936L, 101037);
      return true;
    }
    this.vCT = null;
    this.vDv = null;
    w.e(this.TAG, "initDB failed.");
    GMTrace.o(13560956583936L, 101037);
    return false;
  }
  
  public final boolean bRk()
  {
    GMTrace.i(13560688148480L, 101035);
    if ((this.vCT == null) || (!this.vCT.isOpen()))
    {
      GMTrace.o(13560688148480L, 101035);
      return true;
    }
    GMTrace.o(13560688148480L, 101035);
    return false;
  }
  
  public final SQLiteDatabase bVk()
  {
    GMTrace.i(14899241549824L, 111008);
    if (this.vCT.vDc != null)
    {
      localSQLiteDatabase = this.vCT.vDc;
      GMTrace.o(14899241549824L, 111008);
      return localSQLiteDatabase;
    }
    SQLiteDatabase localSQLiteDatabase = this.vCT.vDd;
    GMTrace.o(14899241549824L, 111008);
    return localSQLiteDatabase;
  }
  
  public final long cE(long paramLong)
  {
    for (;;)
    {
      long l;
      try
      {
        GMTrace.i(13563775156224L, 101058);
        l = Thread.currentThread().getId();
        w.i(this.TAG, "beginTransaction thr:(%d,%d) ticket:%d db:%b  {%s}", new Object[] { Long.valueOf(paramLong), Long.valueOf(l), Long.valueOf(this.iWI), Boolean.valueOf(isOpen()), bg.bQW() });
        if (!isOpen())
        {
          w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
          paramLong = -4L;
          GMTrace.o(13563775156224L, 101058);
          return paramLong;
        }
        if (this.iWI > 0L)
        {
          w.e(this.TAG, "ERROR beginTransaction transactionTicket:" + this.iWI);
          paramLong = -1L;
          GMTrace.o(13563775156224L, 101058);
          continue;
        }
        if (af.isMainThread()) {
          break label232;
        }
      }
      finally {}
      if (paramLong == -1L)
      {
        w.e(this.TAG, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
        paramLong = -2L;
        GMTrace.o(13563775156224L, 101058);
      }
      else
      {
        try
        {
          label232:
          b.begin();
          this.vCT.beginTransaction();
          b.a("beginTrans", null, 0L);
          this.iWI = (bg.Pv() & 0x7FFFFFFF);
          this.iWI = ((l & 0x7FFFFFFF) << 32 | this.iWI);
          if (this.vDu != null) {
            this.vDu.xp();
          }
          paramLong = this.iWI;
          GMTrace.o(13563775156224L, 101058);
        }
        catch (Exception localException)
        {
          d.oqe.a(181L, 8L, 1L, false);
          w.e(this.TAG, "beginTransaction Error :" + localException.getMessage());
          b.h(localException);
          paramLong = -3L;
          GMTrace.o(13563775156224L, 101058);
        }
      }
    }
  }
  
  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    GMTrace.i(13563506720768L, 101056);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(13563506720768L, 101056);
      return -2;
    }
    b.begin();
    try
    {
      int i = this.vCT.delete(paramString1, paramString2, paramArrayOfString);
      b.a(paramString1, null, this.iWI);
      GMTrace.o(13563506720768L, 101056);
      return i;
    }
    catch (Exception paramString1)
    {
      d.oqe.a(181L, 11L, 1L, false);
      w.e(this.TAG, "delete Error :" + paramString1.getMessage());
      b.h(paramString1);
      GMTrace.o(13563506720768L, 101056);
    }
    return -1;
  }
  
  public void dk(String paramString)
  {
    GMTrace.i(13560553930752L, 101034);
    if (this.vCT == null)
    {
      GMTrace.o(13560553930752L, 101034);
      return;
    }
    if (this.vDu != null) {
      this.vDu.xo();
    }
    w.w(this.TAG, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", new Object[] { Boolean.valueOf(inTransaction()), Long.toHexString(this.iWI), Long.valueOf(Thread.currentThread().getId()), bg.bQW() });
    com.tencent.mm.compatible.util.g.a locala = new com.tencent.mm.compatible.util.g.a();
    if (paramString != null) {
      this.vDw = paramString;
    }
    this.vCT.close();
    this.vCT = null;
    w.d(this.TAG, "end close db time:%d", new Object[] { Long.valueOf(locala.tD()) });
    GMTrace.o(13560553930752L, 101034);
  }
  
  public final boolean eZ(String paramString1, String paramString2)
  {
    GMTrace.i(13562969849856L, 101052);
    if (!bg.nm(paramString2)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen()) {
        break;
      }
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(13562969849856L, 101052);
      return false;
    }
    b.begin();
    try
    {
      this.vCT.execSQL(paramString2);
      b.a(paramString2, null, this.iWI);
      GMTrace.o(13562969849856L, 101052);
      return true;
    }
    catch (Exception paramString1)
    {
      d.oqe.a(181L, 11L, 1L, false);
      paramString2 = paramString1.getMessage();
      w.e(this.TAG, "execSQL Error :" + paramString2);
      if ((paramString2 != null) && (paramString2.contains("no such table")))
      {
        paramString2 = this.vDv;
        w.d("MicroMsg.DBInit", "resetIniCache iniFilename:%s", new Object[] { paramString2.vCU });
        com.tencent.mm.loader.stub.b.deleteFile(paramString2.vCU);
        Assert.assertTrue("clean ini cache and reboot", false);
      }
      b.h(paramString1);
      GMTrace.o(13562969849856L, 101052);
    }
    return false;
  }
  
  protected void finalize()
  {
    GMTrace.i(13560285495296L, 101032);
    dk(null);
    GMTrace.o(13560285495296L, 101032);
  }
  
  public final String getKey()
  {
    GMTrace.i(13561493454848L, 101041);
    if (this.vDv == null)
    {
      GMTrace.o(13561493454848L, 101041);
      return null;
    }
    String str = this.vDv.amf;
    GMTrace.o(13561493454848L, 101041);
    return str;
  }
  
  public final long getPageSize()
  {
    GMTrace.i(13562701414400L, 101050);
    long l = this.vCT.vDc.getPageSize();
    GMTrace.o(13562701414400L, 101050);
    return l;
  }
  
  public final String getPath()
  {
    GMTrace.i(13561627672576L, 101042);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(13561627672576L, 101042);
      return null;
    }
    String str = this.vCT.getPath();
    GMTrace.o(13561627672576L, 101042);
    return str;
  }
  
  /* Error */
  public final boolean inTransaction()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 548
    //   7: ldc_w 550
    //   10: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: invokevirtual 164	com/tencent/mm/bu/g:isOpen	()Z
    //   17: ifne +35 -> 52
    //   20: aload_0
    //   21: getfield 58	com/tencent/mm/bu/g:TAG	Ljava/lang/String;
    //   24: ldc -90
    //   26: iconst_1
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: invokestatic 170	com/tencent/mm/sdk/platformtools/bg:bQW	()Lcom/tencent/mm/sdk/platformtools/ah;
    //   35: aastore
    //   36: invokestatic 173	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: ldc2_w 548
    //   42: ldc_w 550
    //   45: invokestatic 85	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: aload_0
    //   49: monitorexit
    //   50: iload_1
    //   51: ireturn
    //   52: aload_0
    //   53: getfield 82	com/tencent/mm/bu/g:iWI	J
    //   56: lconst_0
    //   57: lcmp
    //   58: ifle +17 -> 75
    //   61: ldc2_w 548
    //   64: ldc_w 550
    //   67: invokestatic 85	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: iconst_1
    //   71: istore_1
    //   72: goto -24 -> 48
    //   75: ldc2_w 548
    //   78: ldc_w 550
    //   81: invokestatic 85	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: goto -36 -> 48
    //   87: astore_2
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	g
    //   1	71	1	bool	boolean
    //   87	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	48	87	finally
    //   52	70	87	finally
    //   75	84	87	finally
  }
  
  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    GMTrace.i(13563104067584L, 101053);
    long l = a(paramString1, paramString2, paramContentValues, false);
    GMTrace.o(13563104067584L, 101053);
    return l;
  }
  
  public final boolean isOpen()
  {
    GMTrace.i(13561359237120L, 101040);
    if ((this.vCT != null) && (this.vCT.isOpen()))
    {
      GMTrace.o(13561359237120L, 101040);
      return true;
    }
    Assert.assertTrue("DB has been closed :[" + this.vDw + "]", bg.nm(this.vDw));
    GMTrace.o(13561359237120L, 101040);
    return false;
  }
  
  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(13562030325760L, 101045);
    paramString1 = a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, 0);
    GMTrace.o(13562030325760L, 101045);
    return paramString1;
  }
  
  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(13562432978944L, 101048);
    paramString = a(paramString, paramArrayOfString, 0);
    GMTrace.o(13562432978944L, 101048);
    return paramString;
  }
  
  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    GMTrace.i(13563372503040L, 101055);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(13563372503040L, 101055);
      return -2L;
    }
    b.begin();
    try
    {
      long l = this.vCT.replace(paramString1, paramString2, paramContentValues);
      b.a(paramString1, null, this.iWI);
      GMTrace.o(13563372503040L, 101055);
      return l;
    }
    catch (Exception paramString1)
    {
      d.oqe.a(181L, 11L, 1L, false);
      w.e(this.TAG, "repalce  Error :" + paramString1.getMessage());
      b.h(paramString1);
      GMTrace.o(13563372503040L, 101055);
    }
    return -1L;
  }
  
  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    GMTrace.i(13563238285312L, 101054);
    if (!isOpen())
    {
      w.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bg.bQW() });
      GMTrace.o(13563238285312L, 101054);
      return -2;
    }
    b.begin();
    try
    {
      int i = this.vCT.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
      b.a(paramString1, null, this.iWI);
      GMTrace.o(13563238285312L, 101054);
      return i;
    }
    catch (Exception paramString1)
    {
      d.oqe.a(181L, 11L, 1L, false);
      w.e(this.TAG, "update Error :" + paramString1.getMessage());
      b.h(paramString1);
      GMTrace.o(13563238285312L, 101054);
    }
    return -1;
  }
  
  public void yE()
  {
    GMTrace.i(13560419713024L, 101033);
    dk(null);
    GMTrace.o(13560419713024L, 101033);
  }
  
  public static abstract interface a
  {
    public abstract void xo();
    
    public abstract void xp();
    
    public abstract void xq();
  }
  
  public static final class b
  {
    public long lastReportTime;
    public Cursor vDD;
    public String vDE;
    public long vDF;
    public boolean vDG;
    public String vDH;
    public g.c vDI;
    public String vmw;
    
    public b()
    {
      GMTrace.i(13564848898048L, 101066);
      GMTrace.o(13564848898048L, 101066);
    }
  }
  
  private static final class c
    extends AssertionError
  {
    c()
    {
      GMTrace.i(20310497689600L, 151325);
      GMTrace.o(20310497689600L, 151325);
    }
    
    c(String paramString)
    {
      super();
      GMTrace.i(20310631907328L, 151326);
      GMTrace.o(20310631907328L, 151326);
    }
  }
  
  public static abstract interface d
  {
    public abstract String[] rf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */