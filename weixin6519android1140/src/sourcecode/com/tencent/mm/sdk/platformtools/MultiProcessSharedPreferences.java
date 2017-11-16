package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.UriMatcher;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MultiProcessSharedPreferences
  extends ContentProvider
  implements SharedPreferences
{
  private static String AUTHORITY;
  private static volatile Uri AUTHORITY_URI;
  private List<SoftReference<SharedPreferences.OnSharedPreferenceChangeListener>> dT;
  private BroadcastReceiver idj;
  private Context mContext;
  private int mMode;
  private String mName;
  private boolean vjB;
  private UriMatcher vjC;
  private Map<String, Integer> vjD;
  
  public MultiProcessSharedPreferences()
  {
    GMTrace.i(13914754514944L, 103673);
    GMTrace.o(13914754514944L, 103673);
  }
  
  private MultiProcessSharedPreferences(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(13914888732672L, 103674);
    this.mContext = paramContext;
    this.mName = paramString;
    this.mMode = paramInt;
    this.vjB = paramContext.getPackageManager().isSafeMode();
    GMTrace.o(13914888732672L, 103674);
  }
  
  private static String RY(String paramString)
  {
    GMTrace.i(13916633563136L, 103687);
    paramString = String.format("%1$s_%2$s", new Object[] { MultiProcessSharedPreferences.class.getName(), paramString });
    GMTrace.o(13916633563136L, 103687);
    return paramString;
  }
  
  private Object b(String paramString1, String paramString2, Object paramObject)
  {
    Bundle localBundle = null;
    Object localObject1 = null;
    Object localObject2 = null;
    GMTrace.i(13916499345408L, 103686);
    if (this.vjB)
    {
      GMTrace.o(13916499345408L, 103686);
      return null;
    }
    er(this.mContext);
    Object localObject3 = Uri.withAppendedPath(Uri.withAppendedPath(AUTHORITY_URI, this.mName), paramString1);
    int i = this.mMode;
    if (paramObject == null) {}
    for (paramString1 = null;; paramString1 = String.valueOf(paramObject))
    {
      localObject3 = this.mContext.getContentResolver().query((Uri)localObject3, null, null, new String[] { String.valueOf(i), paramString2, paramString1 }, null);
      paramString1 = localBundle;
      if (localObject3 != null) {
        paramString1 = (String)localObject1;
      }
      try
      {
        localBundle = ((Cursor)localObject3).getExtras();
        paramString1 = (String)localObject2;
        if (localBundle != null)
        {
          paramString1 = (String)localObject1;
          paramString2 = localBundle.get("value");
          paramString1 = paramString2;
          localBundle.clear();
          paramString1 = paramString2;
        }
      }
      catch (Exception paramString2)
      {
        for (;;) {}
      }
      ((Cursor)localObject3).close();
      if (paramString1 == null) {
        break;
      }
      GMTrace.o(13916499345408L, 103686);
      return paramString1;
    }
    GMTrace.o(13916499345408L, 103686);
    return paramObject;
  }
  
  private void bQs()
  {
    GMTrace.i(13917841522688L, 103696);
    if (this.vjD == null) {
      this.vjD = new HashMap();
    }
    GMTrace.o(13917841522688L, 103696);
  }
  
  private void er(Context paramContext)
  {
    GMTrace.i(13914351861760L, 103670);
    if (AUTHORITY_URI == null)
    {
      String str = null;
      Uri localUri2 = AUTHORITY_URI;
      Uri localUri1 = localUri2;
      if (localUri2 == null) {}
      try
      {
        str = es(paramContext);
        localUri1 = Uri.parse("content://" + str);
        if (str == null) {
          throw new IllegalArgumentException("'AUTHORITY' initialize failed.");
        }
      }
      finally {}
      AUTHORITY = str;
      AUTHORITY_URI = localUri1;
    }
    GMTrace.o(13914351861760L, 103670);
  }
  
  private static String es(Context paramContext)
  {
    GMTrace.i(13914486079488L, 103671);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 8);
      if ((paramContext != null) && (paramContext.providers != null))
      {
        paramContext = paramContext.providers;
        int j = paramContext.length;
        i = 0;
        if (i < j)
        {
          Object localObject = paramContext[i];
          if (((ProviderInfo)localObject).name.equals(MultiProcessSharedPreferences.class.getName()))
          {
            paramContext = ((ProviderInfo)localObject).authority;
            GMTrace.o(13914486079488L, 103671);
            return paramContext;
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        int i;
        paramContext = null;
        continue;
        i += 1;
      }
      GMTrace.o(13914486079488L, 103671);
    }
    return null;
  }
  
  public static SharedPreferences getSharedPreferences(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(13914620297216L, 103672);
    paramContext = new MultiProcessSharedPreferences(paramContext, paramString, paramInt);
    GMTrace.o(13914620297216L, 103672);
    return paramContext;
  }
  
  private void i(String paramString, ArrayList<String> paramArrayList)
  {
    GMTrace.i(13917975740416L, 103697);
    if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
    {
      Intent localIntent = new Intent();
      localIntent.setAction(RY(paramString));
      localIntent.setPackage(getContext().getPackageName());
      localIntent.putExtra("name", paramString);
      localIntent.putExtra("value", paramArrayList);
      getContext().sendBroadcast(localIntent);
    }
    GMTrace.o(13917975740416L, 103697);
  }
  
  public boolean contains(String paramString)
  {
    GMTrace.i(13915962474496L, 103682);
    paramString = (Boolean)b("contains", paramString, null);
    if (paramString != null)
    {
      boolean bool = paramString.booleanValue();
      GMTrace.o(13915962474496L, 103682);
      return bool;
    }
    GMTrace.o(13915962474496L, 103682);
    return false;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(13917304651776L, 103692);
    throw new UnsupportedOperationException("No external delete");
  }
  
  public SharedPreferences.Editor edit()
  {
    GMTrace.i(13916096692224L, 103683);
    b localb = new b();
    GMTrace.o(13916096692224L, 103683);
    return localb;
  }
  
  public Map<String, ?> getAll()
  {
    GMTrace.i(13915022950400L, 103675);
    Map localMap = (Map)b("getAll", null, null);
    GMTrace.o(13915022950400L, 103675);
    return localMap;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(13915828256768L, 103681);
    paramString = (Boolean)b("getBoolean", paramString, Boolean.valueOf(paramBoolean));
    if (paramString != null)
    {
      paramBoolean = paramString.booleanValue();
      GMTrace.o(13915828256768L, 103681);
      return paramBoolean;
    }
    GMTrace.o(13915828256768L, 103681);
    return paramBoolean;
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    GMTrace.i(13915694039040L, 103680);
    paramString = (Float)b("getFloat", paramString, Float.valueOf(paramFloat));
    if (paramString != null)
    {
      paramFloat = paramString.floatValue();
      GMTrace.o(13915694039040L, 103680);
      return paramFloat;
    }
    GMTrace.o(13915694039040L, 103680);
    return paramFloat;
  }
  
  public int getInt(String paramString, int paramInt)
  {
    GMTrace.i(13915425603584L, 103678);
    paramString = (Integer)b("getInt", paramString, Integer.valueOf(paramInt));
    if (paramString != null)
    {
      paramInt = paramString.intValue();
      GMTrace.o(13915425603584L, 103678);
      return paramInt;
    }
    GMTrace.o(13915425603584L, 103678);
    return paramInt;
  }
  
  public long getLong(String paramString, long paramLong)
  {
    GMTrace.i(13915559821312L, 103679);
    paramString = (Long)b("getLong", paramString, Long.valueOf(paramLong));
    if (paramString != null)
    {
      paramLong = paramString.longValue();
      GMTrace.o(13915559821312L, 103679);
      return paramLong;
    }
    GMTrace.o(13915559821312L, 103679);
    return paramLong;
  }
  
  public String getString(String paramString1, String paramString2)
  {
    GMTrace.i(13915157168128L, 103676);
    paramString1 = (String)b("getString", paramString1, paramString2);
    if (paramString1 != null)
    {
      GMTrace.o(13915157168128L, 103676);
      return paramString1;
    }
    GMTrace.o(13915157168128L, 103676);
    return paramString2;
  }
  
  /* Error */
  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    // Byte code:
    //   0: ldc2_w 408
    //   3: ldc_w 410
    //   6: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: ldc_w 405
    //   15: aload_1
    //   16: aload_2
    //   17: invokespecial 313	com/tencent/mm/sdk/platformtools/MultiProcessSharedPreferences:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast 412	java/util/Set
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull +16 -> 41
    //   28: aload_0
    //   29: monitorexit
    //   30: ldc2_w 408
    //   33: ldc_w 410
    //   36: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: aload_1
    //   40: areturn
    //   41: aload_2
    //   42: astore_1
    //   43: goto -15 -> 28
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	MultiProcessSharedPreferences
    //   0	51	1	paramString	String
    //   0	51	2	paramSet	Set<String>
    // Exception table:
    //   from	to	target	type
    //   11	24	46	finally
    //   28	30	46	finally
    //   47	49	46	finally
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(13917036216320L, 103690);
    throw new UnsupportedOperationException("No external call");
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(13917170434048L, 103691);
    throw new UnsupportedOperationException("No external insert");
  }
  
  public boolean onCreate()
  {
    GMTrace.i(13916767780864L, 103688);
    er(getContext());
    this.vjC = new UriMatcher(-1);
    this.vjC.addURI(AUTHORITY, "*/getAll", 1);
    this.vjC.addURI(AUTHORITY, "*/getString", 2);
    this.vjC.addURI(AUTHORITY, "*/getInt", 3);
    this.vjC.addURI(AUTHORITY, "*/getLong", 4);
    this.vjC.addURI(AUTHORITY, "*/getFloat", 5);
    this.vjC.addURI(AUTHORITY, "*/getBoolean", 6);
    this.vjC.addURI(AUTHORITY, "*/contains", 7);
    this.vjC.addURI(AUTHORITY, "*/apply", 8);
    this.vjC.addURI(AUTHORITY, "*/commit", 9);
    this.vjC.addURI(AUTHORITY, "*/registerOnSharedPreferenceChangeListener", 10);
    this.vjC.addURI(AUTHORITY, "*/unregisterOnSharedPreferenceChangeListener", 11);
    GMTrace.o(13916767780864L, 103688);
    return true;
  }
  
  public void onLowMemory()
  {
    GMTrace.i(13917573087232L, 103694);
    if (this.vjD != null) {
      this.vjD.clear();
    }
    super.onLowMemory();
    GMTrace.o(13917573087232L, 103694);
  }
  
  public void onTrimMemory(int paramInt)
  {
    GMTrace.i(13917707304960L, 103695);
    if (this.vjD != null) {
      this.vjD.clear();
    }
    super.onTrimMemory(paramInt);
    GMTrace.o(13917707304960L, 103695);
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(13916901998592L, 103689);
    paramString1 = (String)paramUri.getPathSegments().get(0);
    int i = Integer.parseInt(paramArrayOfString2[0]);
    paramString2 = paramArrayOfString2[1];
    paramArrayOfString2 = paramArrayOfString2[2];
    paramArrayOfString1 = new Bundle();
    label392:
    int j;
    switch (this.vjC.match(paramUri))
    {
    case 8: 
    case 9: 
    default: 
      throw new IllegalArgumentException("This is Unknown Uri：" + paramUri);
    case 1: 
      paramArrayOfString1.putSerializable("value", (HashMap)getContext().getSharedPreferences(paramString1, i).getAll());
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
      for (;;)
      {
        paramUri = new a(paramArrayOfString1);
        GMTrace.o(13916901998592L, 103689);
        return paramUri;
        paramArrayOfString1.putString("value", getContext().getSharedPreferences(paramString1, i).getString(paramString2, paramArrayOfString2));
        continue;
        paramArrayOfString1.putInt("value", getContext().getSharedPreferences(paramString1, i).getInt(paramString2, Integer.parseInt(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putLong("value", getContext().getSharedPreferences(paramString1, i).getLong(paramString2, Long.parseLong(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putFloat("value", getContext().getSharedPreferences(paramString1, i).getFloat(paramString2, Float.parseFloat(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putBoolean("value", getContext().getSharedPreferences(paramString1, i).getBoolean(paramString2, Boolean.parseBoolean(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putBoolean("value", getContext().getSharedPreferences(paramString1, i).contains(paramString2));
      }
    case 10: 
      bQs();
      paramUri = (Integer)this.vjD.get(paramString1);
      if (paramUri == null)
      {
        i = 0;
        j = i + 1;
        this.vjD.put(paramString1, Integer.valueOf(j));
        paramUri = (Integer)this.vjD.get(paramString1);
        if (paramUri != null) {
          break label465;
        }
        i = 0;
        label435:
        if (j != i) {
          break label474;
        }
      }
      label465:
      label474:
      for (bool = true;; bool = false)
      {
        paramArrayOfString1.putBoolean("value", bool);
        break;
        i = paramUri.intValue();
        break label392;
        i = paramUri.intValue();
        break label435;
      }
    }
    bQs();
    paramUri = (Integer)this.vjD.get(paramString1);
    if (paramUri == null)
    {
      i = 0;
      label505:
      j = i - 1;
      if (j > 0) {
        break label569;
      }
      this.vjD.remove(paramString1);
      if (this.vjD.containsKey(paramString1)) {
        break label563;
      }
    }
    label563:
    for (boolean bool = true;; bool = false)
    {
      paramArrayOfString1.putBoolean("value", bool);
      break;
      i = paramUri.intValue();
      break label505;
    }
    label569:
    this.vjD.put(paramString1, Integer.valueOf(j));
    paramUri = (Integer)this.vjD.get(paramString1);
    if (paramUri == null)
    {
      i = 0;
      label606:
      if (j != i) {
        break label636;
      }
    }
    label636:
    for (bool = true;; bool = false)
    {
      paramArrayOfString1.putBoolean("value", bool);
      break;
      i = paramUri.intValue();
      break label606;
    }
  }
  
  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    GMTrace.i(13916230909952L, 103684);
    try
    {
      if (this.dT == null) {
        this.dT = new ArrayList();
      }
      Boolean localBoolean = (Boolean)b("registerOnSharedPreferenceChangeListener", null, Boolean.valueOf(false));
      if ((localBoolean != null) && (localBoolean.booleanValue()))
      {
        this.dT.add(new SoftReference(paramOnSharedPreferenceChangeListener));
        if (this.idj == null)
        {
          this.idj = new BroadcastReceiver()
          {
            public final void onReceive(Context paramAnonymousContext, Intent arg2)
            {
              GMTrace.i(13933142343680L, 103810);
              Object localObject = ???.getStringExtra("name");
              paramAnonymousContext = (List)???.getSerializableExtra("value");
              if ((MultiProcessSharedPreferences.a(MultiProcessSharedPreferences.this).equals(localObject)) && (paramAnonymousContext != null)) {
                for (;;)
                {
                  int i;
                  synchronized (MultiProcessSharedPreferences.this)
                  {
                    localObject = MultiProcessSharedPreferences.b(MultiProcessSharedPreferences.this);
                    ??? = new ArrayList((Collection)localObject);
                    i = paramAnonymousContext.size() - 1;
                    if (i < 0) {
                      break;
                    }
                    localObject = (String)paramAnonymousContext.get(i);
                    Iterator localIterator = ???.iterator();
                    if (localIterator.hasNext())
                    {
                      SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)((SoftReference)localIterator.next()).get();
                      if (localOnSharedPreferenceChangeListener == null) {
                        continue;
                      }
                      localOnSharedPreferenceChangeListener.onSharedPreferenceChanged(MultiProcessSharedPreferences.this, (String)localObject);
                    }
                  }
                  i -= 1;
                }
              }
              GMTrace.o(13933142343680L, 103810);
            }
          };
          this.mContext.registerReceiver(this.idj, new IntentFilter(RY(this.mName)));
        }
      }
      GMTrace.o(13916230909952L, 103684);
      return;
    }
    finally {}
  }
  
  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    GMTrace.i(13916365127680L, 103685);
    Object localObject;
    try
    {
      b("unregisterOnSharedPreferenceChangeListener", null, Boolean.valueOf(false));
      if (this.dT == null) {
        break label190;
      }
      localObject = new ArrayList();
      Iterator localIterator = this.dT.iterator();
      while (localIterator.hasNext())
      {
        SoftReference localSoftReference = (SoftReference)localIterator.next();
        SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)localSoftReference.get();
        if ((localOnSharedPreferenceChangeListener != null) && (localOnSharedPreferenceChangeListener.equals(paramOnSharedPreferenceChangeListener))) {
          ((List)localObject).add(localSoftReference);
        }
      }
      paramOnSharedPreferenceChangeListener = ((List)localObject).iterator();
    }
    finally {}
    while (paramOnSharedPreferenceChangeListener.hasNext())
    {
      localObject = (SoftReference)paramOnSharedPreferenceChangeListener.next();
      this.dT.remove(localObject);
    }
    if ((this.dT.isEmpty()) && (this.idj != null))
    {
      this.mContext.unregisterReceiver(this.idj);
      this.idj = null;
      this.dT = null;
    }
    label190:
    GMTrace.o(13916365127680L, 103685);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(13917438869504L, 103693);
    String str1 = (String)paramUri.getPathSegments().get(0);
    int i = Integer.parseInt(paramArrayOfString[0]);
    Object localObject1 = getContext().getSharedPreferences(str1, i);
    int j = this.vjC.match(paramUri);
    switch (j)
    {
    default: 
      throw new IllegalArgumentException("This is Unknown Uri：" + paramUri);
    }
    if ((this.vjD != null) && (this.vjD.get(str1) != null) && (((Integer)this.vjD.get(str1)).intValue() > 0))
    {
      i = 1;
      paramUri = new HashMap();
      if (i == 0) {
        break label763;
      }
      paramString = new ArrayList();
      paramUri = ((SharedPreferences)localObject1).getAll();
    }
    for (;;)
    {
      localObject1 = ((SharedPreferences)localObject1).edit();
      if (Boolean.parseBoolean(paramArrayOfString[1]))
      {
        if ((i != 0) && (paramUri != null) && (!paramUri.isEmpty()))
        {
          paramArrayOfString = paramUri.entrySet().iterator();
          for (;;)
          {
            if (paramArrayOfString.hasNext())
            {
              paramString.add(((Map.Entry)paramArrayOfString.next()).getKey());
              continue;
              i = 0;
              break;
            }
          }
        }
        ((SharedPreferences.Editor)localObject1).clear();
      }
      paramArrayOfString = paramContentValues.valueSet().iterator();
      while (paramArrayOfString.hasNext())
      {
        Object localObject2 = (Map.Entry)paramArrayOfString.next();
        String str2 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        if (((localObject2 instanceof b)) || (localObject2 == null))
        {
          ((SharedPreferences.Editor)localObject1).remove(str2);
          if ((i != 0) && (paramUri != null) && (paramUri.containsKey(str2))) {
            paramString.add(str2);
          }
        }
        for (;;)
        {
          if (!(localObject2 instanceof String)) {
            break label462;
          }
          ((SharedPreferences.Editor)localObject1).putString(str2, (String)localObject2);
          break;
          if ((i != 0) && (paramUri != null) && ((!paramUri.containsKey(str2)) || ((paramUri.containsKey(str2)) && (!localObject2.equals(paramUri.get(str2)))))) {
            paramString.add(str2);
          }
        }
        label462:
        if ((localObject2 instanceof Set)) {
          c.a((SharedPreferences.Editor)localObject1, str2, (Set)localObject2);
        } else if ((localObject2 instanceof Integer)) {
          ((SharedPreferences.Editor)localObject1).putInt(str2, ((Integer)localObject2).intValue());
        } else if ((localObject2 instanceof Long)) {
          ((SharedPreferences.Editor)localObject1).putLong(str2, ((Long)localObject2).longValue());
        } else if ((localObject2 instanceof Float)) {
          ((SharedPreferences.Editor)localObject1).putFloat(str2, ((Float)localObject2).floatValue());
        } else if ((localObject2 instanceof Boolean)) {
          ((SharedPreferences.Editor)localObject1).putBoolean(str2, ((Boolean)localObject2).booleanValue());
        }
      }
      if ((i != 0) && (paramString.isEmpty())) {
        i = 1;
      }
      for (;;)
      {
        paramContentValues.clear();
        GMTrace.o(13917438869504L, 103693);
        return i;
        switch (j)
        {
        }
        do
        {
          i = 0;
          break;
          try
          {
            localObject1.getClass().getDeclaredMethod("apply", new Class[0]).invoke(localObject1, new Object[0]);
            i(str1, paramString);
            i = 1;
          }
          catch (IllegalArgumentException paramUri)
          {
            throw new RuntimeException(paramUri);
          }
          catch (IllegalAccessException paramUri)
          {
            throw new RuntimeException(paramUri);
          }
          catch (InvocationTargetException paramUri)
          {
            throw new RuntimeException(paramUri);
          }
          catch (NoSuchMethodException paramUri)
          {
            throw new RuntimeException(paramUri);
          }
        } while (!((SharedPreferences.Editor)localObject1).commit());
        i(str1, paramString);
        i = 1;
      }
      label763:
      paramString = null;
    }
  }
  
  private static final class a
    extends MatrixCursor
  {
    private Bundle ui;
    
    public a(Bundle paramBundle)
    {
      super(0);
      GMTrace.i(13877173551104L, 103393);
      this.ui = paramBundle;
      GMTrace.o(13877173551104L, 103393);
    }
    
    public final Bundle getExtras()
    {
      GMTrace.i(13877307768832L, 103394);
      Bundle localBundle = this.ui;
      GMTrace.o(13877307768832L, 103394);
      return localBundle;
    }
    
    public final Bundle respond(Bundle paramBundle)
    {
      GMTrace.i(13877441986560L, 103395);
      this.ui = paramBundle;
      paramBundle = this.ui;
      GMTrace.o(13877441986560L, 103395);
      return paramBundle;
    }
  }
  
  public final class b
    implements SharedPreferences.Editor
  {
    private final Map<String, Object> vjq;
    private boolean vjr;
    
    public b()
    {
      GMTrace.i(13926968328192L, 103764);
      this.vjq = new HashMap();
      this.vjr = false;
      GMTrace.o(13926968328192L, 103764);
    }
    
    private boolean setValue(String paramString)
    {
      GMTrace.i(13928444723200L, 103775);
      if (MultiProcessSharedPreferences.c(MultiProcessSharedPreferences.this))
      {
        GMTrace.o(13928444723200L, 103775);
        return false;
      }
      synchronized (MultiProcessSharedPreferences.this)
      {
        MultiProcessSharedPreferences.a(MultiProcessSharedPreferences.this, MultiProcessSharedPreferences.d(MultiProcessSharedPreferences.this));
        int i = MultiProcessSharedPreferences.e(MultiProcessSharedPreferences.this);
        boolean bool = this.vjr;
        try
        {
          paramString = Uri.withAppendedPath(Uri.withAppendedPath(MultiProcessSharedPreferences.bQt(), MultiProcessSharedPreferences.a(MultiProcessSharedPreferences.this)), paramString);
          ContentValues localContentValues = MultiProcessSharedPreferences.c.h((HashMap)this.vjq);
          if (MultiProcessSharedPreferences.d(MultiProcessSharedPreferences.this).getContentResolver().update(paramString, localContentValues, null, new String[] { String.valueOf(i), String.valueOf(bool) }) > 0) {}
          for (bool = true;; bool = false)
          {
            GMTrace.o(13928444723200L, 103775);
            return bool;
          }
          paramString = finally;
        }
        finally {}
      }
    }
    
    public final void apply()
    {
      GMTrace.i(13928176287744L, 103773);
      setValue("apply");
      GMTrace.o(13928176287744L, 103773);
    }
    
    public final SharedPreferences.Editor clear()
    {
      GMTrace.i(13928042070016L, 103772);
      try
      {
        this.vjr = true;
        GMTrace.o(13928042070016L, 103772);
        return this;
      }
      finally {}
    }
    
    public final boolean commit()
    {
      GMTrace.i(13928310505472L, 103774);
      boolean bool = setValue("commit");
      GMTrace.o(13928310505472L, 103774);
      return bool;
    }
    
    public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13927773634560L, 103770);
      try
      {
        this.vjq.put(paramString, Boolean.valueOf(paramBoolean));
        GMTrace.o(13927773634560L, 103770);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      GMTrace.i(13927639416832L, 103769);
      try
      {
        this.vjq.put(paramString, Float.valueOf(paramFloat));
        GMTrace.o(13927639416832L, 103769);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      GMTrace.i(13927370981376L, 103767);
      try
      {
        this.vjq.put(paramString, Integer.valueOf(paramInt));
        GMTrace.o(13927370981376L, 103767);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      GMTrace.i(13927505199104L, 103768);
      try
      {
        this.vjq.put(paramString, Long.valueOf(paramLong));
        GMTrace.o(13927505199104L, 103768);
        return this;
      }
      finally {}
    }
    
    public final SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      GMTrace.i(13927102545920L, 103765);
      try
      {
        this.vjq.put(paramString1, paramString2);
        GMTrace.o(13927102545920L, 103765);
        return this;
      }
      finally {}
    }
    
    /* Error */
    public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      // Byte code:
      //   0: ldc2_w 176
      //   3: ldc -78
      //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: monitorenter
      //   10: aload_0
      //   11: getfield 37	com/tencent/mm/sdk/platformtools/MultiProcessSharedPreferences$b:vjq	Ljava/util/Map;
      //   14: astore_3
      //   15: aload_2
      //   16: ifnonnull +26 -> 42
      //   19: aconst_null
      //   20: astore_2
      //   21: aload_3
      //   22: aload_1
      //   23: aload_2
      //   24: invokeinterface 138 3 0
      //   29: pop
      //   30: aload_0
      //   31: monitorexit
      //   32: ldc2_w 176
      //   35: ldc -78
      //   37: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   40: aload_0
      //   41: areturn
      //   42: new 180	java/util/HashSet
      //   45: dup
      //   46: aload_2
      //   47: invokespecial 183	java/util/HashSet:<init>	(Ljava/util/Collection;)V
      //   50: astore_2
      //   51: goto -30 -> 21
      //   54: astore_1
      //   55: aload_0
      //   56: monitorexit
      //   57: aload_1
      //   58: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	59	0	this	b
      //   0	59	1	paramString	String
      //   0	59	2	paramSet	Set<String>
      //   14	8	3	localMap	Map
      // Exception table:
      //   from	to	target	type
      //   10	15	54	finally
      //   21	32	54	finally
      //   42	51	54	finally
      //   55	57	54	finally
    }
    
    public final SharedPreferences.Editor remove(String paramString)
    {
      GMTrace.i(13927907852288L, 103771);
      try
      {
        this.vjq.put(paramString, null);
        GMTrace.o(13927907852288L, 103771);
        return this;
      }
      finally {}
    }
  }
  
  private static final class c
  {
    public static SharedPreferences.Editor a(SharedPreferences.Editor paramEditor, String paramString, Set<String> paramSet)
    {
      GMTrace.i(13954617180160L, 103970);
      try
      {
        paramEditor = (SharedPreferences.Editor)paramEditor.getClass().getDeclaredMethod("putStringSet", new Class[] { String.class, Set.class }).invoke(paramEditor, new Object[] { paramString, paramSet });
        GMTrace.o(13954617180160L, 103970);
        return paramEditor;
      }
      catch (IllegalArgumentException paramEditor)
      {
        throw new RuntimeException(paramEditor);
      }
      catch (IllegalAccessException paramEditor)
      {
        throw new RuntimeException(paramEditor);
      }
      catch (InvocationTargetException paramEditor)
      {
        throw new RuntimeException(paramEditor);
      }
      catch (NoSuchMethodException paramEditor)
      {
        throw new RuntimeException(paramEditor);
      }
    }
    
    public static ContentValues h(HashMap<String, Object> paramHashMap)
    {
      GMTrace.i(13954482962432L, 103969);
      try
      {
        Constructor localConstructor = ContentValues.class.getDeclaredConstructor(new Class[] { HashMap.class });
        localConstructor.setAccessible(true);
        paramHashMap = (ContentValues)localConstructor.newInstance(new Object[] { paramHashMap });
        GMTrace.o(13954482962432L, 103969);
        return paramHashMap;
      }
      catch (IllegalArgumentException paramHashMap)
      {
        throw new RuntimeException(paramHashMap);
      }
      catch (IllegalAccessException paramHashMap)
      {
        throw new RuntimeException(paramHashMap);
      }
      catch (InvocationTargetException paramHashMap)
      {
        throw new RuntimeException(paramHashMap);
      }
      catch (NoSuchMethodException paramHashMap)
      {
        throw new RuntimeException(paramHashMap);
      }
      catch (InstantiationException paramHashMap)
      {
        throw new RuntimeException(paramHashMap);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\MultiProcessSharedPreferences.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */