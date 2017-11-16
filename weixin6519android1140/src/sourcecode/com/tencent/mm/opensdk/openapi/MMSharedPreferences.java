package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.c.a;
import com.tencent.mm.opensdk.utils.c.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class MMSharedPreferences
  implements SharedPreferences
{
  private static final String TAG = "MicroMsg.SDK.SharedPreferences";
  private final String[] columns;
  private final ContentResolver cr;
  private REditor editor;
  private final HashMap<String, Object> values;
  
  public MMSharedPreferences(Context paramContext)
  {
    GMTrace.i(50868518912L, 379);
    this.columns = new String[] { "_id", "key", "type", "value" };
    this.values = new HashMap();
    this.editor = null;
    this.cr = paramContext.getContentResolver();
    GMTrace.o(50868518912L, 379);
  }
  
  private Object getValue(String paramString)
  {
    GMTrace.i(51002736640L, 380);
    for (;;)
    {
      try
      {
        Cursor localCursor = this.cr.query(c.b.CONTENT_URI, this.columns, "key = ?", new String[] { paramString }, null);
        if (localCursor == null)
        {
          GMTrace.o(51002736640L, 380);
          return null;
        }
        int i = localCursor.getColumnIndex("type");
        int j = localCursor.getColumnIndex("value");
        if (localCursor.moveToFirst())
        {
          paramString = c.a.a(localCursor.getInt(i), localCursor.getString(j));
          localCursor.close();
          GMTrace.o(51002736640L, 380);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        Log.e("MicroMsg.SDK.SharedPreferences", "getValue exception:" + paramString.getMessage());
        GMTrace.o(51002736640L, 380);
        return null;
      }
      paramString = null;
    }
  }
  
  public boolean contains(String paramString)
  {
    GMTrace.i(51942260736L, 387);
    if (getValue(paramString) != null)
    {
      GMTrace.o(51942260736L, 387);
      return true;
    }
    GMTrace.o(51942260736L, 387);
    return false;
  }
  
  public SharedPreferences.Editor edit()
  {
    GMTrace.i(52076478464L, 388);
    if (this.editor == null) {
      this.editor = new REditor(this.cr);
    }
    REditor localREditor = this.editor;
    GMTrace.o(52076478464L, 388);
    return localREditor;
  }
  
  public Map<String, ?> getAll()
  {
    GMTrace.i(51136954368L, 381);
    try
    {
      Cursor localCursor = this.cr.query(c.b.CONTENT_URI, this.columns, null, null, null);
      if (localCursor == null)
      {
        GMTrace.o(51136954368L, 381);
        return null;
      }
      int i = localCursor.getColumnIndex("key");
      int j = localCursor.getColumnIndex("type");
      int k = localCursor.getColumnIndex("value");
      while (localCursor.moveToNext())
      {
        Object localObject = c.a.a(localCursor.getInt(j), localCursor.getString(k));
        this.values.put(localCursor.getString(i), localObject);
      }
      localHashMap.close();
    }
    catch (Exception localException)
    {
      Log.e("MicroMsg.SDK.SharedPreferences", "getAll exception:" + localException.getMessage());
      localHashMap = this.values;
      GMTrace.o(51136954368L, 381);
      return localHashMap;
    }
    HashMap localHashMap = this.values;
    GMTrace.o(51136954368L, 381);
    return localHashMap;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(51808043008L, 386);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Boolean)))
    {
      paramBoolean = ((Boolean)paramString).booleanValue();
      GMTrace.o(51808043008L, 386);
      return paramBoolean;
    }
    GMTrace.o(51808043008L, 386);
    return paramBoolean;
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    GMTrace.i(51673825280L, 385);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Float)))
    {
      paramFloat = ((Float)paramString).floatValue();
      GMTrace.o(51673825280L, 385);
      return paramFloat;
    }
    GMTrace.o(51673825280L, 385);
    return paramFloat;
  }
  
  public int getInt(String paramString, int paramInt)
  {
    GMTrace.i(51405389824L, 383);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Integer)))
    {
      paramInt = ((Integer)paramString).intValue();
      GMTrace.o(51405389824L, 383);
      return paramInt;
    }
    GMTrace.o(51405389824L, 383);
    return paramInt;
  }
  
  public long getLong(String paramString, long paramLong)
  {
    GMTrace.i(51539607552L, 384);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Long)))
    {
      paramLong = ((Long)paramString).longValue();
      GMTrace.o(51539607552L, 384);
      return paramLong;
    }
    GMTrace.o(51539607552L, 384);
    return paramLong;
  }
  
  public String getString(String paramString1, String paramString2)
  {
    GMTrace.i(51271172096L, 382);
    paramString1 = getValue(paramString1);
    if ((paramString1 != null) && ((paramString1 instanceof String)))
    {
      paramString1 = (String)paramString1;
      GMTrace.o(51271172096L, 382);
      return paramString1;
    }
    GMTrace.o(51271172096L, 382);
    return paramString2;
  }
  
  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    GMTrace.i(52479131648L, 391);
    GMTrace.o(52479131648L, 391);
    return null;
  }
  
  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    GMTrace.i(52210696192L, 389);
    GMTrace.o(52210696192L, 389);
  }
  
  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    GMTrace.i(52344913920L, 390);
    GMTrace.o(52344913920L, 390);
  }
  
  private static class REditor
    implements SharedPreferences.Editor
  {
    private boolean clear;
    private ContentResolver cr;
    private Set<String> remove;
    private Map<String, Object> values;
    
    public REditor(ContentResolver paramContentResolver)
    {
      GMTrace.i(49392123904L, 368);
      this.values = new HashMap();
      this.remove = new HashSet();
      this.clear = false;
      this.cr = paramContentResolver;
      GMTrace.o(49392123904L, 368);
    }
    
    public void apply()
    {
      GMTrace.i(50600083456L, 377);
      GMTrace.o(50600083456L, 377);
    }
    
    public SharedPreferences.Editor clear()
    {
      GMTrace.i(50331648000L, 375);
      this.clear = true;
      GMTrace.o(50331648000L, 375);
      return this;
    }
    
    public boolean commit()
    {
      GMTrace.i(50465865728L, 376);
      ContentValues localContentValues = new ContentValues();
      if (this.clear)
      {
        this.cr.delete(c.b.CONTENT_URI, null, null);
        this.clear = false;
      }
      Iterator localIterator = this.remove.iterator();
      Object localObject1;
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        this.cr.delete(c.b.CONTENT_URI, "key = ?", new String[] { localObject1 });
      }
      localIterator = this.values.entrySet().iterator();
      label155:
      label311:
      label335:
      while (localIterator.hasNext())
      {
        localObject1 = (Map.Entry)localIterator.next();
        Object localObject2 = ((Map.Entry)localObject1).getValue();
        if (localObject2 == null)
        {
          Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, null value");
          i = 0;
          if (i != 0) {
            break label311;
          }
        }
        for (int i = 0;; i = 1)
        {
          if (i == 0) {
            break label335;
          }
          this.cr.update(c.b.CONTENT_URI, localContentValues, "key = ?", new String[] { (String)((Map.Entry)localObject1).getKey() });
          break;
          if ((localObject2 instanceof Integer))
          {
            i = 1;
            break label155;
          }
          if ((localObject2 instanceof Long))
          {
            i = 2;
            break label155;
          }
          if ((localObject2 instanceof String))
          {
            i = 3;
            break label155;
          }
          if ((localObject2 instanceof Boolean))
          {
            i = 4;
            break label155;
          }
          if ((localObject2 instanceof Float))
          {
            i = 5;
            break label155;
          }
          if ((localObject2 instanceof Double))
          {
            i = 6;
            break label155;
          }
          Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, unknown type=" + localObject2.getClass().toString());
          i = 0;
          break label155;
          localContentValues.put("type", Integer.valueOf(i));
          localContentValues.put("value", localObject2.toString());
        }
      }
      GMTrace.o(50465865728L, 376);
      return true;
    }
    
    public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      GMTrace.i(50063212544L, 373);
      this.values.put(paramString, Boolean.valueOf(paramBoolean));
      this.remove.remove(paramString);
      GMTrace.o(50063212544L, 373);
      return this;
    }
    
    public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      GMTrace.i(49928994816L, 372);
      this.values.put(paramString, Float.valueOf(paramFloat));
      this.remove.remove(paramString);
      GMTrace.o(49928994816L, 372);
      return this;
    }
    
    public SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      GMTrace.i(49660559360L, 370);
      this.values.put(paramString, Integer.valueOf(paramInt));
      this.remove.remove(paramString);
      GMTrace.o(49660559360L, 370);
      return this;
    }
    
    public SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      GMTrace.i(49794777088L, 371);
      this.values.put(paramString, Long.valueOf(paramLong));
      this.remove.remove(paramString);
      GMTrace.o(49794777088L, 371);
      return this;
    }
    
    public SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      GMTrace.i(49526341632L, 369);
      this.values.put(paramString1, paramString2);
      this.remove.remove(paramString1);
      GMTrace.o(49526341632L, 369);
      return this;
    }
    
    public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      GMTrace.i(50734301184L, 378);
      GMTrace.o(50734301184L, 378);
      return null;
    }
    
    public SharedPreferences.Editor remove(String paramString)
    {
      GMTrace.i(50197430272L, 374);
      this.remove.add(paramString);
      GMTrace.o(50197430272L, 374);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\openapi\MMSharedPreferences.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */