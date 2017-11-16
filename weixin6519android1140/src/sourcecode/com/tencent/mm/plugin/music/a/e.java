package com.tencent.mm.plugin.music.a;

import android.content.ContentValues;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jm.b;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.plugin.music.a.f.c;
import com.tencent.mm.protocal.c.acx;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.mg;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
  implements com.tencent.mm.ad.e
{
  public int mode;
  public int npJ;
  public List<String> npK;
  public com.tencent.mm.plugin.music.a.f.f npL;
  public com.tencent.mm.plugin.music.a.f.k npM;
  private com.tencent.mm.plugin.music.a.d.a npN;
  public com.tencent.mm.plugin.music.a.d.b npO;
  public boolean npP;
  Runnable npQ;
  
  public e()
  {
    GMTrace.i(4843246714880L, 36085);
    this.mode = 1;
    this.npQ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18371051520000L, 136875);
        boolean bool1 = e.this.aSk().JR();
        boolean bool2 = e.this.aSk().JQ();
        w.i("MicroMsg.Music.MusicPlayerManager", "stopMusicDelayRunnable, isStartPlayMusic:%b, isPlayingMusic:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if ((bool1) && (!bool2)) {
          e.this.aSk().ahO();
        }
        GMTrace.o(18371051520000L, 136875);
      }
    };
    this.npL = new com.tencent.mm.plugin.music.a.f.f();
    this.npM = new com.tencent.mm.plugin.music.a.f.k();
    at.wS().a(520, this);
    this.npK = new ArrayList();
    GMTrace.o(4843246714880L, 36085);
  }
  
  public static void aSn()
  {
    GMTrace.i(15010508046336L, 111837);
    w.i("MicroMsg.Music.MusicPlayerManager", "sendPreemptedEvent");
    jn localjn = new jn();
    localjn.eNp.action = 10;
    localjn.eNp.state = "preempted";
    localjn.eNp.appId = "not from app brand appid";
    localjn.eNp.eNr = true;
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    GMTrace.o(15010508046336L, 111837);
  }
  
  public final void JO()
  {
    GMTrace.i(15010239610880L, 111835);
    this.npL.ahO();
    if (this.npM != null) {
      this.npM.ahO();
    }
    af.F(this.npQ);
    GMTrace.o(15010239610880L, 111835);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4843917803520L, 36090);
    Object localObject1;
    if ((paramk instanceof com.tencent.mm.plugin.music.a.d.a))
    {
      w.i("MicroMsg.Music.MusicPlayerManager", "onSceneEnd errCode:%d", new Object[] { Integer.valueOf(paramInt2) });
      at.wS().b(940, this);
      if ((paramInt1 == 4) && (paramInt2 == -24))
      {
        paramk = ((com.tencent.mm.plugin.music.a.d.a)paramk).nrs;
        if ((aSi() != null) && (paramk.ucY.equals(aSi().field_musicId))) {
          JO();
        }
        paramString = h.aSt();
        paramk = paramk.ucY;
        localObject1 = new ContentValues();
        ((ContentValues)localObject1).put("isBlock", Integer.valueOf(1));
        paramString.fTZ.update("Music", (ContentValues)localObject1, "musicId=?", new String[] { paramk });
        paramString = (com.tencent.mm.at.a)paramString.nsm.get(paramk);
        if (paramString != null) {
          paramString.field_isBlock = 1;
        }
        w.i("MicroMsg.Music.MusicPlayerManager", "onSceneEnd music is block %s", new Object[] { aSi().field_musicId });
        GMTrace.o(4843917803520L, 36090);
      }
    }
    else
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(4843917803520L, 36090);
        return;
      }
      paramString = (com.tencent.mm.plugin.music.a.d.b)paramk;
      Object localObject3 = paramString.nrt;
      localObject1 = paramString.eNq.field_musicId;
      if ((localObject3 != null) && (localObject1 != null))
      {
        Object localObject2 = this.npK.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramk = (String)((Iterator)localObject2).next();
          if (paramk.equals(localObject1))
          {
            localObject1 = com.tencent.mm.platformtools.n.b(((acx)localObject3).usV);
            localObject2 = com.tencent.mm.platformtools.n.b(((acx)localObject3).usW);
            localObject3 = com.tencent.mm.platformtools.n.b(((acx)localObject3).usU);
            com.tencent.mm.plugin.music.a.g.a locala = h.aSt();
            boolean bool = paramString.nru;
            com.tencent.mm.at.a locala1 = locala.DO(paramk);
            if (locala1 == null) {
              w.e("MicroMsg.Music.MusicStorage", "updateMusicWithLyricResponse can not find music %s", new Object[] { paramk });
            }
            for (;;)
            {
              w.i("MicroMsg.Music.MusicPlayerManager", "get response %s %s %s", new Object[] { localObject1, localObject2, localObject3 });
              if (bg.nm((String)localObject2)) {
                break;
              }
              paramk = new jn();
              paramk.eNp.action = 6;
              paramk.eNp.eNq = paramString.eNq;
              com.tencent.mm.sdk.b.a.vgX.a(paramk, Looper.getMainLooper());
              GMTrace.o(4843917803520L, 36090);
              return;
              if (!bg.nm((String)localObject1)) {
                locala1.field_songAlbumUrl = ((String)localObject1);
              }
              locala1.field_songHAlbumUrl = ((String)localObject2);
              locala1.field_songLyric = ((String)localObject3);
              locala.c(locala1, new String[] { "songAlbumUrl", "songHAlbumUrl", "songLyric" });
              locala.nsm.put(paramk, locala1);
              locala.g(locala1, bool);
            }
          }
        }
      }
    }
    GMTrace.o(4843917803520L, 36090);
  }
  
  public final com.tencent.mm.at.a aSi()
  {
    GMTrace.i(4843649368064L, 36088);
    if (this.npK.size() <= this.npJ)
    {
      GMTrace.o(4843649368064L, 36088);
      return null;
    }
    Object localObject = (String)this.npK.get(this.npJ);
    localObject = h.aSt().DO((String)localObject);
    GMTrace.o(4843649368064L, 36088);
    return (com.tencent.mm.at.a)localObject;
  }
  
  public final apv aSj()
  {
    GMTrace.i(4843783585792L, 36089);
    if (this.npK.size() <= this.npJ)
    {
      GMTrace.o(4843783585792L, 36089);
      return null;
    }
    Object localObject = (String)this.npK.get(this.npJ);
    localObject = h.aSt().DO((String)localObject);
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.at.a)localObject).JN();
      GMTrace.o(4843783585792L, 36089);
      return (apv)localObject;
    }
    GMTrace.o(4843783585792L, 36089);
    return null;
  }
  
  public final c aSk()
  {
    GMTrace.i(15010373828608L, 111836);
    Object localObject = aSj();
    if ((localObject != null) && (g.rn(((apv)localObject).uFq)))
    {
      localObject = this.npM;
      GMTrace.o(15010373828608L, 111836);
      return (c)localObject;
    }
    localObject = this.npL;
    GMTrace.o(15010373828608L, 111836);
    return (c)localObject;
  }
  
  public final void aSl()
  {
    GMTrace.i(4844052021248L, 36091);
    com.tencent.mm.sdk.f.e.post(new a(), "music_get_list_task");
    GMTrace.o(4844052021248L, 36091);
  }
  
  public final boolean aSm()
  {
    GMTrace.i(4844186238976L, 36092);
    if ((this.npK.size() > 0) && (this.mode == 2))
    {
      GMTrace.o(4844186238976L, 36092);
      return true;
    }
    GMTrace.o(4844186238976L, 36092);
    return false;
  }
  
  public final void aSo()
  {
    GMTrace.i(18370783084544L, 136873);
    w.i("MicroMsg.Music.MusicPlayerManager", "stopMusicDelayIfPaused, delay_ms:%d", new Object[] { Integer.valueOf(600000) });
    af.F(this.npQ);
    af.i(this.npQ, 600000L);
    GMTrace.o(18370783084544L, 136873);
  }
  
  public final void d(List<apv> paramList, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(4843515150336L, 36087);
        if ((paramList == null) || (paramList.size() == 0))
        {
          w.i("MicroMsg.Music.MusicPlayerManager", "appendMusicList error");
          GMTrace.o(4843515150336L, 36087);
          return;
        }
        if (paramBoolean) {
          this.npK.clear();
        }
        paramList = paramList.iterator();
        if (paramList.hasNext())
        {
          apv localapv = (apv)paramList.next();
          this.npK.add(g.h(localapv));
          h.aSt().s(localapv);
        }
        else
        {
          GMTrace.o(4843515150336L, 36087);
        }
      }
      finally {}
    }
  }
  
  public final void e(apv paramapv)
  {
    int j = 0;
    GMTrace.i(4843380932608L, 36086);
    if ((paramapv == null) && (this.npK.size() == 0))
    {
      w.i("MicroMsg.Music.MusicPlayerManager", "musicWrapper is null && musicList's size is 0");
      GMTrace.o(4843380932608L, 36086);
      return;
    }
    if (paramapv != null)
    {
      this.npK.clear();
      this.npK.add(g.h(paramapv));
      this.npJ = 0;
      h.aSt().s(paramapv);
      if (this.mode == 2) {
        aSl();
      }
    }
    w.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusic");
    apv localapv = paramapv;
    if (paramapv == null) {
      localapv = aSj();
    }
    if (localapv != null) {
      w.i("MicroMsg.Music.MusicPlayerManager", "MusicType %d", new Object[] { Integer.valueOf(localapv.uFq) });
    }
    paramapv = aSi();
    if ((paramapv == null) || (!g.c(paramapv)))
    {
      w.e("MicroMsg.Music.MusicPlayerManager", "music or url is null, do not start music");
      if ((localapv != null) && (g.rn(localapv.uFq)))
      {
        this.npM.r(localapv);
        GMTrace.o(4843380932608L, 36086);
        return;
      }
      this.npL.r(localapv);
      GMTrace.o(4843380932608L, 36086);
      return;
    }
    if (paramapv.field_isBlock == 1)
    {
      w.i("MicroMsg.Music.MusicPlayerManager", "not play new music, music is block %s", new Object[] { paramapv.field_musicId });
      if (g.rn(paramapv.field_musicType)) {
        this.npM.r(localapv);
      }
      for (;;)
      {
        f.a(paramapv, true);
        GMTrace.o(4843380932608L, 36086);
        return;
        this.npL.r(localapv);
      }
    }
    if (this.npN != null) {
      at.wS().c(this.npN);
    }
    at.wS().a(940, this);
    int i;
    if (localapv == null)
    {
      i = 0;
      this.npN = new com.tencent.mm.plugin.music.a.d.a(i, paramapv);
      at.wS().a(this.npN, 0);
      if ((localapv == null) || (!g.rn(localapv.uFq))) {
        break label439;
      }
      w.i("MicroMsg.Music.MusicPlayerManager", "use qqMusicPlayer");
      if (this.npL.JQ()) {
        this.npL.ahO();
      }
      this.npM.e(paramapv);
      i = localapv.uFq;
    }
    for (;;)
    {
      if (i != 11) {
        aSn();
      }
      GMTrace.o(4843380932608L, 36086);
      return;
      i = localapv.uFq;
      break;
      label439:
      w.i("MicroMsg.Music.MusicPlayerManager", "use musicPlayer");
      if (this.npM.JQ()) {
        this.npM.ahO();
      }
      this.npL.e(paramapv);
      i = j;
      if (localapv != null) {
        i = localapv.uFq;
      }
    }
  }
  
  private final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(4854118350848L, 36166);
      GMTrace.o(4854118350848L, 36166);
    }
    
    public final void run()
    {
      GMTrace.i(4854252568576L, 36167);
      long l = System.currentTimeMillis();
      e.this.npP = true;
      Object localObject1 = e.this.aSj();
      ArrayList localArrayList = new ArrayList();
      switch (((apv)localObject1).uFq)
      {
      case 2: 
      case 3: 
      case 5: 
      case 7: 
      default: 
        localObject1 = null;
      }
      while (localObject1 != null)
      {
        int i = 0;
        while (i < ((List)localObject1).size())
        {
          localObject2 = (apv)((List)localObject1).get(i);
          h.aSt().s((apv)localObject2);
          localArrayList.add(g.h((apv)localObject2));
          i += 1;
        }
        localObject1 = new ft();
        ((ft)localObject1).eIo.type = 18;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((ft)localObject1).eIp.eIB;
        continue;
        localObject1 = new jm();
        ((jm)localObject1).eNj.action = -4;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((jm)localObject1).eNk.eIB;
        continue;
        localObject1 = new jm();
        ((jm)localObject1).eNj.action = -5;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((jm)localObject1).eNk.eIB;
        continue;
        Object localObject2 = new jm();
        ((jm)localObject2).eNj.action = -6;
        ((jm)localObject2).eNj.eNl = ((apv)localObject1);
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        localObject1 = ((jm)localObject2).eNk.eIB;
      }
      w.i("MicroMsg.Music.MusicPlayerManager", "GetMusicWrapperListTask run time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      e.this.npP = false;
      localObject1 = new e.b(e.this);
      ((e.b)localObject1).npS = localArrayList;
      af.t((Runnable)localObject1);
      GMTrace.o(4854252568576L, 36167);
    }
  }
  
  private final class b
    implements Runnable
  {
    public List<String> npS;
    
    public b()
    {
      GMTrace.i(4853447262208L, 36161);
      GMTrace.o(4853447262208L, 36161);
    }
    
    public final void run()
    {
      GMTrace.i(4853581479936L, 36162);
      Object localObject = g.h(e.this.aSj());
      int j = e.this.npJ;
      int i = 0;
      int k = 0;
      while (i < this.npS.size())
      {
        if (((String)this.npS.get(i)).equals(localObject))
        {
          j = i;
          k = 1;
        }
        i += 1;
      }
      if (k == 0)
      {
        GMTrace.o(4853581479936L, 36162);
        return;
      }
      i = j + 1;
      while (i < this.npS.size())
      {
        e.this.npK.add(this.npS.get(i));
        i += 1;
      }
      i = 0;
      while (i < j)
      {
        e.this.npK.add(this.npS.get(i));
        i += 1;
      }
      w.i("MicroMsg.Music.MusicPlayerManager", "GetMusicWrapperListTask currentMusicSize=%d currentMusicIndex=%d", new Object[] { Integer.valueOf(e.this.npK.size()), Integer.valueOf(e.this.npJ) });
      localObject = new jn();
      ((jn)localObject).eNp.action = 5;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(4853581479936L, 36162);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */