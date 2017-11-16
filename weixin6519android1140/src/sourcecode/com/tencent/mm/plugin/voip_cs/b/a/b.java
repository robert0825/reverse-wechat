package com.tencent.mm.plugin.voip_cs.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.brandservice.a.j;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.k.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.ui.VoipBigIconButton;
import com.tencent.mm.plugin.voip.video.MovableVideoView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Timer;
import java.util.TimerTask;

public final class b
  implements TextureView.SurfaceTextureListener, View.OnClickListener, k.a, f
{
  protected static int mScreenHeight;
  protected static int mScreenWidth;
  protected static final int[] qLl;
  public boolean eIE;
  public ae ghS;
  public TextView jRw;
  public TextView jpV;
  private Timer lmz;
  private View noL;
  public com.tencent.mm.plugin.voip.video.a noW;
  public ObservableTextureView noY;
  public ImageButton not;
  private OpenGlView qLJ;
  public OpenGlView qLK;
  public OpenGlRender qLL;
  public OpenGlRender qLM;
  private View.OnClickListener qMQ;
  public VoipBigIconButton qMg;
  public boolean qMy;
  public aj qSA;
  public aj qSB;
  a qSC;
  c qSD;
  b qSE;
  String qSF;
  Drawable qSG;
  public VoipCSMainUI qSj;
  public RelativeLayout qSk;
  public TextView qSl;
  public TextView qSm;
  public TextView qSn;
  private TextView qSo;
  public ImageView qSp;
  public ae qSq;
  private boolean qSr;
  protected long qSs;
  private boolean qSt;
  private boolean qSu;
  public int qSv;
  public int qSw;
  public com.tencent.mm.plugin.voip_cs.c.a qSx;
  public String qSy;
  public String qSz;
  
  static
  {
    GMTrace.i(11271067926528L, 83976);
    qLl = new int[] { -1, R.l.eig, R.l.eil, R.l.eik };
    GMTrace.o(11271067926528L, 83976);
  }
  
  public b(VoipCSMainUI paramVoipCSMainUI)
  {
    GMTrace.i(11264491257856L, 83927);
    this.qMy = false;
    this.eIE = false;
    this.qSr = false;
    this.qSs = -1L;
    this.qSt = false;
    this.qSu = false;
    this.qSv = 60000;
    this.qSw = 5000;
    this.qSx = new com.tencent.mm.plugin.voip_cs.c.a();
    this.qSy = "";
    this.qSz = "";
    this.qSA = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11260867379200L, 83900);
        w.i("MicroMsg.voipcs.VoipCSViewManager", "voipcs invite time out!opposite not responese");
        com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU = 1;
        b.this.wJ(6);
        GMTrace.o(11260867379200L, 83900);
        return true;
      }
    }, false);
    this.qSB = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11259793637376L, 83892);
        b.this.qSm.setText(ab.getContext().getString(R.l.ein));
        b.this.qSn.setVisibility(0);
        com.tencent.mm.plugin.voip_cs.c.a locala = b.this.qSx;
        TextView localTextView = b.this.qSn;
        Object localObject = b.qLl;
        if ((localObject == null) || (localTextView == null)) {
          w.e("MicroMsg.DynamicTextWrap", "textList or tv is null");
        }
        for (;;)
        {
          GMTrace.o(11259793637376L, 83892);
          return true;
          locala.bvA();
          locala.qLA = 0;
          locala.qLy = ((int[])localObject);
          locala.jU = localTextView;
          locala.qLz = 500;
          if (locala.htb != null)
          {
            localObject = locala.htb;
            long l = locala.qLz;
            ((aj)localObject).z(l, l);
          }
          w.j("MicroMsg.DynamicTextWrap", "start textview:" + localTextView, new Object[0]);
        }
      }
    }, false);
    this.qMQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11261941121024L, 83908);
        w.i("MicroMsg.voipcs.VoipCSViewManager", "switch camera");
        b.this.qMg.setEnabled(false);
        if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb > 1) {
          b.this.bwB();
        }
        b.this.qMg.setEnabled(true);
        if (b.this.noW != null) {
          b.this.noW.bvR();
        }
        GMTrace.o(11261941121024L, 83908);
      }
    };
    this.qSC = new a();
    this.qSF = "";
    this.qSG = null;
    this.qSj = paramVoipCSMainUI;
    Object localObject = (WindowManager)paramVoipCSMainUI.getSystemService("window");
    int i = ((WindowManager)localObject).getDefaultDisplay().getHeight() / 5;
    int j = ((WindowManager)localObject).getDefaultDisplay().getWidth() * i / ((WindowManager)localObject).getDefaultDisplay().getHeight();
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
      ((RelativeLayout)paramVoipCSMainUI.findViewById(R.h.bYT)).setPadding(0, 0, 0, BackwardSupportUtil.b.a(paramVoipCSMainUI.vKB.vKW, 40.0F));
    }
    this.qLK = new MovableVideoView(paramVoipCSMainUI.getApplicationContext());
    ((MovableVideoView)this.qLK).dr(j, i);
    this.qLK.setVisibility(8);
    this.qLL = new OpenGlRender(this.qLK, OpenGlRender.qPu);
    this.qLK.a(this.qLL);
    this.qLK.setRenderMode(0);
    if (Build.MODEL.equals("Nexus 6"))
    {
      this.qLK.setZOrderOnTop(true);
      this.jRw = ((TextView)paramVoipCSMainUI.findViewById(R.h.cho));
      this.jRw.setVisibility(0);
      this.lmz = new Timer("voip_cs_talking_time");
      this.qSl = ((TextView)paramVoipCSMainUI.findViewById(R.h.cmo));
      this.qSl.setVisibility(0);
      this.qSm = ((TextView)paramVoipCSMainUI.findViewById(R.h.cmt));
      if (!paramVoipCSMainUI.eXr.equals("1")) {
        break label1037;
      }
      if (!paramVoipCSMainUI.type.equals("video")) {
        break label1018;
      }
      this.qSm.setText(ab.getContext().getString(R.l.ehP));
      label461:
      this.qSm.setVisibility(0);
      this.jpV = ((TextView)paramVoipCSMainUI.findViewById(R.h.cmv));
      this.jpV.setVisibility(0);
      this.qSp = ((ImageView)paramVoipCSMainUI.findViewById(R.h.cmp));
      this.qSp.setVisibility(0);
      this.qSo = ((TextView)paramVoipCSMainUI.findViewById(R.h.cms));
      this.qSn = ((TextView)paramVoipCSMainUI.findViewById(R.h.cmu));
      this.qMg = ((VoipBigIconButton)paramVoipCSMainUI.findViewById(R.h.cmq));
      if ((paramVoipCSMainUI.qSP == null) || (!paramVoipCSMainUI.qSP.equals("1"))) {
        break label1088;
      }
      this.qMg.setVisibility(0);
      this.qMg.setOnClickListener(this.qMQ);
      label594:
      this.ghS = new ae();
      this.qSq = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(11260062072832L, 83894);
          switch (paramAnonymousMessage.what)
          {
          }
          for (;;)
          {
            GMTrace.o(11260062072832L, 83894);
            return;
            if (b.this.qSG != null)
            {
              b.this.qSp.setImageDrawable(b.this.qSG);
              GMTrace.o(11260062072832L, 83894);
              return;
            }
            b.this.qSp.setImageResource(R.g.aVS);
          }
        }
      };
      this.noL = paramVoipCSMainUI.findViewById(R.h.cmm);
      this.not = ((ImageButton)paramVoipCSMainUI.findViewById(R.h.cmr));
      this.qSk = ((RelativeLayout)paramVoipCSMainUI.findViewById(R.h.cmm));
      mScreenWidth = com.tencent.mm.br.a.ef(paramVoipCSMainUI.vKB.vKW);
      mScreenHeight = com.tencent.mm.plugin.voip_cs.c.b.dp(paramVoipCSMainUI.vKB.vKW);
      this.qLJ = ((OpenGlView)paramVoipCSMainUI.findViewById(R.h.cmn));
      this.qLJ.ds(mScreenWidth, mScreenHeight);
      this.qLM = new OpenGlRender(this.qLJ, OpenGlRender.qPt);
      this.qLJ.a(this.qLM);
      this.qLJ.setRenderMode(0);
      this.qLJ.setVisibility(0);
      w.i("MicroMsg.voipcs.VoipCSViewManager", "mScreenHeight %d", new Object[] { Integer.valueOf(mScreenHeight) });
      this.not.setOnClickListener(this);
      this.qSk.addView(this.qLK);
      this.qLK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11260598943744L, 83898);
          paramAnonymousView = b.this;
          if (!b.this.qMy) {}
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView.qMy = bool;
            paramAnonymousView = b.this.iD(b.this.qMy);
            b.this.qLK.dt(paramAnonymousView.x, paramAnonymousView.y);
            GMTrace.o(11260598943744L, 83898);
            return;
          }
        }
      });
      this.qLL.qPa = true;
      this.qLM.qPa = true;
      if (!com.tencent.mm.plugin.voip.b.d.dk(ab.getContext())) {
        com.tencent.mm.plugin.voip.b.d.dl(ab.getContext());
      }
      paramVoipCSMainUI = ab.bPV();
      this.qSy = paramVoipCSMainUI.getString(bwy(), "");
      if ((this.qSj.ied == null) || (this.qSj.ied.equals(""))) {
        break label1100;
      }
      JV(this.qSj.ied);
    }
    for (;;)
    {
      this.qSz = paramVoipCSMainUI.getString(bwz(), "");
      if (!com.tencent.pb.common.c.h.isNullOrEmpty(this.qSz)) {
        JU(this.qSz);
      }
      paramVoipCSMainUI = com.tencent.mm.plugin.voip_cs.b.b.bwp();
      localObject = this.qSj.qSc;
      w.d("MicroMsg.voipcs.VoipCSService", "start getBizInfo for username:" + (String)localObject);
      at.wS().a(455, paramVoipCSMainUI);
      paramVoipCSMainUI = new j((String)localObject);
      at.wS().a(paramVoipCSMainUI, 0);
      GMTrace.o(11264491257856L, 83927);
      return;
      this.qLK.setZOrderMediaOverlay(true);
      break;
      label1018:
      this.qSm.setText(ab.getContext().getString(R.l.ehQ));
      break label461;
      label1037:
      if (paramVoipCSMainUI.type.equals("video"))
      {
        this.qSm.setText(ab.getContext().getString(R.l.ehR));
        break label461;
      }
      this.qSm.setText(ab.getContext().getString(R.l.ehQ));
      break label461;
      label1088:
      this.qMg.setVisibility(8);
      break label594;
      label1100:
      if (!com.tencent.pb.common.c.h.isNullOrEmpty(this.qSy)) {
        JV(this.qSy);
      }
    }
  }
  
  public static Drawable JW(String paramString)
  {
    GMTrace.i(11266236088320L, 83940);
    try
    {
      paramString = Drawable.createFromStream((InputStream)new URL(paramString).getContent(), "urlDrawable");
      GMTrace.o(11266236088320L, 83940);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.voipcs.VoipCSViewManager", "parse Drawable faill!");
      GMTrace.o(11266236088320L, 83940);
    }
    return null;
  }
  
  protected static String ax(long paramLong)
  {
    GMTrace.i(11266370306048L, 83941);
    String str = String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
    GMTrace.o(11266370306048L, 83941);
    return str;
  }
  
  private static float iA(boolean paramBoolean)
  {
    GMTrace.i(11265296564224L, 83933);
    float f1 = 0.74766356F;
    float f2;
    if (paramBoolean) {
      f2 = f1;
    }
    for (;;)
    {
      try
      {
        localObject = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_capInfo;
        f2 = f1;
        if (localObject != null)
        {
          f2 = f1;
          localObject = ByteBuffer.wrap((byte[])localObject);
          f2 = f1;
          if (((ByteBuffer)localObject).getInt() > 65535)
          {
            f2 = f1;
            ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN);
          }
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          float f3 = ((ByteBuffer)localObject).getInt() / 100.0F;
          if (f3 != 0.0F) {
            f1 = f3;
          }
          f2 = f1;
          w.d("MicroMsg.voipcs.VoipCSViewManager", "use rate: %s, changed: %s", new Object[] { Float.valueOf(f1), Boolean.valueOf(paramBoolean) });
          f2 = f1;
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        w.e("MicroMsg.voipcs.VoipCSViewManager", "update failed: " + localException.getMessage());
        continue;
      }
      GMTrace.o(11265296564224L, 83933);
      return f2;
      f2 = f1;
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJs;
    }
  }
  
  private static int wK(int paramInt)
  {
    GMTrace.i(11266638741504L, 83943);
    if (paramInt == 1)
    {
      paramInt = R.l.ehO;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 0)
    {
      paramInt = R.l.ehT;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if ((paramInt == -1) || (paramInt == 5))
    {
      paramInt = R.l.eie;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if ((paramInt == 403) || (paramInt == 404))
    {
      paramInt = R.l.eim;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 6)
    {
      paramInt = R.l.eih;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 1001)
    {
      paramInt = R.l.eid;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 10)
    {
      paramInt = R.l.ehS;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb < 2)
    {
      paramInt = R.l.ehN;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    paramInt = R.l.ehT;
    GMTrace.o(11266638741504L, 83943);
    return paramInt;
  }
  
  public final void JU(String paramString)
  {
    GMTrace.i(11264625475584L, 83928);
    if (this.qSj.qSS) {}
    for (paramString = paramString + ab.getContext().getString(R.l.ehJ);; paramString = paramString + ab.getContext().getString(R.l.ehK))
    {
      this.jpV.setText(paramString);
      GMTrace.o(11264625475584L, 83928);
      return;
    }
  }
  
  public final void JV(String paramString)
  {
    GMTrace.i(11264759693312L, 83929);
    if (!com.tencent.pb.common.c.h.isNullOrEmpty(paramString))
    {
      this.qSE = new b();
      if ((this.qSj.ied == null) || (this.qSj.ied.equals(""))) {
        break label86;
      }
    }
    label86:
    for (this.qSF = this.qSj.ied;; this.qSF = paramString)
    {
      e.b(this.qSE, "VOIPCS_netPic", 10);
      GMTrace.o(11264759693312L, 83929);
      return;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11267041394688L, 83946);
    w.d("MicroMsg.voipcs.VoipCSViewManager", "receive frame data , isPause : " + this.eIE);
    if (this.eIE)
    {
      GMTrace.o(11267041394688L, 83946);
      return;
    }
    if (this.qSC.nng == null)
    {
      this.qSC.w = paramInt1;
      this.qSC.h = paramInt2;
      this.qSC.nng = new int[this.qSC.w * this.qSC.h];
    }
    int i;
    if (this.noW.bvT())
    {
      i = OpenGlRender.qPs;
      if (!this.noW.bvU()) {
        break label291;
      }
    }
    label291:
    for (int j = OpenGlRender.qPr;; j = OpenGlRender.qPq)
    {
      if (this.qSt)
      {
        int k = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.videoEncodeToSend(paramArrayOfByte, paramArrayOfByte.length, paramInt1, paramInt2, paramInt3);
        w.d("MicroMsg.voipcs.VoipCSViewManager", "videoEncodeToSend , ret = " + k);
        v2protocal localv2protocal = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO;
        localv2protocal.qKB += 1;
      }
      com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.videoEncodeToLocal(paramArrayOfByte, (int)paramLong, paramInt1, paramInt2, paramInt3, 0, 75, this.qSC.nng);
      if (OpenGlRender.qPE != 1) {
        break label336;
      }
      if (!this.qMy) {
        break label299;
      }
      this.qLL.a(this.qSC.nng, paramInt1, paramInt2, OpenGlRender.qPl + i + j);
      GMTrace.o(11267041394688L, 83946);
      return;
      i = 0;
      break;
    }
    label299:
    this.qLM.a(this.qSC.nng, paramInt1, paramInt2, OpenGlRender.qPl + i + j);
    GMTrace.o(11267041394688L, 83946);
    return;
    label336:
    if (OpenGlRender.qPE == 2)
    {
      if (this.qMy)
      {
        this.qLL.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.qPp + i + j);
        GMTrace.o(11267041394688L, 83946);
        return;
      }
      this.qLM.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.qPp + i + j);
    }
    GMTrace.o(11267041394688L, 83946);
  }
  
  public final void aHL()
  {
    GMTrace.i(11266101870592L, 83939);
    this.qSA.stopTimer();
    this.qSB.stopTimer();
    this.qSx.bvA();
    this.qSn.setVisibility(8);
    this.qSm.setText(R.l.eij);
    this.qSl.setText(R.l.ehX);
    wI(0);
    this.noL.setOnClickListener(this);
    if ((this.qSj.qSQ != null) && (this.qSj.qSQ.equals("1")))
    {
      this.qLK.setVisibility(0);
      this.qMy = true;
      localObject = iD(this.qMy);
      ((MovableVideoView)this.qLK).dr(((Point)localObject).x, ((Point)localObject).y);
      bwC();
    }
    bwB();
    this.qSt = true;
    if (this.lmz == null) {
      this.lmz = new Timer("voip_cs_talking_time");
    }
    if (this.qSr)
    {
      GMTrace.o(11266101870592L, 83939);
      return;
    }
    if (this.qSs == -1L) {
      this.qSs = bg.Pu();
    }
    this.qSr = true;
    Object localObject = new TimerTask()
    {
      public final void run()
      {
        GMTrace.i(11263820169216L, 83922);
        b.this.ghS.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11259525201920L, 83890);
            String str = b.ax(bg.aG(b.this.qSs));
            b.this.jRw.setText(str);
            GMTrace.o(11259525201920L, 83890);
          }
        });
        GMTrace.o(11263820169216L, 83922);
      }
    };
    this.lmz.schedule((TimerTask)localObject, 1000L, 1000L);
    k.buC().buD();
    k.buC().qHT = this;
    GMTrace.o(11266101870592L, 83939);
  }
  
  public final void aHM()
  {
    GMTrace.i(11266772959232L, 83944);
    this.qSo.setVisibility(0);
    this.qSo.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.qSo.setBackgroundResource(R.g.bbP);
    this.qSo.setCompoundDrawables(null, null, null, null);
    this.qSo.setCompoundDrawablePadding(0);
    this.qSo.setText(wK(1001));
    GMTrace.o(11266772959232L, 83944);
  }
  
  public final void aHN()
  {
    GMTrace.i(11266907176960L, 83945);
    this.qSo.setVisibility(8);
    GMTrace.o(11266907176960L, 83945);
  }
  
  public final void aRZ()
  {
    GMTrace.i(11267175612416L, 83947);
    w.e("MicroMsg.voipcs.VoipCSViewManager", "init camera fail！");
    GMTrace.o(11267175612416L, 83947);
  }
  
  public final void bwA()
  {
    GMTrace.i(11265699217408L, 83936);
    w.i("MicroMsg.voipcs.VoipCSViewManager", "stop capture render");
    if (this.noY != null)
    {
      this.qSk.removeView(this.noY);
      this.noY = null;
    }
    if (this.noW != null)
    {
      this.noW.stopCapture();
      com.tencent.mm.plugin.voip.video.a.bvS();
      this.noW = null;
    }
    GMTrace.o(11265699217408L, 83936);
  }
  
  public final void bwB()
  {
    GMTrace.i(11265833435136L, 83937);
    w.i("MicroMsg.voipcs.VoipCSViewManager", "trigger dismiss button");
    this.ghS.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11262209556480L, 83910);
        w.i("MicroMsg.voipcs.VoipCSViewManager", "dismiss button");
        if (b.this.qSj.isFinishing())
        {
          GMTrace.o(11262209556480L, 83910);
          return;
        }
        b.this.not.setVisibility(8);
        b.this.jRw.setVisibility(8);
        b.this.qSl.setVisibility(8);
        b.this.wI(8);
        b.this.iC(false);
        GMTrace.o(11262209556480L, 83910);
      }
    }, 10000L);
    GMTrace.o(11265833435136L, 83937);
  }
  
  public final void bwC()
  {
    GMTrace.i(11267309830144L, 83948);
    bwD();
    this.qSD = new c();
    e.b(this.qSD, "VOIPCS_VideoDecode", 10);
    w.d("MicroMsg.voipcs.VoipCSViewManager", "start video decode thread..");
    GMTrace.o(11267309830144L, 83948);
  }
  
  public final void bwD()
  {
    GMTrace.i(11267444047872L, 83949);
    if (this.qSD != null)
    {
      w.d("MicroMsg.voipcs.VoipCSViewManager", "stop videodecode thread...");
      this.qSD.qGd = true;
      e.remove(this.qSD);
      this.qSD = null;
    }
    GMTrace.o(11267444047872L, 83949);
  }
  
  public final String bwy()
  {
    GMTrace.i(11264893911040L, 83930);
    String str = "voip_cs_headImageUrl_" + this.qSj.qSc;
    GMTrace.o(11264893911040L, 83930);
    return str;
  }
  
  public final String bwz()
  {
    GMTrace.i(11265028128768L, 83931);
    String str = "voip_cs_nickname_" + this.qSj.qSc;
    GMTrace.o(11265028128768L, 83931);
    return str;
  }
  
  public final void iC(boolean paramBoolean)
  {
    GMTrace.i(11265967652864L, 83938);
    if (Build.MANUFACTURER.equalsIgnoreCase("sony"))
    {
      w.i("MicroMsg.voipcs.VoipCSViewManager", "sony is not compatible,so we return.");
      GMTrace.o(11265967652864L, 83938);
      return;
    }
    if (!paramBoolean)
    {
      this.qSj.getWindow().setFlags(1024, 1024);
      GMTrace.o(11265967652864L, 83938);
      return;
    }
    this.qSj.getWindow().clearFlags(1024);
    GMTrace.o(11265967652864L, 83938);
  }
  
  public final Point iD(boolean paramBoolean)
  {
    GMTrace.i(11265162346496L, 83932);
    int i = ((WindowManager)this.qSj.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
    float f = i;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Point localPoint = new Point((int)(iA(paramBoolean) * f), i);
      GMTrace.o(11265162346496L, 83932);
      return localPoint;
    }
  }
  
  public final void onClick(View paramView)
  {
    boolean bool = false;
    GMTrace.i(11265430781952L, 83934);
    if (paramView.getId() == R.h.cmr)
    {
      if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb < 2) {}
      for (com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU = 2;; com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU = 4)
      {
        paramView = com.tencent.mm.plugin.voip_cs.b.b.bwq();
        paramView.qRe = 1;
        paramView.qRB = 1;
        paramView.qRf = ((int)(System.currentTimeMillis() / 1000L));
        paramView = com.tencent.mm.plugin.voip_cs.b.b.bwq();
        w.d("MicroMsg.VoipCSReportHelper", "selfCancel");
        if (paramView.qRy == 0)
        {
          paramView.qRt = 3;
          if ((paramView.qRC == 0L) && (paramView.qRO != 0)) {
            paramView.qRC = ((int)(System.currentTimeMillis() / 1000L) - paramView.qRO);
          }
        }
        com.tencent.mm.plugin.voip_cs.b.b.bwq().bwr();
        w.d("MicroMsg.voipcs.VoipCSViewManager", "user click hangup button!");
        wJ(0);
        GMTrace.o(11265430781952L, 83934);
        return;
      }
    }
    if (this.not.getVisibility() == 0) {}
    for (int i = 8;; i = 0)
    {
      this.not.setVisibility(i);
      this.jRw.setVisibility(i);
      this.qSl.setVisibility(i);
      wI(i);
      if (i == 0) {
        bool = true;
      }
      iC(bool);
      GMTrace.o(11265430781952L, 83934);
      return;
    }
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(11267578265600L, 83950);
    GMTrace.o(11267578265600L, 83950);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(11267846701056L, 83952);
    GMTrace.o(11267846701056L, 83952);
    return false;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(11267712483328L, 83951);
    GMTrace.o(11267712483328L, 83951);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(11267980918784L, 83953);
    GMTrace.o(11267980918784L, 83953);
  }
  
  public final void wI(int paramInt)
  {
    GMTrace.i(11265564999680L, 83935);
    if ((this.qSj.qSP != null) && (this.qSj.qSP.equals("1")))
    {
      this.qMg.setVisibility(paramInt);
      GMTrace.o(11265564999680L, 83935);
      return;
    }
    this.qMg.setVisibility(8);
    GMTrace.o(11265564999680L, 83935);
  }
  
  public final void wJ(int paramInt)
  {
    GMTrace.i(11266504523776L, 83942);
    w.i("MicroMsg.voipcs.VoipCSViewManager", "onFinish for action:" + paramInt);
    if (this.lmz != null)
    {
      this.lmz.cancel();
      this.lmz = null;
    }
    if (!this.qSA.bQn()) {
      this.qSA.stopTimer();
    }
    if (!this.qSB.bQn()) {
      this.qSB.stopTimer();
    }
    this.qSx.bvA();
    this.qSr = false;
    this.qSo.setVisibility(0);
    this.qSo.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.qSo.setBackgroundResource(R.g.bbP);
    this.qSo.setCompoundDrawables(null, null, null, null);
    this.qSo.setCompoundDrawablePadding(0);
    this.qSo.setText(wK(paramInt));
    if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 2) {
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11264357040128L, 83926);
          a locala = a.bww();
          if (locala.qIy != null) {
            locala.qIy.d(R.k.cOi, false, 0);
          }
          GMTrace.o(11264357040128L, 83926);
        }
      }, "VoipCS_play_end_sound");
    }
    this.ghS.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11260330508288L, 83896);
        b.this.qSj.finish();
        GMTrace.o(11260330508288L, 83896);
      }
    }, 2000L);
    GMTrace.o(11266504523776L, 83942);
  }
  
  private final class a
  {
    public int h;
    public int[] nng;
    public int w;
    
    public a()
    {
      GMTrace.i(11263954386944L, 83923);
      GMTrace.o(11263954386944L, 83923);
    }
  }
  
  final class b
    implements Runnable
  {
    b()
    {
      GMTrace.i(11262343774208L, 83911);
      GMTrace.o(11262343774208L, 83911);
    }
    
    public final void run()
    {
      GMTrace.i(11262477991936L, 83912);
      b.this.qSG = b.JW(b.this.qSF);
      Message localMessage = new Message();
      localMessage.what = 12;
      b.this.qSq.sendMessage(localMessage);
      e.remove(b.this.qSE);
      GMTrace.o(11262477991936L, 83912);
    }
  }
  
  final class c
    implements Runnable
  {
    boolean qGd;
    
    c()
    {
      GMTrace.i(11262612209664L, 83913);
      this.qGd = false;
      GMTrace.o(11262612209664L, 83913);
    }
    
    public final void run()
    {
      GMTrace.i(11262746427392L, 83914);
      if ((!this.qGd) && (!b.this.eIE))
      {
        int i;
        int j;
        if (com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.videoDecode(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKi) == 1)
        {
          i = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_remoteImgWidth;
          j = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_remoteImgHeight;
          if (OpenGlRender.qPE != 1) {
            break label168;
          }
          if (!b.this.qMy) {
            break label137;
          }
          b.this.qLM.a(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKi, i, j, OpenGlRender.qPk + OpenGlRender.qPq);
        }
        for (;;)
        {
          try
          {
            Thread.sleep(20L);
          }
          catch (InterruptedException localInterruptedException)
          {
            w.printErrStackTrace("MicroMsg.voipcs.VoipCSViewManager", localInterruptedException, "", new Object[0]);
          }
          break;
          label137:
          b.this.qLL.a(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKi, i, j, OpenGlRender.qPk + OpenGlRender.qPq);
          continue;
          label168:
          if (b.this.qMy) {
            b.this.qLM.a(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKi, i, j, OpenGlRender.qPn + OpenGlRender.qPq);
          } else {
            b.this.qLL.a(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qKi, i, j, OpenGlRender.qPn + OpenGlRender.qPq);
          }
        }
      }
      GMTrace.o(11262746427392L, 83914);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */