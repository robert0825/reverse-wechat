package com.tencent.mm.plugin.pwdgroup.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView.a;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView.a;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView;
import com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.lbs.Location;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.te;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMScrollGridView;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class FacingCreateChatRoomAllInOneUI
  extends MMActivity
  implements e
{
  private a.a fJt;
  private String jQv;
  private boolean jos;
  private ProgressDialog kgz;
  private ae mHandler;
  private ProgressBar nPA;
  private TextView nPB;
  private MMKeyBoardView nPC;
  private TextView nPD;
  private boolean nPE;
  private boolean nPF;
  private LinkedList<te> nPG;
  private HashMap<String, te> nPH;
  private LinkedList<te> nPI;
  private a nPJ;
  private View nPK;
  private TextView nPL;
  private MMScrollGridView nPM;
  private View nPN;
  private View nPO;
  private Button nPP;
  private MMCallBackScrollView nPQ;
  private TextView nPR;
  private boolean nPS;
  private af nPT;
  private aj nPU;
  private com.tencent.mm.plugin.pwdgroup.a.a nPV;
  private com.tencent.mm.plugin.pwdgroup.a.a nPW;
  private int nPX;
  private Animation nPY;
  private AnimationSet nPZ;
  private c nPq;
  private boolean nPr;
  private boolean nPs;
  private boolean nPt;
  private boolean nPu;
  private boolean nPv;
  private Location nPw;
  private String nPx;
  private MMPwdInputView nPy;
  private View nPz;
  private Animation nQa;
  public MenuItem.OnMenuItemClickListener nQb;
  public MMPwdInputView.a nQc;
  private View.OnClickListener nQd;
  public MMKeyBoardView.a nQe;
  private aj nQf;
  
  public FacingCreateChatRoomAllInOneUI()
  {
    GMTrace.i(10697689792512L, 79704);
    this.nPr = false;
    this.nPv = false;
    this.nPE = false;
    this.nPF = false;
    this.jos = false;
    this.nPG = new LinkedList();
    this.nPH = new HashMap();
    this.nPI = new LinkedList();
    this.nPS = false;
    this.nPT = new af();
    this.nPU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(10697555574784L, 79703);
        FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this);
        GMTrace.o(10697555574784L, 79703);
        return false;
      }
    }, false);
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10708158775296L, 79782);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(10708158775296L, 79782);
          return;
          if (FacingCreateChatRoomAllInOneUI.b(FacingCreateChatRoomAllInOneUI.this) != null)
          {
            FacingCreateChatRoomAllInOneUI.b(FacingCreateChatRoomAllInOneUI.this).I(FacingCreateChatRoomAllInOneUI.c(FacingCreateChatRoomAllInOneUI.this));
            GMTrace.o(10708158775296L, 79782);
            return;
            FacingCreateChatRoomAllInOneUI.d(FacingCreateChatRoomAllInOneUI.this);
          }
        }
      }
    };
    this.nQb = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10707621904384L, 79778);
        FacingCreateChatRoomAllInOneUI.this.finish();
        GMTrace.o(10707621904384L, 79778);
        return false;
      }
    };
    this.nQc = new MMPwdInputView.a()
    {
      public final void h(boolean paramAnonymousBoolean, String paramAnonymousString)
      {
        GMTrace.i(10707890339840L, 79780);
        w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onFinishInput] %b %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString });
        FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, paramAnonymousString);
        if (paramAnonymousBoolean)
        {
          FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, true);
          FacingCreateChatRoomAllInOneUI.e(FacingCreateChatRoomAllInOneUI.this);
        }
        GMTrace.o(10707890339840L, 79780);
      }
    };
    this.nQd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10705877073920L, 79765);
        FacingCreateChatRoomAllInOneUI.f(FacingCreateChatRoomAllInOneUI.this);
        FacingCreateChatRoomAllInOneUI.d(FacingCreateChatRoomAllInOneUI.this);
        GMTrace.o(10705877073920L, 79765);
      }
    };
    this.nQe = new MMKeyBoardView.a()
    {
      public final void MH()
      {
        GMTrace.i(10708561428480L, 79785);
        if (FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this) != null) {
          FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).MH();
        }
        GMTrace.o(10708561428480L, 79785);
      }
      
      public final void delete()
      {
        GMTrace.i(10708695646208L, 79786);
        if (FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this) != null)
        {
          if ((FacingCreateChatRoomAllInOneUI.h(FacingCreateChatRoomAllInOneUI.this)) || (FacingCreateChatRoomAllInOneUI.i(FacingCreateChatRoomAllInOneUI.this)))
          {
            FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).MH();
            FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, FacingCreateChatRoomAllInOneUI.a.nQk);
            GMTrace.o(10708695646208L, 79786);
            return;
          }
          MMPwdInputView localMMPwdInputView = FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this);
          if (localMMPwdInputView.kZz > 0) {
            localMMPwdInputView.jSg.deleteCharAt(localMMPwdInputView.kZz - 1);
          }
          localMMPwdInputView.aYh();
          localMMPwdInputView.aYg();
        }
        GMTrace.o(10708695646208L, 79786);
      }
      
      public final void input(String paramAnonymousString)
      {
        GMTrace.i(10708427210752L, 79784);
        if (FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this) != null)
        {
          if ((FacingCreateChatRoomAllInOneUI.h(FacingCreateChatRoomAllInOneUI.this)) || (FacingCreateChatRoomAllInOneUI.i(FacingCreateChatRoomAllInOneUI.this)))
          {
            MMPwdInputView localMMPwdInputView = FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this);
            localMMPwdInputView.MH();
            localMMPwdInputView.input(paramAnonymousString);
            FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, FacingCreateChatRoomAllInOneUI.a.nQk);
            GMTrace.o(10708427210752L, 79784);
            return;
          }
          FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).input(paramAnonymousString);
        }
        GMTrace.o(10708427210752L, 79784);
      }
    };
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15569927536640L, 116005);
        w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "lat:%f lng:%f accuracy:%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1), Double.valueOf(paramAnonymousDouble2) });
        if (paramAnonymousBoolean)
        {
          Location localLocation = new Location(paramAnonymousFloat2, paramAnonymousFloat1, (int)paramAnonymousDouble2, paramAnonymousInt, "", "");
          if (!localLocation.bJM())
          {
            FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, localLocation);
            FacingCreateChatRoomAllInOneUI.b(FacingCreateChatRoomAllInOneUI.this, true);
            FacingCreateChatRoomAllInOneUI.e(FacingCreateChatRoomAllInOneUI.this);
          }
        }
        for (;;)
        {
          GMTrace.o(15569927536640L, 116005);
          return false;
          FacingCreateChatRoomAllInOneUI.b(FacingCreateChatRoomAllInOneUI.this, false);
        }
      }
    };
    this.nQf = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(10703729590272L, 79749);
        FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, false);
        FacingCreateChatRoomAllInOneUI.a(FacingCreateChatRoomAllInOneUI.this, FacingCreateChatRoomAllInOneUI.a.nQn);
        GMTrace.o(10703729590272L, 79749);
        return true;
      }
    }, false);
    GMTrace.o(10697689792512L, 79704);
  }
  
  private void aJR()
  {
    GMTrace.i(10699568840704L, 79718);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(10699568840704L, 79718);
  }
  
  private void aYa()
  {
    GMTrace.i(10698092445696L, 79707);
    this.nPq = c.Ir();
    this.nPq.a(this.fJt, true);
    at.wS().a(653, this);
    MP();
    GMTrace.o(10698092445696L, 79707);
  }
  
  private void aYb()
  {
    GMTrace.i(10699837276160L, 79720);
    this.jos = false;
    if (this.nPU != null) {
      this.nPU.z(0L, 0L);
    }
    GMTrace.o(10699837276160L, 79720);
  }
  
  private void aYc()
  {
    GMTrace.i(10699971493888L, 79721);
    this.jos = true;
    if (this.nPU != null) {
      this.nPU.stopTimer();
    }
    at.wS().c(this.nPV);
    GMTrace.o(10699971493888L, 79721);
  }
  
  private void aYd()
  {
    GMTrace.i(10700105711616L, 79722);
    Animation localAnimation1 = AnimationUtils.loadAnimation(this, R.a.aLi);
    final Animation localAnimation2 = AnimationUtils.loadAnimation(this, R.a.aLh);
    localAnimation1.setInterpolator(new AccelerateDecelerateInterpolator());
    localAnimation1.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(10711111565312L, 79804);
        FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).MH();
        FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).startAnimation(localAnimation2);
        GMTrace.o(10711111565312L, 79804);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(10710977347584L, 79803);
        GMTrace.o(10710977347584L, 79803);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(10710843129856L, 79802);
        GMTrace.o(10710843129856L, 79802);
      }
    });
    localAnimation2.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(10706682380288L, 79771);
        if (FacingCreateChatRoomAllInOneUI.p(FacingCreateChatRoomAllInOneUI.this) != null) {
          FacingCreateChatRoomAllInOneUI.p(FacingCreateChatRoomAllInOneUI.this).gF(true);
        }
        GMTrace.o(10706682380288L, 79771);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(10706548162560L, 79770);
        GMTrace.o(10706548162560L, 79770);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(10706413944832L, 79769);
        GMTrace.o(10706413944832L, 79769);
      }
    });
    if (this.nPy != null) {
      this.nPy.startAnimation(localAnimation1);
    }
    if (this.nPC != null) {
      this.nPC.gF(false);
    }
    GMTrace.o(10700105711616L, 79722);
  }
  
  private void gE(boolean paramBoolean)
  {
    GMTrace.i(10699300405248L, 79716);
    if (this.nPC != null) {
      this.nPC.gF(paramBoolean);
    }
    GMTrace.o(10699300405248L, 79716);
  }
  
  private void sN(int paramInt)
  {
    GMTrace.i(10699434622976L, 79717);
    if (this.nPB != null) {}
    switch (10.nQj[(paramInt - 1)])
    {
    default: 
      w.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "unknow statue tip");
      GMTrace.o(10699434622976L, 79717);
      return;
    case 1: 
      gE(true);
      this.nPr = false;
      this.nPv = false;
      this.nPA.setVisibility(8);
      this.nPB.setVisibility(8);
      GMTrace.o(10699434622976L, 79717);
      return;
    case 2: 
      gE(false);
      this.nPB.setText(R.l.dPp);
      this.nPA.setVisibility(0);
      this.nPB.setVisibility(8);
      GMTrace.o(10699434622976L, 79717);
      return;
    case 3: 
      gE(true);
      this.nPA.setVisibility(8);
      this.nPB.setVisibility(0);
      this.nPB.setText(R.l.dPn);
      aYd();
      GMTrace.o(10699434622976L, 79717);
      return;
    }
    gE(true);
    this.nPA.setVisibility(8);
    this.nPB.setVisibility(0);
    this.nPB.setText(R.l.dPo);
    aYd();
    GMTrace.o(10699434622976L, 79717);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(10699703058432L, 79719);
    h.a(this, paramString, "", getString(R.l.cTM), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(10703998025728L, 79751);
        GMTrace.o(10703998025728L, 79751);
      }
    });
    GMTrace.o(10699703058432L, 79719);
  }
  
  protected final void MP()
  {
    GMTrace.i(10698897752064L, 79713);
    oM(R.l.dvA);
    a(this.nQb);
    if (cN().cO() != null) {
      cN().cO().setBackgroundDrawable(getResources().getDrawable(R.g.aZd));
    }
    this.nPz = findViewById(R.h.byt);
    this.nPA = ((ProgressBar)findViewById(R.h.bys));
    this.nPB = ((TextView)findViewById(R.h.byu));
    this.nPC = ((MMKeyBoardView)findViewById(R.h.byr));
    this.nPD = ((TextView)findViewById(R.h.byq));
    this.nPy = ((MMPwdInputView)findViewById(R.h.byo));
    this.nPy.nRd = this.nQc;
    this.nPy.requestFocus();
    this.nPC.nQe = this.nQe;
    sN(a.nQk);
    this.nPK = findViewById(R.h.byh);
    this.nPL = ((TextView)findViewById(R.h.byj));
    this.nPM = ((MMScrollGridView)findViewById(R.h.byi));
    this.nPM.setVisibility(4);
    this.nPP = ((Button)findViewById(R.h.byk));
    this.nPP.setOnClickListener(this.nQd);
    this.nPN = findViewById(R.h.byl);
    this.nPO = findViewById(R.h.bym);
    this.nPL.setText(R.l.dsH);
    this.nPQ = ((MMCallBackScrollView)findViewById(R.h.byv));
    this.nPR = ((TextView)findViewById(R.h.byp));
    this.nPQ.nQu = new MMCallBackScrollView.a()
    {
      public final void bi(int paramAnonymousInt)
      {
        GMTrace.i(10708964081664L, 79788);
        if (FacingCreateChatRoomAllInOneUI.j(FacingCreateChatRoomAllInOneUI.this) != null)
        {
          if (paramAnonymousInt == 0)
          {
            FacingCreateChatRoomAllInOneUI.j(FacingCreateChatRoomAllInOneUI.this).setVisibility(4);
            GMTrace.o(10708964081664L, 79788);
            return;
          }
          FacingCreateChatRoomAllInOneUI.j(FacingCreateChatRoomAllInOneUI.this).setVisibility(0);
        }
        GMTrace.o(10708964081664L, 79788);
      }
    };
    this.nPJ = new a(this);
    this.nPM.setAdapter(this.nPJ);
    this.nPJ.I(this.nPG);
    GMTrace.o(10698897752064L, 79713);
  }
  
  protected final int Qf()
  {
    GMTrace.i(10698763534336L, 79712);
    GMTrace.o(10698763534336L, 79712);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(10699031969792L, 79714);
    w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramk.getType())
    {
    default: 
      w.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd] unknow scene type");
    }
    label584:
    do
    {
      int i;
      do
      {
        do
        {
          GMTrace.o(10699031969792L, 79714);
          return;
          paramk = (com.tencent.mm.plugin.pwdgroup.a.a)paramk;
          i = paramk.nPp;
          if (i != 0) {
            break label584;
          }
          this.nPu = false;
          if (!this.nPS) {
            break;
          }
          if (this.nPU != null) {
            this.nPU.z(3000L, 3000L);
          }
        } while ((paramInt1 != 0) || (paramInt2 != 0));
        paramString = paramk.aXZ().tPE;
        this.nPT.A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10706145509376L, 79767);
            if (FacingCreateChatRoomAllInOneUI.q(FacingCreateChatRoomAllInOneUI.this) != null) {
              FacingCreateChatRoomAllInOneUI.q(FacingCreateChatRoomAllInOneUI.this).clear();
            }
            if (FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this) != null) {
              FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).clear();
            }
            Object localObject;
            if ((paramString != null) && (paramString.size() > 0))
            {
              j = paramString.size();
              i = 0;
              while (i < j)
              {
                localObject = (te)paramString.get(i);
                if (!bg.nm(((te)localObject).ujf)) {
                  FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).put(((te)localObject).ujf, localObject);
                }
                i += 1;
              }
            }
            int j = FacingCreateChatRoomAllInOneUI.c(FacingCreateChatRoomAllInOneUI.this).size();
            int i = 0;
            if (i < j)
            {
              localObject = (te)FacingCreateChatRoomAllInOneUI.c(FacingCreateChatRoomAllInOneUI.this).get(i);
              if (!FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).containsKey(((te)localObject).ujf)) {
                w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[updateMember] delete member name:%s", new Object[] { ((te)localObject).ujf });
              }
              for (;;)
              {
                i += 1;
                break;
                FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).remove(((te)localObject).ujf);
              }
            }
            if ((FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this) != null) && (FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).size() > 0))
            {
              localObject = FacingCreateChatRoomAllInOneUI.r(FacingCreateChatRoomAllInOneUI.this).entrySet().iterator();
              while (((Iterator)localObject).hasNext())
              {
                te localte = (te)((Map.Entry)((Iterator)localObject).next()).getValue();
                FacingCreateChatRoomAllInOneUI.q(FacingCreateChatRoomAllInOneUI.this).add(localte);
                w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[updateMember] add member name:%s", new Object[] { localte.ujf });
              }
            }
            FacingCreateChatRoomAllInOneUI.c(FacingCreateChatRoomAllInOneUI.this).addAll(FacingCreateChatRoomAllInOneUI.q(FacingCreateChatRoomAllInOneUI.this));
            FacingCreateChatRoomAllInOneUI.s(FacingCreateChatRoomAllInOneUI.this).sendEmptyMessage(10001);
            GMTrace.o(10706145509376L, 79767);
          }
        });
        this.jQv = paramk.aXZ().ugx;
        GMTrace.o(10699031969792L, 79714);
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          sN(a.nQk);
          this.nPX = this.nPD.getHeight();
          w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "mFacingInputMsgViewHeigth:%d", new Object[] { Integer.valueOf(this.nPX) });
          this.nPY = AnimationUtils.loadAnimation(this, R.a.aLr);
          this.nQa = AnimationUtils.loadAnimation(this, R.a.aLp);
          this.nPZ = new AnimationSet(true);
          this.nPZ.addAnimation(AnimationUtils.loadAnimation(this, R.a.aLT));
          paramString = new TranslateAnimation(0.0F, 0.0F, 0.0F, -this.nPX);
          paramString.setDuration(300L);
          this.nPZ.addAnimation(paramString);
          this.nPY.setDuration(200L);
          this.nPZ.setDuration(300L);
          this.nQa.setDuration(300L);
          this.nPY.setInterpolator(new AccelerateDecelerateInterpolator());
          this.nPZ.setInterpolator(new AccelerateDecelerateInterpolator());
          this.nQa.setInterpolator(new AccelerateDecelerateInterpolator());
          this.nPZ.setFillAfter(true);
          paramString.setFillAfter(true);
          this.nPZ.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10709500952576L, 79792);
              FacingCreateChatRoomAllInOneUI.l(FacingCreateChatRoomAllInOneUI.this).setVisibility(8);
              FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).setVisibility(0);
              FacingCreateChatRoomAllInOneUI.m(FacingCreateChatRoomAllInOneUI.this).setVisibility(0);
              FacingCreateChatRoomAllInOneUI.n(FacingCreateChatRoomAllInOneUI.this).setVisibility(0);
              FacingCreateChatRoomAllInOneUI.k(FacingCreateChatRoomAllInOneUI.this).setVisibility(0);
              FacingCreateChatRoomAllInOneUI.o(FacingCreateChatRoomAllInOneUI.this).setVisibility(8);
              FacingCreateChatRoomAllInOneUI.p(FacingCreateChatRoomAllInOneUI.this).setVisibility(8);
              FacingCreateChatRoomAllInOneUI.g(FacingCreateChatRoomAllInOneUI.this).clearAnimation();
              FacingCreateChatRoomAllInOneUI.m(FacingCreateChatRoomAllInOneUI.this).clearAnimation();
              FacingCreateChatRoomAllInOneUI.k(FacingCreateChatRoomAllInOneUI.this).clearAnimation();
              GMTrace.o(10709500952576L, 79792);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10709366734848L, 79791);
              GMTrace.o(10709366734848L, 79791);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(10709232517120L, 79790);
              FacingCreateChatRoomAllInOneUI.k(FacingCreateChatRoomAllInOneUI.this).setVisibility(4);
              GMTrace.o(10709232517120L, 79790);
            }
          });
          this.nPy.setVisibility(4);
          this.nPy.setAnimation(paramString);
          this.nPC.startAnimation(this.nPY);
          this.nPz.startAnimation(this.nPY);
          this.nPD.startAnimation(this.nPY);
          this.nPN.startAnimation(this.nQa);
          this.nPK.startAnimation(this.nPZ);
          this.nPN.setVisibility(4);
          this.nPC.setVisibility(8);
          this.nPD.setVisibility(8);
          this.nPS = true;
          aYb();
          GMTrace.o(10699031969792L, 79714);
          return;
        }
        if (paramInt2 == 65105)
        {
          this.nPr = true;
          sN(a.nQm);
          GMTrace.o(10699031969792L, 79714);
          return;
        }
        this.nPr = true;
        sN(a.nQn);
        GMTrace.o(10699031969792L, 79714);
        return;
        if (i != 3) {
          break;
        }
      } while ((paramInt1 == 0) && (paramInt2 == 0));
      if (paramInt2 == 65105)
      {
        sN(a.nQm);
        this.nPr = true;
        GMTrace.o(10699031969792L, 79714);
        return;
      }
      sN(a.nQn);
      GMTrace.o(10699031969792L, 79714);
      return;
      if (i != 1) {
        break label901;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aJR();
        paramString = paramk.aXZ().ufz;
        w.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "ChatRoomName is:%s", new Object[] { paramString });
        this.nPF = true;
        finish();
        paramk = new Intent();
        paramk.putExtra("Chat_User", paramString);
        com.tencent.mm.plugin.pwdgroup.a.hnH.e(paramk, this);
        GMTrace.o(10699031969792L, 79714);
        return;
      }
      if ((paramInt2 == 65104) && (!this.nPE))
      {
        this.nPE = true;
        this.mHandler.sendEmptyMessageDelayed(10002, 3000L);
        GMTrace.o(10699031969792L, 79714);
        return;
      }
      if (paramInt2 != -23) {
        break;
      }
      aJR();
      wr(getString(R.l.dsI));
    } while (this.nPU == null);
    this.nPU.z(3000L, 3000L);
    GMTrace.o(10699031969792L, 79714);
    return;
    aJR();
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null) {
      paramString.a(this.vKB.vKW, null, null);
    }
    for (;;)
    {
      if (this.nPU != null) {
        this.nPU.z(3000L, 3000L);
      }
      GMTrace.o(10699031969792L, 79714);
      return;
      wr(getString(R.l.dPo));
    }
    label901:
    aJR();
    GMTrace.o(10699031969792L, 79714);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10697824010240L, 79705);
    int i = R.i.cwm;
    GMTrace.o(10697824010240L, 79705);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(10699166187520L, 79715);
    super.onBackPressed();
    finish();
    GMTrace.o(10699166187520L, 79715);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10697958227968L, 79706);
    super.onCreate(paramBundle);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
    w.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      GMTrace.o(10697958227968L, 79706);
      return;
    }
    aYa();
    GMTrace.o(10697958227968L, 79706);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10698629316608L, 79711);
    at.wS().b(653, this);
    if (this.nPq != null) {
      this.nPq.c(this.fJt);
    }
    if (!this.nPF)
    {
      at.wS().cancel(653);
      if (this.nPw != null)
      {
        this.nPW = new com.tencent.mm.plugin.pwdgroup.a.a(2, this.nPx, "", this.nPw.gEJ, this.nPw.gEK, this.nPw.accuracy, this.nPw.eNT, this.nPw.mac, this.nPw.eNV);
        at.wS().a(this.nPW, 0);
      }
    }
    if (this.nPS) {
      aYc();
    }
    super.onDestroy();
    GMTrace.o(10698629316608L, 79711);
  }
  
  protected void onPause()
  {
    GMTrace.i(10698495098880L, 79710);
    if (this.nPq != null) {
      this.nPq.c(this.fJt);
    }
    if (this.nPS) {
      aYc();
    }
    super.onPause();
    GMTrace.o(10698495098880L, 79710);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(10698226663424L, 79708);
    w.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(10698226663424L, 79708);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        aYa();
        GMTrace.o(10698226663424L, 79708);
        return;
      }
      h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(10705608638464L, 79763);
          FacingCreateChatRoomAllInOneUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          FacingCreateChatRoomAllInOneUI.this.finish();
          GMTrace.o(10705608638464L, 79763);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(10697287139328L, 79701);
          FacingCreateChatRoomAllInOneUI.this.finish();
          GMTrace.o(10697287139328L, 79701);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(10698360881152L, 79709);
    if (this.nPq != null) {
      this.nPq.a(this.fJt, true);
    }
    if (this.nPS) {
      aYb();
    }
    super.onResume();
    GMTrace.o(10698360881152L, 79709);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(10707353468928L, 79776);
      nQk = 1;
      nQl = 2;
      nQm = 3;
      nQn = 4;
      nQo = new int[] { nQk, nQl, nQm, nQn };
      GMTrace.o(10707353468928L, 79776);
    }
    
    public static int[] aYf()
    {
      GMTrace.i(10707219251200L, 79775);
      int[] arrayOfInt = (int[])nQo.clone();
      GMTrace.o(10707219251200L, 79775);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\ui\FacingCreateChatRoomAllInOneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */