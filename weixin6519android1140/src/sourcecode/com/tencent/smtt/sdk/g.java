package com.tencent.smtt.sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class g
{
  public static final String LOGTAG = CookieManager.LOGTAG;
  static File xUy;
  
  public static void a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramContext == null) {}
    label10:
    String[] arrayOfString;
    SQLiteDatabase localSQLiteDatabase;
    do
    {
      do
      {
        break label10;
        break label10;
        do
        {
          return;
        } while ((paramInt == CookieManager.a.xTl) && (TextUtils.isEmpty(paramString)));
        arrayOfString = paramString.split(",");
      } while ((arrayOfString == null) || (arrayOfString.length <= 0));
      localSQLiteDatabase = gf(paramContext);
    } while (localSQLiteDatabase == null);
    HashMap localHashMap = new HashMap();
    paramString = (String)localObject2;
    for (;;)
    {
      int i;
      try
      {
        localObject2 = localSQLiteDatabase.rawQuery("select * from cookies", null);
        paramString = (String)localObject2;
        localObject1 = localObject2;
        if (((Cursor)localObject2).getCount() > 0)
        {
          paramString = (String)localObject2;
          localObject1 = localObject2;
          if (((Cursor)localObject2).moveToFirst())
          {
            paramString = (String)localObject2;
            localObject1 = localObject2;
            String str = ((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("host_key"));
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (paramInt == CookieManager.a.xTl)
            {
              paramString = (String)localObject2;
              localObject1 = localObject2;
              int j = arrayOfString.length;
              i = 0;
              if (i >= j) {
                break label656;
              }
              paramString = (String)localObject2;
              localObject1 = localObject2;
              if (!str.equals(arrayOfString[i])) {
                continue;
              }
              i = 1;
              break label659;
            }
            paramString = (String)localObject2;
            localObject1 = localObject2;
            StringBuilder localStringBuilder = new StringBuilder();
            paramString = (String)localObject2;
            localObject1 = localObject2;
            localStringBuilder.append(((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("value")));
            paramString = (String)localObject2;
            localObject1 = localObject2;
            localStringBuilder.append(";").append(((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("name")));
            paramString = (String)localObject2;
            localObject1 = localObject2;
            localStringBuilder.append(";").append(((Cursor)localObject2).getInt(((Cursor)localObject2).getColumnIndex("expires_utc")));
            paramString = (String)localObject2;
            localObject1 = localObject2;
            localStringBuilder.append(";").append(((Cursor)localObject2).getInt(((Cursor)localObject2).getColumnIndex("priority")));
            paramString = (String)localObject2;
            localObject1 = localObject2;
            localHashMap.put(str, localStringBuilder.toString());
            paramString = (String)localObject2;
            localObject1 = localObject2;
            boolean bool = ((Cursor)localObject2).moveToNext();
            if (bool) {
              continue;
            }
          }
        }
      }
      catch (Throwable localThrowable)
      {
        localObject1 = paramString;
        new StringBuilder("getCookieDBVersion exception:").append(localThrowable.toString());
        if (paramString == null) {
          continue;
        }
        paramString.close();
        if ((localSQLiteDatabase == null) || (!localSQLiteDatabase.isOpen())) {
          continue;
        }
        localSQLiteDatabase.close();
        continue;
      }
      finally
      {
        if (localObject1 == null) {
          continue;
        }
        ((Cursor)localObject1).close();
        if ((localSQLiteDatabase == null) || (!localSQLiteDatabase.isOpen())) {
          continue;
        }
        localSQLiteDatabase.close();
      }
      if (localHashMap.isEmpty()) {
        break;
      }
      if (paramContext != null) {
        f.c(ge(paramContext), false);
      }
      paramString = localHashMap.entrySet().iterator();
      if (paramString.hasNext())
      {
        localObject2 = (Map.Entry)paramString.next();
        localObject1 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (String)((Map.Entry)localObject2).getValue();
        CookieManager.getInstance().setCookie((String)localObject1, (String)localObject2, true);
        continue;
        i += 1;
      }
      else
      {
        if (Build.VERSION.SDK_INT >= 21) {
          CookieManager.getInstance().flush();
        }
        for (;;)
        {
          if (!paramBoolean) {
            break label654;
          }
          c(gf(paramContext));
          paramInt = gg(paramContext);
          if (paramInt == -1) {
            break;
          }
          CookieManager.getInstance();
          CookieManager.setROMCookieDBVersion(paramContext, paramInt);
          return;
          CookieSyncManager.getInstance().sync();
        }
        label654:
        break label10;
        label656:
        i = 0;
        label659:
        if (i == 0) {}
      }
    }
  }
  
  private static String c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("select * from " + paramString, null);
    int i = paramSQLiteDatabase.getCount();
    int j = paramSQLiteDatabase.getColumnCount();
    paramString = new StringBuilder();
    paramString.append("raws:" + i + ",columns:" + j + "\n");
    if ((i > 0) && (paramSQLiteDatabase.moveToFirst())) {
      do
      {
        paramString.append("\n");
        i = 0;
        while (i < j)
        {
          try
          {
            String str = paramSQLiteDatabase.getString(i);
            paramString.append(str).append(",");
          }
          catch (Exception localException)
          {
            for (;;) {}
          }
          i += 1;
        }
        paramString.append("\n");
      } while (paramSQLiteDatabase.moveToNext());
    } else {
      return paramString.toString();
    }
  }
  
  private static ArrayList<String> c(SQLiteDatabase paramSQLiteDatabase)
  {
    Object localObject2 = null;
    if (paramSQLiteDatabase == null) {
      return null;
    }
    localObject4 = new ArrayList();
    try
    {
      Cursor localCursor = paramSQLiteDatabase.rawQuery("select * from sqlite_master where type='table'", null);
      localObject2 = localCursor;
      String str;
      boolean bool;
      if (localObject4 == null) {
        break label164;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        try
        {
          if (localCursor.moveToFirst())
          {
            localObject2 = localCursor;
            str = localCursor.getString(1);
            localObject2 = localCursor;
            localCursor.getString(4);
            localObject2 = localCursor;
            ((ArrayList)localObject4).add(str);
            localObject2 = localCursor;
            c(paramSQLiteDatabase, str);
            localObject2 = localCursor;
            bool = localCursor.moveToNext();
            if (bool) {
              continue;
            }
          }
          if (localCursor != null) {
            localCursor.close();
          }
          if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen())) {
            paramSQLiteDatabase.close();
          }
          return (ArrayList<String>)localObject4;
        }
        finally
        {
          localObject4 = localObject1;
          continue;
        }
        localThrowable = localThrowable;
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen())) {
          paramSQLiteDatabase.close();
        }
      }
    }
    finally
    {
      localObject1 = finally;
      localObject4 = null;
      localObject2 = localObject1;
    }
    ((Cursor)localObject4).close();
    label164:
    if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen())) {
      paramSQLiteDatabase.close();
    }
    throw ((Throwable)localObject2);
  }
  
  private static File ge(Context paramContext)
  {
    if ((xUy == null) && (paramContext != null)) {
      xUy = new File(paramContext.getDir("webview", 0), "Cookies");
    }
    if (xUy == null) {
      xUy = new File("/data/data/" + paramContext.getPackageName() + File.separator + "app_webview" + File.separator + "Cookies");
    }
    return xUy;
  }
  
  private static SQLiteDatabase gf(Context paramContext)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (paramContext == null) {}
    for (;;)
    {
      return (SQLiteDatabase)localObject1;
      paramContext = ge(paramContext);
      if (paramContext == null) {
        continue;
      }
      try
      {
        paramContext = SQLiteDatabase.openDatabase(paramContext.getAbsolutePath(), null, 0);
        localObject1 = paramContext;
        if (paramContext != null) {
          continue;
        }
        TbsLog.i(LOGTAG, "dbPath is not exist!");
        return paramContext;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          paramContext = (Context)localObject2;
        }
      }
    }
  }
  
  /* Error */
  public static int gg(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 6
    //   7: aconst_null
    //   8: astore 9
    //   10: aconst_null
    //   11: astore 8
    //   13: aconst_null
    //   14: astore 7
    //   16: invokestatic 278	java/lang/System:currentTimeMillis	()J
    //   19: pop2
    //   20: aload_0
    //   21: invokestatic 44	com/tencent/smtt/sdk/g:gf	(Landroid/content/Context;)Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore_0
    //   25: aload_0
    //   26: ifnonnull +22 -> 48
    //   29: aload_0
    //   30: ifnull +14 -> 44
    //   33: aload_0
    //   34: invokevirtual 122	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   37: ifeq +7 -> 44
    //   40: aload_0
    //   41: invokevirtual 123	android/database/sqlite/SQLiteDatabase:close	()V
    //   44: iconst_m1
    //   45: istore_2
    //   46: iload_2
    //   47: ireturn
    //   48: aload 9
    //   50: astore 6
    //   52: aload 8
    //   54: astore 7
    //   56: aload_0
    //   57: ldc_w 280
    //   60: aconst_null
    //   61: invokevirtual 57	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore 8
    //   66: aload 8
    //   68: astore 6
    //   70: aload 8
    //   72: astore 7
    //   74: aload 8
    //   76: invokeinterface 63 1 0
    //   81: istore 4
    //   83: aload 8
    //   85: astore 6
    //   87: aload 8
    //   89: astore 7
    //   91: aload 8
    //   93: invokeinterface 211 1 0
    //   98: pop
    //   99: iload_2
    //   100: istore_1
    //   101: iload 4
    //   103: ifle +68 -> 171
    //   106: iload_2
    //   107: istore_1
    //   108: aload 8
    //   110: astore 6
    //   112: aload 8
    //   114: astore 7
    //   116: aload 8
    //   118: invokeinterface 67 1 0
    //   123: ifeq +48 -> 171
    //   126: aload 8
    //   128: astore 6
    //   130: aload 8
    //   132: astore 7
    //   134: aload 8
    //   136: iconst_0
    //   137: invokeinterface 77 2 0
    //   142: ldc_w 282
    //   145: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   148: ifeq +56 -> 204
    //   151: aload 8
    //   153: astore 6
    //   155: aload 8
    //   157: astore 7
    //   159: aload 8
    //   161: iconst_1
    //   162: invokeinterface 77 2 0
    //   167: invokestatic 287	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   170: istore_1
    //   171: aload 8
    //   173: ifnull +10 -> 183
    //   176: aload 8
    //   178: invokeinterface 119 1 0
    //   183: iload_1
    //   184: istore_2
    //   185: aload_0
    //   186: ifnull -140 -> 46
    //   189: iload_1
    //   190: istore_2
    //   191: aload_0
    //   192: invokevirtual 122	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   195: ifeq -149 -> 46
    //   198: aload_0
    //   199: invokevirtual 123	android/database/sqlite/SQLiteDatabase:close	()V
    //   202: iload_1
    //   203: ireturn
    //   204: aload 8
    //   206: astore 6
    //   208: aload 8
    //   210: astore 7
    //   212: aload 8
    //   214: invokeinterface 116 1 0
    //   219: istore 5
    //   221: iload 5
    //   223: ifne -97 -> 126
    //   226: iload_2
    //   227: istore_1
    //   228: goto -57 -> 171
    //   231: astore_0
    //   232: aconst_null
    //   233: astore_0
    //   234: aload 7
    //   236: ifnull +10 -> 246
    //   239: aload 7
    //   241: invokeinterface 119 1 0
    //   246: iload_3
    //   247: istore_2
    //   248: aload_0
    //   249: ifnull -203 -> 46
    //   252: iload_3
    //   253: istore_2
    //   254: aload_0
    //   255: invokevirtual 122	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   258: ifeq -212 -> 46
    //   261: aload_0
    //   262: invokevirtual 123	android/database/sqlite/SQLiteDatabase:close	()V
    //   265: iconst_0
    //   266: ireturn
    //   267: astore 7
    //   269: aconst_null
    //   270: astore_0
    //   271: aload 6
    //   273: ifnull +10 -> 283
    //   276: aload 6
    //   278: invokeinterface 119 1 0
    //   283: aload_0
    //   284: ifnull +14 -> 298
    //   287: aload_0
    //   288: invokevirtual 122	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   291: ifeq +7 -> 298
    //   294: aload_0
    //   295: invokevirtual 123	android/database/sqlite/SQLiteDatabase:close	()V
    //   298: aload 7
    //   300: athrow
    //   301: astore 7
    //   303: goto -32 -> 271
    //   306: astore 6
    //   308: goto -74 -> 234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	311	0	paramContext	Context
    //   100	128	1	i	int
    //   1	253	2	j	int
    //   3	250	3	k	int
    //   81	21	4	m	int
    //   219	3	5	bool	boolean
    //   5	272	6	localObject1	Object
    //   306	1	6	localThrowable	Throwable
    //   14	226	7	localCursor1	Cursor
    //   267	32	7	localObject2	Object
    //   301	1	7	localObject3	Object
    //   11	202	8	localCursor2	Cursor
    //   8	41	9	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   20	25	231	java/lang/Throwable
    //   20	25	267	finally
    //   56	66	301	finally
    //   74	83	301	finally
    //   91	99	301	finally
    //   116	126	301	finally
    //   134	151	301	finally
    //   159	171	301	finally
    //   212	221	301	finally
    //   56	66	306	java/lang/Throwable
    //   74	83	306	java/lang/Throwable
    //   91	99	306	java/lang/Throwable
    //   116	126	306	java/lang/Throwable
    //   134	151	306	java/lang/Throwable
    //   159	171	306	java/lang/Throwable
    //   212	221	306	java/lang/Throwable
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */