package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.plugin.wallet_core.ui.k.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.kh;
import com.tencent.mm.protocal.c.kw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(1)
public class QrRewardMainUI
  extends QrRewardBaseUI
{
  private String desc;
  private String eXA;
  private String hLG;
  private final int jXK;
  private Button jXL;
  private ViewGroup jXM;
  private ViewGroup jXN;
  private RelativeLayout jXO;
  private CdnImageView jXP;
  private ImageView jXQ;
  private ImageView jXR;
  private MMEditText jXS;
  private TextView jXT;
  private TextView jXU;
  private TextView jXV;
  private TextView jXW;
  private ScrollView jXX;
  private String jXY;
  private String jXZ;
  private String jYa;
  private int jYb;
  private int jYc;
  private boolean jYd;
  private boolean jYe;
  private boolean mIsOpen;
  private String username;
  
  public QrRewardMainUI()
  {
    GMTrace.i(19366007537664L, 144288);
    this.jXK = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 200);
    this.mIsOpen = false;
    GMTrace.o(19366007537664L, 144288);
  }
  
  private void aoL()
  {
    GMTrace.i(19367215497216L, 144297);
    if (com.tencent.mm.plugin.collect.reward.b.a.aoF().aoG())
    {
      CdnImageView localCdnImageView = this.jXP;
      com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.aoF();
      localCdnImageView.R(com.tencent.mm.plugin.collect.reward.b.a.jXg + locala.aoH(), this.jXK, this.jXK);
      this.jXO.setVisibility(0);
      GMTrace.o(19367215497216L, 144297);
      return;
    }
    this.jXO.setVisibility(4);
    GMTrace.o(19367215497216L, 144297);
  }
  
  private void aoM()
  {
    GMTrace.i(19367349714944L, 144298);
    int j = Math.round(this.jXK * (this.jYc * 1.0F / this.jYb));
    int i = j;
    if (j <= 0) {
      i = 248;
    }
    ViewGroup.LayoutParams localLayoutParams = this.jXR.getLayoutParams();
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    this.jXR.setLayoutParams(localLayoutParams);
    localLayoutParams = this.jXQ.getLayoutParams();
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    this.jXQ.setLayoutParams(localLayoutParams);
    localLayoutParams = this.jXS.getLayoutParams();
    localLayoutParams.width = (i - 30);
    localLayoutParams.height = (i - 30);
    this.jXS.setLayoutParams(localLayoutParams);
    this.jXS.setTextSize(0, i * 2 / 3);
    this.jXN.requestLayout();
    if (!bg.nm(this.desc)) {
      this.jXT.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, getString(a.i.sXc, new Object[] { this.desc }), this.jXT.getTextSize()));
    }
    for (;;)
    {
      dH(bg.nm(this.jXY));
      GMTrace.o(19367349714944L, 144298);
      return;
      this.jXT.setText("");
    }
  }
  
  private void aoN()
  {
    GMTrace.i(19367483932672L, 144299);
    if (!bg.nm(this.jXZ))
    {
      this.jXV.setClickable(true);
      this.jXV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      com.tencent.mm.plugin.wallet_core.ui.k localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
      {
        public final void aoR()
        {
          GMTrace.i(19378355568640L, 144380);
          w.d("MicroMsg.QrRewardMainUI", "go to: %s", new Object[] { QrRewardMainUI.q(QrRewardMainUI.this) });
          com.tencent.mm.wallet_core.ui.e.m(QrRewardMainUI.this.vKB.vKW, QrRewardMainUI.q(QrRewardMainUI.this), false);
          com.tencent.mm.plugin.report.service.g.ork.i(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(6) });
          GMTrace.o(19378355568640L, 144380);
        }
      });
      SpannableString localSpannableString = new SpannableString(this.jXZ);
      localSpannableString.setSpan(localk, 0, localSpannableString.length(), 18);
      this.jXV.setText(localSpannableString);
      this.jXV.setVisibility(0);
      GMTrace.o(19367483932672L, 144299);
      return;
    }
    this.jXV.setVisibility(8);
    GMTrace.o(19367483932672L, 144299);
  }
  
  private void aoO()
  {
    GMTrace.i(19367752368128L, 144301);
    if (!bg.nm(this.jXY))
    {
      this.jXS.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, this.jXY, this.jXS.getTextSize()));
      this.jXS.setSelection(this.jXY.length());
    }
    GMTrace.o(19367752368128L, 144301);
  }
  
  private void aoP()
  {
    GMTrace.i(19367886585856L, 144302);
    w.i("MicroMsg.QrRewardMainUI", "do set photo word");
    com.tencent.mm.plugin.collect.reward.a.g localg = new com.tencent.mm.plugin.collect.reward.a.g(this.jXY);
    localg.l(this);
    b(localg, true);
    GMTrace.o(19367886585856L, 144302);
  }
  
  private void dH(boolean paramBoolean)
  {
    GMTrace.i(19367618150400L, 144300);
    w.i("MicroMsg.QrRewardMainUI", "switch mode: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.jXQ.setVisibility(0);
      this.jXS.setVisibility(4);
      a.b.a(this.jXQ, this.username, 0.03F, true);
      GMTrace.o(19367618150400L, 144300);
      return;
    }
    this.jXQ.setVisibility(4);
    this.jXS.setVisibility(0);
    GMTrace.o(19367618150400L, 144300);
  }
  
  private void h(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(19367081279488L, 144296);
    if ((this.hLG != null) && (this.hLG.equals(paramString1))) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.mm.plugin.collect.reward.b.a.aoF().aoG();
      w.i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((paramBoolean) || (!bool1) || (!bool2))
      {
        com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.aoF();
        com.tencent.mm.plugin.collect.reward.b.a.a local6 = new com.tencent.mm.plugin.collect.reward.b.a.a()
        {
          public final void A(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(19357820256256L, 144227);
            w.i("MicroMsg.QrRewardMainUI", "callback ret: %s, %s, %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
              com.tencent.mm.sdk.platformtools.af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19376744955904L, 144368);
                  QrRewardMainUI.p(QrRewardMainUI.this);
                  GMTrace.o(19376744955904L, 144368);
                }
              });
            }
            GMTrace.o(19357820256256L, 144227);
          }
        };
        w.i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", new Object[] { paramString1 });
        Object localObject = new File(com.tencent.mm.plugin.collect.reward.b.a.jXg);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        localObject = new i();
        ((i)localObject).eYr = false;
        ((i)localObject).gAB = locala;
        ((i)localObject).field_fullpath = (com.tencent.mm.plugin.collect.reward.b.a.jXg + locala.aoH());
        ((i)localObject).field_mediaId = bg.nl(com.tencent.mm.modelcdntran.d.a("QrRewardImg", bg.Pv(), q.Ak().field_username, ""));
        ((i)localObject).field_fileId = paramString1;
        ((i)localObject).field_aesKey = paramString2;
        ((i)localObject).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
        ((i)localObject).field_priority = com.tencent.mm.modelcdntran.b.gzd;
        ((i)localObject).field_needStorage = false;
        ((i)localObject).field_isStreamMedia = false;
        ((i)localObject).field_appType = 0;
        ((i)localObject).field_bzScene = 0;
        if (locala.fUk == null) {
          locala.fUk = new HashMap();
        }
        locala.fUk.put(((i)localObject).field_mediaId, local6);
        if (!com.tencent.mm.modelcdntran.g.Gk().b((i)localObject, -1)) {
          w.e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", new Object[] { paramString1 });
        }
      }
      GMTrace.o(19367081279488L, 144296);
      return;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(19366275973120L, 144290);
    this.jXL = ((Button)findViewById(a.f.sET));
    this.jXM = ((ViewGroup)findViewById(a.f.sES));
    this.jXN = ((ViewGroup)findViewById(a.f.sER));
    this.jXP = ((CdnImageView)findViewById(a.f.sEN));
    this.jXT = ((TextView)findViewById(a.f.sEQ));
    this.jXQ = ((ImageView)findViewById(a.f.sEM));
    this.jXR = ((ImageView)findViewById(a.f.sEL));
    this.jXO = ((RelativeLayout)findViewById(a.f.sEO));
    this.jXS = ((MMEditText)findViewById(a.f.sEP));
    this.jXU = ((TextView)findViewById(a.f.sEU));
    this.jXW = ((TextView)findViewById(a.f.sEW));
    this.jXV = ((TextView)findViewById(a.f.sEK));
    a.b.a(this.jXQ, this.username, 0.03F, true);
    try
    {
      this.jXS.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, this.jXY, this.jXS.getTextSize()));
      this.jXS.setSelection(this.jXY.length());
      this.jXS.addTextChangedListener(new TextWatcher()
      {
        int jYf;
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(19362115223552L, 144259);
          w.d("MicroMsg.QrRewardMainUI", "s: %s, %s", new Object[] { paramAnonymousEditable.toString(), Integer.valueOf(paramAnonymousEditable.length()) });
          String str = paramAnonymousEditable.toString();
          if (bg.nm(str)) {
            this.jYf = 0;
          }
          for (;;)
          {
            paramAnonymousEditable.delete(this.jYf, paramAnonymousEditable.length());
            GMTrace.o(19362115223552L, 144259);
            return;
            if (this.jYf == 0) {
              if ((((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).w(str)) || (((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).x(str))) {
                this.jYf = paramAnonymousEditable.length();
              } else {
                this.jYf = 1;
              }
            }
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19361846788096L, 144257);
          GMTrace.o(19361846788096L, 144257);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19361981005824L, 144258);
          GMTrace.o(19361981005824L, 144258);
        }
      });
      this.jXS.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(19373792165888L, 144346);
          w.i("MicroMsg.QrRewardMainUI", "action: %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
          QrRewardMainUI.this.aLo();
          GMTrace.o(19373792165888L, 144346);
          return false;
        }
      });
      this.jXR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19362920529920L, 144265);
          w.d("MicroMsg.QrRewardMainUI", "click avatar");
          QrRewardMainUI.this.aLo();
          QrRewardMainUI.a(QrRewardMainUI.this);
          GMTrace.o(19362920529920L, 144265);
        }
      });
      this.jXU.setClickable(true);
      this.jXU.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      com.tencent.mm.plugin.wallet_core.ui.k localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
      {
        public final void aoR()
        {
          GMTrace.i(19373523730432L, 144344);
          w.i("MicroMsg.QrRewardMainUI", "click save code");
          QrRewardMainUI.b(QrRewardMainUI.this);
          com.tencent.mm.plugin.report.service.g.ork.i(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(5) });
          GMTrace.o(19373523730432L, 144344);
        }
      });
      SpannableString localSpannableString = new SpannableString(getString(a.i.sWW));
      localSpannableString.setSpan(localk, 0, localSpannableString.length(), 18);
      this.jXU.setText(localSpannableString);
      this.jXW.setClickable(true);
      this.jXW.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
      {
        public final void aoR()
        {
          GMTrace.i(19358893998080L, 144235);
          w.i("MicroMsg.QrRewardMainUI", "click set code, %s", new Object[] { Boolean.valueOf(QrRewardMainUI.c(QrRewardMainUI.this)) });
          QrRewardMainUI.a(QrRewardMainUI.this, false);
          GMTrace.o(19358893998080L, 144235);
        }
      });
      localSpannableString = new SpannableString(getString(a.i.sXb));
      localSpannableString.setSpan(localk, 0, localSpannableString.length(), 18);
      this.jXW.setText(localSpannableString);
      aoL();
      aoM();
      aoO();
      aoN();
      GMTrace.o(19366275973120L, 144290);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QrRewardMainUI", localException, "", new Object[0]);
      }
    }
  }
  
  protected final boolean Qj()
  {
    GMTrace.i(21067619893248L, 156966);
    GMTrace.o(21067619893248L, 156966);
    return false;
  }
  
  public final void aoK()
  {
    GMTrace.i(19366544408576L, 144292);
    super.aoK();
    w.i("MicroMsg.QrRewardMainUI", "key board changed: %s", new Object[] { Integer.valueOf(this.vKB.vLo) });
    if (this.vKB.vLo == 2)
    {
      this.jXY = this.jXS.getText().toString();
      aoP();
      if (bg.nm(this.jXY)) {
        dH(true);
      }
    }
    GMTrace.o(19366544408576L, 144292);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(19366410190848L, 144291);
    if ((paramk instanceof com.tencent.mm.plugin.collect.reward.a.b))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.b)paramk;
      paramString.a(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19365068013568L, 144281);
          QrRewardMainUI.a(QrRewardMainUI.this, paramString.jWZ.jvD);
          QrRewardMainUI.a(QrRewardMainUI.this, paramString.jWZ.ube);
          QrRewardMainUI.b(QrRewardMainUI.this, paramString.jWZ.uba);
          QrRewardMainUI.b(QrRewardMainUI.this, paramString.jWZ.desc);
          QrRewardMainUI.c(QrRewardMainUI.this, paramString.jWZ.ree);
          paramAnonymousk = QrRewardMainUI.this;
          boolean bool;
          if (!paramString.jWZ.uaX)
          {
            bool = true;
            QrRewardMainUI.b(paramAnonymousk, bool);
            QrRewardMainUI.d(QrRewardMainUI.this, paramString.jWZ.jzt);
            QrRewardMainUI.e(QrRewardMainUI.this, paramString.jWZ.ubc);
            QrRewardMainUI.d(QrRewardMainUI.this);
            QrRewardMainUI.e(QrRewardMainUI.this);
            if (QrRewardMainUI.f(QrRewardMainUI.this)) {
              break label248;
            }
            QrRewardMainUI.g(QrRewardMainUI.this);
          }
          for (;;)
          {
            QrRewardMainUI.f(QrRewardMainUI.this, paramString.jWZ.uaY);
            QrRewardMainUI.aoQ();
            w.d("MicroMsg.QrRewardMainUI", "url: %s", new Object[] { QrRewardMainUI.j(QrRewardMainUI.this) });
            GMTrace.o(19365068013568L, 144281);
            return;
            bool = false;
            break;
            label248:
            QrRewardMainUI.a(QrRewardMainUI.this, paramString.jWZ.uaY, paramString.jWZ.uaZ);
            QrRewardMainUI.h(QrRewardMainUI.this);
            QrRewardMainUI.i(QrRewardMainUI.this);
          }
        }
      }).b(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19365604884480L, 144285);
          w.e("MicroMsg.QrRewardMainUI", "get code error: %s, %s", new Object[] { Integer.valueOf(paramString.jWZ.jWs), paramString.jWZ.jWt });
          if (!bg.nm(paramString.jWZ.jWt)) {
            Toast.makeText(QrRewardMainUI.this, paramString.jWZ.jWt, 0).show();
          }
          if (!paramString.jXa) {
            QrRewardMainUI.a(QrRewardMainUI.this, false);
          }
          GMTrace.o(19365604884480L, 144285);
        }
      }).c(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19364799578112L, 144279);
          w.e("MicroMsg.QrRewardMainUI", "net error: %s", new Object[] { paramAnonymousk });
          if (!paramString.jXa) {
            QrRewardMainUI.a(QrRewardMainUI.this, false);
          }
          GMTrace.o(19364799578112L, 144279);
        }
      });
      GMTrace.o(19366410190848L, 144291);
      return true;
    }
    if ((paramk instanceof com.tencent.mm.plugin.collect.reward.a.g))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.g)paramk;
      paramString.a(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19362652094464L, 144263);
          w.i("MicroMsg.QrRewardMainUI", "set succ: %s, %s", new Object[] { paramString.jvD, QrRewardMainUI.l(QrRewardMainUI.this).getText() });
          if (paramString.jvD.equals(QrRewardMainUI.m(QrRewardMainUI.this)))
          {
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vzB, QrRewardMainUI.m(QrRewardMainUI.this));
            QrRewardMainUI.i(QrRewardMainUI.this);
          }
          GMTrace.o(19362652094464L, 144263);
        }
      }).b(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19379160875008L, 144386);
          w.e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", new Object[] { Integer.valueOf(paramString.jXf.jWs), paramString.jXf.jWt });
          QrRewardMainUI.a(QrRewardMainUI.this, (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzB, ""));
          QrRewardMainUI.c(QrRewardMainUI.this, QrRewardMainUI.k(QrRewardMainUI.this));
          QrRewardMainUI.l(QrRewardMainUI.this).setText("");
          QrRewardMainUI.i(QrRewardMainUI.this);
          if (!bg.nm(paramString.jXf.jWt)) {
            Toast.makeText(QrRewardMainUI.this, paramString.jXf.jWt, 0).show();
          }
          GMTrace.o(19379160875008L, 144386);
        }
      }).c(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19377818697728L, 144376);
          w.e("MicroMsg.QrRewardMainUI", "net error: %s", new Object[] { paramAnonymousk });
          QrRewardMainUI.a(QrRewardMainUI.this, (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzB, ""));
          QrRewardMainUI.c(QrRewardMainUI.this, QrRewardMainUI.k(QrRewardMainUI.this));
          QrRewardMainUI.l(QrRewardMainUI.this).setText("");
          QrRewardMainUI.i(QrRewardMainUI.this);
          GMTrace.o(19377818697728L, 144376);
        }
      });
      this.jXS.clearFocus();
      this.jXS.setCursorVisible(false);
    }
    GMTrace.o(19366410190848L, 144291);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19366812844032L, 144294);
    int i = a.g.sOh;
    GMTrace.o(19366812844032L, 144294);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19366678626304L, 144293);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        this.desc = paramIntent.getStringExtra("key_desc");
        this.jYb = paramIntent.getIntExtra("key_photo_width", 900);
        this.jYc = paramIntent.getIntExtra("key_icon_width", 343);
        boolean bool = paramIntent.getBooleanExtra("key_return_from_first", true);
        w.i("MicroMsg.QrRewardMainUI", "return from first: %s", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          this.jXN.setVisibility(0);
          this.jXM.setVisibility(8);
        }
        this.jYe = true;
        aoM();
        String str = paramIntent.getStringExtra("key_photo_url");
        h(str, paramIntent.getStringExtra("key_photo_aeskey"), true);
        this.hLG = str;
        GMTrace.o(19366678626304L, 144293);
      }
    }
    else {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(19366678626304L, 144293);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19366141755392L, 144289);
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    hN(1323);
    hN(1649);
    this.jYb = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzz, Integer.valueOf(900))).intValue();
    this.jYc = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzA, Integer.valueOf(343))).intValue();
    this.desc = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzC, ""));
    this.jXY = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzB, ""));
    this.jXZ = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzG, ""));
    this.jYa = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzH, ""));
    this.hLG = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzI, ""));
    if (!bg.nm((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzF, ""))) {
      this.jYe = true;
    }
    this.username = q.zE();
    oM(a.i.sWT);
    MP();
    if ((com.tencent.mm.plugin.collect.reward.b.a.aoF().aoG()) && (this.jYe)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.QrRewardMainUI", "do get code: %s", new Object[] { Boolean.valueOf(bool) });
      paramBundle = new com.tencent.mm.plugin.collect.reward.a.b(bool);
      paramBundle.l(this);
      if (!bool) {
        break;
      }
      b(paramBundle, false);
      GMTrace.o(19366141755392L, 144289);
      return;
    }
    b(paramBundle, true);
    GMTrace.o(19366141755392L, 144289);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19366947061760L, 144295);
    super.onDestroy();
    hO(1323);
    hO(1649);
    com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.aoF();
    w.d("MicroMsg.QrRewardCdnDownloadHelper", "do clear callback");
    if (locala.fUk != null)
    {
      w.i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", new Object[] { Integer.valueOf(locala.fUk.size()) });
      locala.fUk.clear();
    }
    GMTrace.o(19366947061760L, 144295);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\ui\QrRewardMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */