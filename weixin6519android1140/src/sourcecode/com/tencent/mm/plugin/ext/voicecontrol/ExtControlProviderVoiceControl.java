package com.tencent.mm.plugin.ext.voicecontrol;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.protocal.c.db;
import com.tencent.mm.protocal.c.dd;
import com.tencent.mm.protocal.c.de;
import com.tencent.mm.protocal.c.df;
import com.tencent.mm.protocal.c.dg;
import com.tencent.mm.protocal.c.dh;
import com.tencent.mm.protocal.c.di;
import com.tencent.mm.protocal.c.dj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class ExtControlProviderVoiceControl
  extends ExtContentProviderBase
  implements com.tencent.mm.ad.e
{
  private static final String[] kMv;
  private Context context;
  private String[] kMI;
  private int kMJ;
  private int kOj;
  private long kOk;
  private long kOl;
  private long kOm;
  com.tencent.mm.pluginsdk.f.a.b kOn;
  private long kOo;
  private boolean kOp;
  private com.qq.wx.voice.embed.recognizer.c kOq;
  
  static
  {
    GMTrace.i(5708951060480L, 42535);
    kMv = new String[] { "retCode" };
    GMTrace.o(5708951060480L, 42535);
  }
  
  public ExtControlProviderVoiceControl(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    GMTrace.i(5707072012288L, 42521);
    this.kMI = null;
    this.kMJ = -1;
    this.kOj = 4;
    this.kOn = new com.tencent.mm.pluginsdk.f.a.b();
    this.kOo = 0L;
    this.kOq = new com.qq.wx.voice.embed.recognizer.c()
    {
      public final void a(com.qq.wx.voice.embed.recognizer.a paramAnonymousa)
      {
        GMTrace.i(5709487931392L, 42539);
        if (paramAnonymousa == null)
        {
          w.w("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetResult restult is null");
          GMTrace.o(5709487931392L, 42539);
          return;
        }
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl use time2:%s,text: %s,name: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - ExtControlProviderVoiceControl.b(ExtControlProviderVoiceControl.this)), paramAnonymousa.text, paramAnonymousa.name });
        if (!bg.nm(paramAnonymousa.name))
        {
          ExtControlProviderVoiceControl.c(ExtControlProviderVoiceControl.this);
          ExtControlProviderVoiceControl.b(ExtControlProviderVoiceControl.this, paramAnonymousa.name);
        }
        GMTrace.o(5709487931392L, 42539);
      }
      
      public final void cR(int paramAnonymousInt)
      {
        GMTrace.i(5709622149120L, 42540);
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetError:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(5709622149120L, 42540);
      }
    };
    this.kMI = paramArrayOfString;
    this.kMJ = paramInt;
    this.context = paramContext;
    GMTrace.o(5707072012288L, 42521);
  }
  
  private static boolean a(a parama, int paramInt1, int paramInt2)
  {
    GMTrace.i(5707474665472L, 42524);
    if (parama == null)
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue netscene null");
      GMTrace.o(5707474665472L, 42524);
      return false;
    }
    if (parama.kOB == null)
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue uploadCmd null");
      GMTrace.o(5707474665472L, 42524);
      return false;
    }
    if (parama.kOB.tRu == null)
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue UploadCtx null");
      GMTrace.o(5707474665472L, 42524);
      return false;
    }
    new dh();
    Object localObject = parama.kOB;
    ((dh)localObject).tRu.tRD = paramInt1;
    ((dh)localObject).tRu.tRE = paramInt2;
    byte[] arrayOfByte = com.tencent.mm.a.e.d(parama.kOA, paramInt1, paramInt2);
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue %s, startPos=%s, dataLen=%s", new Object[] { Integer.valueOf(parama.kOy), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty, %s", new Object[] { parama.kOA });
      GMTrace.o(5707474665472L, 42524);
      return false;
    }
    ((dh)localObject).tRB = com.tencent.mm.bm.b.aX(arrayOfByte);
    localObject = new a(parama.kOy, parama.appId, parama.gsL, parama.kOA, (dh)localObject);
    ((a)localObject).gsM = parama.gsM;
    at.wS().a((k)localObject, 0);
    GMTrace.o(5707474665472L, 42524);
    return true;
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    GMTrace.i(5707340447744L, 42523);
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "uploadVoiceStart ");
    Object localObject1;
    if (paramInt1 != 4)
    {
      localObject2 = paramString2 + ".speex";
      new com.tencent.mm.e.c.d();
      localObject1 = localObject2;
      if (!com.tencent.mm.e.c.d.t(paramString2, (String)localObject2))
      {
        w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] decodePCMToSpeex error,pcmPath:%s,speexFilePath:%s", new Object[] { paramString2, localObject2 });
        GMTrace.o(5707340447744L, 42523);
        return false;
      }
    }
    else
    {
      localObject1 = paramString2;
    }
    int i = com.tencent.mm.a.e.aY((String)localObject1);
    Object localObject2 = new dj();
    ((dj)localObject2).tRF = 4;
    ((dj)localObject2).tRG = 4;
    ((dj)localObject2).tRH = paramInt3;
    ((dj)localObject2).tRI = paramInt4;
    di localdi = new di();
    localdi.tRC = i;
    localdi.tRD = 0;
    if (i <= 16384) {
      localdi.tRE = i;
    }
    for (paramString2 = com.tencent.mm.a.e.d((String)localObject1, 0, i);; paramString2 = com.tencent.mm.a.e.d((String)localObject1, 0, 16384))
    {
      w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoice appId=%s, FileType=%s, EncodeType=%s, sampleRate=%s, bps=%s, fileLen=%s, limit=%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(i), Integer.valueOf(16384) });
      if ((paramString2 != null) && (paramString2.length > 0)) {
        break;
      }
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty");
      GMTrace.o(5707340447744L, 42523);
      return false;
      localdi.tRE = 16384;
    }
    dh localdh = new dh();
    localdh.tRA = ((dj)localObject2);
    localdh.tRu = localdi;
    localdh.tRB = com.tencent.mm.bm.b.aX(paramString2);
    paramInt1 = bg.Pv().hashCode();
    if (paramInt1 != Integer.MIN_VALUE) {}
    for (paramInt1 = Math.abs(paramInt1);; paramInt1 = Integer.MIN_VALUE)
    {
      paramString1 = new a(paramInt1, paramString1, i, (String)localObject1, localdh);
      at.wS().a(paramString1, 0);
      GMTrace.o(5707340447744L, 42523);
      return true;
    }
  }
  
  private void xu(final String paramString)
  {
    GMTrace.i(5707877318656L, 42527);
    at.AR();
    x localx = com.tencent.mm.y.c.yK().TE(paramString);
    if ((localx == null) || (!com.tencent.mm.l.a.eE(localx.field_type)))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] username is not contact, countDown");
      this.kOj = 3505;
      this.kOn.countDown();
      GMTrace.o(5707877318656L, 42527);
      return;
    }
    com.tencent.mm.compatible.a.a.a(11, new a.a()
    {
      public final void run()
      {
        GMTrace.i(5705998270464L, 42513);
        ExtControlProviderVoiceControl.c(ExtControlProviderVoiceControl.this, paramString);
        GMTrace.o(5705998270464L, 42513);
      }
    });
    this.kOj = 1;
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] jump to chattingUI : %s, countDown", new Object[] { paramString });
    this.kOn.countDown();
    GMTrace.o(5707877318656L, 42527);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(5707743100928L, 42526);
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] onSceneEnd errType=%s, errCode=%s, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene null, countDown");
      this.kOj = 3506;
      this.kOn.countDown();
      GMTrace.o(5707743100928L, 42526);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] errType、errCode not ok, countDown");
      this.kOj = 3507;
      this.kOn.countDown();
      GMTrace.o(5707743100928L, 42526);
      return;
    }
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene.getType()=%s", new Object[] { Integer.valueOf(paramk.getType()) });
    if (paramk.getType() == 985)
    {
      if (this.kOp)
      {
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] localVoiceControlSucess, no need to process");
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      final a locala = (a)paramk;
      paramString = (a)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (dd)paramString.fUa.gtD.gtK; paramString == null; paramString = null)
      {
        w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp null, countDown");
        this.kOj = 3508;
        this.kOn.countDown();
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      locala.kOz = paramString.tRn;
      paramInt1 = locala.eHz;
      if (paramString.tRn == null)
      {
        paramk = "null";
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] opCode=%s, resp.Cookies=%s", new Object[] { Integer.valueOf(paramInt1), paramk });
        if (locala.eHz != 1) {
          break label387;
        }
        paramInt1 = 1;
      }
      for (;;)
      {
        if (paramInt1 != 0)
        {
          if (paramString.tRu == null)
          {
            w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp.UploadCtx is null");
            this.kOj = 3508;
            this.kOn.countDown();
            GMTrace.o(5707743100928L, 42526);
            return;
            paramk = new String(paramString.tRn.tJp);
            break;
            label387:
            paramInt1 = 0;
            continue;
          }
          w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadMode resp: Interval=%s, Timeout=%s, StartPos=%s, DataLen=%s", new Object[] { Integer.valueOf(paramString.tRs), Integer.valueOf(paramString.tRt), Integer.valueOf(paramString.tRu.tRD), Integer.valueOf(paramString.tRu.tRE) });
          if (paramString.tRu.tRD >= locala.gsL)
          {
            com.tencent.mm.sdk.platformtools.af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5706937794560L, 42520);
                w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode getVoiceControlResult");
                a locala = locala;
                int i = paramString.tRt;
                w.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] setGetResultTimeOut %s", new Object[] { Integer.valueOf(i) });
                locala.kOD = i;
                ExtControlProviderVoiceControl.this.a(locala.kOy, locala.appId, locala.kOz);
                GMTrace.o(5706937794560L, 42520);
              }
            }, paramString.tRs);
            GMTrace.o(5707743100928L, 42526);
            return;
          }
          w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] continue upload voice");
          if ((paramString.tRu.tRD != 0) && (paramString.tRu.tRD == locala.gsM))
          {
            w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] avoid duplicate doscene");
            GMTrace.o(5707743100928L, 42526);
            return;
          }
          locala.gsM = paramString.tRu.tRD;
          if (paramString.tRu.tRD + paramString.tRu.tRE < locala.gsL)
          {
            if (!a(locala, paramString.tRu.tRD, paramString.tRu.tRE))
            {
              w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail1, countDown");
              this.kOj = 3510;
              this.kOn.countDown();
              GMTrace.o(5707743100928L, 42526);
            }
          }
          else if (!a(locala, paramString.tRu.tRD, locala.gsL - paramString.tRu.tRD))
          {
            w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail2, countDown");
            this.kOj = 3510;
            this.kOn.countDown();
            GMTrace.o(5707743100928L, 42526);
            return;
          }
          GMTrace.o(5707743100928L, 42526);
          return;
        }
      }
      long l1;
      if (locala.eHz == 2)
      {
        paramInt1 = 1;
        if (paramInt1 == 0) {
          break label1388;
        }
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "");
        l1 = System.currentTimeMillis() - locala.kOE;
        if (l1 <= locala.kOD) {
          break label817;
        }
        w.w("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] isGetResultTimeOut %s, %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.kOD) });
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if (paramInt1 == 0) {
          break label854;
        }
        this.kOj = 3509;
        this.kOn.countDown();
        GMTrace.o(5707743100928L, 42526);
        return;
        paramInt1 = 0;
        break;
        label817:
        w.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] time %s, %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.kOD) });
      }
      label854:
      if (paramString.tRv != null) {
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode resp VoiceId=%s, RecognizeRet=%s", new Object[] { Integer.valueOf(paramString.tRv.tRo), Integer.valueOf(paramString.tRv.tRw) });
      }
      if ((paramString.tRv == null) || (paramString.tRv.tRw != 0))
      {
        if (System.currentTimeMillis() - this.kOm >= paramString.tRs)
        {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5709219495936L, 42537);
              ExtControlProviderVoiceControl.this.a(locala.kOy, locala.appId, locala.kOz);
              GMTrace.o(5709219495936L, 42537);
            }
          });
          GMTrace.o(5707743100928L, 42526);
          return;
        }
        long l2 = paramString.tRs - (System.currentTimeMillis() - this.kOm);
        l1 = l2;
        if (l2 > paramString.tRs) {
          l1 = paramString.tRs;
        }
        com.tencent.mm.sdk.platformtools.af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5709890584576L, 42542);
            ExtControlProviderVoiceControl.this.a(locala.kOy, locala.appId, locala.kOz);
            GMTrace.o(5709890584576L, 42542);
          }
        }, l1);
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      if (paramString.tRv.tRx == null)
      {
        w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo null, countDown");
        this.kOj = 3511;
        this.kOn.countDown();
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      if ((paramString.tRv.tRx.tRy == null) || (paramString.tRv.tRx.tRy.size() <= 0))
      {
        w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo.Items null, countDown");
        this.kOj = 3511;
        this.kOn.countDown();
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      if (paramString.tRv.tRx.tRy.size() == 0)
      {
        this.kOj = 3511;
        this.kOn.countDown();
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      if (paramString.tRv.tRx.tRy.size() == 1)
      {
        xu(((dg)paramString.tRv.tRx.tRy.get(0)).tRz);
        GMTrace.o(5707743100928L, 42526);
        return;
      }
      paramk = new String[paramString.tRv.tRx.tRy.size()];
      paramInt1 = 0;
      while (paramInt1 < paramk.length)
      {
        paramk[paramInt1] = ((dg)paramString.tRv.tRx.tRy.get(paramInt1)).tRz;
        w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp result item: %s", new Object[] { paramk[paramInt1] });
        paramInt1 += 1;
      }
      paramString = new Intent();
      paramString.putExtra("VoiceSearchResultUI_Resultlist", paramk);
      paramString.putExtra("VoiceSearchResultUI_VoiceId", locala.kOy);
      paramString.putExtra("VoiceSearchResultUI_IsVoiceControl", true);
      paramString.setFlags(67108864);
      paramString.putExtra("VoiceSearchResultUI_ShowType", 1);
      com.tencent.mm.bj.d.a(this.context, ".ui.voicesearch.VoiceSearchResultUI", paramString);
      w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene end countDown");
      this.kOj = 1;
      this.kOn.countDown();
      GMTrace.o(5707743100928L, 42526);
      return;
    }
    label1388:
    GMTrace.o(5707743100928L, 42526);
  }
  
  public final boolean a(int paramInt, String paramString, com.tencent.mm.bm.b paramb)
  {
    GMTrace.i(5707608883200L, 42525);
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getVoiceControlResult voiceId=%s, appId=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (this.kOl == 0L) {
      this.kOl = System.currentTimeMillis();
    }
    this.kOm = System.currentTimeMillis();
    db localdb = new db();
    localdb.tRn = paramb;
    paramString = new a(paramInt, paramString, localdb, this.kOl);
    at.wS().a(paramString, 0);
    GMTrace.o(5707608883200L, 42525);
    return true;
  }
  
  public Cursor query(final Uri paramUri, final String[] paramArrayOfString1, final String paramString1, final String[] paramArrayOfString2, final String paramString2)
  {
    GMTrace.i(5707206230016L, 42522);
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] query(), ApiId=%s", new Object[] { Integer.valueOf(this.kMJ) });
    this.kOk = 0L;
    this.kOl = 0L;
    a(paramUri, this.context, this.kMJ, this.kMI);
    if (paramUri == null)
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "uri == null");
      bY(3, 5);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(5);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    long l1 = System.currentTimeMillis();
    if (bg.nm(this.kMR))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "AppID == null");
      bY(3, 7);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(7);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    if (bg.nm(avt()))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "PkgName == null");
      bY(3, 6);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(6);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    long l2 = System.currentTimeMillis();
    long l3 = System.currentTimeMillis();
    long l4 = System.currentTimeMillis();
    int i = avu();
    if (i != 1)
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "invalid appid ! return code = " + i);
      bY(2, i);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(i);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] getAppIdAndPkg = %s, checkIsLogin = %s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l4 - l3) });
    switch (this.kMJ)
    {
    default: 
      bY(3, 15);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(15);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "voiceControl");
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 4))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
      bY(3, 3501);
      this.kOj = 3501;
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(3501);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    paramUri = paramArrayOfString2[0];
    paramArrayOfString1 = paramArrayOfString2[1];
    paramString1 = paramArrayOfString2[2];
    paramString2 = paramArrayOfString2[3];
    paramArrayOfString2 = paramArrayOfString2[4];
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] args: %s, %s, %s, %s %s", new Object[] { paramUri, paramArrayOfString1, paramString1, paramString2, paramArrayOfString2 });
    if ((bg.nm(paramUri)) || (bg.nm(paramArrayOfString1)) || (bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramArrayOfString2)))
    {
      bY(3, 3502);
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(3502);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    if (!com.tencent.mm.a.e.aZ(paramArrayOfString2))
    {
      w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] speex file not exist");
      bY(3, 3503);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(3503);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
    }
    this.kOk = System.currentTimeMillis();
    at.wS().a(985, this);
    this.kOn.b(13000L, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5710159020032L, 42544);
        int i = bg.getInt(paramUri, 4);
        if (i == 1) {
          ExtControlProviderVoiceControl.a(ExtControlProviderVoiceControl.this, paramArrayOfString2);
        }
        for (;;)
        {
          if (!ExtControlProviderVoiceControl.a(ExtControlProviderVoiceControl.a(ExtControlProviderVoiceControl.this), i, bg.getInt(paramArrayOfString1, 4), bg.getInt(paramString1, 16000), bg.getInt(paramString2, 16), paramArrayOfString2))
          {
            w.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] !ok countDown");
            ExtControlProviderVoiceControl.a(ExtControlProviderVoiceControl.this, 3504);
            ExtControlProviderVoiceControl.this.kOn.countDown();
          }
          GMTrace.o(5710159020032L, 42544);
          return;
          w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] not pcm, don't run localVoiceControl");
        }
      }
    });
    w.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] finish uploadVoice = %s, getResult = %s", new Object[] { Long.valueOf(this.kOl - this.kOk), Long.valueOf(System.currentTimeMillis() - this.kOl) });
    at.wS().b(985, this);
    A(10, 0, 1);
    if (1 != this.kOj) {
      A(11, 4, 1);
    }
    for (;;)
    {
      nl(0);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(this.kOj);
      GMTrace.o(5707206230016L, 42522);
      return paramUri;
      A(10, 0, 1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\voicecontrol\ExtControlProviderVoiceControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */