package com.tencent.mm.plugin.music.a.f;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.music.a.c;
import com.tencent.mm.plugin.music.a.c.a.b;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class f
  extends a
{
  public boolean nqJ;
  public b nrK;
  public com.tencent.mm.plugin.music.a.c.a nrL;
  boolean nrM;
  private boolean nrN;
  private boolean nrO;
  private boolean nrP;
  private boolean nrQ;
  private boolean nrR;
  private boolean nrS;
  private boolean nrT;
  private boolean nrU;
  private boolean nrV;
  private int nrW;
  private com.tencent.mm.at.d nrX;
  public a.b nrY;
  public boolean nrZ;
  
  public f()
  {
    GMTrace.i(19528142553088L, 145496);
    this.nrN = false;
    this.nrO = false;
    this.nrP = false;
    this.nrQ = false;
    this.nrR = false;
    this.nrS = false;
    this.nrT = false;
    this.nrU = false;
    this.nrV = false;
    this.nrW = 0;
    this.nrY = new a.b()
    {
      public final void ry(final int paramAnonymousInt)
      {
        GMTrace.i(19528008335360L, 145495);
        Object localObject;
        if (paramAnonymousInt == 1)
        {
          if ((f.this.nrL != null) && (!f.this.nqJ) && (f.this.nrK != null))
          {
            localObject = com.tencent.mm.plugin.music.a.g.b(f.this.nrL.eNq, f.this.nrL.lcN);
            f.this.nrK.DM((String)localObject);
            localObject = f.this;
            if (com.tencent.mm.plugin.music.a.h.aSv().requestFocus())
            {
              w.i("MicroMsg.Music.MusicPlayer", "startPlay");
              try
              {
                if (((f)localObject).nrK != null) {
                  ((f)localObject).nrK.play();
                }
                ((f)localObject).nqJ = true;
                ((f)localObject).nrM = false;
                GMTrace.o(19528008335360L, 145495);
                return;
              }
              catch (Exception localException)
              {
                for (;;)
                {
                  w.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "startPlay", new Object[0]);
                }
              }
            }
            w.e("MicroMsg.Music.MusicPlayer", "request focus error");
            GMTrace.o(19528008335360L, 145495);
          }
        }
        else
        {
          if ((paramAnonymousInt == -2) || (paramAnonymousInt == 5) || (paramAnonymousInt == 19))
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19532303302656L, 145527);
                Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dKv), 0).show();
                com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
                f.this.a(locala, paramAnonymousInt);
                GMTrace.o(19532303302656L, 145527);
              }
            });
            GMTrace.o(19528008335360L, 145495);
            return;
          }
          if ((paramAnonymousInt == -1) || (paramAnonymousInt == 6) || (paramAnonymousInt == 4))
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19531497996288L, 145521);
                Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dKv), 1).show();
                GMTrace.o(19531497996288L, 145521);
              }
            });
            localObject = com.tencent.mm.plugin.music.a.h.aSs().aSi();
            f.this.a((com.tencent.mm.at.a)localObject, paramAnonymousInt);
          }
        }
        GMTrace.o(19528008335360L, 145495);
      }
    };
    this.nrZ = false;
    aTf();
    GMTrace.o(19528142553088L, 145496);
  }
  
  private int aTo()
  {
    GMTrace.i(19529887383552L, 145509);
    if (this.nrL != null)
    {
      com.tencent.mm.plugin.music.a.c.a locala = this.nrL;
      int i;
      if (locala.lcN)
      {
        w.v("MicroMsg.Music.MusicDownloadTask", "WifiFileLength: %d downloadLength: %d", new Object[] { Long.valueOf(locala.eNq.field_songWifiFileLength), Long.valueOf(locala.eNq.field_wifiDownloadedLength) });
        if (locala.eNq.field_songWifiFileLength != 0L) {
          i = (int)(locala.eNq.field_wifiDownloadedLength * 100L / locala.eNq.field_songWifiFileLength);
        }
      }
      while (i > 0)
      {
        GMTrace.o(19529887383552L, 145509);
        return i;
        i = 0;
        continue;
        w.v("MicroMsg.Music.MusicDownloadTask", "fileLength: %d downloadLength: %d", new Object[] { Long.valueOf(locala.eNq.field_songFileLength), Long.valueOf(locala.eNq.field_downloadedLength) });
        if (locala.eNq.field_songFileLength != 0L) {
          i = (int)(locala.eNq.field_downloadedLength * 100L / locala.eNq.field_songFileLength);
        } else {
          i = 0;
        }
      }
      GMTrace.o(19529887383552L, 145509);
      return 0;
    }
    GMTrace.o(19529887383552L, 145509);
    return 0;
  }
  
  private String getMimeType()
  {
    GMTrace.i(20365392740352L, 151734);
    String str1 = "";
    if (this.nrL != null) {
      str1 = this.nrL.mimeType;
    }
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
    {
      com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
      str2 = str1;
      if (locala != null) {
        str2 = locala.field_mimetype;
      }
    }
    GMTrace.o(20365392740352L, 151734);
    return str2;
  }
  
  public final boolean JQ()
  {
    GMTrace.i(19529350512640L, 145505);
    if (this.nrK != null) {
      try
      {
        boolean bool = this.nrK.isPlaying();
        GMTrace.o(19529350512640L, 145505);
        return bool;
      }
      catch (Throwable localThrowable)
      {
        GMTrace.o(19529350512640L, 145505);
        return false;
      }
    }
    GMTrace.o(19529350512640L, 145505);
    return false;
  }
  
  public final boolean JR()
  {
    GMTrace.i(19529484730368L, 145506);
    boolean bool = this.nqJ;
    GMTrace.o(19529484730368L, 145506);
    return bool;
  }
  
  public final void a(com.tencent.mm.at.a parama, int paramInt)
  {
    GMTrace.i(19528545206272L, 145499);
    if (parama == null)
    {
      w.e("MicroMsg.Music.MusicPlayer", "currentMusic is null, don't idKeyReportMusicError");
      GMTrace.o(19528545206272L, 145499);
      return;
    }
    w.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicError, action:%d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject = new IDKey();
    ((IDKey)localObject).SetID(558);
    ((IDKey)localObject).SetKey(3);
    ((IDKey)localObject).SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    int i = parama.field_musicType;
    w.i("MicroMsg.PlayerErrorHandler", "getMusicPlayerErrIdKeyByMusicType, musicType:" + i);
    label216:
    ArrayList localArrayList;
    IDKey localIDKey3;
    switch (i)
    {
    case 2: 
    case 3: 
    default: 
      i = 6;
      localIDKey2.SetKey(i);
      localIDKey2.SetValue(1L);
      localIDKey1 = new IDKey();
      localIDKey1.SetID(558);
      if (paramInt == -1)
      {
        localIDKey1.SetKey(12);
        localIDKey1.SetValue(1L);
        localArrayList = new ArrayList();
        localIDKey3 = new IDKey();
        localIDKey3.SetID(558);
        localIDKey3.SetValue(1L);
        if ((paramInt != 19) && ((getMimeType() == null) || (!getMimeType().contains("text/html"))))
        {
          if (paramInt != 21) {
            break label1510;
          }
          i = parama.field_musicType;
          w.i("MicroMsg.PlayerErrorHandler", "getMusicPlayerPlayErrIdKeyByMusicType, musicType:" + i);
          switch (i)
          {
          case 2: 
          case 3: 
          case 5: 
          default: 
            i = 188;
            localIDKey3.SetKey(i);
            localArrayList.add(localIDKey3);
          }
        }
      }
      break;
    }
    label1510:
    while ((paramInt != -1) && (paramInt != 6) && (paramInt != -2) && (paramInt != 5) && (paramInt != 4)) {
      for (;;)
      {
        localArrayList.add(localObject);
        localArrayList.add(localIDKey2);
        localArrayList.add(localIDKey1);
        w.i("MicroMsg.Music.MusicPlayer", "hasStatForHttpErr:%b, hasStatForUrlErr:%b, hasStatForNetworkErr:%b, hasStatForHttpRangeErr:%b, hasStatDownloadExceptionErr:%b", new Object[] { Boolean.valueOf(this.nrN), Boolean.valueOf(this.nrP), Boolean.valueOf(this.nrS), Boolean.valueOf(this.nrO), Boolean.valueOf(this.nrQ) });
        if ((paramInt == -1) && (!this.nrN))
        {
          this.nrN = true;
          i = 0;
          if (this.nrL != null) {
            i = this.nrL.nrp;
          }
          if (i == 403)
          {
            localObject = new IDKey();
            ((IDKey)localObject).SetID(558);
            ((IDKey)localObject).SetValue(1L);
            ((IDKey)localObject).SetKey(h.rF(700));
            localArrayList.add(localObject);
          }
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(0) });
        }
        if ((paramInt == 6) && (!this.nrO))
        {
          this.nrO = true;
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
        }
        if ((paramInt == -2) && (!this.nrP))
        {
          this.nrP = true;
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
        }
        if ((paramInt == 5) && (!this.nrQ))
        {
          this.nrQ = true;
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          i = 0;
          if (this.nrL != null) {
            i = this.nrL.glO;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(i) });
        }
        if ((paramInt == 19) && (!this.nrR))
        {
          this.nrR = true;
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
        }
        if ((paramInt == 4) && (!this.nrS))
        {
          this.nrS = true;
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
        }
        if ((paramInt == 20) && (!this.nrT))
        {
          this.nrT = true;
          if ((this.nrK instanceof e)) {
            this.nrW = ((e)this.nrK).glO;
          }
          localObject = new ArrayList();
          ((ArrayList)localObject).add(localIDKey1);
          com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject, true);
        }
        if ((paramInt == 21) && (!this.nrU) && (this.nrT))
        {
          this.nrU = true;
          if ((getMimeType() == null) || (!getMimeType().contains("text/html"))) {
            break label1690;
          }
          i = 701;
          localIDKey1 = new IDKey();
          localIDKey1.SetID(558);
          localIDKey1.SetValue(1L);
          localIDKey1.SetKey(h.rF(701));
          localArrayList.add(localIDKey1);
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
          com.tencent.mm.plugin.report.service.g.ork.i(14777, new Object[] { Integer.valueOf(0), Integer.valueOf(parama.field_musicType), Integer.valueOf(0), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(0) });
        }
        GMTrace.o(19528545206272L, 145499);
        return;
        i = 60;
        break;
        i = 61;
        break;
        i = 62;
        break;
        i = 63;
        break;
        i = 64;
        break;
        i = 5;
        break;
        i = 65;
        break;
        i = 66;
        break;
        if (paramInt == 6)
        {
          localIDKey1.SetKey(46);
          break label216;
        }
        if (paramInt == -2)
        {
          localIDKey1.SetKey(13);
          break label216;
        }
        if (paramInt == 5)
        {
          localIDKey1.SetKey(16);
          break label216;
        }
        if (paramInt == 4)
        {
          localIDKey1.SetKey(14);
          break label216;
        }
        if (paramInt == 20)
        {
          localIDKey1.SetKey(11);
          break label216;
        }
        if (paramInt == 21)
        {
          localIDKey1.SetKey(47);
          break label216;
        }
        if (paramInt != 19) {
          break label216;
        }
        localIDKey1.SetKey(190);
        break label216;
        i = 159;
        continue;
        i = 160;
        continue;
        i = 161;
        continue;
        i = 162;
        continue;
        i = 163;
        continue;
        i = 164;
        continue;
        i = 165;
      }
    }
    i = parama.field_musicType;
    w.i("MicroMsg.PlayerErrorHandler", "getMusicPlayerNetworkErrIdKeyByMusicType, musicType:" + i);
    switch (i)
    {
    case 2: 
    case 3: 
    case 5: 
    default: 
      i = 188;
    }
    for (;;)
    {
      localIDKey3.SetKey(i);
      localArrayList.add(localIDKey3);
      break;
      i = 151;
      continue;
      i = 152;
      continue;
      i = 153;
      continue;
      i = 154;
      continue;
      i = 155;
      continue;
      i = 156;
      continue;
      i = 157;
    }
    label1690:
    int j = this.nrW;
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetValue(1L);
    localIDKey1.SetKey(h.rF(j));
    localArrayList.add(localIDKey1);
    switch (this.nrW)
    {
    default: 
      i = 0;
      label1770:
      if (i != 0)
      {
        localIDKey1 = new IDKey();
        localIDKey1.SetID(558);
        localIDKey1.SetValue(1L);
        i = parama.field_musicType;
        w.i("MicroMsg.PlayerErrorHandler", "getMusicPlayerDecodeErrIdKeyByMusicType, musicType:" + i);
        switch (i)
        {
        case 2: 
        case 3: 
        case 5: 
        default: 
          i = 188;
        }
      }
      break;
    }
    for (;;)
    {
      localIDKey1.SetKey(i);
      localArrayList.add(localIDKey1);
      i = j;
      break;
      i = 1;
      break label1770;
      i = 194;
      continue;
      i = 195;
      continue;
      i = 196;
      continue;
      i = 197;
      continue;
      i = 198;
      continue;
      i = 199;
      continue;
      i = 200;
    }
  }
  
  public final void aSH()
  {
    GMTrace.i(19529082077184L, 145503);
    this.nrZ = true;
    w.i("MicroMsg.Music.MusicPlayer", "passivePause");
    try
    {
      if ((this.nrK != null) && (this.nrK.isPlaying()))
      {
        this.nrK.pause();
        n(com.tencent.mm.plugin.music.a.h.aSs().aSj());
      }
      GMTrace.o(19529082077184L, 145503);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "passivePause", new Object[0]);
      GMTrace.o(19529082077184L, 145503);
    }
  }
  
  public final boolean aSI()
  {
    GMTrace.i(19528947859456L, 145502);
    if ((this.nqJ) && (this.nrZ))
    {
      GMTrace.o(19528947859456L, 145502);
      return true;
    }
    GMTrace.o(19528947859456L, 145502);
    return false;
  }
  
  public final boolean aSJ()
  {
    GMTrace.i(19530290036736L, 145512);
    GMTrace.o(19530290036736L, 145512);
    return false;
  }
  
  public final com.tencent.mm.at.d aSK()
  {
    GMTrace.i(19530155819008L, 145511);
    int m = getDuration();
    int j;
    int i;
    label39:
    int k;
    if (this.nrK != null)
    {
      j = this.nrK.aTh();
      if (!JQ()) {
        break label118;
      }
      i = 1;
      w.i("MicroMsg.Music.MusicPlayer", "get music status = %d", new Object[] { Integer.valueOf(i) });
      k = aTo();
      if (m <= 0) {
        break label179;
      }
    }
    for (;;)
    {
      if (this.nrX != null) {
        this.nrX.g(m, j, i, k);
      }
      for (;;)
      {
        this.nrX.eNr = false;
        com.tencent.mm.at.d locald = this.nrX;
        GMTrace.o(19530155819008L, 145511);
        return locald;
        j = -1;
        break;
        label118:
        if ((this.nqJ) && ((this.nrM) || (this.nqE))) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label155;
          }
          i = 0;
          break;
        }
        label155:
        i = 2;
        break label39;
        this.nrX = new com.tencent.mm.at.d(m, j, i, k);
      }
      label179:
      k = 0;
    }
  }
  
  public final void aSU()
  {
    GMTrace.i(19528813641728L, 145501);
    w.i("MicroMsg.Music.MusicPlayer", "pauseAndAbandonFocus");
    pause();
    com.tencent.mm.plugin.music.a.h.aSv().aSh();
    GMTrace.o(19528813641728L, 145501);
  }
  
  public final void ahO()
  {
    GMTrace.i(19529618948096L, 145507);
    w.i("MicroMsg.Music.MusicPlayer", "stopPlay");
    Object localObject2;
    Object localObject1;
    int i;
    if ((this.nrK != null) && ((this.nrK instanceof e)))
    {
      localObject2 = this.nrK.aTi();
      localObject1 = localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        localObject1 = localObject2;
        if (this.nrL != null) {
          localObject1 = getMimeType();
        }
      }
      w.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicMimeType mineType:%s, hasStatForMimeType:%b", new Object[] { localObject1, Boolean.valueOf(this.nrV) });
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!this.nrV))
      {
        w.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicMimeType OK");
        this.nrV = true;
        localObject2 = new IDKey();
        ((IDKey)localObject2).SetID(558);
        if (!"audio/3gpp".equalsIgnoreCase((String)localObject1)) {
          break label303;
        }
        i = 70;
      }
    }
    for (;;)
    {
      ((IDKey)localObject2).SetKey(i);
      ((IDKey)localObject2).SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject2);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      localObject2 = com.tencent.mm.plugin.music.a.h.aSs().aSi();
      if (localObject2 != null)
      {
        i = h.DN((String)localObject1);
        com.tencent.mm.plugin.report.service.g.ork.i(14486, new Object[] { Integer.valueOf(0), Integer.valueOf(((com.tencent.mm.at.a)localObject2).field_musicType), Integer.valueOf(i), localObject1 });
      }
      try
      {
        if (this.nrL != null)
        {
          this.nrL.isStop = true;
          this.nrL = null;
        }
        if (this.nrK != null)
        {
          this.nrK.stop();
          this.nrK = null;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "stopPlay", new Object[0]);
        }
      }
      com.tencent.mm.plugin.music.a.h.aSv().aSh();
      this.nqJ = false;
      this.nrZ = false;
      GMTrace.o(19529618948096L, 145507);
      return;
      label303:
      if ("audio/amr-wb".equalsIgnoreCase((String)localObject1)) {
        i = 71;
      } else if (("audio/mpeg".equalsIgnoreCase((String)localObject1)) || (((String)localObject1).equalsIgnoreCase("audio/mp3"))) {
        i = 72;
      } else if (("audio/mp4a-latm".equalsIgnoreCase((String)localObject1)) || (((String)localObject1).startsWith("audio/mp4"))) {
        i = 73;
      } else if ("audio/qcelp".equalsIgnoreCase((String)localObject1)) {
        i = 74;
      } else if ("audio/vorbis".equalsIgnoreCase((String)localObject1)) {
        i = 75;
      } else if ("audio/opus".equalsIgnoreCase((String)localObject1)) {
        i = 76;
      } else if ("audio/g711-alaw".equalsIgnoreCase((String)localObject1)) {
        i = 77;
      } else if ("audio/g711-mlaw".equalsIgnoreCase((String)localObject1)) {
        i = 78;
      } else if ("audio/raw".equalsIgnoreCase((String)localObject1)) {
        i = 79;
      } else if ("audio/flac".equalsIgnoreCase((String)localObject1)) {
        i = 80;
      } else if ("audio/gsm".equalsIgnoreCase((String)localObject1)) {
        i = 81;
      } else if ("audio/ac3".equalsIgnoreCase((String)localObject1)) {
        i = 82;
      } else if ("audio/eac3".equalsIgnoreCase((String)localObject1)) {
        i = 83;
      } else if ("audio/x-ms-wma".equalsIgnoreCase((String)localObject1)) {
        i = 84;
      } else if ("audio/x-wav".equalsIgnoreCase((String)localObject1)) {
        i = 85;
      } else if (("audio/x-ape".equalsIgnoreCase((String)localObject1)) || ("application/x-ape".equalsIgnoreCase((String)localObject1))) {
        i = 86;
      } else {
        i = 87;
      }
    }
  }
  
  public final void d(com.tencent.mm.at.a parama, boolean paramBoolean)
  {
    GMTrace.i(19528410988544L, 145498);
    if (this.nrK == null)
    {
      if ((paramBoolean) || (!com.tencent.mm.compatible.util.d.ev(15))) {
        break label80;
      }
      w.i("MicroMsg.Music.MusicPlayer", "use MMPlayer");
    }
    for (this.nrK = new e();; this.nrK = new d())
    {
      this.nrK.d(parama);
      this.nrK.a(new i()
      {
        public long nsa;
        
        public final void e(com.tencent.mm.at.a paramAnonymousa, boolean paramAnonymousBoolean)
        {
          GMTrace.i(19531095343104L, 145518);
          w.i("MicroMsg.Music.MusicPlayer", "setEvents, onStop");
          com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
          if (locala == null)
          {
            GMTrace.o(19531095343104L, 145518);
            return;
          }
          if (locala.a(paramAnonymousa)) {
            f.this.ahO();
          }
          paramAnonymousa = paramAnonymousa.JN();
          f.this.o(paramAnonymousa);
          if (paramAnonymousBoolean) {
            f.this.q(paramAnonymousa);
          }
          GMTrace.o(19531095343104L, 145518);
        }
        
        public final void f(com.tencent.mm.at.a paramAnonymousa)
        {
          GMTrace.i(19530826907648L, 145516);
          w.i("MicroMsg.Music.MusicPlayer", "setEvents, onStart");
          f.this.l(paramAnonymousa.JN());
          GMTrace.o(19530826907648L, 145516);
        }
        
        public final void f(com.tencent.mm.at.a paramAnonymousa, boolean paramAnonymousBoolean)
        {
          GMTrace.i(19531229560832L, 145519);
          com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
          if (locala == null)
          {
            GMTrace.o(19531229560832L, 145519);
            return;
          }
          w.i("MicroMsg.Music.MusicPlayer", "onError, needRetry:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          if (paramAnonymousBoolean) {
            f.this.a(paramAnonymousa, 20);
          }
          apv localapv;
          for (;;)
          {
            localapv = paramAnonymousa.JN();
            if (!locala.a(paramAnonymousa)) {
              break label201;
            }
            w.i("MicroMsg.Music.MusicPlayer", "stop");
            f.this.ahO();
            if (!paramAnonymousBoolean) {
              break;
            }
            w.i("MicroMsg.Music.MusicPlayer", "retry system media player again");
            f.this.d(locala, true);
            f.this.nrL = new com.tencent.mm.plugin.music.a.c.a(locala);
            f.this.nrL.nrq = f.this.nrY;
            f.this.nrL.start();
            GMTrace.o(19531229560832L, 145519);
            return;
            f.this.a(paramAnonymousa, 21);
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19530558472192L, 145514);
              if (System.currentTimeMillis() - f.1.this.nsa > 10000L)
              {
                f.1.this.nsa = System.currentTimeMillis();
                Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dKt), 0).show();
              }
              GMTrace.o(19530558472192L, 145514);
            }
          });
          f.this.o(localapv);
          GMTrace.o(19531229560832L, 145519);
          return;
          label201:
          w.i("MicroMsg.Music.MusicPlayer", "send stop event");
          f.this.o(localapv);
          GMTrace.o(19531229560832L, 145519);
        }
        
        public final void g(com.tencent.mm.at.a paramAnonymousa)
        {
          GMTrace.i(19530961125376L, 145517);
          com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
          if (locala == null)
          {
            GMTrace.o(19530961125376L, 145517);
            return;
          }
          int j;
          int k;
          float f2;
          float f1;
          label241:
          label309:
          int i;
          if ((locala.a(paramAnonymousa)) && (f.this.nrK != null) && (f.this.nrK.isPlaying()))
          {
            j = f.this.nrK.aTh();
            k = f.this.nrK.getDuration();
            if ((j > 0) && (k > 0))
            {
              f2 = j / k;
              if (f.this.nrL != null)
              {
                paramAnonymousa = f.this.nrL;
                paramAnonymousa.nrn = f2;
                boolean bool = am.isNetworkConnected(ab.getContext());
                if ((paramAnonymousa.isStop) && (bool))
                {
                  if (!paramAnonymousa.lcN) {
                    break label372;
                  }
                  if (paramAnonymousa.eNq.field_songWifiFileLength != 0L)
                  {
                    f1 = (float)paramAnonymousa.eNq.field_wifiDownloadedLength / (float)paramAnonymousa.eNq.field_songWifiFileLength;
                    if ((f1 < 1.0F) && (f1 - f2 <= 0.15F) && (bool))
                    {
                      w.v("MicroMsg.Music.MusicDownloadTask", "playPercent=%.2f downloadPercent=%.2f isConnectNetwork=%b", new Object[] { Float.valueOf(f2), Float.valueOf(f1), Boolean.valueOf(bool) });
                      paramAnonymousa.start();
                    }
                  }
                }
                if ((f.this.nrL != null) && (f.this.nrL.isStop))
                {
                  paramAnonymousa = f.this.nrL;
                  if (!paramAnonymousa.lcN) {
                    break label405;
                  }
                  if (paramAnonymousa.eNq.field_songWifiFileLength == 0L) {
                    break label453;
                  }
                  f1 = (float)paramAnonymousa.eNq.field_wifiDownloadedLength / (float)paramAnonymousa.eNq.field_songWifiFileLength;
                  if (f1 < 1.0F) {
                    break label438;
                  }
                  i = 1;
                }
              }
            }
          }
          for (;;)
          {
            if (i == 0)
            {
              w.i("MicroMsg.Music.MusicPlayer", "download percent not enough can not play");
              f.this.ahO();
            }
            if (f.this.nqF != null) {
              f.this.nqF.bP(j, k);
            }
            GMTrace.o(19530961125376L, 145517);
            return;
            label372:
            if (paramAnonymousa.eNq.field_songFileLength == 0L) {
              break label241;
            }
            f1 = (float)paramAnonymousa.eNq.field_downloadedLength / (float)paramAnonymousa.eNq.field_songFileLength;
            break;
            label405:
            if (paramAnonymousa.eNq.field_songFileLength != 0L)
            {
              f1 = (float)paramAnonymousa.eNq.field_downloadedLength / (float)paramAnonymousa.eNq.field_songFileLength;
              break label309;
              label438:
              if (f1 - f2 > 0.05F)
              {
                i = 1;
                continue;
              }
            }
            label453:
            i = 0;
          }
        }
      });
      GMTrace.o(19528410988544L, 145498);
      return;
      label80:
      w.i("MicroMsg.Music.MusicPlayer", "use MMMediaPlayer");
    }
  }
  
  public final void e(com.tencent.mm.at.a parama)
  {
    GMTrace.i(19528276770816L, 145497);
    w.i("MicroMsg.Music.MusicPlayer", "init and start download");
    ahO();
    com.tencent.mm.plugin.music.a.f.a(parama, false);
    w.i("MicroMsg.Music.MusicPlayer", "initIdKeyStatData");
    this.nrN = false;
    this.nrO = false;
    this.nrP = false;
    this.nrQ = false;
    this.nrR = false;
    this.nrS = false;
    this.nrT = false;
    this.nrU = false;
    this.nrV = false;
    this.nrW = 0;
    d(parama, false);
    if (parama == null)
    {
      w.i("MicroMsg.Music.MusicPlayer", "music is null");
      GMTrace.o(19528276770816L, 145497);
      return;
    }
    w.i("MicroMsg.Music.MusicPlayer", "startPlay src:%s", new Object[] { parama.field_songWifiUrl });
    this.nrL = new com.tencent.mm.plugin.music.a.c.a(parama);
    this.nrL.nrq = this.nrY;
    this.nrL.start();
    GMTrace.o(19528276770816L, 145497);
  }
  
  public final boolean gG(int paramInt)
  {
    GMTrace.i(19530021601280L, 145510);
    w.i("MicroMsg.Music.MusicPlayer", "seekToMusic pos:%d", new Object[] { Integer.valueOf(paramInt) });
    try
    {
      int i = getDuration();
      int j = aTo();
      if ((i < 0) || (paramInt > i))
      {
        w.e("MicroMsg.Music.MusicPlayer", "duration or position is illegal, stop");
        ahO();
        GMTrace.o(19530021601280L, 145510);
        return false;
      }
      int k = (int)(j / 100.0D * i);
      i = paramInt;
      if (j != 100)
      {
        i = paramInt;
        if (paramInt > k)
        {
          i = k - 2000;
          w.i("MicroMsg.Music.MusicPlayer", "on completed seekto, position is %d =", new Object[] { Integer.valueOf(i) });
        }
      }
      if ((this.nrK != null) && (i > 0))
      {
        this.nrK.seek(i);
        p(com.tencent.mm.plugin.music.a.h.aSs().aSj());
        GMTrace.o(19530021601280L, 145510);
        return true;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "seekTo", new Object[0]);
      GMTrace.o(19530021601280L, 145510);
    }
    return false;
  }
  
  public final int getDuration()
  {
    GMTrace.i(19529753165824L, 145508);
    if (this.nrK != null)
    {
      int i = this.nrK.getDuration();
      GMTrace.o(19529753165824L, 145508);
      return i;
    }
    GMTrace.o(19529753165824L, 145508);
    return -1;
  }
  
  public final void pause()
  {
    GMTrace.i(19528679424000L, 145500);
    this.nrZ = false;
    w.i("MicroMsg.Music.MusicPlayer", "pause");
    try
    {
      if ((this.nrK != null) && (this.nrK.isPlaying()))
      {
        this.nrK.pause();
        this.nrM = true;
        n(com.tencent.mm.plugin.music.a.h.aSs().aSj());
      }
      GMTrace.o(19528679424000L, 145500);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "pause", new Object[0]);
      GMTrace.o(19528679424000L, 145500);
    }
  }
  
  public final void resume()
  {
    GMTrace.i(19529216294912L, 145504);
    try
    {
      if ((this.nrK != null) && (!this.nrK.isPlaying()))
      {
        w.i("MicroMsg.Music.MusicPlayer", "resume");
        if (com.tencent.mm.plugin.music.a.h.aSv().requestFocus())
        {
          this.nrK.play();
          m(com.tencent.mm.plugin.music.a.h.aSs().aSj());
          GMTrace.o(19529216294912L, 145504);
          return;
        }
        w.e("MicroMsg.Music.MusicPlayer", "request focus error");
        GMTrace.o(19529216294912L, 145504);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "resume", new Object[0]);
      GMTrace.o(19529216294912L, 145504);
      return;
    }
    w.i("MicroMsg.Music.MusicPlayer", "music is playing");
    GMTrace.o(19529216294912L, 145504);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */