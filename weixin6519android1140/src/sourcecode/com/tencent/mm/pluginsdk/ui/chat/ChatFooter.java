package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.mt;
import com.tencent.mm.k.g;
import com.tencent.mm.pluginsdk.model.app.ag;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChatFooter
  extends LinearLayout
  implements ViewTreeObserver.OnGlobalLayoutListener, h.a
{
  private static int count;
  private static final int[] jsp;
  private static final int[] jsq;
  private Activity activity;
  private Context context;
  public String eMI;
  private boolean jsG;
  private final ae jsP;
  private ImageView jsy;
  public View kJj;
  public View lkA;
  public View lkB;
  public View lkC;
  public View lkD;
  public final ae mHandler;
  public MMEditText mQN;
  public Button mQO;
  public ChatFooterPanel mQP;
  public com.tencent.mm.ui.base.q qym;
  private TextView qyn;
  private ImageView qyo;
  public View qyp;
  private int tAa;
  private final int tAb;
  private final int tAc;
  private final int tAd;
  private final int tAe;
  private final int tAf;
  private final int tAg;
  private final int tAh;
  private final int tAi;
  private int tAj;
  private int tAk;
  private int tAl;
  private int tAm;
  private boolean tAn;
  private final int tAo;
  private final int tAp;
  private volatile boolean tAq;
  private ae tAr;
  private int tAs;
  private int tAt;
  private int tAu;
  private View tAv;
  public boolean tAw;
  private int tAx;
  public String toUser;
  public f ttb;
  private int ttc;
  public n tvf;
  public boolean tvi;
  private i tzA;
  public m tzB;
  public b tzC;
  private d tzD;
  public final a tzE;
  public boolean tzF;
  public boolean tzG;
  private TextView tzH;
  private InputMethodManager tzI;
  public int tzJ;
  private boolean tzK;
  private boolean tzL;
  public boolean tzM;
  public b tzN;
  public c tzO;
  private m.a tzP;
  private boolean tzQ;
  public u tzR;
  private boolean tzS;
  private Animation tzT;
  private Animation tzU;
  private ChatFooterPanel.a tzV;
  private AppPanel.b tzW;
  public e tzX;
  private int tzY;
  public boolean tzZ;
  private String tzq;
  public AppPanel tzr;
  public TextView tzs;
  private Button tzt;
  public ImageButton tzu;
  public LinearLayout tzv;
  public ChatFooterBottom tzw;
  public ImageButton tzx;
  public ImageButton tzy;
  private com.tencent.mm.ui.base.i tzz;
  
  static
  {
    GMTrace.i(1015088676864L, 7563);
    count = 0;
    jsp = new int[] { 0, 15, 30, 45, 60, 75, 90, 100 };
    jsq = new int[] { R.g.aTs, R.g.aTt, R.g.aTu, R.g.aTv, R.g.aTw, R.g.aTx, R.g.aTy };
    GMTrace.o(1015088676864L, 7563);
  }
  
  public ChatFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(998177243136L, 7437);
    GMTrace.o(998177243136L, 7437);
  }
  
  public ChatFooter(final Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(998311460864L, 7438);
    this.kJj = null;
    this.mQN = null;
    this.mQO = null;
    this.tzs = null;
    this.tzD = null;
    this.tzE = new a();
    this.tzF = false;
    this.tzG = false;
    this.jsG = false;
    this.tzK = false;
    this.tzL = false;
    this.tzM = false;
    this.tvi = false;
    this.tzP = new m.a()
    {
      public final void clear()
      {
        GMTrace.i(1018309902336L, 7587);
        ChatFooter localChatFooter = ChatFooter.this;
        if (localChatFooter.mQN != null) {
          localChatFooter.mQN.setText("");
        }
        GMTrace.o(1018309902336L, 7587);
      }
    };
    this.mHandler = new ae()
    {
      @SuppressLint({"NewApi"})
      @TargetApi(11)
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(983681728512L, 7329);
        switch (paramAnonymousMessage.what)
        {
        }
        do
        {
          GMTrace.o(983681728512L, 7329);
          return;
        } while ((ChatFooter.a(ChatFooter.this) == null) || (paramAnonymousMessage.obj == null));
        boolean bool = ((Boolean)paramAnonymousMessage.obj).booleanValue();
        if (bool) {
          ChatFooter.a(ChatFooter.this).setAlpha(1.0F);
        }
        for (;;)
        {
          ChatFooter.a(ChatFooter.this, bool);
          break;
          ChatFooter.a(ChatFooter.this).setAlpha(0.5F);
        }
      }
    };
    this.tzQ = false;
    this.tzS = false;
    this.tzV = new ChatFooterPanel.a()
    {
      public final void aMV()
      {
        GMTrace.i(16374428598272L, 121999);
        ChatFooter.z(ChatFooter.this);
        ChatFooter.A(ChatFooter.this).setVisibility(0);
        ChatFooter.r(ChatFooter.this).setVisibility(8);
        ChatFooter.a(ChatFooter.this, true);
        ChatFooter.a(ChatFooter.this, R.g.aVI);
        if (ChatFooter.h(ChatFooter.this) != null) {
          ChatFooter.h(ChatFooter.this).performClick();
        }
        GMTrace.o(16374428598272L, 121999);
      }
      
      public final void acZ()
      {
        GMTrace.i(16374697033728L, 122001);
        ChatFooter.z(ChatFooter.this);
        ChatFooter.A(ChatFooter.this).setVisibility(0);
        ChatFooter.r(ChatFooter.this).setVisibility(8);
        ChatFooter.a(ChatFooter.this, true);
        ChatFooter.a(ChatFooter.this, R.g.aVI);
        ChatFooter.a(ChatFooter.this).xqp.sendKeyEvent(new KeyEvent(0, 67));
        ChatFooter.a(ChatFooter.this).xqp.sendKeyEvent(new KeyEvent(1, 67));
        GMTrace.o(16374697033728L, 122001);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(16374831251456L, 122002);
        ChatFooter.z(ChatFooter.this);
        ChatFooter.A(ChatFooter.this).setVisibility(0);
        ChatFooter.r(ChatFooter.this).setVisibility(8);
        ChatFooter.a(ChatFooter.this, true);
        ChatFooter.a(ChatFooter.this, R.g.aVI);
        try
        {
          ChatFooter.a(ChatFooter.this).Xi(paramAnonymousString);
          GMTrace.o(16374831251456L, 122002);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.ChatFooter", paramAnonymousString, "", new Object[0]);
          GMTrace.o(16374831251456L, 122002);
        }
      }
      
      public final void fQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(16374562816000L, 122000);
        ChatFooter.z(ChatFooter.this);
        ChatFooter.A(ChatFooter.this).setVisibility(0);
        ChatFooter.r(ChatFooter.this).setVisibility(8);
        ChatFooter.a(ChatFooter.this, R.g.aVI);
        if (ChatFooter.a(ChatFooter.this) != null) {
          ChatFooter.this.kq(paramAnonymousBoolean);
        }
        GMTrace.o(16374562816000L, 122000);
      }
    };
    this.tzW = new AppPanel.b()
    {
      public final void bLX()
      {
        GMTrace.i(16380602613760L, 122045);
        boolean bool = com.tencent.mm.pluginsdk.h.a.a(ChatFooter.b(ChatFooter.this), "android.permission.RECORD_AUDIO", 80, "", "");
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), ChatFooter.b(ChatFooter.this) });
        if (!bool)
        {
          GMTrace.o(16380602613760L, 122045);
          return;
        }
        int i = at.wS().DN();
        if ((i == 4) || (i == 6))
        {
          ChatFooter.B(ChatFooter.this);
          GMTrace.o(16380602613760L, 122045);
          return;
        }
        if ((ChatFooter.l(ChatFooter.this) == null) || (!ChatFooter.l(ChatFooter.this).isShowing())) {
          ChatFooter.a(ChatFooter.this, com.tencent.mm.ui.base.h.h(ChatFooter.this.getContext(), R.l.eiM, R.l.cUG));
        }
        GMTrace.o(16380602613760L, 122045);
      }
    };
    this.jsP = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16380199960576L, 122042);
        super.handleMessage(paramAnonymousMessage);
        if (ChatFooter.E(ChatFooter.this) != null)
        {
          ChatFooter.E(ChatFooter.this).dismiss();
          ChatFooter.r(ChatFooter.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ChatFooter.this.getContext(), R.g.aZx));
          ChatFooter.r(ChatFooter.this).setEnabled(true);
        }
        GMTrace.o(16380199960576L, 122042);
      }
    };
    this.tzY = 0;
    this.tzZ = false;
    this.tAa = 0;
    this.tAb = 0;
    this.tAc = 1;
    this.tAd = 2;
    this.tAe = 3;
    this.tAf = 20;
    this.tAg = 21;
    this.tAh = 22;
    this.tAi = 23;
    this.tAj = 0;
    this.tAk = 0;
    this.tAl = -1;
    this.tAm = -1;
    this.tAn = false;
    this.tAo = 4097;
    this.tAp = 4098;
    this.tAr = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16379663089664L, 122038);
        super.handleMessage(paramAnonymousMessage);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(16379663089664L, 122038);
          return;
          ChatFooter.f(ChatFooter.this, true);
          paramAnonymousMessage = ChatFooter.m(ChatFooter.this).getLayoutParams();
          int i = ChatFooter.m(ChatFooter.this).getBottom() - ChatFooter.m(ChatFooter.this).getTop();
          if (ChatFooter.this.bMz())
          {
            if (ChatFooter.n(ChatFooter.this) != null) {
              ChatFooter.n(ChatFooter.this).setVisibility(8);
            }
            ChatFooter.K(ChatFooter.this).setVisibility(8);
            ChatFooter.m(ChatFooter.this).setVisibility(4);
          }
          if (i <= 3)
          {
            ChatFooter.f(ChatFooter.this, false);
            ChatFooter.m(ChatFooter.this).setVisibility(8);
            ChatFooter.b(ChatFooter.this, ChatFooter.this.bMD());
            GMTrace.o(16379663089664L, 122038);
            return;
          }
          paramAnonymousMessage.height = Math.max(i - 60, 1);
          ChatFooter.m(ChatFooter.this).setLayoutParams(paramAnonymousMessage);
          ChatFooter.L(ChatFooter.this);
        }
      }
    };
    this.tAs = -1;
    this.tAt = -1;
    this.tAu = -1;
    this.tAv = null;
    this.tAw = true;
    this.tAx = 0;
    long l = System.currentTimeMillis();
    this.tzI = ((InputMethodManager)paramContext.getSystemService("input_method"));
    this.kJj = inflate(paramContext, R.i.crU, this);
    this.mQN = ((MMEditText)this.kJj.findViewById(R.h.bnh));
    com.tencent.mm.ui.tools.a.c.d(this.mQN).Ea(com.tencent.mm.k.b.tV()).a(null);
    this.mQN.getInputExtras(true).putBoolean("IS_CHAT_EDITOR", true);
    paramAttributeSet = new mt();
    paramAttributeSet.eRL.eRN = this.mQN;
    paramAttributeSet.eRL.eRM = new com.tencent.mm.pluginsdk.ui.a.a()
    {
      public final void Pc(final String paramAnonymousString)
      {
        GMTrace.i(987708260352L, 7359);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChatFooter", "hakon onImageReceived, %s", new Object[] { paramAnonymousString });
        if ((bg.nm(ChatFooter.c(ChatFooter.this))) || (bg.nm(paramAnonymousString)))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChatFooter", "onImageReceived, error args");
          GMTrace.o(987708260352L, 7359);
          return;
        }
        com.tencent.mm.ui.base.h.a(ChatFooter.this.getContext(), ChatFooter.this.getContext().getString(R.l.dsi), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            paramAnonymous2Int = 1;
            GMTrace.i(969723084800L, 7225);
            boolean bool = com.tencent.mm.y.q.a(paramAnonymousString, ChatFooter.c(ChatFooter.this), true);
            paramAnonymous2DialogInterface = ChatFooter.this;
            if (bool) {}
            for (;;)
            {
              ChatFooter.a(paramAnonymous2DialogInterface, paramAnonymous2Int, paramAnonymousString);
              GMTrace.o(969723084800L, 7225);
              return;
              paramAnonymous2Int = 0;
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(987976695808L, 7361);
            GMTrace.o(987976695808L, 7361);
          }
        });
        GMTrace.o(987708260352L, 7359);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(paramAttributeSet);
    this.tzv = ((LinearLayout)this.kJj.findViewById(R.h.cgN));
    this.tzw = ((ChatFooterBottom)findViewById(R.h.bnc));
    this.tzx = ((ImageButton)this.kJj.findViewById(R.h.bmS));
    this.mQO = ((Button)this.kJj.findViewById(R.h.bor));
    getViewTreeObserver().addOnGlobalLayoutListener(this);
    this.mQO.setTextSize(0, com.tencent.mm.br.a.W(paramContext, R.f.aQo) * com.tencent.mm.br.a.eb(paramContext));
    this.tzt = ((Button)this.kJj.findViewById(R.h.clS));
    this.tzu = ((ImageButton)findViewById(R.h.bnZ));
    fP(false);
    bMH();
    this.tzA = new i(getContext(), getRootView(), this, new i.a()
    {
      public final void Pu(String paramAnonymousString)
      {
        GMTrace.i(1030255280128L, 7676);
        Intent localIntent = new Intent();
        ArrayList localArrayList = new ArrayList(1);
        localArrayList.add(paramAnonymousString);
        if (ChatFooter.d(ChatFooter.this) != null) {
          localIntent.putExtra("GalleryUI_FromUser", ChatFooter.d(ChatFooter.this));
        }
        if (ChatFooter.e(ChatFooter.this) != null) {
          localIntent.putExtra("GalleryUI_ToUser", ChatFooter.e(ChatFooter.this));
        }
        localIntent.putExtra("query_source_type", 3);
        localIntent.putExtra("preview_image", true);
        localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
        localIntent.putExtra("max_select_count", 1);
        localIntent.addFlags(67108864);
        if (ChatFooter.f(ChatFooter.this) != null)
        {
          com.tencent.mm.bj.d.a(ChatFooter.f(ChatFooter.this), "gallery", ".ui.GalleryEntryUI", localIntent, 217);
          GMTrace.o(1030255280128L, 7676);
          return;
        }
        com.tencent.mm.bj.d.b(paramContext, "gallery", ".ui.GalleryEntryUI", localIntent, 217);
        GMTrace.o(1030255280128L, 7676);
      }
    });
    this.tzA.tAU = this;
    paramContext = getContext();
    getRootView();
    this.tzB = new m(paramContext);
    this.tzB.tzP = this.tzP;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "send edittext ime option %s", new Object[] { Integer.valueOf(this.mQN.getImeOptions()) });
    this.mQN.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(980997373952L, 7309);
        if ((paramAnonymousInt == 4) || ((paramAnonymousInt == 0) && (ChatFooter.g(ChatFooter.this))))
        {
          ChatFooter.h(ChatFooter.this).performClick();
          GMTrace.o(980997373952L, 7309);
          return true;
        }
        GMTrace.o(980997373952L, 7309);
        return false;
      }
    });
    this.mQN.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(985963429888L, 7346);
        ChatFooter.this.kq(true);
        ChatFooter.i(ChatFooter.this);
        ChatFooter.j(ChatFooter.this).aNJ();
        ChatFooter.k(ChatFooter.this);
        GMTrace.o(985963429888L, 7346);
        return false;
      }
    });
    this.mQN.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(995492888576L, 7417);
        GMTrace.o(995492888576L, 7417);
        return false;
      }
    });
    this.mQO.setOnClickListener(new View.OnClickListener()
    {
      /* Error */
      public final void onClick(View paramAnonymousView)
      {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: ldc2_w 32
        //   5: sipush 7661
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: aload_0
        //   12: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   15: invokestatic 37	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:a	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;)Lcom/tencent/mm/ui/widget/MMEditText;
        //   18: invokevirtual 43	com/tencent/mm/ui/widget/MMEditText:getText	()Landroid/text/Editable;
        //   21: invokevirtual 47	java/lang/Object:toString	()Ljava/lang/String;
        //   24: astore_1
        //   25: ldc 49
        //   27: ldc 51
        //   29: invokestatic 57	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
        //   32: aload_1
        //   33: invokevirtual 62	java/lang/String:trim	()Ljava/lang/String;
        //   36: invokevirtual 66	java/lang/String:length	()I
        //   39: ifne +76 -> 115
        //   42: aload_1
        //   43: invokevirtual 66	java/lang/String:length	()I
        //   46: ifeq +69 -> 115
        //   49: ldc 49
        //   51: ldc 68
        //   53: invokestatic 57	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
        //   56: aload_0
        //   57: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   60: invokestatic 72	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:l	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;)Lcom/tencent/mm/ui/base/i;
        //   63: ifnull +16 -> 79
        //   66: aload_0
        //   67: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   70: invokestatic 72	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:l	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;)Lcom/tencent/mm/ui/base/i;
        //   73: invokevirtual 78	com/tencent/mm/ui/base/i:isShowing	()Z
        //   76: ifne +77 -> 153
        //   79: aload_0
        //   80: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   83: aload_0
        //   84: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   87: invokevirtual 82	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:getContext	()Landroid/content/Context;
        //   90: getstatic 88	com/tencent/mm/R$l:dfj	I
        //   93: getstatic 91	com/tencent/mm/R$l:cUG	I
        //   96: invokestatic 97	com/tencent/mm/ui/base/h:h	(Landroid/content/Context;II)Lcom/tencent/mm/ui/base/i;
        //   99: invokestatic 100	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:a	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;Lcom/tencent/mm/ui/base/i;)Lcom/tencent/mm/ui/base/i;
        //   102: pop
        //   103: ldc2_w 32
        //   106: sipush 7661
        //   109: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   112: aload_0
        //   113: monitorexit
        //   114: return
        //   115: aload_0
        //   116: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   119: invokestatic 104	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:j	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;)Lcom/tencent/mm/pluginsdk/ui/chat/b;
        //   122: aload_1
        //   123: invokeinterface 110 2 0
        //   128: ifeq +25 -> 153
        //   131: aload_0
        //   132: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   135: invokestatic 37	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:a	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;)Lcom/tencent/mm/ui/widget/MMEditText;
        //   138: invokevirtual 113	com/tencent/mm/ui/widget/MMEditText:clearComposingText	()V
        //   141: aload_0
        //   142: getfield 14	com/tencent/mm/pluginsdk/ui/chat/ChatFooter$2:tAy	Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;
        //   145: invokestatic 37	com/tencent/mm/pluginsdk/ui/chat/ChatFooter:a	(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter;)Lcom/tencent/mm/ui/widget/MMEditText;
        //   148: ldc 115
        //   150: invokevirtual 119	com/tencent/mm/ui/widget/MMEditText:setText	(Ljava/lang/CharSequence;)V
        //   153: ldc2_w 32
        //   156: sipush 7661
        //   159: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   162: goto -50 -> 112
        //   165: astore_1
        //   166: aload_0
        //   167: monitorexit
        //   168: aload_1
        //   169: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	170	0	this	2
        //   0	170	1	paramAnonymousView	View
        // Exception table:
        //   from	to	target	type
        //   2	79	165	finally
        //   79	112	165	finally
        //   115	153	165	finally
        //   153	162	165	finally
      }
    });
    this.tzt.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16375099686912L, 122004);
        if (paramAnonymousView != ChatFooter.r(ChatFooter.this))
        {
          GMTrace.o(16375099686912L, 122004);
          return false;
        }
        com.tencent.mm.sdk.platformtools.w.v("RcdBtnEvent", "event.getAction():" + paramAnonymousMotionEvent.getAction());
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(16375099686912L, 122004);
          return false;
          com.tencent.mm.sdk.platformtools.w.i("RcdBtnEvent", "on MotionEvent.ACTION_DOWN:[%d]", new Object[] { Integer.valueOf(ChatFooter.bMJ()) });
          if ((ChatFooter.s(ChatFooter.this) instanceof Activity)) {
            ((Activity)ChatFooter.s(ChatFooter.this)).getWindow().addFlags(128);
          }
          if ((!ChatFooter.t(ChatFooter.this)) && (!ChatFooter.u(ChatFooter.this)))
          {
            ChatFooter.c(ChatFooter.this, true);
            ChatFooter.r(ChatFooter.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ChatFooter.this.getContext(), R.g.aZy));
            ChatFooter.r(ChatFooter.this).setText(R.l.deQ);
            ChatFooter.j(ChatFooter.this).aNG();
            ChatFooter.r(ChatFooter.this).setContentDescription(ChatFooter.this.getContext().getString(R.l.deu));
            continue;
            if ((ChatFooter.v(ChatFooter.this) == null) || (ChatFooter.w(ChatFooter.this) == null)) {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChatFooter", "[arthurdan.initRcdBtn] Notice!!! rcdAnimArea is %s, rcdCancelArea is %s", new Object[] { ChatFooter.v(ChatFooter.this), ChatFooter.w(ChatFooter.this) });
            }
            if ((paramAnonymousMotionEvent.getX() > 0.0F) && (paramAnonymousMotionEvent.getY() > -ChatFooter.x(ChatFooter.this) / 2) && (paramAnonymousMotionEvent.getX() < ChatFooter.r(ChatFooter.this).getWidth()))
            {
              if (ChatFooter.v(ChatFooter.this) != null) {
                ChatFooter.v(ChatFooter.this).setVisibility(0);
              }
              if (ChatFooter.w(ChatFooter.this) != null)
              {
                ChatFooter.r(ChatFooter.this).setText(R.l.deQ);
                ChatFooter.w(ChatFooter.this).setVisibility(8);
              }
            }
            else
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "show cancel Tips, ACTION_MOVE (x:%f y:%f) rcdHintPopUpMarginTop:%d voiceRcdBtn.getWidth():%d voiceRcdBtn.getHeight():%d", new Object[] { Float.valueOf(paramAnonymousMotionEvent.getX()), Float.valueOf(paramAnonymousMotionEvent.getY()), Integer.valueOf(ChatFooter.x(ChatFooter.this)), Integer.valueOf(ChatFooter.r(ChatFooter.this).getWidth()), Integer.valueOf(ChatFooter.r(ChatFooter.this).getHeight()) });
              if (ChatFooter.v(ChatFooter.this) != null) {
                ChatFooter.v(ChatFooter.this).setVisibility(8);
              }
              if (ChatFooter.w(ChatFooter.this) != null)
              {
                ChatFooter.r(ChatFooter.this).setText(R.l.deA);
                ChatFooter.w(ChatFooter.this).setVisibility(0);
                continue;
                if ((ChatFooter.s(ChatFooter.this) instanceof Activity)) {
                  ((Activity)ChatFooter.s(ChatFooter.this)).getWindow().clearFlags(128);
                }
                com.tencent.mm.sdk.platformtools.w.i("RcdBtnEvent", "enter on MotionEvent.ACTION_UP/ACTION_CANCEL:[%d]", new Object[] { Integer.valueOf(ChatFooter.bMJ()) });
                ChatFooter.y(ChatFooter.this);
                com.tencent.mm.sdk.platformtools.w.i("RcdBtnEvent", "outer on MotionEvent.ACTION_UP/ACTION_CANCEL:[%d]", new Object[] { Integer.valueOf(ChatFooter.bMK()) });
              }
            }
          }
        }
      }
    });
    this.tzt.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16379394654208L, 122036);
        switch (paramAnonymousKeyEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(16379394654208L, 122036);
          return false;
          if (((paramAnonymousInt == 23) || (paramAnonymousInt == 66)) && (!ChatFooter.u(ChatFooter.this)) && (!ChatFooter.t(ChatFooter.this)))
          {
            ChatFooter.d(ChatFooter.this, true);
            ChatFooter.r(ChatFooter.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ChatFooter.this.getContext(), R.g.aZy));
            ChatFooter.r(ChatFooter.this).setText(R.l.deQ);
            ChatFooter.j(ChatFooter.this).aNG();
            ChatFooter.r(ChatFooter.this).setContentDescription(ChatFooter.this.getContext().getString(R.l.deu));
            continue;
            if ((paramAnonymousInt == 23) || (paramAnonymousInt == 66))
            {
              ChatFooter.r(ChatFooter.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ChatFooter.this.getContext(), R.g.aZx));
              ChatFooter.r(ChatFooter.this).setText(R.l.deP);
              ChatFooter.j(ChatFooter.this).aND();
              ChatFooter.d(ChatFooter.this, false);
            }
          }
        }
      }
    });
    this.tzu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16381273702400L, 122050);
        ChatFooter.q(ChatFooter.this);
        GMTrace.o(16381273702400L, 122050);
      }
    });
    bMb();
    this.tzx.setVisibility(0);
    this.tzx.setContentDescription(getContext().getString(R.l.der));
    this.tzx.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(981265809408L, 7311);
        ChatFooter.this.bLZ();
        if ((com.tencent.mm.y.q.Am().booleanValue()) && (ChatFooter.this.tzN != null)) {
          ChatFooter.this.tzN.a(Boolean.valueOf(true), Boolean.valueOf(true));
        }
        GMTrace.o(981265809408L, 7311);
      }
    });
    zw(-1);
    findViewById(R.h.bnv).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(988245131264L, 7363);
        GMTrace.o(988245131264L, 7363);
        return true;
      }
    });
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "init time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(998311460864L, 7438);
  }
  
  public static void bMA()
  {
    GMTrace.i(1005693435904L, 7493);
    GMTrace.o(1005693435904L, 7493);
  }
  
  private boolean bMC()
  {
    GMTrace.i(1006364524544L, 7498);
    if ((this.tAl > 0) && (this.tAl < this.tAm))
    {
      GMTrace.o(1006364524544L, 7498);
      return true;
    }
    GMTrace.o(1006364524544L, 7498);
    return false;
  }
  
  private void bMb()
  {
    GMTrace.i(1000056291328L, 7451);
    this.tzr = ((AppPanel)findViewById(R.h.bmn));
    this.tzr.tyu = this.tzW;
    this.tzr.zp(bMD());
    if ((s.gm(this.tzq)) || (s.gf(this.tzq)))
    {
      this.tzr.init(0);
      GMTrace.o(1000056291328L, 7451);
      return;
    }
    if (s.fD(this.tzq))
    {
      this.tzr.init(4);
      GMTrace.o(1000056291328L, 7451);
      return;
    }
    if (s.eb(this.tzq))
    {
      this.tzr.init(2);
      GMTrace.o(1000056291328L, 7451);
      return;
    }
    this.tzr.init(1);
    GMTrace.o(1000056291328L, 7451);
  }
  
  private void fP(boolean paramBoolean)
  {
    GMTrace.i(998982549504L, 7443);
    if (this.tzT == null)
    {
      this.tzT = AnimationUtils.loadAnimation(getContext(), R.a.aLC);
      this.tzT.setDuration(150L);
    }
    if (this.tzU == null)
    {
      this.tzU = AnimationUtils.loadAnimation(getContext(), R.a.aLD);
      this.tzU.setDuration(150L);
    }
    if ((this.mQO == null) || (this.tzx == null))
    {
      GMTrace.o(998982549504L, 7443);
      return;
    }
    if (this.tzQ)
    {
      if (this.tzx.getVisibility() != 0) {
        this.tzx.setVisibility(0);
      }
      GMTrace.o(998982549504L, 7443);
      return;
    }
    if ((this.mQO.getVisibility() == 0) && (paramBoolean))
    {
      GMTrace.o(998982549504L, 7443);
      return;
    }
    if ((this.tzx.getVisibility() == 0) && (!paramBoolean))
    {
      GMTrace.o(998982549504L, 7443);
      return;
    }
    if (paramBoolean)
    {
      this.mQO.startAnimation(this.tzT);
      this.mQO.setVisibility(0);
      this.tzx.startAnimation(this.tzU);
      this.tzx.setVisibility(8);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "jacks canSend:%B", new Object[] { Boolean.valueOf(paramBoolean) });
      this.mQO.getParent().requestLayout();
      GMTrace.o(998982549504L, 7443);
      return;
      this.tzx.startAnimation(this.tzT);
      if (!this.tzG) {
        this.tzx.setVisibility(0);
      }
      this.mQO.startAnimation(this.tzU);
      this.mQO.setVisibility(8);
    }
  }
  
  private void kr(boolean paramBoolean)
  {
    GMTrace.i(1007035613184L, 7503);
    if (this.tzy == null)
    {
      GMTrace.o(1007035613184L, 7503);
      return;
    }
    if ((this.tAn) && (paramBoolean))
    {
      GMTrace.o(1007035613184L, 7503);
      return;
    }
    if ((!this.tAn) && (!paramBoolean))
    {
      GMTrace.o(1007035613184L, 7503);
      return;
    }
    this.tAn = paramBoolean;
    if (paramBoolean)
    {
      this.tzy.setImageDrawable(getContext().getResources().getDrawable(R.g.aVH));
      GMTrace.o(1007035613184L, 7503);
      return;
    }
    this.tzy.setImageDrawable(getContext().getResources().getDrawable(R.g.aVG));
    GMTrace.o(1007035613184L, 7503);
  }
  
  private void zq(int paramInt)
  {
    GMTrace.i(999922073600L, 7450);
    if (this.tzu == null)
    {
      GMTrace.o(999922073600L, 7450);
      return;
    }
    if (paramInt == R.g.aVI) {}
    for (int i = 1;; i = 0)
    {
      if (this.tzu != null)
      {
        if (i == 0) {
          break label92;
        }
        this.tzu.setContentDescription(getContext().getString(R.l.det));
      }
      for (;;)
      {
        this.tzu.setImageResource(paramInt);
        this.tzu.setPadding(0, 0, 0, 0);
        GMTrace.o(999922073600L, 7450);
        return;
        label92:
        this.tzu.setContentDescription(getContext().getString(R.l.des));
      }
    }
  }
  
  private void zu(int paramInt)
  {
    GMTrace.i(1002203774976L, 7467);
    this.tzJ = paramInt;
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1002203774976L, 7467);
      return;
      this.tzv.setVisibility(0);
      this.tzt.setVisibility(8);
      zq(R.g.aVI);
      GMTrace.o(1002203774976L, 7467);
      return;
      this.tzv.setVisibility(8);
      this.tzt.setVisibility(0);
      zq(R.g.aVH);
      if ((com.tencent.mm.y.q.Am().booleanValue()) && (this.tzN != null)) {
        this.tzN.b(Boolean.valueOf(true), Boolean.valueOf(true));
      }
    }
  }
  
  public final void Pp(String paramString)
  {
    GMTrace.i(1000458944512L, 7454);
    this.tzE.tAD = paramString;
    GMTrace.o(1000458944512L, 7454);
  }
  
  public final void Pq(String paramString)
  {
    GMTrace.i(1000593162240L, 7455);
    this.tzE.tAC = paramString;
    GMTrace.o(1000593162240L, 7455);
  }
  
  public final void Pr(String paramString)
  {
    GMTrace.i(1000861597696L, 7457);
    p(paramString, -1, true);
    GMTrace.o(1000861597696L, 7457);
  }
  
  public final void Ps(String paramString)
  {
    GMTrace.i(1001666904064L, 7463);
    if ((paramString == null) || (this.tzH == null))
    {
      GMTrace.o(1001666904064L, 7463);
      return;
    }
    this.tzH.setText(paramString);
    GMTrace.o(1001666904064L, 7463);
  }
  
  public final void Pt(String paramString)
  {
    GMTrace.i(1007706701824L, 7508);
    this.tzq = paramString;
    if (this.mQP != null) {
      this.mQP.bo(this.tzq);
    }
    if (this.tzr != null)
    {
      if ((s.gm(this.tzq)) || (s.gf(this.tzq)))
      {
        this.tzr.tyA = 0;
        GMTrace.o(1007706701824L, 7508);
        return;
      }
      if (s.fD(this.tzq))
      {
        this.tzr.tyA = 4;
        GMTrace.o(1007706701824L, 7508);
        return;
      }
      if (s.eb(this.tzq))
      {
        this.tzr.tyA = 2;
        GMTrace.o(1007706701824L, 7508);
        return;
      }
      this.tzr.tyA = 1;
    }
    GMTrace.o(1007706701824L, 7508);
  }
  
  public final void V(int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(1002337992704L, 7468);
    zu(paramInt);
    switch (paramInt)
    {
    default: 
      setVisibility(0);
      GMTrace.o(1002337992704L, 7468);
      return;
    case 1: 
      km(true);
      bME();
      if (paramBoolean)
      {
        p(1, -1, true);
        if (this.mQN.length() > 0) {}
        for (paramBoolean = bool;; paramBoolean = false)
        {
          fP(paramBoolean);
          GMTrace.o(1002337992704L, 7468);
          return;
        }
      }
      fP(false);
      GMTrace.o(1002337992704L, 7468);
      return;
    }
    p(0, -1, false);
    fP(false);
    GMTrace.o(1002337992704L, 7468);
  }
  
  public final void a(Context paramContext, Activity paramActivity)
  {
    GMTrace.i(998445678592L, 7439);
    this.activity = paramActivity;
    bMH();
    if (this.mQP != null) {
      this.mQP.onResume();
    }
    if ((!this.tzQ) && (this.tzL))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "jacks chatting footer disable enter button send");
      this.tzL = false;
      this.mQN.setImeOptions(0);
      this.mQN.setInputType(this.mQN.getInputType() | 0x40);
    }
    for (;;)
    {
      if (this.tzr != null) {
        this.tzr.context = paramContext;
      }
      this.context = paramContext;
      this.tzA.tAT = false;
      if (!this.tvi)
      {
        this.kJj.findViewById(R.h.bot).setVisibility(0);
        this.mQN.setVisibility(0);
      }
      bMt();
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(988513566720L, 7365);
          com.tencent.mm.compatible.util.j.g(ChatFooter.b(ChatFooter.this));
          GMTrace.o(988513566720L, 7365);
        }
      });
      GMTrace.o(998445678592L, 7439);
      return;
      if ((this.tzQ) && (!this.tzL)) {
        bMw();
      }
    }
  }
  
  @TargetApi(11)
  public final void a(View.OnDragListener paramOnDragListener)
  {
    GMTrace.i(1005425000448L, 7491);
    this.mQN.setOnDragListener(paramOnDragListener);
    GMTrace.o(1005425000448L, 7491);
  }
  
  public final void a(AppPanel.a parama)
  {
    GMTrace.i(1005559218176L, 7492);
    this.tzr.tyt = parama;
    GMTrace.o(1005559218176L, 7492);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(1005827653632L, 7494);
    this.tzD = paramd;
    if (paramd == null)
    {
      GMTrace.o(1005827653632L, 7494);
      return;
    }
    paramd = findViewById(R.h.boa);
    paramd.setVisibility(0);
    paramd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16375502340096L, 122007);
        if (ChatFooter.I(ChatFooter.this) != null) {
          ChatFooter.I(ChatFooter.this).ks(false);
        }
        GMTrace.o(16375502340096L, 122007);
      }
    });
    GMTrace.o(1005827653632L, 7494);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(999787855872L, 7449);
    this.tzB.tBe = paramj;
    GMTrace.o(999787855872L, 7449);
  }
  
  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    GMTrace.i(1001398468608L, 7461);
    this.tzX = new e(paramTextWatcher);
    this.mQN.addTextChangedListener(this.tzX);
    GMTrace.o(1001398468608L, 7461);
  }
  
  public final void ae(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(14460215361536L, 107737);
    if (this.tzE.tAF.containsKey(paramString1)) {}
    Object localObject;
    for (paramString1 = (LinkedList)this.tzE.tAF.get(paramString1);; paramString1 = (String)localObject)
    {
      localObject = new HashMap(1);
      ((HashMap)localObject).put(paramString3, paramString2);
      paramString1.add(localObject);
      GMTrace.o(14460215361536L, 107737);
      return;
      localObject = new LinkedList();
      this.tzE.tAF.put(paramString1, localObject);
    }
  }
  
  public final void azl()
  {
    GMTrace.i(1001935339520L, 7465);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16380736831488L, 122046);
        if (ChatFooter.E(ChatFooter.this) != null)
        {
          ChatFooter.E(ChatFooter.this).dismiss();
          ChatFooter.F(ChatFooter.this).setVisibility(0);
          ChatFooter.G(ChatFooter.this).setVisibility(8);
          ChatFooter.H(ChatFooter.this).setVisibility(8);
          ChatFooter.w(ChatFooter.this).setVisibility(8);
          ChatFooter.v(ChatFooter.this).setVisibility(0);
        }
        ChatFooter.r(ChatFooter.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ChatFooter.this.getContext(), R.g.aZx));
        ChatFooter.r(ChatFooter.this).setText(R.l.deP);
        ChatFooter.d(ChatFooter.this, false);
        ChatFooter.c(ChatFooter.this, false);
        GMTrace.o(16380736831488L, 122046);
      }
    });
    GMTrace.o(1001935339520L, 7465);
  }
  
  public final void b(f paramf)
  {
    GMTrace.i(999653638144L, 7448);
    this.ttb = paramf;
    if (this.mQP != null) {
      this.mQP.a(paramf);
    }
    GMTrace.o(999653638144L, 7448);
  }
  
  public final void bLY()
  {
    GMTrace.i(998848331776L, 7442);
    if (this.tzr == null)
    {
      GMTrace.o(998848331776L, 7442);
      return;
    }
    this.tzr.bLO();
    GMTrace.o(998848331776L, 7442);
  }
  
  public final void bLZ()
  {
    GMTrace.i(999116767232L, 7444);
    this.tzC.aNI();
    if ((this.tzr.getVisibility() == 0) && (!this.tzw.eWb))
    {
      if (this.tzJ == 1)
      {
        p(1, -1, true);
        GMTrace.o(999116767232L, 7444);
        return;
      }
      p(0, -1, false);
      GMTrace.o(999116767232L, 7444);
      return;
    }
    p(2, 22, true);
    if ((this.tvf != null) && (this.tvf.getVisibility() == 0) && (this.tvi))
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "voiceInputPanel is VISIBLE, set appPanel VISIBLE");
      this.tvf.setVisibility(8);
      this.tvi = false;
      this.tvf.reset();
    }
    Object localObject = ao.bJL();
    Context localContext = ab.getContext();
    if ((!com.tencent.mm.kernel.h.xw().wL()) || (localContext == null)) {}
    for (;;)
    {
      localObject = ao.bJL();
      localContext = ab.getContext();
      if ((!com.tencent.mm.kernel.h.xw().wL()) || (localContext == null)) {
        break label585;
      }
      if (!((ao)localObject).toY) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
      GMTrace.o(999116767232L, 7444);
      return;
      try
      {
        String str = g.ut().getValue("ShowAPPSuggestion");
        if ((bg.nm(str)) || (Integer.valueOf(str).intValue() != 1)) {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SuggestionAppListLogic", "cfgShowAppSuggestion %s, return", new Object[] { str });
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "exception in getSuggestionAppList, %s", new Object[] { localException.getMessage() });
        if (((ao)localObject).toX)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SuggestionAppListLogic", "SuggestionApp is Loading");
        }
        else
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "getSuggestionAppList");
          ((ao)localObject).toX = true;
          if (System.currentTimeMillis() - ((ao)localObject).tpa < 43200000L)
          {
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "not now");
            ((ao)localObject).toX = false;
          }
          else
          {
            com.tencent.mm.kernel.h.xz();
            ((ao)localObject).tpa = com.tencent.mm.kernel.h.xy().xh().As(352275);
            if (System.currentTimeMillis() - ((ao)localObject).tpa < 43200000L)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SuggestionAppListLogic", "not now sp");
              ((ao)localObject).toX = false;
            }
            else
            {
              if (((ao)localObject).lang == null) {
                ((ao)localObject).lang = v.d(localContext.getSharedPreferences(ab.bPU(), 0));
              }
              localObject = new ag(((ao)localObject).lang, new LinkedList());
              com.tencent.mm.plugin.x.a.aGk();
              com.tencent.mm.pluginsdk.model.app.d.a(4, (com.tencent.mm.pluginsdk.model.app.w)localObject);
            }
          }
        }
      }
    }
    ((ao)localObject).toY = true;
    if (System.currentTimeMillis() - ((ao)localObject).tpd < 43200000L)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "getServiceAppInfo not now");
      ((ao)localObject).toY = false;
      GMTrace.o(999116767232L, 7444);
      return;
    }
    com.tencent.mm.kernel.h.xz();
    ((ao)localObject).tpd = com.tencent.mm.kernel.h.xy().xh().As(352276);
    if (System.currentTimeMillis() - ((ao)localObject).tpd < 43200000L)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "getServiceAppInfo not now pp");
      ((ao)localObject).toY = false;
      GMTrace.o(999116767232L, 7444);
      return;
    }
    if (((ao)localObject).lang == null) {
      ((ao)localObject).lang = v.d(localContext.getSharedPreferences(ab.bPU(), 0));
    }
    ao.cD(((ao)localObject).lang, ((ao)localObject).tpc);
    label585:
    GMTrace.o(999116767232L, 7444);
  }
  
  public final void bLf()
  {
    GMTrace.i(1000324726784L, 7453);
    if (!this.tvi)
    {
      GMTrace.o(1000324726784L, 7453);
      return;
    }
    View localView = findViewById(R.h.bnv);
    this.tvi = false;
    if (this.tvf != null)
    {
      this.tvf.destroy();
      this.tvf.setVisibility(8);
    }
    localView.setVisibility(0);
    this.mQN.setVisibility(0);
    this.mQN.setText("");
    km(true);
    bMt();
    p(0, -1, false);
    GMTrace.o(1000324726784L, 7453);
  }
  
  public final void bMB()
  {
    GMTrace.i(1006096089088L, 7496);
    p(2, 20, false);
    GMTrace.o(1006096089088L, 7496);
  }
  
  public final int bMD()
  {
    GMTrace.i(1006767177728L, 7501);
    int i = com.tencent.mm.compatible.util.j.b(getContext(), true);
    GMTrace.o(1006767177728L, 7501);
    return i;
  }
  
  public final void bME()
  {
    GMTrace.i(1007169830912L, 7504);
    this.tzw.setVisibility(8);
    this.tzr.setVisibility(8);
    if (this.mQP != null) {
      this.mQP.setVisibility(8);
    }
    kr(false);
    GMTrace.o(1007169830912L, 7504);
  }
  
  public final void bMF()
  {
    GMTrace.i(1007438266368L, 7506);
    this.jsG = false;
    this.tzt.setBackgroundDrawable(com.tencent.mm.br.a.b(getContext(), R.g.aZx));
    this.tzt.setText(R.l.deP);
    if (this.tzC != null)
    {
      if ((this.lkD != null) && (this.lkD.getVisibility() == 0))
      {
        this.tzC.aNF();
        GMTrace.o(1007438266368L, 7506);
        return;
      }
      this.tzC.aND();
    }
    GMTrace.o(1007438266368L, 7506);
  }
  
  public final boolean bMG()
  {
    GMTrace.i(1007572484096L, 7507);
    if (this.tAk - getTop() > 50)
    {
      GMTrace.o(1007572484096L, 7507);
      return true;
    }
    GMTrace.o(1007572484096L, 7507);
    return false;
  }
  
  public final void bMH()
  {
    GMTrace.i(1007840919552L, 7509);
    at.AR();
    this.tzQ = ((Boolean)com.tencent.mm.y.c.xh().get(66832, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(1007840919552L, 7509);
  }
  
  public final int bMI()
  {
    GMTrace.i(1008243572736L, 7512);
    int i = com.tencent.mm.compatible.util.j.aL(getContext());
    int j = getHeight();
    if (j < i)
    {
      GMTrace.o(1008243572736L, 7512);
      return j + i;
    }
    GMTrace.o(1008243572736L, 7512);
    return j;
  }
  
  public final void bMa()
  {
    GMTrace.i(999385202688L, 7446);
    if (e.tAM == null)
    {
      this.mQP = new d(this.context);
      GMTrace.o(999385202688L, 7446);
      return;
    }
    if (this.mQP != null) {
      this.mQP.destroy();
    }
    this.mQP = e.tAM.ci(this.context);
    ChatFooterPanel localChatFooterPanel;
    if (this.mQP != null)
    {
      this.mQP.cU(ChatFooterPanel.tte);
      if (this.mQP != null) {
        this.mQP.setVisibility(8);
      }
      if (this.mQP != null) {
        this.mQP.za(this.ttc);
      }
      if (this.tzw != null) {
        this.tzw.addView(this.mQP, -1, -2);
      }
      if (this.mQP != null) {
        this.mQP.tta = this.tzV;
      }
      if (this.mQP != null)
      {
        localChatFooterPanel = this.mQP;
        if (this.mQN.getText().length() <= 0) {
          break label275;
        }
      }
    }
    label275:
    for (boolean bool = true;; bool = false)
    {
      localChatFooterPanel.aq(bool);
      if (this.mQP != null)
      {
        this.mQP.bo(this.tzq);
        this.mQP.cT(bMD());
        if (!bg.nm(this.mQN.getText().toString())) {
          this.mQP.oL();
        }
      }
      if (this.tzM) {
        oJ();
      }
      b(this.ttb);
      GMTrace.o(999385202688L, 7446);
      return;
    }
  }
  
  public final void bMc()
  {
    GMTrace.i(1000190509056L, 7452);
    this.tzJ = 1;
    this.tzv.setVisibility(0);
    this.tzt.setVisibility(8);
    zq(R.g.aVI);
    if (this.tvf != null)
    {
      this.tvf.setVisibility(8);
      this.tvi = false;
      this.tvf.reset();
    }
    p(2, 21, true);
    GMTrace.o(1000190509056L, 7452);
  }
  
  public final void bMd()
  {
    GMTrace.i(1001130033152L, 7459);
    this.tzt.setEnabled(false);
    this.tzt.setBackgroundDrawable(com.tencent.mm.br.a.b(getContext(), R.g.aZw));
    if (this.qym != null)
    {
      this.lkB.setVisibility(0);
      this.lkA.setVisibility(8);
      this.qyp.setVisibility(8);
      this.qym.update();
    }
    this.jsP.sendEmptyMessageDelayed(0, 500L);
    GMTrace.o(1001130033152L, 7459);
  }
  
  public final String bMe()
  {
    GMTrace.i(1001264250880L, 7460);
    if (this.mQN == null)
    {
      GMTrace.o(1001264250880L, 7460);
      return "";
    }
    String str = this.mQN.getText().toString();
    GMTrace.o(1001264250880L, 7460);
    return str;
  }
  
  public final void bMf()
  {
    GMTrace.i(1001801121792L, 7464);
    this.qyp.setVisibility(8);
    this.lkA.setVisibility(0);
    GMTrace.o(1001801121792L, 7464);
  }
  
  public final void bMg()
  {
    GMTrace.i(1002606428160L, 7470);
    this.tzv.setVisibility(0);
    this.tzu.setVisibility(8);
    this.tzt.setVisibility(8);
    GMTrace.o(1002606428160L, 7470);
  }
  
  public final void bMh()
  {
    GMTrace.i(1002740645888L, 7471);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tyR.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1002740645888L, 7471);
  }
  
  public final void bMi()
  {
    GMTrace.i(1002874863616L, 7472);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tzj.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1002874863616L, 7472);
  }
  
  public final void bMj()
  {
    GMTrace.i(1003009081344L, 7473);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tyS.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1003009081344L, 7473);
  }
  
  public final void bMk()
  {
    GMTrace.i(1003143299072L, 7474);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tyU.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1003143299072L, 7474);
  }
  
  public final void bMl()
  {
    GMTrace.i(1003277516800L, 7475);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tyV.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1003277516800L, 7475);
  }
  
  public final void bMm()
  {
    GMTrace.i(1003411734528L, 7476);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tzi.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1003411734528L, 7476);
  }
  
  public final void bMn()
  {
    GMTrace.i(1003545952256L, 7477);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tyW.value = false;
    localAppPanel.bLQ();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppPanel", "enable false" + " isVoipPluginEnable " + localAppPanel.tyx.tyX.value);
    this.tzr.kh(true);
    GMTrace.o(1003545952256L, 7477);
  }
  
  public final void bMo()
  {
    GMTrace.i(1003948605440L, 7480);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyF = true;
    localAppPanel.tyx.kk(false);
    localAppPanel.bLQ();
    GMTrace.o(1003948605440L, 7480);
  }
  
  public final void bMp()
  {
    GMTrace.i(1004082823168L, 7481);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyG = true;
    localAppPanel.tyx.kj(false);
    localAppPanel.bLQ();
    GMTrace.o(1004082823168L, 7481);
  }
  
  public final void bMq()
  {
    GMTrace.i(1004217040896L, 7482);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tzb.value = false;
    localAppPanel.bLQ();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppPanel", "disableTalkroom enable false");
    GMTrace.o(1004217040896L, 7482);
  }
  
  public final void bMr()
  {
    GMTrace.i(1004351258624L, 7483);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tzg.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1004351258624L, 7483);
  }
  
  public final void bMs()
  {
    GMTrace.i(1004485476352L, 7484);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyx.tza.value = false;
    localAppPanel.bLQ();
    GMTrace.o(1004485476352L, 7484);
  }
  
  public final void bMt()
  {
    GMTrace.i(1004619694080L, 7485);
    this.tzy = ((ImageButton)this.kJj.findViewById(R.h.bov));
    this.tzy.setVisibility(0);
    this.tzy.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16380468396032L, 122044);
        ChatFooter.j(ChatFooter.this).aNH();
        if ((!ChatFooter.m(ChatFooter.this).eWb) && (ChatFooter.n(ChatFooter.this) != null) && (ChatFooter.n(ChatFooter.this).getVisibility() == 0))
        {
          ChatFooter.this.p(1, -1, true);
          GMTrace.o(16380468396032L, 122044);
          return;
        }
        if (ChatFooter.o(ChatFooter.this)) {
          ChatFooter.this.oJ();
        }
        ChatFooter.this.bMc();
        if (!bg.nm(ChatFooter.a(ChatFooter.this).getText().toString())) {
          ChatFooter.n(ChatFooter.this).oL();
        }
        GMTrace.o(16380468396032L, 122044);
      }
    });
    if (this.tzB != null) {
      this.tzB.tBd = this.tzy;
    }
    GMTrace.o(1004619694080L, 7485);
  }
  
  public final void bMu()
  {
    GMTrace.i(1004753911808L, 7486);
    if (this.tzy != null) {
      this.tzy.setVisibility(8);
    }
    GMTrace.o(1004753911808L, 7486);
  }
  
  public final void bMv()
  {
    GMTrace.i(1004888129536L, 7487);
    AppPanel localAppPanel = this.tzr;
    localAppPanel.tyH = true;
    localAppPanel.tyx.kl(false);
    localAppPanel.bLQ();
    GMTrace.o(1004888129536L, 7487);
  }
  
  public final void bMw()
  {
    GMTrace.i(1005022347264L, 7488);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "jacks chatting footer enable enter button send");
    this.tzL = true;
    this.mQN.setImeOptions(4);
    this.mQN.setInputType(this.mQN.getInputType() & 0xFFFFFFBF);
    GMTrace.o(1005022347264L, 7488);
  }
  
  public final void bMx()
  {
    GMTrace.i(1005156564992L, 7489);
    if (this.mQP != null) {
      this.mQP.refresh();
    }
    GMTrace.o(1005156564992L, 7489);
  }
  
  public final void bMy()
  {
    GMTrace.i(5893232001024L, 43908);
    this.tzr.refresh();
    GMTrace.o(5893232001024L, 43908);
  }
  
  public final boolean bMz()
  {
    GMTrace.i(1005290782720L, 7490);
    if (this.tzw.getVisibility() == 0)
    {
      GMTrace.o(1005290782720L, 7490);
      return true;
    }
    GMTrace.o(1005290782720L, 7490);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(998714114048L, 7441);
    if (this.mQP != null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "jacks chat footer desctory smiley panel");
      this.mQP.oI();
      this.mQP.destroy();
      this.mQP = null;
    }
    if (this.tvf != null)
    {
      this.tvf.destroy();
      this.tvf = null;
      this.tvi = false;
    }
    if (this.tzC != null) {
      this.tzC.release();
    }
    if (this.tzB != null)
    {
      this.tzB.tzP = null;
      this.tzB.tBe = null;
      this.tzB.hide();
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "jacks destory");
    GMTrace.o(998714114048L, 7441);
  }
  
  public final HashMap<String, String> eG(String paramString1, String paramString2)
  {
    GMTrace.i(14460349579264L, 107738);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] :%s :%s", new Object[] { paramString1, paramString2 });
    long l = System.currentTimeMillis();
    if (bg.nm(paramString2))
    {
      if (this.tzE.tAF.containsKey(paramString1)) {
        this.tzE.tAF.remove(paramString1);
      }
      GMTrace.o(14460349579264L, 107738);
      return null;
    }
    if ((!this.tzE.tAF.containsKey(paramString1)) || (((LinkedList)this.tzE.tAF.get(paramString1)).size() <= 0))
    {
      GMTrace.o(14460349579264L, 107738);
      return null;
    }
    Object localObject = new LinkedList();
    int j;
    for (int i = 0; i < paramString2.length(); i = j + 1)
    {
      i = paramString2.indexOf("@", i);
      if (i == -1) {
        break;
      }
      j = paramString2.indexOf(' ', i);
      if ((j == -1) || (j - i > 40)) {
        break;
      }
      ((List)localObject).add(paramString2.substring(i + 1, j));
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "after split @ :%s", new Object[] { localObject });
    if (((List)localObject).size() <= 0)
    {
      ((LinkedList)this.tzE.tAF.get(paramString1)).clear();
      GMTrace.o(14460349579264L, 107738);
      return null;
    }
    paramString1 = (LinkedList)this.tzE.tAF.get(paramString1);
    if ((paramString1 != null) && (paramString1.size() > 0))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] size:%s", new Object[] { Integer.valueOf(paramString1.size()) });
      paramString2 = new LinkedList();
      localObject = ((List)localObject).iterator();
      for (;;)
      {
        if (!((Iterator)localObject).hasNext()) {
          break label404;
        }
        String str = (String)((Iterator)localObject).next();
        Iterator localIterator = paramString1.iterator();
        if (localIterator.hasNext())
        {
          HashMap localHashMap = (HashMap)localIterator.next();
          if (!localHashMap.containsKey(str)) {
            break;
          }
          paramString2.add(localHashMap.get(str));
        }
      }
      label404:
      localObject = new HashMap(1);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "[getAtSomebodyUsernames]  atList size:%s", new Object[] { Integer.valueOf(paramString2.size()) });
      ((HashMap)localObject).put("atuserlist", "<![CDATA[" + bg.c(paramString2, ",") + "]]>");
      paramString1.clear();
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "[getAtSomebodyUsernames] cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(14460349579264L, 107738);
      return (HashMap<String, String>)localObject;
    }
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChatFooter", "list is null or size 0");
    GMTrace.o(14460349579264L, 107738);
    return null;
  }
  
  public final void km(boolean paramBoolean)
  {
    GMTrace.i(999250984960L, 7445);
    if (this.mQN == null)
    {
      GMTrace.o(999250984960L, 7445);
      return;
    }
    if (paramBoolean)
    {
      this.mQN.requestFocus();
      GMTrace.o(999250984960L, 7445);
      return;
    }
    this.mQN.clearFocus();
    GMTrace.o(999250984960L, 7445);
  }
  
  public final void kn(boolean paramBoolean)
  {
    GMTrace.i(1002472210432L, 7469);
    if (this.mQP != null) {
      this.mQP.d(paramBoolean, false);
    }
    GMTrace.o(1002472210432L, 7469);
  }
  
  public final void ko(boolean paramBoolean)
  {
    GMTrace.i(1003680169984L, 7478);
    AppPanel localAppPanel = this.tzr;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localAppPanel.tyx.tzl.value = paramBoolean;
      localAppPanel.bLQ();
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppPanel", "enable " + localAppPanel.tyx.tzl.value + " isMultiTalkEnable " + paramBoolean);
      GMTrace.o(1003680169984L, 7478);
      return;
    }
  }
  
  public final void kp(boolean paramBoolean)
  {
    GMTrace.i(1003814387712L, 7479);
    AppPanel localAppPanel = this.tzr;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localAppPanel.tyx.tze.value = paramBoolean;
      localAppPanel.bLQ();
      GMTrace.o(1003814387712L, 7479);
      return;
    }
  }
  
  @TargetApi(11)
  public final void kq(final boolean paramBoolean)
  {
    GMTrace.i(1005961871360L, 7495);
    if (com.tencent.mm.compatible.util.f.et(11))
    {
      com.tencent.mm.compatible.a.a.a(11, new com.tencent.mm.compatible.a.a.a()
      {
        public final void run()
        {
          GMTrace.i(16380065742848L, 122041);
          Message localMessage = new Message();
          localMessage.what = 1002;
          localMessage.obj = Boolean.valueOf(paramBoolean);
          ChatFooter.J(ChatFooter.this).sendMessage(localMessage);
          GMTrace.o(16380065742848L, 122041);
        }
      });
      GMTrace.o(1005961871360L, 7495);
      return;
    }
    if (paramBoolean)
    {
      this.mQN.setTextColor(getResources().getColor(R.e.aOp));
      GMTrace.o(1005961871360L, 7495);
      return;
    }
    this.mQN.setTextColor(getResources().getColor(R.e.aNW));
    km(false);
    GMTrace.o(1005961871360L, 7495);
  }
  
  public final void oJ()
  {
    GMTrace.i(999519420416L, 7447);
    this.tzM = true;
    if (this.mQP != null) {
      this.mQP.oJ();
    }
    GMTrace.o(999519420416L, 7447);
  }
  
  public void onGlobalLayout()
  {
    GMTrace.i(1008109355008L, 7511);
    if ((this.activity == null) || (this.activity.getWindow() == null) || (this.activity.getWindow().getDecorView() == null))
    {
      GMTrace.o(1008109355008L, 7511);
      return;
    }
    if (this.tAu == -1)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ChatFooter", "chattingui layout id == -1!");
      GMTrace.o(1008109355008L, 7511);
      return;
    }
    if (this.tAv == null) {
      this.tAv = this.activity.getWindow().getDecorView().findViewById(this.tAu);
    }
    if (this.tAv == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChatFooter", "can't get chattinguilayout by chattinguilayoutid: %d", new Object[] { Integer.valueOf(this.tAu) });
      GMTrace.o(1008109355008L, 7511);
      return;
    }
    int j = this.tAv.getHeight();
    int i = this.tAv.getWidth();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "ashutest::keybord:ChatFooter measure height: %d, height: %d", new Object[] { Integer.valueOf(this.tAv.getMeasuredHeight()), Integer.valueOf(j) });
    if (this.tAm < j) {
      this.tAm = j;
    }
    this.tAl = j;
    if (this.tAs <= 0)
    {
      this.tAs = j;
      GMTrace.o(1008109355008L, 7511);
      return;
    }
    if (this.tAt <= 0)
    {
      this.tAt = i;
      GMTrace.o(1008109355008L, 7511);
      return;
    }
    if ((this.tAs == j) && (this.tAt == i))
    {
      GMTrace.o(1008109355008L, 7511);
      return;
    }
    if ((bMC()) && (this.tzS))
    {
      this.tzS = false;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:Chatfooter Show keybord & hide diy panel by onGlobalLayout");
      postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16381005266944L, 122048);
          ChatFooter.this.bMB();
          GMTrace.o(16381005266944L, 122048);
        }
      }, 10L);
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:Chatfooter keybord old: %d, new: %d", new Object[] { Integer.valueOf(this.tAs), Integer.valueOf(j) });
    int k = Math.abs(this.tAs - j);
    this.tAs = j;
    j = Math.abs(this.tAt - i);
    this.tAt = i;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "alvinluo widthDiff: %d", new Object[] { Integer.valueOf(j) });
    if (this.tAw)
    {
      if (k == 0) {
        break label641;
      }
      if (!com.tencent.mm.compatible.util.j.aN(this.context))
      {
        GMTrace.o(1008109355008L, 7511);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "alvinluo keyboard current height: %d", new Object[] { Integer.valueOf(this.tAj) });
      if ((this.tAj != k) || (k == -1))
      {
        j = com.tencent.mm.compatible.util.j.aL(this.context);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "alvinluo valid panel height: %d", new Object[] { Integer.valueOf(j) });
        i = j;
        if (k >= com.tencent.mm.compatible.util.j.aK(this.context)) {
          if (k <= com.tencent.mm.compatible.util.j.aJ(this.context)) {
            break label698;
          }
        }
      }
    }
    label641:
    label698:
    for (i = j;; i = k)
    {
      if (this.tzZ)
      {
        this.tzZ = false;
        j = i;
        if (i < this.tAj) {
          j = this.tAj;
        }
        this.tAj = j;
        zw(j);
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:Chatfooter Keyboard Size: " + k);
        GMTrace.o(1008109355008L, 7511);
        return;
        this.tAj = i;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ChatFooter", "jacks calc keyBord dialog height:%d", new Object[] { Integer.valueOf(this.tAj) });
        com.tencent.mm.compatible.util.j.p(getContext(), i);
        zw(i);
        continue;
        if (this.tzr != null)
        {
          this.tzr.tyN = true;
          this.tzr.oH();
        }
        if (this.mQP != null)
        {
          this.mQP.cT(com.tencent.mm.compatible.util.j.aL(this.context));
          bMx();
          this.mQP.oM();
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1006498742272L, 7499);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:ChatFooter onLayout change: %B, l:%d, t:%d, r:%d, b:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (getTop() != 0)
    {
      if (getTop() > this.tAk) {
        this.tAk = getTop();
      }
      if (this.tAk - getTop() <= 50) {
        break label141;
      }
      if (this.tzC != null) {
        this.tzC.fS(true);
      }
    }
    while (!paramBoolean)
    {
      GMTrace.o(1006498742272L, 7499);
      return;
      label141:
      if (this.tzC != null) {
        this.tzC.fS(false);
      }
    }
    if (this.tzB != null)
    {
      m localm = this.tzB;
      if (localm.tBc.isShowing())
      {
        localm.tBc.dismiss();
        localm.bMN();
      }
    }
    GMTrace.o(1006498742272L, 7499);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1006632960000L, 7500);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:ChatFooter onMeasure  provide height:%d, height:%d", new Object[] { Integer.valueOf(View.MeasureSpec.getSize(paramInt2)), Integer.valueOf(getMeasuredHeight()) });
    super.onMeasure(paramInt1, paramInt2);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:ChatFooter onMeasure  height:%d", new Object[] { Integer.valueOf(getMeasuredHeight()) });
    GMTrace.o(1006632960000L, 7500);
  }
  
  public final void onPause()
  {
    GMTrace.i(998579896320L, 7440);
    this.tzS = true;
    if (this.mQP != null) {
      this.mQP.onPause();
    }
    if ((this.tvi) && (this.tvf != null)) {
      this.tvf.pause();
    }
    this.tzC.onPause();
    this.tAw = false;
    GMTrace.o(998579896320L, 7440);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1006901395456L, 7502);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "keybord:ChatFooter onSizeChanged  w:%d, h:%d, oldw:%d, oldh:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    GMTrace.o(1006901395456L, 7502);
  }
  
  public final void p(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool2 = true;
    GMTrace.i(1006230306816L, 7497);
    boolean bool1;
    if (paramBoolean)
    {
      if ((com.tencent.mm.y.q.Am().booleanValue()) && (this.tzN != null))
      {
        this.tzN.a(Boolean.valueOf(true), Boolean.valueOf(false));
        this.tzN.b(Boolean.valueOf(true), Boolean.valueOf(false));
      }
      this.tzx.setContentDescription(getContext().getString(R.l.deq));
      switch (paramInt1)
      {
      default: 
        bool1 = false;
      }
    }
    for (;;)
    {
      if (((bool1) && (paramInt2 != 21) && (this.tzy != null)) || ((this.tzy != null) && (!bool1) && ((paramInt2 == 21) || (paramInt2 == 20)))) {
        kr(false);
      }
      if ((paramInt1 != 0) || (bool1)) {
        break;
      }
      kr(false);
      GMTrace.o(1006230306816L, 7497);
      return;
      this.tzw.eWb = true;
      km(true);
      kq(true);
      this.tzI.showSoftInput(this.mQN, 0);
      bool1 = paramBoolean;
      continue;
      Object localObject;
      if (paramInt2 == 22)
      {
        if (this.tzr == null) {
          bMb();
        }
        this.tzr.bLU();
        if (this.mQP != null) {
          this.mQP.setVisibility(8);
        }
        this.tzr.setVisibility(0);
        localObject = this.tzA;
        i.2 local2 = new i.2((i)localObject, ((i)localObject).context.getMainLooper());
        at.xB().A(new i.3((i)localObject, local2));
        km(false);
        if (this.tzJ == 2) {
          zu(1);
        }
      }
      for (;;)
      {
        this.tzw.setVisibility(0);
        if ((!bMC()) || (!com.tencent.mm.compatible.util.j.aN(getContext())))
        {
          localObject = this.tzw.getLayoutParams();
          if ((localObject != null) && (((ViewGroup.LayoutParams)localObject).height == 0))
          {
            ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.compatible.util.j.aL(getContext());
            this.tzw.setLayoutParams((ViewGroup.LayoutParams)localObject);
          }
        }
        bg.da(this);
        bool1 = paramBoolean;
        break;
        if (paramInt2 == 21)
        {
          if (this.tzr != null) {
            this.tzr.setVisibility(8);
          }
          if (this.mQP == null) {
            bMa();
          }
          if (this.mQP != null) {
            this.mQP.setVisibility(0);
          }
          kr(true);
          km(true);
        }
      }
      this.tzw.eWb = true;
      km(true);
      kq(true);
      bool1 = paramBoolean;
      continue;
      this.tzx.setContentDescription(getContext().getString(R.l.der));
      switch (paramInt1)
      {
      default: 
        bool1 = paramBoolean;
        break;
      case 0: 
        bg.da(this);
        km(false);
        bool1 = paramBoolean;
        if (!this.tvi)
        {
          bME();
          bool1 = paramBoolean;
        }
        break;
      case 1: 
        bg.da(this);
        bool1 = paramBoolean;
        break;
      case 2: 
        if (paramInt2 == 20)
        {
          if (this.tvi)
          {
            bg.da(this);
            bool1 = paramBoolean;
          }
          else
          {
            bME();
            bool1 = paramBoolean;
          }
        }
        else if (paramInt2 == 22)
        {
          this.tzr.setVisibility(8);
          bool1 = paramBoolean;
        }
        else if (paramInt2 == 21)
        {
          bool1 = paramBoolean;
          if (this.mQP != null)
          {
            this.mQP.setVisibility(8);
            bool1 = paramBoolean;
          }
        }
        else
        {
          bool1 = paramBoolean;
          if (paramInt2 == 23)
          {
            bLf();
            bME();
            bool1 = paramBoolean;
          }
        }
        break;
      }
    }
    if ((bool1) && (paramInt2 != 22)) {
      if (this.mQN.length() <= 0) {
        break label735;
      }
    }
    label735:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      fP(paramBoolean);
      GMTrace.o(1006230306816L, 7497);
      return;
    }
  }
  
  public final void p(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1000995815424L, 7458);
    if ((paramBoolean) && ((paramString == null) || (paramString.length() == 0) || (this.mQN == null)))
    {
      this.mQN.setText("");
      GMTrace.o(1000995815424L, 7458);
      return;
    }
    this.tzF = true;
    this.mQN.setText(com.tencent.mm.pluginsdk.ui.d.h.b(getContext(), paramString, this.mQN.getTextSize()));
    this.tzF = false;
    if ((paramInt < 0) || (paramInt > this.mQN.getText().length()))
    {
      this.mQN.setSelection(this.mQN.getText().length());
      GMTrace.o(1000995815424L, 7458);
      return;
    }
    this.mQN.setSelection(paramInt);
    GMTrace.o(1000995815424L, 7458);
  }
  
  public final void zr(int paramInt)
  {
    GMTrace.i(1000727379968L, 7456);
    this.tzE.tAE = paramInt;
    GMTrace.o(1000727379968L, 7456);
  }
  
  public final void zs(int paramInt)
  {
    GMTrace.i(1001532686336L, 7462);
    this.tzY = 0;
    int i = com.tencent.mm.br.a.fromDPToPix(getContext(), 180);
    int j = BackwardSupportUtil.b.a(getContext(), 50.0F);
    if (paramInt + j < i) {}
    for (this.tzY = -1;; this.tzY = ((paramInt - i) / 2 + j))
    {
      if (this.qym == null)
      {
        this.qym = new com.tencent.mm.ui.base.q(View.inflate(getContext(), R.i.cHA, null), -1, -2);
        this.jsy = ((ImageView)this.qym.getContentView().findViewById(R.h.clH));
        this.lkC = this.qym.getContentView().findViewById(R.h.clI);
        this.lkD = this.qym.getContentView().findViewById(R.h.clK);
        this.qyn = ((TextView)this.qym.getContentView().findViewById(R.h.clM));
        this.qyo = ((ImageView)this.qym.getContentView().findViewById(R.h.clL));
        this.qyp = this.qym.getContentView().findViewById(R.h.clN);
        this.lkA = this.qym.getContentView().findViewById(R.h.clO);
        this.lkB = this.qym.getContentView().findViewById(R.h.clP);
        this.tzH = ((TextView)this.qym.getContentView().findViewById(R.h.clR));
      }
      if (this.tzY != -1)
      {
        this.lkB.setVisibility(8);
        this.lkA.setVisibility(8);
        this.qyp.setVisibility(0);
        this.qym.showAtLocation(this, 49, 0, this.tzY);
      }
      GMTrace.o(1001532686336L, 7462);
      return;
    }
  }
  
  public final void zt(int paramInt)
  {
    GMTrace.i(1002069557248L, 7466);
    int i = 0;
    for (;;)
    {
      if (i < jsq.length)
      {
        if ((paramInt >= jsp[i]) && (paramInt < jsp[(i + 1)])) {
          this.jsy.setBackgroundDrawable(com.tencent.mm.br.a.b(getContext(), jsq[i]));
        }
      }
      else
      {
        if ((paramInt == -1) && (this.qym != null))
        {
          this.qym.dismiss();
          this.qyp.setVisibility(0);
          this.lkA.setVisibility(8);
          this.lkB.setVisibility(8);
        }
        GMTrace.o(1002069557248L, 7466);
        return;
      }
      i += 1;
    }
  }
  
  public final void zv(int paramInt)
  {
    GMTrace.i(17439848923136L, 129937);
    if (paramInt == this.tAa)
    {
      GMTrace.o(17439848923136L, 129937);
      return;
    }
    this.tAa = paramInt;
    ImageView localImageView1 = (ImageView)findViewById(R.h.cgg);
    ImageView localImageView2 = (ImageView)findViewById(R.h.bSt);
    if (this.tAa == 1)
    {
      localImageView1.setVisibility(8);
      localImageView2.setVisibility(0);
      GMTrace.o(17439848923136L, 129937);
      return;
    }
    localImageView1.setVisibility(0);
    localImageView2.setVisibility(8);
    GMTrace.o(17439848923136L, 129937);
  }
  
  public final void zw(int paramInt)
  {
    GMTrace.i(1007304048640L, 7505);
    com.tencent.mm.compatible.util.j.tF();
    paramInt = com.tencent.mm.compatible.util.j.q(this.context, paramInt);
    this.tAj = paramInt;
    Object localObject;
    if ((paramInt > 0) && (this.tzw != null))
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ChatFooter", "set bottom panel height: %d", new Object[] { Integer.valueOf(paramInt) });
      localObject = new LinearLayout.LayoutParams(-1, 0);
      ((ViewGroup.LayoutParams)localObject).height = paramInt;
      this.tzw.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (this.tzr != null)
    {
      this.tzr.zp(paramInt);
      localObject = this.tzr;
      ((AppPanel)localObject).bLU();
      ((AppPanel)localObject).oH();
    }
    if (this.tvf != null)
    {
      this.tvf.zz(paramInt);
      this.tvf.bLU();
    }
    if (this.mQP != null)
    {
      if (!bMC()) {
        bMx();
      }
      this.mQP.cT(paramInt);
      this.mQP.oM();
    }
    GMTrace.o(1007304048640L, 7505);
  }
  
  public final void zx(int paramInt)
  {
    GMTrace.i(1007975137280L, 7510);
    this.tAv = null;
    this.tAu = paramInt;
    GMTrace.o(1007975137280L, 7510);
  }
  
  private static final class a
  {
    public String tAC;
    public String tAD;
    public int tAE;
    public HashMap<String, LinkedList<HashMap<String, String>>> tAF;
    
    public a()
    {
      GMTrace.i(1018980990976L, 7592);
      this.tAF = new HashMap();
      GMTrace.o(1018980990976L, 7592);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(Boolean paramBoolean1, Boolean paramBoolean2);
    
    public abstract void b(Boolean paramBoolean1, Boolean paramBoolean2);
  }
  
  public static abstract interface c
  {
    public abstract void f(Boolean paramBoolean);
  }
  
  public static abstract interface d
  {
    public abstract boolean ks(boolean paramBoolean);
  }
  
  public final class e
    implements TextWatcher
  {
    TextWatcher tAG;
    private boolean tAH;
    private boolean tAI;
    
    public e(TextWatcher paramTextWatcher)
    {
      GMTrace.i(986500300800L, 7350);
      this.tAH = false;
      this.tAI = com.tencent.mm.compatible.util.f.eu(11);
      this.tAG = paramTextWatcher;
      GMTrace.o(986500300800L, 7350);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      boolean bool = true;
      GMTrace.i(986634518528L, 7351);
      if ((ChatFooter.g(ChatFooter.this)) && (this.tAH) && (paramEditable.length() > 0))
      {
        this.tAH = false;
        ChatFooter.a(ChatFooter.this).setText(paramEditable.subSequence(0, paramEditable.length() - 1));
        if (ChatFooter.a(ChatFooter.this).length() > 0) {
          ChatFooter.h(ChatFooter.this).performClick();
        }
        com.tencent.mm.sdk.platformtools.w.d("VOICEDEBUG", "Last Text Time = " + System.currentTimeMillis());
        GMTrace.o(986634518528L, 7351);
        return;
      }
      this.tAG.afterTextChanged(paramEditable);
      if (ChatFooter.p(ChatFooter.this) != null)
      {
        if (ChatFooter.a(ChatFooter.this).getLineCount() > 1)
        {
          ChatFooter.p(ChatFooter.this).setVisibility(0);
          ChatFooter.p(ChatFooter.this).setText(paramEditable.length() + "/140");
        }
      }
      else {
        if ((paramEditable.length() <= 0) || (paramEditable.toString().trim().length() <= 0)) {
          break label302;
        }
      }
      for (;;)
      {
        ChatFooter.b(ChatFooter.this, bool);
        if (ChatFooter.n(ChatFooter.this) != null) {
          ChatFooter.n(ChatFooter.this).aq(bool);
        }
        com.tencent.mm.sdk.platformtools.w.d("VOICEDEBUG", "Last Text Time = " + System.currentTimeMillis());
        GMTrace.o(986634518528L, 7351);
        return;
        ChatFooter.p(ChatFooter.this).setVisibility(8);
        break;
        label302:
        bool = false;
      }
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(986768736256L, 7352);
      this.tAG.beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
      com.tencent.mm.sdk.platformtools.w.d("VOICEDEBUG", "First Text Time = " + System.currentTimeMillis());
      GMTrace.o(986768736256L, 7352);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(986902953984L, 7353);
      if ((ChatFooter.g(ChatFooter.this)) && (paramInt2 == 0) && (paramInt1 == paramCharSequence.length() - 1) && (paramInt3 == 1) && (paramCharSequence.charAt(paramCharSequence.length() - 1) == '\n'))
      {
        this.tAH = true;
        GMTrace.o(986902953984L, 7353);
        return;
      }
      this.tAG.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
      GMTrace.o(986902953984L, 7353);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\ChatFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */