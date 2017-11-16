package com.tencent.mm.plugin.music.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.at.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class f
{
  public static long grT;
  public static boolean npT;
  public static boolean npU;
  public static int npV;
  public static int npW;
  public static a npX;
  public static int scene;
  
  public static final void J(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(4856802705408L, 36186);
    a locala = h.aSs().aSi();
    if (locala != null)
    {
      w.v("MicroMsg.Music.MusicReportUtil", "kvReportShakeReport: %d, %d, %d, %s, %s, %s, %s, %d %s, %s", new Object[] { Integer.valueOf(13042), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt3), locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.g.ork.i(13042, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt3), locala.field_songSinger, locala.field_appId });
    }
    GMTrace.o(4856802705408L, 36186);
  }
  
  public static final void a(a parama, boolean paramBoolean)
  {
    GMTrace.i(18969259933696L, 141332);
    if (parama == null)
    {
      w.e("MicroMsg.Music.MusicReportUtil", "idKeyReportMusicPlayerSum music is null");
      GMTrace.o(18969259933696L, 141332);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetKey(0);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    localIDKey2.SetValue(1L);
    IDKey localIDKey3 = new IDKey();
    localIDKey3.SetID(558);
    localIDKey3.SetValue(1L);
    if (paramBoolean)
    {
      localIDKey3.SetKey(10);
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey3);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      GMTrace.o(18969259933696L, 141332);
      return;
    }
    if (g.rn(parama.field_musicType))
    {
      localIDKey3.SetKey(2);
      i = parama.field_musicType;
      w.i("MicroMsg.PlayerErrorHandler", "getQQMusicPlayerSumidKeyByMusicType, musicType:" + i);
      switch (i)
      {
      case 2: 
      case 3: 
      default: 
        i = 127;
      }
      for (;;)
      {
        localIDKey2.SetKey(i);
        localArrayList.add(localIDKey2);
        com.tencent.mm.plugin.report.service.g.ork.i(14174, new Object[] { Integer.valueOf(1), Integer.valueOf(parama.field_musicType) });
        break;
        i = 117;
        continue;
        i = 118;
        continue;
        i = 119;
        continue;
        i = 120;
        continue;
        i = 121;
        continue;
        i = 122;
        continue;
        i = 123;
        continue;
        i = 124;
        continue;
        i = 125;
        continue;
        i = 126;
      }
    }
    localIDKey3.SetKey(1);
    int i = parama.field_musicType;
    w.i("MicroMsg.PlayerErrorHandler", "getMusicPlayerSumidKeyByMusicType, musicType:" + i);
    switch (i)
    {
    case 2: 
    case 3: 
    default: 
      i = 113;
    }
    for (;;)
    {
      localIDKey2.SetKey(i);
      localArrayList.add(localIDKey2);
      com.tencent.mm.plugin.report.service.g.ork.i(14174, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType) });
      break;
      i = 105;
      continue;
      i = 106;
      continue;
      i = 107;
      continue;
      i = 108;
      continue;
      i = 109;
      continue;
      i = 110;
      continue;
      i = 111;
      continue;
      i = 112;
    }
  }
  
  public static final void aSp()
  {
    int k = 1;
    GMTrace.i(4857071140864L, 36188);
    Object localObject;
    String str1;
    String str2;
    int m;
    int n;
    int i1;
    int i;
    label76:
    String str3;
    if (npX != null)
    {
      so();
      localObject = npX.field_musicId;
      str1 = npX.field_songName;
      str2 = npX.field_songAlbum;
      m = npX.field_songId;
      n = npV;
      i1 = npW;
      if (!npT) {
        break label378;
      }
      i = 1;
      if (!npU) {
        break label383;
      }
      j = 1;
      w.v("MicroMsg.Music.MusicReportUtil", "kvReportMusicPlayInfo: %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { Integer.valueOf(13044), localObject, str1, str2, Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(scene), npX.field_songSinger, npX.field_appId });
      localObject = com.tencent.mm.plugin.report.service.g.ork;
      str1 = npX.field_musicId;
      str2 = npX.field_songName;
      str3 = npX.field_songAlbum;
      m = npX.field_songId;
      n = npV;
      i1 = npW;
      if (!npT) {
        break label388;
      }
      i = 1;
      label236:
      if (!npU) {
        break label393;
      }
    }
    label378:
    label383:
    label388:
    label393:
    for (int j = k;; j = 2)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(13044, new Object[] { str1, str2, str3, Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(scene), npX.field_songSinger, npX.field_appId });
      npX = null;
      npT = false;
      npU = false;
      npV = 0;
      npW = 0;
      grT = 0L;
      scene = 0;
      GMTrace.o(4857071140864L, 36188);
      return;
      i = 2;
      break;
      j = 2;
      break label76;
      i = 2;
      break label236;
    }
  }
  
  public static final void aSq()
  {
    GMTrace.i(4857339576320L, 36190);
    com.tencent.mm.plugin.report.service.g.ork.a(285L, 4L, 1L, false);
    GMTrace.o(4857339576320L, 36190);
  }
  
  public static final void cz(int paramInt1, int paramInt2)
  {
    GMTrace.i(4856936923136L, 36187);
    a locala = h.aSs().aSi();
    if (locala != null)
    {
      w.v("MicroMsg.Music.MusicReportUtil", "kvReportAction: %d, %s, %s, %s, %s, %d, %d, %s, %s", new Object[] { Integer.valueOf(13232), locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.g.ork.i(13232, new Object[] { locala.field_musicId, locala.field_songName, locala.field_songAlbum, Integer.valueOf(locala.field_songId), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), locala.field_songSinger, locala.field_appId });
    }
    GMTrace.o(4856936923136L, 36187);
  }
  
  public static final void rj(int paramInt)
  {
    GMTrace.i(15012521312256L, 111852);
    if (paramInt == 2) {
      com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(7), Integer.valueOf(1), Integer.valueOf(0) });
    }
    GMTrace.o(15012521312256L, 111852);
  }
  
  public static final void rk(int paramInt)
  {
    GMTrace.i(15012655529984L, 111853);
    if (paramInt == 2) {
      com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(7), Integer.valueOf(0), Integer.valueOf(0) });
    }
    GMTrace.o(15012655529984L, 111853);
  }
  
  public static final void rl(int paramInt)
  {
    GMTrace.i(19526666158080L, 145485);
    w.i("MicroMsg.Music.MusicReportUtil", "idKeyReportQQAudioPlayerSum scene:%d", new Object[] { Integer.valueOf(paramInt) });
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(688);
    localIDKey1.SetKey(0);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(688);
    w.i("MicroMsg.PlayerErrorHandler", "getQQAudioPlayerSumIdKeyByScene, scene:" + paramInt);
    switch (paramInt)
    {
    }
    localIDKey2.SetKey(2);
    localIDKey2.SetValue(1L);
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
    GMTrace.o(19526666158080L, 145485);
  }
  
  public static final void rm(int paramInt)
  {
    GMTrace.i(18370648866816L, 136872);
    a locala = h.aSs().aSi();
    if (locala != null)
    {
      w.i("MicroMsg.Music.MusicReportUtil", "ReportMusicPlayerShareStat ShareType:%d, MusicId:%s, MusicTitle:%s, Singer:%s, AppId:%s", new Object[] { Integer.valueOf(paramInt), locala.field_musicId, locala.field_songName, locala.field_songSinger, locala.field_appId });
      com.tencent.mm.plugin.report.service.g.ork.i(12836, new Object[] { Integer.valueOf(paramInt), locala.field_musicId, locala.field_songName, locala.field_songSinger, locala.field_appId });
    }
    GMTrace.o(18370648866816L, 136872);
  }
  
  public static final void so()
  {
    GMTrace.i(4857205358592L, 36189);
    if (grT > 0L)
    {
      npW = (int)(npW + (System.currentTimeMillis() - grT) / 1000L);
      grT = 0L;
    }
    GMTrace.o(4857205358592L, 36189);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */