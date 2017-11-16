package com.tencent.mm.plugin.downloader.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.e.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  public static long b(com.tencent.mm.plugin.downloader.e.a parama)
  {
    GMTrace.i(18596403085312L, 138554);
    if (parama == null)
    {
      GMTrace.o(18596403085312L, 138554);
      return -1L;
    }
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18596403085312L, 138554);
      return -1L;
    }
    boolean bool = localb.b(parama);
    w.i("MicroMsg.FileDownloadInfoDBHelper", "insert downloadinfo: " + parama.field_downloadId + ", ret=" + bool);
    long l = parama.field_downloadId;
    GMTrace.o(18596403085312L, 138554);
    return l;
  }
  
  public static com.tencent.mm.plugin.downloader.e.a bm(long paramLong)
  {
    GMTrace.i(18596134649856L, 138552);
    Object localObject = yQ();
    if (localObject == null)
    {
      GMTrace.o(18596134649856L, 138552);
      return null;
    }
    localObject = ((b)localObject).bt(paramLong);
    GMTrace.o(18596134649856L, 138552);
    return (com.tencent.mm.plugin.downloader.e.a)localObject;
  }
  
  public static boolean bn(long paramLong)
  {
    GMTrace.i(18597342609408L, 138561);
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18597342609408L, 138561);
      return false;
    }
    com.tencent.mm.plugin.downloader.e.a locala = new com.tencent.mm.plugin.downloader.e.a();
    locala.field_downloadId = paramLong;
    boolean bool = localb.a(locala, new String[0]);
    GMTrace.o(18597342609408L, 138561);
    return bool;
  }
  
  public static long c(com.tencent.mm.plugin.downloader.e.a parama)
  {
    GMTrace.i(18596537303040L, 138555);
    if (parama == null)
    {
      GMTrace.o(18596537303040L, 138555);
      return -1L;
    }
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18596537303040L, 138555);
      return -1L;
    }
    boolean bool = localb.c(parama, new String[0]);
    w.d("MicroMsg.FileDownloadInfoDBHelper", "Update Downloadinfo, ID: %d, ret: %b, Status: %d", new Object[] { Long.valueOf(parama.field_downloadId), Boolean.valueOf(bool), Integer.valueOf(parama.field_status) });
    long l = parama.field_downloadId;
    GMTrace.o(18596537303040L, 138555);
    return l;
  }
  
  public static boolean d(long paramLong1, long paramLong2, long paramLong3)
  {
    GMTrace.i(18596805738496L, 138557);
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18596805738496L, 138557);
      return false;
    }
    boolean bool = localb.eZ("FileDownloadInfo", "update FileDownloadInfo set downloadedSize = " + paramLong2 + ",totalSize= " + paramLong3 + " where downloadId = " + paramLong1);
    GMTrace.o(18596805738496L, 138557);
    return bool;
  }
  
  public static boolean j(long paramLong, int paramInt)
  {
    GMTrace.i(18596671520768L, 138556);
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18596671520768L, 138556);
      return false;
    }
    boolean bool = localb.eZ("FileDownloadInfo", "update FileDownloadInfo set status = " + paramInt + " where downloadId = " + paramLong);
    GMTrace.o(18596671520768L, 138556);
    return bool;
  }
  
  public static com.tencent.mm.plugin.downloader.e.a vr(String paramString)
  {
    GMTrace.i(18596268867584L, 138553);
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18596268867584L, 138553);
      return null;
    }
    paramString = localb.vr(paramString);
    GMTrace.o(18596268867584L, 138553);
    return paramString;
  }
  
  public static boolean vs(String paramString)
  {
    GMTrace.i(18596939956224L, 138558);
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18596939956224L, 138558);
      return false;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, url is null");
      GMTrace.o(18596939956224L, 138558);
      return false;
    }
    boolean bool = localb.eZ("FileDownloadInfo", "delete from FileDownloadInfo where downloadUrl=\"" + paramString + "\"");
    GMTrace.o(18596939956224L, 138558);
    return bool;
  }
  
  public static boolean vt(String paramString)
  {
    GMTrace.i(18597074173952L, 138559);
    b localb = yQ();
    if (localb == null)
    {
      GMTrace.o(18597074173952L, 138559);
      return false;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, appId is null");
      GMTrace.o(18597074173952L, 138559);
      return false;
    }
    boolean bool = localb.eZ("FileDownloadInfo", "delete from FileDownloadInfo where appId=\"" + paramString + "\"");
    GMTrace.o(18597074173952L, 138559);
    return bool;
  }
  
  public static com.tencent.mm.plugin.downloader.e.a vu(String paramString)
  {
    Object localObject1 = null;
    GMTrace.i(18597208391680L, 138560);
    Object localObject2 = yQ();
    if (localObject2 == null)
    {
      GMTrace.o(18597208391680L, 138560);
      return null;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FileDownloadInfoStorage", "Null or nil url");
      GMTrace.o(18597208391680L, 138560);
      return null;
    }
    localObject2 = ((b)localObject2).rawQuery("select * from FileDownloadInfo where downloadUrlHashCode=" + paramString.hashCode(), new String[0]);
    if (localObject2 == null)
    {
      GMTrace.o(18597208391680L, 138560);
      return null;
    }
    paramString = (String)localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new com.tencent.mm.plugin.downloader.e.a();
      paramString.b((Cursor)localObject2);
    }
    if (localObject2 != null) {
      ((Cursor)localObject2).close();
    }
    GMTrace.o(18597208391680L, 138560);
    return paramString;
  }
  
  public static b yQ()
  {
    GMTrace.i(18597476827136L, 138562);
    if (h.xw().wL())
    {
      h.xw();
      if (!com.tencent.mm.kernel.a.wF()) {}
    }
    else
    {
      w.e("MicroMsg.FileDownloadInfoDBHelper", "no user login");
      GMTrace.o(18597476827136L, 138562);
      return null;
    }
    b localb = ((com.tencent.mm.plugin.downloader.b.a)h.h(com.tencent.mm.plugin.downloader.b.a.class)).yQ();
    GMTrace.o(18597476827136L, 138562);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */