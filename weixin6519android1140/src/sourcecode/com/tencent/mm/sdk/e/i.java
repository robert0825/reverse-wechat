package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class i<T extends c>
  extends j
  implements d<T>
{
  private final e fTZ;
  public int field_MARK_CURSOR_CHECK_IGNORE;
  public final c.a vmv;
  private final String vmw;
  
  public i(e parame, c.a parama, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(13966965211136L, 104062);
    this.field_MARK_CURSOR_CHECK_IGNORE = 1;
    this.fTZ = parame;
    this.vmv = parama;
    parama = this.vmv;
    if (bg.nm(this.vmv.vms)) {}
    int i;
    for (parame = "rowid";; parame = this.vmv.vms)
    {
      parama.vms = parame;
      this.vmw = paramString;
      parame = a(this.vmv, getTableName(), this.fTZ);
      i = 0;
      while (i < parame.size())
      {
        this.fTZ.eZ(this.vmw, (String)parame.get(i));
        i += 1;
      }
    }
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      i = j;
      while (i < paramArrayOfString.length)
      {
        this.fTZ.eZ(this.vmw, paramArrayOfString[i]);
        i += 1;
      }
    }
    GMTrace.o(13966965211136L, 104062);
  }
  
  private void ST(String paramString)
  {
    GMTrace.i(13969918001152L, 104084);
    w.d("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + paramString);
    GMTrace.o(13969918001152L, 104084);
  }
  
  private void SU(String paramString)
  {
    GMTrace.i(13970052218880L, 104085);
    w.e("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + paramString);
    GMTrace.o(13970052218880L, 104085);
  }
  
  public static String a(c.a parama, String paramString)
  {
    GMTrace.i(13967233646592L, 104064);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CREATE TABLE IF NOT EXISTS " + paramString + " ( ");
    localStringBuilder.append(parama.vmu);
    localStringBuilder.append(");");
    parama = localStringBuilder.toString();
    GMTrace.o(13967233646592L, 104064);
    return parama;
  }
  
  private static StringBuilder a(ContentValues paramContentValues, String... paramVarArgs)
  {
    GMTrace.i(13969649565696L, 104082);
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      String str = paramVarArgs[i];
      localStringBuilder.append(str + " = ? AND ");
      if (paramContentValues.get(str) == null)
      {
        GMTrace.o(13969649565696L, 104082);
        return null;
      }
      i += 1;
    }
    localStringBuilder.append(" 1=1");
    GMTrace.o(13969649565696L, 104082);
    return localStringBuilder;
  }
  
  public static List<String> a(c.a parama, String paramString, e parame)
  {
    GMTrace.i(13967367864320L, 104065);
    ArrayList localArrayList = new ArrayList();
    if ((parame == null) || (paramString == null))
    {
      if (parame == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.SDK.MAutoStorage", "dk getUpdateSQLs db==null :%b  table:%s", new Object[] { Boolean.valueOf(bool), paramString });
        GMTrace.o(13967367864320L, 104065);
        return localArrayList;
      }
    }
    Object localObject1 = parame.a("PRAGMA table_info( " + paramString + " )", new String[0], 2);
    if (localObject1 == null)
    {
      GMTrace.o(13967367864320L, 104065);
      return localArrayList;
    }
    parame = new HashMap();
    int i = ((Cursor)localObject1).getColumnIndex("name");
    int j = ((Cursor)localObject1).getColumnIndex("type");
    while (((Cursor)localObject1).moveToNext()) {
      parame.put(((Cursor)localObject1).getString(i), ((Cursor)localObject1).getString(j));
    }
    ((Cursor)localObject1).close();
    parama = parama.vmt.entrySet().iterator();
    while (parama.hasNext())
    {
      Object localObject2 = (Map.Entry)parama.next();
      localObject1 = (String)((Map.Entry)localObject2).getValue();
      localObject2 = (String)((Map.Entry)localObject2).getKey();
      if ((localObject1 != null) && (((String)localObject1).length() > 0))
      {
        String str = (String)parame.get(localObject2);
        if (str == null)
        {
          localArrayList.add("ALTER TABLE " + paramString + " ADD COLUMN " + (String)localObject2 + " " + (String)localObject1 + ";");
          parame.remove(localObject2);
        }
        else if (!((String)localObject1).toLowerCase().startsWith(str.toLowerCase()))
        {
          w.e("MicroMsg.SDK.MAutoStorage", "conflicting alter table on column: " + (String)localObject2 + ", " + str + "<o-n>" + (String)localObject1);
          parame.remove(localObject2);
        }
      }
    }
    GMTrace.o(13967367864320L, 104065);
    return localArrayList;
  }
  
  private static String[] a(String[] paramArrayOfString, ContentValues paramContentValues)
  {
    GMTrace.i(13969783783424L, 104083);
    String[] arrayOfString = new String[paramArrayOfString.length];
    int i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = bg.nl(paramContentValues.getAsString(paramArrayOfString[i]));
      i += 1;
    }
    GMTrace.o(13969783783424L, 104083);
    return arrayOfString;
  }
  
  private boolean b(ContentValues paramContentValues)
  {
    GMTrace.i(13969112694784L, 104078);
    Cursor localCursor = this.fTZ.query(getTableName(), this.vmv.columns, this.vmv.vms + " = ?", new String[] { bg.nl(paramContentValues.getAsString(this.vmv.vms)) }, null, null, null);
    boolean bool = c.a(paramContentValues, localCursor);
    localCursor.close();
    GMTrace.o(13969112694784L, 104078);
    return bool;
  }
  
  public Cursor Mx()
  {
    GMTrace.i(13969246912512L, 104079);
    Cursor localCursor = this.fTZ.query(getTableName(), this.vmv.columns, null, null, null, null, null);
    GMTrace.o(13969246912512L, 104079);
    return localCursor;
  }
  
  public boolean a(long paramLong, T paramT)
  {
    GMTrace.i(13968575823872L, 104074);
    boolean bool = a(paramLong, paramT, true);
    GMTrace.o(13968575823872L, 104074);
    return bool;
  }
  
  public final boolean a(long paramLong, T paramT, boolean paramBoolean)
  {
    GMTrace.i(21020375252992L, 156614);
    paramT = paramT.qL();
    if ((paramT == null) || (paramT.size() <= 0))
    {
      SU("update failed, value.size <= 0");
      GMTrace.o(21020375252992L, 156614);
      return false;
    }
    Cursor localCursor = this.fTZ.query(getTableName(), this.vmv.columns, "rowid = ?", new String[] { String.valueOf(paramLong) }, null, null, null);
    if (c.a(paramT, localCursor))
    {
      localCursor.close();
      ST("no need replace , fields no change");
      GMTrace.o(21020375252992L, 156614);
      return true;
    }
    localCursor.close();
    if (this.fTZ.update(getTableName(), paramT, "rowid = ?", new String[] { String.valueOf(paramLong) }) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((bool) && (paramBoolean)) {
        doNotify();
      }
      GMTrace.o(21020375252992L, 156614);
      return bool;
    }
  }
  
  public boolean a(T paramT)
  {
    GMTrace.i(13968978477056L, 104077);
    boolean bool;
    ContentValues localContentValues;
    int j;
    int k;
    if (!bg.nm(this.vmv.vms))
    {
      bool = true;
      Assert.assertTrue("replace primaryKey == null", bool);
      localContentValues = paramT.qL();
      if (localContentValues != null)
      {
        j = localContentValues.size();
        k = paramT.uw().gZM.length;
        if (!localContentValues.containsKey("rowid")) {
          break label104;
        }
      }
    }
    label104:
    for (int i = 1;; i = 0)
    {
      if (j == i + k) {
        break label109;
      }
      SU("replace failed, cv.size() != item.fields().length");
      GMTrace.o(13968978477056L, 104077);
      return false;
      bool = false;
      break;
    }
    label109:
    if (b(localContentValues))
    {
      ST("no need replace , fields no change");
      GMTrace.o(13968978477056L, 104077);
      return true;
    }
    if (this.fTZ.replace(getTableName(), this.vmv.vms, localContentValues) > 0L)
    {
      SS(this.vmv.vms);
      GMTrace.o(13968978477056L, 104077);
      return true;
    }
    SU("replace failed");
    GMTrace.o(13968978477056L, 104077);
    return false;
  }
  
  public boolean a(T paramT, boolean paramBoolean)
  {
    GMTrace.i(13967770517504L, 104068);
    ContentValues localContentValues = paramT.qL();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      SU("insert failed, value.size <= 0");
      GMTrace.o(13967770517504L, 104068);
      return false;
    }
    paramT.vmr = this.fTZ.insert(getTableName(), this.vmv.vms, localContentValues);
    if (paramT.vmr <= 0L)
    {
      SU("insert failed");
      GMTrace.o(13967770517504L, 104068);
      return false;
    }
    localContentValues.put("rowid", Long.valueOf(paramT.vmr));
    if (paramBoolean) {
      SS(localContentValues.getAsString(this.vmv.vms));
    }
    GMTrace.o(13967770517504L, 104068);
    return true;
  }
  
  public boolean a(T paramT, boolean paramBoolean, String... paramVarArgs)
  {
    boolean bool = false;
    GMTrace.i(13968710041600L, 104075);
    paramT = paramT.qL();
    if ((paramT == null) || (paramT.size() <= 0))
    {
      SU("update failed, value.size <= 0");
      GMTrace.o(13968710041600L, 104075);
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0))
    {
      ST("update with primary key");
      if (b(paramT))
      {
        ST("no need replace , fields no change");
        GMTrace.o(13968710041600L, 104075);
        return true;
      }
      if (this.fTZ.update(getTableName(), paramT, this.vmv.vms + " = ?", new String[] { bg.nl(paramT.getAsString(this.vmv.vms)) }) > 0) {
        bool = true;
      }
      if ((bool) && (paramBoolean)) {
        doNotify();
      }
      GMTrace.o(13968710041600L, 104075);
      return bool;
    }
    StringBuilder localStringBuilder = a(paramT, paramVarArgs);
    if (localStringBuilder == null)
    {
      SU("update failed, check keys failed");
      GMTrace.o(13968710041600L, 104075);
      return false;
    }
    if (this.fTZ.update(getTableName(), paramT, localStringBuilder.toString(), a(paramVarArgs, paramT)) > 0)
    {
      if (paramBoolean) {
        SS(paramT.getAsString(this.vmv.vms));
      }
      GMTrace.o(13968710041600L, 104075);
      return true;
    }
    SU("update failed");
    GMTrace.o(13968710041600L, 104075);
    return false;
  }
  
  public boolean a(T paramT, String... paramVarArgs)
  {
    GMTrace.i(13968038952960L, 104070);
    boolean bool = b(paramT, true, paramVarArgs);
    GMTrace.o(13968038952960L, 104070);
    return bool;
  }
  
  public final boolean b(long paramLong, T paramT)
  {
    GMTrace.i(13968307388416L, 104072);
    Cursor localCursor = this.fTZ.a(getTableName(), this.vmv.columns, "rowid = ?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      paramT.b(localCursor);
      localCursor.close();
      GMTrace.o(13968307388416L, 104072);
      return true;
    }
    localCursor.close();
    GMTrace.o(13968307388416L, 104072);
    return false;
  }
  
  public boolean b(T paramT)
  {
    GMTrace.i(13967636299776L, 104067);
    boolean bool = a(paramT, true);
    GMTrace.o(13967636299776L, 104067);
    return bool;
  }
  
  public boolean b(T paramT, boolean paramBoolean, String... paramVarArgs)
  {
    boolean bool = false;
    GMTrace.i(13967904735232L, 104069);
    paramT = paramT.qL();
    if ((paramT == null) || (paramT.size() <= 0))
    {
      SU("delete failed, value.size <= 0");
      GMTrace.o(13967904735232L, 104069);
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0))
    {
      ST("delete with primary key");
      if (this.fTZ.delete(getTableName(), this.vmv.vms + " = ?", new String[] { bg.nl(paramT.getAsString(this.vmv.vms)) }) > 0) {
        bool = true;
      }
      if ((bool) && (paramBoolean)) {
        doNotify();
      }
      GMTrace.o(13967904735232L, 104069);
      return bool;
    }
    StringBuilder localStringBuilder = a(paramT, paramVarArgs);
    if (localStringBuilder == null)
    {
      SU("delete failed, check keys failed");
      GMTrace.o(13967904735232L, 104069);
      return false;
    }
    if ((this.fTZ.delete(getTableName(), localStringBuilder.toString(), a(paramVarArgs, paramT)) > 0) && (paramBoolean))
    {
      SS(this.vmv.vms);
      GMTrace.o(13967904735232L, 104069);
      return true;
    }
    SU("delete failed");
    GMTrace.o(13967904735232L, 104069);
    return false;
  }
  
  public boolean b(T paramT, String... paramVarArgs)
  {
    GMTrace.i(13968441606144L, 104073);
    ContentValues localContentValues = paramT.qL();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      SU("get failed, value.size <= 0");
      GMTrace.o(13968441606144L, 104073);
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0))
    {
      ST("get with primary key");
      paramVarArgs = this.fTZ.a(getTableName(), this.vmv.columns, this.vmv.vms + " = ?", new String[] { bg.nl(localContentValues.getAsString(this.vmv.vms)) }, null, null, null, 2);
      if (paramVarArgs.moveToFirst())
      {
        paramT.b(paramVarArgs);
        paramVarArgs.close();
        GMTrace.o(13968441606144L, 104073);
        return true;
      }
      paramVarArgs.close();
      GMTrace.o(13968441606144L, 104073);
      return false;
    }
    StringBuilder localStringBuilder = a(localContentValues, paramVarArgs);
    if (localStringBuilder == null)
    {
      SU("get failed, check keys failed");
      GMTrace.o(13968441606144L, 104073);
      return false;
    }
    paramVarArgs = this.fTZ.a(getTableName(), this.vmv.columns, localStringBuilder.toString(), a(paramVarArgs, localContentValues), null, null, null, 2);
    if (paramVarArgs.moveToFirst())
    {
      paramT.b(paramVarArgs);
      paramVarArgs.close();
      GMTrace.o(13968441606144L, 104073);
      return true;
    }
    paramVarArgs.close();
    ST("get failed, not found");
    GMTrace.o(13968441606144L, 104073);
    return false;
  }
  
  public boolean c(T paramT, String... paramVarArgs)
  {
    GMTrace.i(13968844259328L, 104076);
    boolean bool = a(paramT, true, paramVarArgs);
    GMTrace.o(13968844259328L, 104076);
    return bool;
  }
  
  public boolean delete(long paramLong)
  {
    boolean bool = true;
    GMTrace.i(13968173170688L, 104071);
    if (this.fTZ.delete(getTableName(), "rowid = ?", new String[] { String.valueOf(paramLong) }) > 0) {}
    for (;;)
    {
      if (bool) {
        doNotify();
      }
      GMTrace.o(13968173170688L, 104071);
      return bool;
      bool = false;
    }
  }
  
  public final boolean eZ(String paramString1, String paramString2)
  {
    GMTrace.i(13967502082048L, 104066);
    if (paramString1.length() == 0)
    {
      SU("null or nill table");
      GMTrace.o(13967502082048L, 104066);
      return false;
    }
    if ((paramString2 == null) || (paramString2.length() == 0))
    {
      SU("null or nill sql");
      GMTrace.o(13967502082048L, 104066);
      return false;
    }
    boolean bool = this.fTZ.eZ(paramString1, paramString2);
    GMTrace.o(13967502082048L, 104066);
    return bool;
  }
  
  public int getCount()
  {
    GMTrace.i(13969381130240L, 104080);
    Cursor localCursor = rawQuery("select count(*) from " + getTableName(), new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      int i = localCursor.getInt(0);
      localCursor.close();
      GMTrace.o(13969381130240L, 104080);
      return i;
    }
    GMTrace.o(13969381130240L, 104080);
    return 0;
  }
  
  public String getTableName()
  {
    GMTrace.i(13967099428864L, 104063);
    String str = this.vmw;
    GMTrace.o(13967099428864L, 104063);
    return str;
  }
  
  public final Cursor rawQuery(String paramString, String... paramVarArgs)
  {
    GMTrace.i(13969515347968L, 104081);
    paramString = this.fTZ.rawQuery(paramString, paramVarArgs);
    GMTrace.o(13969515347968L, 104081);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */