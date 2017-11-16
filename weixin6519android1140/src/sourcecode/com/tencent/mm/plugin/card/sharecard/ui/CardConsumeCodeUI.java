package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.c.a;
import com.tencent.mm.plugin.card.a.d.a;
import com.tencent.mm.plugin.card.a.i;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public class CardConsumeCodeUI
  extends MMActivity
  implements View.OnClickListener, c.a, d.a
{
  private final String TAG;
  private String jBL;
  private int jBM;
  private int jBN;
  private a jBO;
  private TextView jBP;
  private TextView jBQ;
  private LinearLayout jBR;
  private ImageView jBS;
  private View jBT;
  private LinearLayout jBU;
  private View jBV;
  private TextView jBW;
  private TextView jBX;
  private TextView jBY;
  private boolean jBZ;
  private Vibrator jsv;
  private int jtE;
  private com.tencent.mm.plugin.card.base.b jwZ;
  
  public CardConsumeCodeUI()
  {
    GMTrace.i(5073430118400L, 37800);
    this.TAG = "MicroMsg.CardConsumeCodeUI";
    this.jtE = 3;
    this.jBM = 3;
    this.jBN = 0;
    this.jBZ = false;
    GMTrace.o(5073430118400L, 37800);
  }
  
  protected final void MP()
  {
    GMTrace.i(5073832771584L, 37803);
    Object localObject1;
    label416:
    int i;
    if (this.jwZ.ajc())
    {
      if (!TextUtils.isEmpty(this.jwZ.ajv().jyS)) {
        sq(getString(R.l.dcr, new Object[] { this.jwZ.ajv().jyS }));
      }
    }
    else
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5088596721664L, 37913);
          CardConsumeCodeUI.this.setResult(-1);
          CardConsumeCodeUI.this.finish();
          GMTrace.o(5088596721664L, 37913);
          return true;
        }
      });
      if (this.jBO == null)
      {
        this.jBO = new a(this, this.vKB.hqF);
        localObject1 = this.jBO;
        ((a)localObject1).jBI = ((a)localObject1).iPC.getWindow().getAttributes().screenBrightness;
        localObject1 = this.jBO;
        ((a)localObject1).jBB = ((TextView)((a)localObject1).jBw.findViewById(R.h.bkY));
        ((a)localObject1).jBC = ((TextView)((a)localObject1).jBw.findViewById(R.h.ble));
        ((a)localObject1).jBD = ((CheckBox)((a)localObject1).jBw.findViewById(R.h.bRY));
        ((a)localObject1).jBD.setChecked(true);
        ((a)localObject1).jBD.setOnClickListener(((a)localObject1).hwh);
        if (((a)localObject1).jBI < 0.8F) {
          ((a)localObject1).Y(0.8F);
        }
        this.jBO.jBH = new a.a()
        {
          public final void lL(int paramAnonymousInt)
          {
            GMTrace.i(5092489035776L, 37942);
            al.akz().y(CardConsumeCodeUI.a(CardConsumeCodeUI.this).ajz(), paramAnonymousInt, 1);
            GMTrace.o(5092489035776L, 37942);
          }
        };
      }
      this.jBO.jwZ = this.jwZ;
      this.jBO.jBG = true;
      Object localObject2;
      if (this.jwZ.ajb())
      {
        localObject1 = this.jBO;
        localObject2 = this.jBL;
        ((a)localObject1).jBF = 1;
        ((a)localObject1).jBE = ((String)localObject2);
      }
      this.jsv = ((Vibrator)getSystemService("vibrator"));
      this.jBP = ((TextView)findViewById(R.h.biu));
      this.jBQ = ((TextView)findViewById(R.h.title));
      this.jBR = ((LinearLayout)findViewById(R.h.beq));
      this.jBS = ((ImageView)findViewById(R.h.bep));
      this.jBT = findViewById(R.h.bsS);
      this.jBU = ((LinearLayout)findViewById(R.h.bpA));
      if (!this.jwZ.ajc()) {
        break label1016;
      }
      findViewById(R.h.bjH).setBackgroundColor(getResources().getColor(R.e.aOz));
      m.b(this, true);
      if ((!this.jwZ.ajc()) || (TextUtils.isEmpty(this.jwZ.ajv().jxH))) {
        break label1052;
      }
      this.jBR.setVisibility(0);
      this.jBP.setVisibility(8);
      this.jBQ.setVisibility(8);
      this.jBT.setVisibility(8);
      i = getResources().getDimensionPixelSize(R.f.aRe);
      m.a(this.jBS, this.jwZ.ajv().jxH, i, R.g.aYg, true);
      label516:
      if (this.jwZ.ajv().uam != null)
      {
        localObject1 = this.jwZ.ajv().uam;
        if (!TextUtils.isEmpty(((np)localObject1).title))
        {
          if (this.jBV == null) {
            this.jBV = ((ViewStub)findViewById(R.h.blf)).inflate();
          }
          this.jBV.setOnClickListener(this);
          this.jBW = ((TextView)this.jBV.findViewById(R.h.blh));
          this.jBX = ((TextView)this.jBV.findViewById(R.h.blg));
          this.jBY = ((TextView)this.jBV.findViewById(R.h.bld));
          this.jBW.setVisibility(0);
          this.jBW.setText(((np)localObject1).title);
          localObject2 = getResources().getDrawable(R.g.aUR);
          ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getMinimumWidth(), ((Drawable)localObject2).getMinimumHeight());
          ((Drawable)localObject2).setColorFilter(com.tencent.mm.plugin.card.b.l.uD(this.jwZ.ajv().gjg), PorterDuff.Mode.SRC_IN);
          this.jBW.setCompoundDrawables(null, null, (Drawable)localObject2, null);
          this.jBW.setTextColor(com.tencent.mm.plugin.card.b.l.uD(this.jwZ.ajv().gjg));
          this.jBW.setOnClickListener(this);
          if (TextUtils.isEmpty(((np)localObject1).jxI)) {
            break label1093;
          }
          this.jBX.setVisibility(0);
          this.jBX.setText(((np)localObject1).jxI);
        }
      }
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(((np)localObject1).jxJ))
      {
        this.jBY.setVisibility(0);
        this.jBY.setText(((np)localObject1).jxJ);
      }
      localObject1 = this.jBS.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = getResources().getDimensionPixelSize(R.f.aRf);
      ((ViewGroup.LayoutParams)localObject1).width = getResources().getDimensionPixelSize(R.f.aRf);
      this.jBS.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.jBR.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = com.tencent.mm.br.a.fromDPToPix(this, 54);
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.br.a.fromDPToPix(this, 54);
      this.jBR.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      i = getResources().getDimensionPixelSize(R.f.aRf);
      m.a(this.jBS, this.jwZ.ajv().jxH, i, R.g.aYg, true);
      this.jBU.setPadding(0, com.tencent.mm.br.a.fromDPToPix(this, 10), 0, com.tencent.mm.br.a.fromDPToPix(this, 30));
      al.aky().a(this);
      if (!this.jwZ.ajp()) {
        break label1141;
      }
      al.akA().a(this);
      if (al.akA().isEmpty()) {
        break label1118;
      }
      al.akA().ajL();
      GMTrace.o(5073832771584L, 37803);
      return;
      sq(getString(R.l.dcr, new Object[] { getString(R.l.crm) }));
      break;
      label1016:
      findViewById(R.h.bjH).setBackgroundColor(com.tencent.mm.plugin.card.b.l.uD(this.jwZ.ajv().gjg));
      m.a(this, this.jwZ);
      break label416;
      label1052:
      this.jBP.setText(this.jwZ.ajv().jyT);
      this.jBQ.setText(this.jwZ.ajv().title);
      break label516;
      label1093:
      this.jBX.setVisibility(0);
      this.jBX.setText(getString(R.l.ddd));
    }
    label1118:
    w.i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
    al.akA().tK(this.jwZ.ajz());
    label1141:
    GMTrace.o(5073832771584L, 37803);
  }
  
  public final void ajN()
  {
    GMTrace.i(5075040731136L, 37812);
    this.jBO.akN();
    GMTrace.o(5075040731136L, 37812);
  }
  
  public final void ajS()
  {
    GMTrace.i(5074638077952L, 37809);
    this.jsv.vibrate(300L);
    GMTrace.o(5074638077952L, 37809);
  }
  
  public final void ajT()
  {
    GMTrace.i(5074772295680L, 37810);
    w.i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
    finish();
    GMTrace.o(5074772295680L, 37810);
  }
  
  public final void f(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5074503860224L, 37808);
    w.i("MicroMsg.CardConsumeCodeUI", "onDataChange");
    if ((paramb != null) && (paramb.ajz() != null) && (paramb.ajz().equals(this.jwZ.ajz())))
    {
      this.jwZ = paramb;
      this.jBO.jwZ = this.jwZ;
      this.jBO.akN();
    }
    GMTrace.o(5074503860224L, 37808);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5073564336128L, 37801);
    int i = R.i.cqO;
    GMTrace.o(5073564336128L, 37801);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5075443384320L, 37815);
    if ((paramView.getId() == R.h.blh) || (paramView.getId() == R.h.blc))
    {
      if (!this.jwZ.ajo()) {
        break label80;
      }
      paramView = new i.b();
      com.tencent.mm.plugin.card.b.b.a(this, paramView.jxv, paramView.jxw, false, this.jwZ);
    }
    for (;;)
    {
      finish();
      GMTrace.o(5075443384320L, 37815);
      return;
      label80:
      Object localObject = this.jwZ.ajv().uam;
      if ((!com.tencent.mm.plugin.card.b.b.a(this.jwZ.ajz(), (np)localObject, this.jBM, this.jBN)) && (localObject != null) && (!TextUtils.isEmpty(((np)localObject).url)))
      {
        com.tencent.mm.plugin.card.b.b.a(this, com.tencent.mm.plugin.card.b.l.r(((np)localObject).url, ((np)localObject).uaJ), 1);
        g.ork.i(11941, new Object[] { Integer.valueOf(9), this.jwZ.ajz(), this.jwZ.ajA(), "", ((np)localObject).title });
        if (com.tencent.mm.plugin.card.b.l.a((np)localObject, this.jwZ.ajz()))
        {
          paramView = this.jwZ.ajz();
          localObject = ((np)localObject).title;
          com.tencent.mm.plugin.card.b.l.uJ(paramView);
          com.tencent.mm.plugin.card.b.b.a(this, this.jwZ.ajv().jyT);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5073698553856L, 37802);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CardConsumeCodeUI", "onCreate()");
    setResult(0);
    this.jwZ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    this.jtE = getIntent().getIntExtra("key_from_scene", 3);
    this.jBM = getIntent().getIntExtra("key_previous_scene", 3);
    this.jBL = getIntent().getStringExtra("key_mark_user");
    this.jBN = getIntent().getIntExtra("key_from_appbrand_type", 0);
    if ((this.jwZ == null) || (this.jwZ.ajv() == null) || (this.jwZ.ajw() == null))
    {
      w.e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
      GMTrace.o(5073698553856L, 37802);
      return;
    }
    MP();
    al.akt().m("", "", 3);
    GMTrace.o(5073698553856L, 37802);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5074235424768L, 37806);
    a locala = this.jBO;
    locala.Y(locala.jBI);
    com.tencent.mm.plugin.card.b.l.u(locala.hwc);
    com.tencent.mm.plugin.card.b.l.u(locala.jBA);
    locala.jBH = null;
    locala.iPC = null;
    al.aky().c(this);
    al.aky().b(this);
    if (this.jwZ.ajp())
    {
      al.akA().b(this);
      al.akA().ajM();
    }
    this.jsv.cancel();
    super.onDestroy();
    GMTrace.o(5074235424768L, 37806);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5074369642496L, 37807);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
      setResult(-1);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5074369642496L, 37807);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(5074101207040L, 37805);
    al.aky().a(this, false);
    super.onPause();
    GMTrace.o(5074101207040L, 37805);
  }
  
  protected void onResume()
  {
    GMTrace.i(5073966989312L, 37804);
    this.jBO.akN();
    al.aky().a(this, true);
    super.onResume();
    GMTrace.o(5073966989312L, 37804);
  }
  
  public final void onSuccess()
  {
    GMTrace.i(5075309166592L, 37814);
    this.jBO.akN();
    GMTrace.o(5075309166592L, 37814);
  }
  
  public final void tJ(String paramString)
  {
    GMTrace.i(5075174948864L, 37813);
    com.tencent.mm.plugin.card.b.d.a(this, paramString, true);
    GMTrace.o(5075174948864L, 37813);
  }
  
  public final void tM(String paramString)
  {
    GMTrace.i(5074906513408L, 37811);
    w.i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
    if (this.jBZ)
    {
      w.e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
      GMTrace.o(5074906513408L, 37811);
      return;
    }
    w.i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
    this.jBZ = true;
    Intent localIntent = new Intent(this, CardConsumeSuccessUI.class);
    localIntent.putExtra("KEY_CARD_ID", this.jwZ.ajz());
    localIntent.putExtra("KEY_CARD_CONSUMED_JSON", paramString);
    localIntent.putExtra("KEY_CARD_COLOR", this.jwZ.ajv().gjg);
    localIntent.putExtra("key_stastic_scene", this.jtE);
    localIntent.putExtra("key_from_scene", 0);
    startActivity(localIntent);
    GMTrace.o(5074906513408L, 37811);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\CardConsumeCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */