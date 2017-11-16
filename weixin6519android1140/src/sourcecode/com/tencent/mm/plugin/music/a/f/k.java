package com.tencent.mm.plugin.music.a.f;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.plugin.music.a.f;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import java.net.URL;
import java.util.ArrayList;

public final class k
  extends a
{
  public AudioFormat.AudioType audioType;
  protected com.tencent.mm.at.a eNq;
  public int grQ;
  public CommonPlayer nqH;
  public boolean nqJ;
  private IMediaHTTPService nqL;
  public String nqM;
  public int nqN;
  private long nqP;
  private boolean nqQ;
  private PlayerListenerCallback nqR;
  private boolean nrM;
  public boolean nrZ;
  private com.tencent.mm.at.d nsh;
  public a nsi;
  
  public k()
  {
    GMTrace.i(15013460836352L, 111859);
    this.nqM = "";
    this.nqN = 0;
    this.grQ = 0;
    this.nqP = 0L;
    this.audioType = AudioFormat.AudioType.UNSUPPORT;
    this.nqQ = false;
    this.nrZ = false;
    this.nqR = new PlayerListenerCallback()
    {
      com.tencent.mm.at.a nsj;
      
      private void aTa()
      {
        GMTrace.i(19527739899904L, 145493);
        w.i("MicroMsg.QQMusicPlayer", "_onPrepared");
        if (k.this.grQ != 0)
        {
          w.i("MicroMsg.QQMusicPlayer", "seek to startTime:%d", new Object[] { Integer.valueOf(k.this.grQ) });
          k.this.gG(k.this.grQ);
          GMTrace.o(19527739899904L, 145493);
          return;
        }
        w.i("MicroMsg.QQMusicPlayer", "start to play");
        if (com.tencent.mm.plugin.music.a.h.aSv().requestFocus()) {
          try
          {
            if (k.this.nqH != null)
            {
              k.this.nqH.start();
              if ((k.this.nqH.getCurrentAudioInformation() != null) && (k.this.nqH.getCurrentAudioInformation().getAudioType() != null))
              {
                w.i("MicroMsg.QQMusicPlayer", "getAudioType:%d", new Object[] { Integer.valueOf(k.this.nqH.getCurrentAudioInformation().getAudioType().getValue()) });
                k.this.audioType = k.this.nqH.getCurrentAudioInformation().getAudioType();
                k.this.aTq();
              }
            }
            k.this.nqJ = true;
            if (this.nsj == null)
            {
              w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
              GMTrace.o(19527739899904L, 145493);
              return;
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.QQMusicPlayer", localException, "_onPrepared", new Object[0]);
              k.this.a(k.this.eNq.JN(), 502);
              k.this.b(k.this.eNq, 502);
            }
            apv localapv = this.nsj.JN();
            k localk = k.this;
            w.i("MicroMsg.BaseMusicPlayer", "onPrepareEvent %b", new Object[] { Boolean.valueOf(localk.JQ()) });
            jn localjn = new jn();
            localjn.eNp.action = 9;
            localjn.eNp.eNl = localapv;
            localjn.eNp.state = "canplay";
            localjn.eNp.duration = localk.getDuration();
            localjn.eNp.eNr = localk.aSJ();
            com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
            GMTrace.o(19527739899904L, 145493);
            return;
          }
        }
        w.e("MicroMsg.QQMusicPlayer", "request focus error");
        GMTrace.o(19527739899904L, 145493);
      }
      
      public final void onBufferingUpdate(BaseMediaPlayer paramAnonymousBaseMediaPlayer, int paramAnonymousInt)
      {
        GMTrace.i(19526800375808L, 145486);
        GMTrace.o(19526800375808L, 145486);
      }
      
      public final void onCompletion(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19526934593536L, 145487);
        w.i("MicroMsg.QQMusicPlayer", "onCompletion");
        GMTrace.o(19526934593536L, 145487);
      }
      
      public final void onError(BaseMediaPlayer paramAnonymousBaseMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19527203028992L, 145489);
        w.e("MicroMsg.QQMusicPlayer", "onError what:%d, extra:%d, errCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3) });
        paramAnonymousBaseMediaPlayer = com.tencent.mm.plugin.music.a.h.aSs().aSi();
        if (paramAnonymousBaseMediaPlayer == null)
        {
          w.e("MicroMsg.QQMusicPlayer", "onError, currentMusic is null");
          GMTrace.o(19527203028992L, 145489);
          return;
        }
        this.nsj = k.this.eNq;
        if (this.nsj == null)
        {
          w.e("MicroMsg.QQMusicPlayer", "onError, cbMusic is null");
          GMTrace.o(19527203028992L, 145489);
          return;
        }
        boolean bool = am.isNetworkConnected(ab.getContext());
        if ((paramAnonymousInt2 == 80) && (bool)) {
          w.e("MicroMsg.QQMusicPlayer", "connect success, but download is fail!");
        }
        if (k.this.nqN > 0)
        {
          w.e("MicroMsg.QQMusicPlayer", "errorCount %d", new Object[] { Integer.valueOf(k.this.nqN) });
          GMTrace.o(19527203028992L, 145489);
          return;
        }
        Object localObject = k.this;
        ((k)localObject).nqN += 1;
        k.this.b(this.nsj, paramAnonymousInt2);
        localObject = this.nsj.JN();
        if (paramAnonymousBaseMediaPlayer.a(this.nsj))
        {
          k.this.ahO();
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19531766431744L, 145523);
              Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dKt), 0).show();
              GMTrace.o(19531766431744L, 145523);
            }
          });
        }
        k.this.o((apv)localObject);
        k.this.a((apv)localObject, paramAnonymousInt2);
        if (k.this.nsi != null)
        {
          k.this.nsi.isStop = true;
          k.this.nsi = null;
        }
        if ((paramAnonymousInt1 == 91) && (paramAnonymousInt2 == 55))
        {
          w.i("MicroMsg.QQMusicPlayer", "unknow format ,delete file");
          com.tencent.mm.plugin.music.a.b.d.vd(k.this.nqM);
        }
        GMTrace.o(19527203028992L, 145489);
      }
      
      public final void onPrepared(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19527337246720L, 145490);
        w.i("MicroMsg.QQMusicPlayer", "onPrepared");
        GMTrace.o(19527337246720L, 145490);
      }
      
      public final void onSeekComplete(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19527068811264L, 145488);
        w.i("MicroMsg.QQMusicPlayer", "onSeekComplete");
        if (k.this.grQ != 0)
        {
          w.i("MicroMsg.QQMusicPlayer", "seek complete to startTime :%d", new Object[] { Integer.valueOf(k.this.grQ) });
          k.this.grQ = 0;
          aTa();
          GMTrace.o(19527068811264L, 145488);
          return;
        }
        w.i("MicroMsg.QQMusicPlayer", "_onSeekComplete");
        if (this.nsj == null)
        {
          w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
          GMTrace.o(19527068811264L, 145488);
          return;
        }
        paramAnonymousBaseMediaPlayer = this.nsj.JN();
        k.this.p(paramAnonymousBaseMediaPlayer);
        if (k.this.JQ())
        {
          w.i("MicroMsg.QQMusicPlayer", "seek end, send play event!");
          k.this.m(paramAnonymousBaseMediaPlayer);
        }
        GMTrace.o(19527068811264L, 145488);
      }
      
      public final void onStarted(BaseMediaPlayer paramAnonymousBaseMediaPlayer)
      {
        GMTrace.i(19527605682176L, 145492);
        w.i("MicroMsg.QQMusicPlayer", "onStarted");
        GMTrace.o(19527605682176L, 145492);
      }
      
      public final void onStateChanged(int paramAnonymousInt)
      {
        GMTrace.i(19527471464448L, 145491);
        w.i("MicroMsg.QQMusicPlayer", "onStateChanged state %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject;
        if (paramAnonymousInt == 3)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged PREPARING!");
          w.i("MicroMsg.QQMusicPlayer", "_onPreparing");
          this.nsj = k.this.eNq;
          if (this.nsj == null)
          {
            w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
            GMTrace.o(19527471464448L, 145491);
            return;
          }
          localObject = this.nsj.JN();
          k localk = k.this;
          w.i("MicroMsg.BaseMusicPlayer", "onPreparintEvent %b", new Object[] { Boolean.valueOf(localk.JQ()) });
          jn localjn = new jn();
          localjn.eNp.action = 11;
          localjn.eNp.eNl = ((apv)localObject);
          localjn.eNp.state = "waiting";
          localjn.eNp.duration = localk.getDuration();
          localjn.eNp.eNr = localk.aSJ();
          com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 2)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged PREPARED!");
          aTa();
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 4)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged STARTED!");
          w.i("MicroMsg.QQMusicPlayer", "_onStart");
          this.nsj = k.this.eNq;
          if (this.nsj == null)
          {
            w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
            GMTrace.o(19527471464448L, 145491);
            return;
          }
          localObject = this.nsj.JN();
          k.this.l((apv)localObject);
          if (k.this.nsi != null) {
            k.this.nsi.isStop = true;
          }
          k.this.nsi = new k.a(k.this);
          localObject = k.this.nsi;
          ((k.a)localObject).isStop = false;
          com.tencent.mm.sdk.f.e.post((Runnable)localObject, "music_play_progress_runnable");
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 5)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged PAUSED!");
          w.i("MicroMsg.QQMusicPlayer", "_onPause");
          if (this.nsj == null)
          {
            w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
            GMTrace.o(19527471464448L, 145491);
            return;
          }
          localObject = this.nsj.JN();
          k.this.n((apv)localObject);
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 6)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged STOPPED!");
          w.i("MicroMsg.QQMusicPlayer", "_onStop");
          if (this.nsj == null)
          {
            w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
            GMTrace.o(19527471464448L, 145491);
            return;
          }
          if (com.tencent.mm.plugin.music.a.h.aSs().aSi() == null)
          {
            w.e("MicroMsg.QQMusicPlayer", "currentMusic is null");
            GMTrace.o(19527471464448L, 145491);
            return;
          }
          if (k.this.eNq.a(this.nsj))
          {
            localObject = k.this.eNq.JN();
            k.this.o((apv)localObject);
          }
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 7)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged PLAYBACKCOMPLETED!");
          w.i("MicroMsg.QQMusicPlayer", "_onCompletion");
          if (this.nsj == null)
          {
            w.e("MicroMsg.QQMusicPlayer", "cbMusic is null");
            GMTrace.o(19527471464448L, 145491);
            return;
          }
          k.this.nqJ = false;
          localObject = this.nsj.JN();
          k.this.q((apv)localObject);
          if (k.this.nsi != null)
          {
            k.this.nsi.isStop = true;
            k.this.nsi = null;
          }
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 8)
        {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged END!");
          w.i("MicroMsg.QQMusicPlayer", "_onEnd");
          GMTrace.o(19527471464448L, 145491);
          return;
        }
        if (paramAnonymousInt == 9) {
          w.i("MicroMsg.QQMusicPlayer", "onStateChanged ERROR!");
        }
        GMTrace.o(19527471464448L, 145491);
      }
    };
    aTf();
    com.tencent.mm.plugin.music.a.a.c.aSG();
    GMTrace.o(15013460836352L, 111859);
  }
  
  private boolean aSV()
  {
    GMTrace.i(15963185479680L, 118935);
    if (this.nqH != null)
    {
      if (this.nqH.getPlayerState() == 3)
      {
        GMTrace.o(15963185479680L, 118935);
        return true;
      }
      GMTrace.o(15963185479680L, 118935);
      return false;
    }
    GMTrace.o(15963185479680L, 118935);
    return false;
  }
  
  public final boolean JQ()
  {
    GMTrace.i(15014131924992L, 111864);
    if (this.nqH != null)
    {
      if (this.nqH.getPlayerState() == 4)
      {
        GMTrace.o(15014131924992L, 111864);
        return true;
      }
      GMTrace.o(15014131924992L, 111864);
      return false;
    }
    GMTrace.o(15014131924992L, 111864);
    return false;
  }
  
  public final boolean JR()
  {
    GMTrace.i(15014266142720L, 111865);
    if ((this.nqJ) && (!aSV()))
    {
      GMTrace.o(15014266142720L, 111865);
      return true;
    }
    GMTrace.o(15014266142720L, 111865);
    return false;
  }
  
  public final void aSH()
  {
    GMTrace.i(18371588390912L, 136879);
    this.nrZ = true;
    w.i("MicroMsg.QQMusicPlayer", "passivePause");
    if ((this.nqH != null) && (JQ())) {
      try
      {
        this.nqH.pause();
        GMTrace.o(18371588390912L, 136879);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.QQMusicPlayer", localException, "passivePause", new Object[0]);
        a(this.eNq.JN(), 503);
        b(this.eNq, 503);
      }
    }
    GMTrace.o(18371588390912L, 136879);
  }
  
  public final boolean aSI()
  {
    GMTrace.i(18371454173184L, 136878);
    if ((this.nqJ) && (this.nrZ))
    {
      GMTrace.o(18371454173184L, 136878);
      return true;
    }
    GMTrace.o(18371454173184L, 136878);
    return false;
  }
  
  public final boolean aSJ()
  {
    GMTrace.i(15015071449088L, 111871);
    GMTrace.o(15015071449088L, 111871);
    return true;
  }
  
  public final com.tencent.mm.at.d aSK()
  {
    int n = 0;
    int m = 0;
    GMTrace.i(15014803013632L, 111869);
    int i1 = getDuration();
    int k;
    boolean bool;
    if (this.nqH != null)
    {
      k = (int)this.nqH.getCurrentPosition();
      bool = JQ();
      if (this.nqH == null) {
        break label171;
      }
    }
    label171:
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
      com.tencent.mm.at.d locald;
      if (this.nsh != null)
      {
        locald = this.nsh;
        i = m;
        if (bool) {
          i = 1;
        }
        locald.g(i1, k, i, j);
      }
      for (;;)
      {
        this.nsh.eNr = true;
        locald = this.nsh;
        GMTrace.o(15014803013632L, 111869);
        return locald;
        k = -1;
        break;
        i = n;
        if (bool) {
          i = 1;
        }
        this.nsh = new com.tencent.mm.at.d(i1, k, i, j);
      }
    }
  }
  
  public final void aSU()
  {
    GMTrace.i(15013863489536L, 111862);
    w.i("MicroMsg.QQMusicPlayer", "pauseAndAbandonFocus");
    pause();
    com.tencent.mm.plugin.music.a.h.aSv().aSh();
    GMTrace.o(15013863489536L, 111862);
  }
  
  public final void aSZ()
  {
    GMTrace.i(15014937231360L, 111870);
    com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
    if (locala == null)
    {
      GMTrace.o(15014937231360L, 111870);
      return;
    }
    if ((locala.a(this.eNq)) && (this.nqH != null) && (JQ()))
    {
      int i = (int)this.nqH.getCurrentPosition();
      int j = this.nqH.getDuration();
      if ((i > 0) && (j > 0) && (this.nqF != null)) {
        this.nqF.bP(i, j);
      }
    }
    GMTrace.o(15014937231360L, 111870);
  }
  
  public final void aTq()
  {
    GMTrace.i(18371722608640L, 136880);
    if (this.audioType == null)
    {
      GMTrace.o(18371722608640L, 136880);
      return;
    }
    w.i("MicroMsg.QQMusicPlayer", "idKeyReportMusicMimeType audioType:%d, isStatMineType:%b", new Object[] { Integer.valueOf(this.audioType.getValue()), Boolean.valueOf(this.nqQ) });
    if (this.nqQ)
    {
      GMTrace.o(18371722608640L, 136880);
      return;
    }
    w.i("MicroMsg.QQMusicPlayer", "idKeyReportMusicMimeType OK");
    this.nqQ = true;
    Object localObject = new IDKey();
    ((IDKey)localObject).SetID(558);
    int i = this.audioType.getValue();
    if (i == 2) {
      i = 92;
    }
    for (;;)
    {
      ((IDKey)localObject).SetKey(i);
      ((IDKey)localObject).SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      localObject = com.tencent.mm.plugin.music.a.b.d.DH(this.nqM);
      w.i("MicroMsg.QQMusicPlayer", "mineTypeStr:%s", new Object[] { localObject });
      if ((this.eNq == null) || (TextUtils.isEmpty((CharSequence)localObject))) {
        break;
      }
      i = h.DN((String)localObject);
      com.tencent.mm.plugin.report.service.g.ork.i(14486, new Object[] { Integer.valueOf(1), Integer.valueOf(this.eNq.field_musicType), Integer.valueOf(i), localObject });
      GMTrace.o(18371722608640L, 136880);
      return;
      if (i == 3) {
        i = 93;
      } else if (i == 4) {
        i = 94;
      } else if (i == 5) {
        i = 95;
      } else if (i == 6) {
        i = 96;
      } else if (i == 7) {
        i = 97;
      } else if (i == 8) {
        i = 98;
      } else if (i == 9) {
        i = 99;
      } else {
        i = 100;
      }
    }
    w.e("MicroMsg.QQMusicPlayer", "music is null or mineTypeStr is empty");
    GMTrace.o(18371722608640L, 136880);
  }
  
  public final void ahO()
  {
    GMTrace.i(15014400360448L, 111866);
    w.i("MicroMsg.QQMusicPlayer", "stopPlay");
    try
    {
      if (this.nqH != null) {
        this.nqH.stop();
      }
      if (this.nsi != null)
      {
        this.nsi.isStop = true;
        this.nsi = null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QQMusicPlayer", localException, "stopPlay", new Object[0]);
        a(this.eNq.JN(), 504);
        b(this.eNq, 504);
      }
    }
    com.tencent.mm.plugin.music.a.h.aSv().aSh();
    this.nqJ = false;
    this.nrZ = false;
    GMTrace.o(15014400360448L, 111866);
  }
  
  public final void b(com.tencent.mm.at.a parama, int paramInt)
  {
    GMTrace.i(16025865158656L, 119402);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetKey(4);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    int i = parama.field_musicType;
    w.i("MicroMsg.PlayerErrorHandler", "getQQMusicPlayerErrIdKeyByMusicType, musicType:" + i);
    IDKey localIDKey3;
    IDKey localIDKey4;
    ArrayList localArrayList;
    label328:
    int j;
    int k;
    switch (i)
    {
    case 2: 
    case 3: 
    default: 
      i = 9;
      localIDKey2.SetKey(i);
      localIDKey2.SetValue(1L);
      localIDKey3 = new IDKey();
      localIDKey3.SetID(558);
      localIDKey3.SetKey(h.rE(paramInt));
      localIDKey3.SetValue(1L);
      localIDKey4 = new IDKey();
      localIDKey4.SetID(558);
      localIDKey4.SetValue(1L);
      localArrayList = new ArrayList();
      if (paramInt == 80)
      {
        i = parama.field_musicType;
        w.i("MicroMsg.PlayerErrorHandler", "getQQMusicPlayerNetworkErrIdKeyByMusicType, musicType:" + i);
        switch (i)
        {
        case 2: 
        case 3: 
        case 5: 
        default: 
          i = 188;
          localIDKey4.SetKey(i);
          localArrayList.add(localIDKey4);
          int m = 1;
          int n = com.tencent.mm.plugin.music.a.b.d.DJ(this.nqM);
          int i1 = com.tencent.mm.plugin.music.a.b.d.DK(this.nqM);
          i = i1;
          j = n;
          k = m;
          if (com.tencent.mm.plugin.music.a.b.d.DJ(this.nqM) == 403)
          {
            parama = new IDKey();
            parama.SetID(558);
            parama.SetValue(1L);
            parama.SetKey(h.rE(700));
            localArrayList.add(parama);
            k = m;
            j = n;
            i = i1;
          }
          break;
        }
      }
      break;
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(1), Integer.valueOf(this.eNq.field_musicType), Integer.valueOf(k), Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(i) });
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey3);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      GMTrace.o(16025865158656L, 119402);
      return;
      i = 49;
      break;
      i = 50;
      break;
      i = 51;
      break;
      i = 52;
      break;
      i = 53;
      break;
      i = 54;
      break;
      i = 55;
      break;
      i = 56;
      break;
      i = 7;
      break;
      i = 8;
      break;
      i = 167;
      break label328;
      i = 168;
      break label328;
      i = 169;
      break label328;
      i = 170;
      break label328;
      i = 171;
      break label328;
      i = 172;
      break label328;
      i = 173;
      break label328;
      i = 174;
      break label328;
      i = 175;
      break label328;
      if ((com.tencent.mm.plugin.music.a.b.d.DH(this.nqM) == null) || (!com.tencent.mm.plugin.music.a.b.d.DH(this.nqM).contains("text/html"))) {
        break label741;
      }
      parama = new IDKey();
      parama.SetID(558);
      parama.SetValue(1L);
      parama.SetKey(h.rE(701));
      localArrayList.add(parama);
      k = 0;
      i = 0;
      j = 701;
    }
    label741:
    if (paramInt != 70) {
      switch (paramInt)
      {
      default: 
        i = 0;
        label802:
        IDKey localIDKey5;
        if (i != 0)
        {
          localIDKey5 = new IDKey();
          localIDKey5.SetID(558);
          localIDKey5.SetValue(1L);
          i = parama.field_musicType;
          w.i("MicroMsg.PlayerErrorHandler", "getQQMusicPlayerDecodeErrIdKeyByMusicType, musicType:" + i);
        }
        switch (i)
        {
        case 2: 
        case 3: 
        case 5: 
        default: 
          i = 188;
          label924:
          localIDKey5.SetKey(i);
          localArrayList.add(localIDKey5);
          i = parama.field_musicType;
          w.i("MicroMsg.PlayerErrorHandler", "getQQMusicPlayerPlayErrIdKeyByMusicType, musicType:" + i);
          switch (i)
          {
          case 2: 
          case 3: 
          case 5: 
          default: 
            i = 188;
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      localIDKey4.SetKey(i);
      localArrayList.add(localIDKey4);
      i = 0;
      j = 0;
      k = 0;
      break;
      i = 1;
      break label802;
      i = 202;
      break label924;
      i = 203;
      break label924;
      i = 204;
      break label924;
      i = 205;
      break label924;
      i = 206;
      break label924;
      i = 207;
      break label924;
      i = 208;
      break label924;
      i = 209;
      break label924;
      i = 210;
      break label924;
      i = 178;
      continue;
      i = 179;
      continue;
      i = 180;
      continue;
      i = 181;
      continue;
      i = 182;
      continue;
      i = 183;
      continue;
      i = 184;
      continue;
      i = 185;
      continue;
      i = 186;
    }
  }
  
  public final void e(com.tencent.mm.at.a parama)
  {
    int k = 1;
    GMTrace.i(15013595054080L, 111860);
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.nqP;
    if ((this.eNq != null) && (this.eNq.a(parama)) && (l2 <= 3000L))
    {
      this.eNq = parama;
      w.e("MicroMsg.QQMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", new Object[] { this.nqM, Long.valueOf(l2) });
      GMTrace.o(15013595054080L, 111860);
      return;
    }
    f.a(parama, false);
    this.nqP = l1;
    this.eNq = parama;
    w.i("MicroMsg.QQMusicPlayer", "startPlay, currentTime:%d", new Object[] { Long.valueOf(l1) });
    if ((this.nqH != null) && (JQ())) {
      this.nqH.stop();
    }
    this.nqN = 0;
    this.grQ = parama.field_startTime;
    this.audioType = null;
    this.nqQ = false;
    w.i("MicroMsg.QQMusicPlayer", "initPlayer");
    boolean bool = am.isWifi(ab.getContext());
    PBool localPBool = new PBool();
    if (bg.nm(this.eNq.field_songWifiUrl)) {
      parama = this.eNq.field_songWebUrl;
    }
    for (;;)
    {
      this.nqM = com.tencent.mm.plugin.music.a.g.a(parama, this.eNq.field_songWapLinkUrl, true, localPBool);
      int i;
      label246:
      int j;
      if (bool)
      {
        i = 1;
        if (!localPBool.value) {
          break label497;
        }
        j = 1;
        label256:
        w.i("MicroMsg.QQMusicPlayer", "isWifi:%d, isQQMusic:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (!bool) {
          break label502;
        }
        bool = localPBool.value;
        label294:
        if (com.tencent.mm.plugin.music.a.g.Dl(this.nqM))
        {
          w.i("MicroMsg.QQMusicPlayer", "can match shake music wifi url");
          bool = true;
        }
        w.i("MicroMsg.QQMusicPlayer", "mSrc:%s", new Object[] { this.nqM });
        w.i("MicroMsg.QQMusicPlayer", "field_songWifiUrl:%s", new Object[] { this.eNq.field_songWifiUrl });
        if (!bool) {
          break label508;
        }
        i = k;
        w.i("MicroMsg.QQMusicPlayer", "isqqmusic:%d", new Object[] { Integer.valueOf(i) });
        if (this.nqM != null)
        {
          com.tencent.mm.plugin.music.a.b.d.DF(this.nqM);
          com.tencent.mm.plugin.music.a.b.d.aj(this.nqM, bool);
          com.tencent.mm.plugin.music.a.b.d.bu(this.nqM, 0);
          com.tencent.mm.plugin.music.a.b.d.bv(this.nqM, 0);
        }
      }
      try
      {
        parama = new URL(this.nqM);
        if (parama == null)
        {
          w.e("MicroMsg.QQMusicPlayer", "initPlayer url is null");
          a(this.eNq.JN(), 500);
          b(this.eNq, 500);
          GMTrace.o(15013595054080L, 111860);
          return;
          parama = this.eNq.field_songWifiUrl;
          continue;
          i = 0;
          break label246;
          label497:
          j = 0;
          break label256;
          label502:
          bool = false;
          break label294;
          label508:
          i = 0;
        }
      }
      catch (Exception parama)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.QQMusicPlayer", parama, "initPlayer", new Object[0]);
          w.e("MicroMsg.QQMusicPlayer", "new URL exception:" + parama.getMessage());
          parama = null;
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
          this.nqH.setDataSource(this.nqL, Uri.parse(parama.toString()));
          this.nqH.prepare();
          GMTrace.o(15013595054080L, 111860);
          return;
        }
        catch (Exception parama)
        {
          w.e("MicroMsg.QQMusicPlayer", "initPlayer exception:" + parama.getMessage());
          w.printErrStackTrace("MicroMsg.QQMusicPlayer", parama, "initPlayer", new Object[0]);
          a(this.eNq.JN(), 501);
          b(this.eNq, 501);
          GMTrace.o(15013595054080L, 111860);
        }
      }
    }
  }
  
  public final boolean gG(int paramInt)
  {
    GMTrace.i(15014668795904L, 111868);
    int i = getDuration();
    w.i("MicroMsg.QQMusicPlayer", "seekToMusic pos:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((i < 0) || (paramInt > i))
    {
      w.e("MicroMsg.QQMusicPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      ahO();
      GMTrace.o(15014668795904L, 111868);
      return false;
    }
    if (this.nqH != null)
    {
      apv localapv = this.eNq.JN();
      w.i("MicroMsg.BaseMusicPlayer", "onSeekingEvent");
      jn localjn = new jn();
      localjn.eNp.action = 12;
      localjn.eNp.eNl = localapv;
      localjn.eNp.state = "seeking";
      localjn.eNp.duration = getDuration();
      localjn.eNp.eNr = aSJ();
      com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
      f.aSp();
      this.nqH.seekTo(paramInt);
    }
    GMTrace.o(15014668795904L, 111868);
    return true;
  }
  
  public final int getDuration()
  {
    GMTrace.i(15014534578176L, 111867);
    if (this.nqH != null)
    {
      int i = this.nqH.getDuration();
      GMTrace.o(15014534578176L, 111867);
      return i;
    }
    GMTrace.o(15014534578176L, 111867);
    return -1;
  }
  
  public final void pause()
  {
    GMTrace.i(15013729271808L, 111861);
    this.nrZ = false;
    w.i("MicroMsg.QQMusicPlayer", "pause");
    if ((this.nqH != null) && (JQ())) {
      try
      {
        this.nqH.pause();
        this.nrM = true;
        GMTrace.o(15013729271808L, 111861);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.QQMusicPlayer", localException, "pause", new Object[0]);
        a(this.eNq.JN(), 503);
        b(this.eNq, 503);
      }
    }
    GMTrace.o(15013729271808L, 111861);
  }
  
  public final void resume()
  {
    GMTrace.i(15013997707264L, 111863);
    this.nqN = 0;
    boolean bool1 = aSV();
    boolean bool2 = JQ();
    w.i("MicroMsg.QQMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((this.nqH == null) || (bool1) || (bool2) || (com.tencent.mm.plugin.music.a.h.aSv().requestFocus())) {}
    for (;;)
    {
      try
      {
        this.nqH.start();
        m(com.tencent.mm.plugin.music.a.h.aSs().aSj());
        this.nqJ = true;
        GMTrace.o(15013997707264L, 111863);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.QQMusicPlayer", localException, "resume", new Object[0]);
        a(this.eNq.JN(), 502);
        b(this.eNq, 502);
        continue;
      }
      w.e("MicroMsg.QQMusicPlayer", "request focus error");
    }
  }
  
  private final class a
    implements Runnable
  {
    boolean isStop;
    
    public a()
    {
      GMTrace.i(15017621585920L, 111890);
      this.isStop = true;
      GMTrace.o(15017621585920L, 111890);
    }
    
    public final void run()
    {
      GMTrace.i(15017755803648L, 111891);
      w.i("MicroMsg.QQMusicPlayer", "start run play progress task");
      for (;;)
      {
        if (!this.isStop) {
          try
          {
            if ((k.this.nqH != null) && (k.this.JQ())) {
              k.this.aSZ();
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
              w.e("MicroMsg.QQMusicPlayer", "PlayProgressTask run exception:" + localException.getMessage());
            }
          }
        }
      }
      GMTrace.o(15017755803648L, 111891);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */