package com.tencent.mm.plugin.ipcall.a.g;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.Data;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class b
{
  public static final String jRE;
  private static HashMap<String, c> mmO;
  
  static
  {
    GMTrace.i(11574534209536L, 86237);
    jRE = new String(Character.toChars(91));
    mmO = new HashMap();
    GMTrace.o(11574534209536L, 86237);
  }
  
  public b()
  {
    GMTrace.i(11573728903168L, 86231);
    GMTrace.o(11573728903168L, 86231);
  }
  
  /* Error */
  public static ArrayList<String> Aj(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 53
    //   3: ldc 55
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 57	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 58	java/util/ArrayList:<init>	()V
    //   15: astore_1
    //   16: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   19: ldc 66
    //   21: invokestatic 72	com/tencent/mm/pluginsdk/h/a:aS	(Landroid/content/Context;Ljava/lang/String;)Z
    //   24: ifne +20 -> 44
    //   27: ldc 74
    //   29: ldc 76
    //   31: invokestatic 82	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: ldc2_w 53
    //   37: ldc 55
    //   39: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: aload_1
    //   43: areturn
    //   44: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   47: invokevirtual 88	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   50: getstatic 94	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   53: aconst_null
    //   54: ldc 96
    //   56: iconst_1
    //   57: anewarray 22	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: aastore
    //   64: aconst_null
    //   65: invokevirtual 102	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   68: astore_0
    //   69: aload_0
    //   70: ifnonnull +13 -> 83
    //   73: ldc2_w 53
    //   76: ldc 55
    //   78: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   81: aload_1
    //   82: areturn
    //   83: aload_0
    //   84: invokeinterface 108 1 0
    //   89: ifeq +86 -> 175
    //   92: aload_0
    //   93: invokeinterface 111 1 0
    //   98: ifne +77 -> 175
    //   101: aload_1
    //   102: aload_0
    //   103: aload_0
    //   104: ldc 113
    //   106: invokeinterface 117 2 0
    //   111: invokeinterface 121 2 0
    //   116: invokevirtual 125	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   119: pop
    //   120: aload_0
    //   121: invokeinterface 128 1 0
    //   126: pop
    //   127: goto -35 -> 92
    //   130: astore_2
    //   131: ldc 74
    //   133: ldc -126
    //   135: iconst_2
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_2
    //   142: invokevirtual 134	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   145: aastore
    //   146: dup
    //   147: iconst_1
    //   148: aload_2
    //   149: invokevirtual 138	java/lang/Object:getClass	()Ljava/lang/Class;
    //   152: invokevirtual 143	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   155: aastore
    //   156: invokestatic 146	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload_0
    //   160: invokeinterface 149 1 0
    //   165: ldc2_w 53
    //   168: ldc 55
    //   170: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   173: aload_1
    //   174: areturn
    //   175: aload_0
    //   176: invokeinterface 149 1 0
    //   181: goto -16 -> 165
    //   184: astore_1
    //   185: aload_0
    //   186: invokeinterface 149 1 0
    //   191: aload_1
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	paramString	String
    //   15	159	1	localArrayList	ArrayList
    //   184	8	1	localObject	Object
    //   130	19	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   83	92	130	java/lang/Exception
    //   92	127	130	java/lang/Exception
    //   83	92	184	finally
    //   92	127	184	finally
    //   131	159	184	finally
  }
  
  private static c a(Cursor paramCursor, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    GMTrace.i(11574399991808L, 86236);
    if (!com.tencent.mm.pluginsdk.h.a.aS(ab.getContext(), "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      GMTrace.o(11574399991808L, 86236);
      return null;
    }
    c localc = new c();
    localc.mmP = new ArrayList();
    Object localObject1 = paramCursor.getString(paramInt1);
    Object localObject3 = paramCursor.getString(paramInt2);
    paramCursor = paramCursor.getString(paramInt3);
    localc.field_contactId = ((String)localObject1);
    localc.field_systemAddressBookUsername = ((String)localObject3);
    if ((!bg.nm(paramCursor)) && (!localc.mmP.contains(paramCursor))) {
      localc.mmP.add(paramCursor);
    }
    if ((bg.nm(localc.field_systemAddressBookUsername)) && (localc.mmP.size() > 0)) {
      localc.field_systemAddressBookUsername = ((String)localc.mmP.get(0));
    }
    localObject3 = localc.mmP.iterator();
    paramCursor = null;
    if (((Iterator)localObject3).hasNext())
    {
      localObject1 = com.tencent.mm.plugin.ipcall.b.a.AG((String)((Iterator)localObject3).next());
      if (!bg.nm((String)localObject1))
      {
        paramCursor = (Cursor)localObject1;
        if (((String)localObject1).endsWith("@stranger")) {}
      }
    }
    for (;;)
    {
      if (!bg.nm((String)localObject1)) {
        localc.field_wechatUsername = ((String)localObject1);
      }
      if (!bg.nm(localc.field_systemAddressBookUsername)) {}
      for (;;)
      {
        try
        {
          paramCursor = com.tencent.mm.platformtools.c.nb(localc.field_systemAddressBookUsername);
          if (!bg.nm(paramCursor)) {
            if (!Character.isLetter(paramCursor.charAt(0)))
            {
              localc.field_sortKey = (jRE + paramCursor.toUpperCase());
              GMTrace.o(11574399991808L, 86236);
              return localc;
            }
          }
        }
        catch (Exception paramCursor)
        {
          w.d("MicroMsg.IPCallAddressBookInfoExtracter", "getFullSpell error: %s, class: %s", new Object[] { paramCursor.getMessage(), paramCursor.getClass().getSimpleName() });
          paramCursor = (Cursor)localObject2;
          continue;
          localc.field_sortKey = paramCursor.toUpperCase();
          continue;
          localc.field_sortKey = "";
          continue;
        }
        localc.field_sortKey = "";
      }
      localObject1 = paramCursor;
    }
  }
  
  public static ArrayList<c> aIU()
  {
    GMTrace.i(11573863120896L, 86232);
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    if (!com.tencent.mm.pluginsdk.h.a.aS(ab.getContext(), "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      GMTrace.o(11573863120896L, 86232);
      return localArrayList;
    }
    Cursor localCursor = ab.getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id", "display_name", "data1" }, "mimetype='vnd.android.cursor.item/phone_v2'", null, null);
    HashMap localHashMap = new HashMap();
    w.d("MicroMsg.IPCallAddressBookInfoExtracter", "query FromSystemPhoneBook, time: " + (System.currentTimeMillis() - l1));
    if (localCursor == null)
    {
      GMTrace.o(11573863120896L, 86232);
      return localArrayList;
    }
    for (;;)
    {
      try
      {
        w.d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, count: %d", new Object[] { Integer.valueOf(localCursor.getCount()) });
        if (!localCursor.moveToFirst()) {
          break label484;
        }
        int i = localCursor.getColumnIndex("contact_id");
        int j = localCursor.getColumnIndex("display_name");
        int k = localCursor.getColumnIndex("data1");
        if (localCursor.isAfterLast()) {
          break label484;
        }
        c localc1 = a(localCursor, i, j, k);
        if ((localc1 != null) && (localc1.mmP != null) && (localc1.mmP.size() > 0) && (!bg.nm(localc1.field_contactId)))
        {
          if (!localHashMap.containsKey(localc1.field_contactId)) {
            continue;
          }
          c localc2 = (c)localHashMap.get(localc1.field_contactId);
          if ((localc1.mmP.size() > 0) && (!localc2.mmP.contains(localc1.mmP.get(0)))) {
            localc2.mmP.add(localc1.mmP.get(0));
          }
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook error: %s, class: %s", new Object[] { localException.getMessage(), localException.getClass().getSimpleName() });
        localCursor.close();
        localArrayList.addAll(localHashMap.values());
        mmO = localHashMap;
        l2 = System.currentTimeMillis();
        w.d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, result size: %d, used %dms", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l2 - l1) });
        GMTrace.o(11573863120896L, 86232);
        return localArrayList;
        localHashMap.put(localException.field_contactId, localException);
        continue;
      }
      finally
      {
        localCursor.close();
      }
      localCursor.moveToNext();
    }
    for (;;)
    {
      long l2;
      label484:
      localCursor.close();
    }
  }
  
  public static HashMap<String, c> aIV()
  {
    GMTrace.i(11573997338624L, 86233);
    HashMap localHashMap = mmO;
    GMTrace.o(11573997338624L, 86233);
    return localHashMap;
  }
  
  public static HashMap<String, c> aIW()
  {
    GMTrace.i(11574131556352L, 86234);
    aIU();
    HashMap localHashMap = mmO;
    GMTrace.o(11574131556352L, 86234);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */