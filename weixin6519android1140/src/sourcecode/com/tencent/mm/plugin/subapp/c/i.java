package com.tencent.mm.plugin.subapp.c;

import android.content.ContentValues;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.h.a;
import com.tencent.mm.ad.h.b;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;

public final class i
  implements com.tencent.mm.ad.h, e.a
{
  private static int ezm;
  public String euR;
  public com.tencent.mm.modelvoice.k euT;
  private int joS;
  public long lkz;
  protected h.b qst;
  protected h.a qsu;
  public boolean qsv;
  private a qsw;
  public long qsx;
  public int qsy;
  private aj qsz;
  
  static
  {
    GMTrace.i(5835786813440L, 43480);
    ezm = 100;
    GMTrace.o(5835786813440L, 43480);
  }
  
  public i()
  {
    GMTrace.i(5832565587968L, 43456);
    this.euT = null;
    this.qsu = null;
    this.joS = 0;
    this.euR = "";
    this.qsv = false;
    this.lkz = 0L;
    this.qsx = 0L;
    this.qsy = 0;
    this.qsz = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5829478580224L, 43433);
        String str = i.this.euR;
        g localg;
        if (str != null)
        {
          localg = h.Jx(str);
          if (localg != null) {
            break label93;
          }
          w.d("MicroMsg.VoiceRemindLogic", "startSend null record : " + str);
        }
        for (;;)
        {
          d.brF().run();
          w.d("MicroMsg.VoiceRemindRecorder", "Start Send fileName :" + i.this.euR);
          GMTrace.o(5829478580224L, 43433);
          return false;
          label93:
          if (localg.field_status == 1)
          {
            localg.field_status = 2;
            localg.eQl = 64;
            h.a(localg);
          }
        }
      }
    }, true);
    GMTrace.o(5832565587968L, 43456);
  }
  
  public static boolean mP(String paramString)
  {
    GMTrace.i(16029891690496L, 119432);
    boolean bool = h.mP(paramString);
    GMTrace.o(16029891690496L, 119432);
    return bool;
  }
  
  public final void a(h.a parama)
  {
    GMTrace.i(5834041982976L, 43467);
    this.qsu = parama;
    GMTrace.o(5834041982976L, 43467);
  }
  
  public final void a(h.b paramb)
  {
    GMTrace.i(5834176200704L, 43468);
    this.qst = paramb;
    GMTrace.o(5834176200704L, 43468);
  }
  
  public final boolean bS(String paramString)
  {
    GMTrace.i(5833236676608L, 43461);
    String str = k.mj(q.zE());
    Object localObject = new g();
    ((g)localObject).field_filename = str;
    ((g)localObject).field_user = paramString;
    ((g)localObject).field_createtime = (System.currentTimeMillis() / 1000L);
    ((g)localObject).field_clientid = str;
    ((g)localObject).field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    ((g)localObject).field_status = 1;
    ((g)localObject).field_human = q.zE();
    ((g)localObject).eQl = -1;
    paramString = d.brE();
    w.d("MicroMsg.VoiceRemindStorage", "VoiceRemindStorage Insert");
    localObject = ((g)localObject).qL();
    int i = (int)paramString.fTZ.insert("VoiceRemindInfo", "", (ContentValues)localObject);
    w.d("MicroMsg.VoiceRemindStorage", "VoiceRemindStorage Insert result" + i);
    paramString = str;
    if (i == -1) {
      paramString = null;
    }
    this.euR = paramString;
    at.AS().a(this);
    i = at.AS().sf();
    this.qsv = false;
    if (i != 0) {
      dc(100);
    }
    for (;;)
    {
      GMTrace.o(5833236676608L, 43461);
      return false;
      new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(5838873821184L, 43503);
          w.d("MicroMsg.VoiceRemindRecorder", " Recorder handleMessage");
          if (i.this.qsv)
          {
            GMTrace.o(5838873821184L, 43503);
            return;
          }
          at.AS().b(i.this);
          at.AS().sg();
          i.this.dc(200);
          GMTrace.o(5838873821184L, 43503);
        }
      }.sendEmptyMessageDelayed(0, 50L);
    }
  }
  
  public final boolean cancel()
  {
    GMTrace.i(5833370894336L, 43462);
    w.d("MicroMsg.VoiceRemindRecorder", "cancel Record :" + this.euR);
    try
    {
      w.d("MicroMsg.VoiceRemindRecorder", "stop synchronized Record :" + this.euR);
      if (this.euT != null) {
        this.euT.qn();
      }
      String str = this.euR;
      if (str != null)
      {
        w.d("MicroMsg.VoiceRemindLogic", "Mark Canceled fileName[" + str + "]");
        g localg = h.Jx(str);
        if (localg != null)
        {
          localg.field_status = 8;
          localg.field_totallen = c.mm(h.aA(str, false));
          localg.eQl = 64;
          h.a(localg);
        }
      }
      d.brF().run();
      this.euR = "";
      GMTrace.o(5833370894336L, 43462);
      return true;
    }
    finally {}
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(5832699805696L, 43457);
    w.d("MicroMsg.VoiceRemindRecorder", " Recorder onBluetoothHeadsetStateChange :" + paramInt);
    if (this.qsv)
    {
      GMTrace.o(5832699805696L, 43457);
      return;
    }
    this.qsv = true;
    at.AS().b(this);
    this.euT = new com.tencent.mm.modelvoice.k();
    new h.a()
    {
      public final void onError()
      {
        GMTrace.i(5838202732544L, 43498);
        w.e("MicroMsg.VoiceRemindRecorder", "Record Failed file:" + i.this.euR);
        i.mP(i.this.euR);
        if (i.this.qsu != null) {
          i.this.qsu.onError();
        }
        GMTrace.o(5838202732544L, 43498);
      }
    };
    this.qsw = new a();
    com.tencent.mm.sdk.f.e.post(this.qsw, "VoiceRemindRecorder_record");
    this.qsy = 1;
    this.qsz.z(3000L, 3000L);
    w.d("MicroMsg.VoiceRemindRecorder", "start end time:" + bg.aI(this.qsx));
    GMTrace.o(5832699805696L, 43457);
  }
  
  public final String getFileName()
  {
    GMTrace.i(5832968241152L, 43459);
    String str = this.euR;
    GMTrace.o(5832968241152L, 43459);
    return str;
  }
  
  public final int getMaxAmplitude()
  {
    GMTrace.i(5832834023424L, 43458);
    if (this.euT != null)
    {
      int i = this.euT.getMaxAmplitude();
      if (i > ezm) {
        ezm = i;
      }
      w.d("getMaxAmplitude", " map: " + i + " max:" + ezm + " per:" + i * 100 / ezm);
      i = i * 100 / ezm;
      GMTrace.o(5832834023424L, 43458);
      return i;
    }
    GMTrace.o(5832834023424L, 43458);
    return 0;
  }
  
  public final boolean isRecording()
  {
    GMTrace.i(5833102458880L, 43460);
    if (this.euT == null)
    {
      GMTrace.o(5833102458880L, 43460);
      return false;
    }
    if (this.euT.mStatus == 1)
    {
      GMTrace.o(5833102458880L, 43460);
      return true;
    }
    GMTrace.o(5833102458880L, 43460);
    return false;
  }
  
  public final int qC()
  {
    GMTrace.i(5833907765248L, 43466);
    int i = this.joS;
    GMTrace.o(5833907765248L, 43466);
    return i;
  }
  
  public final long qD()
  {
    GMTrace.i(5833639329792L, 43464);
    if (this.lkz <= 0L)
    {
      GMTrace.o(5833639329792L, 43464);
      return 0L;
    }
    long l = bg.aI(this.lkz);
    GMTrace.o(5833639329792L, 43464);
    return l;
  }
  
  public final int qF()
  {
    GMTrace.i(5834310418432L, 43469);
    GMTrace.o(5834310418432L, 43469);
    return 0;
  }
  
  public final boolean qt()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    GMTrace.i(5833505112064L, 43463);
    at.AS().sg();
    w.d("MicroMsg.VoiceRemindRecorder", "stop Record :" + this.euR);
    try
    {
      w.d("MicroMsg.VoiceRemindRecorder", "stop synchronized Record :" + this.euR);
      if (this.euT != null) {
        this.euT.qn();
      }
      if (this.qsy != 2)
      {
        h.mP(this.euR);
        this.euR = null;
        w.d("MicroMsg.VoiceRemindRecorder", "Stop " + this.euR + " by not onPart: " + bg.aI(this.qsx));
        bool1 = bool2;
        this.qsy = -1;
        GMTrace.o(5833505112064L, 43463);
        return bool1;
      }
    }
    finally {}
    this.joS = ((int)qD());
    if ((this.joS < 800L) || (this.joS < 1000L))
    {
      w.d("MicroMsg.VoiceRemindRecorder", "Stop " + this.euR + " by voiceLen: " + this.joS);
      h.mP(this.euR);
      this.euR = "";
      bool1 = false;
    }
    String str;
    int i;
    g localg;
    for (;;)
    {
      this.euR = "";
      break;
      str = this.euR;
      i = this.joS;
      if (str != null)
      {
        w.d("MicroMsg.VoiceRemindLogic", "StopRecord fileName[" + str + "]");
        localg = h.Jx(str);
        if (localg != null)
        {
          if ((localg.field_status != 97) && (localg.field_status != 98)) {
            localg.field_status = 3;
          }
          localg.field_totallen = c.mm(h.aA(str, false));
          if (localg.field_totallen > 0) {
            break label415;
          }
          h.mp(str);
        }
      }
      d.brF().run();
      w.d("MicroMsg.VoiceRemindRecorder", "Stop file success: " + this.euR);
    }
    label415:
    localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localg.field_voicelenght = i;
    localg.eQl = 3424;
    au localau = new au();
    localau.db(localg.field_user);
    localau.setType(34);
    localau.dC(1);
    localau.dc(str);
    if (localg.field_status == 97)
    {
      localau.dB(2);
      localau.setContent(f.b(localg.field_human, localg.field_voicelenght, false));
    }
    for (;;)
    {
      localau.E(bc.gR(localg.field_user));
      localg.field_msglocalid = ((int)bc.i(localau));
      h.a(localg);
      break;
      if (localg.field_status == 98)
      {
        localau.dB(5);
        localau.setContent(f.b(localg.field_human, -1L, true));
      }
      else
      {
        localau.dB(1);
      }
    }
  }
  
  public final void reset()
  {
    GMTrace.i(5833773547520L, 43465);
    if (this.euT != null)
    {
      this.euT.qn();
      w.e("MicroMsg.VoiceRemindRecorder", "Reset recorder.stopReocrd");
    }
    this.euR = "";
    this.qsx = 0L;
    this.qsw = null;
    this.qsy = 0;
    this.lkz = 0L;
    GMTrace.o(5833773547520L, 43465);
  }
  
  private final class a
    implements Runnable
  {
    ae handler;
    
    public a()
    {
      GMTrace.i(5839276474368L, 43506);
      this.handler = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(5843034570752L, 43534);
          if (i.this.qsy <= 0)
          {
            GMTrace.o(5843034570752L, 43534);
            return;
          }
          paramAnonymousMessage = new StringBuilder("On Part :");
          if (i.this.qst == null) {}
          for (boolean bool = true;; bool = false)
          {
            w.d("MicroMsg.VoiceRemindRecorder", bool);
            i.this.qsy = 2;
            if (i.this.qst != null) {
              i.this.qst.DB();
            }
            GMTrace.o(5843034570752L, 43534);
            return;
          }
        }
      };
      GMTrace.o(5839276474368L, 43506);
    }
    
    public final void run()
    {
      GMTrace.i(5839410692096L, 43507);
      if (i.this.euT == null)
      {
        w.e("MicroMsg.VoiceRemindRecorder", "Stop Record Failed recorder == null");
        GMTrace.o(5839410692096L, 43507);
        return;
      }
      synchronized (i.this)
      {
        if (!i.this.euT.bR(h.aA(i.this.euR, true)))
        {
          i.mP(i.this.euR);
          i.this.euR = null;
          w.d("MicroMsg.VoiceRemindRecorder", "Thread Start Record  Error fileName[" + i.this.euR + "]");
          i.this.euT = null;
        }
        i.this.lkz = bg.Pw();
        w.d("MicroMsg.VoiceRemindRecorder", "Thread Started Record fileName[" + i.this.euR + "] time:" + bg.aI(i.this.qsx));
        this.handler.sendEmptyMessageDelayed(0, 1L);
        GMTrace.o(5839410692096L, 43507);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */