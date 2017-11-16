package com.tencent.mm.plugin.appbrand.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class j
  extends com.tencent.mm.sdk.e.j
{
  public static final String[] hIQ;
  public final g hKn;
  final b hNc;
  public final c hNd;
  
  static
  {
    GMTrace.i(10019353395200L, 74650);
    hIQ = new String[] { i.a(a.hJW, "AppBrandLauncherLayoutItem") };
    GMTrace.o(10019353395200L, 74650);
  }
  
  public j(g paramg)
  {
    GMTrace.i(10017608564736L, 74637);
    this.hNd = new c();
    this.hKn = paramg;
    this.hNc = new b(paramg);
    GMTrace.o(10017608564736L, 74637);
  }
  
  private void TH()
  {
    GMTrace.i(10018548088832L, 74644);
    Object localObject1 = this.hKn.a(String.format(Locale.US, "select count(*) from %s where %s=?", new Object[] { "AppBrandLauncherLayoutItem", "scene" }), new String[] { "2" }, 0);
    int i;
    if (localObject1 == null) {
      i = 0;
    }
    while (i > 200)
    {
      Object localObject2 = a(new String[] { "recordId", "brandId", "versionType" }, Integer.MAX_VALUE, 200);
      if (localObject2 == null)
      {
        GMTrace.o(10018548088832L, 74644);
        return;
        i = 0;
        if (((Cursor)localObject1).moveToFirst()) {
          i = ((Cursor)localObject1).getInt(0);
        }
        ((Cursor)localObject1).close();
      }
      else
      {
        localObject1 = new LinkedList();
        ArrayList localArrayList1 = new ArrayList(i - 200);
        ArrayList localArrayList2 = new ArrayList(i - 200);
        if (((Cursor)localObject2).moveToFirst()) {
          do
          {
            ((List)localObject1).add(String.valueOf(((Cursor)localObject2).getInt(0)));
            localArrayList1.add(((Cursor)localObject2).getString(1));
            localArrayList2.add(Integer.valueOf(((Cursor)localObject2).getInt(2)));
          } while (((Cursor)localObject2).moveToNext());
        }
        ((Cursor)localObject2).close();
        if (bg.cc((List)localObject1))
        {
          GMTrace.o(10018548088832L, 74644);
          return;
        }
        long l = this.hKn.cE(Thread.currentThread().getId());
        localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          this.hKn.delete("AppBrandLauncherLayoutItem", String.format(Locale.US, "%s=?", new Object[] { "recordId" }), new String[] { localObject3 });
        }
        this.hKn.aL(l);
        localObject2 = new ArrayList(localArrayList1.size());
        Object localObject3 = new ArrayList(localArrayList1.size());
        i = 0;
        while (i < localArrayList1.size())
        {
          String str = q.pu((String)localArrayList1.get(i));
          if (!bg.nm(str))
          {
            ((List)localObject2).add(str);
            ((List)localObject3).add(localArrayList2.get(i));
          }
          i += 1;
        }
        if (com.tencent.mm.plugin.appbrand.app.e.Sl() != null) {
          com.tencent.mm.plugin.appbrand.app.e.Sl().d((List)localObject2, (List)localObject3);
        }
        a("batch", 5, localObject1);
      }
    }
    GMTrace.o(10018548088832L, 74644);
  }
  
  public static ArrayList<e> c(Cursor paramCursor)
  {
    GMTrace.i(10017877000192L, 74639);
    if (paramCursor == null)
    {
      paramCursor = new ArrayList();
      GMTrace.o(10017877000192L, 74639);
      return paramCursor;
    }
    Object localObject;
    if (paramCursor.moveToFirst())
    {
      LinkedList localLinkedList = new LinkedList();
      localObject = new a();
      do
      {
        ((a)localObject).b(paramCursor);
        if (!bg.nm(((a)localObject).field_brandId)) {
          localLinkedList.add(q.a(String.valueOf(((a)localObject).field_recordId), ((a)localObject).field_brandId, ((a)localObject).field_versionType, ((a)localObject).field_updateTime));
        }
      } while (paramCursor.moveToNext());
      localObject = new ArrayList(localLinkedList.size());
      ((ArrayList)localObject).addAll(localLinkedList);
    }
    for (;;)
    {
      paramCursor.close();
      GMTrace.o(10017877000192L, 74639);
      return (ArrayList<e>)localObject;
      localObject = new ArrayList();
    }
  }
  
  public static int r(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10018816524288L, 74646);
    paramInt1 = String.format(Locale.US, "%s|%d|%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }).hashCode();
    GMTrace.o(10018816524288L, 74646);
    return paramInt1;
  }
  
  public final ArrayList<e> TG()
  {
    GMTrace.i(10018011217920L, 74640);
    ArrayList localArrayList = c(a(null, 200, 0));
    GMTrace.o(10018011217920L, 74640);
    return localArrayList;
  }
  
  final Cursor a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10017742782464L, 74638);
    paramArrayOfString = this.hKn.query("AppBrandLauncherLayoutItem", paramArrayOfString, String.format(Locale.US, "%s=? order by %s desc limit %d offset %d", new Object[] { "scene", "updateTime", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), new String[] { "2" }, null, null, null);
    GMTrace.o(10017742782464L, 74638);
    return paramArrayOfString;
  }
  
  final boolean a(a parama)
  {
    GMTrace.i(10018682306560L, 74645);
    if (bg.nm(parama.field_brandId))
    {
      GMTrace.o(10018682306560L, 74645);
      return false;
    }
    long l = this.hKn.insert("AppBrandLauncherLayoutItem", "", parama.qL());
    if ((l > 0L) || (l == parama.field_recordId))
    {
      GMTrace.o(10018682306560L, 74645);
      return true;
    }
    GMTrace.o(10018682306560L, 74645);
    return false;
  }
  
  public final boolean a(String paramString1, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, String paramString2)
  {
    GMTrace.i(19885430145024L, 148158);
    paramBoolean = a(paramString1, paramInt1, true, paramBoolean, paramInt2, paramInt3, paramString2);
    if (paramBoolean) {
      a.oE(paramString2);
    }
    GMTrace.o(19885430145024L, 148158);
    return paramBoolean;
  }
  
  public final boolean a(String paramString1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3, String paramString2)
  {
    GMTrace.i(19885295927296L, 148157);
    if ((bg.nm(paramString1)) || (999 == paramInt1))
    {
      GMTrace.o(19885295927296L, 148157);
      return false;
    }
    Object localObject = String.format(Locale.US, "select max(%s) from %s where %s=?", new Object[] { "updateTime", "AppBrandLauncherLayoutItem", "scene" });
    localObject = this.hKn.a((String)localObject, new String[] { "2" }, 0);
    long l;
    int i;
    label183:
    boolean bool1;
    if (localObject == null)
    {
      l = 0L;
      l = Math.max(l + 1L, bg.Pu());
      int j = r(paramString1, paramInt1, 2);
      localObject = new ContentValues(1);
      ((ContentValues)localObject).put("updateTime", Long.valueOf(l));
      if (this.hKn.update("AppBrandLauncherLayoutItem", (ContentValues)localObject, String.format(Locale.US, "%s=?", new Object[] { "recordId" }), new String[] { String.valueOf(j) }) <= 0) {
        break label356;
      }
      i = 1;
      if (i != 0) {
        a("single", 3, String.valueOf(j));
      }
      if (i != 0) {
        break label362;
      }
      localObject = new a();
      ((a)localObject).field_updateTime = l;
      ((a)localObject).field_scene = 2;
      ((a)localObject).field_brandId = paramString1;
      ((a)localObject).field_versionType = paramInt1;
      bool1 = a((a)localObject);
      if (bool1) {
        a("single", 2, String.valueOf(j));
      }
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      if ((bool1) && (paramBoolean1)) {
        new m(paramInt2, paramBoolean2, paramInt1, 2, 1, paramString1, paramInt3, paramString2).Dy();
      }
      if (bool2) {
        TH();
      }
      GMTrace.o(19885295927296L, 148157);
      return bool1;
      l = 0L;
      if (((Cursor)localObject).moveToFirst()) {
        l = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      break;
      label356:
      i = 0;
      break label183;
      label362:
      bool1 = true;
    }
  }
  
  public final boolean ab(String paramString, int paramInt)
  {
    boolean bool = true;
    GMTrace.i(18297365987328L, 136326);
    if (bg.nm(paramString))
    {
      GMTrace.o(18297365987328L, 136326);
      return false;
    }
    paramString = this.hKn.a(String.format(Locale.US, "select count(*) from %s where %s=? and %s=? and %s=?", new Object[] { "AppBrandLauncherLayoutItem", "brandId", "versionType", "scene" }), new String[] { paramString, String.valueOf(paramInt), "2" }, 0);
    if (paramString == null)
    {
      GMTrace.o(18297365987328L, 136326);
      return false;
    }
    if (paramString.moveToFirst()) {
      if (paramString.getInt(0) <= 0) {}
    }
    for (;;)
    {
      paramString.close();
      GMTrace.o(18297365987328L, 136326);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
  
  public final void c(com.tencent.mm.sdk.e.j.a parama)
  {
    GMTrace.i(18847927107584L, 140428);
    a(parama, d.xB().ngv.getLooper());
    GMTrace.o(18847927107584L, 140428);
  }
  
  public final e oG(String paramString)
  {
    Object localObject = null;
    GMTrace.i(10018145435648L, 74641);
    if (bg.nm(paramString))
    {
      GMTrace.o(10018145435648L, 74641);
      return null;
    }
    Cursor localCursor = this.hKn.query("AppBrandLauncherLayoutItem", null, String.format(Locale.US, "%s=? and %s=?", new Object[] { "scene", "recordId" }), new String[] { "2", paramString }, null, null, null);
    if (localCursor == null)
    {
      GMTrace.o(10018145435648L, 74641);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      a locala = new a();
      locala.b(localCursor);
      paramString = (String)localObject;
      if (!bg.nm(locala.field_brandId)) {
        paramString = q.a(String.valueOf(locala.field_recordId), locala.field_brandId, locala.field_versionType, locala.field_updateTime);
      }
    }
    localCursor.close();
    GMTrace.o(10018145435648L, 74641);
    return paramString;
  }
  
  public final List<String> oH(String paramString)
  {
    GMTrace.i(10018279653376L, 74642);
    LinkedList localLinkedList = new LinkedList();
    if (!bg.nm(paramString))
    {
      g localg = this.hKn;
      String str = String.format(Locale.US, "%s=? and %s=?", new Object[] { "scene", "brandId" });
      paramString = localg.query("AppBrandLauncherLayoutItem", new String[] { "recordId" }, str, new String[] { "2", paramString }, null, null, null);
      if (paramString == null)
      {
        GMTrace.o(10018279653376L, 74642);
        return null;
      }
      if (paramString.moveToFirst()) {
        do
        {
          localLinkedList.add(String.valueOf(paramString.getInt(paramString.getColumnIndex("recordId"))));
        } while (paramString.moveToNext());
      }
      paramString.close();
    }
    GMTrace.o(10018279653376L, 74642);
    return localLinkedList;
  }
  
  static final class a
    extends com.tencent.mm.g.b.j
  {
    static final String[] hIO;
    static final c.a hJW;
    
    static
    {
      GMTrace.i(10022171967488L, 74671);
      hIO = new String[] { "brandId", "versionType", "scene" };
      c.a locala = new c.a();
      locala.gZM = new Field[5];
      locala.columns = new String[6];
      StringBuilder localStringBuilder = new StringBuilder();
      locala.columns[0] = "recordId";
      locala.vmt.put("recordId", "INTEGER PRIMARY KEY ");
      localStringBuilder.append(" recordId INTEGER PRIMARY KEY ");
      localStringBuilder.append(", ");
      locala.vms = "recordId";
      locala.columns[1] = "brandId";
      locala.vmt.put("brandId", "TEXT");
      localStringBuilder.append(" brandId TEXT");
      localStringBuilder.append(", ");
      locala.columns[2] = "versionType";
      locala.vmt.put("versionType", "INTEGER");
      localStringBuilder.append(" versionType INTEGER");
      localStringBuilder.append(", ");
      locala.columns[3] = "updateTime";
      locala.vmt.put("updateTime", "LONG");
      localStringBuilder.append(" updateTime LONG");
      localStringBuilder.append(", ");
      locala.columns[4] = "scene";
      locala.vmt.put("scene", "INTEGER");
      localStringBuilder.append(" scene INTEGER");
      locala.columns[5] = "rowid";
      locala.vmu = localStringBuilder.toString();
      hJW = locala;
      GMTrace.o(10022171967488L, 74671);
    }
    
    a()
    {
      GMTrace.i(10021769314304L, 74668);
      GMTrace.o(10021769314304L, 74668);
    }
    
    public final ContentValues qL()
    {
      GMTrace.i(10022037749760L, 74670);
      this.vmr = 0L;
      ContentValues localContentValues = super.qL();
      int i = j.r(this.field_brandId, this.field_versionType, this.field_scene);
      this.field_recordId = i;
      localContentValues.put("recordId", Integer.valueOf(i));
      GMTrace.o(10022037749760L, 74670);
      return localContentValues;
    }
    
    protected final c.a uw()
    {
      GMTrace.i(10021903532032L, 74669);
      c.a locala = hJW;
      GMTrace.o(10021903532032L, 74669);
      return locala;
    }
  }
  
  private static final class b
    extends i<j.a>
  {
    b(com.tencent.mm.sdk.e.e parame)
    {
      super(j.a.hJW, "AppBrandLauncherLayoutItem", j.a.eZt);
      GMTrace.i(10013984686080L, 74610);
      GMTrace.o(10013984686080L, 74610);
    }
  }
  
  public final class c
  {
    public c()
    {
      GMTrace.i(10021098225664L, 74663);
      GMTrace.o(10021098225664L, 74663);
    }
    
    public final ArrayList<e> TI()
    {
      GMTrace.i(10021232443392L, 74664);
      ArrayList localArrayList = e(Long.MAX_VALUE, 30);
      GMTrace.o(10021232443392L, 74664);
      return localArrayList;
    }
    
    public final ArrayList<e> e(long paramLong, int paramInt)
    {
      GMTrace.i(10021366661120L, 74665);
      Object localObject = j.this.hKn;
      String str1 = String.format(Locale.US, "%s=? and %s<? ", new Object[] { "scene", "updateTime" });
      String str2 = String.format(Locale.US, "%s desc limit %d offset 0 ", new Object[] { "updateTime", Integer.valueOf(30) });
      localObject = j.c(((g)localObject).a("AppBrandLauncherLayoutItem", null, str1, new String[] { "2", String.valueOf(paramLong) }, null, null, str2, 2));
      GMTrace.o(10021366661120L, 74665);
      return (ArrayList<e>)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */