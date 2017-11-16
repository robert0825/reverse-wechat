package com.tencent.mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class k
  implements g
{
  private static int lBG;
  public static String lBO;
  public static String lBP;
  public static String lBQ;
  protected ContentResolver gTC;
  private boolean lBR;
  boolean lBS;
  protected Context mContext;
  long start;
  
  static
  {
    GMTrace.i(11921621254144L, 88823);
    lBG = 100;
    lBO = "date_added";
    lBP = "datetaken";
    lBQ = "date_mix";
    GMTrace.o(11921621254144L, 88823);
  }
  
  protected k()
  {
    GMTrace.i(11919742205952L, 88809);
    this.lBR = false;
    this.lBS = false;
    this.start = 0L;
    this.mContext = ab.getContext();
    this.gTC = this.mContext.getContentResolver();
    GMTrace.o(11919742205952L, 88809);
  }
  
  protected static long cn(String paramString1, String paramString2)
  {
    long l2 = 0L;
    GMTrace.i(11920413294592L, 88814);
    long l3 = System.currentTimeMillis();
    long l1 = l2;
    if (!bg.nm(paramString1))
    {
      l1 = l2;
      try
      {
        l2 = TimeUnit.MILLISECONDS.convert(bg.getLong(paramString1, 0L), TimeUnit.MILLISECONDS);
        l1 = l2;
        if (l2 <= l3)
        {
          l1 = l2;
          long l4 = l3 / 1000L;
          l1 = l2;
          if (l2 >= l4)
          {
            GMTrace.o(11920413294592L, 88814);
            return l2;
          }
        }
      }
      catch (NumberFormatException paramString1)
      {
        w.printErrStackTrace("MicroMsg.MediaQueryBase", paramString1, "", new Object[0]);
      }
    }
    l2 = l1;
    if (!bg.nm(paramString2)) {
      try
      {
        l2 = TimeUnit.MILLISECONDS.convert(bg.getLong(paramString2, 0L), TimeUnit.SECONDS);
        l1 = l2;
        l2 = l1;
        if (l1 <= l3)
        {
          GMTrace.o(11920413294592L, 88814);
          return l1;
        }
      }
      catch (NumberFormatException paramString1)
      {
        w.printErrStackTrace("MicroMsg.MediaQueryBase", paramString1, "", new Object[0]);
        l2 = l1;
      }
    }
    GMTrace.o(11920413294592L, 88814);
    return l2;
  }
  
  /* Error */
  public final ArrayList<GalleryItem.MediaItem> a(String paramString, int paramInt, g.c paramc, long paramLong)
  {
    // Byte code:
    //   0: ldc2_w 129
    //   3: ldc -125
    //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 91	java/lang/System:currentTimeMillis	()J
    //   12: putfield 62	com/tencent/mm/plugin/gallery/model/k:start	J
    //   15: aload_0
    //   16: monitorenter
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 58	com/tencent/mm/plugin/gallery/model/k:lBR	Z
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_0
    //   25: aload_1
    //   26: iload_2
    //   27: aload_3
    //   28: lload 4
    //   30: invokevirtual 134	com/tencent/mm/plugin/gallery/model/k:b	(Ljava/lang/String;ILcom/tencent/mm/plugin/gallery/model/g$c;J)Ljava/util/ArrayList;
    //   33: astore_1
    //   34: aload_0
    //   35: monitorenter
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield 58	com/tencent/mm/plugin/gallery/model/k:lBR	Z
    //   41: aload_0
    //   42: monitorexit
    //   43: ldc 115
    //   45: ldc -120
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: invokestatic 91	java/lang/System:currentTimeMillis	()J
    //   56: aload_0
    //   57: getfield 62	com/tencent/mm/plugin/gallery/model/k:start	J
    //   60: lsub
    //   61: invokestatic 142	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   64: aastore
    //   65: invokestatic 145	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: ldc2_w 129
    //   71: ldc -125
    //   73: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   76: aload_1
    //   77: areturn
    //   78: astore_1
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_1
    //   82: athrow
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	k
    //   0	88	1	paramString	String
    //   0	88	2	paramInt	int
    //   0	88	3	paramc	g.c
    //   0	88	4	paramLong	long
    // Exception table:
    //   from	to	target	type
    //   17	24	78	finally
    //   79	81	78	finally
    //   36	43	83	finally
    //   84	86	83	finally
  }
  
  public ArrayList<GalleryItem.AlbumItem> aDf()
  {
    GMTrace.i(11919876423680L, 88810);
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    try
    {
      Cursor localCursor = this.gTC.query(aDh(), getProjection(), getSelection(), null, aDj());
      if (localCursor == null)
      {
        w.d("MicroMsg.MediaQueryBase", "no media folder now");
        GMTrace.o(11919876423680L, 88810);
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MediaQueryBase", "query album list failed : [%s]", new Object[] { localException.getMessage() });
        localObject1 = null;
      }
    }
    if (((Cursor)localObject1).moveToFirst()) {}
    for (;;)
    {
      Object localObject2 = Long.valueOf(0L);
      try
      {
        long l = bg.getLong(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_id")), 0L);
        localObject2 = Long.valueOf(l);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        String str1;
        String str2;
        for (;;) {}
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
      str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_data"));
      str2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(aDk()));
      if ((bg.nm(str2)) && (getType() == 2)) {
        w.e("MicroMsg.MediaQueryBase", "null or nill album name, ignore this folder");
      }
      while (!((Cursor)localObject1).moveToNext())
      {
        ((Cursor)localObject1).close();
        GMTrace.o(11919876423680L, 88810);
        return localArrayList;
        int i = ((Cursor)localObject1).getInt(3);
        w.i("MicroMsg.MediaQueryBase", str1 + "====" + str2 + "=====" + localObject2 + ", " + i);
        if ((i == 0) || ((bg.nm(str1)) && (bg.nm(null))))
        {
          w.e("MicroMsg.MediaQueryBase", "query album failed, " + i + ", " + str1 + "," + null);
        }
        else
        {
          Object localObject3;
          if (!bg.nm(str1))
          {
            localObject3 = str1;
            if (e.aZ(str1)) {}
          }
          else
          {
            localObject3 = null;
          }
          if (!bg.nm(null)) {
            e.aZ(null);
          }
          if (localObject3 == null)
          {
            w.e("MicroMsg.MediaQueryBase", "this item has no thumb path and orignal path");
          }
          else
          {
            str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("mime_type"));
            localObject2 = GalleryItem.MediaItem.a(getType(), ((Long)localObject2).longValue(), (String)localObject3, null, str1);
            localObject3 = new GalleryItem.AlbumItem(str2, i);
            ((GalleryItem.AlbumItem)localObject3).lBB = ((GalleryItem.MediaItem)localObject2);
            localArrayList.add(localObject3);
          }
        }
      }
    }
  }
  
  public final void aDg()
  {
    GMTrace.i(11920010641408L, 88811);
    try
    {
      if (this.lBR) {
        this.lBS = true;
      }
      GMTrace.o(11920010641408L, 88811);
      return;
    }
    finally {}
  }
  
  protected abstract Uri aDh();
  
  protected abstract String[] aDi();
  
  protected abstract String aDj();
  
  protected abstract String aDk();
  
  protected final boolean aDm()
  {
    try
    {
      GMTrace.i(19569750048768L, 145806);
      boolean bool = this.lBS;
      GMTrace.o(19569750048768L, 145806);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public ArrayList<GalleryItem.MediaItem> b(String paramString, int paramInt, g.c paramc, long paramLong)
  {
    GMTrace.i(11920279076864L, 88813);
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    try
    {
      Cursor localCursor = this.gTC.query(aDh(), aDi(), zf(paramString), null, aDj());
      if (localCursor == null)
      {
        w.d("MicroMsg.MediaQueryBase", "query album failed: " + paramString);
        if (paramc != null) {
          paramc.a(localArrayList, paramLong);
        }
        GMTrace.o(11920279076864L, 88813);
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MediaQueryBase", "query media items in album failed : [%s]", new Object[] { localException.getMessage() });
        localObject1 = null;
      }
      paramInt = 0;
      if (!((Cursor)localObject1).moveToFirst()) {}
    }
    label683:
    label764:
    for (;;)
    {
      paramString = Long.valueOf(0L);
      try
      {
        l = bg.getLong(((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_id")), 0L);
        paramString = Long.valueOf(l);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        long l;
        String str1;
        String str2;
        String str3;
        Object localObject2;
        for (;;) {}
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          continue;
          paramInt = 0;
        }
      }
      str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_data"));
      str2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(lBQ));
      l = ((Cursor)localObject1).getLong(((Cursor)localObject1).getColumnIndexOrThrow(lBQ));
      str3 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(lBO));
      localObject2 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow(lBP));
      if ((str2 == null) || (str2.equals("")) || (str2.equals(Integer.valueOf(0))))
      {
        com.tencent.mm.plugin.report.service.g.ork.a(363L, 1L, 1L, true);
        if (0L != l) {
          com.tencent.mm.plugin.report.service.g.ork.a(363L, 4L, 1L, true);
        }
        if (((str3 == null) || (str3.equals("")) || (str3.equals(Integer.valueOf(0)))) && (localObject2 != null) && (!((String)localObject2).equals("")) && (!((String)localObject2).equals(Integer.valueOf(0)))) {
          com.tencent.mm.plugin.report.service.g.ork.a(363L, 3L, 1L, true);
        }
        if (((localObject2 == null) || (((String)localObject2).equals("")) || (((String)localObject2).equals(Integer.valueOf(0)))) && (str3 != null) && (!str3.equals("")) && (!str3.equals(Integer.valueOf(0)))) {
          com.tencent.mm.plugin.report.service.g.ork.a(363L, 2L, 1L, true);
        }
        localObject2 = GalleryItem.MediaItem.v(getType(), paramString.longValue());
        if ((!bg.nm(str1)) && (new File(str1).exists())) {
          ((GalleryItem.MediaItem)localObject2).gVn = str1;
        }
        ((GalleryItem.MediaItem)localObject2).lBF = cn(str2, str3);
        if ((!bg.nm(((GalleryItem.MediaItem)localObject2).gVn)) || (!bg.nm(((GalleryItem.MediaItem)localObject2).kXD))) {
          break label683;
        }
        w.e("MicroMsg.MediaQueryBase", "thumb file and orignal file both not exist");
      }
      for (paramInt = 0;; paramInt = 1)
      {
        if (((Cursor)localObject1).moveToNext()) {
          break label764;
        }
        ((Cursor)localObject1).close();
        if ((paramInt == 0) && (paramc != null)) {
          paramc.a(localArrayList, paramLong);
        }
        GMTrace.o(11920279076864L, 88813);
        return localArrayList;
        if ((localObject2 == null) || (((String)localObject2).equals("")) || (((String)localObject2).equals(Integer.valueOf(0))))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(363L, 6L, 1L, true);
          break;
        }
        if ((str3 != null) && (!str3.equals("")) && (!str3.equals(Integer.valueOf(0)))) {
          break;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(363L, 5L, 1L, true);
        break;
        str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("mime_type"));
        paramString = str1;
        if (bg.nm(str1)) {
          paramString = "";
        }
        ((GalleryItem.MediaItem)localObject2).mMimeType = paramString;
        localArrayList.add(localObject2);
        if ((localArrayList.size() % lBG != 0) || (paramc == null)) {
          break label776;
        }
        paramc.a(localArrayList, paramLong);
        localArrayList.clear();
      }
    }
  }
  
  protected abstract String[] getProjection();
  
  protected abstract String getSelection();
  
  protected abstract int getType();
  
  protected abstract String zf(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */