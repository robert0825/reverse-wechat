package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
  extends i<a>
{
  public static final String[] fTX;
  public static Map<String, String> lsg;
  
  static
  {
    GMTrace.i(7156891910144L, 53323);
    fTX = new String[] { i.a(a.fTp, "FreeWifiConfig"), "CREATE INDEX IF NOT EXISTS idx_freewificonfig_key  on FreeWifiConfig  (  key )" };
    lsg = new ConcurrentHashMap();
    GMTrace.o(7156891910144L, 53323);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "FreeWifiConfig", null);
    GMTrace.i(7156220821504L, 53318);
    GMTrace.o(7156220821504L, 53318);
  }
  
  public final void MH()
  {
    GMTrace.i(7156757692416L, 53322);
    if (lsg != null) {
      lsg.clear();
    }
    super.eZ("FreeWifiConfig", "delete from FreeWifiConfig");
    GMTrace.o(7156757692416L, 53322);
  }
  
  /* Error */
  public final String aBF()
  {
    // Byte code:
    //   0: ldc2_w 77
    //   3: ldc 79
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 81	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 82	java/lang/StringBuilder:<init>	()V
    //   15: astore_2
    //   16: aload_2
    //   17: ldc 84
    //   19: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: aload_0
    //   24: ldc 90
    //   26: iconst_0
    //   27: anewarray 23	java/lang/String
    //   30: invokevirtual 94	com/tencent/mm/plugin/freewifi/g/b:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   33: astore_1
    //   34: aload_1
    //   35: invokeinterface 100 1 0
    //   40: ifeq +99 -> 139
    //   43: aload_2
    //   44: aload_1
    //   45: iconst_0
    //   46: invokeinterface 104 2 0
    //   51: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 106
    //   56: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_1
    //   60: iconst_1
    //   61: invokeinterface 104 2 0
    //   66: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc 106
    //   71: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload_1
    //   75: iconst_2
    //   76: invokeinterface 110 2 0
    //   81: invokevirtual 113	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   84: ldc 115
    //   86: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: goto -56 -> 34
    //   93: astore_2
    //   94: ldc 117
    //   96: new 81	java/lang/StringBuilder
    //   99: dup
    //   100: ldc 119
    //   102: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   105: aload_2
    //   106: invokevirtual 125	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   109: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload_2
    //   119: invokevirtual 125	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   122: astore_2
    //   123: aload_1
    //   124: invokeinterface 136 1 0
    //   129: ldc2_w 77
    //   132: ldc 79
    //   134: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   137: aload_2
    //   138: areturn
    //   139: ldc 117
    //   141: new 81	java/lang/StringBuilder
    //   144: dup
    //   145: ldc 119
    //   147: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: aload_2
    //   151: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload_2
    //   164: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: astore_2
    //   168: aload_1
    //   169: invokeinterface 136 1 0
    //   174: ldc2_w 77
    //   177: ldc 79
    //   179: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   182: aload_2
    //   183: areturn
    //   184: astore_2
    //   185: aload_1
    //   186: invokeinterface 136 1 0
    //   191: aload_2
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	b
    //   33	153	1	localCursor	Cursor
    //   15	29	2	localStringBuilder	StringBuilder
    //   93	26	2	localException	Exception
    //   122	61	2	str	String
    //   184	8	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   34	90	93	java/lang/Exception
    //   139	168	93	java/lang/Exception
    //   34	90	184	finally
    //   94	123	184	finally
    //   139	168	184	finally
  }
  
  /* Error */
  public final void cl(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 138
    //   3: ldc -116
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: invokestatic 146	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   12: ifne +10 -> 22
    //   15: aload_2
    //   16: invokestatic 146	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   19: ifeq +12 -> 31
    //   22: ldc2_w 138
    //   25: ldc -116
    //   27: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: return
    //   31: getstatic 46	com/tencent/mm/plugin/freewifi/g/b:lsg	Ljava/util/Map;
    //   34: ifnull +28 -> 62
    //   37: getstatic 46	com/tencent/mm/plugin/freewifi/g/b:lsg	Ljava/util/Map;
    //   40: invokeinterface 150 1 0
    //   45: sipush 1000
    //   48: if_icmpge +104 -> 152
    //   51: getstatic 46	com/tencent/mm/plugin/freewifi/g/b:lsg	Ljava/util/Map;
    //   54: aload_1
    //   55: aload_2
    //   56: invokeinterface 154 3 0
    //   61: pop
    //   62: aload_0
    //   63: new 81	java/lang/StringBuilder
    //   66: dup
    //   67: ldc -100
    //   69: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: ldc -98
    //   78: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: iconst_0
    //   85: anewarray 23	java/lang/String
    //   88: invokevirtual 94	com/tencent/mm/plugin/freewifi/g/b:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   91: astore_3
    //   92: new 25	com/tencent/mm/plugin/freewifi/g/a
    //   95: dup
    //   96: invokespecial 159	com/tencent/mm/plugin/freewifi/g/a:<init>	()V
    //   99: astore 4
    //   101: aload 4
    //   103: aload_1
    //   104: putfield 163	com/tencent/mm/plugin/freewifi/g/a:field_key	Ljava/lang/String;
    //   107: aload 4
    //   109: aload_2
    //   110: putfield 166	com/tencent/mm/plugin/freewifi/g/a:field_value	Ljava/lang/String;
    //   113: aload 4
    //   115: invokestatic 172	java/lang/System:currentTimeMillis	()J
    //   118: putfield 176	com/tencent/mm/plugin/freewifi/g/a:field_modifyTime	J
    //   121: aload_3
    //   122: invokeinterface 179 1 0
    //   127: ifne +58 -> 185
    //   130: aload_0
    //   131: aload 4
    //   133: invokevirtual 183	com/tencent/mm/plugin/freewifi/g/b:b	(Lcom/tencent/mm/sdk/e/c;)Z
    //   136: pop
    //   137: aload_3
    //   138: invokeinterface 136 1 0
    //   143: ldc2_w 138
    //   146: ldc -116
    //   148: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   151: return
    //   152: getstatic 46	com/tencent/mm/plugin/freewifi/g/b:lsg	Ljava/util/Map;
    //   155: invokeinterface 66 1 0
    //   160: getstatic 46	com/tencent/mm/plugin/freewifi/g/b:lsg	Ljava/util/Map;
    //   163: aload_1
    //   164: aload_2
    //   165: invokeinterface 154 3 0
    //   170: pop
    //   171: goto -109 -> 62
    //   174: astore_3
    //   175: ldc 117
    //   177: ldc -71
    //   179: invokestatic 188	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: goto -120 -> 62
    //   185: aload_0
    //   186: aload 4
    //   188: iconst_0
    //   189: anewarray 23	java/lang/String
    //   192: invokevirtual 192	com/tencent/mm/plugin/freewifi/g/b:c	(Lcom/tencent/mm/sdk/e/c;[Ljava/lang/String;)Z
    //   195: pop
    //   196: goto -59 -> 137
    //   199: astore_1
    //   200: aload_3
    //   201: invokeinterface 136 1 0
    //   206: aload_1
    //   207: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	this	b
    //   0	208	1	paramString1	String
    //   0	208	2	paramString2	String
    //   91	47	3	localCursor	Cursor
    //   174	27	3	localException	Exception
    //   99	88	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   31	62	174	java/lang/Exception
    //   152	171	174	java/lang/Exception
    //   92	137	199	finally
    //   185	196	199	finally
  }
  
  public final String yF(String paramString)
  {
    GMTrace.i(7156489256960L, 53320);
    if (m.yp(paramString))
    {
      GMTrace.o(7156489256960L, 53320);
      return "";
    }
    try
    {
      if (lsg != null)
      {
        String str = (String)lsg.get(paramString);
        if (str != null)
        {
          GMTrace.o(7156489256960L, 53320);
          return str;
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiConfigStorage", "Map get error!");
      paramString = rawQuery("select * from FreeWifiConfig where key = '" + paramString + "'", new String[0]);
      if (paramString == null)
      {
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(7156489256960L, 53320);
        return "";
      }
      try
      {
        if (paramString.moveToFirst())
        {
          Object localObject1 = new a();
          ((a)localObject1).b(paramString);
          localObject1 = ((a)localObject1).field_value;
          if (paramString != null) {
            paramString.close();
          }
          GMTrace.o(7156489256960L, 53320);
          return (String)localObject1;
        }
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(7156489256960L, 53320);
        return "";
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */