package com.tencent.mm.plugin.music.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.music.a.f;
import com.tencent.mm.plugin.music.a.f.c.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import java.net.URL;
import java.util.ArrayList;

public final class e
  extends d
{
  public AudioFormat.AudioType audioType;
  public String eAL;
  protected com.tencent.mm.ab.a eAN;
  public int grQ;
  public boolean grW;
  CommonPlayer nqH;
  private com.tencent.mm.ab.c nqI;
  public boolean nqJ;
  public a nqK;
  private IMediaHTTPService nqL;
  public String nqM;
  public int nqN;
  public boolean nqO;
  private long nqP;
  boolean nqQ;
  private PlayerListenerCallback nqR;
  
  public e()
  {
    GMTrace.i(19517539352576L, 145417);
    this.eAL = "";
    this.nqM = "";
    this.nqN = 0;
    this.grQ = 0;
    this.nqO = false;
    this.nqP = 0L;
    this.audioType = AudioFormat.AudioType.UNSUPPORT;
    this.nqQ = false;
    this.grW = false;
    this.nqR = new PlayerListenerCallback()
    {
      com.tencent.mm.ab.a nqS;
      
      private void aTa()
      {
        GMTrace.i(19526531940352L, 145484);
        w.i("MicroMsg.QQAudioPlayer", "_onPrepared");
        this.nqS = e.this.eAN;
        if (e.this.grW)
        {
          w.i("MicroMsg.QQAudioPlayer", "isPausedOnBackground is true, do stop player and not send event");
          if (e.this.nqH != null) {
            e.this.nqH.stop();
          }
          GMTrace.o(19526531940352L, 145484);
          return;
        }
        if (e.this.grQ != 0)
        {
          w.i("MicroMsg.QQAudioPlayer", "seek to startTime:%d", new Object[] { Integer.valueOf(e.this.grQ) });
          e.this.gG(e.this.grQ);
          GMTrace.o(19526531940352L, 145484);
          return;
        }
        Object localObject;
        IDKey localIDKey;
        int i;
        if ((e.this.nqH != null) && (e.this.nqH.getCurrentAudioInformation() != null) && (e.this.nqH.getCurrentAudioInformation().getAudioType() != null))
        {
          w.i("MicroMsg.QQAudioPlayer", "getAudioType:%d", new Object[] { Integer.valueOf(e.this.nqH.getCurrentAudioInformation().getAudioType().getValue()) });
          e.this.audioType = e.this.nqH.getCurrentAudioInformation().getAudioType();
          localObject = e.this;
          if (((e)localObject).audioType != null)
          {
            w.i("MicroMsg.QQAudioPlayer", "idKeyReportAudioMimeType audioType:%d, isStatMineType:%b", new Object[] { Integer.valueOf(((e)localObject).audioType.getValue()), Boolean.valueOf(((e)localObject).nqQ) });
            if (!((e)localObject).nqQ)
            {
              w.i("MicroMsg.QQAudioPlayer", "idKeyReportAudioMimeType OK");
              ((e)localObject).nqQ = true;
              localIDKey = new IDKey();
              localIDKey.SetID(688);
              i = ((e)localObject).audioType.getValue();
              if (i != 2) {
                break label383;
              }
              i = 42;
            }
          }
        }
        for (;;)
        {
          localIDKey.SetKey(i);
          localIDKey.SetValue(1L);
          localObject = new ArrayList();
          ((ArrayList)localObject).add(localIDKey);
          com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject, true);
          e.this.aSM();
          if (e.this.nqO) {
            break;
          }
          w.i("MicroMsg.QQAudioPlayer", "autoplay is false, don't start auto play!");
          GMTrace.o(19526531940352L, 145484);
          return;
          label383:
          if (i == 3) {
            i = 43;
          } else if (i == 4) {
            i = 44;
          } else if (i == 5) {
            i = 45;
          } else if (i == 6) {
            i = 46;
          } else if (i == 7) {
            i = 47;
          } else if (i == 8) {
            i = 48;
          } else if (i == 9) {
            i = 49;
          } else {
            i = 50;
          }
        }
        w.i("MicroMsg.QQAudioPlayer", "start to play");
        try
        {
          if (e.this.nqH != null) {
            e.this.nqH.start();
          }
          e.this.nqJ = true;
          GMTrace.o(19526531940352L, 145484);
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException, "_onPrepared", new Object[0]);
            e.this.ro(502);
            e.this.rp(502);
          }
        }
      }
      
      public final void onBufferingUpdate(BaseMediaPlayer paramAnonymousBaseMediaPlayer, int paramAnonymousInt)
      {
        GMTrace.i(19525592416256L, 145477);
        GMTrace.o(19525592416256L, 145477);
      }
      
      public final void onCompletion(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19525726633984L, 145478);
        w.i("MicroMsg.QQAudioPlayer", "onCompletion");
        GMTrace.o(19525726633984L, 145478);
      }
      
      public final void onError(BaseMediaPlayer paramAnonymousBaseMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19525995069440L, 145480);
        w.e("MicroMsg.QQAudioPlayer", "onError what:%d, extra:%d, errCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3) });
        if (this.nqS == null)
        {
          w.e("MicroMsg.QQAudioPlayer", "onError, currentParam is null");
          GMTrace.o(19525995069440L, 145480);
          return;
        }
        boolean bool = am.isNetworkConnected(ab.getContext());
        if ((paramAnonymousInt2 == 80) && (bool)) {
          w.e("MicroMsg.QQAudioPlayer", "connect success, but download is fail!");
        }
        if (e.this.nqN > 0)
        {
          w.e("MicroMsg.QQAudioPlayer", "errorCount %d", new Object[] { Integer.valueOf(e.this.nqN) });
          GMTrace.o(19525995069440L, 145480);
          return;
        }
        e.this.nqJ = false;
        paramAnonymousBaseMediaPlayer = e.this;
        paramAnonymousBaseMediaPlayer.nqN += 1;
        e.this.rp(paramAnonymousInt2);
        if (e.this.eAL.equalsIgnoreCase(this.nqS.eAL))
        {
          e.this.ahO();
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19522505408512L, 145454);
              Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dKt), 0).show();
              GMTrace.o(19522505408512L, 145454);
            }
          });
        }
        e.this.ro(paramAnonymousInt2);
        if (e.this.nqK != null)
        {
          e.this.nqK.isStop = true;
          e.this.nqK = null;
        }
        if ((paramAnonymousInt1 == 91) && (paramAnonymousInt2 == 55))
        {
          w.i("MicroMsg.QQAudioPlayer", "unknow format ,delete file");
          com.tencent.mm.plugin.music.a.b.d.vd(e.this.nqM);
        }
        GMTrace.o(19525995069440L, 145480);
      }
      
      public final void onPrepared(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19526129287168L, 145481);
        w.i("MicroMsg.QQAudioPlayer", "onPrepared");
        GMTrace.o(19526129287168L, 145481);
      }
      
      public final void onSeekComplete(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19525860851712L, 145479);
        w.i("MicroMsg.QQAudioPlayer", "onSeekComplete");
        if (e.this.grQ != 0)
        {
          w.i("MicroMsg.QQAudioPlayer", "seek complete to startTime :%d", new Object[] { Integer.valueOf(e.this.grQ) });
          e.this.grQ = 0;
          aTa();
          GMTrace.o(19525860851712L, 145479);
          return;
        }
        w.i("MicroMsg.QQAudioPlayer", "_onSeekComplete");
        paramAnonymousBaseMediaPlayer = e.this;
        w.i("MicroMsg.BaseMusicPlayer", "onSeekToEvent");
        u localu = new u();
        localu.eAQ.action = 6;
        localu.eAQ.state = "seeked";
        localu.eAQ.eAL = paramAnonymousBaseMediaPlayer.aSL();
        com.tencent.mm.sdk.b.a.vgX.a(localu, Looper.getMainLooper());
        if (e.this.JQ())
        {
          w.i("MicroMsg.QQAudioPlayer", "seek end, send play event!");
          e.this.aSO();
        }
        GMTrace.o(19525860851712L, 145479);
      }
      
      public final void onStarted(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19526397722624L, 145483);
        w.i("MicroMsg.QQAudioPlayer", "onStarted");
        GMTrace.o(19526397722624L, 145483);
      }
      
      public final void onStateChanged(int paramAnonymousInt)
      {
        GMTrace.i(19526263504896L, 145482);
        w.i("MicroMsg.QQAudioPlayer", "onStateChanged state %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject;
        if (paramAnonymousInt == 3)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged PREPARING!");
          w.i("MicroMsg.QQAudioPlayer", "_onPreparing");
          this.nqS = e.this.eAN;
          if (this.nqS == null)
          {
            w.e("MicroMsg.QQAudioPlayer", "cbMusic is null");
            GMTrace.o(19526263504896L, 145482);
            return;
          }
          if (e.this.grW)
          {
            w.i("MicroMsg.QQAudioPlayer", "isPausedOnBackground is true, do stop player and not send event");
            GMTrace.o(19526263504896L, 145482);
            return;
          }
          localObject = e.this;
          w.i("MicroMsg.BaseMusicPlayer", "onPreparintEvent %b", new Object[] { Boolean.valueOf(((d)localObject).JQ()) });
          u localu = new u();
          localu.eAQ.action = 9;
          localu.eAQ.state = "waiting";
          localu.eAQ.eAL = ((d)localObject).aSL();
          com.tencent.mm.sdk.b.a.vgX.a(localu, Looper.getMainLooper());
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 2)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged PREPARED!");
          aTa();
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 4)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged STARTED! audioId:%s", new Object[] { e.this.eAL });
          w.i("MicroMsg.QQAudioPlayer", "_onStart");
          this.nqS = e.this.eAN;
          if (e.this.grW)
          {
            w.i("MicroMsg.QQAudioPlayer", "isPausedOnBackground is true, do stop player and not send event");
            if ((e.this.nqH != null) && (e.this.nqJ)) {
              e.this.nqH.stop();
            }
            GMTrace.o(19526263504896L, 145482);
            return;
          }
          e.this.aSN();
          if (e.this.nqK != null) {
            e.this.nqK.isStop = true;
          }
          e.this.nqK = new e.a(e.this);
          localObject = e.this.nqK;
          ((e.a)localObject).isStop = false;
          com.tencent.mm.sdk.f.e.post((Runnable)localObject, "audio_play_progress_runnable");
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 5)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged PAUSED!");
          w.i("MicroMsg.QQAudioPlayer", "_onPause");
          e.this.aSP();
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 6)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged STOPPED! audioId:%s", new Object[] { e.this.eAL });
          w.i("MicroMsg.QQAudioPlayer", "_onStop");
          if (this.nqS == null)
          {
            w.e("MicroMsg.QQAudioPlayer", "currentMusic is null");
            GMTrace.o(19526263504896L, 145482);
            return;
          }
          if (e.this.eAL.equalsIgnoreCase(this.nqS.eAL))
          {
            if (e.this.grW)
            {
              w.i("MicroMsg.QQAudioPlayer", "stop play, but send pause state event");
              e.this.aSP();
              GMTrace.o(19526263504896L, 145482);
              return;
            }
            e.this.aSQ();
          }
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 7)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged PLAYBACKCOMPLETED!");
          w.i("MicroMsg.QQAudioPlayer", "_onCompletion");
          e.this.nqJ = false;
          e.this.aSR();
          if (e.this.nqK != null)
          {
            e.this.nqK.isStop = true;
            e.this.nqK = null;
          }
          if (e.this.eAN.grS)
          {
            e.this.grQ = 0;
            e.this.nqO = true;
            e.this.aST();
          }
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 8)
        {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged END!");
          w.i("MicroMsg.QQAudioPlayer", "_onEnd");
          GMTrace.o(19526263504896L, 145482);
          return;
        }
        if (paramAnonymousInt == 9) {
          w.i("MicroMsg.QQAudioPlayer", "onStateChanged ERROR!");
        }
        GMTrace.o(19526263504896L, 145482);
      }
    };
    this.eAL = com.tencent.mm.ab.b.Dg();
    c.aSG();
    this.nqD = new ap();
    this.nqD.eA(ab.getContext());
    this.nqD.a(new d.1(this));
    w.i("MicroMsg.QQAudioPlayer", "create QQAudioPlayer instance, audioId:%s", new Object[] { this.eAL });
    GMTrace.o(19517539352576L, 145417);
  }
  
  public final void DD(String paramString)
  {
    GMTrace.i(19517673570304L, 145418);
    w.i("MicroMsg.QQAudioPlayer", "setAudioId:%s", new Object[] { paramString });
    this.eAL = paramString;
    GMTrace.o(19517673570304L, 145418);
  }
  
  public final boolean JQ()
  {
    GMTrace.i(19518478876672L, 145424);
    if (this.nqH != null)
    {
      if (this.nqH.getPlayerState() == 4)
      {
        GMTrace.o(19518478876672L, 145424);
        return true;
      }
      GMTrace.o(19518478876672L, 145424);
      return false;
    }
    GMTrace.o(19518478876672L, 145424);
    return false;
  }
  
  public final boolean JR()
  {
    GMTrace.i(19518881529856L, 145427);
    if ((this.nqJ) && (!aSV()))
    {
      GMTrace.o(19518881529856L, 145427);
      return true;
    }
    GMTrace.o(19518881529856L, 145427);
    return false;
  }
  
  public final void a(com.tencent.mm.ab.a parama)
  {
    GMTrace.i(19517807788032L, 145419);
    if (parama == null)
    {
      w.i("MicroMsg.QQAudioPlayer", "startPlay fail, play param is null");
      aSS();
      GMTrace.o(19517807788032L, 145419);
      return;
    }
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.nqP;
    if (this.eAN != null)
    {
      com.tencent.mm.ab.a locala = this.eAN;
      if ((parama != null) && (locala.eAL != null) && (locala.eAL.equalsIgnoreCase(parama.eAL)) && (locala.grP != null) && (locala.grP.equalsIgnoreCase(parama.grP))) {}
      for (int i = 1; (i != 0) && (l2 <= 100L); i = 0)
      {
        this.eAN = parama;
        this.grQ = parama.grQ;
        this.nqO = parama.grR;
        w.e("MicroMsg.QQAudioPlayer", "startPlay, is playing for audio src:%s, don't play again in 3 second, interval:%d", new Object[] { this.nqM, Long.valueOf(l2) });
        GMTrace.o(19517807788032L, 145419);
        return;
      }
    }
    f.rl(parama.fromScene);
    this.nqP = l1;
    this.eAN = parama;
    w.i("MicroMsg.QQAudioPlayer", "startPlay, currentTime:%d, fromScene:%d", new Object[] { Long.valueOf(l1), Integer.valueOf(this.eAN.fromScene) });
    if ((this.nqH != null) && (JQ())) {
      this.nqH.stop();
    }
    this.nqN = 0;
    this.grQ = parama.grQ;
    this.nqO = parama.grR;
    this.audioType = null;
    this.nqQ = false;
    this.grW = false;
    aST();
    GMTrace.o(19517807788032L, 145419);
  }
  
  public final boolean aSJ()
  {
    GMTrace.i(19520357924864L, 145438);
    GMTrace.o(19520357924864L, 145438);
    return true;
  }
  
  public final String aSL()
  {
    GMTrace.i(19519821053952L, 145434);
    String str = this.eAL;
    GMTrace.o(19519821053952L, 145434);
    return str;
  }
  
  public final void aST()
  {
    int k = 1;
    GMTrace.i(19517942005760L, 145420);
    w.i("MicroMsg.QQAudioPlayer", "initPlayer");
    if ((!TextUtils.isEmpty(this.eAN.filePath)) && (this.eAN.grU == null))
    {
      w.i("MicroMsg.QQAudioPlayer", "play with local file, filePath:%s", new Object[] { this.eAN.filePath });
      if (this.nqH == null) {
        this.nqH = new CommonPlayer(this.nqR);
      }
      this.nqH.reset();
      try
      {
        this.nqH.setDataSource(this.eAN.filePath);
        this.nqH.prepare();
        GMTrace.o(19517942005760L, 145420);
        return;
      }
      catch (Exception localException1)
      {
        w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException1, "initPlayer exception", new Object[0]);
        ro(501);
        rp(501);
        GMTrace.o(19517942005760L, 145420);
        return;
      }
    }
    if ((!TextUtils.isEmpty(this.eAN.filePath)) && (this.eAN.grU != null))
    {
      w.i("MicroMsg.QQAudioPlayer", "play with inputStream, filePath:%s", new Object[] { this.eAN.filePath });
      if (this.nqH == null) {
        this.nqH = new CommonPlayer(this.nqR);
      }
      this.nqH.reset();
      com.tencent.mm.plugin.music.a.e.b localb = new com.tencent.mm.plugin.music.a.e.b(this.eAN.grU);
      try
      {
        this.nqH.setDataSource(localb);
        this.nqH.prepare();
        GMTrace.o(19517942005760L, 145420);
        return;
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.QQAudioPlayer", "initPlayer exception:" + localException2.getMessage());
        w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException2, "initPlayer", new Object[0]);
        ro(501);
        rp(501);
        GMTrace.o(19517942005760L, 145420);
        return;
      }
    }
    w.i("MicroMsg.QQAudioPlayer", "play with src url :%s", new Object[] { this.eAN.grP });
    boolean bool = am.isWifi(ab.getContext());
    Object localObject1 = new PBool();
    this.nqM = com.tencent.mm.plugin.music.a.g.a(this.eAN.grP, this.eAN.grP, true, (PBool)localObject1);
    int i;
    if (bool) {
      i = 1;
    }
    for (;;)
    {
      int j;
      if (((PBool)localObject1).value)
      {
        j = 1;
        label419:
        w.i("MicroMsg.QQAudioPlayer", "isWifi:%d, isQQMusic:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (!bool) {
          break label598;
        }
        bool = ((PBool)localObject1).value;
        label457:
        if (com.tencent.mm.plugin.music.a.g.Dl(this.nqM))
        {
          w.i("MicroMsg.QQAudioPlayer", "can match shake music wifi url");
          bool = true;
        }
        w.i("MicroMsg.QQAudioPlayer", "mSrc:%s", new Object[] { this.nqM });
        if (!bool) {
          break label604;
        }
        i = k;
        w.i("MicroMsg.QQAudioPlayer", "isqqmusic:%d", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.plugin.music.a.b.d.DF(this.nqM);
        com.tencent.mm.plugin.music.a.b.d.aj(this.nqM, bool);
      }
      try
      {
        localObject1 = new URL(this.nqM);
        if (localObject1 == null)
        {
          w.e("MicroMsg.QQAudioPlayer", "initPlayer url is null");
          ro(500);
          rp(500);
          GMTrace.o(19517942005760L, 145420);
          return;
          i = 0;
          continue;
          j = 0;
          break label419;
          label598:
          bool = false;
          break label457;
          label604:
          i = 0;
        }
      }
      catch (Exception localException3)
      {
        Object localObject2;
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException3, "initPlayer", new Object[0]);
          localObject2 = null;
        }
        if (this.nqH == null) {
          this.nqH = new CommonPlayer(this.nqR);
        }
        this.nqH.reset();
        if (this.nqL == null) {
          this.nqL = new com.tencent.mm.plugin.music.a.e.d();
        }
        try
        {
          this.nqH.setDataSource(this.nqL, Uri.parse(((URL)localObject2).toString()));
          this.nqH.prepare();
          GMTrace.o(19517942005760L, 145420);
          return;
        }
        catch (Exception localException4)
        {
          w.e("MicroMsg.QQAudioPlayer", "initPlayer exception:" + localException4.getMessage());
          w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException4, "initPlayer", new Object[0]);
          ro(501);
          rp(501);
          GMTrace.o(19517942005760L, 145420);
        }
      }
    }
  }
  
  public final void aSU()
  {
    GMTrace.i(19518210441216L, 145422);
    w.i("MicroMsg.QQAudioPlayer", "pauseAndAbandonFocus");
    pause();
    GMTrace.o(19518210441216L, 145422);
  }
  
  public final boolean aSV()
  {
    GMTrace.i(19518613094400L, 145425);
    if (this.nqH != null)
    {
      if (this.nqH.getPlayerState() == 3)
      {
        GMTrace.o(19518613094400L, 145425);
        return true;
      }
      GMTrace.o(19518613094400L, 145425);
      return false;
    }
    GMTrace.o(19518613094400L, 145425);
    return false;
  }
  
  final void aSW()
  {
    GMTrace.i(19519149965312L, 145429);
    try
    {
      if (this.nqH != null) {
        this.nqH.stop();
      }
      if (this.nqK != null)
      {
        this.nqK.isStop = true;
        this.nqK = null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException, "stopPlay", new Object[0]);
        ro(504);
        rp(504);
      }
    }
    this.nqJ = false;
    GMTrace.o(19519149965312L, 145429);
  }
  
  public final int aSX()
  {
    GMTrace.i(19519284183040L, 145430);
    if (this.nqH != null)
    {
      int i = (int)this.nqH.getCurrentPosition();
      GMTrace.o(19519284183040L, 145430);
      return i;
    }
    GMTrace.o(19519284183040L, 145430);
    return -1;
  }
  
  public final com.tencent.mm.ab.c aSY()
  {
    boolean bool1 = false;
    GMTrace.i(19519686836224L, 145433);
    if (this.nqI == null) {
      this.nqI = new com.tencent.mm.ab.c();
    }
    int k = getDuration();
    int m = aSX();
    boolean bool2 = JQ();
    if (this.nqH != null) {}
    for (int j = this.nqH.getBufferedPercentage();; j = 0)
    {
      int i;
      if (j >= 0)
      {
        i = j;
        if (j <= 100) {}
      }
      else
      {
        i = 0;
      }
      j = i;
      if (i < 0) {
        j = 0;
      }
      this.nqI.eAM = m;
      this.nqI.duration = k;
      com.tencent.mm.ab.c localc = this.nqI;
      if (bool2) {}
      for (;;)
      {
        localc.grV = bool1;
        this.nqI.grW = this.grW;
        this.nqI.grX = (j * k / 100);
        if (this.eAN == null) {
          break;
        }
        this.nqI.grQ = this.eAN.grQ;
        this.nqI.grY = this.eAN.grP;
        localc = this.nqI;
        GMTrace.o(19519686836224L, 145433);
        return localc;
        bool1 = true;
      }
      GMTrace.o(19519686836224L, 145433);
      return null;
    }
  }
  
  public final void aSZ()
  {
    GMTrace.i(19520223707136L, 145437);
    if ((this.eAL.equalsIgnoreCase(this.eAN.eAL)) && (this.nqH != null) && (JQ()))
    {
      int i = (int)this.nqH.getCurrentPosition();
      int j = this.nqH.getDuration();
      if ((i > 0) && (j > 0) && (this.nqF != null)) {
        this.nqF.bP(i, j);
      }
    }
    GMTrace.o(19520223707136L, 145437);
  }
  
  public final void ahO()
  {
    GMTrace.i(19519015747584L, 145428);
    w.i("MicroMsg.QQAudioPlayer", "stopPlay");
    this.grW = false;
    aSW();
    GMTrace.o(19519015747584L, 145428);
  }
  
  public final boolean gG(int paramInt)
  {
    GMTrace.i(19519552618496L, 145432);
    int i = getDuration();
    w.i("MicroMsg.QQAudioPlayer", "seekToMusic pos:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if (i < 0)
    {
      w.e("MicroMsg.QQAudioPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      ahO();
      GMTrace.o(19519552618496L, 145432);
      return false;
    }
    if (paramInt > i)
    {
      w.e("MicroMsg.QQAudioPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      GMTrace.o(19519552618496L, 145432);
      return false;
    }
    if (this.nqH != null)
    {
      w.i("MicroMsg.BaseMusicPlayer", "onSeekingEvent");
      u localu = new u();
      localu.eAQ.action = 10;
      localu.eAQ.state = "seeking";
      localu.eAQ.eAL = aSL();
      com.tencent.mm.sdk.b.a.vgX.a(localu, Looper.getMainLooper());
      this.nqH.seekTo(paramInt);
    }
    GMTrace.o(19519552618496L, 145432);
    return true;
  }
  
  public final int getDuration()
  {
    GMTrace.i(19519418400768L, 145431);
    if (this.nqH != null)
    {
      int i = this.nqH.getDuration();
      GMTrace.o(19519418400768L, 145431);
      return i;
    }
    GMTrace.o(19519418400768L, 145431);
    return -1;
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(20499476250624L, 152733);
    if (this.nqH != null)
    {
      if (this.nqH.getPlayerState() == 5)
      {
        GMTrace.o(20499476250624L, 152733);
        return true;
      }
      GMTrace.o(20499476250624L, 152733);
      return false;
    }
    GMTrace.o(20499476250624L, 152733);
    return false;
  }
  
  public final boolean isPrepared()
  {
    GMTrace.i(19518747312128L, 145426);
    if (this.nqH != null)
    {
      if (this.nqH.getPlayerState() == 2)
      {
        GMTrace.o(19518747312128L, 145426);
        return true;
      }
      GMTrace.o(19518747312128L, 145426);
      return false;
    }
    GMTrace.o(19518747312128L, 145426);
    return false;
  }
  
  public final void pause()
  {
    GMTrace.i(19518076223488L, 145421);
    w.i("MicroMsg.QQAudioPlayer", "pause");
    if ((this.nqH != null) && (JQ())) {
      try
      {
        w.i("MicroMsg.QQAudioPlayer", "pause success");
        this.nqH.pause();
        GMTrace.o(19518076223488L, 145421);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException, "pause", new Object[0]);
        ro(503);
        rp(503);
      }
    }
    GMTrace.o(19518076223488L, 145421);
  }
  
  public final void release()
  {
    GMTrace.i(19520089489408L, 145436);
    w.i("MicroMsg.QQAudioPlayer", "release");
    this.nqz = null;
    if (this.nqH != null)
    {
      this.nqH.release();
      this.nqH = null;
    }
    if (this.nqD != null)
    {
      this.nqD.end();
      this.nqD.bQu();
    }
    GMTrace.o(19520089489408L, 145436);
  }
  
  public final void resume()
  {
    GMTrace.i(19518344658944L, 145423);
    this.nqN = 0;
    boolean bool1 = aSV();
    boolean bool2 = JQ();
    w.i("MicroMsg.QQAudioPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, isStartPlaying:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(this.nqJ) });
    if ((this.nqH != null) && (!isPrepared()) && (!bool1) && (!bool2) && (!this.nqJ))
    {
      w.i("MicroMsg.QQAudioPlayer", "audio play is complete, need initPlayer again");
      this.grQ = 0;
      this.nqO = true;
      this.nqN = 0;
      this.grW = false;
      this.nqN = 0;
      aST();
      f.rl(this.eAN.fromScene);
      GMTrace.o(19518344658944L, 145423);
      return;
    }
    if ((this.nqH != null) && ((isPaused()) || (isPrepared())) && (!bool2)) {
      w.i("MicroMsg.QQAudioPlayer", "audio play is paused, need start to play");
    }
    try
    {
      this.nqH.start();
      this.nqJ = true;
      GMTrace.o(19518344658944L, 145423);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QQAudioPlayer", localException, "resume", new Object[0]);
        ro(502);
        rp(502);
      }
    }
  }
  
  public final void rp(int paramInt)
  {
    GMTrace.i(19519955271680L, 145435);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(688);
    localIDKey1.SetKey(1);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(688);
    int i = this.eAN.fromScene;
    w.i("MicroMsg.PlayerErrorHandler", "getQQAudioPlayerErrSceneIdKey, scene:" + i);
    switch (i)
    {
    }
    localIDKey2.SetKey(9);
    localIDKey2.SetValue(1L);
    IDKey localIDKey3 = new IDKey();
    localIDKey3.SetID(688);
    w.i("MicroMsg.PlayerErrorHandler", "getQQAudioPlayerErrIdKey, errCode:" + paramInt);
    switch (paramInt)
    {
    default: 
      paramInt = 30;
    }
    for (;;)
    {
      localIDKey3.SetKey(paramInt);
      localIDKey3.SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey3);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      GMTrace.o(19519955271680L, 145435);
      return;
      paramInt = 17;
      continue;
      paramInt = 18;
      continue;
      paramInt = 19;
      continue;
      paramInt = 20;
      continue;
      paramInt = 21;
      continue;
      paramInt = 22;
      continue;
      paramInt = 23;
      continue;
      paramInt = 24;
      continue;
      paramInt = 25;
      continue;
      paramInt = 36;
      continue;
      paramInt = 26;
      continue;
      paramInt = 27;
      continue;
      paramInt = 28;
      continue;
      paramInt = 29;
      continue;
      paramInt = 31;
      continue;
      paramInt = 32;
      continue;
      paramInt = 33;
      continue;
      paramInt = 34;
      continue;
      paramInt = 35;
    }
  }
  
  private final class a
    implements Runnable
  {
    boolean isStop;
    
    public a()
    {
      GMTrace.i(19517270917120L, 145415);
      this.isStop = true;
      GMTrace.o(19517270917120L, 145415);
    }
    
    public final void run()
    {
      GMTrace.i(19517405134848L, 145416);
      w.i("MicroMsg.QQAudioPlayer", "start run play progress task");
      for (;;)
      {
        if (!this.isStop) {
          try
          {
            if ((e.this.nqH != null) && (e.this.JQ())) {
              e.this.aSZ();
            }
            try
            {
              Thread.sleep(200L);
            }
            catch (InterruptedException localInterruptedException) {}
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.QQAudioPlayer", "PlayProgressTask run exception:" + localException.getMessage());
            }
          }
        }
      }
      GMTrace.o(19517405134848L, 145416);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */