package com.tencent.mm.plugin.music.a.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.a.f;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  static final Long jSH;
  private static final Long nqW;
  public static final Long nqX;
  private static final Long nqY;
  static final Long nqZ;
  private static final Long nra;
  private List<String> nqV;
  
  static
  {
    GMTrace.i(15024466690048L, 111941);
    jSH = Long.valueOf(604800000L);
    nqW = Long.valueOf(86400000L);
    nqX = Long.valueOf(43200000L);
    nqY = Long.valueOf(240000L);
    nqZ = nqW;
    nra = Long.valueOf(60000L);
    GMTrace.o(15024466690048L, 111941);
  }
  
  public a()
  {
    GMTrace.i(15023929819136L, 111937);
    this.nqV = new ArrayList(10);
    GMTrace.o(15023929819136L, 111937);
  }
  
  public a(List<String> paramList)
  {
    GMTrace.i(15023795601408L, 111936);
    this.nqV = new ArrayList(10);
    if (!paramList.isEmpty()) {
      this.nqV.addAll(paramList);
    }
    GMTrace.o(15023795601408L, 111936);
  }
  
  public static void aTb()
  {
    GMTrace.i(16025999376384L, 119403);
    w.i("MicroMsg.CleanMusicController", "scanMusicFile");
    long l1 = System.currentTimeMillis();
    Object localObject2 = h.aSt();
    Object localObject3 = String.format("SELECT * from %s WHERE updateTime < ? AND musicType <> ? limit 10", new Object[] { "Music" });
    long l2 = System.currentTimeMillis();
    Object localObject1 = new ArrayList();
    localObject2 = ((com.tencent.mm.plugin.music.a.g.a)localObject2).fTZ.rawQuery((String)localObject3, new String[] { String.valueOf(l2 - 604800000L), "6" });
    while (((Cursor)localObject2).moveToNext())
    {
      localObject3 = new com.tencent.mm.at.a();
      ((com.tencent.mm.at.a)localObject3).b((Cursor)localObject2);
      ((List)localObject1).add(localObject3);
    }
    ((Cursor)localObject2).close();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.at.a)((Iterator)localObject1).next();
      localObject3 = com.tencent.mm.plugin.music.a.g.b((com.tencent.mm.at.a)localObject2, true);
      String str1 = com.tencent.mm.plugin.music.a.g.b((com.tencent.mm.at.a)localObject2, false);
      String str2 = com.tencent.mm.plugin.music.a.g.c((com.tencent.mm.at.a)localObject2, false);
      String str3 = com.tencent.mm.plugin.music.a.g.c((com.tencent.mm.at.a)localObject2, true);
      FileOp.deleteFile((String)localObject3);
      FileOp.deleteFile(str1);
      FileOp.deleteFile(str2);
      FileOp.deleteFile(str3);
      localObject3 = h.aSt();
      str1 = ((com.tencent.mm.at.a)localObject2).field_musicId;
      ((com.tencent.mm.plugin.music.a.g.a)localObject3).nsm.remove(str1);
      ((com.tencent.mm.plugin.music.a.g.a)localObject3).nsn.remove(str1);
      localObject3 = h.aSt();
      str1 = ((com.tencent.mm.at.a)localObject2).field_musicId;
      w.i("MicroMsg.CleanMusicController", "delete music %d %s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.a.g.a)localObject3).fTZ.delete("Music", "musicId=?", new String[] { str1 })), ((com.tencent.mm.at.a)localObject2).field_musicId });
    }
    l1 = System.currentTimeMillis() - l1;
    w.i("MicroMsg.CleanMusicController", "scanMusic UseTime=%d", new Object[] { Long.valueOf(l1) });
    localObject1 = new ArrayList();
    localObject2 = new IDKey();
    ((IDKey)localObject2).SetID(285);
    ((IDKey)localObject2).SetKey(254);
    ((IDKey)localObject2).SetValue((int)l1);
    localObject3 = new IDKey();
    ((IDKey)localObject3).SetID(285);
    ((IDKey)localObject3).SetKey(255);
    ((IDKey)localObject3).SetValue(1L);
    ((ArrayList)localObject1).add(localObject2);
    ((ArrayList)localObject1).add(localObject3);
    com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject1, false);
    GMTrace.o(16025999376384L, 119403);
  }
  
  final boolean DE(String paramString)
  {
    GMTrace.i(15024064036864L, 111938);
    Iterator localIterator = this.nqV.iterator();
    while (localIterator.hasNext()) {
      if (paramString.contains((String)localIterator.next()))
      {
        GMTrace.o(15024064036864L, 111938);
        return true;
      }
    }
    GMTrace.o(15024064036864L, 111938);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */