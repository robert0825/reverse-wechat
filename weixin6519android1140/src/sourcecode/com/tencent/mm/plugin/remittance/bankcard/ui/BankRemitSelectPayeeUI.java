package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.bankcard.a.f;
import com.tencent.mm.plugin.remittance.bankcard.a.j;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.plugin.wallet_core.ui.view.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.apo;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.wallet_core.c.g.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BankRemitSelectPayeeUI
  extends BankRemitBaseUI
  implements p.d
{
  private l iok;
  private ListView olG;
  private b olH;
  private List<TransferRecordParcel> olI;
  private ArrayList<TransferRecordParcel> olJ;
  private ArrayList<String> olK;
  private int olL;
  private int olM;
  private Intent olN;
  
  public BankRemitSelectPayeeUI()
  {
    GMTrace.i(20901324128256L, 155727);
    this.olL = -1;
    this.olM = -1;
    GMTrace.o(20901324128256L, 155727);
  }
  
  public final void MP()
  {
    GMTrace.i(20901592563712L, 155729);
    this.olG = ((ListView)findViewById(a.f.ssn));
    this.iok = new l(this);
    this.olH = new b((byte)0);
    this.olG.setAdapter(this.olH);
    this.olG.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20912061546496L, 155807);
        w.d("MicroMsg.BankRemitSelectPayeeUI", "item click: %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        paramAnonymousAdapterView = (TransferRecordParcel)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView != null)
        {
          BankRemitSelectPayeeUI.a(BankRemitSelectPayeeUI.this).putExtra("key_bank_card_seqno", paramAnonymousAdapterView.ojE);
          BankRemitSelectPayeeUI.this.setResult(-1, BankRemitSelectPayeeUI.a(BankRemitSelectPayeeUI.this));
          BankRemitSelectPayeeUI.this.finish();
        }
        GMTrace.o(20912061546496L, 155807);
      }
    });
    this.olG.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20939173527552L, 156009);
        BankRemitSelectPayeeUI.b(BankRemitSelectPayeeUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BankRemitSelectPayeeUI.this, BankRemitSelectPayeeUI.this);
        GMTrace.o(20939173527552L, 156009);
        return true;
      }
    });
    GMTrace.o(20901592563712L, 155729);
  }
  
  public final void c(final MenuItem paramMenuItem, int paramInt)
  {
    GMTrace.i(20901860999168L, 155731);
    paramInt = paramMenuItem.getItemId();
    paramMenuItem = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    paramMenuItem = (TransferRecordParcel)this.olG.getItemAtPosition(paramMenuItem.position);
    if (paramMenuItem == null)
    {
      w.i("MicroMsg.BankRemitSelectPayeeUI", "select record is null");
      GMTrace.o(20901860999168L, 155731);
      return;
    }
    if (paramInt == 1)
    {
      a.a(this, getString(a.i.sSF), paramMenuItem.ojH, "", 32, new h.b()new DialogInterface.OnClickListener
      {
        public final boolean v(CharSequence paramAnonymousCharSequence)
        {
          GMTrace.i(20928167673856L, 155927);
          if (((paramMenuItem.ojH == null) && (paramAnonymousCharSequence == null)) || ((paramMenuItem.ojH != null) && (paramMenuItem.ojH.equals(paramAnonymousCharSequence))))
          {
            w.i("MicroMsg.BankRemitSelectPayeeUI", "no change: %s, %s", new Object[] { paramMenuItem.ojH, paramAnonymousCharSequence });
            GMTrace.o(20928167673856L, 155927);
            return true;
          }
          BankRemitSelectPayeeUI.a(BankRemitSelectPayeeUI.this, paramMenuItem.ojE, String.valueOf(paramAnonymousCharSequence));
          GMTrace.o(20928167673856L, 155927);
          return true;
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20926154407936L, 155912);
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20912329981952L, 155809);
              BankRemitSelectPayeeUI.this.aLo();
              GMTrace.o(20912329981952L, 155809);
            }
          }, 500L);
          GMTrace.o(20926154407936L, 155912);
        }
      });
      GMTrace.o(20901860999168L, 155731);
      return;
    }
    if (paramInt == 0)
    {
      paramMenuItem = paramMenuItem.ojE;
      w.i("MicroMsg.BankRemitSelectPayeeUI", "do delete record");
      b(new f(paramMenuItem), true);
      com.tencent.mm.plugin.report.service.g.ork.i(14673, new Object[] { Integer.valueOf(7) });
      GMTrace.o(20901860999168L, 155731);
      return;
    }
    w.i("MicroMsg.BankRemitSelectPayeeUI", "unknown itemId: %s", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(20901860999168L, 155731);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(20902263652352L, 155734);
    if ((paramk instanceof j))
    {
      paramString = (j)paramk;
      paramString.a(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20931523117056L, 155952);
          w.i("MicroMsg.BankRemitSelectPayeeUI", "modify success");
          BankRemitSelectPayeeUI.b(BankRemitSelectPayeeUI.this, paramString.oiX, paramString.hLO);
          GMTrace.o(20931523117056L, 155952);
        }
      }).b(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20926691278848L, 155916);
          w.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", new Object[] { Integer.valueOf(paramString.ojf.jWs), paramString.ojf.jWt });
          if (!bg.nm(paramString.ojf.jWt)) {
            Toast.makeText(BankRemitSelectPayeeUI.this, paramString.ojf.jWt, 1).show();
          }
          GMTrace.o(20926691278848L, 155916);
        }
      }).c(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20927899238400L, 155925);
          w.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(20927899238400L, 155925);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(20902263652352L, 155734);
      return false;
      if ((paramk instanceof f))
      {
        paramString = (f)paramk;
        paramString.a(new g.a()
        {
          public final void i(k paramAnonymousk)
          {
            GMTrace.i(20905887531008L, 155761);
            BankRemitSelectPayeeUI.a(BankRemitSelectPayeeUI.this, paramString.oiX);
            GMTrace.o(20905887531008L, 155761);
          }
        }).b(new g.a()
        {
          public final void i(k paramAnonymousk)
          {
            GMTrace.i(20931254681600L, 155950);
            w.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", new Object[] { Integer.valueOf(paramString.ojb.jWs), paramString.ojb.jWt });
            if (!bg.nm(paramString.ojb.jWt)) {
              Toast.makeText(BankRemitSelectPayeeUI.this, paramString.ojb.jWt, 1).show();
            }
            GMTrace.o(20931254681600L, 155950);
          }
        }).c(new g.a()
        {
          public final void i(k paramAnonymousk)
          {
            GMTrace.i(20907229708288L, 155771);
            w.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", new Object[] { paramAnonymousk });
            GMTrace.o(20907229708288L, 155771);
          }
        });
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20901995216896L, 155732);
    int i = a.g.sLM;
    GMTrace.o(20901995216896L, 155732);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20901458345984L, 155728);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getParcelableArrayListExtra("key_self_transfer_record_list");
    Object localObject = getIntent().getParcelableArrayListExtra("key_freq_transfer_record_list");
    this.olI = new ArrayList();
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      this.olL = 0;
      this.olI.addAll(paramBundle);
    }
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      this.olM = (this.olI.size() + this.olL + 1);
      this.olI.addAll((Collection)localObject);
    }
    w.i("MicroMsg.BankRemitSelectPayeeUI", "selfHeaderPos: %s, otherHeaderPos: %s", new Object[] { Integer.valueOf(this.olL), Integer.valueOf(this.olM) });
    paramBundle = this.olI.iterator();
    while (paramBundle.hasNext())
    {
      localObject = (TransferRecordParcel)paramBundle.next();
      w.d("MicroMsg.BankRemitSelectPayeeUI", "seqno: %s, tail: %s, bank_logo: %s, bank_name: %s, bank_type: %s, payee: %s, explain: %s", new Object[] { ((TransferRecordParcel)localObject).ojE, ((TransferRecordParcel)localObject).ojF, ((TransferRecordParcel)localObject).ojk, ((TransferRecordParcel)localObject).mhU, ((TransferRecordParcel)localObject).nDt, ((TransferRecordParcel)localObject).ojG, ((TransferRecordParcel)localObject).ojH });
    }
    this.olN = new Intent();
    MP();
    oM(a.i.sSg);
    hN(1590);
    hN(1395);
    GMTrace.o(20901458345984L, 155728);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(20901726781440L, 155730);
    paramContextMenu.add(0, 1, 0, a.i.sSe);
    paramContextMenu.add(0, 0, 0, a.i.sSb);
    GMTrace.o(20901726781440L, 155730);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20902129434624L, 155733);
    super.onDestroy();
    hO(1590);
    hO(1395);
    GMTrace.o(20902129434624L, 155733);
  }
  
  private final class a
  {
    TextView ojC;
    CdnImageView olT;
    TextView olU;
    
    public a()
    {
      GMTrace.i(20925080666112L, 155904);
      GMTrace.o(20925080666112L, 155904);
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private b()
    {
      GMTrace.i(20943871148032L, 156044);
      GMTrace.o(20943871148032L, 156044);
    }
    
    private boolean bbs()
    {
      GMTrace.i(20944944889856L, 156052);
      if (BankRemitSelectPayeeUI.d(BankRemitSelectPayeeUI.this) >= 0)
      {
        GMTrace.o(20944944889856L, 156052);
        return true;
      }
      GMTrace.o(20944944889856L, 156052);
      return false;
    }
    
    public final int getCount()
    {
      GMTrace.i(20944005365760L, 156045);
      int j = BankRemitSelectPayeeUI.c(BankRemitSelectPayeeUI.this).size();
      int i = j;
      if (bbs()) {
        i = j + 1;
      }
      if (BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this) >= 0) {}
      for (j = 1;; j = 0)
      {
        int k = i;
        if (j != 0) {
          k = i + 1;
        }
        GMTrace.o(20944005365760L, 156045);
        return k;
      }
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(20944139583488L, 156046);
      if ((paramInt == BankRemitSelectPayeeUI.d(BankRemitSelectPayeeUI.this)) || (paramInt == BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this)))
      {
        GMTrace.o(20944139583488L, 156046);
        return null;
      }
      Object localObject;
      if (paramInt < BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this))
      {
        localObject = BankRemitSelectPayeeUI.c(BankRemitSelectPayeeUI.this).get(paramInt - 1);
        GMTrace.o(20944139583488L, 156046);
        return localObject;
      }
      if (paramInt > BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this))
      {
        if (bbs())
        {
          localObject = BankRemitSelectPayeeUI.c(BankRemitSelectPayeeUI.this).get(paramInt - 2);
          GMTrace.o(20944139583488L, 156046);
          return localObject;
        }
        localObject = BankRemitSelectPayeeUI.c(BankRemitSelectPayeeUI.this).get(paramInt - 1);
        GMTrace.o(20944139583488L, 156046);
        return localObject;
      }
      w.i("MicroMsg.BankRemitSelectPayeeUI", "maybe wrong pos: [%s,%s,%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(BankRemitSelectPayeeUI.d(BankRemitSelectPayeeUI.this)), Integer.valueOf(BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this)) });
      GMTrace.o(20944139583488L, 156046);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(20944408018944L, 156048);
      long l = paramInt;
      GMTrace.o(20944408018944L, 156048);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(20944542236672L, 156049);
      if ((paramInt == BankRemitSelectPayeeUI.d(BankRemitSelectPayeeUI.this)) || (paramInt == BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this)))
      {
        GMTrace.o(20944542236672L, 156049);
        return 0;
      }
      GMTrace.o(20944542236672L, 156049);
      return 1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(20944810672128L, 156051);
      int i = getItemViewType(paramInt);
      View localView = paramView;
      if (paramView == null)
      {
        if (i == 0) {
          localView = LayoutInflater.from(BankRemitSelectPayeeUI.this.vKB.vKW).inflate(a.g.sLK, paramViewGroup, false);
        }
      }
      else {
        switch (i)
        {
        default: 
          w.w("MicroMsg.BankRemitSelectPayeeUI", "unknown type: %d", new Object[] { Integer.valueOf(i) });
        }
      }
      for (;;)
      {
        GMTrace.o(20944810672128L, 156051);
        return localView;
        localView = LayoutInflater.from(BankRemitSelectPayeeUI.this.vKB.vKW).inflate(a.g.sLL, paramViewGroup, false);
        paramView = new BankRemitSelectPayeeUI.a(BankRemitSelectPayeeUI.this);
        paramView.olT = ((CdnImageView)localView.findViewById(a.f.ssk));
        paramView.ojC = ((TextView)localView.findViewById(a.f.ssm));
        paramView.olU = ((TextView)localView.findViewById(a.f.ssl));
        localView.setTag(paramView);
        break;
        paramView = (TextView)localView.findViewById(a.f.ssj);
        if (BankRemitSelectPayeeUI.d(BankRemitSelectPayeeUI.this) == paramInt) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label242;
          }
          paramView.setText(a.i.sSf);
          break;
        }
        label242:
        if (BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this) == paramInt) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label277;
          }
          paramView.setText(a.i.sSd);
          break;
        }
        label277:
        paramView.setText("");
        w.w("MicroMsg.BankRemitSelectPayeeUI", "wrong header pos: %s", new Object[] { Integer.valueOf(paramInt) });
        continue;
        paramView = (BankRemitSelectPayeeUI.a)localView.getTag();
        paramViewGroup = (TransferRecordParcel)getItem(paramInt);
        if (paramViewGroup != null)
        {
          paramView.olT.h(paramViewGroup.ojk, 0, 0, a.c.transparent);
          if (!bg.nm(paramViewGroup.ojH))
          {
            SpannableString localSpannableString = h.a(paramView.olO.vKB.vKW, paramView.olO.vKB.vKW.getString(a.i.sSc, new Object[] { paramViewGroup.ojG, paramViewGroup.ojH }));
            paramView.ojC.setText(localSpannableString);
          }
          for (;;)
          {
            paramView.olU.setText(paramView.olO.getString(a.i.sSc, new Object[] { paramViewGroup.mhU, paramViewGroup.ojF }));
            break;
            paramView.ojC.setText(paramViewGroup.ojG);
          }
        }
        paramView.olT.setImageResource(a.c.transparent);
        paramView.ojC.setText("");
        paramView.olU.setText("");
        w.w("MicroMsg.BankRemitSelectPayeeUI", "empty record");
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(20944676454400L, 156050);
      GMTrace.o(20944676454400L, 156050);
      return 2;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(20944273801216L, 156047);
      if ((paramInt == BankRemitSelectPayeeUI.d(BankRemitSelectPayeeUI.this)) || (paramInt == BankRemitSelectPayeeUI.e(BankRemitSelectPayeeUI.this)))
      {
        GMTrace.o(20944273801216L, 156047);
        return false;
      }
      GMTrace.o(20944273801216L, 156047);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitSelectPayeeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */