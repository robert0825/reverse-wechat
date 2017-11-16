package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;
import com.tencent.mm.ui.base.sortview.d;

public class BankRemitSortView
  extends BaseSortView
{
  private final String TAG;
  private ListView jvB;
  
  public BankRemitSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20904008482816L, 155747);
    this.TAG = "MicroMsg.BankcardSortView";
    GMTrace.o(20904008482816L, 155747);
  }
  
  public final boolean a(String paramString, d paramd)
  {
    GMTrace.i(20904679571456L, 155752);
    GMTrace.o(20904679571456L, 155752);
    return false;
  }
  
  public final VerticalScrollBar aiq()
  {
    GMTrace.i(20904276918272L, 155749);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(a.f.ceR);
    GMTrace.o(20904276918272L, 155749);
    return localVerticalScrollBar;
  }
  
  public final View air()
  {
    GMTrace.i(20904545353728L, 155751);
    GMTrace.o(20904545353728L, 155751);
    return null;
  }
  
  public final c.a ais()
  {
    GMTrace.i(20904813789184L, 155753);
    c.a local1 = new c.a()
    {
      public final View a(d paramAnonymousd, View paramAnonymousView, int paramAnonymousInt, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(20908437667840L, 155780);
        Object localObject = BankRemitSortView.this.getContext();
        View localView = paramAnonymousView;
        if (paramAnonymousView == null)
        {
          localView = LayoutInflater.from((Context)localObject).inflate(a.g.sLN, null);
          paramAnonymousView = new BankRemitSortView.a(BankRemitSortView.this);
          paramAnonymousView.olW = ((TextView)localView.findViewById(a.f.blV));
          paramAnonymousView.ojD = ((TextView)localView.findViewById(a.f.ssh));
          paramAnonymousView.ojB = ((CdnImageView)localView.findViewById(a.f.ssg));
          localView.setTag(paramAnonymousView);
        }
        paramAnonymousView = (BankRemitSortView.a)localView.getTag();
        localObject = (eo)paramAnonymousd.data;
        if (localObject != null) {
          if ((BankRemitSortView.this.wlw) && (paramAnonymousBoolean1)) {
            if (paramAnonymousd.wlE.equals("☆"))
            {
              paramAnonymousView.olW.setText(a.i.sRZ);
              paramAnonymousView.olW.setVisibility(0);
              label169:
              paramAnonymousView.ojB.setUrl(((eo)localObject).ojk);
              paramAnonymousView.ojD.setText(((eo)localObject).mhU);
            }
          }
        }
        for (;;)
        {
          GMTrace.o(20908437667840L, 155780);
          return localView;
          paramAnonymousView.olW.setText(paramAnonymousd.wlE);
          break;
          paramAnonymousView.olW.setVisibility(8);
          break label169;
          w.w("MicroMsg.BankcardSortView", "elem is null: %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        }
      }
    };
    GMTrace.o(20904813789184L, 155753);
    return local1;
  }
  
  public final ListView getListView()
  {
    GMTrace.i(20904411136000L, 155750);
    this.jvB = ((ListView)findViewById(a.f.bKn));
    ListView localListView = this.jvB;
    GMTrace.o(20904411136000L, 155750);
    return localListView;
  }
  
  public final View inflate()
  {
    GMTrace.i(20904142700544L, 155748);
    View localView = View.inflate(getContext(), a.g.sLO, this);
    GMTrace.o(20904142700544L, 155748);
    return localView;
  }
  
  private final class a
  {
    CdnImageView ojB;
    TextView ojD;
    TextView olW;
    
    public a()
    {
      GMTrace.i(20945481760768L, 156056);
      GMTrace.o(20945481760768L, 156056);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitSortView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */