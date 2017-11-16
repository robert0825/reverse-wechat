package com.tencent.mm.plugin.music.a.g;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.music.a.a.a;
import com.tencent.mm.plugin.music.a.g;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  extends i<com.tencent.mm.at.a>
{
  public e fTZ;
  public f<String, com.tencent.mm.at.a> nsm;
  public f<String, com.tencent.mm.plugin.music.a.a> nsn;
  
  public a(e parame)
  {
    super(parame, com.tencent.mm.at.a.fTp, "Music", null);
    GMTrace.i(4846736375808L, 36111);
    this.fTZ = parame;
    this.nsm = new f(20);
    this.nsn = new f(10);
    GMTrace.o(4846736375808L, 36111);
  }
  
  public final com.tencent.mm.at.a DO(String paramString)
  {
    GMTrace.i(4846870593536L, 36112);
    if (this.nsm.get(paramString) != null)
    {
      paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
      GMTrace.o(4846870593536L, 36112);
      return paramString;
    }
    Object localObject = String.format("Select * From Music Where musicId=?", new Object[0]);
    localObject = this.fTZ.a((String)localObject, new String[] { paramString }, 2);
    if ((localObject != null) && (((Cursor)localObject).moveToFirst()))
    {
      com.tencent.mm.at.a locala = new com.tencent.mm.at.a();
      locala.b((Cursor)localObject);
      ((Cursor)localObject).close();
      this.nsm.put(paramString, locala);
      GMTrace.o(4846870593536L, 36112);
      return locala;
    }
    if (localObject != null) {
      ((Cursor)localObject).close();
    }
    GMTrace.o(4846870593536L, 36112);
    return null;
  }
  
  public final com.tencent.mm.at.a K(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(4847139028992L, 36114);
    w.i("MicroMsg.Music.MusicStorage", "updateMusicWithColor %s %d %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    com.tencent.mm.at.a locala = DO(paramString);
    if (locala == null)
    {
      w.e("MicroMsg.Music.MusicStorage", "updateMusicWithColor can not find music %s", new Object[] { paramString });
      GMTrace.o(4847139028992L, 36114);
      return null;
    }
    locala.field_songBgColor = paramInt1;
    locala.field_songLyricColor = paramInt2;
    c(locala, new String[] { "songBgColor", "songLyricColor" });
    this.nsm.put(paramString, locala);
    GMTrace.o(4847139028992L, 36114);
    return locala;
  }
  
  public final void P(String paramString, long paramLong)
  {
    GMTrace.i(4847407464448L, 36116);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("wifiDownloadedLength", Long.valueOf(paramLong));
    w.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiDownloadedLength=%d", new Object[] { Integer.valueOf(this.fTZ.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_wifiDownloadedLength = paramLong;
    }
    GMTrace.o(4847407464448L, 36116);
  }
  
  public final void Q(String paramString, long paramLong)
  {
    GMTrace.i(4847541682176L, 36117);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("songWifiFileLength", Long.valueOf(paramLong));
    w.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songWifiFileLength=%d", new Object[] { Integer.valueOf(this.fTZ.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_songWifiFileLength = paramLong;
    }
    GMTrace.o(4847541682176L, 36117);
  }
  
  public final void R(String paramString, long paramLong)
  {
    GMTrace.i(4847810117632L, 36119);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("downloadedLength", Long.valueOf(paramLong));
    w.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s downloadedLength=%d", new Object[] { Integer.valueOf(this.fTZ.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_downloadedLength = paramLong;
    }
    GMTrace.o(4847810117632L, 36119);
  }
  
  public final void S(String paramString, long paramLong)
  {
    GMTrace.i(4848078553088L, 36121);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("songFileLength", Long.valueOf(paramLong));
    w.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songFileLength=%d", new Object[] { Integer.valueOf(this.fTZ.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Long.valueOf(paramLong) });
    paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_songFileLength = paramLong;
    }
    GMTrace.o(4848078553088L, 36121);
  }
  
  public final void bw(String paramString, int paramInt)
  {
    GMTrace.i(4847675899904L, 36118);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("wifiEndFlag", Integer.valueOf(paramInt));
    w.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiEndFlag=%d", new Object[] { Integer.valueOf(this.fTZ.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(paramInt) });
    paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_wifiEndFlag = paramInt;
    }
    GMTrace.o(4847675899904L, 36118);
  }
  
  public final void bx(String paramString, int paramInt)
  {
    GMTrace.i(4847944335360L, 36120);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("endFlag", Integer.valueOf(paramInt));
    w.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s endFlag=%d", new Object[] { Integer.valueOf(this.fTZ.update("Music", localContentValues, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(paramInt) });
    paramString = (com.tencent.mm.at.a)this.nsm.get(paramString);
    if (paramString != null) {
      paramString.field_endFlag = paramInt;
    }
    GMTrace.o(4847944335360L, 36120);
  }
  
  public final com.tencent.mm.plugin.music.a.a g(com.tencent.mm.at.a parama, boolean paramBoolean)
  {
    GMTrace.i(4847004811264L, 36113);
    String str2 = parama.field_songLyric;
    String str1 = ab.getContext().getString(R.l.dKu);
    String str3 = parama.field_songSnsShareUser;
    boolean bool = g.b(parama);
    Object localObject1 = parama.field_songSinger;
    com.tencent.mm.plugin.music.a.a locala = new com.tencent.mm.plugin.music.a.a();
    long l = bg.Pw();
    if (!bg.nm(str2)) {
      if (str2 == null)
      {
        w.w("MicroMsg.Music.LyricObj", "parserLrc: but lrc or lrcMgr is null");
        w.d("MicroMsg.Music.LyricObj", "getLrcMgr beg: src lrc = %s", new Object[] { str2 });
        w.d("MicroMsg.Music.LyricObj", "parse finish: sentence size [%d], result:", new Object[] { Integer.valueOf(locala.npu.size()) });
        label124:
        if (!bg.nm(str3)) {
          break label1067;
        }
        w.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
        label141:
        if (!bg.nm(str2))
        {
          if (!bg.nm(str1)) {
            break label1227;
          }
          w.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
        }
      }
    }
    for (;;)
    {
      w.d("MicroMsg.Music.LyricObj", "getLrcMgr finish: use %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
      this.nsn.put(parama.field_musicId, locala);
      GMTrace.o(4847004811264L, 36113);
      return locala;
      localObject1 = str2.replaceAll("\n", " ").replaceAll("\r", " ");
      Matcher localMatcher1 = Pattern.compile("(\\[((\\d{2}:\\d{2}(\\.\\d{2}){0,1}\\])|(al:|ar:|by:|offset:|re:|ti:|ve:))[^\\[]*)").matcher((CharSequence)localObject1);
      while (localMatcher1.find())
      {
        String str4 = localMatcher1.group();
        localMatcher1.start();
        localMatcher1.end();
        if (str4 == null)
        {
          w.w("MicroMsg.Music.LyricObj", "parserLine fail: lrcMgr or str is null");
        }
        else if (str4.startsWith("[ti:"))
        {
          locala.title = com.tencent.mm.plugin.music.a.a.db(str4, "[ti:");
        }
        else if (str4.startsWith("[ar:"))
        {
          locala.hZU = com.tencent.mm.plugin.music.a.a.db(str4, "[ar:");
        }
        else if (str4.startsWith("[al:"))
        {
          locala.album = com.tencent.mm.plugin.music.a.a.db(str4, "[al:");
        }
        else if (str4.startsWith("[by:"))
        {
          locala.npw = com.tencent.mm.plugin.music.a.a.db(str4, "[by:");
        }
        else if (str4.startsWith("[offset:"))
        {
          locala.mK = bg.getLong(com.tencent.mm.plugin.music.a.a.db(str4, "[offset:"), 0L);
        }
        else if (str4.startsWith("[re:"))
        {
          locala.npx = com.tencent.mm.plugin.music.a.a.db(str4, "[re:");
        }
        else if (str4.startsWith("[ve:"))
        {
          locala.npy = com.tencent.mm.plugin.music.a.a.db(str4, "[ve:");
        }
        else
        {
          Pattern localPattern = Pattern.compile("\\[(\\d{2}:\\d{2}(\\.\\d{2}){0,1})\\]");
          Matcher localMatcher2 = localPattern.matcher(str4);
          a.a locala1 = new a.a();
          label513:
          if (localMatcher2.find())
          {
            if (localMatcher2.groupCount() > 0) {
              locala1.timestamp = com.tencent.mm.plugin.music.a.a.Dj(localMatcher2.group(1));
            }
            localObject1 = localPattern.split(str4);
            if ((localObject1 != null) && (localObject1.length > 0))
            {
              localObject2 = localObject1[(localObject1.length - 1)];
              localObject1 = localObject2;
              if (localObject2 != null) {
                localObject1 = ((String)localObject2).trim();
              }
              localObject2 = localObject1;
              if (bg.nm((String)localObject1)) {
                localObject2 = " ";
              }
              locala1.content = ((String)localObject2);
              i = 0;
            }
            for (;;)
            {
              if (i < locala.npv.size())
              {
                localObject1 = new a.a();
                ((a.a)localObject1).timestamp = ((Long)locala.npv.get(i)).longValue();
                ((a.a)localObject1).content = locala1.content;
                ((a.a)localObject1).npA = true;
                i += 1;
                continue;
                locala.npv.add(Long.valueOf(locala1.timestamp));
                break;
              }
            }
            locala.npv.clear();
            i = locala.npu.size() - 1;
          }
          for (;;)
          {
            if ((i >= 0) && (((a.a)locala.npu.get(i)).timestamp != locala1.timestamp))
            {
              if (((a.a)locala.npu.get(i)).timestamp < locala1.timestamp) {
                locala.npu.add(i + 1, locala1);
              }
            }
            else
            {
              if (i >= 0) {
                break label513;
              }
              locala.npu.add(0, locala1);
              break label513;
              break;
            }
            i -= 1;
          }
        }
      }
      w.d("MicroMsg.Music.LyricObj", "handle offset %d", new Object[] { Long.valueOf(locala.mK) });
      if (locala.mK != 0L)
      {
        i = 0;
        while (i < locala.npu.size())
        {
          localObject1 = (a.a)locala.npu.get(i);
          ((a.a)localObject1).timestamp += locala.mK;
          i += 1;
        }
        locala.mK = 0L;
      }
      int i = 0;
      while (i < locala.npu.size() - 1)
      {
        localObject1 = (a.a)locala.npu.get(i);
        if ((((a.a)localObject1).npA) && (((a.a)localObject1).content.equals(((a.a)locala.npu.get(i + 1)).content))) {
          ((a.a)localObject1).content = " ";
        }
        i += 1;
      }
      break;
      Object localObject2 = new a.a();
      ((a.a)localObject2).timestamp = 0L;
      if (paramBoolean) {
        ((a.a)localObject2).content = ((String)localObject1);
      }
      for (;;)
      {
        if (((a.a)localObject2).content == null) {
          break label1065;
        }
        locala.npu.add(localObject2);
        break;
        if (!bool) {
          ((a.a)localObject2).content = ab.getContext().getString(R.l.dLE);
        } else {
          ((a.a)localObject2).content = ab.getContext().getString(R.l.dLF);
        }
      }
      label1065:
      break label124;
      label1067:
      localObject1 = new a.a();
      ((a.a)localObject1).timestamp = 0L;
      ((a.a)localObject1).content = ab.getContext().getString(R.l.efD, new Object[] { r.fs(str3) });
      if (locala.npu.isEmpty())
      {
        locala.npu.add(localObject1);
        break label141;
      }
      if (locala.npu.size() == 1)
      {
        locala.npu.add(0, localObject1);
        ((a.a)locala.npu.get(1)).timestamp = 5000L;
        break label141;
      }
      locala.npu.add(0, localObject1);
      ((a.a)locala.npu.get(1)).timestamp = (3L * (((a.a)locala.npu.get(2)).timestamp >> 2));
      break label141;
      label1227:
      localObject1 = new a.a();
      ((a.a)localObject1).timestamp = 0L;
      ((a.a)localObject1).content = str1;
      if (locala.npu.isEmpty())
      {
        locala.npu.add(localObject1);
      }
      else if (locala.npu.size() == 1)
      {
        locala.npu.add(0, localObject1);
        ((a.a)locala.npu.get(1)).timestamp = 5000L;
      }
      else
      {
        locala.npu.add(0, localObject1);
        ((a.a)locala.npu.get(1)).timestamp = (3L * (((a.a)locala.npu.get(2)).timestamp >> 2));
      }
    }
  }
  
  public final com.tencent.mm.at.a s(apv paramapv)
  {
    GMTrace.i(4847273246720L, 36115);
    String str = g.h(paramapv);
    com.tencent.mm.at.a locala = DO(str);
    if (locala == null) {
      locala = new com.tencent.mm.at.a();
    }
    for (int i = 0;; i = 1)
    {
      locala.field_musicId = str;
      locala.field_originMusicId = paramapv.ucY;
      locala.field_musicType = paramapv.uFq;
      locala.field_appId = paramapv.lQa;
      if (bg.nm(locala.field_appId)) {
        locala.field_appId = g.j(paramapv);
      }
      locala.field_songAlbum = paramapv.uFu;
      locala.field_songAlbumType = paramapv.uFC;
      locala.field_songWifiUrl = paramapv.uFw;
      locala.field_songName = paramapv.uFs;
      locala.field_songSinger = paramapv.uFt;
      locala.field_songWapLinkUrl = paramapv.uFx;
      locala.field_songWebUrl = paramapv.uFy;
      locala.field_songAlbumLocalPath = paramapv.uFA;
      locala.field_songMediaId = paramapv.ugf;
      locala.field_songSnsAlbumUser = paramapv.uFG;
      locala.field_songAlbumUrl = paramapv.uFv;
      locala.field_songSnsShareUser = paramapv.uFH;
      if (!bg.nm(paramapv.uFD)) {
        locala.field_songHAlbumUrl = paramapv.uFD;
      }
      locala.field_updateTime = System.currentTimeMillis();
      if (locala.field_songId == 0)
      {
        g.g(paramapv);
        locala.field_songId = paramapv.usQ;
      }
      if (((bg.nm(locala.field_songWapLinkUrl)) || (locala.field_songWapLinkUrl.equals(locala.field_songWebUrl))) && (!bg.nm(locala.field_songWifiUrl))) {
        locala.field_songWapLinkUrl = locala.field_songWifiUrl;
      }
      if ((locala.field_songId == 0) && (paramapv.uFq == 4)) {}
      try
      {
        locala.field_songId = Integer.valueOf(paramapv.ucY).intValue();
        locala.field_hideBanner = paramapv.uFJ;
        locala.field_jsWebUrlDomain = paramapv.uFK;
        locala.field_startTime = paramapv.grQ;
        locala.gOO = paramapv.gOO;
        if (i != 0)
        {
          w.i("MicroMsg.Music.MusicStorage", "update music %s", new Object[] { str });
          c(locala, new String[0]);
        }
        for (;;)
        {
          this.nsm.put(str, locala);
          GMTrace.o(4847273246720L, 36115);
          return locala;
          w.i("MicroMsg.Music.MusicStorage", "insert music %s", new Object[] { str });
          b(locala);
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */