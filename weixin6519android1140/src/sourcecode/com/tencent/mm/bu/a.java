package com.tencent.mm.bu;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.app.c;
import com.tencent.mm.compatible.d.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public final class a
{
  private static final Pattern vCS;
  String amf;
  private String eAR;
  e vCT;
  String vCU;
  public boolean vCV;
  private boolean vCW;
  String vCX;
  
  static
  {
    GMTrace.i(13543642497024L, 100908);
    vCS = Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);
    GMTrace.o(13543642497024L, 100908);
  }
  
  public a()
  {
    GMTrace.i(13542300319744L, 100898);
    this.vCU = "";
    this.vCV = false;
    this.vCW = false;
    this.vCX = "";
    this.eAR = "";
    GMTrace.o(13542300319744L, 100898);
  }
  
  private static void a(e parame)
  {
    GMTrace.i(13543239843840L, 100905);
    if (parame.vDc != null) {}
    for (parame = parame.vDc;; parame = parame.vDd)
    {
      parame = parame.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT count(*) FROM sqlite_master;", null, null);
      if (parame.moveToFirst()) {
        break;
      }
      throw new SQLiteException("Cannot get count for sqlite_master");
    }
    parame.close();
    GMTrace.o(13543239843840L, 100905);
  }
  
  private boolean a(String paramString1, long paramLong, String paramString2, boolean paramBoolean, String paramString3)
  {
    GMTrace.i(18924162777088L, 140996);
    if (this.vCT != null) {
      throw new AssertionError();
    }
    this.amf = g.n((paramString2 + paramLong).getBytes()).substring(0, 7);
    if (!FileOp.aZ(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      this.vCW = bool;
      try
      {
        this.vCT = e.t(paramString1, this.amf, paramBoolean);
        a(this.vCT);
        GMTrace.o(18924162777088L, 140996);
        return true;
      }
      catch (SQLiteException localSQLiteException)
      {
        if (!(localSQLiteException instanceof SQLiteDatabaseCorruptException)) {
          break;
        }
      }
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        paramString3 = p.getDeviceID(ab.getContext());
        int j = i;
        if (paramString3 != null)
        {
          j = i;
          if (!paramString3.equals(paramString2))
          {
            j = 0;
            paramString2 = g.n((paramString3 + paramLong).getBytes()).substring(0, 7);
            try
            {
              this.vCT = e.t(paramString1, paramString2, paramBoolean);
              a(this.vCT);
              this.amf = paramString2;
              k.sI().set(258, paramString3);
              d.oqe.a(181L, 5L, 1L, false);
              GMTrace.o(18924162777088L, 140996);
              return true;
            }
            catch (SQLiteException paramString2)
            {
              if ((paramString2 instanceof SQLiteDatabaseCorruptException)) {
                j = 1;
              }
            }
          }
        }
        if ((this.vCT == null) && (j != 0))
        {
          if (!paramBoolean) {
            i = 42;
          }
          for (;;)
          {
            d.oqe.a(181L, i, 1L, true);
            e.UU(paramString1);
            try
            {
              this.vCT = e.t(paramString1, this.amf, paramBoolean);
              a(this.vCT);
              this.vCW = true;
              d.oqe.a(181L, 6L, 1L, false);
              GMTrace.o(18924162777088L, 140996);
              return true;
            }
            catch (SQLiteException paramString1)
            {
              d.oqe.a(181L, 7L, 1L, false);
            }
            if (e.bVj()) {
              i = 43;
            } else {
              i = 41;
            }
          }
        }
      }
      for (;;)
      {
        if (this.vCT != null)
        {
          this.vCT.close();
          this.vCT = null;
        }
        this.amf = null;
        GMTrace.o(18924162777088L, 140996);
        return false;
        if ((paramString3 != null) && (paramString3.length() > 0))
        {
          if (!FileOp.aZ(paramString3)) {}
          for (bool = true;; bool = false)
          {
            this.vCW = bool;
            try
            {
              this.vCT = e.t(paramString3, this.amf, paramBoolean);
              a(this.vCT);
              d.oqe.a(181L, 6L, 1L, false);
              GMTrace.o(18924162777088L, 140996);
              return true;
            }
            catch (SQLiteException paramString1)
            {
              d.oqe.a(181L, 7L, 1L, false);
            }
          }
        }
      }
    }
  }
  
  private boolean a(HashMap<Integer, g.d> paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13543508279296L, 100907);
    if (paramHashMap == null) {}
    Object localObject3;
    for (int i = -1;; i = paramHashMap.size())
    {
      w.d("MicroMsg.DBInit", "createtables checkCreateIni:%b  tables:%d", new Object[] { Boolean.valueOf(paramBoolean1), Integer.valueOf(i) });
      localObject1 = "";
      if (!paramBoolean1) {
        break label332;
      }
      this.vCU = (this.vCT.getPath() + ".ini");
      localObject1 = new StringBuilder();
      if (paramHashMap == null) {
        break;
      }
      localObject2 = paramHashMap.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (g.d)((Iterator)localObject2).next();
        if (((g.d)localObject3).rf() == null)
        {
          w.e("MicroMsg.DBInit", "factory.getSQLs() is null: %s", new Object[] { localObject3.getClass().toString() });
          Assert.assertTrue("factory.getSQLs() is null:" + localObject3.getClass().toString(), false);
        }
        localObject3 = ((g.d)localObject3).rf();
        j = localObject3.length;
        i = 0;
        while (i < j)
        {
          ((StringBuilder)localObject1).append(localObject3[i].hashCode());
          i += 1;
        }
      }
    }
    Object localObject2 = g.n(((StringBuilder)localObject1).toString().getBytes());
    Object localObject1 = localObject2;
    if (!paramBoolean2)
    {
      localObject3 = com.tencent.mm.sdk.e.a.getValue(this.vCU, "createmd5");
      localObject1 = localObject2;
      if (!bg.nm((String)localObject3))
      {
        localObject1 = localObject2;
        if (((String)localObject2).equals(localObject3))
        {
          w.i("MicroMsg.DBInit", "Create table factories not changed , no need create !  %s", new Object[] { this.vCT.getPath() });
          GMTrace.o(13543508279296L, 100907);
          return true;
        }
      }
    }
    label332:
    this.vCT.execSQL("pragma auto_vacuum = 0 ");
    localObject2 = new g.a();
    this.vCT.beginTransaction();
    if (paramHashMap != null)
    {
      paramHashMap = paramHashMap.values().iterator();
      i = 0;
      String str;
      label566:
      for (;;)
      {
        j = i;
        if (!paramHashMap.hasNext()) {
          break;
        }
        localObject3 = ((g.d)paramHashMap.next()).rf();
        int k = localObject3.length;
        j = 0;
        for (;;)
        {
          if (j >= k) {
            break label566;
          }
          str = localObject3[j];
          try
          {
            this.vCT.execSQL(str);
            i += 1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              Matcher localMatcher = vCS.matcher(str);
              if ((localMatcher != null) && (localMatcher.matches())) {
                Assert.assertTrue("CreateTable failed:[" + str + "][" + localException.getMessage() + "]", false);
              } else {
                w.w("MicroMsg.DBInit", "CreateTable failed:[" + str + "][" + localException.getMessage() + "]");
              }
            }
          }
          j += 1;
        }
      }
    }
    int j = 0;
    long l = ((g.a)localObject2).tD();
    this.vCT.endTransaction();
    w.i("MicroMsg.DBInit", "createtables end sql:%d trans:%d sqlCount:%d", new Object[] { Long.valueOf(l), Long.valueOf(((g.a)localObject2).tD()), Integer.valueOf(j) });
    if (paramBoolean1) {
      com.tencent.mm.sdk.e.a.ah(this.vCU, "createmd5", (String)localObject1);
    }
    GMTrace.o(13543508279296L, 100907);
    return true;
  }
  
  private void fi(String paramString1, String paramString2)
  {
    GMTrace.i(13542568755200L, 100900);
    HashSet localHashSet = new HashSet();
    Object localObject = this.vCT.a("select * from " + paramString1 + " limit 1 ", null, 0);
    if (((Cursor)localObject).getCount() == 0)
    {
      ((Cursor)localObject).close();
      GMTrace.o(13542568755200L, 100900);
      return;
    }
    ((Cursor)localObject).moveToFirst();
    int i = 0;
    while (i < ((Cursor)localObject).getColumnCount())
    {
      localHashSet.add(((Cursor)localObject).getColumnName(i));
      i += 1;
    }
    ((Cursor)localObject).close();
    Cursor localCursor = this.vCT.a("PRAGMA table_info( " + paramString2 + " )", null, 0);
    localObject = "";
    while (localCursor.moveToNext())
    {
      String str = localCursor.getString(localCursor.getColumnIndex("name"));
      if (localHashSet.contains(str))
      {
        localObject = (String)localObject + str;
        localObject = (String)localObject + ",";
      }
    }
    localCursor.close();
    localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1);
    paramString1 = "insert into " + paramString2 + "(" + (String)localObject + ") select " + (String)localObject + " from " + paramString1 + ";";
    this.vCT.execSQL(paramString1);
    GMTrace.o(13542568755200L, 100900);
  }
  
  private boolean fj(String paramString1, String paramString2)
  {
    GMTrace.i(13542702972928L, 100901);
    Cursor localCursor = this.vCT.a("select DISTINCT  tbl_name from sqlite_master;", null, 0);
    if (localCursor == null)
    {
      GMTrace.o(13542702972928L, 100901);
      return false;
    }
    for (;;)
    {
      try
      {
        if (bg.nm(paramString2))
        {
          this.vCT.execSQL("ATTACH DATABASE '" + paramString1 + "' AS old KEY ''");
          this.vCT.beginTransaction();
          int i = 0;
          if (i >= localCursor.getCount()) {
            break label349;
          }
          localCursor.moveToPosition(i);
          paramString1 = this.vCT.a("select * from old.sqlite_master where tbl_name = '" + localCursor.getString(0) + "'", null, 0);
          if (paramString1 == null) {
            break label384;
          }
          j = paramString1.getCount();
          paramString1.close();
          if (j == 0)
          {
            w.w("MicroMsg.DBInit", "In old db not found :" + localCursor.getString(0));
            i += 1;
            continue;
          }
        }
        else
        {
          this.vCT.execSQL("ATTACH DATABASE '" + paramString1 + "' AS old KEY '" + paramString2 + "'");
          continue;
        }
        try
        {
          fi("old." + localCursor.getString(0), localCursor.getString(0));
        }
        catch (Exception paramString1)
        {
          w.w("MicroMsg.DBInit", "Insertselect FAILED :" + localCursor.getString(0));
        }
      }
      catch (SQLiteDatabaseCorruptException paramString2)
      {
        w.e("MicroMsg.DBInit", "Attached database is corrupted: " + paramString1);
        FileOp.deleteFile(paramString1);
        throw paramString2;
      }
      continue;
      label349:
      this.vCT.endTransaction();
      localCursor.close();
      this.vCT.execSQL("DETACH DATABASE old;");
      GMTrace.o(13542702972928L, 100901);
      return true;
      label384:
      int j = 0;
    }
  }
  
  private boolean fk(String paramString1, String paramString2)
  {
    GMTrace.i(13543105626112L, 100904);
    if (fj(paramString1, paramString2))
    {
      w.i("MicroMsg.DBInit", "system transfer success ,delete it path %s", new Object[] { paramString1 });
      w.i("MicroMsg.DBInit", "delete result :%b", new Object[] { Boolean.valueOf(b.deleteFile(paramString1)) });
      GMTrace.o(13543105626112L, 100904);
      return true;
    }
    w.i("MicroMsg.DBInit", "system transfer fail path %s", new Object[] { paramString1 });
    GMTrace.o(13543105626112L, 100904);
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, HashMap<Integer, g.d> paramHashMap, boolean paramBoolean)
  {
    GMTrace.i(13542971408384L, 100903);
    boolean bool1;
    boolean bool3;
    boolean bool4;
    int i;
    label101:
    label134:
    int j;
    if (!bg.nm(paramString2))
    {
      bool1 = true;
      Assert.assertTrue("create SqliteDB enDbCachePath == null ", bool1);
      this.vCX = (paramString2 + ".errreport");
      if (this.vCT != null)
      {
        this.vCT.close();
        this.vCT = null;
      }
      boolean bool2 = com.tencent.mm.a.e.aZ(paramString2);
      bool3 = com.tencent.mm.a.e.aZ(paramString1);
      bool4 = com.tencent.mm.a.e.aZ(paramString3);
      if ((bool2) || (!bool3)) {
        break label277;
      }
      i = 1;
      this.vCV = a(paramString2, paramLong, paramString4, e.bVi(), paramString3);
      boolean bool5 = this.vCV;
      if (this.vCT == null) {
        break label283;
      }
      bool1 = true;
      w.i("MicroMsg.DBInit", "initDb(en) path:%s enExist:%b oldExist:%b copyold:%b dbopenSUCC:%b db:%b thr:%s", new Object[] { paramString2, Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(true), Boolean.valueOf(bool5), Boolean.valueOf(bool1), Thread.currentThread().getName() });
      if ((this.vCT == null) || (this.vCT.getPath().equals(paramString3)) || (!bool4)) {
        break label413;
      }
      j = 1;
      w.i("MicroMsg.DBInit", "backup db exsits, copy data to en db");
    }
    for (;;)
    {
      a(paramHashMap, paramBoolean, this.vCW);
      if ((!bool3) && (!bool4))
      {
        GMTrace.o(13542971408384L, 100903);
        return true;
        bool1 = false;
        break;
        label277:
        i = 0;
        break label101;
        label283:
        bool1 = false;
        break label134;
      }
      if (j != 0)
      {
        this.amf = g.n((paramString4 + paramLong).getBytes()).substring(0, 7);
        fk(paramString3, this.amf);
        c.d(201L, 1L);
      }
      if (i != 0)
      {
        System.currentTimeMillis();
        paramBoolean = fk(paramString1, "");
        c.d(200L, 1L);
        GMTrace.o(13542971408384L, 100903);
        return paramBoolean;
      }
      if (this.vCT != null)
      {
        GMTrace.o(13542971408384L, 100903);
        return true;
      }
      GMTrace.o(13542971408384L, 100903);
      return false;
      label413:
      j = 0;
    }
  }
  
  public final boolean a(String paramString, HashMap<Integer, g.d> paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13542837190656L, 100902);
    if (this.vCT != null)
    {
      this.vCT.close();
      this.vCT = null;
    }
    boolean bool = com.tencent.mm.a.e.aZ(paramString);
    for (;;)
    {
      try
      {
        w.i("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(bool), paramString });
        this.vCT = e.aX(paramString, paramBoolean2);
        if (!bool)
        {
          paramBoolean2 = true;
          a(paramHashMap, paramBoolean1, paramBoolean2);
          GMTrace.o(13542837190656L, 100902);
          return true;
        }
      }
      catch (SQLiteException paramString)
      {
        GMTrace.o(13542837190656L, 100902);
        return false;
      }
      paramBoolean2 = false;
    }
  }
  
  public final String getError()
  {
    GMTrace.i(13542434537472L, 100899);
    if ((bg.nm(this.eAR)) || (bg.nm(this.vCX)))
    {
      GMTrace.o(13542434537472L, 100899);
      return "";
    }
    if (!bg.nm(com.tencent.mm.sdk.e.a.getValue(this.vCX, "Reported")))
    {
      GMTrace.o(13542434537472L, 100899);
      return "";
    }
    com.tencent.mm.sdk.e.a.ah(this.vCX, "Reported", "true");
    String str = this.eAR;
    GMTrace.o(13542434537472L, 100899);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */