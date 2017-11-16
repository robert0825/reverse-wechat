package com.tencent.mm.e.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.h.b;
import com.tencent.mm.compatible.b.b.a;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.t;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class h
  implements com.tencent.mm.ad.h, e.a
{
  public a eyA;
  public b eyB;
  private a eyC;
  private String eyD;
  private boolean eyE;
  private boolean eyF;
  public long eyG;
  public long eyH;
  public int eyI;
  public boolean eyJ;
  public boolean eyK;
  public int eyL;
  private b.a eyM;
  protected h.b eyN;
  protected com.tencent.mm.ad.h.a eyO;
  private boolean eyP;
  private aj eyQ;
  public String mFileName;
  
  public h(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(4476161228800L, 33350);
    this.eyA = null;
    this.eyC = null;
    this.mFileName = "";
    this.eyE = false;
    this.eyF = false;
    this.eyH = 0L;
    this.eyI = 0;
    this.eyJ = false;
    this.eyK = false;
    this.eyL = 0;
    this.eyM = b.a.fMO;
    this.eyO = null;
    this.eyP = false;
    this.eyQ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4475490140160L, 33345);
        com.tencent.mm.modelvoice.q.a(h.this.mFileName, h.this);
        m.NM().run();
        w.d("MicroMsg.SceneVoice.Recorder", "Start Send fileName :" + h.this.mFileName);
        GMTrace.o(4475490140160L, 33345);
        return false;
      }
    }, true);
    this.eyB = new b(paramContext);
    this.eyK = paramBoolean;
    w.i("MicroMsg.SceneVoice.Recorder", "new SceneVoiceRecorder, useSpeex: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4476161228800L, 33350);
  }
  
  public final void a(com.tencent.mm.ad.h.a parama)
  {
    GMTrace.i(4477771841536L, 33362);
    this.eyO = parama;
    GMTrace.o(4477771841536L, 33362);
  }
  
  public final void a(h.b paramb)
  {
    GMTrace.i(4477906059264L, 33363);
    this.eyN = paramb;
    GMTrace.o(4477906059264L, 33363);
  }
  
  public final boolean bS(String paramString)
  {
    GMTrace.i(4476966535168L, 33356);
    w.i("MicroMsg.SceneVoice.Recorder", "Start Record to  " + paramString);
    reset();
    this.eyD = paramString;
    this.eyG = bg.Pw();
    if (paramString == null)
    {
      w.e("MicroMsg.SceneVoice.Recorder", "Start Record toUser null");
      GMTrace.o(4476966535168L, 33356);
      return false;
    }
    this.eyE = paramString.equals("_USER_FOR_THROWBOTTLE_");
    if (paramString.equals("medianote"))
    {
      if ((com.tencent.mm.y.q.zI() & 0x4000) == 0) {
        this.eyF = true;
      }
    }
    else
    {
      if (this.eyK) {
        break label196;
      }
      if (!this.eyE) {
        break label177;
      }
      this.mFileName = u.mU(com.tencent.mm.y.q.zE());
    }
    for (;;)
    {
      if ((this.mFileName != null) && (this.mFileName.length() > 0)) {
        break label207;
      }
      w.e("MicroMsg.SceneVoice.Recorder", "Start Record DBError fileName:%s", new Object[] { this.mFileName });
      GMTrace.o(4476966535168L, 33356);
      return false;
      this.eyF = false;
      break;
      label177:
      if (this.eyF) {
        this.mFileName = u.mU("medianote");
      } else {
        label196:
        this.mFileName = com.tencent.mm.modelvoice.q.mM(paramString);
      }
    }
    label207:
    com.tencent.mm.compatible.b.e.sd().a(this);
    this.eyJ = false;
    this.eyP = false;
    if ((com.tencent.mm.compatible.b.e.sk()) && (!com.tencent.mm.compatible.b.e.sd().sh()))
    {
      this.eyP = true;
      com.tencent.mm.compatible.b.e.sd().sf();
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4476027011072L, 33349);
          if (!h.this.eyJ)
          {
            w.d("MicroMsg.SceneVoice.Recorder", "after start bluetooth, timeout to directly start record");
            h.this.qE();
          }
          GMTrace.o(4476027011072L, 33349);
        }
      }, 1000L);
    }
    for (;;)
    {
      GMTrace.o(4476966535168L, 33356);
      return true;
      qE();
    }
  }
  
  public final boolean cancel()
  {
    GMTrace.i(4477100752896L, 33357);
    w.d("MicroMsg.SceneVoice.Recorder", "cancel Record :" + this.mFileName);
    try
    {
      w.d("MicroMsg.SceneVoice.Recorder", "stop synchronized Record :" + this.mFileName);
      if (this.eyA != null)
      {
        this.eyA.qn();
        this.eyB.tx();
      }
      com.tencent.mm.compatible.b.e.sd().b(this);
      if (this.eyP)
      {
        com.tencent.mm.compatible.b.e.sd().sg();
        this.eyP = false;
      }
      com.tencent.mm.modelvoice.q.mN(this.mFileName);
      m.NM().run();
      if ((this.eyA != null) && (!bg.nm(this.mFileName)) && (!this.eyK))
      {
        com.tencent.mm.compatible.g.a locala = new com.tencent.mm.compatible.g.a();
        locala.fRL = this.mFileName;
        locala.fRM = qD();
        locala.fRN = 1;
        locala.eDB = this.eyA.qo();
        g.ork.A(10513, locala.tv());
      }
      this.mFileName = "";
      GMTrace.o(4477100752896L, 33357);
      return true;
    }
    finally {}
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(4477503406080L, 33360);
    w.d("MicroMsg.SceneVoice.Recorder", "dkbt Recorder onBluetoothHeadsetStateChange :" + paramInt);
    if (paramInt == 1) {
      qE();
    }
    GMTrace.o(4477503406080L, 33360);
  }
  
  public String getFileName()
  {
    GMTrace.i(4476563881984L, 33353);
    String str = this.mFileName;
    GMTrace.o(4476563881984L, 33353);
    return str;
  }
  
  public final int getMaxAmplitude()
  {
    GMTrace.i(4476832317440L, 33355);
    if (this.eyA == null)
    {
      GMTrace.o(4476832317440L, 33355);
      return 0;
    }
    int i = this.eyA.getMaxAmplitude();
    GMTrace.o(4476832317440L, 33355);
    return i;
  }
  
  public final boolean isRecording()
  {
    GMTrace.i(4476698099712L, 33354);
    if (this.eyA == null)
    {
      GMTrace.o(4476698099712L, 33354);
      return false;
    }
    if (this.eyA.getStatus() == 1)
    {
      GMTrace.o(4476698099712L, 33354);
      return true;
    }
    GMTrace.o(4476698099712L, 33354);
    return false;
  }
  
  public final int qC()
  {
    GMTrace.i(4476429664256L, 33352);
    int i = this.eyI;
    GMTrace.o(4476429664256L, 33352);
    return i;
  }
  
  public final long qD()
  {
    GMTrace.i(4477369188352L, 33359);
    if (this.eyH == 0L)
    {
      GMTrace.o(4477369188352L, 33359);
      return 0L;
    }
    long l = bg.aI(this.eyH);
    GMTrace.o(4477369188352L, 33359);
    return l;
  }
  
  public final void qE()
  {
    GMTrace.i(4477637623808L, 33361);
    if (this.eyJ)
    {
      GMTrace.o(4477637623808L, 33361);
      return;
    }
    this.eyJ = true;
    if (this.eyK)
    {
      this.eyM = b.a.fMN;
      this.eyA = new k();
      localObject = new com.tencent.mm.ad.h.a()
      {
        public final void onError()
        {
          GMTrace.i(4489046130688L, 33446);
          h.this.eyB.tx();
          w.e("MicroMsg.SceneVoice.Recorder", "Record Failed file:" + h.this.mFileName);
          com.tencent.mm.modelvoice.q.mP(h.this.mFileName);
          if (h.this.eyO != null) {
            h.this.eyO.onError();
          }
          GMTrace.o(4489046130688L, 33446);
        }
      };
      if (this.eyA != null) {
        this.eyA.a((com.tencent.mm.ad.h.a)localObject);
      }
      this.eyC = new a();
      com.tencent.mm.sdk.f.e.post(this.eyC, "SceneVoiceRecorder_record");
      this.eyL = 1;
      this.eyQ.z(3000L, 3000L);
      w.d("MicroMsg.SceneVoice.Recorder", "start end time:" + bg.aI(this.eyG));
      GMTrace.o(4477637623808L, 33361);
      return;
    }
    Object localObject = ab.getContext().getSharedPreferences(ab.bPU(), 0);
    boolean bool;
    if (p.fQD.fNx == 1)
    {
      bool = false;
      label183:
      if (!((SharedPreferences)localObject).contains("settings_voicerecorder_mode")) {
        ((SharedPreferences)localObject).edit().putBoolean("settings_voicerecorder_mode", bool).commit();
      }
      w.i("AudioConfig", "getModeByConfig mVoiceRecordMode:%d defValue:%b settings_voicerecorder_mode:%b", new Object[] { Integer.valueOf(p.fQD.fNx), Boolean.valueOf(bool), Boolean.valueOf(((SharedPreferences)localObject).getBoolean("settings_voicerecorder_mode", bool)) });
      if (!((SharedPreferences)localObject).getBoolean("settings_voicerecorder_mode", bool)) {
        break label471;
      }
    }
    label471:
    for (localObject = b.a.fMK;; localObject = b.a.fML)
    {
      this.eyM = ((b.a)localObject);
      localObject = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("VoiceFormat");
      String str = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("VoiceFormatToQQ");
      if (this.eyM == b.a.fMK)
      {
        if ((4 == bg.getInt((String)localObject, 4)) && (g.b.qB())) {
          this.eyM = b.a.fMM;
        }
        if ((this.eyD != null) && (this.eyD.endsWith("@qqim"))) {
          this.eyM = b.a.fML;
        }
      }
      if (this.eyM == b.a.fMK)
      {
        w.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode, still in pcm mode, force to amr mode");
        this.eyM = b.a.fML;
      }
      w.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode dynamicFormat:%s dynamicFormatQQ:%s recdMode:%s isSilkSoLoadSuccess:%b", new Object[] { localObject, str, this.eyM, Boolean.valueOf(g.b.qB()) });
      this.eyA = new t(this.eyM);
      break;
      bool = true;
      break label183;
    }
  }
  
  public final int qF()
  {
    GMTrace.i(4478040276992L, 33364);
    if (this.eyK)
    {
      GMTrace.o(4478040276992L, 33364);
      return 1;
    }
    if ((this.eyM == b.a.fMK) || (this.eyM == b.a.fML))
    {
      GMTrace.o(4478040276992L, 33364);
      return 0;
    }
    if (this.eyM == b.a.fMM)
    {
      GMTrace.o(4478040276992L, 33364);
      return 2;
    }
    GMTrace.o(4478040276992L, 33364);
    return -1;
  }
  
  public boolean qt()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    GMTrace.i(4477234970624L, 33358);
    if (this.eyQ != null)
    {
      this.eyQ.stopTimer();
      this.eyQ.removeCallbacksAndMessages(null);
    }
    com.tencent.mm.compatible.b.e.sd().b(this);
    if (this.eyP)
    {
      com.tencent.mm.compatible.b.e.sd().sg();
      this.eyP = false;
    }
    this.eyI = ((int)qD());
    w.i("MicroMsg.SceneVoice.Recorder", "stop Record : %s, len: %s", new Object[] { this.mFileName, Integer.valueOf(this.eyI) });
    if ((this.eyA != null) && (!bg.nm(this.mFileName)) && (!this.eyK))
    {
      com.tencent.mm.compatible.g.a locala = new com.tencent.mm.compatible.g.a();
      locala.fRL = this.mFileName;
      locala.fRM = this.eyI;
      locala.fRN = 2;
      locala.eDB = this.eyA.qo();
      g.ork.A(10513, locala.tv());
    }
    try
    {
      w.i("MicroMsg.SceneVoice.Recorder", "stop synchronized Record:%s, recorder:%s", new Object[] { this.mFileName, this.eyA });
      if (this.eyA != null)
      {
        this.eyA.qn();
        this.eyB.tx();
      }
      if (this.eyL != 2)
      {
        com.tencent.mm.modelvoice.q.mP(this.mFileName);
        this.mFileName = null;
        w.i("MicroMsg.SceneVoice.Recorder", "Stop " + this.mFileName + " by not onPart: " + bg.aI(this.eyG));
        bool1 = bool2;
        this.eyL = -1;
        GMTrace.o(4477234970624L, 33358);
        return bool1;
      }
    }
    finally {}
    if ((this.eyI < 800L) || ((this.eyE) && (this.eyI < 1000L)))
    {
      w.i("MicroMsg.SceneVoice.Recorder", "Stop " + this.mFileName + " by voiceLen: " + this.eyI);
      com.tencent.mm.modelvoice.q.mP(this.mFileName);
      this.mFileName = "";
      bool1 = false;
    }
    for (;;)
    {
      this.mFileName = "";
      break;
      com.tencent.mm.modelvoice.q.Q(this.mFileName, this.eyI);
      m.NM().run();
      w.i("MicroMsg.SceneVoice.Recorder", "Stop file success: " + this.mFileName);
    }
  }
  
  public final void reset()
  {
    GMTrace.i(4476295446528L, 33351);
    if (this.eyA != null)
    {
      this.eyA.qn();
      this.eyB.tx();
      w.e("MicroMsg.SceneVoice.Recorder", "Reset recorder.stopReocrd");
    }
    this.mFileName = "";
    this.eyG = 0L;
    this.eyC = null;
    this.eyM = b.a.fMO;
    this.eyL = 0;
    this.eyH = 0L;
    GMTrace.o(4476295446528L, 33351);
  }
  
  private final class a
    implements Runnable
  {
    ae handler;
    
    public a()
    {
      GMTrace.i(4478442930176L, 33367);
      this.handler = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(4479516672000L, 33375);
          if (h.this.eyL <= 0)
          {
            GMTrace.o(4479516672000L, 33375);
            return;
          }
          paramAnonymousMessage = new StringBuilder("On Part :");
          if (h.this.eyN == null) {}
          for (boolean bool = true;; bool = false)
          {
            w.d("MicroMsg.SceneVoice.Recorder", bool);
            h.this.eyL = 2;
            if (h.this.eyN != null) {
              h.this.eyN.DB();
            }
            GMTrace.o(4479516672000L, 33375);
            return;
          }
        }
      };
      GMTrace.o(4478442930176L, 33367);
    }
    
    public final void run()
    {
      boolean bool = true;
      GMTrace.i(4478577147904L, 33368);
      synchronized (h.this)
      {
        if (h.this.eyA == null)
        {
          w.e("MicroMsg.SceneVoice.Recorder", "Stop Record Failed recorder == null");
          GMTrace.o(4478577147904L, 33368);
          return;
        }
        String str = h.this.mFileName;
        if (!h.this.eyK) {}
        for (;;)
        {
          str = com.tencent.mm.modelvoice.q.H(str, bool);
          w.d("MicroMsg.SceneVoice.Recorder", "Thread Started Record, fullPath: %s, useSpeex: %s", new Object[] { str, Boolean.valueOf(h.this.eyK) });
          if (h.this.eyA.bR(str)) {
            break;
          }
          com.tencent.mm.modelvoice.q.mP(h.this.mFileName);
          h.this.mFileName = null;
          h.this.eyA = null;
          w.e("MicroMsg.SceneVoice.Recorder", "Thread Start Record  Error fileName[" + h.this.mFileName + "]");
          h.this.eyH = bg.Pw();
          w.d("MicroMsg.SceneVoice.Recorder", "Thread Started Record fileName[" + h.this.mFileName + "] time:" + bg.aI(h.this.eyG));
          this.handler.sendEmptyMessageDelayed(0, 1L);
          GMTrace.o(4478577147904L, 33368);
          return;
          bool = false;
        }
        h.this.eyB.requestFocus();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */