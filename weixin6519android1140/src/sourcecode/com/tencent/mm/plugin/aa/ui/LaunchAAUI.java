package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.aa.a.c.e;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.protocal.c.j;
import com.tencent.mm.protocal.c.y;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LaunchAAUI
  extends BaseAAPresenterActivity
{
  private String chatroomName;
  private TextView hqk;
  private Dialog hqr;
  private e hrN;
  private boolean hrO;
  private MMEditText hrP;
  private TextView hrQ;
  private TextView hrR;
  private TextView hrS;
  private TextView hrT;
  private WalletFormView hrU;
  private TextView hrV;
  private TextView hrW;
  private ViewGroup hrX;
  private ViewGroup hrY;
  private List<String> hrZ;
  private boolean hrx;
  private ViewGroup hsa;
  private ViewGroup hsb;
  private TextView hsc;
  private ViewGroup hsd;
  private Map<String, Double> hse;
  private Map<String, LaunchAAByPersonNameAmountRow> hsf;
  private Button hsg;
  private TextView hsh;
  private TextView hsi;
  private com.tencent.mm.plugin.aa.a.d hsj;
  private int hsk;
  private int hsl;
  private boolean hsm;
  private int mode;
  private long timestamp;
  
  public LaunchAAUI()
  {
    GMTrace.i(5646539816960L, 42070);
    this.hrN = ((e)m(e.class));
    this.mode = com.tencent.mm.plugin.aa.a.a.hnX;
    this.chatroomName = null;
    this.hrO = false;
    this.hrx = false;
    this.hrZ = new ArrayList();
    this.hse = new HashMap();
    this.hsf = new HashMap();
    this.hsj = new com.tencent.mm.plugin.aa.a.d();
    this.hsk = 0;
    this.hsl = 0;
    this.hsm = false;
    this.timestamp = 0L;
    GMTrace.o(5646539816960L, 42070);
  }
  
  private void Qk()
  {
    GMTrace.i(5646942470144L, 42073);
    String str1;
    String str2;
    SpannableStringBuilder localSpannableStringBuilder;
    if (this.mode == com.tencent.mm.plugin.aa.a.a.hnX)
    {
      str1 = getString(a.i.sTG);
      str2 = getString(a.i.sTH);
      localSpannableStringBuilder = new SpannableStringBuilder("");
      localSpannableStringBuilder.append(str1);
      localSpannableStringBuilder.append(str2);
      localSpannableStringBuilder.setSpan(new a(new a.a()
      {
        public final void PT()
        {
          GMTrace.i(5644526551040L, 42055);
          LaunchAAUI.e(LaunchAAUI.this);
          GMTrace.o(5644526551040L, 42055);
        }
      }), str1.length(), localSpannableStringBuilder.length(), 18);
      this.hrS.setText(localSpannableStringBuilder);
      GMTrace.o(5646942470144L, 42073);
      return;
    }
    if (this.mode == com.tencent.mm.plugin.aa.a.a.hnY)
    {
      str1 = getString(a.i.sTN);
      str2 = getString(a.i.sTO);
      localSpannableStringBuilder = new SpannableStringBuilder("");
      localSpannableStringBuilder.append(str1);
      localSpannableStringBuilder.append(str2);
      localSpannableStringBuilder.setSpan(new a(new a.a()
      {
        public final void PT()
        {
          GMTrace.i(5620770013184L, 41878);
          LaunchAAUI.e(LaunchAAUI.this);
          GMTrace.o(5620770013184L, 41878);
        }
      }), str1.length(), localSpannableStringBuilder.length(), 18);
      this.hrS.setText(localSpannableStringBuilder);
    }
    GMTrace.o(5646942470144L, 42073);
  }
  
  private void Ql()
  {
    GMTrace.i(5647210905600L, 42075);
    this.hsm = false;
    if (this.hsh.getVisibility() != 8)
    {
      this.hsh.startAnimation(AnimationUtils.loadAnimation(this, com.tencent.mm.plugin.wxpay.a.a.slK));
      this.hsh.setVisibility(8);
    }
    GMTrace.o(5647210905600L, 42075);
  }
  
  private void Qm()
  {
    GMTrace.i(5647345123328L, 42076);
    if (this.mode == com.tencent.mm.plugin.aa.a.a.hnX)
    {
      if (bg.nm(this.hrU.getText()))
      {
        bP(false);
        GMTrace.o(5647345123328L, 42076);
        return;
      }
      if (this.hrx)
      {
        bP(false);
        GMTrace.o(5647345123328L, 42076);
        return;
      }
      if ((this.hrZ == null) || (this.hrZ.size() == 0))
      {
        bP(false);
        GMTrace.o(5647345123328L, 42076);
        return;
      }
      if ((this.hrZ.size() > com.tencent.mm.plugin.aa.a.d.PL()) || (this.hrO))
      {
        bP(false);
        GMTrace.o(5647345123328L, 42076);
        return;
      }
      double d = com.tencent.mm.plugin.aa.a.h.b(this.hrU.getText(), this.hrZ.size(), 5, 4);
      w.d("MicroMsg.LaunchAAUI", "b1: %s, b2: %s, avg: %s", new Object[] { this.hrU.getText(), Integer.valueOf(this.hrZ.size()), Double.valueOf(d) });
      if (d < 0.01D)
      {
        w.i("MicroMsg.LaunchAAUI", "less than 0.01");
        bP(false);
        GMTrace.o(5647345123328L, 42076);
      }
    }
    else
    {
      if ((this.hse == null) || (this.hse.size() == 0))
      {
        bP(false);
        GMTrace.o(5647345123328L, 42076);
        return;
      }
      if ((this.hse.size() > com.tencent.mm.plugin.aa.a.d.PL()) || (this.hrO))
      {
        bP(false);
        GMTrace.o(5647345123328L, 42076);
        return;
      }
    }
    bP(true);
    GMTrace.o(5647345123328L, 42076);
  }
  
  private void Qn()
  {
    GMTrace.i(5647613558784L, 42078);
    if (this.mode == com.tencent.mm.plugin.aa.a.a.hnX)
    {
      if ((this.hrZ != null) && (this.hrZ.size() > 0))
      {
        d = com.tencent.mm.plugin.aa.a.h.b(this.hrU.getText(), this.hrZ.size(), 2, 2);
        this.hqk.setText(getString(a.i.sRb, new Object[] { Double.valueOf(d) }));
      }
      for (;;)
      {
        this.hrQ.setText(a.i.sTI);
        GMTrace.o(5647613558784L, 42078);
        return;
        this.hqk.setText(getString(a.i.sRd));
      }
    }
    if ((this.hse == null) || (this.hse.size() == 0))
    {
      this.hrQ.setText(getString(a.i.sTP, new Object[] { Integer.valueOf(0) }));
      this.hqk.setText(getString(a.i.sRd));
      GMTrace.o(5647613558784L, 42078);
      return;
    }
    Iterator localIterator = this.hse.values().iterator();
    for (double d = 0.0D; localIterator.hasNext(); d = ((Double)localIterator.next()).doubleValue() + d) {}
    this.hqk.setText(getString(a.i.sRb, new Object[] { Double.valueOf(d) }));
    this.hrQ.setText(getString(a.i.sTP, new Object[] { Integer.valueOf(this.hse.size()) }));
    GMTrace.o(5647613558784L, 42078);
  }
  
  private void Qo()
  {
    GMTrace.i(5647747776512L, 42079);
    com.tencent.mm.plugin.report.service.g.ork.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
    HashMap localHashMap = new HashMap();
    for (;;)
    {
      try
      {
        String str1 = this.hrP.getText().toString();
        if (bg.nm(str1))
        {
          str1 = getString(a.i.sTS);
          ArrayList localArrayList1 = new ArrayList();
          ArrayList localArrayList2 = new ArrayList();
          Object localObject = this.hse.keySet().iterator();
          long l1 = 0L;
          if (((Iterator)localObject).hasNext())
          {
            String str2 = (String)((Iterator)localObject).next();
            double d = ((Double)this.hse.get(str2)).doubleValue();
            j localj = new j();
            localj.eYB = ((d * 100.0D));
            localj.username = str2;
            localArrayList1.add(localj);
            long l2 = localj.eYB;
            localArrayList2.add(localj.eYB);
            l1 = l2 + l1;
          }
          else
          {
            localObject = new j();
            ((j)localObject).username = q.zE();
            ((j)localObject).eYB = l1;
            localHashMap.put(com.tencent.mm.plugin.aa.a.k.hoS, str1);
            localHashMap.put(com.tencent.mm.plugin.aa.a.k.hoT, Long.valueOf(l1));
            localHashMap.put(com.tencent.mm.plugin.aa.a.k.hoY, localArrayList1);
            localHashMap.put(com.tencent.mm.plugin.aa.a.k.hoW, this.chatroomName);
            localHashMap.put(com.tencent.mm.plugin.aa.a.k.hoZ, Long.valueOf(this.timestamp));
            if (this.hqr != null) {
              this.hqr.dismiss();
            }
            this.hqr = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
            localObject = this.hrN.hpN;
            com.tencent.mm.vending.g.g.bY(localHashMap).a((com.tencent.mm.vending.c.a)localObject).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
            {
              public final void aH(Object paramAnonymousObject)
              {
                GMTrace.i(15036546285568L, 112031);
                w.i("MicroMsg.LaunchAAUI", "onInterrupt: %s", new Object[] { paramAnonymousObject });
                if (LaunchAAUI.k(LaunchAAUI.this) != null) {
                  LaunchAAUI.k(LaunchAAUI.this).dismiss();
                }
                if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof String)) && (!paramAnonymousObject.toString().equalsIgnoreCase("ok"))) {
                  Toast.makeText(LaunchAAUI.this, paramAnonymousObject.toString(), 1).show();
                }
                for (;;)
                {
                  com.tencent.mm.plugin.report.service.g.ork.i(13722, new Object[] { Integer.valueOf(10) });
                  GMTrace.o(15036546285568L, 112031);
                  return;
                  if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof y))) {
                    com.tencent.mm.plugin.aa.a.h.a(LaunchAAUI.this.vKB.vKW, (y)paramAnonymousObject);
                  } else {
                    Toast.makeText(LaunchAAUI.this, a.i.sTT, 1).show();
                  }
                }
              }
            });
            com.tencent.mm.plugin.report.service.g.ork.i(13723, new Object[] { Integer.valueOf(2), Integer.valueOf(com.tencent.mm.plugin.aa.a.h.ns(this.chatroomName).size()), Integer.valueOf(localArrayList1.size() + 1), Long.valueOf(l1), str1, bg.c(localArrayList2, ",") });
            GMTrace.o(5647747776512L, 42079);
            return;
          }
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.LaunchAAUI", "launchAAByPerson error: %s", new Object[] { localException.getMessage() });
        GMTrace.o(5647747776512L, 42079);
        return;
      }
    }
  }
  
  private void Qp()
  {
    GMTrace.i(5648284647424L, 42083);
    if ((this.hrO) && (!this.hsm))
    {
      if (this.mode == com.tencent.mm.plugin.aa.a.a.hnX)
      {
        nx(getString(a.i.sTM, new Object[] { Integer.valueOf(com.tencent.mm.plugin.aa.a.d.PL()) }));
        GMTrace.o(5648284647424L, 42083);
        return;
      }
      nx(getString(a.i.sTM, new Object[] { Integer.valueOf(com.tencent.mm.plugin.aa.a.d.PK()) }));
      GMTrace.o(5648284647424L, 42083);
      return;
    }
    if ((this.hrx) && (!this.hsm))
    {
      nx(getString(a.i.sTU, new Object[] { Float.valueOf((float)com.tencent.mm.plugin.aa.a.d.PM() / 100.0F) }));
      GMTrace.o(5648284647424L, 42083);
      return;
    }
    if ((!this.hrO) && (!this.hrx)) {
      Ql();
    }
    GMTrace.o(5648284647424L, 42083);
  }
  
  private void bP(boolean paramBoolean)
  {
    GMTrace.i(5647479341056L, 42077);
    this.hsg.setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      this.hrQ.setTextColor(getResources().getColor(a.c.slY));
      this.hqk.setTextColor(getResources().getColor(a.c.slY));
      this.hrR.setTextColor(getResources().getColor(a.c.slY));
      GMTrace.o(5647479341056L, 42077);
      return;
    }
    this.hrQ.setTextColor(getResources().getColor(a.c.black));
    this.hqk.setTextColor(getResources().getColor(a.c.black));
    this.hrR.setTextColor(getResources().getColor(a.c.black));
    GMTrace.o(5647479341056L, 42077);
  }
  
  private void nx(String paramString)
  {
    GMTrace.i(5647076687872L, 42074);
    this.hsm = true;
    this.hsh.setVisibility(0);
    this.hsh.startAnimation(AnimationUtils.loadAnimation(this, com.tencent.mm.plugin.wxpay.a.a.slJ));
    this.hsh.setText(paramString);
    GMTrace.o(5647076687872L, 42074);
  }
  
  protected final int Qf()
  {
    GMTrace.i(5647881994240L, 42080);
    GMTrace.o(5647881994240L, 42080);
    return 1;
  }
  
  protected final boolean Qj()
  {
    GMTrace.i(5646808252416L, 42072);
    GMTrace.o(5646808252416L, 42072);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5648016211968L, 42081);
    int i = a.g.sME;
    GMTrace.o(5648016211968L, 42081);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5648418865152L, 42084);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    label208:
    double d;
    label305:
    label359:
    label367:
    Object localObject;
    if (paramInt1 == 233)
    {
      if (paramInt2 == -1)
      {
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        if (this.mode == com.tencent.mm.plugin.aa.a.a.hnX)
        {
          if (!bg.nm(paramIntent))
          {
            paramIntent = paramIntent.split(",");
            this.hrZ.clear();
            this.hrZ.addAll(Arrays.asList(paramIntent));
          }
          paramIntent = com.tencent.mm.plugin.aa.a.h.ns(this.chatroomName);
          if ((paramIntent == null) || (this.hrZ == null) || (this.hrZ.size() != paramIntent.size()) || (!s.eb(this.chatroomName))) {
            break label305;
          }
          paramIntent = this.hrW;
          paramInt2 = a.i.sTF;
          if (this.hrZ != null)
          {
            paramInt1 = this.hrZ.size();
            paramIntent.setText(getString(paramInt2, new Object[] { Integer.valueOf(paramInt1) }));
          }
        }
        else
        {
          Ql();
          if ((this.hrZ == null) || (this.hrZ.size() <= com.tencent.mm.plugin.aa.a.d.PL())) {
            break label359;
          }
          this.hrO = true;
          d = bg.getDouble(this.hrU.getText(), 0.0D);
          if ((this.hrZ == null) || (d * 100.0D / this.hrZ.size() <= com.tencent.mm.plugin.aa.a.d.PM())) {
            break label367;
          }
          this.hrx = true;
          com.tencent.mm.plugin.report.service.g.ork.i(13722, new Object[] { Integer.valueOf(2) });
        }
        for (;;)
        {
          Qm();
          Qn();
          Qp();
          GMTrace.o(5648418865152L, 42084);
          return;
          paramInt1 = 0;
          break;
          paramIntent = this.hrW;
          paramInt2 = a.i.sTJ;
          if (this.hrZ != null) {}
          for (paramInt1 = this.hrZ.size();; paramInt1 = 0)
          {
            paramIntent.setText(getString(paramInt2, new Object[] { Integer.valueOf(paramInt1) }));
            break;
          }
          this.hrO = false;
          break label208;
          this.hrx = false;
        }
      }
    }
    else if ((paramInt1 == 236) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("selectUI");
      this.hse.clear();
      if (paramIntent == null) {
        break label509;
      }
      try
      {
        if (paramIntent.size() <= 0) {
          break label509;
        }
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          localObject = ((String)paramIntent.next()).split(",");
          d = bg.getDouble(localObject[1], 0.0D);
          this.hse.put(localObject[0], Double.valueOf(d));
        }
        GMTrace.o(5648418865152L, 42084);
      }
      catch (Exception paramIntent)
      {
        w.e("MicroMsg.LaunchAAUI", "onActivityResult, SELECT_AMOUNT_SELECT_REQUEST_CODE error: %s", new Object[] { paramIntent.getMessage() });
      }
    }
    return;
    label509:
    if ((this.hse != null) && (this.hse.size() > 0))
    {
      this.hsc.setText(getString(a.i.sTR, new Object[] { Integer.valueOf(this.hse.size()) }));
      this.hsc.setTextColor(getResources().getColor(a.c.black));
      paramInt1 = (int)getResources().getDimension(a.d.sne);
      paramInt2 = (int)getResources().getDimension(a.d.snc);
      int i = (int)getResources().getDimension(a.d.snd);
      this.hsd.setPadding(paramInt1, paramInt2, paramInt1, i);
      this.hsd.setBackgroundResource(a.e.snV);
      this.hsb.setVisibility(0);
    }
    for (;;)
    {
      this.hsb.removeAllViews();
      this.hsf.clear();
      if ((this.hse == null) || (this.hse.size() <= 0)) {
        break;
      }
      paramIntent = this.hse.keySet().iterator();
      paramInt1 = 0;
      while (paramIntent.hasNext())
      {
        localObject = (String)paramIntent.next();
        d = ((Double)this.hse.get(localObject)).doubleValue();
        LaunchAAByPersonNameAmountRow localLaunchAAByPersonNameAmountRow = new LaunchAAByPersonNameAmountRow(this);
        if (paramInt1 >= this.hse.size() - 1) {
          localLaunchAAByPersonNameAmountRow.hrj.setVisibility(8);
        }
        String str = this.chatroomName;
        localLaunchAAByPersonNameAmountRow.hrh.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localLaunchAAByPersonNameAmountRow.getContext(), ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).F((String)localObject, str), localLaunchAAByPersonNameAmountRow.hrh.getTextSize()));
        localLaunchAAByPersonNameAmountRow.hqk.setText(localLaunchAAByPersonNameAmountRow.getContext().getString(a.i.sRb, new Object[] { Double.valueOf(d) }));
        this.hsb.addView(localLaunchAAByPersonNameAmountRow);
        this.hsf.put(localObject, localLaunchAAByPersonNameAmountRow);
        paramInt1 += 1;
      }
      this.hsc.setText(a.i.sTQ);
      this.hsc.setTextColor(getResources().getColor(a.c.slX));
      paramInt1 = (int)getResources().getDimension(a.d.sne);
      this.hsd.setPadding(paramInt1, paramInt1, paramInt1, paramInt1);
      this.hsd.setBackgroundResource(a.e.snW);
      this.hsb.setVisibility(8);
    }
    if (this.hqY != null) {
      this.hqY.requestLayout();
    }
    this.hsl = 0;
    this.hrT.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15036814721024L, 112033);
        GMTrace.o(15036814721024L, 112033);
      }
    });
    Qn();
    Qm();
    GMTrace.o(5648418865152L, 42084);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(5646674034688L, 42071);
    super.onCreate(paramBundle);
    w.i("MicroMsg.LaunchAAUI", "LaunchAAUI onCreate");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5611106336768L, 41806);
        LaunchAAUI.this.finish();
        GMTrace.o(5611106336768L, 41806);
        return false;
      }
    });
    this.timestamp = (System.currentTimeMillis() / 1000L);
    oM(a.i.sTX);
    paramBundle = this.hrN.hpO;
    com.tencent.mm.vending.g.g.ckp().a(paramBundle).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
    {
      public final void aH(Object paramAnonymousObject)
      {
        GMTrace.i(5611911643136L, 41812);
        w.i("MicroMsg.LaunchAAUI", "fetch operation data failed");
        GMTrace.o(5611911643136L, 41812);
      }
    });
    this.chatroomName = getIntent().getStringExtra("chatroom_name");
    if (bg.nm(this.chatroomName))
    {
      w.e("MicroMsg.LaunchAAUI", "chatroomName is null!!!");
      this.chatroomName = "";
    }
    paramBundle = this.chatroomName;
    if (!bg.nm(paramBundle)) {
      if (s.eb(paramBundle))
      {
        this.chatroomName = paramBundle;
        this.hqY = findViewById(a.f.bZh);
        this.hqY.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(5636607705088L, 41996);
            LaunchAAUI.this.Qg();
            LaunchAAUI.this.aLo();
            GMTrace.o(5636607705088L, 41996);
            return false;
          }
        });
        this.hrS = ((TextView)findViewById(a.f.swI));
        this.hrS.setClickable(true);
        this.hrS.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
        Qk();
        this.hsg = ((Button)findViewById(a.f.swB));
        this.hsg.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5620501577728L, 41876);
            LaunchAAUI.a(LaunchAAUI.this);
            GMTrace.o(5620501577728L, 41876);
          }
        });
        this.hsh = ((TextView)findViewById(a.f.swy));
        this.hsi = ((TextView)findViewById(a.f.swM));
        this.hrP = ((MMEditText)findViewById(a.f.swJ));
        this.hrQ = ((TextView)findViewById(a.f.swL));
        this.hqk = ((TextView)findViewById(a.f.swz));
        this.hrR = ((TextView)findViewById(a.f.swA));
        this.hrQ.setText(a.i.sTI);
        this.mode = com.tencent.mm.plugin.aa.a.a.hnX;
        this.hrT = ((TextView)findViewById(a.f.spm));
        this.hrT.setClickable(true);
        this.hrT.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
        paramBundle = new SpannableString(getString(a.i.sSm));
        paramBundle.setSpan(new a(new a.a()
        {
          public final void PT()
          {
            GMTrace.i(5621306884096L, 41882);
            Intent localIntent = new Intent(LaunchAAUI.this, AAQueryListUI.class);
            LaunchAAUI.this.startActivity(localIntent);
            if (LaunchAAUI.b(LaunchAAUI.this) == com.tencent.mm.plugin.aa.a.a.hnX)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(13721, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
              GMTrace.o(5621306884096L, 41882);
              return;
            }
            com.tencent.mm.plugin.report.service.g.ork.i(13721, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
            GMTrace.o(5621306884096L, 41882);
          }
        }), 0, paramBundle.length(), 18);
        this.hrT.setText(paramBundle);
        this.hrT.setVisibility(8);
        this.hrP.addTextChangedListener(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(5626138722304L, 41918);
            LaunchAAUI.c(LaunchAAUI.this);
            GMTrace.o(5626138722304L, 41918);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(5625870286848L, 41916);
            GMTrace.o(5625870286848L, 41916);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(5626004504576L, 41917);
            GMTrace.o(5626004504576L, 41917);
          }
        });
        this.hrU = ((WalletFormView)findViewById(a.f.swK));
        this.hrU.a(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(5638486753280L, 42010);
            if (paramAnonymousEditable.toString().startsWith(".")) {
              paramAnonymousEditable.insert(0, "0");
            }
            String str = paramAnonymousEditable.toString();
            int i = str.indexOf(".");
            int j = str.length();
            if ((i >= 0) && (j - i > 3))
            {
              paramAnonymousEditable.delete(i + 3, j);
              double d = bg.getDouble(paramAnonymousEditable.toString(), 0.0D);
              if ((LaunchAAUI.f(LaunchAAUI.this) == null) || (LaunchAAUI.f(LaunchAAUI.this).size() <= 0)) {
                break label257;
              }
              d = d * 100.0D / LaunchAAUI.f(LaunchAAUI.this).size();
              LaunchAAUI.d(LaunchAAUI.this);
              if (d <= com.tencent.mm.plugin.aa.a.d.PM()) {
                break label257;
              }
              LaunchAAUI.a(LaunchAAUI.this, true);
              com.tencent.mm.plugin.report.service.g.ork.i(13722, new Object[] { Integer.valueOf(2) });
            }
            for (;;)
            {
              LaunchAAUI.c(LaunchAAUI.this);
              LaunchAAUI.g(LaunchAAUI.this);
              LaunchAAUI.h(LaunchAAUI.this);
              GMTrace.o(5638486753280L, 42010);
              return;
              if (i > 6)
              {
                paramAnonymousEditable.delete(6, i);
                break;
              }
              if ((i != -1) || (j <= 6)) {
                break;
              }
              paramAnonymousEditable.delete(6, j);
              break;
              label257:
              LaunchAAUI.a(LaunchAAUI.this, false);
            }
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(5638218317824L, 42008);
            GMTrace.o(5638218317824L, 42008);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(5638352535552L, 42009);
            GMTrace.o(5638352535552L, 42009);
          }
        });
        a(this.hrU, 2, false, false);
        this.hrW = ((TextView)findViewById(a.f.swC));
        this.hrV = ((TextView)findViewById(a.f.swD));
        if (!s.eb(this.chatroomName)) {
          break label866;
        }
        paramBundle = com.tencent.mm.plugin.aa.a.h.ns(this.chatroomName);
        label552:
        this.hrZ = paramBundle;
        if (this.hrZ.size() <= com.tencent.mm.plugin.aa.a.d.PL()) {
          break label918;
        }
        this.hrZ.clear();
        this.hrW.setText(getString(a.i.sWB));
        Qm();
      }
    }
    for (;;)
    {
      this.hrW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5626675593216L, 41922);
          LaunchAAUI.this.Qg();
          LaunchAAUI.this.aLo();
          LaunchAAUI.a(LaunchAAUI.this, paramBundle);
          GMTrace.o(5626675593216L, 41922);
        }
      });
      this.hrX = ((ViewGroup)findViewById(a.f.swP));
      this.hrY = ((ViewGroup)findViewById(a.f.swO));
      this.hrU.requestFocus();
      this.hrO = false;
      this.hsc = ((TextView)findViewById(a.f.swH));
      this.hsc.setText(a.i.sTQ);
      this.hsc.setTextColor(getResources().getColor(a.c.slX));
      this.hsa = ((ViewGroup)findViewById(a.f.swQ));
      this.hsb = ((ViewGroup)findViewById(a.f.swR));
      this.hsd = ((ViewGroup)findViewById(a.f.swG));
      this.hsd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5645600292864L, 42063);
          LaunchAAUI.i(LaunchAAUI.this);
          GMTrace.o(5645600292864L, 42063);
        }
      });
      bP(false);
      com.tencent.mm.plugin.report.service.g.ork.i(13721, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
      this.hrT.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5639292059648L, 42016);
          GMTrace.o(5639292059648L, 42016);
        }
      });
      GMTrace.o(5646674034688L, 42071);
      return;
      paramBundle = bg.g(paramBundle.split(","));
      if (paramBundle != null)
      {
        paramBundle.remove(q.zE());
        if (paramBundle.size() > 0)
        {
          paramBundle = (String)paramBundle.get(0);
          break;
        }
      }
      paramBundle = "";
      break;
      label866:
      w.i("MicroMsg.LaunchAAUI", "is single chat: %s", new Object[] { this.chatroomName });
      paramBundle = new ArrayList();
      paramBundle.add(q.zE());
      paramBundle.add(this.chatroomName);
      break label552;
      label918:
      if (s.eb(this.chatroomName)) {
        this.hrW.setText(getString(a.i.sTF, new Object[] { Integer.valueOf(paramBundle.size()) }));
      } else {
        this.hrW.setText(getString(a.i.sTJ, new Object[] { Integer.valueOf(paramBundle.size()) }));
      }
    }
  }
  
  protected void onStop()
  {
    GMTrace.i(5648150429696L, 42082);
    super.onStop();
    if (this.hsf != null) {
      this.hsf.clear();
    }
    GMTrace.o(5648150429696L, 42082);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\LaunchAAUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */