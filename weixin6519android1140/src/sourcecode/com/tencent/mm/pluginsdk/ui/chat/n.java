package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bd.b.b;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.a;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.b;
import com.tencent.mm.pluginsdk.ui.VoiceInputScrollView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Set;

public final class n
  extends LinearLayout
{
  String eyD;
  private Context mContext;
  private Button mQO;
  private TelephonyManager mij;
  PhoneStateListener mik;
  private boolean tBA;
  private boolean tBB;
  private int tBC;
  private final String tBD;
  private boolean tBE;
  private boolean tBF;
  private long tBG;
  private long tBH;
  private long tBI;
  private boolean tBJ;
  private boolean tBK;
  private final int tBL;
  private boolean tBM;
  public String tBN;
  private Toast tBO;
  private Set<String> tBP;
  private com.tencent.mm.pluginsdk.ui.n tBQ;
  private c<sc> tBR;
  private b tBS;
  private VoiceInputLayout.b tBT;
  private boolean tBU;
  private VoiceInputLayout tBo;
  private ImageButton tBp;
  private Button tBq;
  public a tBr;
  private MMEditText tBs;
  private VoiceInputScrollView tBt;
  private TextView tBu;
  private long tBv;
  private boolean tBw;
  private float tBx;
  private float tBy;
  private boolean tBz;
  private VoiceInputLayout.a tvB;
  private boolean tvG;
  private MMEditText tvM;
  private int tyO;
  private i tzz;
  
  public n(Context paramContext, boolean paramBoolean, MMEditText paramMMEditText)
  {
    super(paramContext);
    GMTrace.i(16674405220352L, 124234);
    this.tBs = null;
    this.tBv = 0L;
    this.tBw = false;
    this.tBx = 0.0F;
    this.tBy = 0.0F;
    this.tBz = false;
    this.tBA = false;
    this.tvG = false;
    this.tBB = false;
    this.tBC = 300;
    this.tBD = "voiceinput_downdistance_content";
    this.tBE = false;
    this.tBF = false;
    this.tBG = 0L;
    this.tBH = 0L;
    this.tBI = 0L;
    this.tBJ = false;
    this.tBK = false;
    this.tBL = 2;
    this.tBM = false;
    this.tBN = "";
    this.tBP = new HashSet();
    this.eyD = "";
    this.tvB = new VoiceInputLayout.a()
    {
      public final void bLn()
      {
        GMTrace.i(16680713453568L, 124281);
        n.b(n.this, R.l.egJ);
        GMTrace.o(16680713453568L, 124281);
      }
    };
    this.mik = new PhoneStateListener()
    {
      public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(16681250324480L, 124285);
        super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
        int i = -1;
        if (n.k(n.this) != null) {
          i = n.k(n.this).bLm();
        }
        w.d("MicroMsg.VoiceInputPanel", "onCallStateChanged :%s, currentState: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(i) });
        if (i != 2)
        {
          GMTrace.o(16681250324480L, 124285);
          return;
        }
        n.this.pause();
        GMTrace.o(16681250324480L, 124285);
      }
    };
    this.tBT = new VoiceInputLayout.b()
    {
      public final void W(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16680445018112L, 124279);
        w.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), Long.valueOf(System.currentTimeMillis()) });
        n.s(n.this);
        n.g(n.this).a(n.f(n.this));
        n.h(n.this);
        if ((n.o(n.this) instanceof Activity)) {
          ((Activity)n.o(n.this)).getWindow().clearFlags(128);
        }
        n.c(n.this, paramAnonymousInt1);
        if (paramAnonymousInt1 == 12) {
          n.b(n.this, R.l.egI);
        }
        for (;;)
        {
          n.j(n.this).jZ(false);
          n.f(n.this).setHint(null);
          GMTrace.o(16680445018112L, 124279);
          return;
          n.b(n.this, R.l.cSM);
        }
      }
      
      public final void b(String[] paramAnonymousArrayOfString, Set<String> paramAnonymousSet)
      {
        GMTrace.i(16680310800384L, 124278);
        if ((paramAnonymousArrayOfString != null) && (paramAnonymousArrayOfString.length > 0) && (paramAnonymousArrayOfString[0].length() > 0))
        {
          if (n.t(n.this))
          {
            n.b(n.this, false);
            n.u(n.this);
          }
          n.g(n.this).a(n.f(n.this), paramAnonymousArrayOfString[0], true);
          if (n.f(n.this).getText().length() != 0)
          {
            n.f(n.this).setCursorVisible(true);
            n.f(n.this).requestFocus();
            bg.da(n.k(n.this));
          }
          if ((!n.v(n.this)) && (paramAnonymousArrayOfString[0].length() != 0))
          {
            n.c(n.this, true);
            n.b(n.this, System.currentTimeMillis());
            w.d("VOICEDEBUG", "First Text Time = %s Corss Time = %s", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(n.w(n.this) - n.l(n.this)) });
          }
          n.x(n.this).addAll(paramAnonymousSet);
        }
        GMTrace.o(16680310800384L, 124278);
      }
      
      public final void bLo()
      {
        GMTrace.i(16679639711744L, 124273);
        n.a(n.this, System.currentTimeMillis());
        w.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", new Object[] { Long.valueOf(n.l(n.this)) });
        w.d("VOICEDEBUG", "Start Record Time = %s", new Object[] { Long.valueOf(n.l(n.this)) });
        n.c(n.this, false);
        n.d(n.this, true);
        n.b(n.this, true);
        n.b(n.this, 0L);
        n.m(n.this);
        n.h(n.this);
        n.n(n.this).setVisibility(8);
        n.d(n.this, false);
        n.g(n.this).tvv = 3;
        n.g(n.this).b(n.f(n.this));
        n.ctZ();
        if (n.f(n.this) != null)
        {
          if ((n.f(n.this).getText() != null) && (n.f(n.this).getText().length() > 0)) {
            n.f(n.this).setCursorVisible(true);
          }
          n.f(n.this).requestFocus();
          bg.da(n.k(n.this));
        }
        if ((n.o(n.this) instanceof Activity)) {
          ((Activity)n.o(n.this)).getWindow().addFlags(128);
        }
        n.p(n.this).setVisibility(4);
        n.q(n.this).setVisibility(4);
        n.r(n.this).setVisibility(8);
        n.f(n.this).setHint(n.this.getResources().getString(R.l.egH));
        n.j(n.this).jZ(true);
        GMTrace.o(16679639711744L, 124273);
      }
      
      public final void bLp()
      {
        GMTrace.i(16679773929472L, 124274);
        n.j(n.this).jZ(false);
        n.f(n.this).setHint(null);
        GMTrace.o(16679773929472L, 124274);
      }
      
      public final void bLq()
      {
        GMTrace.i(16679908147200L, 124275);
        w.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + System.currentTimeMillis());
        n.s(n.this);
        n.g(n.this).a(n.f(n.this));
        n.h(n.this);
        if ((n.o(n.this) instanceof Activity)) {
          ((Activity)n.o(n.this)).getWindow().clearFlags(128);
        }
        n.zB(2);
        n.j(n.this).jZ(false);
        n.f(n.this).setHint(null);
        GMTrace.o(16679908147200L, 124275);
      }
      
      public final void bLr()
      {
        GMTrace.i(16680042364928L, 124276);
        w.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        n.g(n.this).a(n.f(n.this));
        n.h(n.this);
        if ((n.o(n.this) instanceof Activity)) {
          ((Activity)n.o(n.this)).getWindow().clearFlags(128);
        }
        n.zB(3);
        n.j(n.this).jZ(false);
        n.f(n.this).setHint(null);
        GMTrace.o(16680042364928L, 124276);
      }
      
      public final void bLs()
      {
        GMTrace.i(16680176582656L, 124277);
        w.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        n.s(n.this);
        n.g(n.this).a(n.f(n.this));
        n.h(n.this);
        if ((n.o(n.this) instanceof Activity)) {
          ((Activity)n.o(n.this)).getWindow().clearFlags(128);
        }
        n.c(n.this, 1);
        n.j(n.this).jZ(false);
        n.f(n.this).setHint(null);
        GMTrace.o(16680176582656L, 124277);
      }
    };
    this.tyO = com.tencent.mm.br.a.fromDPToPix(getContext(), 215);
    this.tBU = true;
    this.mContext = paramContext;
    this.tBw = paramBoolean;
    this.tBs = paramMMEditText;
    init();
    this.tBQ = new com.tencent.mm.pluginsdk.ui.n(this.mContext);
    this.eyD = String.valueOf(System.nanoTime());
    w.i("MicroMsg.VoiceInputPanel", "mToUser %s", new Object[] { this.eyD });
    bMO();
    GMTrace.o(16674405220352L, 124234);
  }
  
  private static void a(VoiceInputBehavior paramVoiceInputBehavior)
  {
    GMTrace.i(1021933780992L, 7614);
    w.i("MicroMsg.VoiceInputPanel", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(paramVoiceInputBehavior.cancel), Integer.valueOf(paramVoiceInputBehavior.send), Integer.valueOf(paramVoiceInputBehavior.click), Integer.valueOf(paramVoiceInputBehavior.longClick), Long.valueOf(paramVoiceInputBehavior.longClickTime), Integer.valueOf(paramVoiceInputBehavior.textClick), Integer.valueOf(paramVoiceInputBehavior.textChangeCount), Long.valueOf(paramVoiceInputBehavior.textChangeTime), Integer.valueOf(paramVoiceInputBehavior.textChangeReturn), Long.valueOf(paramVoiceInputBehavior.voiceInputTime), Integer.valueOf(paramVoiceInputBehavior.fail), Integer.valueOf(paramVoiceInputBehavior.clear), Integer.valueOf(paramVoiceInputBehavior.smileIconClick), Integer.valueOf(paramVoiceInputBehavior.voiceIconClick), Integer.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClickTime) });
    log_13905 locallog_13905 = new log_13905();
    locallog_13905.viOp_ = paramVoiceInputBehavior;
    g.ork.b(13905, locallog_13905);
    GMTrace.o(1021933780992L, 7614);
  }
  
  private void bMP()
  {
    GMTrace.i(1021396910080L, 7610);
    w.d("MicroMsg.VoiceInputPanel", "closePanel");
    VoiceInputBehavior localVoiceInputBehavior;
    if (this.tBr != null)
    {
      this.tBJ = true;
      w.i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
      localVoiceInputBehavior = new VoiceInputBehavior();
      if ((this.tvM == null) || (this.tvM.getText() == null) || (this.tvM.getText().length() <= 0)) {
        break label147;
      }
      if (!this.tBJ) {
        break label138;
      }
      localVoiceInputBehavior.cancel = 14;
    }
    for (;;)
    {
      if (this.tBv != 0L)
      {
        localVoiceInputBehavior.voiceInputTime = bg.aI(this.tBv);
        this.tBv = 0L;
      }
      a(localVoiceInputBehavior);
      this.tBr.bLg();
      GMTrace.o(1021396910080L, 7610);
      return;
      label138:
      localVoiceInputBehavior.cancel = 16;
      continue;
      label147:
      if (this.tBJ) {
        localVoiceInputBehavior.cancel = 2;
      } else {
        localVoiceInputBehavior.cancel = 15;
      }
    }
  }
  
  @TargetApi(16)
  private void init()
  {
    GMTrace.i(1020725821440L, 7605);
    w.d("MicroMsg.VoiceInputPanel", "init");
    View.inflate(getContext(), R.i.cHt, this);
    this.tBp = ((ImageButton)findViewById(R.h.clq));
    this.tBq = ((Button)findViewById(R.h.clp));
    this.mQO = ((Button)findViewById(R.h.clt));
    this.tBu = ((TextView)findViewById(R.h.cfQ));
    if (this.tBw)
    {
      this.tBp.setVisibility(4);
      this.mQO.setVisibility(4);
      this.tBq.setVisibility(8);
      if ((!this.tBw) || (this.tBs == null)) {
        break label234;
      }
      this.tvM = this.tBs;
    }
    for (;;)
    {
      this.tBt = ((VoiceInputScrollView)findViewById(R.h.cls));
      this.tBp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16674271002624L, 124233);
          n.c(n.this);
          GMTrace.o(16674271002624L, 124233);
        }
      });
      this.mQO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16680579235840L, 124280);
          n.a(n.this, 2);
          GMTrace.o(16680579235840L, 124280);
        }
      });
      this.tBq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16674002567168L, 124231);
          n.this.reset();
          paramAnonymousView = new VoiceInputBehavior();
          paramAnonymousView.clear = 1;
          n.c(paramAnonymousView);
          GMTrace.o(16674002567168L, 124231);
        }
      });
      this.tBt.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(16681116106752L, 124284);
          boolean bool = n.a(n.this, paramAnonymousView, paramAnonymousMotionEvent);
          GMTrace.o(16681116106752L, 124284);
          return bool;
        }
      });
      GMTrace.o(1020725821440L, 7605);
      return;
      this.tBp.setVisibility(0);
      break;
      label234:
      this.tvM = ((MMEditText)findViewById(R.h.clu));
      this.tvM.setHintTextColor(getResources().getColor(R.e.aOB));
      this.tvM.setClickable(true);
      this.tvM.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(16674136784896L, 124232);
          if (n.a(n.this)) {
            n.b(n.this);
          }
          GMTrace.o(16674136784896L, 124232);
          return true;
        }
      });
      this.tvM.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(16679371276288L, 124271);
          boolean bool = n.a(n.this, paramAnonymousView, paramAnonymousMotionEvent);
          GMTrace.o(16679371276288L, 124271);
          return bool;
        }
      });
    }
  }
  
  private static void zA(int paramInt)
  {
    GMTrace.i(1022067998720L, 7615);
    w.i("MicroMsg.VoiceInputPanel", "idkReport type = %s", new Object[] { Integer.valueOf(paramInt) });
    g.ork.a(455L, paramInt, 1L, false);
    GMTrace.o(1022067998720L, 7615);
  }
  
  public final void bLU()
  {
    GMTrace.i(1021665345536L, 7612);
    w.d("MicroMsg.VoiceInputPanel", "refreshHeight DISPLAY_HEIGHT_PORT_IN_PX %s,needRefreshProtHeight %s", new Object[] { Integer.valueOf(this.tyO), Boolean.valueOf(this.tBU) });
    if (this.tBU)
    {
      this.tBU = false;
      View localView = findViewById(R.h.clr);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      int i = this.tyO;
      Object localObject = localLayoutParams;
      if (localLayoutParams == null) {
        localObject = new LinearLayout.LayoutParams(-1, i);
      }
      ((ViewGroup.LayoutParams)localObject).height = i;
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      init();
      bMQ();
      requestLayout();
    }
    GMTrace.o(1021665345536L, 7612);
  }
  
  public final void bMO()
  {
    GMTrace.i(1020860039168L, 7606);
    this.tBv = bg.Pw();
    if (this.tBR == null)
    {
      w.i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
      this.tBR = new c() {};
      com.tencent.mm.sdk.b.a.vgX.b(this.tBR);
    }
    if (this.tBo == null)
    {
      this.tBo = ((VoiceInputLayout)findViewById(R.h.clv));
      this.tBo.tvw = this.tBT;
      this.tBo.a(this.tvB);
      this.tBo.kb(this.tBw);
    }
    this.tBu.setVisibility(0);
    if (this.tBS == null) {
      this.tBS = new b();
    }
    SharedPreferences localSharedPreferences = ab.bPV();
    if (localSharedPreferences != null)
    {
      String str = localSharedPreferences.getString("voiceinput_downdistance_content", "");
      if (!str.equalsIgnoreCase(""))
      {
        w.d("MicroMsg.VoiceInputPanel", "init memoryContent length=%s", new Object[] { Integer.valueOf(str.length()) });
        this.tBQ.b(this.tvM);
        this.tBQ.a(this.tvM, str, false);
        this.tBQ.a(this.tvM);
        this.tBQ.b(this.tvM);
        bMQ();
        this.tBt.fullScroll(130);
        localSharedPreferences.edit().remove("voiceinput_downdistance_content").apply();
      }
    }
    this.mij = ((TelephonyManager)ab.getContext().getSystemService("phone"));
    this.mij.listen(this.mik, 32);
    GMTrace.o(1020860039168L, 7606);
  }
  
  public final void bMQ()
  {
    GMTrace.i(1021799563264L, 7613);
    w.d("MicroMsg.VoiceInputPanel", "setTextHintAndColor");
    if ((this.tvM != null) && (this.tvM.getText() != null) && (this.tvM.getText().length() == 0))
    {
      this.tvM.setSelection(0);
      this.tvM.setCursorVisible(false);
      this.mQO.setVisibility(4);
      if (!this.tBw) {
        this.tBp.setVisibility(0);
      }
      this.tBq.setVisibility(8);
      this.tBu.setVisibility(0);
      if (this.tBw)
      {
        if ((this.tBs == null) || (this.tBs.getText() == null) || (this.tBs.getText().length() != 0)) {
          break label306;
        }
        this.mQO.setVisibility(4);
      }
    }
    for (;;)
    {
      if (this.tvM != null) {
        this.tvM.clearFocus();
      }
      w.i("MicroMsg.VoiceInputPanel", "resumeMusic");
      at.AS().sp();
      if (!this.tBF)
      {
        this.tBF = true;
        this.tBI = System.currentTimeMillis();
        w.d("VOICEDEBUG", "Last Text Time = %s Corss Time = %s", new Object[] { Long.valueOf(this.tBI), Long.valueOf(this.tBI - this.tBH) });
      }
      GMTrace.o(1021799563264L, 7613);
      return;
      if (this.tvM != null) {
        this.tvM.setCursorVisible(true);
      }
      this.mQO.setVisibility(0);
      if (!this.tBw)
      {
        this.tBp.setVisibility(8);
        this.tBq.setVisibility(0);
      }
      this.tBu.setVisibility(8);
      break;
      label306:
      this.mQO.setVisibility(0);
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(19251654033408L, 143436);
    w.i("MicroMsg.VoiceInputPanel", "destroy");
    reset();
    if (this.tBR != null)
    {
      com.tencent.mm.sdk.b.a.vgX.c(this.tBR);
      this.tBR = null;
    }
    if (this.tBo != null)
    {
      this.tBo.tvw = null;
      this.tBo = null;
    }
    if (this.tBS != null) {
      this.tBS = null;
    }
    if ((this.mij != null) && (this.mik != null))
    {
      this.mij.listen(this.mik, 0);
      this.mik = null;
    }
    this.mij = null;
    this.tBs = null;
    GMTrace.o(19251654033408L, 143436);
  }
  
  public final void pause()
  {
    GMTrace.i(1020994256896L, 7607);
    w.i("MicroMsg.VoiceInputPanel", "pause");
    if (this.tBo != null) {
      this.tBo.bLj();
    }
    this.tBx = 0.0F;
    this.tBy = 0.0F;
    this.tBz = false;
    this.tBA = false;
    this.tvG = false;
    this.tBB = false;
    this.tBJ = false;
    this.tBU = true;
    GMTrace.o(1020994256896L, 7607);
  }
  
  public final void reset()
  {
    GMTrace.i(1021128474624L, 7608);
    w.i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
    pause();
    this.tBK = false;
    this.tBP.clear();
    if (this.tvM != null)
    {
      if (this.tBQ != null)
      {
        this.tBQ.b(this.tvM);
        this.tBQ.a(this.tvM, "", false);
        this.tBQ.a(this.tvM);
        this.tBQ.b(this.tvM);
      }
      bMQ();
    }
    GMTrace.o(1021128474624L, 7608);
  }
  
  public final void zz(int paramInt)
  {
    GMTrace.i(1021531127808L, 7611);
    w.d("MicroMsg.VoiceInputPanel", "setPortHeightPX DISPLAY_HEIGHT_PORT_IN_PX %s,value %s", new Object[] { Integer.valueOf(this.tyO), Integer.valueOf(paramInt) });
    if (this.tyO != paramInt)
    {
      this.tyO = paramInt;
      this.tBU = true;
    }
    GMTrace.o(1021531127808L, 7611);
  }
  
  public static abstract interface a
  {
    public abstract void Pb(String paramString);
    
    public abstract void bLg();
    
    public abstract void jZ(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */