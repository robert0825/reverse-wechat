package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.collect.reward.a.a;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.plugin.collect.reward.b.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ky;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class QrRewardSetMoneyUI
  extends QrRewardBaseUI
{
  private String desc;
  private String hLG;
  private TextView izE;
  private int jXF;
  private ImageView jXQ;
  private MMGridView jYB;
  private Button jYC;
  private MMEditText jYD;
  private TextView jYE;
  private TextView jYF;
  private SparseArray<WalletFormView> jYG;
  private List<Integer> jYH;
  private List<Integer> jYI;
  private boolean jYJ;
  private Runnable jYK;
  private TextWatcher jYL;
  
  public QrRewardSetMoneyUI()
  {
    GMTrace.i(19374194819072L, 144349);
    this.jYJ = false;
    this.jYK = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19378892439552L, 144384);
        QrRewardSetMoneyUI.a(QrRewardSetMoneyUI.this);
        GMTrace.o(19378892439552L, 144384);
      }
    };
    this.jYL = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(19354062159872L, 144199);
        if (paramAnonymousEditable.toString().startsWith(".")) {
          paramAnonymousEditable.insert(0, "0");
        }
        String str = paramAnonymousEditable.toString();
        int i = str.indexOf(".");
        int j = str.length();
        if ((i >= 0) && (j - i > 3)) {
          paramAnonymousEditable.delete(i + 3, j);
        }
        for (;;)
        {
          af.F(QrRewardSetMoneyUI.d(QrRewardSetMoneyUI.this));
          af.i(QrRewardSetMoneyUI.d(QrRewardSetMoneyUI.this), 50L);
          GMTrace.o(19354062159872L, 144199);
          return;
          if (i > 6) {
            paramAnonymousEditable.delete(6, i);
          } else if ((i == -1) && (j > 6)) {
            paramAnonymousEditable.delete(6, j);
          }
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19353793724416L, 144197);
        GMTrace.o(19353793724416L, 144197);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19353927942144L, 144198);
        GMTrace.o(19353927942144L, 144198);
      }
    };
    GMTrace.o(19374194819072L, 144349);
  }
  
  private boolean aoS()
  {
    GMTrace.i(19375000125440L, 144355);
    int i = 0;
    while (i < this.jYH.size())
    {
      if (!((Integer)this.jYH.get(i)).equals(this.jYI.get(i)))
      {
        w.i("MicroMsg.QrRewardSetMoneyUI", "modify money: %s, %s", new Object[] { this.jYH.get(i), this.jYI.get(i) });
        GMTrace.o(19375000125440L, 144355);
        return true;
      }
      i += 1;
    }
    GMTrace.o(19375000125440L, 144355);
    return false;
  }
  
  private void aoT()
  {
    GMTrace.i(19375134343168L, 144356);
    int i = 0;
    if (i < this.jYI.size())
    {
      WalletFormView localWalletFormView = (WalletFormView)LayoutInflater.from(this.vKB.vKW).inflate(a.g.sOk, null);
      localWalletFormView.a(this.jYL);
      int j = ((Integer)this.jYI.get(i)).intValue();
      int k = j / 100;
      double d = j / 100.0D;
      if (d > k) {
        localWalletFormView.setText(String.format("%.2f", new Object[] { Double.valueOf(d) }));
      }
      for (;;)
      {
        e(localWalletFormView, 2, false);
        this.jYG.put(i, localWalletFormView);
        i += 1;
        break;
        localWalletFormView.setText(String.format("%d", new Object[] { Integer.valueOf(k) }));
      }
    }
    GMTrace.o(19375134343168L, 144356);
  }
  
  protected final void MP()
  {
    GMTrace.i(19374463254528L, 144351);
    this.jYB = ((MMGridView)findViewById(a.f.sFm));
    this.jYC = ((Button)findViewById(a.f.sFl));
    this.jYE = ((TextView)findViewById(a.f.sFi));
    this.jXQ = ((ImageView)findViewById(a.f.sFj));
    this.jYD = ((MMEditText)findViewById(a.f.sFn));
    this.izE = ((TextView)findViewById(a.f.sFo));
    this.jYF = ((TextView)findViewById(a.f.sFk));
    String str = q.zG();
    Object localObject = str;
    if (bg.nm(str)) {
      localObject = q.zH();
    }
    this.izE.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this.vKB.vKW, (CharSequence)localObject));
    a.b.a(this.jXQ, q.zE(), 0.06F, false);
    localObject = new a((byte)0);
    this.jYB.setAdapter((ListAdapter)localObject);
    this.jYE.setText(getString(a.i.sXa, new Object[] { Math.round(this.jXF / 100.0F) }));
    if (this.jYJ)
    {
      this.jYC.setText(a.i.sWP);
      this.jYF.setVisibility(8);
    }
    this.jYC.setOnClickListener(new r()
    {
      public final void aoJ()
      {
        GMTrace.i(19374060601344L, 144348);
        if (!QrRewardSetMoneyUI.a(QrRewardSetMoneyUI.this)) {
          QrRewardSetMoneyUI.b(QrRewardSetMoneyUI.this);
        }
        for (;;)
        {
          g.ork.i(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
          GMTrace.o(19374060601344L, 144348);
          return;
          w.i("MicroMsg.QrRewardSetMoneyUI", "amt error!");
        }
      }
    });
    GMTrace.o(19374463254528L, 144351);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(19374865907712L, 144354);
    if ((paramk instanceof f))
    {
      paramString = (f)paramk;
      paramString.a(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19365873319936L, 144287);
          QrRewardSetMoneyUI.a(QrRewardSetMoneyUI.this, paramString.jXe.uaY);
          QrRewardSetMoneyUI.b(QrRewardSetMoneyUI.this, paramString.jXe.desc);
          paramAnonymousk = new Intent();
          paramAnonymousk.putExtra("key_desc", paramString.jXe.desc);
          paramAnonymousk.putExtra("key_photo_url", paramString.jXe.uaY);
          paramAnonymousk.putExtra("key_photo_aeskey", paramString.jXe.uaZ);
          paramAnonymousk.putExtra("key_photo_width", paramString.jXe.ube);
          paramAnonymousk.putExtra("key_icon_width", paramString.jXe.uba);
          paramAnonymousk.putExtra("key_return_from_first", QrRewardSetMoneyUI.c(QrRewardSetMoneyUI.this));
          QrRewardSetMoneyUI.this.setResult(-1, paramAnonymousk);
          QrRewardSetMoneyUI.this.finish();
          GMTrace.o(19365873319936L, 144287);
        }
      }).b(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19353525288960L, 144195);
          w.e("MicroMsg.QrRewardSetMoneyUI", "set code error: %s, %s", new Object[] { Integer.valueOf(paramString.jXe.jWs), paramString.jXe.jWt });
          if (!bg.nm(paramString.jXe.jWt))
          {
            Toast.makeText(QrRewardSetMoneyUI.this, paramString.jXe.jWt, 1).show();
            GMTrace.o(19353525288960L, 144195);
            return;
          }
          Toast.makeText(QrRewardSetMoneyUI.this, a.i.sWZ, 1).show();
          GMTrace.o(19353525288960L, 144195);
        }
      }).c(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19373255294976L, 144342);
          w.e("MicroMsg.QrRewardSetMoneyUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(19373255294976L, 144342);
        }
      });
    }
    GMTrace.o(19374865907712L, 144354);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19374597472256L, 144352);
    int i = a.g.sOl;
    GMTrace.o(19374597472256L, 144352);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19374329036800L, 144350);
    super.onCreate(paramBundle);
    oM(a.i.sXb);
    hN(1562);
    paramBundle = bg.eU((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzF, ""), ",");
    this.jYH = new ArrayList();
    if (paramBundle.isEmpty())
    {
      w.i("MicroMsg.QrRewardSetMoneyUI", "use client hardcode amt list");
      this.jYH = Arrays.asList(b.jXk);
    }
    for (;;)
    {
      this.jYI = new ArrayList(this.jYH);
      this.jXF = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzE, Integer.valueOf(20000))).intValue();
      this.jYJ = getIntent().getBooleanExtra("key_first_flag", false);
      this.jYG = new SparseArray();
      aoT();
      MP();
      GMTrace.o(19374329036800L, 144350);
      return;
      paramBundle = paramBundle.iterator();
      while (paramBundle.hasNext())
      {
        String str = (String)paramBundle.next();
        this.jYH.add(Integer.valueOf(bg.getInt(str, 0)));
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(19374731689984L, 144353);
    super.onDestroy();
    hO(1562);
    af.F(this.jYK);
    GMTrace.o(19374731689984L, 144353);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(19363860054016L, 144272);
      GMTrace.o(19363860054016L, 144272);
    }
    
    public final int getCount()
    {
      GMTrace.i(19363994271744L, 144273);
      int i = QrRewardSetMoneyUI.e(QrRewardSetMoneyUI.this).size();
      GMTrace.o(19363994271744L, 144273);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(19364128489472L, 144274);
      Object localObject = QrRewardSetMoneyUI.e(QrRewardSetMoneyUI.this).get(paramInt);
      GMTrace.o(19364128489472L, 144274);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(19364262707200L, 144275);
      long l = paramInt;
      GMTrace.o(19364262707200L, 144275);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(19364396924928L, 144276);
      if (paramView == null) {
        paramView = (View)QrRewardSetMoneyUI.f(QrRewardSetMoneyUI.this).get(paramInt);
      }
      for (;;)
      {
        GMTrace.o(19364396924928L, 144276);
        return paramView;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\ui\QrRewardSetMoneyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */