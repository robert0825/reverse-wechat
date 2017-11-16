package com.tencent.mm.plugin.music.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jm.a;
import com.tencent.mm.g.b.ch;
import com.tencent.mm.g.b.cm;
import com.tencent.mm.plugin.music.a.a.b;
import com.tencent.mm.plugin.music.a.f.k;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import java.util.HashMap;
import java.util.List;

public final class h
  implements aq
{
  private AudioManager fMS;
  private com.tencent.mm.sdk.b.c hPq;
  private com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.e> lyT;
  private c nqb;
  private e nqc;
  private com.tencent.mm.plugin.music.a.g.a nqd;
  public ClipboardManager nqe;
  private com.tencent.mm.plugin.music.a.g.c nqf;
  private com.tencent.mm.plugin.music.a.a.a nqg;
  private b nqh;
  private com.tencent.mm.sdk.b.c nqi;
  
  public h()
  {
    GMTrace.i(4840830795776L, 36067);
    this.nqg = new com.tencent.mm.plugin.music.a.a.a();
    this.nqi = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(jm paramAnonymousjm)
      {
        GMTrace.i(15009300086784L, 111828);
        e locale;
        int i;
        switch (paramAnonymousjm.eNj.action)
        {
        default: 
        case 0: 
        case 3: 
        case 4: 
        case 7: 
        case 8: 
        case 5: 
        case 6: 
          for (;;)
          {
            GMTrace.o(15009300086784L, 111828);
            return false;
            h.aSs().e(paramAnonymousjm.eNj.eNl);
            continue;
            locale = h.aSs();
            paramAnonymousjm = paramAnonymousjm.eNj.eNl;
            if (paramAnonymousjm != null)
            {
              locale.npK.clear();
              locale.npK.add(g.h(paramAnonymousjm));
              locale.npJ = 0;
              h.aSt().s(paramAnonymousjm);
            }
            else
            {
              w.i("MicroMsg.Music.MusicPlayerManager", "shake music item is null");
              continue;
              locale = h.aSs();
              localObject = paramAnonymousjm.eNj.eIB;
              j = paramAnonymousjm.eNj.eNm;
              if ((localObject == null) || (((List)localObject).size() == 0) || (j >= ((List)localObject).size()))
              {
                w.i("MicroMsg.Music.MusicPlayerManager", "music wrapper list error");
              }
              else
              {
                locale.npK.clear();
                i = 0;
                while (i < ((List)localObject).size())
                {
                  paramAnonymousjm = (apv)((List)localObject).get(i);
                  locale.npK.add(g.h(paramAnonymousjm));
                  h.aSt().s(paramAnonymousjm);
                  i += 1;
                }
                locale.npJ = j;
                w.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusicList:%d", new Object[] { Integer.valueOf(locale.npJ) });
                paramAnonymousjm = locale.aSi();
                localObject = locale.aSj();
                if ((paramAnonymousjm == null) || (!g.c(paramAnonymousjm)))
                {
                  w.e("MicroMsg.Music.MusicPlayerManager", "music is null, do not start music");
                  if ((localObject != null) && (g.rn(((apv)localObject).uFq))) {
                    locale.npM.r((apv)localObject);
                  } else {
                    locale.npL.r((apv)localObject);
                  }
                }
                else
                {
                  i = paramAnonymousjm.field_musicType;
                  if (paramAnonymousjm.field_isBlock == 1)
                  {
                    w.i("MicroMsg.Music.MusicPlayerManager", "not play music list, music is block %s", new Object[] { paramAnonymousjm.field_musicId });
                    if (g.rn(paramAnonymousjm.field_musicType)) {
                      locale.npM.r((apv)localObject);
                    }
                    for (;;)
                    {
                      f.a(paramAnonymousjm, true);
                      break;
                      locale.npL.r((apv)localObject);
                    }
                  }
                  w.i("MicroMsg.Music.MusicPlayerManager", "musicType %d", new Object[] { Integer.valueOf(i) });
                  if (i != 11) {
                    e.aSn();
                  }
                  locale.mode = 2;
                  if (g.rn(i))
                  {
                    w.i("MicroMsg.Music.MusicPlayerManager", "use qqMusicPlayer");
                    if (locale.npL.JQ()) {
                      locale.npL.ahO();
                    }
                    locale.npM.e(paramAnonymousjm);
                  }
                  else
                  {
                    w.i("MicroMsg.Music.MusicPlayerManager", "use musicPlayer");
                    if (locale.npM.JQ()) {
                      locale.npM.ahO();
                    }
                    locale.npL.e(paramAnonymousjm);
                    continue;
                    paramAnonymousjm.eNk.eAO = h.aSs().aSk().gG(paramAnonymousjm.eNj.position);
                    continue;
                    paramAnonymousjm.eNk.eNo = h.aSs().aSk().aSK();
                    continue;
                    h.aSs().d(paramAnonymousjm.eNj.eIB, paramAnonymousjm.eNj.eNn);
                    continue;
                    locale = h.aSs();
                    paramAnonymousjm = paramAnonymousjm.eNj.eNl;
                    if (paramAnonymousjm != null) {
                      break;
                    }
                    w.i("MicroMsg.Music.MusicPlayerManager", "musicWrapper is null");
                  }
                }
              }
            }
          }
          Object localObject = g.h(paramAnonymousjm);
          if (locale.npK != null)
          {
            i = 0;
            label687:
            if (i < locale.npK.size()) {
              if (((String)localObject).equals(locale.npK.get(i)))
              {
                locale.npJ = i;
                i = 1;
                label725:
                j = i;
                if (locale.npK.size() > 1)
                {
                  j = i;
                  if (paramAnonymousjm.uFI) {
                    locale.mode = 2;
                  }
                }
              }
            }
          }
          break;
        }
        for (int j = i;; j = 0)
        {
          if (j != 0)
          {
            locale.e(null);
            break;
            i += 1;
            break label687;
          }
          locale.e(paramAnonymousjm);
          break;
          h.aSs().aSk().aSU();
          break;
          h.aSs().aSk().resume();
          break;
          paramAnonymousjm.eNk.eNl = h.aSs().aSj();
          break;
          paramAnonymousjm.eNk.eAO = h.aSs().aSk().JQ();
          break;
          paramAnonymousjm.eNk.eAO = h.aSs().aSk().JR();
          break;
          paramAnonymousjm.eNk.eAO = h.aSs().aSk().aSI();
          break;
          h.aSs().JO();
          break;
          h.aSs().aSo();
          break;
          i = 0;
          break label725;
        }
      }
    };
    this.hPq = new com.tencent.mm.sdk.b.c() {};
    this.lyT = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(4840830795776L, 36067);
  }
  
  public static h aSr()
  {
    GMTrace.i(4840965013504L, 36068);
    h localh2 = (h)at.AK().gZ("plugin.music");
    h localh1 = localh2;
    if (localh2 == null)
    {
      localh1 = new h();
      at.AK().a("plugin.music", localh1);
    }
    GMTrace.o(4840965013504L, 36068);
    return localh1;
  }
  
  public static e aSs()
  {
    GMTrace.i(4841233448960L, 36070);
    if (aSr().nqc == null) {
      aSr().nqc = new e();
    }
    e locale = aSr().nqc;
    GMTrace.o(4841233448960L, 36070);
    return locale;
  }
  
  public static com.tencent.mm.plugin.music.a.g.a aSt()
  {
    GMTrace.i(4841367666688L, 36071);
    if (aSr().nqd == null)
    {
      localObject = aSr();
      at.AR();
      ((h)localObject).nqd = new com.tencent.mm.plugin.music.a.g.a(com.tencent.mm.y.c.yH());
    }
    Object localObject = aSr().nqd;
    GMTrace.o(4841367666688L, 36071);
    return (com.tencent.mm.plugin.music.a.g.a)localObject;
  }
  
  public static AudioManager aSu()
  {
    GMTrace.i(4841501884416L, 36072);
    if (aSr().fMS == null) {
      aSr().fMS = ((AudioManager)ab.getContext().getSystemService("audio"));
    }
    AudioManager localAudioManager = aSr().fMS;
    GMTrace.o(4841501884416L, 36072);
    return localAudioManager;
  }
  
  public static c aSv()
  {
    GMTrace.i(4841636102144L, 36073);
    if (aSr().nqb == null) {
      aSr().nqb = new c();
    }
    c localc = aSr().nqb;
    GMTrace.o(4841636102144L, 36073);
    return localc;
  }
  
  public static com.tencent.mm.plugin.music.a.g.c aSw()
  {
    GMTrace.i(15009165869056L, 111827);
    if (aSr().nqf == null)
    {
      localObject = aSr();
      at.AR();
      ((h)localObject).nqf = new com.tencent.mm.plugin.music.a.g.c(com.tencent.mm.y.c.yH());
    }
    Object localObject = aSr().nqf;
    GMTrace.o(15009165869056L, 111827);
    return (com.tencent.mm.plugin.music.a.g.c)localObject;
  }
  
  public static b aSx()
  {
    GMTrace.i(19517136699392L, 145414);
    if (aSr().nqh == null) {
      aSr().nqh = new b();
    }
    b localb = aSr().nqh;
    GMTrace.o(19517136699392L, 145414);
    return localb;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4841904537600L, 36075);
    this.lyT.bPu();
    this.nqi.bPu();
    this.hPq.bPu();
    this.nqg.bPu();
    GMTrace.o(4841904537600L, 36075);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4842038755328L, 36076);
    GMTrace.o(4842038755328L, 36076);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4841770319872L, 36074);
    GMTrace.o(4841770319872L, 36074);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4842172973056L, 36077);
    Object localObject;
    if (this.nqc != null)
    {
      localObject = this.nqc;
      ((e)localObject).JO();
      w.i("MicroMsg.Music.MusicPlayerManager", "release");
      if (((e)localObject).npM != null)
      {
        k localk = ((e)localObject).npM;
        w.i("MicroMsg.QQMusicPlayer", "release");
        if (localk.nqH != null)
        {
          localk.nqH.release();
          localk.nqH = null;
        }
        if (localk.nqD != null)
        {
          localk.nqD.end();
          localk.nqD.bQu();
        }
      }
      af.F(((e)localObject).npQ);
      ((e)localObject).npK.clear();
      at.wS().b(520, (com.tencent.mm.ad.e)localObject);
      at.wS().b(940, (com.tencent.mm.ad.e)localObject);
    }
    if (this.nqh != null)
    {
      localObject = this.nqh;
      w.i("MicroMsg.AudioPlayerMgr", "release, clear all cache");
      ((b)localObject).aSy();
      this.nqh = null;
    }
    this.nqc = null;
    this.nqb = null;
    this.nqd = null;
    this.fMS = null;
    this.nqe = null;
    this.nqf = null;
    com.tencent.mm.sdk.b.a.vgX.c(this.nqi);
    com.tencent.mm.sdk.b.a.vgX.c(this.nqg);
    this.nqg.dead();
    this.nqi.dead();
    this.hPq.dead();
    this.lyT.dead();
    GMTrace.o(4842172973056L, 36077);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4841099231232L, 36069);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("Music".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4856400052224L, 36183);
        String str = i.a(ch.qM(), "Music");
        GMTrace.o(4856400052224L, 36183);
        return new String[] { str };
      }
    });
    localHashMap.put(Integer.valueOf("PieceMusicInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(15012789747712L, 111854);
        String str = i.a(cm.qM(), "PieceMusicInfo");
        GMTrace.o(15012789747712L, 111854);
        return new String[] { str };
      }
    });
    GMTrace.o(4841099231232L, 36069);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */