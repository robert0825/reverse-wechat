package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.pluginsdk.ui.chat.n;
import com.tencent.mm.pluginsdk.ui.chat.n.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public class VoiceInputFooter
  extends BasePanelKeybordLayout
{
  private MMActivity ezR;
  ChatFooterPanel mQP;
  LinearLayout njC;
  MMEditText qfz;
  n tvf;
  ImageButton tvg;
  private ImageButton tvh;
  private boolean tvi;
  private boolean tvj;
  private final int tvk;
  private final int tvl;
  a tvm;
  
  public VoiceInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(14460752232448L, 107741);
    this.qfz = null;
    this.tvi = false;
    this.tvj = false;
    this.tvk = 1;
    this.tvl = 2;
    this.ezR = ((MMActivity)paramContext);
    paramContext = (ViewGroup)v.fb(this.ezR).inflate(R.i.cHv, this);
    this.tvh = ((ImageButton)paramContext.findViewById(R.h.bdL));
    this.tvh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14461825974272L, 107749);
        VoiceInputFooter.c(VoiceInputFooter.this);
        GMTrace.o(14461825974272L, 107749);
      }
    });
    this.tvg = ((ImageButton)paramContext.findViewById(R.h.bdF));
    this.tvg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16684605767680L, 124310);
        VoiceInputFooter.d(VoiceInputFooter.this);
        GMTrace.o(16684605767680L, 124310);
      }
    });
    if (e.tAM == null)
    {
      this.mQP = new d(this.ezR);
      GMTrace.o(14460752232448L, 107741);
      return;
    }
    this.mQP = e.tAM.ci(getContext());
    this.mQP.cU(ChatFooterPanel.SCENE_SNS);
    this.mQP.setVisibility(8);
    this.njC = ((LinearLayout)findViewById(R.h.bZf));
    this.njC.setOnClickListener(null);
    this.njC.addView(this.mQP, -1, 0);
    this.mQP.oJ();
    this.mQP.ar(false);
    this.mQP.tta = new ChatFooterPanel.a()
    {
      public final void aMV()
      {
        GMTrace.i(16673465696256L, 124227);
        GMTrace.o(16673465696256L, 124227);
      }
      
      public final void acZ()
      {
        GMTrace.i(16673734131712L, 124229);
        VoiceInputFooter.e(VoiceInputFooter.this).xqp.sendKeyEvent(new KeyEvent(0, 67));
        VoiceInputFooter.e(VoiceInputFooter.this).xqp.sendKeyEvent(new KeyEvent(1, 67));
        GMTrace.o(16673734131712L, 124229);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(16673868349440L, 124230);
        try
        {
          VoiceInputFooter.e(VoiceInputFooter.this).Xi(paramAnonymousString);
          GMTrace.o(16673868349440L, 124230);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.printErrStackTrace("MicroMsg.VoiceInputFooter", paramAnonymousString, "", new Object[0]);
          GMTrace.o(16673868349440L, 124230);
        }
      }
      
      public final void fQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(16673599913984L, 124228);
        GMTrace.o(16673599913984L, 124228);
      }
    };
    GMTrace.o(14460752232448L, 107741);
  }
  
  private static void nU(int paramInt)
  {
    GMTrace.i(16685142638592L, 124314);
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    if (paramInt == 1) {
      localVoiceInputBehavior.smileIconClick = 1;
    }
    for (;;)
    {
      w.i("MicroMsg.VoiceInputFooter", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(localVoiceInputBehavior.cancel), Integer.valueOf(localVoiceInputBehavior.send), Integer.valueOf(localVoiceInputBehavior.click), Integer.valueOf(localVoiceInputBehavior.longClick), Long.valueOf(localVoiceInputBehavior.longClickTime), Integer.valueOf(localVoiceInputBehavior.textClick), Integer.valueOf(localVoiceInputBehavior.textChangeCount), Long.valueOf(localVoiceInputBehavior.textChangeTime), Integer.valueOf(localVoiceInputBehavior.textChangeReturn), Long.valueOf(localVoiceInputBehavior.voiceInputTime), Integer.valueOf(localVoiceInputBehavior.fail), Integer.valueOf(localVoiceInputBehavior.clear), Integer.valueOf(localVoiceInputBehavior.smileIconClick), Integer.valueOf(localVoiceInputBehavior.voiceIconClick), Integer.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClickTime) });
      log_13905 locallog_13905 = new log_13905();
      locallog_13905.viOp_ = localVoiceInputBehavior;
      g.ork.b(13905, locallog_13905);
      GMTrace.o(16685142638592L, 124314);
      return;
      if (paramInt != 2) {
        break;
      }
      localVoiceInputBehavior.voiceIconClick = 1;
    }
    GMTrace.o(16685142638592L, 124314);
  }
  
  protected final List<View> aMU()
  {
    GMTrace.i(16685008420864L, 124313);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.mQP);
    localArrayList.add(this.tvf);
    GMTrace.o(16685008420864L, 124313);
    return localArrayList;
  }
  
  final void acy()
  {
    GMTrace.i(14461020667904L, 107743);
    this.tvj = false;
    this.mQP.onPause();
    this.mQP.setVisibility(8);
    GMTrace.o(14461020667904L, 107743);
  }
  
  public final boolean bLe()
  {
    GMTrace.i(16684739985408L, 124311);
    if (this.tvf.getVisibility() == 0)
    {
      GMTrace.o(16684739985408L, 124311);
      return true;
    }
    GMTrace.o(16684739985408L, 124311);
    return false;
  }
  
  final void bLf()
  {
    GMTrace.i(16684874203136L, 124312);
    this.tvi = false;
    if (this.tvf != null)
    {
      this.tvf.pause();
      this.tvf.setVisibility(8);
      this.tvh.setImageResource(R.g.bbv);
      int i = a.W(this.ezR, R.f.aSX);
      this.tvh.setPadding(0, 0, i, 0);
      this.tvg.setVisibility(0);
      if (this.tvm != null) {
        this.tvm.ka(false);
      }
    }
    GMTrace.o(16684874203136L, 124312);
  }
  
  public final boolean bpP()
  {
    GMTrace.i(14460886450176L, 107742);
    if (this.mQP.getVisibility() == 0)
    {
      GMTrace.o(14460886450176L, 107742);
      return true;
    }
    GMTrace.o(14460886450176L, 107742);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void bLh();
    
    public abstract void ka(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\VoiceInputFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */