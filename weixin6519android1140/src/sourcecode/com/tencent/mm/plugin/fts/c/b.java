package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  extends a
{
  private SQLiteStatement lzf;
  
  public b()
  {
    GMTrace.i(18550097969152L, 138209);
    GMTrace.o(18550097969152L, 138209);
  }
  
  protected final boolean aCi()
  {
    GMTrace.i(18551574364160L, 138220);
    GMTrace.o(18551574364160L, 138220);
    return true;
  }
  
  public final List<a> aCu()
  {
    GMTrace.i(18550500622336L, 138212);
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Object localObject = String.format("SELECT entity_id, timestamp FROM %s", new Object[] { aCf() });
    localObject = this.lvN.rawQuery((String)localObject, null);
    while (((Cursor)localObject).moveToNext())
    {
      int i = ((Cursor)localObject).getInt(0);
      if (localHashSet.add(Integer.valueOf(i)))
      {
        a locala = new a();
        locala.lzg = i;
        locala.timestamp = ((Cursor)localObject).getLong(1);
        localArrayList.add(locala);
      }
    }
    ((Cursor)localObject).close();
    GMTrace.o(18550500622336L, 138212);
    return localArrayList;
  }
  
  public final boolean aJ(List<c> paramList)
  {
    GMTrace.i(18550634840064L, 138213);
    boolean bool = this.lvN.inTransaction();
    if (!bool) {
      this.lvN.beginTransaction();
    }
    this.lvN.execSQL("Delete from Feature");
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      c localc = (c)paramList.next();
      try
      {
        this.lzf.bindLong(1, localc.field_featureId);
        this.lzf.bindString(2, localc.field_title);
        this.lzf.bindString(3, localc.field_titlePY);
        this.lzf.bindString(4, localc.field_titleShortPY);
        this.lzf.bindString(5, localc.field_tag);
        this.lzf.bindLong(6, localc.field_actionType);
        this.lzf.bindString(7, localc.field_url);
        this.lzf.bindString(8, localc.field_helpUrl);
        this.lzf.bindString(9, localc.field_updateUrl);
        this.lzf.bindString(10, localc.field_androidUrl);
        this.lzf.bindString(11, localc.field_iconPath);
        this.lzf.bindLong(12, localc.field_timestamp);
        w.d("MicroMsg.FTS.FTS5FeatureStorage", "insertFeatureItem rowid=%d timestamp=%d", new Object[] { Long.valueOf(this.lzf.executeInsert()), Long.valueOf(localc.field_timestamp) });
      }
      catch (Exception localException) {}
    }
    if (!bool) {
      this.lvN.commit();
    }
    GMTrace.o(18550634840064L, 138213);
    return true;
  }
  
  public final String getName()
  {
    GMTrace.i(18551037493248L, 138216);
    GMTrace.o(18551037493248L, 138216);
    return "FTS5FeatureStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(18551305928704L, 138218);
    GMTrace.o(18551305928704L, 138218);
    return 17;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(18550903275520L, 138215);
    GMTrace.o(18550903275520L, 138215);
    return "Feature";
  }
  
  public final int getType()
  {
    GMTrace.i(18551171710976L, 138217);
    GMTrace.o(18551171710976L, 138217);
    return 17;
  }
  
  public final c nZ(int paramInt)
  {
    GMTrace.i(18550769057792L, 138214);
    Object localObject1 = "Select * from Feature where featureId = " + paramInt;
    localObject1 = this.lvN.rawQuery((String)localObject1, null);
    try
    {
      boolean bool = ((Cursor)localObject1).moveToFirst();
      if (!bool)
      {
        ((Cursor)localObject1).close();
        GMTrace.o(18550769057792L, 138214);
        return null;
      }
      c localc = new c();
      localc.b((Cursor)localObject1);
      ((Cursor)localObject1).close();
      GMTrace.o(18550769057792L, 138214);
      return localc;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  protected final void vr()
  {
    GMTrace.i(18550232186880L, 138210);
    if (vs())
    {
      localObject = String.format("DROP TABLE IF EXISTS %s", new Object[] { "Feature" });
      this.lvN.execSQL((String)localObject);
      l(-101L, 1L);
    }
    if (!this.lvN.yL("Feature"))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("CREATE TABLE IF NOT EXISTS Feature ( ");
      ((StringBuilder)localObject).append(c.fTp.vmu);
      ((StringBuilder)localObject).append(");");
      localObject = ((StringBuilder)localObject).toString();
      this.lvN.execSQL((String)localObject);
    }
    Object localObject = String.format("INSERT INTO %s (featureId, title, titlePY, titleShortPY, tag, actionType, url, helpUrl, updateUrl, androidUrl, iconPath, timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[] { "Feature" });
    this.lzf = this.lvN.compileStatement((String)localObject);
    GMTrace.o(18550232186880L, 138210);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(18550366404608L, 138211);
    if (!ch(-101, 1))
    {
      GMTrace.o(18550366404608L, 138211);
      return true;
    }
    GMTrace.o(18550366404608L, 138211);
    return false;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18551440146432L, 138219);
    super.vt();
    this.lzf.close();
    GMTrace.o(18551440146432L, 138219);
    return true;
  }
  
  public static final class a
  {
    public int lzg;
    public long timestamp;
    
    public a()
    {
      GMTrace.i(18549963751424L, 138208);
      GMTrace.o(18549963751424L, 138208);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */