package com.tencent.mm.plugin.card.sharecard.ui;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.bw;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.j;
import com.tencent.mm.plugin.card.sharecard.model.q;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CardConsumeSuccessUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private View Hw;
  private final String TAG;
  private View.OnClickListener hwh;
  private com.tencent.mm.ui.base.r ihl;
  ae irz;
  private TextView jBP;
  private TextView jBQ;
  private TextView jCb;
  private TextView jCc;
  private TextView jCd;
  private TextView jCe;
  private ImageView jCf;
  private Button jCg;
  private CheckBox jCh;
  private j jCi;
  private String jCj;
  private String jCk;
  int jCl;
  int jCm;
  public int jCn;
  private String jCo;
  private String jCp;
  public ArrayList<String> jCq;
  public ArrayList<String> jCr;
  private String jwL;
  private String jxB;
  private long mStartTime;
  
  public CardConsumeSuccessUI()
  {
    GMTrace.i(5085509713920L, 37890);
    this.TAG = "MicroMsg.CardConsumeSuccessUI";
    this.jwL = "";
    this.jCj = "";
    this.jxB = "";
    this.jCk = "";
    this.jCl = 0;
    this.jCm = 0;
    this.jCn = 0;
    this.jCo = "";
    this.jCp = "";
    this.jCq = new ArrayList();
    this.jCr = new ArrayList();
    this.mStartTime = 0L;
    this.irz = new ae(Looper.getMainLooper());
    this.ihl = null;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5090341552128L, 37926);
        if (paramAnonymousView.getId() == R.h.bco)
        {
          CardConsumeSuccessUI.a(CardConsumeSuccessUI.this);
          GMTrace.o(5090341552128L, 37926);
          return;
        }
        if (paramAnonymousView.getId() == R.h.cgb)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("KLabel_range_index", CardConsumeSuccessUI.this.jCn);
          paramAnonymousView.putExtra("Klabel_name_list", CardConsumeSuccessUI.b(CardConsumeSuccessUI.this));
          paramAnonymousView.putExtra("Kother_user_name_list", CardConsumeSuccessUI.c(CardConsumeSuccessUI.this));
          paramAnonymousView.putExtra("k_sns_label_ui_title", CardConsumeSuccessUI.this.getString(R.l.ddH));
          paramAnonymousView.putExtra("k_sns_label_ui_style", 0);
          paramAnonymousView.putExtra("Ktag_rangeFilterprivate", true);
          com.tencent.mm.bj.d.b(CardConsumeSuccessUI.this, "sns", ".ui.SnsLabelUI", paramAnonymousView, 1);
        }
        GMTrace.o(5090341552128L, 37926);
      }
    };
    GMTrace.o(5085509713920L, 37890);
  }
  
  private void akO()
  {
    GMTrace.i(5086717673472L, 37899);
    this.vKB.hqF.setBackgroundColor(getResources().getColor(R.e.aOz));
    findViewById(R.h.bZg).setVisibility(4);
    GMTrace.o(5086717673472L, 37899);
  }
  
  private String akP()
  {
    GMTrace.i(5087657197568L, 37906);
    String str;
    if ((!TextUtils.isEmpty(this.jCo)) && (!TextUtils.isEmpty(this.jCp)))
    {
      str = this.jCo + "," + l.uH(this.jCp);
      GMTrace.o(5087657197568L, 37906);
      return str;
    }
    if (!TextUtils.isEmpty(this.jCo))
    {
      str = this.jCo;
      GMTrace.o(5087657197568L, 37906);
      return str;
    }
    if (!TextUtils.isEmpty(this.jCp))
    {
      str = l.uH(this.jCp);
      GMTrace.o(5087657197568L, 37906);
      return str;
    }
    GMTrace.o(5087657197568L, 37906);
    return "";
  }
  
  private void ar()
  {
    GMTrace.i(5086583455744L, 37898);
    if (this.jCi == null)
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
      GMTrace.o(5086583455744L, 37898);
      return;
    }
    findViewById(R.h.bZg).setVisibility(0);
    ju localju;
    if ((!TextUtils.isEmpty(this.jCi.jBd)) && (!TextUtils.isEmpty(this.jCi.jBe)))
    {
      this.jCh.setText(this.jCi.jBd);
      this.jCh.setVisibility(0);
      if ((this.jCi.jBb == null) || (this.jCi.jBb.size() <= 0)) {
        break label428;
      }
      this.jCc.setText(getString(R.l.dcs, new Object[] { Integer.valueOf(this.jCi.jBb.size()) }));
      localju = ((q)this.jCi.jBb.get(0)).jyL;
      if (localju == null) {
        break label410;
      }
      um(localju.gjg);
      this.jBP.setText(localju.jyT);
      this.jBQ.setText(localju.title);
      int i = getResources().getDimensionPixelSize(R.f.aRn);
      if (TextUtils.isEmpty(localju.jxH)) {
        break label360;
      }
      Object localObject = new c.a();
      ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
      com.tencent.mm.ao.n.Je();
      ((c.a)localObject).gKX = null;
      ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(localju.jxH);
      ((c.a)localObject).gKC = true;
      ((c.a)localObject).gKZ = true;
      ((c.a)localObject).gKA = true;
      ((c.a)localObject).gKJ = i;
      ((c.a)localObject).gKI = i;
      ((c.a)localObject).gKR = R.g.aYg;
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(localju.jxH, this.jCf, (c)localObject);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(localju.tZR)) {
        break label381;
      }
      this.jCg.setText(R.l.dcq);
      GMTrace.o(5086583455744L, 37898);
      return;
      this.jCh.setVisibility(8);
      w.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
      break;
      label360:
      w.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
      this.jCf.setImageResource(R.g.aYg);
    }
    label381:
    w.e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
    this.jCg.setText(localju.tZR);
    GMTrace.o(5086583455744L, 37898);
    return;
    label410:
    w.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
    GMTrace.o(5086583455744L, 37898);
    return;
    label428:
    this.jCg.setEnabled(false);
    w.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
    GMTrace.o(5086583455744L, 37898);
  }
  
  private void du(boolean paramBoolean)
  {
    GMTrace.i(5085643931648L, 37891);
    if (paramBoolean)
    {
      this.ihl = com.tencent.mm.ui.base.r.b(this, getString(R.l.bKJ), true, 0, null);
      GMTrace.o(5085643931648L, 37891);
      return;
    }
    if ((this.ihl != null) && (this.ihl.isShowing()))
    {
      this.ihl.dismiss();
      this.ihl = null;
    }
    GMTrace.o(5085643931648L, 37891);
  }
  
  private static void lM(int paramInt)
  {
    GMTrace.i(5087388762112L, 37904);
    w.i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is " + paramInt);
    bw localbw = new bw();
    localbw.eDd.aGY = paramInt;
    com.tencent.mm.sdk.b.a.vgX.m(localbw);
    GMTrace.o(5087388762112L, 37904);
  }
  
  private boolean ul(String paramString)
  {
    GMTrace.i(5086046584832L, 37894);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
      GMTrace.o(5086046584832L, 37894);
      return false;
    }
    this.jCi = com.tencent.mm.plugin.card.b.r.uM(paramString);
    if (this.jCi == null)
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is " + paramString);
      GMTrace.o(5086046584832L, 37894);
      return false;
    }
    GMTrace.o(5086046584832L, 37894);
    return true;
  }
  
  @TargetApi(16)
  private void um(String paramString)
  {
    GMTrace.i(5086851891200L, 37900);
    int i = l.uD(paramString);
    this.Hw.setBackgroundColor(i);
    com.tencent.mm.plugin.card.b.m.a(this, i);
    if (com.tencent.mm.compatible.util.d.et(16)) {
      this.jCg.setBackground(l.bN(i, getResources().getDimensionPixelSize(R.f.aQY) / 2));
    }
    for (;;)
    {
      this.Hw.invalidate();
      GMTrace.o(5086851891200L, 37900);
      return;
      this.jCg.setBackgroundDrawable(l.bN(i, getResources().getDimensionPixelSize(R.f.aQY) / 2));
    }
  }
  
  private void un(String paramString)
  {
    GMTrace.i(5087120326656L, 37902);
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = getString(R.l.dbV);
    }
    h.a(this, str, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5077456650240L, 37830);
        paramAnonymousDialogInterface.dismiss();
        CardConsumeSuccessUI.akQ();
        CardConsumeSuccessUI.this.finish();
        GMTrace.o(5077456650240L, 37830);
      }
    });
    GMTrace.o(5087120326656L, 37902);
  }
  
  protected final void MP()
  {
    GMTrace.i(5086449238016L, 37897);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5088999374848L, 37916);
        CardConsumeSuccessUI.this.finish();
        CardConsumeSuccessUI.akQ();
        GMTrace.o(5088999374848L, 37916);
        return true;
      }
    });
    this.Hw = this.vKB.hqF;
    this.jBP = ((TextView)findViewById(R.h.bjo));
    this.jBQ = ((TextView)findViewById(R.h.bkW));
    this.jCb = ((TextView)findViewById(R.h.bjJ));
    this.jCc = ((TextView)findViewById(R.h.cgc));
    this.jCd = ((TextView)findViewById(R.h.cgb));
    this.jCe = ((TextView)findViewById(R.h.cga));
    this.jCf = ((ImageView)findViewById(R.h.bkx));
    this.jCg = ((Button)findViewById(R.h.bco));
    this.jCh = ((CheckBox)findViewById(R.h.bfb));
    this.jCg.setOnClickListener(this.hwh);
    this.jCh.setOnClickListener(this.hwh);
    this.jCd.setOnClickListener(this.hwh);
    if (this.jCi != null) {
      ar();
    }
    GMTrace.o(5086449238016L, 37897);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5086986108928L, 37901);
    w.i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " scene cmd is " + paramk.getType());
    du(false);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.g)paramk;
        if (paramString.jzH == 0)
        {
          h.bm(this, getString(R.l.dbW));
          setResult(-1);
          this.jCg.setEnabled(false);
          l.amW();
          w.i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
          lM(-1);
          paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).jzG;
          paramk = new ShareCardInfo();
          f.a(paramk, paramString);
          l.a(paramk);
          al.aku().aic();
          finish();
          GMTrace.o(5086986108928L, 37901);
          return;
        }
        w.e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + paramString.jzH);
        com.tencent.mm.plugin.card.b.d.b(this, paramString.jzI);
        h.bm(this, getString(R.l.dbT));
        GMTrace.o(5086986108928L, 37901);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.d))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.d)paramk;
        if (paramString.jzH == 0)
        {
          if ((!TextUtils.isEmpty(paramString.jzG)) && (ul(paramString.jzG)))
          {
            w.i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
            this.irz.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5076517126144L, 37823);
                CardConsumeSuccessUI.d(CardConsumeSuccessUI.this);
                GMTrace.o(5076517126144L, 37823);
              }
            });
            GMTrace.o(5086986108928L, 37901);
            return;
          }
          w.e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
          if (this.jCl == 1)
          {
            lM(0);
            finish();
            GMTrace.o(5086986108928L, 37901);
            return;
          }
          akO();
          un(paramString.jzI);
          if (bg.nm(paramString.jzI))
          {
            h.bm(this, getString(R.l.dbV));
            GMTrace.o(5086986108928L, 37901);
            return;
          }
          h.bm(this, paramString.jzI);
          GMTrace.o(5086986108928L, 37901);
          return;
        }
        if (this.jCl == 1)
        {
          lM(0);
          finish();
          GMTrace.o(5086986108928L, 37901);
          return;
        }
        w.e("MicroMsg.CardConsumeSuccessUI", "succScene.getRetCode() is " + paramString.jzH);
        akO();
        un(paramString.jzI);
        GMTrace.o(5086986108928L, 37901);
      }
    }
    else
    {
      if (((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.d)) && (this.jCl == 1))
      {
        lM(0);
        finish();
        GMTrace.o(5086986108928L, 37901);
        return;
      }
      com.tencent.mm.plugin.card.b.d.b(this, paramString);
    }
    GMTrace.o(5086986108928L, 37901);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5085778149376L, 37892);
    int i = R.i.cqP;
    GMTrace.o(5085778149376L, 37892);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5087522979840L, 37905);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5087522979840L, 37905);
      return;
      if (paramInt2 != -1)
      {
        GMTrace.o(5087522979840L, 37905);
        return;
      }
      this.jCn = paramIntent.getIntExtra("Ktag_range_index", 0);
      w.i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.jCn) });
      if (this.jCn >= 2)
      {
        this.jCo = paramIntent.getStringExtra("Klabel_name_list");
        this.jCp = paramIntent.getStringExtra("Kother_user_name_list");
        w.d("MicroMsg.CardConsumeSuccessUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.jCn), this.jCo });
        if ((TextUtils.isEmpty(this.jCo)) && (TextUtils.isEmpty(this.jCp)))
        {
          w.e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
          GMTrace.o(5087522979840L, 37905);
          return;
        }
        paramIntent = Arrays.asList(this.jCo.split(","));
        this.jCr = l.ae(paramIntent);
        this.jCq = l.ad(paramIntent);
        if ((this.jCp != null) && (this.jCp.length() > 0))
        {
          paramIntent = Arrays.asList(this.jCp.split(","));
          this.jCq.addAll(paramIntent);
        }
        if (this.jCr != null) {
          w.i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.jCr.size());
        }
        if (this.jCq != null)
        {
          w.i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.jCq.size());
          paramIntent = this.jCq.iterator();
          while (paramIntent.hasNext()) {
            w.d("MicroMsg.CardConsumeSuccessUI", "username : %s", new Object[] { (String)paramIntent.next() });
          }
        }
        if (this.jCn == 2)
        {
          this.jCe.setVisibility(0);
          this.jCe.setText(getString(R.l.ddG, new Object[] { akP() }));
          GMTrace.o(5087522979840L, 37905);
          return;
        }
        if (this.jCn == 3)
        {
          this.jCe.setVisibility(0);
          this.jCe.setText(getString(R.l.ddF, new Object[] { akP() }));
          GMTrace.o(5087522979840L, 37905);
          return;
        }
        this.jCe.setVisibility(8);
        GMTrace.o(5087522979840L, 37905);
        return;
      }
      this.jCe.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5085912367104L, 37893);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CardConsumeSuccessUI", "onCreate()");
    this.mStartTime = System.currentTimeMillis();
    sq("");
    setResult(0);
    at.wS().a(902, this);
    at.wS().a(910, this);
    paramBundle = "";
    this.jCl = getIntent().getIntExtra("key_from_scene", 0);
    Object localObject;
    if (this.jCl == 1)
    {
      w.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_JS");
      this.jCj = getIntent().getStringExtra("key_consumed_card_id");
      this.jCk = getIntent().getStringExtra("key_consumed_Code");
      if (TextUtils.isEmpty(this.jCj))
      {
        w.e("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCardId is empty!");
        lM(0);
        finish();
        GMTrace.o(5085912367104L, 37893);
        return;
      }
      w.i("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCode is " + this.jCk);
      du(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d("", this.jCj, this.jCk);
      at.wS().a((k)localObject, 0);
      akO();
    }
    for (this.jCm = 7;; this.jCm = 4)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11324, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.jCm), "", Integer.valueOf(0), "" });
      MP();
      if (!TextUtils.isEmpty(paramBundle)) {
        um(paramBundle);
      }
      GMTrace.o(5085912367104L, 37893);
      return;
      if (this.jCl != 2) {
        break;
      }
      w.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_MSG_UI");
      this.jwL = getIntent().getStringExtra("key_card_id");
      if (TextUtils.isEmpty(this.jwL))
      {
        w.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
        lM(0);
        finish();
        GMTrace.o(5085912367104L, 37893);
        return;
      }
      w.i("MicroMsg.CardConsumeSuccessUI", "the mCardId is " + this.jwL);
      du(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d(this.jwL, "", "");
      at.wS().a((k)localObject, 0);
      akO();
    }
    w.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_CONSUMED_CODE");
    this.jwL = getIntent().getStringExtra("KEY_CARD_ID");
    if (!ul(getIntent().getStringExtra("KEY_CARD_CONSUMED_JSON")))
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
      lM(0);
      finish();
      GMTrace.o(5085912367104L, 37893);
      return;
    }
    if ((this.jCi != null) && (!bg.cc(this.jCi.jBb)))
    {
      paramBundle = ((q)this.jCi.jBb.get(0)).jyL;
      if (paramBundle == null) {}
    }
    for (paramBundle = paramBundle.gjg;; paramBundle = "")
    {
      localObject = paramBundle;
      if (bg.nm(paramBundle)) {
        localObject = getIntent().getStringExtra("KEY_CARD_COLOR");
      }
      this.jCm = getIntent().getIntExtra("key_stastic_scene", 0);
      paramBundle = (Bundle)localObject;
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5086315020288L, 37896);
    at.wS().b(902, this);
    at.wS().b(910, this);
    long l = System.currentTimeMillis() - this.mStartTime;
    if (!TextUtils.isEmpty(this.jwL)) {
      com.tencent.mm.plugin.report.service.g.ork.i(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.jCl), this.jxB, this.jwL, Long.valueOf(l) });
    }
    for (;;)
    {
      super.onDestroy();
      GMTrace.o(5086315020288L, 37896);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.jCl), this.jxB, this.jCj, Long.valueOf(l) });
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5087254544384L, 37903);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
      lM(0);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5087254544384L, 37903);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(5086180802560L, 37895);
    super.onResume();
    GMTrace.o(5086180802560L, 37895);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\CardConsumeSuccessUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */