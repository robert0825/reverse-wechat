package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InvoiceListUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private TextView huR;
  private com.tencent.mm.plugin.o.a.b hvD;
  private a hvE;
  private ListView hvF;
  private com.tencent.mm.plugin.address.b.b.a hvG;
  private Object hvH;
  private TextView hvI;
  private LinkedList<com.tencent.mm.plugin.o.a.b> hvJ;
  private boolean hvK;
  private boolean hvL;
  private boolean hvc;
  
  public InvoiceListUI()
  {
    GMTrace.i(15212908380160L, 113345);
    this.hvG = null;
    this.hvH = new Object();
    this.hvI = null;
    this.huR = null;
    this.hvJ = new LinkedList();
    this.hvc = false;
    this.hvK = false;
    this.hvL = false;
    GMTrace.o(15212908380160L, 113345);
  }
  
  private void QY()
  {
    GMTrace.i(15213445251072L, 113349);
    synchronized (this.hvH)
    {
      com.tencent.mm.plugin.address.a.a.QM();
      this.hvJ = com.tencent.mm.plugin.address.a.a.QN().hui.mhP;
      this.hvE.gpU = this.hvJ;
      this.hvJ.size();
      this.hvE.notifyDataSetChanged();
      GMTrace.o(15213445251072L, 113349);
      return;
    }
  }
  
  private void hP(int paramInt)
  {
    GMTrace.i(15213982121984L, 113353);
    Intent localIntent = new Intent();
    if (paramInt != 0)
    {
      localIntent.setClass(this, QrcodeInvoiceUI.class);
      localIntent.putExtra("invoice_id", paramInt);
    }
    for (;;)
    {
      startActivity(localIntent);
      GMTrace.o(15213982121984L, 113353);
      return;
      localIntent.setClass(this, AddInvoiceUI.class);
      localIntent.putExtra("launch_from_invoicelist_webview", this.hvc);
      localIntent.putExtra("invoice_id", paramInt);
    }
  }
  
  public final void MP()
  {
    GMTrace.i(15213579468800L, 113350);
    this.hvI = ((TextView)findViewById(R.h.bHk));
    if (this.hvI != null) {
      this.hvI.setVisibility(8);
    }
    if (this.hvc)
    {
      this.huR = ((TextView)findViewById(R.h.bJo));
      if (this.huR != null) {
        this.huR.setVisibility(0);
      }
    }
    for (;;)
    {
      this.hvI.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15215995387904L, 113368);
          InvoiceListUI.a(InvoiceListUI.this);
          GMTrace.o(15215995387904L, 113368);
        }
      });
      this.hvF = ((ListView)findViewById(R.h.cda));
      this.hvE = new a(this);
      this.hvF.setAdapter(this.hvE);
      this.hvF.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> arg1, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(15202036744192L, 113264);
          w.d("MicroMsg.InvoiceListUI", "select pos " + paramAnonymousInt);
          synchronized (InvoiceListUI.b(InvoiceListUI.this))
          {
            if (paramAnonymousInt < InvoiceListUI.c(InvoiceListUI.this).size())
            {
              InvoiceListUI.a(InvoiceListUI.this, (com.tencent.mm.plugin.o.a.b)InvoiceListUI.c(InvoiceListUI.this).get(paramAnonymousInt));
              if ((InvoiceListUI.d(InvoiceListUI.this)) || (InvoiceListUI.e(InvoiceListUI.this) == null)) {
                break label133;
              }
              InvoiceListUI.a(InvoiceListUI.this, InvoiceListUI.e(InvoiceListUI.this).mhQ);
            }
            label133:
            while ((InvoiceListUI.e(InvoiceListUI.this) == null) || (InvoiceListUI.e(InvoiceListUI.this).mhQ == 0))
            {
              InvoiceListUI.f(InvoiceListUI.this).notifyDataSetChanged();
              GMTrace.o(15202036744192L, 113264);
              return;
            }
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("choose_invoice_title_info", com.tencent.mm.plugin.address.e.e.a(InvoiceListUI.e(InvoiceListUI.this)));
            InvoiceListUI.this.setResult(-1, paramAnonymousView);
            InvoiceListUI.this.finish();
          }
        }
      });
      this.hvF.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(15216532258816L, 113372);
          paramAnonymousAdapterView = InvoiceListUI.this.getResources().getStringArray(R.c.aMo);
          h.a(InvoiceListUI.this.vKB.vKW, null, paramAnonymousAdapterView, null, new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(15215458516992L, 113364);
              for (;;)
              {
                synchronized (InvoiceListUI.b(InvoiceListUI.this))
                {
                  if (paramAnonymousInt >= InvoiceListUI.c(InvoiceListUI.this).size()) {
                    break label196;
                  }
                  com.tencent.mm.plugin.o.a.b localb = (com.tencent.mm.plugin.o.a.b)InvoiceListUI.c(InvoiceListUI.this).get(paramAnonymousInt);
                  if (localb == null)
                  {
                    GMTrace.o(15215458516992L, 113364);
                    return;
                  }
                }
                switch (paramAnonymous2Int)
                {
                }
                for (;;)
                {
                  GMTrace.o(15215458516992L, 113364);
                  return;
                  InvoiceListUI.a(InvoiceListUI.this, ((com.tencent.mm.plugin.o.a.b)localObject1).mhQ);
                  GMTrace.o(15215458516992L, 113364);
                  return;
                  locala = new com.tencent.mm.plugin.address.model.a(((com.tencent.mm.plugin.o.a.b)localObject1).mhQ);
                  InvoiceListUI.a(InvoiceListUI.this, null);
                  at.wS().a(locala, 0);
                  GMTrace.o(15215458516992L, 113364);
                  return;
                  InvoiceListUI.b(InvoiceListUI.this, locala);
                }
                label196:
                com.tencent.mm.plugin.address.model.a locala = null;
              }
            }
          });
          GMTrace.o(15216532258816L, 113372);
          return true;
        }
      });
      this.hvE.notifyDataSetChanged();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15215726952448L, 113366);
          InvoiceListUI.this.setResult(0);
          InvoiceListUI.this.finish();
          GMTrace.o(15215726952448L, 113366);
          return true;
        }
      });
      a(0, R.l.dYv, R.k.cIG, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(15202573615104L, 113268);
          InvoiceListUI.a(InvoiceListUI.this);
          GMTrace.o(15202573615104L, 113268);
          return true;
        }
      });
      GMTrace.o(15213579468800L, 113350);
      return;
      this.huR = ((TextView)findViewById(R.h.bJo));
      if (this.huR != null) {
        this.huR.setVisibility(8);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(15213847904256L, 113352);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paramk.getType() == 1191)
      {
        QY();
        if (this.hvc)
        {
          com.tencent.mm.plugin.address.a.a.QM();
          if ((com.tencent.mm.plugin.address.a.a.QN().hui.mhP.size() == 0) && (!this.hvL))
          {
            paramString = new Intent();
            paramString.setClass(this, AddInvoiceUI.class);
            paramString.putExtra("launch_from_webview", true);
            startActivityForResult(paramString, 1);
            GMTrace.o(15213847904256L, 113352);
          }
        }
      }
      else if (paramk.getType() == 1194)
      {
        paramString = new com.tencent.mm.plugin.address.model.b();
        at.wS().a(paramString, 0);
        this.hvL = true;
      }
    }
    GMTrace.o(15213847904256L, 113352);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15213713686528L, 113351);
    int i = R.i.czX;
    GMTrace.o(15213713686528L, 113351);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(15214116339712L, 113354);
    Object localObject;
    if (paramInt1 == 1)
    {
      if (-1 != paramInt2) {
        break label216;
      }
      if (paramIntent != null) {
        break label77;
      }
      w.e("MicroMsg.InvoiceUtil", "intent is null");
      paramIntent = null;
      localObject = new Intent();
      ((Intent)localObject).putExtra("choose_invoice_title_info", com.tencent.mm.plugin.address.e.e.a(paramIntent));
      setResult(-1, (Intent)localObject);
    }
    for (;;)
    {
      finish();
      GMTrace.o(15214116339712L, 113354);
      return;
      label77:
      localObject = new com.tencent.mm.plugin.o.a.b();
      ((com.tencent.mm.plugin.o.a.b)localObject).type = paramIntent.getStringExtra("type");
      if ((((com.tencent.mm.plugin.o.a.b)localObject).type != null) && (((com.tencent.mm.plugin.o.a.b)localObject).type.equals("1")))
      {
        ((com.tencent.mm.plugin.o.a.b)localObject).mhR = paramIntent.getStringExtra("title");
        paramIntent = (Intent)localObject;
        break;
      }
      ((com.tencent.mm.plugin.o.a.b)localObject).title = paramIntent.getStringExtra("title");
      ((com.tencent.mm.plugin.o.a.b)localObject).mhS = paramIntent.getStringExtra("tax_number");
      ((com.tencent.mm.plugin.o.a.b)localObject).mhY = paramIntent.getStringExtra("company_address");
      ((com.tencent.mm.plugin.o.a.b)localObject).mhW = paramIntent.getStringExtra("telephone");
      ((com.tencent.mm.plugin.o.a.b)localObject).mhU = paramIntent.getStringExtra("bank_name");
      ((com.tencent.mm.plugin.o.a.b)localObject).mhT = paramIntent.getStringExtra("bank_account");
      paramIntent = (Intent)localObject;
      break;
      label216:
      setResult(0);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15213042597888L, 113346);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.hvc = paramBundle.getBooleanExtra("launch_from_webview", false);
    this.hvK = paramBundle.getBooleanExtra("launch_from_appbrand", false);
    if ((this.hvc) || (this.hvK)) {
      this.hvc = true;
    }
    if (this.hvc)
    {
      at.AR();
      boolean bool = ((Boolean)c.xh().get(w.a.vvb, Boolean.valueOf(true))).booleanValue();
      w.i("MicroMsg.InvoiceListUI", "showDisclaimerDailog..isShowDisclaimerDialog " + bool);
      if (bool)
      {
        w.i("MicroMsg.InvoiceListUI", "showDisclaimerDialog");
        h.a(this, getString(R.l.dDU), getString(R.l.dDV), getString(R.l.cPO), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(18471177945088L, 137621);
            w.i("MicroMsg.InvoiceListUI", "dismiss DisclaimerDailog...");
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(18471177945088L, 137621);
          }
        });
        at.AR();
        c.xh().a(w.a.vvb, Boolean.valueOf(false));
      }
    }
    oM(R.l.dZx);
    at.wS().a(1194, this);
    at.wS().a(1191, this);
    MP();
    QY();
    GMTrace.o(15213042597888L, 113346);
  }
  
  public void onDestroy()
  {
    GMTrace.i(15213176815616L, 113347);
    at.wS().b(1194, this);
    at.wS().b(1191, this);
    super.onDestroy();
    GMTrace.o(15213176815616L, 113347);
  }
  
  public void onResume()
  {
    GMTrace.i(15213311033344L, 113348);
    com.tencent.mm.plugin.address.model.b localb = new com.tencent.mm.plugin.address.model.b();
    at.wS().a(localb, 0);
    super.onResume();
    GMTrace.o(15213311033344L, 113348);
  }
  
  public final class a
    extends BaseAdapter
  {
    private final Context context;
    List<com.tencent.mm.plugin.o.a.b> gpU;
    
    public a(Context paramContext)
    {
      GMTrace.i(15207405453312L, 113304);
      this.gpU = new ArrayList();
      this.context = paramContext;
      GMTrace.o(15207405453312L, 113304);
    }
    
    private com.tencent.mm.plugin.o.a.b hR(int paramInt)
    {
      GMTrace.i(15207808106496L, 113307);
      com.tencent.mm.plugin.o.a.b localb = (com.tencent.mm.plugin.o.a.b)this.gpU.get(paramInt);
      GMTrace.o(15207808106496L, 113307);
      return localb;
    }
    
    public final int getCount()
    {
      GMTrace.i(15207673888768L, 113306);
      int i = this.gpU.size();
      GMTrace.o(15207673888768L, 113306);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(15207942324224L, 113308);
      long l = paramInt;
      GMTrace.o(15207942324224L, 113308);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(15207539671040L, 113305);
      paramViewGroup = new a();
      com.tencent.mm.plugin.o.a.b localb;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.cHM, null);
        paramViewGroup.hvP = ((ImageView)paramView.findViewById(R.h.bpc));
        paramViewGroup.hvO = ((TextView)paramView.findViewById(R.h.bcU));
        paramViewGroup.hvQ = ((TextView)paramView.findViewById(R.h.bda));
        paramView.setTag(paramViewGroup);
        localb = hR(paramInt);
        if ((localb.type == null) || (!localb.type.equals("0"))) {
          break label199;
        }
        paramViewGroup.hvO.setText(R.l.dDN);
        paramViewGroup.hvQ.setText(localb.title);
        label130:
        if ((!InvoiceListUI.d(InvoiceListUI.this)) || (InvoiceListUI.e(InvoiceListUI.this) == null) || (InvoiceListUI.e(InvoiceListUI.this).mhQ != localb.mhQ)) {
          break label245;
        }
        paramViewGroup.hvP.setImageResource(R.k.cOv);
      }
      for (;;)
      {
        GMTrace.o(15207539671040L, 113305);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label199:
        if ((localb.type == null) || (!localb.type.equals("1"))) {
          break label130;
        }
        paramViewGroup.hvO.setText(R.l.dDP);
        paramViewGroup.hvQ.setText(localb.mhR);
        break label130;
        label245:
        paramViewGroup.hvP.setImageBitmap(null);
      }
    }
    
    final class a
    {
      TextView hvO;
      ImageView hvP;
      TextView hvQ;
      
      a()
      {
        GMTrace.i(15202976268288L, 113271);
        GMTrace.o(15202976268288L, 113271);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\InvoiceListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */