package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnsCommentFooter
  extends BasePanelKeybordLayout
{
  private MMActivity ezR;
  private ImageButton mQM;
  MMEditText mQN;
  private Button mQO;
  ChatFooterPanel mQP;
  boolean mQQ;
  public boolean mQR;
  private boolean mQS;
  boolean mQT;
  private TextWatcher mQU;
  bew pso;
  ImageView qab;
  Button qac;
  int qad;
  public boolean qae;
  private String qaf;
  private boolean qag;
  a qah;
  d qai;
  private bi qaj;
  int state;
  
  public SnsCommentFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8420820254720L, 62740);
    this.pso = null;
    this.qad = 0;
    this.state = 0;
    this.mQQ = false;
    this.mQR = false;
    this.mQS = true;
    this.qaf = "";
    this.qag = false;
    this.mQT = true;
    this.mQU = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(8560272474112L, 63779);
        if (SnsCommentFooter.a(SnsCommentFooter.this).getText() == null)
        {
          GMTrace.o(8560272474112L, 63779);
          return;
        }
        SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
        if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
        for (int i = 1;; i = 0)
        {
          if ((i != 0) && (SnsCommentFooter.this.mQT))
          {
            SnsCommentFooter.a(SnsCommentFooter.this, true);
            SnsCommentFooter.this.mQT = false;
          }
          if (i == 0)
          {
            SnsCommentFooter.a(SnsCommentFooter.this, false);
            SnsCommentFooter.this.mQT = true;
          }
          GMTrace.o(8560272474112L, 63779);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8560004038656L, 63777);
        GMTrace.o(8560004038656L, 63777);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8560138256384L, 63778);
        GMTrace.o(8560138256384L, 63778);
      }
    };
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(8420820254720L, 62740);
  }
  
  private void acV()
  {
    GMTrace.i(8421357125632L, 62744);
    this.mQP.onResume();
    this.mQP.setVisibility(0);
    ViewGroup.LayoutParams localLayoutParams = this.mQP.getLayoutParams();
    if ((localLayoutParams != null) && (j.aN(getContext())) && (this.mQS))
    {
      localLayoutParams.height = j.aL(getContext());
      this.mQP.setLayoutParams(localLayoutParams);
      this.mQS = false;
    }
    if (this.qai != null) {
      this.qai.onShow();
    }
    GMTrace.o(8421357125632L, 62744);
  }
  
  private void boJ()
  {
    GMTrace.i(14314454908928L, 106651);
    if (this.ezR.vKB.vLo != 1) {
      this.ezR.aLs();
    }
    GMTrace.o(14314454908928L, 106651);
  }
  
  private void boK()
  {
    GMTrace.i(14314589126656L, 106652);
    if (this.ezR.vKB.vLo == 1) {
      this.ezR.aLo();
    }
    GMTrace.o(14314589126656L, 106652);
  }
  
  private void fP(boolean paramBoolean)
  {
    GMTrace.i(8422967738368L, 62756);
    Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), i.a.aLC);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), i.a.aLD);
    localAnimation1.setDuration(150L);
    localAnimation2.setDuration(150L);
    if ((this.mQO == null) || (this.qac == null))
    {
      GMTrace.o(8422967738368L, 62756);
      return;
    }
    if (paramBoolean)
    {
      if ((this.mQO.getVisibility() == 8) || (this.mQO.getVisibility() == 4))
      {
        GMTrace.o(8422967738368L, 62756);
        return;
      }
      this.qac.startAnimation(localAnimation1);
      this.qac.setVisibility(0);
      this.mQO.startAnimation(localAnimation2);
      this.mQO.setVisibility(8);
    }
    for (;;)
    {
      this.qac.getParent().requestLayout();
      GMTrace.o(8422967738368L, 62756);
      return;
      if ((this.mQO.getVisibility() == 0) || (this.mQO.getVisibility() == 0))
      {
        GMTrace.o(8422967738368L, 62756);
        return;
      }
      this.mQO.startAnimation(localAnimation1);
      this.mQO.setVisibility(0);
      this.qac.startAnimation(localAnimation2);
      this.qac.setVisibility(8);
    }
  }
  
  public final void Jd(String paramString)
  {
    GMTrace.i(8422162432000L, 62750);
    this.mQN.setHint(com.tencent.mm.pluginsdk.ui.d.h.b(getContext(), paramString, this.mQN.getTextSize()));
    GMTrace.o(8422162432000L, 62750);
  }
  
  public final void a(final c paramc)
  {
    GMTrace.i(8422430867456L, 62752);
    this.qac.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8572217851904L, 63868);
        paramAnonymousView = c.d(SnsCommentFooter.a(SnsCommentFooter.this)).Ea(b.tX());
        paramAnonymousView.xkl = true;
        paramAnonymousView.a(new c.a()
        {
          public final void acJ()
          {
            GMTrace.i(8674491760640L, 64630);
            GMTrace.o(8674491760640L, 64630);
          }
          
          public final void ack()
          {
            GMTrace.i(8674625978368L, 64631);
            com.tencent.mm.ui.base.h.h(SnsCommentFooter.l(SnsCommentFooter.this), i.j.plg, i.j.plh);
            GMTrace.o(8674625978368L, 64631);
          }
          
          public final void sT(String paramAnonymous2String)
          {
            GMTrace.i(8674357542912L, 64629);
            SnsCommentFooter.6.this.qam.IR(SnsCommentFooter.a(SnsCommentFooter.this).getText().toString());
            SnsCommentFooter.a(SnsCommentFooter.this).setText("");
            GMTrace.o(8674357542912L, 64629);
          }
        });
        GMTrace.o(8572217851904L, 63868);
      }
    });
    GMTrace.o(8422430867456L, 62752);
  }
  
  public final void a(String paramString, bew parambew)
  {
    GMTrace.i(8421759778816L, 62747);
    this.qad = 0;
    if (!bg.nm(paramString)) {
      this.mQN.setHint(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), paramString + this.ezR.getString(i.j.piC, new Object[] { Float.valueOf(this.mQN.getTextSize()) })));
    }
    for (;;)
    {
      this.pso = parambew;
      GMTrace.o(8421759778816L, 62747);
      return;
      this.mQN.setHint("");
    }
  }
  
  public final void aMT()
  {
    GMTrace.i(8422833520640L, 62755);
    this.qaj = null;
    if (this.mQP != null)
    {
      w.i("MicroMsg.SnsCommentFooter", "commentfooter release");
      this.mQP.oI();
      this.mQP.destroy();
    }
    GMTrace.o(8422833520640L, 62755);
  }
  
  protected final List<View> aMU()
  {
    GMTrace.i(16634139901952L, 123934);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.mQP);
    GMTrace.o(16634139901952L, 123934);
    return localArrayList;
  }
  
  public final void b(String paramString, bew parambew)
  {
    GMTrace.i(8421893996544L, 62748);
    if (!bg.nm(paramString))
    {
      this.mQN.setHint(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), this.ezR.getString(i.j.piu) + paramString + this.ezR.getString(i.j.piC, new Object[] { Float.valueOf(this.mQN.getTextSize()) })));
      this.qad = 1;
    }
    for (;;)
    {
      this.pso = parambew;
      GMTrace.o(8421893996544L, 62748);
      return;
      this.mQN.setHint("");
    }
  }
  
  public final boolean boH()
  {
    GMTrace.i(8420686036992L, 62739);
    if ((this.mQN.getText() == null) || (bg.nm(this.mQN.getText().toString())))
    {
      GMTrace.o(8420686036992L, 62739);
      return true;
    }
    GMTrace.o(8420686036992L, 62739);
    return false;
  }
  
  public final void boI()
  {
    GMTrace.i(8420954472448L, 62741);
    ViewGroup localViewGroup = (ViewGroup)inflate(this.ezR, i.g.pfD, this);
    this.qab = ((ImageView)localViewGroup.findViewById(i.f.pdi));
    this.mQO = ((Button)localViewGroup.findViewById(i.f.oZm));
    this.qac = ((Button)localViewGroup.findViewById(i.f.oZg));
    this.mQN = ((MMEditText)localViewGroup.findViewById(i.f.oZe));
    fP(false);
    this.mQM = ((ImageButton)localViewGroup.findViewById(i.f.bdF));
    this.mQM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8540274032640L, 63630);
        SnsCommentFooter.this.mQQ = true;
        w.i("MicroMsg.SnsCommentFooter", "state onClick" + SnsCommentFooter.c(SnsCommentFooter.this));
        if (SnsCommentFooter.c(SnsCommentFooter.this) == 0)
        {
          SnsCommentFooter.d(SnsCommentFooter.this);
          SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
          SnsCommentFooter.a(SnsCommentFooter.this, 1);
          SnsCommentFooter.e(SnsCommentFooter.this);
          SnsCommentFooter.f(SnsCommentFooter.this).setImageResource(i.e.aVH);
          SnsCommentFooter.g(SnsCommentFooter.this);
          GMTrace.o(8540274032640L, 63630);
          return;
        }
        SnsCommentFooter.h(SnsCommentFooter.this);
        SnsCommentFooter.g(SnsCommentFooter.this);
        SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
        SnsCommentFooter.i(SnsCommentFooter.this);
        SnsCommentFooter.f(SnsCommentFooter.this).setImageResource(i.e.aVG);
        SnsCommentFooter.a(SnsCommentFooter.this, 0);
        GMTrace.o(8540274032640L, 63630);
      }
    });
    this.mQN.setHint(this.ezR.getString(i.j.plc));
    this.mQN.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8334249820160L, 62095);
        SnsCommentFooter.g(SnsCommentFooter.this);
        SnsCommentFooter.j(SnsCommentFooter.this).setVisibility(8);
        SnsCommentFooter.j(SnsCommentFooter.this).onPause();
        SnsCommentFooter.f(SnsCommentFooter.this).setImageResource(i.e.aVG);
        if (SnsCommentFooter.k(SnsCommentFooter.this) != null) {
          SnsCommentFooter.k(SnsCommentFooter.this).boF();
        }
        SnsCommentFooter.a(SnsCommentFooter.this, 0);
        GMTrace.o(8334249820160L, 62095);
        return false;
      }
    });
    if (e.tAM == null)
    {
      this.mQP = new d(this.ezR);
      GMTrace.o(8420954472448L, 62741);
      return;
    }
    this.mQP = e.tAM.ci(getContext());
    this.mQP.cU(ChatFooterPanel.SCENE_SNS);
    this.mQP.setVisibility(8);
    this.mQP.setBackgroundResource(i.e.aUC);
    ((LinearLayout)findViewById(i.f.bZf)).addView(this.mQP, -1, 0);
    this.mQP.oJ();
    this.mQP.ar(false);
    this.mQP.tta = new ChatFooterPanel.a()
    {
      public final void aMV()
      {
        GMTrace.i(8684960743424L, 64708);
        GMTrace.o(8684960743424L, 64708);
      }
      
      public final void acZ()
      {
        GMTrace.i(8685229178880L, 64710);
        if (SnsCommentFooter.a(SnsCommentFooter.this) != null)
        {
          if (SnsCommentFooter.a(SnsCommentFooter.this).xqp == null)
          {
            GMTrace.o(8685229178880L, 64710);
            return;
          }
          SnsCommentFooter.a(SnsCommentFooter.this).xqp.sendKeyEvent(new KeyEvent(0, 67));
          SnsCommentFooter.a(SnsCommentFooter.this).xqp.sendKeyEvent(new KeyEvent(1, 67));
        }
        GMTrace.o(8685229178880L, 64710);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(8685363396608L, 64711);
        try
        {
          SnsCommentFooter.a(SnsCommentFooter.this).Xi(paramAnonymousString);
          GMTrace.o(8685363396608L, 64711);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.printErrStackTrace("MicroMsg.SnsCommentFooter", paramAnonymousString, "", new Object[0]);
          GMTrace.o(8685363396608L, 64711);
        }
      }
      
      public final void fQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(8685094961152L, 64709);
        GMTrace.o(8685094961152L, 64709);
      }
    };
    GMTrace.o(8420954472448L, 62741);
  }
  
  public final boolean boL()
  {
    GMTrace.i(14443169710080L, 107610);
    if (this.state == 1)
    {
      GMTrace.o(14443169710080L, 107610);
      return true;
    }
    GMTrace.o(14443169710080L, 107610);
    return false;
  }
  
  public final void boM()
  {
    GMTrace.i(8421491343360L, 62745);
    if (this.mQN == null)
    {
      w.e("MicroMsg.SnsCommentFooter", "send edittext is null");
      GMTrace.o(8421491343360L, 62745);
      return;
    }
    this.mQN.removeTextChangedListener(this.mQU);
    this.mQN.addTextChangedListener(this.mQU);
    GMTrace.o(8421491343360L, 62745);
  }
  
  public final void boN()
  {
    GMTrace.i(8422028214272L, 62749);
    this.mQN.setText("");
    this.mQN.setHint("");
    this.pso = null;
    this.qad = 0;
    this.state = 0;
    GMTrace.o(8422028214272L, 62749);
  }
  
  public final bew boO()
  {
    GMTrace.i(8422296649728L, 62751);
    if (this.pso == null)
    {
      localbew = new bew();
      GMTrace.o(8422296649728L, 62751);
      return localbew;
    }
    bew localbew = this.pso;
    GMTrace.o(8422296649728L, 62751);
    return localbew;
  }
  
  public final void boP()
  {
    GMTrace.i(8422565085184L, 62753);
    this.qab.setVisibility(8);
    GMTrace.o(8422565085184L, 62753);
  }
  
  public final void h(final List<l> paramList, String paramString)
  {
    GMTrace.i(8421625561088L, 62746);
    this.qaf = paramString;
    l locall;
    if (this.mQN != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        locall = (l)localIterator.next();
        if (paramString.equals(locall.amf)) {
          paramList.remove(locall);
        }
      }
    }
    for (paramString = bg.aq(locall.text, "");; paramString = "")
    {
      if (!bg.nm(paramString))
      {
        this.qac.setVisibility(0);
        this.mQO.setVisibility(8);
        this.mQN.setText("");
        this.mQN.Xi(paramString);
      }
      for (;;)
      {
        if (!this.qag) {
          this.mQN.addTextChangedListener(new TextWatcher()
          {
            public final void afterTextChanged(Editable paramAnonymousEditable)
            {
              GMTrace.i(8545508524032L, 63669);
              if (SnsCommentFooter.a(SnsCommentFooter.this).getText() == null)
              {
                GMTrace.o(8545508524032L, 63669);
                return;
              }
              w.d("MicroMsg.SnsCommentFooter", "update commentkey:" + SnsCommentFooter.b(SnsCommentFooter.this));
              Object localObject = paramList.iterator();
              while (((Iterator)localObject).hasNext())
              {
                l locall = (l)((Iterator)localObject).next();
                if (SnsCommentFooter.b(SnsCommentFooter.this).equals(locall.amf))
                {
                  w.d("MicroMsg.SnsCommentFooter", "afterTextChanged update");
                  locall.text = SnsCommentFooter.a(SnsCommentFooter.this).getText().toString();
                }
              }
              for (int i = 1;; i = 0)
              {
                if (i == 0)
                {
                  w.d("MicroMsg.SnsCommentFooter", "afterTextChanged add");
                  localObject = new l();
                  ((l)localObject).amf = SnsCommentFooter.b(SnsCommentFooter.this);
                  ((l)localObject).text = SnsCommentFooter.a(SnsCommentFooter.this).getText().toString();
                  if ((((l)localObject).text != null) && (((l)localObject).text.length() > 0)) {
                    paramList.add(localObject);
                  }
                }
                if (paramList.size() > 5)
                {
                  w.d("MicroMsg.SnsCommentFooter", "comments remove");
                  paramList.remove(0);
                }
                SnsCommentFooter.a(SnsCommentFooter.this).requestFocus();
                if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
                for (boolean bool = true;; bool = false)
                {
                  if ((bool) && (SnsCommentFooter.this.mQT))
                  {
                    SnsCommentFooter.a(SnsCommentFooter.this, bool);
                    SnsCommentFooter.this.mQT = false;
                  }
                  if (!bool)
                  {
                    SnsCommentFooter.a(SnsCommentFooter.this, bool);
                    SnsCommentFooter.this.mQT = true;
                  }
                  GMTrace.o(8545508524032L, 63669);
                  return;
                }
              }
            }
            
            public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
            {
              GMTrace.i(8545374306304L, 63668);
              GMTrace.o(8545374306304L, 63668);
            }
            
            public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
            {
              GMTrace.i(8545240088576L, 63667);
              GMTrace.o(8545240088576L, 63667);
            }
          });
        }
        this.qag = true;
        GMTrace.o(8421625561088L, 62746);
        return;
        this.mQN.setText("");
      }
    }
  }
  
  public final void ic(boolean paramBoolean)
  {
    GMTrace.i(8421222907904L, 62743);
    if (this.mQP == null)
    {
      GMTrace.o(8421222907904L, 62743);
      return;
    }
    this.qae = paramBoolean;
    w.i("MicroMsg.SnsCommentFooter", "showState " + paramBoolean);
    if (!paramBoolean)
    {
      this.mQP.setVisibility(8);
      this.mQM.setImageResource(i.i.cPa);
      boK();
      requestLayout();
      GMTrace.o(8421222907904L, 62743);
      return;
    }
    if (this.state == 0)
    {
      boJ();
      this.mQN.requestFocus();
      this.mQP.setVisibility(8);
    }
    for (;;)
    {
      this.mQS = false;
      GMTrace.o(8421222907904L, 62743);
      return;
      boK();
      this.mQN.requestFocus();
      acV();
    }
  }
  
  protected final void oD(int paramInt)
  {
    GMTrace.i(8422699302912L, 62754);
    super.oD(paramInt);
    switch (paramInt)
    {
    default: 
      this.mQR = false;
    }
    do
    {
      GMTrace.o(8422699302912L, 62754);
      return;
      this.mQR = true;
    } while ((getVisibility() != 0) || (this.qaj == null));
    w.d("MicroMsg.SnsCommentFooter", "jacks dynamic adjust animation up");
    this.qaj.bpU();
    GMTrace.o(8422699302912L, 62754);
  }
  
  public void setVisibility(int paramInt)
  {
    boolean bool = false;
    GMTrace.i(8421088690176L, 62742);
    this.state = 0;
    if (paramInt == 0) {
      bool = true;
    }
    ic(bool);
    super.setVisibility(paramInt);
    GMTrace.o(8421088690176L, 62742);
  }
  
  static abstract interface a
  {
    public abstract void boF();
  }
  
  static abstract interface b
  {
    public abstract void boG();
  }
  
  static abstract interface c
  {
    public abstract void IR(String paramString);
  }
  
  static abstract interface d
  {
    public abstract void onShow();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsCommentFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */