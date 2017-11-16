package com.tencent.mm.plugin.card.ui;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.a.m;
import com.tencent.mm.plugin.card.a.m.a;
import com.tencent.mm.plugin.card.b.d.7;
import com.tencent.mm.plugin.card.b.d.8;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class CardShopUI
  extends MMActivity
  implements m.a
{
  private ListView Ev;
  private View.OnClickListener hwh;
  BroadcastReceiver idj;
  private boolean jCV;
  private ProgressDialog jIU;
  private String jIV;
  private a jIW;
  private LinearLayout jIX;
  private View jIY;
  private TextView jIZ;
  private String jwL;
  private com.tencent.mm.plugin.card.base.b jwZ;
  private ArrayList<jp> jxf;
  
  public CardShopUI()
  {
    GMTrace.i(5019608809472L, 37399);
    this.jxf = new ArrayList();
    this.jIV = "";
    this.jCV = false;
    this.idj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(5000549892096L, 37257);
        paramAnonymousContext = paramAnonymousIntent.getAction();
        if ((paramAnonymousContext != null) && (paramAnonymousContext.equals("android.intent.action.LOCALE_CHANGED")) && (CardShopUI.amc())) {
          CardShopUI.e(CardShopUI.this);
        }
        GMTrace.o(5000549892096L, 37257);
      }
    };
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5029406703616L, 37472);
        if (paramAnonymousView.getId() == R.h.ceH)
        {
          paramAnonymousView = (jp)paramAnonymousView.getTag();
          if (paramAnonymousView != null)
          {
            com.tencent.mm.plugin.card.b.b.a(CardShopUI.this, paramAnonymousView.eMl, paramAnonymousView.eNR, paramAnonymousView.gEy);
            g.ork.i(11941, new Object[] { Integer.valueOf(5), CardShopUI.c(CardShopUI.this).ajz(), CardShopUI.c(CardShopUI.this).ajA(), "", paramAnonymousView.name });
          }
        }
        GMTrace.o(5029406703616L, 37472);
      }
    };
    GMTrace.o(5019608809472L, 37399);
  }
  
  private void alZ()
  {
    GMTrace.i(5020414115840L, 37405);
    w.i("MicroMsg.CardShopUI", "openLocation");
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.LOCALE_CHANGED");
    registerReceiver(this.idj, localIntentFilter);
    if (ama())
    {
      amb();
      GMTrace.o(5020414115840L, 37405);
      return;
    }
    h.a(this, getString(R.l.dfb, new Object[] { getString(R.l.dcc) }), getString(R.l.cUG), new d.7(this), new d.8());
    GMTrace.o(5020414115840L, 37405);
  }
  
  private static boolean ama()
  {
    GMTrace.i(5020548333568L, 37406);
    if ((!l.Is()) && (!l.It())) {}
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(5020548333568L, 37406);
      return true;
    }
    GMTrace.o(5020548333568L, 37406);
    return false;
  }
  
  private void amb()
  {
    GMTrace.i(5020682551296L, 37407);
    if (al.akq().a(this.jIV, this.jwL, this))
    {
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.jIU = h.a(localActionBarActivity, getString(R.l.dcD), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4937333342208L, 36786);
          paramAnonymousDialogInterface = al.akq();
          paramAnonymousDialogInterface.a(CardShopUI.d(CardShopUI.this), CardShopUI.this);
          if (paramAnonymousDialogInterface.jxC != null) {
            at.wS().c(paramAnonymousDialogInterface.jxC);
          }
          GMTrace.o(4937333342208L, 36786);
        }
      });
      GMTrace.o(5020682551296L, 37407);
      return;
    }
    h.bm(this, getString(R.l.dcC));
    GMTrace.o(5020682551296L, 37407);
  }
  
  protected final void MP()
  {
    GMTrace.i(5019877244928L, 37401);
    if (!TextUtils.isEmpty(this.jwZ.ajv().ual)) {
      sq(this.jwZ.ajv().ual);
    }
    for (;;)
    {
      this.Ev = ((ListView)findViewById(R.h.blz));
      this.jIX = ((LinearLayout)View.inflate(getBaseContext(), R.i.crj, null));
      this.Ev.addHeaderView(this.jIX);
      this.jIW = new a((byte)0);
      this.Ev.setAdapter(this.jIW);
      final Intent localIntent = getIntent();
      this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(4999744585728L, 37251);
          if (paramAnonymousInt == 0)
          {
            w.v("MicroMsg.CardShopUI", "onItemClick pos is 0, click headerview");
            GMTrace.o(4999744585728L, 37251);
            return;
          }
          int i = paramAnonymousInt;
          if (paramAnonymousInt > 0) {
            i = paramAnonymousInt - 1;
          }
          paramAnonymousAdapterView = (jp)CardShopUI.a(CardShopUI.this).get(i);
          if ((!TextUtils.isEmpty(paramAnonymousAdapterView.tZx)) && (!TextUtils.isEmpty(paramAnonymousAdapterView.tZy)))
          {
            paramAnonymousInt = localIntent.getIntExtra("key_from_appbrand_type", 0);
            com.tencent.mm.plugin.card.b.b.c(CardShopUI.b(CardShopUI.this), paramAnonymousAdapterView.tZx, paramAnonymousAdapterView.tZy, 1052, paramAnonymousInt);
            GMTrace.o(4999744585728L, 37251);
            return;
          }
          if (!TextUtils.isEmpty(paramAnonymousAdapterView.jzu))
          {
            com.tencent.mm.plugin.card.b.b.a(CardShopUI.this, paramAnonymousAdapterView.jzu, 1);
            g.ork.i(11941, new Object[] { Integer.valueOf(4), CardShopUI.c(CardShopUI.this).ajz(), CardShopUI.c(CardShopUI.this).ajA(), "", paramAnonymousAdapterView.name });
          }
          GMTrace.o(4999744585728L, 37251);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4957466001408L, 36936);
          CardShopUI.this.finish();
          GMTrace.o(4957466001408L, 36936);
          return true;
        }
      });
      this.jIY = View.inflate(this, R.i.cri, null);
      if (this.jIX != null) {
        this.jIX.addView(this.jIY);
      }
      this.jIZ = ((TextView)this.jIY.findViewById(R.h.bkG));
      this.jIZ.setText(R.l.ddQ);
      this.jIY.setVisibility(8);
      GMTrace.o(5019877244928L, 37401);
      return;
      oM(R.l.dcc);
    }
  }
  
  public final void a(boolean paramBoolean, ArrayList<jp> paramArrayList)
  {
    GMTrace.i(5020279898112L, 37404);
    if (this.jIU != null)
    {
      this.jIU.dismiss();
      this.jIU = null;
    }
    if (paramArrayList == null) {}
    for (int i = 0;; i = paramArrayList.size())
    {
      w.d("MicroMsg.CardShopUI", "onGotCardShop, isOk = %b, shop list size = %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i) });
      if (paramBoolean) {
        break;
      }
      w.e("MicroMsg.CardShopUI", "onGotCardShop fail");
      GMTrace.o(5020279898112L, 37404);
      return;
    }
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.e("MicroMsg.CardShopUI", "list == null || list.size() == 0");
      GMTrace.o(5020279898112L, 37404);
      return;
    }
    if (this.jxf != null)
    {
      this.jxf.clear();
      this.jxf.addAll(paramArrayList);
      this.jIY.setVisibility(0);
    }
    for (;;)
    {
      this.jIW.notifyDataSetChanged();
      GMTrace.o(5020279898112L, 37404);
      return;
      this.jIY.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5020145680384L, 37403);
    int i = R.i.crz;
    GMTrace.o(5020145680384L, 37403);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5019743027200L, 37400);
    super.onCreate(paramBundle);
    this.jwZ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    String str = getIntent().getStringExtra("KEY_CARD_TP_ID");
    paramBundle = getIntent().getStringExtra("KEY_CARD_ID");
    if (this.jwZ != null)
    {
      w.i("MicroMsg.CardShopUI", "onCreate  mCardInfo != null");
      this.jIV = this.jwZ.ajA();
      paramBundle = this.jwZ.ajz();
    }
    for (;;)
    {
      this.jwL = paramBundle;
      do
      {
        if (TextUtils.isEmpty(this.jIV))
        {
          w.e("MicroMsg.CardShopUI", "onCreate  mCardTpid == null");
          finish();
        }
        boolean bool = a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
        w.i("MicroMsg.CardShopUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        this.jCV = bool;
        if (this.jCV) {
          alZ();
        }
        MP();
        GMTrace.o(5019743027200L, 37400);
        return;
      } while (TextUtils.isEmpty(str));
      this.jIV = str;
      if (TextUtils.isEmpty(paramBundle)) {
        paramBundle = "";
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5020011462656L, 37402);
    if (this.jCV) {
      unregisterReceiver(this.idj);
    }
    al.akq().a(this.jIV, this);
    super.onDestroy();
    GMTrace.o(5020011462656L, 37402);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(5020816769024L, 37408);
    w.i("MicroMsg.CardShopUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5020816769024L, 37408);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        w.i("MicroMsg.CardShopUI", "onMPermissionGranted LocationPermissionGranted " + this.jCV);
        if (!this.jCV)
        {
          this.jCV = true;
          alZ();
        }
        GMTrace.o(5020816769024L, 37408);
        return;
      }
      h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4937870213120L, 36790);
          CardShopUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(4937870213120L, 36790);
        }
      }, null);
    }
  }
  
  final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(5005918601216L, 37297);
      GMTrace.o(5005918601216L, 37297);
    }
    
    private jp lT(int paramInt)
    {
      GMTrace.i(5006187036672L, 37299);
      jp localjp = (jp)CardShopUI.a(CardShopUI.this).get(paramInt);
      GMTrace.o(5006187036672L, 37299);
      return localjp;
    }
    
    public final int getCount()
    {
      GMTrace.i(5006052818944L, 37298);
      int i = CardShopUI.a(CardShopUI.this).size();
      GMTrace.o(5006052818944L, 37298);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5006321254400L, 37300);
      long l = paramInt;
      GMTrace.o(5006321254400L, 37300);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5006455472128L, 37301);
      if (paramView == null)
      {
        paramView = View.inflate(CardShopUI.this.vKB.vKW, R.i.cry, null);
        paramViewGroup = new a();
        paramViewGroup.jJb = ((TextView)paramView.findViewById(R.h.ceE));
        paramViewGroup.jJc = ((TextView)paramView.findViewById(R.h.ceD));
        paramViewGroup.jJd = ((TextView)paramView.findViewById(R.h.ceC));
        paramViewGroup.jJe = ((ImageView)paramView.findViewById(R.h.ceG));
        paramViewGroup.jJf = paramView.findViewById(R.h.ceH);
        paramView.setTag(paramViewGroup);
      }
      jp localjp;
      for (;;)
      {
        localjp = lT(paramInt);
        if (localjp != null) {
          break;
        }
        paramViewGroup.jJb.setText("");
        paramViewGroup.jJc.setText("");
        paramViewGroup.jJd.setText("");
        GMTrace.o(5006455472128L, 37301);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.jJb.setText(localjp.name);
      if (localjp.tZw <= 0.0F) {
        paramViewGroup.jJc.setVisibility(8);
      }
      for (;;)
      {
        paramViewGroup.jJd.setText(localjp.fjk + localjp.fjl + localjp.gEy);
        paramViewGroup.jJf.setOnClickListener(CardShopUI.f(CardShopUI.this));
        paramViewGroup.jJf.setTag(localjp);
        GMTrace.o(5006455472128L, 37301);
        return paramView;
        paramViewGroup.jJc.setText(l.d(CardShopUI.this.getBaseContext(), localjp.tZw));
        paramViewGroup.jJc.setVisibility(0);
      }
    }
    
    final class a
    {
      public TextView jJb;
      public TextView jJc;
      public TextView jJd;
      public ImageView jJe;
      public View jJf;
      
      a()
      {
        GMTrace.i(4971021991936L, 37037);
        GMTrace.o(4971021991936L, 37037);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardShopUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */