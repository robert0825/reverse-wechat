package com.tencent.mm.plugin.scanner.history.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.scanner.a.i;
import com.tencent.mm.plugin.scanner.history.a.b;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public class ScannerHistoryUI
  extends MMActivity
{
  private ListView Ev;
  private View iTN;
  private LinearLayout jIX;
  private View jIY;
  private TextView jIZ;
  private a osH;
  
  public ScannerHistoryUI()
  {
    GMTrace.i(6047582388224L, 45058);
    GMTrace.o(6047582388224L, 45058);
  }
  
  private void akN()
  {
    GMTrace.i(6048387694592L, 45064);
    if (com.tencent.mm.plugin.scanner.c.bcn().getCount() > 0)
    {
      this.Ev.setVisibility(0);
      this.iTN.setVisibility(8);
      this.jIY.setVisibility(0);
      lf(true);
    }
    for (;;)
    {
      this.osH.notifyDataSetChanged();
      GMTrace.o(6048387694592L, 45064);
      return;
      this.Ev.setVisibility(8);
      this.iTN.setVisibility(0);
      this.jIY.setVisibility(8);
      lf(false);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6048253476864L, 45063);
    oM(R.l.dVk);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6047448170496L, 45057);
        ScannerHistoryUI.this.finish();
        GMTrace.o(6047448170496L, 45057);
        return true;
      }
    });
    this.Ev = ((ListView)findViewById(R.h.bZD));
    this.jIX = ((LinearLayout)View.inflate(getBaseContext(), R.i.cFe, null));
    this.Ev.addHeaderView(this.jIX);
    this.osH = new a();
    this.Ev.setAdapter(this.osH);
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6045434904576L, 45042);
        if (paramAnonymousInt == 0)
        {
          w.v("MicroMsg.ScannerHistoryUI", "onItemClick pos is 0, click headerview");
          GMTrace.o(6045434904576L, 45042);
          return;
        }
        int i = paramAnonymousInt;
        if (paramAnonymousInt > 0) {
          i = paramAnonymousInt - 1;
        }
        ScannerHistoryUI.a(ScannerHistoryUI.this, i);
        GMTrace.o(6045434904576L, 45042);
      }
    });
    this.Ev.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6049327218688L, 45071);
        if (paramAnonymousInt == 0)
        {
          w.i("MicroMsg.ScannerHistoryUI", "onItemLongClick pos is 0");
          GMTrace.o(6049327218688L, 45071);
          return true;
        }
        int i = paramAnonymousInt;
        if (paramAnonymousInt > 0) {
          i = paramAnonymousInt - 1;
        }
        if (i >= ScannerHistoryUI.a(ScannerHistoryUI.this).getCount())
        {
          GMTrace.o(6049327218688L, 45071);
          return true;
        }
        ScannerHistoryUI.b(ScannerHistoryUI.this, i);
        GMTrace.o(6049327218688L, 45071);
        return true;
      }
    });
    a(0, getString(R.l.dcj), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6045703340032L, 45044);
        ScannerHistoryUI.b(ScannerHistoryUI.this);
        GMTrace.o(6045703340032L, 45044);
        return true;
      }
    });
    this.iTN = findViewById(R.h.brV);
    this.jIY = View.inflate(this, R.i.cFd, null);
    if (this.jIX != null) {
      this.jIX.addView(this.jIY);
    }
    this.jIZ = ((TextView)this.jIY.findViewById(R.h.bGg));
    this.jIZ.setText(R.l.dCQ);
    akN();
    GMTrace.o(6048253476864L, 45063);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6047716605952L, 45059);
    int i = R.i.cFf;
    GMTrace.o(6047716605952L, 45059);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6047850823680L, 45060);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(6047850823680L, 45060);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6048119259136L, 45062);
    super.onDestroy();
    GMTrace.o(6048119259136L, 45062);
  }
  
  protected void onResume()
  {
    GMTrace.i(6047985041408L, 45061);
    super.onResume();
    GMTrace.o(6047985041408L, 45061);
  }
  
  final class a
    extends o<com.tencent.mm.plugin.scanner.history.a.a>
  {
    public a()
    {
      super(new com.tencent.mm.plugin.scanner.history.a.a());
      GMTrace.i(6046105993216L, 45047);
      lb(true);
      GMTrace.o(6046105993216L, 45047);
    }
    
    public final void QF()
    {
      GMTrace.i(6046240210944L, 45048);
      setCursor(com.tencent.mm.plugin.scanner.c.bcn().Mx());
      notifyDataSetChanged();
      GMTrace.o(6046240210944L, 45048);
    }
    
    protected final void QG()
    {
      GMTrace.i(6046374428672L, 45049);
      aJe();
      QF();
      GMTrace.o(6046374428672L, 45049);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6046508646400L, 45050);
      Object localObject = (com.tencent.mm.plugin.scanner.history.a.a)getItem(paramInt);
      if (paramView == null)
      {
        paramView = View.inflate(ScannerHistoryUI.this.vKB.vKW, R.i.cFc, null);
        paramViewGroup = new ScannerHistoryUI.b(ScannerHistoryUI.this);
        paramViewGroup.iCr = ((ImageView)paramView.findViewById(R.h.bIL));
        paramViewGroup.jIB = ((TextView)paramView.findViewById(R.h.bJd));
        paramViewGroup.jIC = ((TextView)paramView.findViewById(R.h.bJb));
        paramViewGroup.jID = ((TextView)paramView.findViewById(R.h.bIH));
        paramView.setTag(paramViewGroup);
        n.a locala = i.bH(((com.tencent.mm.plugin.scanner.history.a.a)localObject).field_xmlContent, ((com.tencent.mm.plugin.scanner.history.a.a)localObject).field_funcType);
        paramViewGroup.jIB.setText(locala.field_title);
        long l = ((com.tencent.mm.plugin.scanner.history.a.a)localObject).field_ScanTime;
        paramViewGroup.jIC.setText(com.tencent.mm.pluginsdk.i.n.c(ScannerHistoryUI.this, l, true));
        paramViewGroup.jID.setText(locala.field_subtitle);
        int i = ScannerHistoryUI.this.getResources().getDimensionPixelSize(R.f.aSH);
        paramViewGroup.iCr.setImageResource(R.g.aYT);
        w.d("MicroMsg.ScannerHistoryUI", "ScannerHistoryUI getView () position : " + paramInt + " logo_url :  " + locala.field_thumburl);
        if (TextUtils.isEmpty(locala.field_thumburl)) {
          break label441;
        }
        c.a locala1 = new c.a();
        locala1.gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        locala1.gKX = null;
        localObject = com.tencent.mm.plugin.scanner.c.bcm();
        String str = locala.field_thumburl;
        if (!at.AU()) {
          break label433;
        }
        localObject = String.format("%s/scanbook_%s", new Object[] { ((com.tencent.mm.plugin.scanner.c)localObject).fYU + "image/scan/img", g.n(str.getBytes()) });
        label341:
        locala1.gKE = ((String)localObject);
        locala1.gKC = true;
        locala1.gKZ = false;
        locala1.gKA = true;
        locala1.gKJ = i;
        locala1.gKI = i;
        locala1.gKR = R.g.aYT;
        localObject = locala1.Jn();
        com.tencent.mm.ao.n.Jd().a(locala.field_thumburl, paramViewGroup.iCr, (com.tencent.mm.ao.a.a.c)localObject);
      }
      for (;;)
      {
        GMTrace.o(6046508646400L, 45050);
        return paramView;
        paramViewGroup = (ScannerHistoryUI.b)paramView.getTag();
        break;
        label433:
        localObject = "";
        break label341;
        label441:
        paramViewGroup.iCr.setImageResource(R.g.aYT);
      }
    }
  }
  
  private final class b
  {
    ImageView iCr;
    TextView jIB;
    TextView jIC;
    TextView jID;
    
    public b()
    {
      GMTrace.i(6047045517312L, 45054);
      GMTrace.o(6047045517312L, 45054);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\history\ui\ScannerHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */