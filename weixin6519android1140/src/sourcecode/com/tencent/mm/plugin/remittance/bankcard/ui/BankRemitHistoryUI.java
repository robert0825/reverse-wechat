package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.bankcard.a.e;
import com.tencent.mm.plugin.remittance.bankcard.a.i;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.ahk;
import com.tencent.mm.protocal.c.awg;
import com.tencent.mm.protocal.c.pp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.c.g.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BankRemitHistoryUI
  extends BankRemitBaseUI
  implements p.d
{
  private int aCN;
  private boolean hqs;
  private boolean hqt;
  private l iok;
  private View ksX;
  private int offset;
  private ListView okP;
  private a okQ;
  private List<ahk> okR;
  
  public BankRemitHistoryUI()
  {
    GMTrace.i(20928301891584L, 155928);
    this.okR = new ArrayList();
    this.hqs = false;
    this.hqt = false;
    this.aCN = 20;
    this.offset = 0;
    GMTrace.o(20928301891584L, 155928);
  }
  
  private void bbq()
  {
    GMTrace.i(20929375633408L, 155936);
    w.i("MicroMsg.BankRemitHistoryUI", "fetch data: %s, %s", new Object[] { Integer.valueOf(this.aCN), Integer.valueOf(this.offset) });
    this.hqs = true;
    i locali = new i(this.aCN, this.offset);
    locali.j(this);
    b(locali, false);
    GMTrace.o(20929375633408L, 155936);
  }
  
  protected final void MP()
  {
    GMTrace.i(20928570327040L, 155930);
    this.okP = ((ListView)findViewById(a.f.srS));
    this.ksX = LayoutInflater.from(this).inflate(a.g.sLy, null);
    this.iok = new l(this);
    this.okQ = new a((byte)0);
    this.okP.addFooterView(this.ksX);
    this.okP.setAdapter(this.okQ);
    this.okP.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20924678012928L, 155901);
        w.d("MicroMsg.BankRemitHistoryUI", "click item, %s", new Object[] { ((ahk)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt)).title });
        BankRemitHistoryUI.a(BankRemitHistoryUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, BankRemitHistoryUI.this, BankRemitHistoryUI.this);
        GMTrace.o(20924678012928L, 155901);
        return false;
      }
    });
    this.okP.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20924409577472L, 155899);
        if ((BankRemitHistoryUI.b(BankRemitHistoryUI.this).getLastVisiblePosition() == BankRemitHistoryUI.b(BankRemitHistoryUI.this).getCount() - 1) && (BankRemitHistoryUI.b(BankRemitHistoryUI.this).getCount() > 0) && (!BankRemitHistoryUI.c(BankRemitHistoryUI.this)) && (!BankRemitHistoryUI.d(BankRemitHistoryUI.this))) {
          BankRemitHistoryUI.e(BankRemitHistoryUI.this);
        }
        GMTrace.o(20924409577472L, 155899);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(20924275359744L, 155898);
        GMTrace.o(20924275359744L, 155898);
      }
    });
    GMTrace.o(20928570327040L, 155930);
  }
  
  public final void c(MenuItem paramMenuItem, int paramInt)
  {
    GMTrace.i(20928838762496L, 155932);
    Object localObject = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    localObject = (ahk)this.okP.getItemAtPosition(((AdapterView.AdapterContextMenuInfo)localObject).position);
    if ((paramMenuItem.getItemId() == 1) && (localObject != null))
    {
      paramMenuItem = ((ahk)localObject).tXo;
      w.i("MicroMsg.BankRemitHistoryUI", "delete record: %s", new Object[] { paramMenuItem });
      paramMenuItem = new e(paramMenuItem);
      paramMenuItem.j(this);
      l(paramMenuItem);
    }
    GMTrace.o(20928838762496L, 155932);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(20928972980224L, 155933);
    if ((paramk instanceof i))
    {
      paramString = (i)paramk;
      paramString.a(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20906155966464L, 155763);
          if (paramString.oje.uvS != null)
          {
            w.i("MicroMsg.BankRemitHistoryUI", "history size: %s", new Object[] { Integer.valueOf(paramString.oje.uvS.size()) });
            if (paramString.oje.uvS.size() < paramString.aCN)
            {
              w.i("MicroMsg.BankRemitHistoryUI", "is last: %s", new Object[] { Integer.valueOf(BankRemitHistoryUI.f(BankRemitHistoryUI.this)) });
              BankRemitHistoryUI.g(BankRemitHistoryUI.this);
              BankRemitHistoryUI.b(BankRemitHistoryUI.this).removeFooterView(BankRemitHistoryUI.h(BankRemitHistoryUI.this));
            }
            if (paramString.oje.uvS != null)
            {
              BankRemitHistoryUI.a(BankRemitHistoryUI.this, BankRemitHistoryUI.f(BankRemitHistoryUI.this) + paramString.oje.uvS.size());
              BankRemitHistoryUI.i(BankRemitHistoryUI.this).addAll(paramString.oje.uvS);
              BankRemitHistoryUI.j(BankRemitHistoryUI.this).notifyDataSetChanged();
              GMTrace.o(20906155966464L, 155763);
            }
          }
          else
          {
            w.i("MicroMsg.BankRemitHistoryUI", "return history is null");
            BankRemitHistoryUI.g(BankRemitHistoryUI.this);
            BankRemitHistoryUI.b(BankRemitHistoryUI.this).removeFooterView(BankRemitHistoryUI.h(BankRemitHistoryUI.this));
          }
          GMTrace.o(20906155966464L, 155763);
        }
      }).b(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20899713515520L, 155715);
          w.e("MicroMsg.BankRemitHistoryUI", "history response error: %s, %s", new Object[] { Integer.valueOf(paramString.oje.jWs), paramString.oje.jWt });
          GMTrace.o(20899713515520L, 155715);
        }
      }).c(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20938905092096L, 156007);
          w.e("MicroMsg.BankRemitHistoryUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(20938905092096L, 156007);
        }
      });
      this.hqs = false;
    }
    for (;;)
    {
      GMTrace.o(20928972980224L, 155933);
      return false;
      if ((paramk instanceof e))
      {
        paramString = (e)paramk;
        paramString.a(new g.a()
        {
          public final void i(k paramAnonymousk)
          {
            GMTrace.i(20899176644608L, 155711);
            BankRemitHistoryUI.a(BankRemitHistoryUI.this, paramString.jVQ);
            GMTrace.o(20899176644608L, 155711);
          }
        }).b(new g.a()
        {
          public final void i(k paramAnonymousk)
          {
            GMTrace.i(20938636656640L, 156005);
            w.e("MicroMsg.BankRemitHistoryUI", "history response: %s, %s", new Object[] { Integer.valueOf(paramString.oja.jWs), paramString.oja.jWt });
            GMTrace.o(20938636656640L, 156005);
          }
        }).c(new g.a()
        {
          public final void i(k paramAnonymousk)
          {
            GMTrace.i(20908706103296L, 155782);
            w.e("MicroMsg.BankRemitHistoryUI", "net error: %s", new Object[] { paramAnonymousk });
            GMTrace.o(20908706103296L, 155782);
          }
        });
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20929107197952L, 155934);
    int i = a.g.sLE;
    GMTrace.o(20929107197952L, 155934);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20928436109312L, 155929);
    super.onCreate(paramBundle);
    hN(1511);
    hN(1737);
    oM(a.i.sRT);
    MP();
    bbq();
    GMTrace.o(20928436109312L, 155929);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(20928704544768L, 155931);
    paramContextMenu.add(0, 1, 0, a.i.sSb);
    GMTrace.o(20928704544768L, 155931);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20929241415680L, 155935);
    super.onDestroy();
    hO(1511);
    hO(1737);
    GMTrace.o(20929241415680L, 155935);
  }
  
  private final class a
    extends BaseAdapter
  {
    private SimpleDateFormat okV;
    
    private a()
    {
      GMTrace.i(20899847733248L, 155716);
      this.okV = new SimpleDateFormat(BankRemitHistoryUI.this.vKB.vKW.getString(a.i.sRS));
      GMTrace.o(20899847733248L, 155716);
    }
    
    private String ax(long paramLong)
    {
      GMTrace.i(20900518821888L, 155721);
      String str = this.okV.format(new Date(1000L * paramLong));
      GMTrace.o(20900518821888L, 155721);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(20899981950976L, 155717);
      int i = BankRemitHistoryUI.i(BankRemitHistoryUI.this).size();
      GMTrace.o(20899981950976L, 155717);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(20900116168704L, 155718);
      Object localObject = BankRemitHistoryUI.i(BankRemitHistoryUI.this).get(paramInt);
      GMTrace.o(20900116168704L, 155718);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(20900250386432L, 155719);
      long l = paramInt;
      GMTrace.o(20900250386432L, 155719);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(20900384604160L, 155720);
      View localView = paramView;
      if (paramView == null)
      {
        localView = LayoutInflater.from(BankRemitHistoryUI.this.vKB.vKW).inflate(a.g.sLD, paramViewGroup, false);
        localView.setTag(new BankRemitHistoryUI.b(BankRemitHistoryUI.this, localView));
      }
      paramView = (BankRemitHistoryUI.b)localView.getTag();
      paramViewGroup = (ahk)getItem(paramInt);
      String str = ax(paramViewGroup.uwQ);
      if (paramInt == 0) {
        paramInt = 1;
      }
      for (;;)
      {
        if (paramInt != 0)
        {
          paramView.okW.setText(str);
          paramView.okW.setVisibility(0);
          label111:
          paramView.okZ.setUrl(paramViewGroup.ojk);
          paramView.mrx.setText(paramViewGroup.title);
          paramView.okX.setText(paramViewGroup.uwR);
          paramView.hqj.setText(paramViewGroup.uwP);
          if (bg.nm(paramViewGroup.uwS)) {
            break label261;
          }
          if (!bg.nm(paramViewGroup.uwT)) {
            paramView.okY.setTextColor(Color.parseColor(paramViewGroup.uwT));
          }
          paramView.okY.setText(paramViewGroup.uwS);
          paramView.okY.setVisibility(0);
        }
        for (;;)
        {
          GMTrace.o(20900384604160L, 155720);
          return localView;
          if (str.equals(ax(((ahk)getItem(paramInt - 1)).uwQ))) {
            break label273;
          }
          paramInt = 1;
          break;
          paramView.okW.setVisibility(8);
          break label111;
          label261:
          paramView.okY.setVisibility(8);
        }
        label273:
        paramInt = 0;
      }
    }
  }
  
  private final class b
  {
    TextView hqj;
    TextView mrx;
    TextView okW;
    TextView okX;
    TextView okY;
    CdnImageView okZ;
    
    public b(View paramView)
    {
      GMTrace.i(20907900796928L, 155776);
      this.okW = ((TextView)paramView.findViewById(a.f.srP));
      this.mrx = ((TextView)paramView.findViewById(a.f.srO));
      this.okX = ((TextView)paramView.findViewById(a.f.srQ));
      this.hqj = ((TextView)paramView.findViewById(a.f.srN));
      this.okY = ((TextView)paramView.findViewById(a.f.srR));
      this.okZ = ((CdnImageView)paramView.findViewById(a.f.srM));
      GMTrace.o(20907900796928L, 155776);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */