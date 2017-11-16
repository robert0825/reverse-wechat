package com.tencent.mm.plugin.music.a.b;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.music.a.g;
import com.tencent.mm.plugin.music.a.g.b;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public final class d
{
  private static y<String, String> nrj;
  private static y<String, Boolean> nrk;
  private static y<String, Integer> nrl;
  private static y<String, Integer> nrm;
  
  static
  {
    GMTrace.i(15027285262336L, 111962);
    nrj = new y(20);
    nrk = new y(20);
    nrl = new y(20);
    nrm = new y(20);
    GMTrace.o(15027285262336L, 111962);
  }
  
  public static void DF(String paramString)
  {
    GMTrace.i(15026345738240L, 111955);
    Object localObject = h.aSw();
    b localb;
    long l2;
    String str;
    if (TextUtils.isEmpty(paramString))
    {
      w.i("MicroMsg.PieceMusicInfoStorage", "updatePieceMusicByUrl url is empty!");
      localb = null;
      if (localb == null) {
        break label326;
      }
      localObject = localb.field_musicId;
      if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.isEmpty((CharSequence)localObject))) {
        nrj.put(paramString, localObject);
      }
      paramString = new ArrayList(1);
      paramString.add(localb.field_musicId);
      paramString = new a(paramString);
      at.AR();
      long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vxe, Long.valueOf(0L))).longValue();
      l2 = System.currentTimeMillis();
      if (l2 - l1 <= a.nqZ.longValue())
      {
        w.e("MicroMsg.CleanMusicController", "startClean the last clean time is in MUSIC_NO_SCAN_TIME time");
        GMTrace.o(15026345738240L, 111955);
      }
    }
    else
    {
      str = g.Dp(paramString);
      localb = ((com.tencent.mm.plugin.music.a.g.c)localObject).DP(str);
      if (localb != null) {
        break label335;
      }
      localb = new b();
    }
    label326:
    label335:
    for (int i = 0;; i = 1)
    {
      localb.field_musicId = str;
      localb.field_musicUrl = paramString;
      localb.field_fileName = g.Dk(paramString);
      w.i("MicroMsg.PieceMusicInfoStorage", "updatePieceMusicByUrl musicId:%s, field_fileName:%s", new Object[] { str, localb.field_fileName });
      if (i != 0)
      {
        w.i("MicroMsg.PieceMusicInfoStorage", "update PieceMusicInfo");
        ((com.tencent.mm.plugin.music.a.g.c)localObject).c(localb, new String[0]);
      }
      for (;;)
      {
        ((com.tencent.mm.plugin.music.a.g.c)localObject).nsm.put(str, localb);
        break;
        w.i("MicroMsg.PieceMusicInfoStorage", "insert PieceMusicInfo");
        ((com.tencent.mm.plugin.music.a.g.c)localObject).b(localb);
      }
      w.i("MicroMsg.CleanMusicController", "start clean music file");
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vxe, Long.valueOf(l2));
      com.tencent.mm.sdk.f.e.post(new a.1(paramString), "CleanMusicController");
      GMTrace.o(15026345738240L, 111955);
      return;
    }
  }
  
  public static String DG(String paramString)
  {
    GMTrace.i(15026479955968L, 111956);
    if (nrj.ba(paramString))
    {
      paramString = (String)nrj.get(paramString);
      GMTrace.o(15026479955968L, 111956);
      return paramString;
    }
    GMTrace.o(15026479955968L, 111956);
    return "";
  }
  
  public static String DH(String paramString)
  {
    GMTrace.i(15027016826880L, 111960);
    paramString = DG(paramString);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.PieceCacheHelper", "getMusicMIMEType musicId is empty!");
      GMTrace.o(15027016826880L, 111960);
      return null;
    }
    paramString = h.aSw().DP(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.PieceCacheHelper", "getMusicMIMEType pMusic is null!'");
      GMTrace.o(15027016826880L, 111960);
      return null;
    }
    w.i("MicroMsg.PieceCacheHelper", "music field_pieceFileMIMEType:%s", new Object[] { paramString.field_pieceFileMIMEType });
    if (TextUtils.isEmpty(paramString.field_pieceFileMIMEType))
    {
      w.e("MicroMsg.PieceCacheHelper", "field_pieceFileMIMEType is null!'");
      GMTrace.o(15027016826880L, 111960);
      return null;
    }
    paramString = paramString.field_pieceFileMIMEType;
    GMTrace.o(15027016826880L, 111960);
    return paramString;
  }
  
  public static long DI(String paramString)
  {
    GMTrace.i(15027151044608L, 111961);
    paramString = new File(g.Dk(paramString));
    if (paramString.exists())
    {
      long l = paramString.length();
      GMTrace.o(15027151044608L, 111961);
      return l;
    }
    GMTrace.o(15027151044608L, 111961);
    return -1L;
  }
  
  public static int DJ(String paramString)
  {
    GMTrace.i(20364990087168L, 151731);
    if ((paramString != null) && (nrl.ba(paramString)))
    {
      int i = ((Integer)nrl.get(paramString)).intValue();
      GMTrace.o(20364990087168L, 151731);
      return i;
    }
    GMTrace.o(20364990087168L, 151731);
    return 0;
  }
  
  public static int DK(String paramString)
  {
    GMTrace.i(20365258522624L, 151733);
    if ((paramString != null) && (nrm.ba(paramString)))
    {
      int i = ((Integer)nrm.get(paramString)).intValue();
      GMTrace.o(20365258522624L, 151733);
      return i;
    }
    GMTrace.o(20365258522624L, 151733);
    return 0;
  }
  
  public static void aj(String paramString, boolean paramBoolean)
  {
    GMTrace.i(15026614173696L, 111957);
    if (!TextUtils.isEmpty(paramString)) {
      nrk.put(paramString, Boolean.valueOf(paramBoolean));
    }
    GMTrace.o(15026614173696L, 111957);
  }
  
  public static void bu(String paramString, int paramInt)
  {
    GMTrace.i(20364855869440L, 151730);
    if (paramString != null) {
      nrl.put(paramString, Integer.valueOf(paramInt));
    }
    GMTrace.o(20364855869440L, 151730);
  }
  
  public static void bv(String paramString, int paramInt)
  {
    GMTrace.i(20365124304896L, 151732);
    if (paramString != null) {
      nrm.put(paramString, Integer.valueOf(paramInt));
    }
    GMTrace.o(20365124304896L, 151732);
  }
  
  public static void dd(String paramString1, String paramString2)
  {
    GMTrace.i(15026882609152L, 111959);
    w.i("MicroMsg.PieceCacheHelper", "setMusicMIMEType mimeType:%s", new Object[] { paramString2 });
    paramString1 = DG(paramString1);
    if (TextUtils.isEmpty(paramString1))
    {
      w.e("MicroMsg.PieceCacheHelper", "setMusicMIMEType musicId is empty!");
      GMTrace.o(15026882609152L, 111959);
      return;
    }
    Object localObject = h.aSw().DP(paramString1);
    if (localObject == null)
    {
      w.e("MicroMsg.PieceCacheHelper", "setMusicMIMEType pMusic is null!'");
      GMTrace.o(15026882609152L, 111959);
      return;
    }
    if (TextUtils.isEmpty(((b)localObject).field_pieceFileMIMEType))
    {
      w.e("MicroMsg.PieceCacheHelper", "updatePieceFileMIMEType()'");
      localObject = h.aSw();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("pieceFileMIMEType", paramString2);
      w.i("MicroMsg.PieceMusicInfoStorage", "updatePieceFileMIMEType raw=%d musicId=%s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.a.g.c)localObject).fTZ.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { paramString1 })), paramString1 });
      paramString1 = (b)((com.tencent.mm.plugin.music.a.g.c)localObject).nsm.get(paramString1);
      if (paramString1 != null) {
        paramString1.field_pieceFileMIMEType = paramString2;
      }
      GMTrace.o(15026882609152L, 111959);
      return;
    }
    w.i("MicroMsg.PieceCacheHelper", "don't need update the piece fle mime type");
    GMTrace.o(15026882609152L, 111959);
  }
  
  public static void g(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(15026748391424L, 111958);
    if (paramMap != null) {
      if (!nrk.ba(paramString)) {
        break label77;
      }
    }
    label77:
    for (boolean bool = ((Boolean)nrk.get(paramString)).booleanValue();; bool = false)
    {
      if (bool)
      {
        paramMap.put("Cookie", "qqmusic_fromtag=97;qqmusic_uin=1234567;qqmusic_key=;");
        paramMap.put("referer", "stream12.qqmusic.qq.com");
      }
      GMTrace.o(15026748391424L, 111958);
      return;
    }
  }
  
  public static void vd(String paramString)
  {
    GMTrace.i(15360011010048L, 114441);
    Logger.i("MicroMsg.PieceFileCache", "deleteFileByUrl");
    e.vd(g.Dk(paramString));
    GMTrace.o(15360011010048L, 114441);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */