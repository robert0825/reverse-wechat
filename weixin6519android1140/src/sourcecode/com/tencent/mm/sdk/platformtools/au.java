package com.tencent.mm.sdk.platformtools;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;

public final class au
{
  public static final String vkw;
  public static final String[] vkx;
  public static ContentObserver vky;
  public static WeakReference<a> vkz;
  
  static
  {
    GMTrace.i(13950456430592L, 103939);
    vkw = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    vkx = new String[] { "_display_name", "_data", "date_added" };
    GMTrace.o(13950456430592L, 103939);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13949651124224L, 103933);
    w.i("MicroMsg.ScreenShotUtil", "summerscreenshot setScreenShotCallback callback[%s], stack[%s]", new Object[] { parama, bg.bQW() });
    if (parama == null)
    {
      if (vky != null)
      {
        ab.getContext().getContentResolver().unregisterContentObserver(vky);
        vky = null;
      }
      if (vkz != null)
      {
        vkz.clear();
        vkz = null;
      }
      GMTrace.o(13949651124224L, 103933);
      return;
    }
    vkz = new WeakReference(parama);
    if (vky == null)
    {
      vky = new ContentObserver(new Handler(Looper.myLooper()))
      {
        private long vkA;
        
        /* Error */
        public final void onChange(boolean paramAnonymousBoolean, Uri paramAnonymousUri)
        {
          // Byte code:
          //   0: ldc2_w 33
          //   3: ldc 35
          //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: ldc 37
          //   10: new 39	java/lang/StringBuilder
          //   13: dup
          //   14: ldc 41
          //   16: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   19: iload_1
          //   20: invokevirtual 48	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
          //   23: ldc 50
          //   25: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   28: aload_2
          //   29: invokevirtual 59	android/net/Uri:toString	()Ljava/lang/String;
          //   32: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   35: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   38: invokestatic 66	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
          //   41: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   44: ifnull +12 -> 56
          //   47: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   50: invokevirtual 76	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
          //   53: ifnonnull +65 -> 118
          //   56: ldc 37
          //   58: ldc 78
          //   60: iconst_1
          //   61: anewarray 80	java/lang/Object
          //   64: dup
          //   65: iconst_0
          //   66: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   69: aastore
          //   70: invokestatic 83	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   73: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
          //   76: invokevirtual 95	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
          //   79: aload_0
          //   80: invokevirtual 101	android/content/ContentResolver:unregisterContentObserver	(Landroid/database/ContentObserver;)V
          //   83: aconst_null
          //   84: putstatic 105	com/tencent/mm/sdk/platformtools/au:vky	Landroid/database/ContentObserver;
          //   87: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   90: ifnull +13 -> 103
          //   93: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   96: invokevirtual 109	java/lang/ref/WeakReference:clear	()V
          //   99: aconst_null
          //   100: putstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   103: aload_0
          //   104: iload_1
          //   105: aload_2
          //   106: invokespecial 111	android/database/ContentObserver:onChange	(ZLandroid/net/Uri;)V
          //   109: ldc2_w 33
          //   112: ldc 35
          //   114: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   117: return
          //   118: aload_2
          //   119: invokevirtual 59	android/net/Uri:toString	()Ljava/lang/String;
          //   122: getstatic 115	com/tencent/mm/sdk/platformtools/au:vkw	Ljava/lang/String;
          //   125: invokevirtual 121	java/lang/String:matches	(Ljava/lang/String;)Z
          //   128: ifne +16 -> 144
          //   131: aload_2
          //   132: invokevirtual 59	android/net/Uri:toString	()Ljava/lang/String;
          //   135: getstatic 115	com/tencent/mm/sdk/platformtools/au:vkw	Ljava/lang/String;
          //   138: invokevirtual 125	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
          //   141: ifeq -38 -> 103
          //   144: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
          //   147: invokevirtual 95	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
          //   150: aload_2
          //   151: getstatic 129	com/tencent/mm/sdk/platformtools/au:vkx	[Ljava/lang/String;
          //   154: aconst_null
          //   155: aconst_null
          //   156: ldc -125
          //   158: invokevirtual 135	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
          //   161: astore 8
          //   163: aload 8
          //   165: ifnull +449 -> 614
          //   168: aload 8
          //   170: invokeinterface 141 1 0
          //   175: ifeq +439 -> 614
          //   178: aload 8
          //   180: aload 8
          //   182: ldc -113
          //   184: invokeinterface 147 2 0
          //   189: invokeinterface 151 2 0
          //   194: astore 10
          //   196: aload 8
          //   198: aload 8
          //   200: ldc -103
          //   202: invokeinterface 147 2 0
          //   207: invokeinterface 157 2 0
          //   212: lstore 4
          //   214: invokestatic 163	java/lang/System:currentTimeMillis	()J
          //   217: ldc2_w 164
          //   220: ldiv
          //   221: lstore 6
          //   223: ldc 37
          //   225: new 39	java/lang/StringBuilder
          //   228: dup
          //   229: ldc -89
          //   231: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   234: aload 10
          //   236: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   239: ldc -87
          //   241: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   244: lload 4
          //   246: invokevirtual 172	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
          //   249: ldc -82
          //   251: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   254: lload 6
          //   256: invokevirtual 172	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
          //   259: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   262: invokestatic 66	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
          //   265: lload 6
          //   267: lload 4
          //   269: lsub
          //   270: invokestatic 180	java/lang/Math:abs	(J)J
          //   273: ldc2_w 181
          //   276: lcmp
          //   277: ifgt +337 -> 614
          //   280: lload 6
          //   282: aload_0
          //   283: getfield 184	com/tencent/mm/sdk/platformtools/au$1:vkA	J
          //   286: lsub
          //   287: lconst_1
          //   288: lcmp
          //   289: ifle +325 -> 614
          //   292: aload 10
          //   294: invokestatic 189	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
          //   297: ifne +317 -> 614
          //   300: aload 10
          //   302: invokevirtual 192	java/lang/String:toLowerCase	()Ljava/lang/String;
          //   305: ldc -62
          //   307: invokevirtual 125	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
          //   310: ifne +25 -> 335
          //   313: aload 10
          //   315: ldc -60
          //   317: invokevirtual 125	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
          //   320: ifne +15 -> 335
          //   323: aload 10
          //   325: ldc -58
          //   327: invokevirtual 125	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
          //   330: istore_3
          //   331: iload_3
          //   332: ifeq +282 -> 614
          //   335: aload_0
          //   336: lload 6
          //   338: putfield 184	com/tencent/mm/sdk/platformtools/au$1:vkA	J
          //   341: aload 10
          //   343: astore 9
          //   345: lload 4
          //   347: lstore 6
          //   349: aload 9
          //   351: astore 10
          //   353: aload 8
          //   355: ifnull +18 -> 373
          //   358: aload 8
          //   360: invokeinterface 201 1 0
          //   365: aload 9
          //   367: astore 10
          //   369: lload 4
          //   371: lstore 6
          //   373: aload 10
          //   375: invokestatic 189	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
          //   378: ifne -275 -> 103
          //   381: ldc 37
          //   383: new 39	java/lang/StringBuilder
          //   386: dup
          //   387: ldc -53
          //   389: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   392: aload 10
          //   394: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   397: ldc -51
          //   399: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   402: lload 6
          //   404: invokevirtual 172	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
          //   407: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   410: invokestatic 207	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   413: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   416: ifnull +114 -> 530
          //   419: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   422: invokevirtual 76	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
          //   425: ifnull +105 -> 530
          //   428: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   431: invokevirtual 76	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
          //   434: checkcast 209	com/tencent/mm/sdk/platformtools/au$a
          //   437: invokeinterface 212 1 0
          //   442: goto -339 -> 103
          //   445: astore 10
          //   447: aconst_null
          //   448: astore 9
          //   450: aconst_null
          //   451: astore 8
          //   453: lconst_0
          //   454: lstore 4
          //   456: ldc 37
          //   458: new 39	java/lang/StringBuilder
          //   461: dup
          //   462: ldc -42
          //   464: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   467: aload 10
          //   469: invokevirtual 217	java/lang/Exception:getMessage	()Ljava/lang/String;
          //   472: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   475: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   478: invokestatic 220	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
          //   481: lload 4
          //   483: lstore 6
          //   485: aload 8
          //   487: astore 10
          //   489: aload 9
          //   491: ifnull -118 -> 373
          //   494: aload 9
          //   496: invokeinterface 201 1 0
          //   501: lload 4
          //   503: lstore 6
          //   505: aload 8
          //   507: astore 10
          //   509: goto -136 -> 373
          //   512: astore_2
          //   513: aconst_null
          //   514: astore 8
          //   516: aload 8
          //   518: ifnull +10 -> 528
          //   521: aload 8
          //   523: invokeinterface 201 1 0
          //   528: aload_2
          //   529: athrow
          //   530: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
          //   533: invokevirtual 95	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
          //   536: aload_0
          //   537: invokevirtual 101	android/content/ContentResolver:unregisterContentObserver	(Landroid/database/ContentObserver;)V
          //   540: aconst_null
          //   541: putstatic 105	com/tencent/mm/sdk/platformtools/au:vky	Landroid/database/ContentObserver;
          //   544: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   547: ifnull +13 -> 560
          //   550: getstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   553: invokevirtual 109	java/lang/ref/WeakReference:clear	()V
          //   556: aconst_null
          //   557: putstatic 70	com/tencent/mm/sdk/platformtools/au:vkz	Ljava/lang/ref/WeakReference;
          //   560: ldc 37
          //   562: ldc -34
          //   564: invokestatic 207	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
          //   567: goto -464 -> 103
          //   570: astore_2
          //   571: goto -55 -> 516
          //   574: astore_2
          //   575: aload 9
          //   577: astore 8
          //   579: goto -63 -> 516
          //   582: astore 10
          //   584: aload 8
          //   586: astore 9
          //   588: aconst_null
          //   589: astore 8
          //   591: lconst_0
          //   592: lstore 4
          //   594: goto -138 -> 456
          //   597: astore 11
          //   599: aload 8
          //   601: astore 9
          //   603: aload 10
          //   605: astore 8
          //   607: aload 11
          //   609: astore 10
          //   611: goto -155 -> 456
          //   614: lconst_0
          //   615: lstore 4
          //   617: aconst_null
          //   618: astore 9
          //   620: goto -275 -> 345
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	623	0	this	1
          //   0	623	1	paramAnonymousBoolean	boolean
          //   0	623	2	paramAnonymousUri	Uri
          //   330	2	3	bool	boolean
          //   212	404	4	l1	long
          //   221	283	6	l2	long
          //   161	445	8	localObject1	Object
          //   343	276	9	localObject2	Object
          //   194	199	10	localObject3	Object
          //   445	23	10	localException1	Exception
          //   487	21	10	localObject4	Object
          //   582	22	10	localException2	Exception
          //   609	1	10	localObject5	Object
          //   597	11	11	localException3	Exception
          // Exception table:
          //   from	to	target	type
          //   144	163	445	java/lang/Exception
          //   144	163	512	finally
          //   168	331	570	finally
          //   335	341	570	finally
          //   456	481	574	finally
          //   168	331	582	java/lang/Exception
          //   335	341	597	java/lang/Exception
        }
      };
      ab.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, vky);
    }
    GMTrace.o(13949651124224L, 103933);
  }
  
  public static abstract interface a
  {
    public abstract void abx();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\sdk\platformtools\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */