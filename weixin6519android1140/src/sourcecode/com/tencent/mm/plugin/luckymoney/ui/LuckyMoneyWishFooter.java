package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.MMEditText.a;
import java.util.ArrayList;
import java.util.List;

public class LuckyMoneyWishFooter
  extends BasePanelKeybordLayout
{
  private MMActivity ezR;
  private ImageButton mQM;
  private MMEditText mQN;
  private Button mQO;
  private ChatFooterPanel mQP;
  boolean mQQ;
  public boolean mQR;
  private boolean mQS;
  boolean mQT;
  private TextWatcher mQU;
  private int state;
  
  public LuckyMoneyWishFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9785546113024L, 72908);
    this.state = 0;
    this.mQQ = false;
    this.mQR = false;
    this.mQS = true;
    this.mQT = true;
    this.mQU = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9820845375488L, 73171);
        if (LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).getText() == null)
        {
          GMTrace.o(9820845375488L, 73171);
          return;
        }
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).requestFocus();
        if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
        for (int i = 1;; i = 0)
        {
          if ((i != 0) && (LuckyMoneyWishFooter.this.mQT))
          {
            LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this, true);
            LuckyMoneyWishFooter.this.mQT = false;
          }
          if (i == 0)
          {
            LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this, false);
            LuckyMoneyWishFooter.this.mQT = true;
          }
          GMTrace.o(9820845375488L, 73171);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9820576940032L, 73169);
        GMTrace.o(9820576940032L, 73169);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9820711157760L, 73170);
        GMTrace.o(9820711157760L, 73170);
      }
    };
    this.ezR = ((MMActivity)paramContext);
    paramContext = (ViewGroup)inflate(this.ezR, a.g.sNg, this);
    this.mQO = ((Button)paramContext.findViewById(a.f.sAG));
    fP(false);
    this.mQM = ((ImageButton)paramContext.findViewById(a.f.sAF));
    this.mQM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9830911705088L, 73246);
        LuckyMoneyWishFooter.this.mQQ = true;
        w.i("MicroMsg.SnsCommentFooter", "state onClick" + LuckyMoneyWishFooter.b(LuckyMoneyWishFooter.this));
        if (LuckyMoneyWishFooter.b(LuckyMoneyWishFooter.this) == 0)
        {
          LuckyMoneyWishFooter.c(LuckyMoneyWishFooter.this).aLo();
          LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).requestFocus();
          LuckyMoneyWishFooter.d(LuckyMoneyWishFooter.this);
          LuckyMoneyWishFooter.e(LuckyMoneyWishFooter.this).setImageResource(a.h.cPb);
          LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this, 1);
          LuckyMoneyWishFooter.f(LuckyMoneyWishFooter.this);
          GMTrace.o(9830911705088L, 73246);
          return;
        }
        LuckyMoneyWishFooter.f(LuckyMoneyWishFooter.this);
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).requestFocus();
        LuckyMoneyWishFooter.g(LuckyMoneyWishFooter.this).setVisibility(8);
        LuckyMoneyWishFooter.c(LuckyMoneyWishFooter.this).aLs();
        LuckyMoneyWishFooter.e(LuckyMoneyWishFooter.this).setImageResource(a.h.cPa);
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this, 0);
        GMTrace.o(9830911705088L, 73246);
      }
    });
    this.mQN = ((MMEditText)paramContext.findViewById(a.f.sAD));
    this.mQN.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9859768516608L, 73461);
        LuckyMoneyWishFooter.f(LuckyMoneyWishFooter.this);
        LuckyMoneyWishFooter.g(LuckyMoneyWishFooter.this).setVisibility(8);
        LuckyMoneyWishFooter.g(LuckyMoneyWishFooter.this).onPause();
        LuckyMoneyWishFooter.e(LuckyMoneyWishFooter.this).setImageResource(a.e.aVG);
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this, 0);
        GMTrace.o(9859768516608L, 73461);
        return false;
      }
    });
    if (e.tAM == null)
    {
      this.mQP = new d(this.ezR);
      GMTrace.o(9785546113024L, 72908);
      return;
    }
    this.mQP = e.tAM.ci(getContext());
    this.mQP.cU(ChatFooterPanel.ttd);
    this.mQP.setVisibility(8);
    this.mQP.setBackgroundResource(a.e.aUC);
    ((LinearLayout)findViewById(a.f.bZf)).addView(this.mQP, -1, 0);
    this.mQP.oJ();
    this.mQP.ar(false);
    this.mQP.tta = new ChatFooterPanel.a()
    {
      public final void aMV()
      {
        GMTrace.i(9818697891840L, 73155);
        GMTrace.o(9818697891840L, 73155);
      }
      
      public final void acZ()
      {
        GMTrace.i(9818966327296L, 73157);
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).xqp.sendKeyEvent(new KeyEvent(0, 67));
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).xqp.sendKeyEvent(new KeyEvent(1, 67));
        GMTrace.o(9818966327296L, 73157);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(9819100545024L, 73158);
        try
        {
          LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).Xi(paramAnonymousString);
          GMTrace.o(9819100545024L, 73158);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.printErrStackTrace("MicroMsg.SnsCommentFooter", paramAnonymousString, "", new Object[0]);
          GMTrace.o(9819100545024L, 73158);
        }
      }
      
      public final void fQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(9818832109568L, 73156);
        GMTrace.o(9818832109568L, 73156);
      }
    };
    GMTrace.o(9785546113024L, 72908);
  }
  
  private void acV()
  {
    GMTrace.i(9785814548480L, 72910);
    this.mQP.onResume();
    this.mQP.setVisibility(0);
    ViewGroup.LayoutParams localLayoutParams = this.mQP.getLayoutParams();
    if (((localLayoutParams != null) && (localLayoutParams.height <= 0)) || ((localLayoutParams != null) && (j.aN(getContext())) && (this.mQS)))
    {
      localLayoutParams.height = j.aL(getContext());
      this.mQP.setLayoutParams(localLayoutParams);
      this.mQS = false;
    }
    GMTrace.o(9785814548480L, 72910);
  }
  
  private void fP(boolean paramBoolean)
  {
    GMTrace.i(9786619854848L, 72916);
    Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), a.a.aLC);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), a.a.aLD);
    localAnimation1.setDuration(150L);
    localAnimation2.setDuration(150L);
    if (this.mQO == null)
    {
      GMTrace.o(9786619854848L, 72916);
      return;
    }
    if (paramBoolean)
    {
      if ((this.mQO.getVisibility() == 8) || (this.mQO.getVisibility() == 4))
      {
        GMTrace.o(9786619854848L, 72916);
        return;
      }
      this.mQO.startAnimation(localAnimation2);
      this.mQO.setVisibility(8);
      GMTrace.o(9786619854848L, 72916);
      return;
    }
    if ((this.mQO.getVisibility() == 0) || (this.mQO.getVisibility() == 0))
    {
      GMTrace.o(9786619854848L, 72916);
      return;
    }
    this.mQO.startAnimation(localAnimation1);
    this.mQO.setVisibility(0);
    GMTrace.o(9786619854848L, 72916);
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(9786217201664L, 72913);
    this.mQO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9796686184448L, 72991);
        parama.BF(LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).getText().toString());
        LuckyMoneyWishFooter.a(LuckyMoneyWishFooter.this).setText("");
        GMTrace.o(9796686184448L, 72991);
      }
    });
    GMTrace.o(9786217201664L, 72913);
  }
  
  public final boolean a(MMEditText.a parama)
  {
    GMTrace.i(9786082983936L, 72912);
    if (this.mQN != null)
    {
      this.mQN.xqq = parama;
      GMTrace.o(9786082983936L, 72912);
      return true;
    }
    GMTrace.o(9786082983936L, 72912);
    return false;
  }
  
  public final void aMS()
  {
    GMTrace.i(9785948766208L, 72911);
    this.mQN.setFilters(new InputFilter[] { new InputFilter.LengthFilter(25) });
    GMTrace.o(9785948766208L, 72911);
  }
  
  public final void aMT()
  {
    GMTrace.i(9786485637120L, 72915);
    if (this.mQP != null)
    {
      w.i("MicroMsg.SnsCommentFooter", "commentfooter release");
      this.mQP.oI();
      this.mQP.destroy();
    }
    GMTrace.o(9786485637120L, 72915);
  }
  
  protected final List<View> aMU()
  {
    GMTrace.i(16563272941568L, 123406);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.mQP);
    GMTrace.o(16563272941568L, 123406);
    return localArrayList;
  }
  
  protected final void oD(int paramInt)
  {
    GMTrace.i(9786351419392L, 72914);
    super.oD(paramInt);
    switch (paramInt)
    {
    default: 
      this.mQR = false;
      GMTrace.o(9786351419392L, 72914);
      return;
    }
    this.mQR = true;
    GMTrace.o(9786351419392L, 72914);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(9785680330752L, 72909);
    this.state = 0;
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.mQP != null)
      {
        w.i("MicroMsg.SnsCommentFooter", "showState " + bool);
        if (bool) {
          break;
        }
        this.mQP.setVisibility(8);
        this.mQM.setImageResource(a.h.cPa);
        this.ezR.aLo();
        requestLayout();
      }
      super.setVisibility(paramInt);
      GMTrace.o(9785680330752L, 72909);
      return;
    }
    if (this.state == 0)
    {
      this.ezR.aLs();
      this.mQN.requestFocus();
      this.mQP.setVisibility(8);
    }
    for (;;)
    {
      this.mQS = false;
      break;
      this.ezR.aLo();
      this.mQN.requestFocus();
      acV();
    }
  }
  
  public static abstract interface a
  {
    public abstract void BF(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyWishFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */