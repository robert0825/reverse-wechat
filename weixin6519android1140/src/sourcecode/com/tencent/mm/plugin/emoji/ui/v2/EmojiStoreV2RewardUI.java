package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.c.i;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.f.b;
import com.tencent.mm.plugin.emoji.f.o;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.ui.GridInScrollView;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.aae;
import com.tencent.mm.protocal.c.dr;
import com.tencent.mm.protocal.c.rf;
import com.tencent.mm.protocal.c.rg;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Collection;
import java.util.LinkedList;

public class EmojiStoreV2RewardUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, com.tencent.mm.ad.e
{
  private ProgressDialog kgz;
  private int kkA;
  private String kkG;
  private String klj;
  private aae kpA;
  private Button kpZ;
  private View.OnClickListener ktA;
  private View.OnClickListener ktB;
  private TextWatcher ktC;
  private AnimationDrawable ktl;
  private int kto;
  private EmojiStoreV2RewardBannerView ktp;
  private GridInScrollView ktq;
  private View ktr;
  private View kts;
  private MMFormInputView ktt;
  private TextView ktu;
  private TextView ktv;
  private b ktw;
  private b ktx;
  private int kty;
  private boolean ktz;
  private ae mHandler;
  
  public EmojiStoreV2RewardUI()
  {
    GMTrace.i(11513465143296L, 85782);
    this.kty = a.ktF;
    this.ktz = false;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11507022692352L, 85734);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11507022692352L, 85734);
          return;
          paramAnonymousMessage = (String)paramAnonymousMessage.obj;
          if ((!bg.nm(paramAnonymousMessage)) && (com.tencent.mm.a.e.aZ(paramAnonymousMessage)))
          {
            EmojiStoreV2RewardUI.a(EmojiStoreV2RewardUI.this).cz(paramAnonymousMessage, null);
            EmojiStoreV2RewardUI.a(EmojiStoreV2RewardUI.this).setScaleType(ImageView.ScaleType.FIT_XY);
            if ((EmojiStoreV2RewardUI.b(EmojiStoreV2RewardUI.this) != null) && (EmojiStoreV2RewardUI.b(EmojiStoreV2RewardUI.this).isRunning()))
            {
              EmojiStoreV2RewardUI.b(EmojiStoreV2RewardUI.this).stop();
              GMTrace.o(11507022692352L, 85734);
            }
          }
          else
          {
            w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "path is null or file no exists");
            GMTrace.o(11507022692352L, 85734);
            return;
            EmojiStoreV2RewardUI.c(EmojiStoreV2RewardUI.this);
          }
        }
      }
    };
    this.ktA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11479105404928L, 85526);
        if (EmojiStoreV2RewardUI.d(EmojiStoreV2RewardUI.this) != null)
        {
          paramAnonymousView = EmojiStoreV2RewardUI.d(EmojiStoreV2RewardUI.this).mP(0);
          if (EmojiStoreV2RewardUI.e(EmojiStoreV2RewardUI.this).getText() != null)
          {
            paramAnonymousView.uhB = EmojiStoreV2RewardUI.e(EmojiStoreV2RewardUI.this).getText().toString();
            EmojiStoreV2RewardUI.a(EmojiStoreV2RewardUI.this, EmojiStoreV2RewardUI.f(EmojiStoreV2RewardUI.this), paramAnonymousView);
            GMTrace.o(11479105404928L, 85526);
            return;
          }
          w.w("MicroMsg.emoji.EmojiStoreV2RewardUI", "mRewardInputView is null");
          GMTrace.o(11479105404928L, 85526);
          return;
        }
        w.w("MicroMsg.emoji.EmojiStoreV2RewardUI", "mAdapter is null.");
        GMTrace.o(11479105404928L, 85526);
      }
    };
    this.ktB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11478031663104L, 85518);
        if (EmojiStoreV2RewardUI.g(EmojiStoreV2RewardUI.this) == EmojiStoreV2RewardUI.a.ktF) {
          EmojiStoreV2RewardUI.a(EmojiStoreV2RewardUI.this, EmojiStoreV2RewardUI.a.ktG);
        }
        GMTrace.o(11478031663104L, 85518);
      }
    };
    this.ktC = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(11522994601984L, 85853);
        float f1;
        if (EmojiStoreV2RewardUI.h(EmojiStoreV2RewardUI.this) != null) {
          if ((paramAnonymousEditable != null) && (paramAnonymousEditable.length() > 0))
          {
            String str = paramAnonymousEditable.toString();
            int i = str.indexOf(".");
            if ((i > 0) && (str.length() - i - 1 > 2)) {
              paramAnonymousEditable.delete(i + 3, i + 4);
            }
            f1 = 0.0F;
          }
        }
        try
        {
          float f2 = Float.valueOf(paramAnonymousEditable.toString()).floatValue();
          f1 = f2;
        }
        catch (NumberFormatException paramAnonymousEditable)
        {
          for (;;) {}
        }
        if ((f1 > 200.0F) || (f1 < 1.0F))
        {
          EmojiStoreV2RewardUI.e(EmojiStoreV2RewardUI.this).nUE.setTextColor(EmojiStoreV2RewardUI.this.vKB.vKW.getResources().getColor(R.e.aOL));
          EmojiStoreV2RewardUI.h(EmojiStoreV2RewardUI.this).setEnabled(false);
          GMTrace.o(11522994601984L, 85853);
          return;
        }
        EmojiStoreV2RewardUI.e(EmojiStoreV2RewardUI.this).nUE.setTextColor(EmojiStoreV2RewardUI.this.vKB.vKW.getResources().getColor(R.e.aOE));
        EmojiStoreV2RewardUI.h(EmojiStoreV2RewardUI.this).setEnabled(true);
        GMTrace.o(11522994601984L, 85853);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11522860384256L, 85852);
        GMTrace.o(11522860384256L, 85852);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11522726166528L, 85851);
        GMTrace.o(11522726166528L, 85851);
      }
    };
    GMTrace.o(11513465143296L, 85782);
  }
  
  private void a(String paramString, rf paramrf)
  {
    GMTrace.i(11514941538304L, 85793);
    asd();
    this.ktx = new b(paramString, paramrf);
    at.wS().a(this.ktx, 0);
    GMTrace.o(11514941538304L, 85793);
  }
  
  private void ar()
  {
    GMTrace.i(11514404667392L, 85789);
    final Object localObject1;
    final Object localObject2;
    if (this.kpA != null)
    {
      this.ktu.setVisibility(0);
      this.ktv.setVisibility(0);
      if ((this.kpA.uqV != null) && (!bg.nm(this.kpA.uqV.uhF)))
      {
        localObject1 = this.kpA.uqV.uhF;
        at.AR();
        localObject2 = EmojiLogic.F(c.zb(), this.klj, (String)localObject1);
        if (com.tencent.mm.a.e.aZ((String)localObject2))
        {
          this.ktp.cz((String)localObject2, null);
          this.ktp.setScaleType(ImageView.ScaleType.FIT_XY);
          if ((this.ktl != null) && (this.ktl.isRunning())) {
            this.ktl.stop();
          }
        }
      }
    }
    while ((this.kpA != null) && (this.kpA.uqU != null))
    {
      this.ktq.setVisibility(0);
      localObject1 = this.ktw;
      localObject2 = this.kpA.uqU;
      if (((b)localObject1).kte == null) {
        ((b)localObject1).kte = new LinkedList();
      }
      ((b)localObject1).kte.clear();
      ((b)localObject1).kte.addAll((Collection)localObject2);
      ((b)localObject1).notifyDataSetChanged();
      GMTrace.o(11514404667392L, 85789);
      return;
      com.tencent.mm.ao.n.Jd().a((String)localObject1, this.ktp, f.g(this.klj, (String)localObject1, new Object[0]), new i()
      {
        public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(11477494792192L, 85514);
          if ((!bg.nm(paramAnonymousString)) && (paramAnonymousString.equalsIgnoreCase(localObject1)))
          {
            paramAnonymousString = new Message();
            paramAnonymousString.what = 1001;
            paramAnonymousString.obj = localObject2;
            EmojiStoreV2RewardUI.j(EmojiStoreV2RewardUI.this).sendMessage(paramAnonymousString);
          }
          GMTrace.o(11477494792192L, 85514);
        }
      });
      this.ktp.setBackgroundDrawable(getResources().getDrawable(R.g.aWn));
      this.ktp.setImageDrawable(this.ktl);
      this.ktp.setScaleType(ImageView.ScaleType.CENTER);
      this.ktl.start();
      continue;
      this.ktp.setBackgroundDrawable(getResources().getDrawable(R.g.aWn));
      this.ktp.setImageDrawable(this.ktl);
      this.ktp.setScaleType(ImageView.ScaleType.CENTER);
      this.ktl.start();
      continue;
      this.ktu.setVisibility(8);
      this.ktv.setVisibility(8);
    }
    this.ktq.setVisibility(8);
    GMTrace.o(11514404667392L, 85789);
  }
  
  private void asd()
  {
    GMTrace.i(11515075756032L, 85794);
    getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11478300098560L, 85520);
        at.wS().c(EmojiStoreV2RewardUI.k(EmojiStoreV2RewardUI.this));
        GMTrace.o(11478300098560L, 85520);
      }
    });
    GMTrace.o(11515075756032L, 85794);
  }
  
  private void dY(boolean paramBoolean)
  {
    GMTrace.i(11515344191488L, 85796);
    w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "doGetRewardScene");
    if (paramBoolean)
    {
      localo = new o(this.klj, o.klQ);
      at.wS().a(localo, 0);
      GMTrace.o(11515344191488L, 85796);
      return;
    }
    o localo = new o(this.klj, o.klR);
    at.wS().a(localo, 0);
    asd();
    GMTrace.o(11515344191488L, 85796);
  }
  
  private void mO(int paramInt)
  {
    GMTrace.i(11514136231936L, 85787);
    if (paramInt == a.ktG)
    {
      this.kty = a.ktG;
      if (this.kts != null)
      {
        this.kts.setVisibility(0);
        this.kts.startAnimation(AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLC));
        this.ktt.nUE.requestFocus();
        aLs();
        this.ktr.setVisibility(8);
        GMTrace.o(11514136231936L, 85787);
      }
    }
    else
    {
      aLo();
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11513330925568L, 85781);
          EmojiStoreV2RewardUI.i(EmojiStoreV2RewardUI.this);
          GMTrace.o(11513330925568L, 85781);
        }
      }, 300L);
    }
    GMTrace.o(11514136231936L, 85787);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(11515209973760L, 85795);
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramString, null, getString(R.l.dos), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11473736695808L, 85486);
        GMTrace.o(11473736695808L, 85486);
      }
    });
    GMTrace.o(11515209973760L, 85795);
  }
  
  protected final void MP()
  {
    GMTrace.i(11514270449664L, 85788);
    if (bg.nm(this.kkG)) {
      oM(R.l.doU);
    }
    for (;;)
    {
      AW(R.l.ekF);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11513062490112L, 85779);
          EmojiStoreV2RewardUI.this.onBackPressed();
          GMTrace.o(11513062490112L, 85779);
          return true;
        }
      });
      this.ktr = findViewById(R.h.bYL);
      this.kts = findViewById(R.h.bYM);
      this.ktt = ((MMFormInputView)findViewById(R.h.bYN));
      this.kpZ = ((Button)findViewById(R.h.bYO));
      this.kpZ.setOnClickListener(this.ktA);
      this.kpZ.setEnabled(false);
      this.ktt.setInputType(8194);
      this.ktt.addTextChangedListener(this.ktC);
      this.ktt.nUE.setFilters(new InputFilter[] { new InputFilter.LengthFilter(12) });
      this.ktu = ((TextView)findViewById(R.h.bYJ));
      this.ktu.setOnClickListener(this.ktB);
      this.ktv = ((TextView)findViewById(R.h.bYH));
      this.ktp = ((EmojiStoreV2RewardBannerView)findViewById(R.h.bgo));
      this.ktq = ((GridInScrollView)findViewById(16908298));
      this.ktw = new b();
      this.ktq.setAdapter(this.ktw);
      this.ktq.setOnItemClickListener(this);
      this.ktl = ((AnimationDrawable)getResources().getDrawable(R.g.aWe));
      GMTrace.o(11514270449664L, 85788);
      return;
      sq(getString(R.l.dpc, new Object[] { this.kkG }));
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11515478409216L, 85797);
    GMTrace.o(11515478409216L, 85797);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11514807320576L, 85792);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    int i = paramk.getType();
    switch (i)
    {
    default: 
      w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "unknown scene. type:%d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(11514807320576L, 85792);
      return;
    case 830: 
      Object localObject = (b)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Bundle();
        paramString.putBoolean("extinfo_key_10", true);
        paramk = this.vKB.vKW;
        String str = ((b)localObject).aru().tRU;
        localObject = ((b)localObject).aru().lPg;
        if (!bg.nm(str))
        {
          localObject = com.tencent.mm.pluginsdk.wallet.g.a(str, (String)localObject, null, null, 5, 0);
          ((PayInfo)localObject).tIC = paramString;
          com.tencent.mm.pluginsdk.wallet.g.a(paramk, (PayInfo)localObject, 8001);
        }
        GMTrace.o(11514807320576L, 85792);
        return;
      }
      if (paramInt1 == 4)
      {
        if (!this.ktz)
        {
          this.ktz = true;
          com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { this.klj, Integer.valueOf(this.kto), Integer.valueOf(this.kkA), Integer.valueOf(2) });
        }
        if (paramInt2 == b.klg)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(408L, 6L, 1L, false);
          if (bg.nm(paramString))
          {
            wr(getString(R.l.doX));
            GMTrace.o(11514807320576L, 85792);
            return;
          }
          wr(paramString);
          GMTrace.o(11514807320576L, 85792);
          return;
        }
        if (paramInt2 == b.klh)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(408L, 7L, 1L, false);
          if (bg.nm(paramString))
          {
            wr(getString(R.l.doZ));
            GMTrace.o(11514807320576L, 85792);
            return;
          }
          wr(paramString);
          GMTrace.o(11514807320576L, 85792);
          return;
        }
        if (paramInt2 == b.kli)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(408L, 5L, 1L, false);
          if (bg.nm(paramString))
          {
            wr(getString(R.l.doY));
            GMTrace.o(11514807320576L, 85792);
            return;
          }
          wr(paramString);
          GMTrace.o(11514807320576L, 85792);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(408L, 8L, 1L, false);
        Toast.makeText(this, getString(R.l.dox), 0).show();
        GMTrace.o(11514807320576L, 85792);
        return;
      }
      if (!this.ktz)
      {
        this.ktz = true;
        com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { this.klj, Integer.valueOf(this.kto), Integer.valueOf(this.kkA), Integer.valueOf(2) });
      }
      com.tencent.mm.plugin.report.service.g.ork.a(408L, 8L, 1L, false);
      Toast.makeText(this, getString(R.l.dox), 0).show();
      GMTrace.o(11514807320576L, 85792);
      return;
    }
    paramString = (o)paramk;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "update emotion reward success.");
      this.kpA = paramString.arD();
      com.tencent.mm.ao.n.Jd().a(this.kpA.uqV.uhG, null, f.g(this.klj, this.kpA.uqV.uhG, new Object[0]));
      this.mHandler.sendEmptyMessage(1002);
      GMTrace.o(11514807320576L, 85792);
      return;
    }
    w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "update emotion reward failed.");
    GMTrace.o(11514807320576L, 85792);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11513599361024L, 85783);
    int i = R.i.cuX;
    GMTrace.o(11513599361024L, 85783);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11514673102848L, 85791);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11514673102848L, 85791);
      return;
      if (paramInt2 == -1)
      {
        paramIntent = new Intent();
        paramIntent.setClass(this, EmojiStoreV2RewardThanksUI.class);
        paramIntent.putExtra("extra_id", this.klj);
        startActivity(paramIntent);
        com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { this.klj, Integer.valueOf(this.kto), Integer.valueOf(this.kkA), Integer.valueOf(1) });
        com.tencent.mm.plugin.report.service.g.ork.a(408L, 9L, 1L, false);
        dY(true);
        finish();
        GMTrace.o(11514673102848L, 85791);
        return;
      }
      if (paramInt2 == 0)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { this.klj, Integer.valueOf(this.kto), Integer.valueOf(this.kkA), Integer.valueOf(3) });
        com.tencent.mm.plugin.report.service.g.ork.a(408L, 3L, 1L, false);
        GMTrace.o(11514673102848L, 85791);
        return;
      }
      if (!this.ktz)
      {
        this.ktz = true;
        com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { this.klj, Integer.valueOf(this.kto), Integer.valueOf(this.kkA), Integer.valueOf(2) });
      }
      com.tencent.mm.plugin.report.service.g.ork.a(408L, 4L, 1L, false);
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11514002014208L, 85786);
    w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", this.vKB.vLo);
    if (this.kty == a.ktF)
    {
      if (this.ktz) {
        com.tencent.mm.plugin.report.service.g.ork.a(408L, 2L, 1L, false);
      }
      for (;;)
      {
        super.onBackPressed();
        GMTrace.o(11514002014208L, 85786);
        return;
        com.tencent.mm.plugin.report.service.g.ork.a(408L, 1L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { this.klj, Integer.valueOf(this.kto), Integer.valueOf(this.kkA), Integer.valueOf(4) });
      }
    }
    mO(a.ktF);
    GMTrace.o(11514002014208L, 85786);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11513733578752L, 85784);
    super.onCreate(paramBundle);
    this.klj = getIntent().getStringExtra("extra_id");
    this.kkG = getIntent().getStringExtra("name");
    this.kkA = getIntent().getIntExtra("scene", 0);
    this.kto = getIntent().getIntExtra("pageType", 0);
    MP();
    this.kpA = com.tencent.mm.plugin.emoji.model.h.arl().kjD.UQ(this.klj);
    if ((this.kpA != null) && (this.kpA.uqV != null))
    {
      com.tencent.mm.ao.n.Jd().a(this.kpA.uqV.uhG, null, f.g(this.klj, this.kpA.uqV.uhG, new Object[0]));
      com.tencent.mm.ao.n.Jd().a(this.kpA.uqV.uhH, null, f.g(this.klj, this.kpA.uqV.uhH, new Object[0]));
    }
    for (;;)
    {
      ar();
      at.wS().a(830, this);
      at.wS().a(822, this);
      com.tencent.mm.plugin.report.service.g.ork.a(408L, 0L, 1L, false);
      GMTrace.o(11513733578752L, 85784);
      return;
      dY(false);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11513867796480L, 85785);
    at.wS().b(830, this);
    at.wS().b(822, this);
    if ((this.ktl != null) && (this.ktl.isRunning())) {
      this.ktl.stop();
    }
    super.onDestroy();
    GMTrace.o(11513867796480L, 85785);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11514538885120L, 85790);
    if (this.ktw != null)
    {
      paramAdapterView = this.ktw.mP(paramInt);
      if (paramAdapterView != null)
      {
        w.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "onItemClick position:%d", new Object[] { Integer.valueOf(paramInt) });
        a(this.klj, paramAdapterView);
      }
    }
    GMTrace.o(11514538885120L, 85790);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(11517760110592L, 85814);
      ktF = 1;
      ktG = 2;
      ktH = new int[] { ktF, ktG };
      GMTrace.o(11517760110592L, 85814);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    LinkedList<rf> kte;
    
    b()
    {
      GMTrace.i(11523128819712L, 85854);
      GMTrace.o(11523128819712L, 85854);
    }
    
    public final int getCount()
    {
      GMTrace.i(11523263037440L, 85855);
      if (this.kte == null)
      {
        GMTrace.o(11523263037440L, 85855);
        return 0;
      }
      int i = this.kte.size();
      GMTrace.o(11523263037440L, 85855);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11523531472896L, 85857);
      long l = paramInt;
      GMTrace.o(11523531472896L, 85857);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11523665690624L, 85858);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = v.fb(EmojiStoreV2RewardUI.this.vKB.vKW).inflate(R.i.cuV, null);
        paramViewGroup = new EmojiStoreV2RewardUI.c(EmojiStoreV2RewardUI.this, paramView);
        paramView.setTag(paramViewGroup);
        rf localrf = mP(paramInt);
        if (localrf == null) {
          break label132;
        }
        paramViewGroup.ktI.setVisibility(0);
        paramViewGroup.ktI.setText(localrf.uhB + localrf.lSG);
      }
      for (;;)
      {
        GMTrace.o(11523665690624L, 85858);
        return paramView;
        paramViewGroup = (EmojiStoreV2RewardUI.c)paramView.getTag();
        break;
        label132:
        paramViewGroup.ktI.setVisibility(8);
      }
    }
    
    public final rf mP(int paramInt)
    {
      GMTrace.i(11523397255168L, 85856);
      if ((paramInt < 0) || (paramInt > getCount()))
      {
        GMTrace.o(11523397255168L, 85856);
        return null;
      }
      if (this.kte == null)
      {
        GMTrace.o(11523397255168L, 85856);
        return null;
      }
      rf localrf = (rf)this.kte.get(paramInt);
      GMTrace.o(11523397255168L, 85856);
      return localrf;
    }
  }
  
  final class c
  {
    TextView ktI;
    
    public c(View paramView)
    {
      GMTrace.i(11473870913536L, 85487);
      this.ktI = ((TextView)paramView.findViewById(R.h.bTP));
      GMTrace.o(11473870913536L, 85487);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2RewardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */